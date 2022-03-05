package staticDemo;

public class Outer {
    int i = 90;

    public void show(){
        System.out.println("In show");
    }


    public class Inner{

        public Inner(){
        }
        int i = 11;
    }

}
class OuterImpl{
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.i);

        Outer.Inner inner = outer.new Inner();//for non static inner class
        System.out.println(inner.i);




    }
}
