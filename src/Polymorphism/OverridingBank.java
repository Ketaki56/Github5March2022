package Polymorphism;

public class OverridingBank {
    double getRateOfInterest(){
        return 7;
    }
}
class SBI extends OverridingBank{
    double getRateOfInterest(){
        return 8;
    }
}
class ICICI extends OverridingBank{
    double getRateOfInterest(){
        return 9;
    }
}
class SBIImpl {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        System.out.println(sbi.getRateOfInterest());

        ICICI icici = new ICICI();
        System.out.println(icici.getRateOfInterest());
    }
}
