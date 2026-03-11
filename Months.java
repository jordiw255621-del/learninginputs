public class Months {
    public static void main(String[] args) {
        System.out.println("Choose a number between 1-12: ");
        int choice = In.nextInt();
        if (choice == 1) {
            System.out.println("January");
        } else if (choice == 2)
            System.out.println("February");
        else if (choice == 3)
            System.out.println("March");
        else if (choice == 4)
            System.out.println("April");
        else if (choice == 5)
            System.out.println("May");
        else if (choice == 6)
            System.out.println("June");
        else if (choice == 7)
            System.out.println("July");
        else if (choice == 8)
            System.out.println("August");
        else if (choice == 9)
            System.out.println("September");
        else if (choice == 10)
            System.out.println("October");
        else if (choice == 11)
            System.out.println("November");
        else if (choice == 12)
            System.out.println("December");
        else {
            System.out.println("You inputted a number higher than 12");
        }
    }
}
