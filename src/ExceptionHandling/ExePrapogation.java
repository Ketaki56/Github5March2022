package ExceptionHandling;

public class ExePrapogation {
    public void a(){
        int i = 10/0;
    }

    public void b(){
        a();
    }

    public void c(){
        try {
            b();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExePrapogation obj = new ExePrapogation();
        obj.c();
    }
}
