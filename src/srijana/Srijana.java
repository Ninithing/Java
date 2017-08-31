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
public class Srijana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //system TODO code application logic here
        System.out.println("Srijana");
        System.out.println("Thing");
        String name="Srijana";
        String address="baniyatar";
        byte age= 19;
        char gender= 'f';
        float plusTwoPercentage=62;
        boolean completedPlusTwo= true;
        
        System.out.println(name);
        String fullMessage=" I am "+ name +".\n I am from "+ address+".\n I have scored "+plusTwoPercentage;
        System.out.println(fullMessage);
        System.out.println(fullMessage);
        byte x=52;
        byte y=98;
        byte z=23;
        System.out.println(2*x-5*y+100*z/86);
        int balance=1376;
        int talkedAmount=667;
        int due=balance-talkedAmount;
        double taxPercentage=0.13;
        double tax= taxPercentage*balance;
                
        System.out.println("Your total balance is "+(balance)+ " with "+ (due)+ " you have paid Rs "+tax) ;
        int age1=27;
        int a= age1++;
        
        
        
        
        
        
            
        
        
    }
    
}
