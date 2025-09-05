package com.java.Inheritance;
class base1 {
        base1(){
                System.out.println("I am a base constructor");
        }
        base1(int x){
                System.out.println("I an constructor with x: " + x);
        }
}
class derived1 extends base1{

        derived1(){
                //super(0); // TO USE OVERLOADED CONSTRUCTOR
                System.out.println("I am derived1 constructor");
        }
        derived1(int x,int y){
                super(x);
                System.out.println("I an constructor with y: " + y);
        }
}
class childofderived extends derived1{
        childofderived(){
                System.out.println("I am 3 constructor");
        }
        childofderived(int x,int y,int z){
                super(x,y);
                System.out.println("I an constructor with z: " + z);
        }
}

public class constructor {
        public static void main(String[] args) {
                childofderived c1 = new childofderived();
                childofderived c = new childofderived(4,5,6);
        }
}
