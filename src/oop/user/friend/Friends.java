/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop.user.friend;

import java.util.*;

/**
 *
 * @author Ahmet
 */
public class Friends {
    
    private ArrayList<Dependent> Friends;
    private int numberOfFriends=0;
    
    public Friends (){
        Friends = new ArrayList<Dependent>();
    }
    
    public void addFriend(Dependent added){
        Friends.add(added);
        numberOfFriends++; 
    
    }
    
    
    
}
