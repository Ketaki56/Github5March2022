package Polymorphism;

public class Overriding {
    void show(){
        System.out.println("in vehicle class");
    }
}
class car extends Overriding{
    void show(){
        System.out.println("in car class");
    }
}
class bike extends Overriding{
    void show(){
        System.out.println("in bike class");
    }
}
class carImpl {
    public static void main(String[] args) {
        car c1 = new car();
        c1.show();

        bike b1 = new bike();
        b1.show();
    }
}
