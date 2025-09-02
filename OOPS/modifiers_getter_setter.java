package com.java.OOPS;

class Myemployee{

    private int id;      //USED PRIVATE (ACESS MODIFIRE)
    private String name;

    public void setname(String n){   // SETTERS
        name=n;
    }
    public void setId(int i){
        id=i;
    }
    public String getname(){         //GETTERS
        return name;
    }
    public int getId() {
        return id;
    }
}

public class modifiers_getter_setter {
    public static void main(String[] args) {
        Myemployee employee1 = new Myemployee();
        employee1.setname("Raman");
        employee1.setId(32);
        System.out.println(employee1.getId()+"\n"+ employee1.getname());
    }
}
