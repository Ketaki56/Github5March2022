package ExceptionHandling;

public class ExeHierarchy3 {
    public static void main(String[] args) {

        try{
            int i = 10;
            int j = i/ 0;
            System.out.println("in first try block");
            try{
                String str = "null";
                System.out.println(str.length());
                System.out.println("in second try block");
            }catch(NullPointerException e){
                System.out.println(e);
            }
        }catch (NullPointerException e){
            System.out.println("Null pointer=>" +e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("Number format=>" +e.getMessage());
        }catch (Exception e){
            System.out.println("Execption=>" +e.getMessage());
        }
        System.out.println("hiii");
        System.out.println("hiii");
        System.out.println("hiii");
    }
}
