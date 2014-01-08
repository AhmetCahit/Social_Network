/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop;
import java.util.*;
import oop.user.*;

/**
 *
 * @author Taner
 */
public class SocialNetwork {
    
    private static SocialNetwork instance = new SocialNetwork();

    public static SocialNetwork getInstance() {
        return instance;
    }
    
    private SocialNetwork(){}
    
    private ArrayList<User> UserList= new ArrayList<User>();
    public ArrayList<User> getUserList() {
        return UserList;
    }
    public void setUserList(User user) {
        UserList.add(user);
    }
    
    
    private ArrayList<Object> GroupList=new ArrayList<Object>();
    public ArrayList<Object> getGroupList() {
        return GroupList;
    }
    public void setGroupList(Object Group) {
        GroupList.add(Group);
    }
    
    public ArrayList<User> SearchUsers(String Name)
    {
        ArrayList<User> list = new ArrayList<User>();
        boolean found=false;
        Iterator myiterator= this.getUserList().iterator();
        while(myiterator.hasNext())
        {
            Object item= myiterator.next();
            if(item instanceof User )
            {
                found=((User)item).getName().contains(Name);
                if(found==true)
                {
                    list.add((User)item);
                }
                found=false;
            }
        }
        
        return list;
    }
    
    public User Login(String Email, String Password)
    {
        Iterator myiterator= this.getUserList().iterator();
        User user=null;
        while(myiterator.hasNext())
        {
            Object item= myiterator.next();
            if(item instanceof User )
            {
                if(((User)item).getEmail().equals(Email) && ((User)item).getPassword().equals(Password))
                { 
                  user=(User)item;
                  break;
                }
            }
        }
        if(user==null)
        {
            System.out.println("User not found!");
        }
        else
        {
              if(user.isOnline()!=true)
                  {
                    user.setOnline(true);
                    return user;
                  }
              else System.out.println("This user already online");
        }
        return user;
    }
    
    public void SignUp()
    {
        Iterator myiterator= this.getUserList().iterator();
        boolean found=false;
        Scanner keyboard= new Scanner(System.in);
        
        System.out.println("Email:");
        String userName=keyboard.nextLine();
        do
        {
            while(myiterator.hasNext())
            {
               Object item= myiterator.next();
               if(item instanceof User )
               {
                if(((User)item).getEmail().equals(userName))
                {
                    found=true;
                    break;
                }
               }
            }
            System.out.println("This Email already used!");
            System.out.println("Please insert another Email:");
            userName=keyboard.nextLine();
            
        }while(found==true);
        
        System.out.println("Password:");
        String Password=keyboard.nextLine();
        
        System.out.println("Name and Surname:");
        String NameSurname=keyboard.nextLine();
        
        System.out.println("Homeland:");
        String Homeland=keyboard.nextLine();
        
        User newUser = new User(userName, Password, NameSurname, Homeland);
        
        this.UserList.add(newUser);        
    }
    
    
    
    
}
