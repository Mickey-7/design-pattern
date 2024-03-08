package BehavioralStatePattern;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        simulatePhoneClick(phone);
    }

    private static void simulatePhoneClick(Phone phone) {
        System.out.println(phone.clickPower());
        System.out.println(phone.clickPower());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickPower());
        System.out.println(phone.clickPower());
        System.out.println(phone.clickHome());
    }
}
