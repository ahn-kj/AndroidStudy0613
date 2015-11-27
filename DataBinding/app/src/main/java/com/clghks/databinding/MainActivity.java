package com.clghks.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.clghks.databinding.data.User;
import com.clghks.databinding.databinding.MainLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        User user = new User("Test", "User", false);

        MainLayout binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setUser(user);
    }

}

