package com.HappyHour.demo.users;

public class User {
    private int id;
    private String username;
    public User()
    {
        this.id = 1;
        this.username = "Dek";

    }
    public User(int id, String username){
        this.id = id;
        this.username = username;
    }
    public int getID(){
        return this.id;
    }
    public String getUsername()
    {
        return this.username;
    }
    public void setID(int id){
        this.id = id;
    }
    public void setUsername(String username){
        this.username = username;
    }
}
