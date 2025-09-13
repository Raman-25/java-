package com.java;

interface bicycle{
    int a = 45; // WE CANNOT MODIFY THIS
    int speedup(int increment);
    void applybrake(int decrement);
   //INTERFACES FORCES TO USE THIS METHOD
}
interface horn{
    void horn1();
    void horn2();
}
class Firefox implements bicycle, horn {
    int speed = 65;                 // IF WE IMPLEMENT METHOD IN OUR CLASS WE NEED TO USE PUBLIC KEYWORD

    public int speedup(int increment) {
        speed = speed + increment;
        return speed;
    }

    public void applybrake(int decrement) {
        speed = speed - decrement;
    }

    public void horn1() {
        System.out.println("Pe pe pe pe");
    }

    public void horn2() {
        System.out.println("po po po po");
    }
}
public class interfaces {
    public static void main(String[] args) {
        Firefox raman = new Firefox();

         // raman.a =455; We cant do this
         System.out.println(raman.speedup(6));
         raman.horn1();
         raman.horn2();
    }
}
