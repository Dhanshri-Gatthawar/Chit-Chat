package com.example.mychat_sggs.Models;

public class Users {
    String profilePic, userName, mail, password, userId, lastMessage;

    public Users(String profilePic, String userName, String mail, String password, String userId, String lastMessage) {
        this.profilePic = profilePic;
        this.userName = userName;
        this.mail = mail;
        this.password = password;
        this.userId = userId;
        this.lastMessage = lastMessage;
    }
    public Users(){}
    //singup constructor
    public Users(String userName, String mail, String password) {
        this.userName = userName;
        this.mail = mail;
        this.password = password;

    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public String getUserName() {
        return userName;
    }
    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public void getUserId(String key) {
    }
}
