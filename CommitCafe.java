public class CommitCafe {

    private static String barista = "Aiden"; // STUDENT_TODO_1A: Change name
    // STUDENT_TODO_1B: Add a nickname or title for the barista
    private static String nickname = "Head Barista";

    private static int cups = 0;

    public static void brew(String drink) {
        // STUDENT_TODO_2A: Implement - add 1 to cups & print a message
        cups++;
        System.out.println(nickname + " " + barista + " brewed a cup of " + drink + ". Total cups: " + cups);
        // STUDENT_TODO_2B: Add a second brew-related improvement
        if (drink.equalsIgnoreCase("Espresso")){
            System.out.println("Strong Coffee!");
        }
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}