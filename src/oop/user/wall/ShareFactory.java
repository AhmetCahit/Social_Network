/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package oop.user.wall;

//import java.util.*;



/**
 *
 * @author Ahmet
 */
public class ShareFactory {
	
	//Paylaşılmak istenen içeriğine göre nesne oluşturulacak...
	
	public	WallShareInterface getShare(String shareType){
		
		if(shareType == null)
			return null;
		
		if(shareType.equalsIgnoreCase("TEXT")){	
			return new Text();
		
                }else if(shareType.equalsIgnoreCase("MEDIA")){
			return new Media();
		}
		
                return null;
	}
}	
