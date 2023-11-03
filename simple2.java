public class simple2 {
    double deposit;

    public simple2(double d) {
        deposit = d;

    }

    public double Amount(double rate, int time) {
        return deposit * rate * time;
    }

    public static void main(String[] args) {

        simple2 myInterest = new simple2(100000);
        double SAmount = myInterest.Amount(0.05, 5);
        System.out.println("the interest is: " + SAmount);

    }

}
