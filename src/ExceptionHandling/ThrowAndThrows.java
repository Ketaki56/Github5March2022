package ExceptionHandling;

public class ThrowAndThrows {
    public static void main(String[] args) throws Exception  {
        int age = 15;


            if(age>=18){
                System.out.println("you can vote");
            }else {
                throw new Exception("you can not vote");
            }
            System.out.println("hiii");
            System.out.println("hiii");
            System.out.println("hiii");

    }
}
// if we use try and catch here then in output we see hiii and not write throws exception in above (main)
// using try and catch you can handling exception.

//difference between Throw and Throws