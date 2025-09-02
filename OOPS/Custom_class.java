package com.java.OOPS;

class employeee{
   int id;
   String name;
   int salary;

   public void getdetail(){
       System.out.println("My id is " + id);
       System.out.println("My name is " + name);
   }
    public void getsalary(){
        System.out.println(salary);
   }
}
public class Custom_class {
    public static void main(String[] args) {
        System.out.println("This our custom Class");

        //INSTANTIATING A NEW OBJECT FROM OUR CLASS
        employeee Raman = new employeee();
        employeee jhon = new employeee();

        // SETTING ATTRIBUTE FOR RAMAN
        Raman.id = 32;
        Raman.salary = 32000;
        Raman.name ="Ramandeep Singh";

        // SETTING ATTRIBUTE FOR JHON
        jhon.id = 64;
        jhon.salary = 62000;
        jhon.name ="Jhon Dhillon";

        Raman.getdetail();
        Raman.getsalary();
        jhon.getdetail();
        jhon.getsalary();

    }

}
