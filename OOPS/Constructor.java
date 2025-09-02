package com.java.OOPS;
class Empolyee_data{
    private int id;
    private String name;

    public Empolyee_data(String a,int n){
        id = n;
        name =a;
    }
   public int getId() {
        return id;
   }
   public String getName() {
        return name;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Empolyee_data empolyee1 = new Empolyee_data("Raman",45);
        Empolyee_data empolyee2 = new Empolyee_data("Mohit",46);
        System.out.println(empolyee1.getId()+"\n"+empolyee1.getName());
        System.out.println(empolyee2.getId()+"\n"+empolyee2.getName());
    }
}
