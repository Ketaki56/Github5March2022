package Inheritance;

public class OverloadingDemo {
    void subtraction(int a, int b){
        int result = a - b;
        System.out.println("Subtraction is "+result);
    }
    void subtraction(int c, float f){
        float result = c - f;
        System.out.println("Result is "+result);
    }

    public static void main(String[] args) {
        OverloadingDemo demo = new OverloadingDemo();
        demo.subtraction(50, 10);
        demo.subtraction(10, 5.0f);

    }
}
