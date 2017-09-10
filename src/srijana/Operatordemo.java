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
        int time=5;
                if (time<12){
                    System.out.println("good morning");
                }else if (time>16){
                            System.out.println("good afternoon");
                }else{
                    System.out.println("good evening");
                    
                  
                  
                }
                
                String name= ("Nini");
                char gender=('F');
                if (gender=='F'){
                    System.out.println("hello miss "+ name);
                }
                else {
                    System.out.println("hello mr");
                }
                System.out.println(gender=='F'?"hello miss " + name: "hello mr");
    
    
          for(int i=0;i<10;i+=2){
              System.out.println(i);
              
              
              
          } 
          
          for(int j=1; j<10;j++) {
                  for (int i= 1; i<10;i++){
                      System.out.println(j+" * "+ i +"="+i*j+"\t");
                  }
                  System.out.println("");
           }
                
                
             int i=0;
             while (i<=100){
                 System.out.println(i);
             i++;
             }
             
             
             
             
           int x=getMax(45,67);
           int y=getMax(12,767);
           System.out.println(x+","+y);
           
        int xp=getSum(2,3,4,878,878);
        System.out.println(xp);
        
        int xy=getAverage(10,12,14,16);
        System.out.println(xy);
           
    }
    public static int getMax(int a,int b){
        int max=a>b?a:b;
        return max;
        
        
    }
    public static int getSum(int a,int b, int c){
        int sum=a+b+c;
        return sum;
    }
       
   
     public static int getSum(int... nums){
        int sum=0;
        for (int i:nums){
            sum+=i;

        }
        return sum;
         
     }
     public static int getAverage(int... nums){
         int sum= getSum(nums);
         int length=nums.length;
         
            return sum/length;   
     }
     
}
