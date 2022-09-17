public class BmiService {
    public double calculate(double weigh, double grow) {
        double result;
        double heightInMeters = grow / 100;
        result = weigh / (heightInMeters * heightInMeters);
        return result;
    }
}
