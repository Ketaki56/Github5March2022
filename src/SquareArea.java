import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        System.out.println("Enter Side of Square:");  //Capture the user input
        Scanner scanner = new Scanner(System.in); //Storing the capture value in variable
        double side = scanner.nextDouble(); //Area of square = side * side
        double area = side * side;
        System.out.println("Area of square is :" +area);


    }
}
