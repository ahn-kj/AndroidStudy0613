package com.clghks.databinding.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.clghks.databinding.BR;
import com.clghks.databinding.R;
import com.clghks.databinding.data.User;

import java.util.List;

/**
 * Created by chihwan on 15. 11. 9..
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.BindingHolder>{
    private List<User> userList;

    public RecyclerViewAdapter(List<User> userList){
        this.userList = userList;
    }

    @Override
    public BindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_user, parent, false);
        BindingHolder holder = new BindingHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(BindingHolder holder, int position) {
        holder.getBinding().setVariable(BR.user, userList.get(position));
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class BindingHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding binding;

        public BindingHolder(View rootView) {
            super(rootView);
            binding = DataBindingUtil.bind(rootView);
        }

        public ViewDataBinding getBinding() {
            return binding;
        }
    }
}
