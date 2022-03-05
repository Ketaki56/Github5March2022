package ExceptionHandling;

public class ExeHierarchy2 {
    public static void main(String[] args) {
        try {
            int i = 10;
            int j = i/0;
            System.out.println("In first try block");
            try{
                System.out.println("In second try block");
                String str = null;
                System.out.println(str.length());
            }catch (NullPointerException e){
                System.out.println(e);
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Hiii");
        System.out.println("Hiii");
        System.out.println("Hiii");
    }
}
