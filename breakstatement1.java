public class breakstatement1 {
    public static void main(String[] args) {

        int i = 1;

        do {
            if (i == 5) {
                // If 'i' is equal to 5, increment 'i' by 1 and then exit the loop using the
                // 'break' statement.
                i++;
                break;
            }
            // If 'i' is not equal to 5, print the value of 'i'.
            System.out.println(i);
            // Increment 'i' by 1.
            i++;
        } while (i <= 10);
    }
}
