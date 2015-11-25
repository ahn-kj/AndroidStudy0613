package com.clghks.databindingold;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.clghks.databindingold.data.User;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView nameTextView;
    private TextView jobTextView;
    private TextView birthdayTextView;
    private TextView physicalTextView;
    private TextView schoolTextView;
    private TextView belongTextView;
    private TextView homepageUrlTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User();
        user.setName("아이유");
    }
}
