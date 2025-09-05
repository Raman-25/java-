package com.java;
class base{
    int x;
    public base(){
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class inheritance1 {
    public static void main(String[] args) {

        base b = new base();
        b.setX(4);
        System.out.println(b.getX());

        derived c = new derived();
        c.setY(5);
        c.setX(6);
        System.out.println(c.getX());
        System.out.println(c.getY());

    }
}