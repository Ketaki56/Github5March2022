package staticDemo;

/**
 * static use for memory management
 */

public class staticDemo1 {
    int id;
    String name;
   static String companyName = "ABC";

    public staticDemo1(int i, String name){
        id = i;
        this.name = name;
    }
    void display(){
        System.out.println(id+ "" +name+ "" +companyName);
    }

    public static void main(String[] args) {
        staticDemo1 obj1 = new staticDemo1(1,"Ravi");
        staticDemo1 obj2 = new staticDemo1(2,"Akash");
        staticDemo1 obj3 = new staticDemo1(3, "John");

        obj1.display();
        obj2.display();
        obj3.display();

    }
}

