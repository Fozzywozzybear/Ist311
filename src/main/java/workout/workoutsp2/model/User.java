package workout.workoutsp2.model;

import java.io.Serializable;

public class User implements Serializable {
    private String userName, password;
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }


    public User(String name, String pw){
        this.userName = name;
        this.password = pw;
    }
}
