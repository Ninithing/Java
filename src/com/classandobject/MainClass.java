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
public class MainClass {
    public static void main(String args[]){
        Person p=new Person();
//        p.name="Srijana Thing";
        p.setName("Srijana");
        p.setAddress("Gongabu");
        p.setGender('F');
        p.setAge(22);
        
//       p.getInfo();
        System.out.println(p.getName());
        p.move();
        p.greet("sanju");
        
        
        
    }
}
