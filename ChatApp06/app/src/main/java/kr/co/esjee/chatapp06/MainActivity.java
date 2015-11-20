package kr.co.esjee.chatapp06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static final String FIREBASE_URL = "https://javacafetest06.firebaseio.com/";

    private String userName;
    private EditText editText;
    private Button sendButton;

    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listView);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1);
        listView.setAdapter(adapter);

        userName = "user" + new Random().nextInt(100);

        editText = (EditText)findViewById(R.id.editText);
        sendButton = (Button)findViewById(R.id.button);

        new Firebase(FIREBASE_URL).addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                ChatData chatData = dataSnapshot.getValue(ChatData.class);
                adapter.add(chatData.getUserName() + " : " + chatData.getMessage());
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Firebase(FIREBASE_URL).push().setValue(new ChatData(userName, editText.getText().toString()));
                editText.setText("");
            }
        });

    }
}
