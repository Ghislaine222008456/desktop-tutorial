public class simple1 {
    public double Interest(int d, double r, int t) {

        return d * r * t;

    }
}

class Main {
    public static void main(String[] args) {

        simple1 B = new simple1();
        double SInterest = B.Interest(100000, 0.05, 5);
        System.out.println("The simple interest of the deposited amount: " + SInterest);

    }

}
