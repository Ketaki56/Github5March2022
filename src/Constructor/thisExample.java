package Constructor;

public class thisExample {
    int roll;
    String name;
    float fee;

    public thisExample(int roll, String name, float fee) {
        // here parameters (formal arguments) and instance variables are same. So, we are using "this"
        // keyword to distinguish local variable and instance variable.
      this.roll = roll;
        this.name = name;
        this.fee = fee;
    }

    void display() {
        System.out.println(roll + "" + name + "" + fee);
    }
}

    class thisExampleImpl{
        public static void main(String[] args) {
            thisExample obj = new thisExample(1, "ABC", 10000);
            obj.display();

            thisExample obj2 = new thisExample(2,"XYZ", 20000);
            obj2.display();
        }

    }



