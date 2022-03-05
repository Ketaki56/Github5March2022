public class Operators {
    public static void main(String[] args){
        //Unary operator

        int n = 62;
        System.out.println(n); //output is 62

        System.out.println(n++); //output is 62 //first assign and then increment
        System.out.println(n); //output is 63

        System.out.println(n--); //output is 63 // first assign and then decrement
        System.out.println(n); //output is 62

        System.out.println(++n); // output is 63 // first increment and then assign
        System.out.println(n);  //output is 63

        System.out.println(--n); //output is 62 // first decrement and  then assign
        System.out.println(n);  //output is 62

        System.out.println(n++ + ++n); // 62 + 64 = 126

        //+expr, -expr, ~, !

        int a = 75;
        int b = -75;
        boolean c = true;
        boolean d = false;

        System.out.println(~a);  // formula (-a)-1 = -75-1 = -76
        System.out.println(~b);  //formula -(-a)-1 = 75-1 = 74

        System.out.println(!c);  // output is false
        System.out.println(!d);  // output is true


    }
}
