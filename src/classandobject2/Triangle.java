/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classandobject2;

/**
 *
 * @author NCC
 */
public class Triangle {
    int base;
    int height;
    int a,b,c;
   public Triangle(int base, int height, int a, int b, int c){
       setBase(base);
       setHeight(height);
       setA(a);
       setB(b);
       setC(c);
   }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        if (base>1){
        this.base = base;
        }
            
  
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height>1){
        this.height = height;
        } 
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (a>1){
        this.a = a;
    }
    }    
    public int getB() {
        return b;
    }

    public void setB(int b) {
        if(b>1){
        this.b = b;
    }
    }
    public int getC() {
        return c;
    }

    public void setC(int c) {
        if(c>1){
        this.c = c;
        }
    }
   
    public float getArea(){
       float area=0.5f*base* height;
       return area;
    }
    public float getPerimeter(){
    float perimeter=a+b+c;
    return perimeter;
    }

}
