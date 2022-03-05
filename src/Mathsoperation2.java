public class Mathsoperation2 {
    public static void main(String[] args){
        System.out.println("args[0]" + args[0]);
        System.out.println("args[1]" + args[1]);
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int result;
        result = x + y;
        System.out.println("Addition is "+result);
        result = x - y;
        System.out.println("Subtraction is "+result);
        result = x * y;
        System.out.println("Multiplication is "+result);
        result = x / y;
        System.out.println("Division is "+result);


    }
}
