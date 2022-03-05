package Inheritance;

public class Animal {
   public void sound() {
       System.out.println("Animal Sound");

    }

}
class Dog extends Animal{
    public void sound(){
        System.out.println("Dog sound");
    }
}

class cat extends Dog{
    public void sound(){
        System.out.println("Cat Sound");
    }
}
class AnimalImpl{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        cat c1 = new cat();
        c1.sound();
    }
}
