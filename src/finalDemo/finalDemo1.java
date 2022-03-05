package finalDemo;

/**
 * final keyword->
 * 1. all non-primitive data types are final class
 * 2. you can not reassign value to the variable
 * 3.
 */

public class finalDemo1 {
    final int i; // it is variable but when we put final word then it is constant

    final String direction1 = "SOUTH";
    final float pi = 3.142f;


    public finalDemo1(){
         i=9;
    }
    public final void show(){
        System.out.println(i);
    }

    public static void main(String[] args) {
        finalDemo1 obj = new finalDemo1();
        obj.show();
    }

//    class final2demo extends finalDemo1{
//        public void show(){
//
//        }
//    }




}
