package com.clghks.databinding.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.clghks.databinding.R;
import com.clghks.databinding.data.User;
import com.clghks.databinding.databinding.ListUserBinding;

import java.util.List;

/**
 * Created by chihwan on 15. 11. 9..
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    private List<User> userList;
    private LayoutInflater inflate;

    public RecyclerViewAdapter(List<User> userList){
        this.userList = userList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(inflate == null){
            inflate = LayoutInflater.from(parent.getContext());
        }
        ListUserBinding binding = DataBindingUtil.inflate(inflate, R.layout.list_user, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.userBinding.setUser(userList.get(position));
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ListUserBinding userBinding;

        public ViewHolder(ListUserBinding userBinding) {
            super(userBinding.getRoot());
            this.userBinding = userBinding;
        }
    }
}
