package ExceptionHandling;


public class ExeHierarchy {
    public static void main(String[] args) {

        int i = 2;
        int j = 0;

       try {
           int k = i / j;  //critical statement (if we not use try and catch then the program break here because
           //its divide by zero)

       } catch (ArithmeticException e){
           System.out.println(e);
       }
       // System.out.println(k);
        System.out.println("hiii"); //normal statement
        System.out.println("hiii");
        System.out.println("hiii");
        System.out.println("hiii");
    }
}
