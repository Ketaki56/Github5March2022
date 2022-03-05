package Constructor;

/**
 * this keyword->
 * 1. it refers the current class instance variable
 * 2. it invoke/call current class methods.
 * 3. it invokes
 */
public class thisDemo {
    private int id;
    private String name;
    private String address;

    public void setValues( int i, String name, String address){
        this.id = id;
        this.name=name;
        this.address=address;
    }
    public thisDemo(){
        System.out.println("In constructor");
    }
    public thisDemo(int i){
        this();
        System.out.println("In parameter constructor");
    }

    public static void main(String[] args) {
        thisDemo obj = new thisDemo();



    }
}
