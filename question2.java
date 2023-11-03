public class question2 {
    private double principal;
    private double rate;
    private int time;

    public question2(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate / 100; // Convert the rate from percentage to decimal
        this.time = time;
    }

    public double calculateTotalPayment() {
        double compoundInterest = principal * Math.pow(1 + rate, time) - principal;
        return principal + compoundInterest;
    }

    public static void main(String[] args) {
        double principal = 500000;
        double rate = 18;
        int time = 3;

        question2 loan = new question2(principal, rate, time);
        double totalPayment = loan.calculateTotalPayment();

        System.out.println("Total amount paid by Mr BOB after 3 years with compound interest: Rwf" + totalPayment);
    }
}
