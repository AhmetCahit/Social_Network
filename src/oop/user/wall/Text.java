/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop.user.wall;

import oop.user.wall.WallShareInterface;

/**
 *
 * @author Ahmet
 */
public class Text implements WallShareInterface {
    private String text;

    
    private final String tur = "Text";
    
     public String getTur() {
        return tur;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    @Override
    public String getShare()
    {
        return this.getText();
    }
	
}

