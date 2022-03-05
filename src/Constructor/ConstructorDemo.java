package Constructor;

import java.util.concurrent.Callable;

/**
 * Constructor -> Constructor is special type of function which invoke/call automatically
 * when object of class is created.
 *
 * Rules-> 1. your class name constructor name should be same.
 *         2. constructor has no return type.
 *         3. static, final, synchronized keywords are not allowed.
 *
 * Types-> 1. Default constructor
 *         2. parameter constructor
 *
 *  Advantages->
 *  1. To initiate variable to their default values
 */

public class ConstructorDemo {
    int i;
    char j;

    public ConstructorDemo(){
        System.out.println("It is constructor");
    }
    public ConstructorDemo(int i){
        System.out.println(this.j);
        System.out.println("In parameter constructor"+i);
    }
    public ConstructorDemo(int i, int j){

        System.out.println("In parameter constructor");
    }
    static final synchronized  void showDisplay(){

    }

    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo();
        ConstructorDemo obj1 = new ConstructorDemo(1);


            }
        }


