package com.HappyHour.demo.users;

public class User {
    private int id;
    private String username;
    private String email;




    public User(int id, String username, String email){
        this.id = id;
        this.username = username;
        this.email = email;
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
    public void setEmail(String email) {this.email = email;}
    public String getEmail() {return email;}


}
