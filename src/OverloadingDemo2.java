public class OverloadingDemo2 {
    void division(int a, int b){
        int result = a / b;
        System.out.println("Division is "+result);
    }
    void division(int c, float f){
        float result = c / f;
        System.out.println("Division is "+result);

    }
    void division(float e, float g){
        float result = e / g;
        System.out.println("Division is "+result);
    }

    public static void main(String[] args) {
        OverloadingDemo2 od = new OverloadingDemo2();
        od.division(10, 2);
        od.division(20, 4.0f);
        od.division(20.0f, 5.0f);
    }
}
