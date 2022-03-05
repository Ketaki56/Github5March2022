package Test;

public class Student {
    protected int id;
    protected String name;


}
class Name extends Student{
      protected void display(){
        System.out.println("Name of Student "+name);

    }
}
