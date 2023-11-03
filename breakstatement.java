public class breakstatement {

    public static void main(String[] args) {
        int[] numbers = { 1, 3, 5, 7, 8, 9, 11, 12, 13 };

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("The first even number is: " + number);
                break;
            }
        }
    }
}
