

public class OverridingShape {
    double area;
    int length = 10;
    int width = 5;
    int radius = 20;
    int base = 15;
    int height = 25;
    int side = 30;
    void calculateArea(){
        System.out.println("Area is "+area);

    }
}
class Rectangle1 extends OverridingShape{
    void calculateArea(){
        double area = length * width;
        System.out.println("Area of Rectangle is "+area);
    }
}
class Circle extends OverridingShape{
    void calculateArea(){
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle is "+area);
    }
}
class Triangle1 extends OverridingShape{
    void calculateArea(){
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle is "+area);
    }

}
class square1 extends OverridingShape{
    void calculateArea(){
        double area = side * side;
        System.out.println("Area of square is "+area);
    }
}
class Impl{
    public static void main(String[] args) {
        OverridingShape shape = new Rectangle1();
        shape.calculateArea();

        OverridingShape shape1 = new Circle();
        shape1.calculateArea();

        OverridingShape shape2 = new Triangle1();
        shape2.calculateArea();

        OverridingShape shape3 = new square1();
        shape3.calculateArea();
    }
}
