package com.clghks.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.clghks.databinding.adapter.RecyclerViewAdapter;
import com.clghks.databinding.data.UserManager;
import com.clghks.databinding.databinding.ActivityListViewBinding;

public class ListViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityListViewBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_list_view);

        recyclerView = binding.recyclerview;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewAdapter = new RecyclerViewAdapter(UserManager.getUserList());
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
