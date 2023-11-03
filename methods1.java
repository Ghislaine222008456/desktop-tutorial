public class methods1 {
    private double principal;
    private double rate;
    private int time;

    public methods1(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double calculateSimpleInterest() {
        double interest = (principal * rate * time) / 100;
        return interest;
    }

    public static void main(String[] args) {
        double principal = 100000; // Principal amount in Rwandan Francs (RWF)
        double rate = 5; // Annual interest rate (5%)
        int time = 5; // Number of years

        methods1 calculator = new methods1(principal, rate, time);
        double interest = calculator.calculateSimpleInterest();

        System.out.println("Principal amount: " + principal + " RWF");
        System.out.println("Annual interest rate: " + rate + "%");
        System.out.println("Time period: " + time + " years");
        System.out.println("Simple interest earned: " + interest + " RWF");
    }
}
