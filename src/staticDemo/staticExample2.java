package staticDemo;

public class staticExample2 {
    int id;
    String name;
    static String schoolName = "PQR";

    public staticExample2(int i, String n){
        id = i;
        name = n;
    }
    void display(){
        System.out.println(id+""+name+""+schoolName);
    }
}
class staticExample2Impl{
    public static void main(String[] args) {
        staticExample2 se2 = new staticExample2(111, "Meena");
        se2.display();

        staticExample2 se3 = new staticExample2(112, "Teena");
        se3.display();
    }

}