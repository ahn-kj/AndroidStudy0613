package com.clghks.databinding.handlers;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * Created by chihwan on 15. 11. 9..
 */
public class MyHandlers {
    private Context context;

    public MyHandlers(Context context){
        this.context = context;
    }

    public void onClickFriend(View view) {
        Toast.makeText(context, "onClickFriend()", Toast.LENGTH_SHORT).show();
    }

    public void onClickEnemy(View view) {
        Toast.makeText(context, "onClickEnemy()", Toast.LENGTH_SHORT).show();
    }
}
