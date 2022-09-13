public class BmiService {
    public double  calculate (double weigh, double grow) {
        double  result;
        double c = grow/100;
        result = weigh / (c*c) ;
        return result;
    }
}
