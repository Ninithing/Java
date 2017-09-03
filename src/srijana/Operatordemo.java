/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srijana;

/**
 *
 * @author NCC
 */
public class Operatordemo {
    
    public static void main(String[] args) {
        int a=12;
        int b= 18;
        System.out.println(a>b);
        System.out.println(a>11&&b<15);
        System.out.println(a>11||b<15);
//        int a=18;
//        int b=27;
        int max=a>b? a:b;
    }
}
