public class elseif {
    public static void main(String[] args) {
        int age = 40;
        if (age > 15) {
            System.out.println("i am a child");
        } else if (age >= 20 && age <= 25) {
            System.out.println("i am an adult");
        } else if (age >= 30 && age <= 35) {
            System.out.println("i am a rich lady");
        } else {
            System.out.println("i am old");
        }
    }
}
