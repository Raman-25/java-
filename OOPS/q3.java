package com.java.OOPS;
class square{
    int side;

    public void perimeter(int side){
        int perimeter = 4*side;
        System.out.println("The perimeter of Square is " + perimeter);
    }
    public void aera(int side){
        int aera = side*side;
        System.out.println("The Area of Square is " + aera);
    }
}
public class q3 {
    public static void main(String[] args) {
       square first = new square();
       first.aera(10);
       first.perimeter(10);
    }
}
