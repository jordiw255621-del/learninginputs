public class GameRecommender {
    public static void main(String[] args) {
        System.out.println("Enter your favorite video game genre:");
        System.out.println("1. Action");
        System.out.println("2. Adventure");
        System.out.println("3. First-Person-Shooter");

        // Print blank line
        System.out.println();
        System.out.print("Enter your choice: ");
        int choice = In.nextInt();
        if (choice == 1) {
            System.out.println("We recommend playing Grand Theft Auto V.");
        } else if (choice == 2) {
            System.out.println("We recommend playing The Legend of Zelda: Breath of the Wild.");
        } else if (choice == 3) {
            System.out.println("We recommend playing Counter-Strike");
        } else {
            System.out.println("Invalid choice.");
        }
    }
}

// This program recommends a video game based on the user's choice of genre. It
// uses if-else statements to determine which game to recommend based on the
// user's input.

// It works by first printing out the options for the user to choose from, then
// it reads the user's input using the In class. Based on the input, it uses
// if-else statements to determine which game to recommend and prints the
// next lines with the answers

// Just added another print option for user to choose from and added another if
// statement to print the recommendation for that choice.