package kr.co.esjee.chatapp06;

/**
 * Created by chihwan on 15. 11. 18..
 */
public class ChatData {
    private String userName;
    private String message;

    public ChatData(){

    }

    public ChatData(String userName, String message) {
        this.userName = userName;
        this.message = message;
    }

    public String getUserName() {
        return userName;
    }

    public String getMessage() {
        return message;
    }
}
