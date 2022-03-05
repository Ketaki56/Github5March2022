package superDemo;

public class superDemo1 {


    int i=2;
    public void show(){
        System.out.println("New show");
    }
}
class superDemo2 extends superDemo1{
    int i=4;

    public void show() {
        System.out.println("in show"+i);
    }
    public void display(){
        super.show();
        System.out.println("This is display method");
    }

    public static void main(String[] args) {
        superDemo2 obj = new superDemo2();
        obj.display();
    }
}
