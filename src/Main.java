public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 80;
        double growth = 175;
        double imt = service.calculate(weight,growth);
        String result = String.format("%8.2f", imt).replace(',', '.');
        System.out.println("Индекс массы тела " + result);
    }
}
