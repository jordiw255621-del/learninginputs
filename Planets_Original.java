public class Planets_Original {
    public static void main(String[] args) {
        System.out.println("Pick your favourite planet: ");
        System.out.println("1. Mercury");
        System.out.println("2. Venus");
        System.out.println("3. Earth");
        System.out.println("4. Mars");
        System.out.println("5. Jupiter");
        System.out.println("6. Saturn");
        System.out.println("7. Uranus");
        System.out.println("8. Neptune");

        System.out.print("Please select a planet: ");
        int choice = In.nextInt();

        if (choice == 1) {
            System.out.println("You chose Mercury.");
        } else if (choice == 2) {
            System.out.println("You chose Venus.");
        } else if (choice == 3) {
            System.out.println("You chose Earth.");
        } else if (choice == 4) {
            System.out.println("You chose Mars.");
        } else if (choice == 5) {
            System.out.println("You chose Jupiter.");
        } else if (choice == 6) {
            System.out.println("You chose Saturn.");
        } else if (choice == 7) {
            System.out.println("You chose Uranus.");
        } else if (choice == 8) {
            System.out.println("You chose Neptune.");
        } else {
            System.out.println("Invalid choice. Pick a number between 1 and 8.");
        }
    }
}

// Done via if-else statements, same setup as GameRecommender.java, just with
// more options and different print statements.
