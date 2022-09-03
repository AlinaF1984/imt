public class Main {
    public static void main(String[] args) {
        BmiService1 service = new BmiService1();
        double rost = 168;
        double ves = 69;
        double imt = service.calculate(168, 69);
        System.out.println(imt);
    }
}