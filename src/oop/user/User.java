package oop.user;
/**
 *
 * @author Ahmet
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import oop.user.friend.Friends;
import oop.user.wall.Wall;


public class User {
    	
    
    private String  Email;
    private boolean Privacy = false;
    private String  Password;
    private String  Name;
    private String  From;
    private boolean Online = false;
    private Wall userWall=null;
    private Friends friendList=null;
    
    

    public User(String Email, String Password, String Name, String From){
        this.userWall = new Wall();
        this.friendList = new Friends();
        
        this.Email = Email;
        this.Password = Password;
        this.Name = Name;
        this.From = From;	
    }
    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
	
    public void setPrivacy(){
		this.Privacy = true;
    }
    
    public boolean getPrivacy(){
	
        return this.Privacy;
    }
 
    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
      
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    public String getFrom() {
        return From;
    }

    public void setFrom(String From) {
        this.From = From;
    }
    
     public boolean isOnline() {
        return Online;
    }

    public void setOnline(boolean Online) {
        this.Online = Online;
    }
    
}