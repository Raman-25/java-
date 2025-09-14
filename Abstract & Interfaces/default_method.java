package com.java;
interface wifi{
    String[] getwifi();// We cannot define the method here and have to implement it in our class but
    void selectwifi(String network);
    default void password(){
        System.out.println("Showing saved password");
    }// if we use default method we can define it in here,and we can also overwrite this in our class
}// we are not force to implement this in our class

class phone{
    public void greet(){
        System.out.println("Turning on the phone");
    }
}
class Mysmartphone extends phone implements wifi{
    @Override
    public String[] getwifi() {
        System.out.println("Showing the available networks");
        String [] list = {"Raman","Yugam","jio","Airtel"};
        return list;
    }

    @Override
    public void selectwifi(String network){
        System.out.println("Selected network " + network);
    }
}


public class default_method {
    public static void main(String[] args) {
        Mysmartphone moto = new Mysmartphone();

        moto.greet();
        String[] network = moto.getwifi();
        for(String arr:network){
            System.out.println(arr);
        }
        moto.selectwifi("Raman");
        moto.password();
    }
}
