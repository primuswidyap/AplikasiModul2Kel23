package com.example.primus.aplikasimodul2kel23;

public class User {
    int id;
    static  String username;
    static  String password;

    public  User(){
    }

    public User(int id, String username, String password){
        this.id = id;
        User.username = username;
        User.password = password;
    }
    public int getId() { return id;}

    public void setId(int id) {this.id = id;}

    public String getUsername() {return username;}

    public void setUsername (String username) {
        User.username = username;}

    public  String getPassword() {return password;}

    public void setPassword(String password) {
        User.password = password;}
}
