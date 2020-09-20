package com.dxc.secure.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
 
    @Id
    @Column(name = "UserID")
    private long userID;
    
    @Column(name = "Username")
    private String username;
    
    @Column(name = "Password")
    private String password;

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
	return "User [UserID = " + userID + ", Username = " + username + ", Password = " + password + "]";
    }
  
}

