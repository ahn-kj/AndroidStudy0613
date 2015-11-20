package kr.co.esjee.chatapp06;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by chihwan on 15. 11. 18..
 */
public class AppApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
