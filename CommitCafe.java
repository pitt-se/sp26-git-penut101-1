public class CommitCafe {

    private static String barista = "Aiden Nemeroff";
    private static String title = "Head Barista";

    private static int cups = 0;

    public static void brew(String drink) {
        cups++;

        System.out.println(title + " " + barista + " brewed a " + drink + ". Total cups: " + cups);

        if (drink.equalsIgnoreCase("Espresso")) {
            System.out.println("Strong Coffee!");
        }

        // Keep their debug improvement (cleaned)
        System.out.println("[INFO] drink length = " + drink.length());
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + title + " " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}