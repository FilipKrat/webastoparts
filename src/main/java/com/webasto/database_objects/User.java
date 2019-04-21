/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webasto.database_objects;

/**
 *
 * @author FilipKrat
 */
public class User {

    private UserRole role;
    private String userName;
    private String userPass;
    private String userMail;
    private String userLang;

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public void setUserLang(String userLang) {
        this.userLang = userLang;
    }

    public String getUserMail() {
        return userMail;
    }

    public String getUserLang() {
        return userLang;
    }

    public User(UserRole role, String userName, String userPass) {
        this.role = role;
        this.userName = userName;
        this.userPass = userPass;
    }

    public UserRole getRole() {
        return role;
    }

    public String getUserName() {
        return userName;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPass(String userPass) {
        userPass = passwordEncryption(userPass);
        this.userPass = userPass;
    }

    private String passwordEncryption(String userPass) {
        String encrypted = "";
        //TODO
        return encrypted;
    }

    public boolean userInit(String userPass) {
        String encrypted = passwordEncryption(userPass);
        return encrypted.equals(this.userPass);
    }

}
