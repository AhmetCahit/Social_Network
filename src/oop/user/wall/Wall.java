/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop.user.wall;

import java.util.*;

/**
 *
 * @author Ahmet
 */
public class Wall {
    private ArrayList<WallShareInterface> Sharings ;

    
    public Wall (){
        Sharings = new ArrayList<WallShareInterface>();
    }
    
    public void set(WallShareInterface Share){
        Sharings.add(Share);
    }
    public ArrayList<WallShareInterface> getSharings() {
        return Sharings;
    }
    
}
