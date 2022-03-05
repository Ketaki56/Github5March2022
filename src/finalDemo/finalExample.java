package finalDemo;

public class finalExample {
   final int i = 5;
}
class finalExampleImpl{
    public static void main(String[] args) {
        finalExample obj = new finalExample();
       // obj.i = 10; //will generate an error: cannot assign a value to a final variable
        System.out.println(obj.i);
    }
}



