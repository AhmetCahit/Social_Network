/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop.user.friend;

import oop.user.User;

/**
 *
 * @author Ahmet
 */
public class Dependent {
        private User Friend ;
        private String dependentMode = "FRIEND";
        
        public Dependent(User Friend ,String mode){
            this.Friend = Friend;
            this.dependentMode = mode.toUpperCase();  
        }
        public Dependent(User Friend){
            this.Friend = Friend;
        }

        public void setDependent(String dMode){
            this.dependentMode = dMode.toUpperCase();
        }
}
