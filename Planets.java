public class Planets {
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

        String planet = "";
        String color = "";

        if (choice == 1) {
            planet = "Mercury";
            System.out.println("You chose Mercury.");
        } else if (choice == 2) {
            planet = "Venus";
            System.out.println("You chose Venus.");
        } else if (choice == 3) {
            planet = "Earth";
            System.out.println("You chose Earth.");
        } else if (choice == 4) {
            planet = "Mars";
            System.out.println("You chose Mars.");
        } else if (choice == 5) {
            planet = "Jupiter";
            System.out.println("You chose Jupiter.");
        } else if (choice == 6) {
            planet = "Saturn";
            System.out.println("You chose Saturn.");
        } else if (choice == 7) {
            planet = "Uranus";
            System.out.println("You chose Uranus.");
        } else if (choice == 8) {
            planet = "Neptune";
            System.out.println("You chose Neptune.");
        } else {
            System.out.println("Invalid choice. Pick a number between 1 and 8.");
        }

        if (!planet.isEmpty()) {
            if (choice == 1) {
                color = "grey";
            } else if (choice == 2 || choice == 6) {
                color = "yellow";
            } else if (choice == 3 || choice == 7 || choice == 8) {
                color = "blue";
            } else if (choice == 4 || choice == 5) {
                color = "red";
            }
            System.out.println("The color of " + planet + " is " + color + ".");
            if (choice % 2 == 0) {
                System.out.println("Your number is even.");
            } else {
                System.out.println("Your number is odd.");
            }
        }
    }
}

// Researched the colors of the planets and added a print statement to print the
// color of the planet that the user chose.
// Added a print statement to check if the selection number is even or odd.
// Used if-else statements to determine the color and whether the number is even
// or odd.

// With the if !planet.isEmpty() statement, we can ensure that the color and
// even/odd statements only execute if the user made a valid choice. If the user
// inputs an invalid number, it will skip those statements and not print any
// color or even/odd information.
