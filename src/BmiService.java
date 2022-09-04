public class BmiService {
    public double  calculate (double a, double b) {
        double  result;
        double c = b/100;
        result = a / (c*c) ;
        return result;
    }
}
