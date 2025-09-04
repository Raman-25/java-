package com.java.OOPS;
class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        length =4;
        breadth=5;
    }
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int getLength() {return length;}
    public int getBreadth() {return breadth;}
}
class Cylinder{
    private int radius;
    private int Height;
    float surface_area;
    float volume;

    public void setRadius(int r){radius =r;}
    public int getRadius() {return radius;}
    public void setHeight(int h){Height =h;}
    public int getHeight(){return Height;}
    public float getSurface_area(){
        return surface_area= (float) ((2*3.17*radius)*(radius+Height));
    }
    public float getvolume(){
        return volume =(float) (3.17*(radius*radius)*Height);
    }
}

public class ps_q1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(8,9);
        Cylinder c1 = new Cylinder();

        c1.setHeight(10);
        c1.setRadius(4);
        System.out.println("your radius is " + c1.getRadius());
        System.out.println("your Height is " + c1.getHeight());
        System.out.println("Your volume is " + c1.getvolume());
        System.out.println("Your surface aera is " + c1.getSurface_area());
    }

}
