public class Rectangle {
    int length; //state or properties or data member of class
    int width;

    void insertData(int l, int w) {
        length = l;
        width = w;
    }

    void show() {  //behaviour of class
        System.out.println("Length: "+length  +  "Width:  "+width);
    }

    void calculateArea() {   //method
        double area = length * width;
        System.out.println("Area of Rectangle " + area);
    }
}
class RectangleImpl{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();  //create object
        r1.insertData(20,40);
        r1.show();
        r1.calculateArea();
    }
}