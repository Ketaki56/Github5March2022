package staticDemo;

public class staticExample {
    int id;
    String name;
    static String collegeName = "XYZ";

    public staticExample(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + "" + name + "" + collegeName);
    }
}

    class staticExampleImpl {
        public static void main(String[] args) {
            staticExample se = new staticExample(111, "Karan");
            se.display();

            staticExample se2 = new staticExample(112, "John");
            se2.display();

            staticExample se3 = new staticExample(113, "Aryan");
            se3.display();

            staticExample se4 = new staticExample(114, "Monty");
            se4.display();
        }
    }


