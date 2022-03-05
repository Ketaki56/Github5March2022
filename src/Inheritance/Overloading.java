package Inheritance;

public class Overloading {
    int multiplication(int a, int b){
        int result = a * b;
        return result;
    }
    int multiplication(int a, int b, int c){
        return a * b * c;
    }
    float multiplication(float a, float f){
        return a * f;
    }
    float multiplication(int b, float m){
        return b * m;
    }

    public static void main(String[] args) {
        Overloading demo = new Overloading();
        System.out.println(demo.multiplication(30, 40));
        System.out.println(demo.multiplication(60, 90, 55));
        System.out.println(demo.multiplication(1.2f, 3.6f));
        System.out.println(demo.multiplication(5, 5.6f));
    }
}
