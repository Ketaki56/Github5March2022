package ExceptionHandling;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
          //  System.exit(1);
            int i = 10;
            int j = i / 0;
            System.out.println("in first try block");
        }catch (NullPointerException e){
            System.out.println("Null pointer=>" +e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("Number format=>" +e.getMessage());
        }catch (ClassCastException e){
            System.out.println("Class cast=>"+e.getMessage());
       }finally {
//            int i = 1/0;
            System.out.println("hiii");
            System.out.println("hiii");
            System.out.println("hiii");
        }
    }
}
