package com.java;
abstract class base1{
    public base1(){
        System.out.println("I am constructor of base 1");
    }
    abstract void greet();
    //abstract void greet1(); IF I DO THIS I WILL NEED TO ADD GREET 1 IN OTHER CLASSES
    //OR I HAVE TO MAKE OTHER CLASS ABSTRACT
    // SO THIS METHOD IS FOR SETTING STANDARDS
}
class derived1 extends base1{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
}
class derived2 extends base1{
    @Override
    public void greet(){
        System.out.println("Satsriakal");
    }
}

public class Abstract {
    public static void main(String[] args) {
        //   base1 b = new base1(); WE CANNOT MAKE OBJECT IN ABSTRACT CLASS
        derived1 f = new derived1();
        derived2 g = new derived2();
        f.greet();
        g.greet();

    }

}
