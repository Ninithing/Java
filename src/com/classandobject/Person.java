/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classandobject;

import java.time.LocalTime;

/**
 *
 * @author NCC
 */
public class Person {
 
   private String name;
   private String address;
   private int age;
   private char gender;
    
    public void setName(String n){
        if( n.length()<5 || n.length()>20){
            System.out.println("invalid name");

        }else {
            name =n;
        }
    }
    public void setAge(int a){
        if (a<14 || a>50){
            System.out.println("sorry");

        }else{
            age=a;
        }
    }
    public void setGender(char g){
    if (g=='M'|| g=='m'|| g=='F' || g== 'f'){
        gender=g;
    }
    }

    public void setAddress(String a){
        if(a.length()<6|| a.length()>15){
         System.out.println("this is invalid");
        
        }else{
        address=a;
        }
        
    }
    public String getName(){
            return name;
            
    }
    public String getAddress(){
   return address; 
   }
    public char getGender(){
    return gender;
    }
    public void greet(String s){
        LocalTime t= LocalTime.now();
        String time="";
        if (t.getHour()<=12) {
        time="good morning ";
        
        }else if( t.getHour()<= 17){
            time="good afternoon ";


        }else{
        time="good night ";
        }
        System.out.println(time+s+" I am "+getName()+" tha time is "+t);
            
             
        
    }
    public void getInfo(){
         System.out.println("name:"+name+"\n address:"+address+"\n grnder:"+gender+"\n age:"+age);
    }
    public void move(){
        
        System.out.println("this person is moving");
    }
    public int getAge(){
     return 12;
    }
   
    
}
