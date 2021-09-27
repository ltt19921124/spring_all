package com.msb.bean;

public class User {

    private Integer userid;
    private String username;
    private String password;


    public User() {
        System.out.println("第一步：User构造");
    }

    public User(Integer userid, String username, String password) {
        System.out.println("allargs constructor");
        this.userid = userid;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        System.out.println("第二步：User set方法");
        this.username = username;
    }

    public void initUser() {
        System.out.println("第三步：User初始化");
    }

    public void destroyUser() {
        System.out.println("第五步：User销毁");
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
