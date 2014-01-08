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
public class Media implements WallShareInterface {
    
    private String media;

    
    private final String tur = "media";
    
    public String getTur() {
        return tur;
    }
    
    
    public String getMedia() {
        return media;
    }
	
    public void setMedia(String media) {
        this.media = media;
    }

    @Override
    public String getShare()
    {
        return this.getMedia();
    }
}
