public class BmiService1 {
    public double calculate(double a, double b) {
        double rost = a;
        double ves = b;
        double imt1 = b / (a * a);
        double imt = imt1 * 10_000;
        System.out.println(imt1 * 10_000);
        return imt;
    }
}
