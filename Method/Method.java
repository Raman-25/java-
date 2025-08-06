package com.java;

public class Method {

    //SYNTAX
    // returnType nameOfMethod(INPUT TYPE) {
         //Method body
                    //  }

    static int logic(int x, int y){ //In Java, the main() method is static, so that JVM can call the main() method directly without allocating any extra memory for object creation.
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x +y) * 5;
        }
        x = 566;
        return z;
    }


    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        // Method invocation using Object creation
        //Method obj = new Method();  // IF WE DON'T USE STATIC WE HAVE TO MAKE OBJ FOR CALLING THE FUNCTION
        //c = obj.logic(a, b);
        c = logic(a, b);
        System.out.println(a + " "+ b);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
