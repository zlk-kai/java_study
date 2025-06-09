package java_web.Mybatis_.pojo;

import java.util.Date;

/**
 * @author 张林凯
 * @version 1.0
 */
public class User {
    private int user_id;
    private String username;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", username='" + username + '\'' +
                '}';
    }
}
