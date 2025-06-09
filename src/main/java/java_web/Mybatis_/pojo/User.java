package java_web.Mybatis_.pojo;

import java.util.Date;

/**
 * @author 张林凯
 * @version 1.0
 */
public class User {
    private int user_id;
    private String user_name;
    private String user_password;
    private int user_age;
    private int dept;
    private int user_sex;
    private Date create_datatime;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public int getUser_age() {
        return user_age;
    }

    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }

    public int getDept() {
        return dept;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public int getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(int user_sex) {
        this.user_sex = user_sex;
    }



    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_age=" + user_age +
                ", dept=" + dept +
                ", user_sex=" + user_sex +
                ", create_datatime=" + create_datatime +
                '}';
    }
}
