package Abstraction;

public class football extends AbsSports{

    @Override
    public void play() {
        System.out.println("Play football");
    }

    @Override
    public void exercise() {
        System.out.println("For football exercise");
    }

    public static void main(String[] args) {
        football obj = new football();
        obj.play();
        obj.exercise();
    }
}
