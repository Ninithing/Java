/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srijana;

import java.awt.BorderLayout;

/**
 *
 * @author NCC
 */
public class Recommendation {
    public static void main(String[] args) {
        String name= ("Nini");
        byte age= 19;
        String country="Nepal";
        System.out.println("Hello"+name+"welcome to Unicampus \n Based on your selection,Here is our recommendation\n");
        System.out.println("-------------------------------");
        System.out.println("Recommendation for "+ country);
        System.out.println("-------------------------------");
        if (country=="USA"){
            System.out.println("Here are some universities of"+ country); 
            System.out.println("1)\t university of florida\n2)\t university of california\n3)\t university of new york");
        }else if (country== "Australia"){
            System.out.println("Here are some universities of"+ country);
            System.out.println("1)\t university of sydney\n2)\t victoria university \n3)\t university of melbourn");
            
            
        }else{
            System.out.println("Sorry i dont know about "+ country);
        
        } 
    }
    
    
}
