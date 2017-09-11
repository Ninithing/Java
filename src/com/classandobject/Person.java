/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classandobject;

/**
 *
 * @author NCC
 */
public class Person {
 
   private String name;
    String address;
    int age;
    char gender;
    
    public void setName(String n){
        if( n.length()<5 || n.length()>20){
            System.out.println("invalid name");

        }else {
            name =n;
        }
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
