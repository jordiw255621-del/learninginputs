public class AnotherMonthLongMethod {
    public static void main(String[] args) {
        System.out.println("Choose a number between 1-12: ");
        int choice = In.nextInt();
        if (choice == 1) {
            System.out.println("January (31 Days)");
        } else if (choice == 2)
            System.out.println("February (28 Days)");
        else if (choice == 3)
            System.out.println("March (31 Days)");
        else if (choice == 4)
            System.out.println("April (30 Days)");
        else if (choice == 5)
            System.out.println("May (31 Days)");
        else if (choice == 6)
            System.out.println("June (30 Days)");
        else if (choice == 7)
            System.out.println("July (31 Days)");
        else if (choice == 8)
            System.out.println("August (31 Days)");
        else if (choice == 9)
            System.out.println("September (30 Days)");
        else if (choice == 10)
            System.out.println("October (31 Days)");
        else if (choice == 11)
            System.out.println("November (30 Days)");
        else if (choice == 12)
            System.out.println("December (31 Days)");
        else {
            System.out.println("You inputted a number higher than 12");
        }
    }
}
