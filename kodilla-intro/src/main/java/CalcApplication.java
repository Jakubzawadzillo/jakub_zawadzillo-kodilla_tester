public class CalcApplication {

    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        double area = calculator.circleArea(10);
        System.out.println(area);

        double p =Calculator.PI;
        System.out.println(p);
    }

}
