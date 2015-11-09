package com.clghks.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.clghks.databinding.data.User;
import com.clghks.databinding.databinding.ActivityMainBinding;
import com.clghks.databinding.handlers.MyHandlers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("Test", "User");
        MyHandlers myHandlers = new MyHandlers(this);

        binding.setUser(user);
        binding.setHandlers(myHandlers);
    }
}
