package com.java.Inheritance;
class A{
    public void meth1(){
        System.out.println("I am meth1 of A");
    }
    public void meth2(){
        System.out.println("I am met2 of A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am met2 of B");
    }

    public void meth3(){
        System.out.println("I am meth 3 of B");
    }
}
public class Method_overriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.meth2();
        b.meth2();
        b.meth3();
    }
}
