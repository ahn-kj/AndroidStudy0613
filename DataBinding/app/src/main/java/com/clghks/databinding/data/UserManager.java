package com.clghks.databinding.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chihwan on 15. 11. 9..
 */
public class UserManager {
    private static List<User> userList;

    public static List<User> getUserList(){
        return userList;
    }

    static {
        userList = new ArrayList<User>();
        for (int i = 0; i<20; i++){
            userList.add(new User("test" + i, "test" + i));
        }
    }
}
