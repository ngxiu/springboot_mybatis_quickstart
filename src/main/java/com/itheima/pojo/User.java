package com.itheima.pojo;

public class User {
    private Integer userid;
    private String userName;
    private Integer password;

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public Integer getUserid() {
        return userid;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", userName='" + userName + '\'' +
                ", password=" + password +
                '}';
    }

    public User(Integer userid, String userName, Integer password) {
        this.userid = userid;
        this.userName = userName;
        this.password = password;
    }

    public Integer getPassword() {
        return password;
    }
}
