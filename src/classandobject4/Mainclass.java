/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classandobject4;

/**
 *
 * @author NCC
 */
public class Mainclass {
    public static void main(String[] args){
         Bankaccount a= new Bankaccount("Srijana", "12356564",50000);
            a.withdraw(1000);
            System.out.println(a.getBalance());
            a.deposit(500);
            System.out.println(a.getBalance());
    }
   
    
}
