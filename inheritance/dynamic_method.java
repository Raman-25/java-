package com.java.Inheritance;
class Phone{
    public void Greet(){
        System.out.println("Namaste");
    }
    public void on(){
        System.out.println("Turning on phone...");
    }
}
class Smartphone extends Phone{
    public void Swagat(){
        System.out.println("Hi");
    }
    @Override
    public void on() {
        System.out.println("Turning on Smartphone...");
    }
}
public class dynamic_method {
    public static void main(String[] args) {

        Phone obj = new Smartphone();
       // Smartphone obj1 = new Phone();   WRONG CALL

        obj.Greet();
        obj.on();// HERE SECOND METHOD IS CALLED BECAUSE OBJECT IS CREATED IN SMARTPHONE
       // obj.Swagat();// CAN'T DO THIS
    }
}
