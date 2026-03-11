public class ShoeSize {
    public static void main(String[] args) {
        System.out.println("What is your gender" + "\n1. Male" + "\n2. Female");

        int choice = In.nextInt();
        if (choice == 1) {
            System.out.println("You chose to convert your shoe size for men.");
            System.out.print("Enter your foot size in cm: ");
            double shoeSize = In.nextDouble();
            if (shoeSize < 0) {
                System.out.println("Your shoe size can't be negative");
            } else if (shoeSize == 0) {
                System.out.println("Your shoe size can't be zero");
            } else if (shoeSize <= 24) {
                System.out.println("Your shoe size in US is Man's 6 or less");
            } else if (shoeSize <= 25.5) {
                System.out.println("Your shoe size in US is Man's 7 to 9");
            } else if (shoeSize <= 27) {
                System.out.println("Your shoe size in US is Man's 10 to 12");
            } else {
                System.out.println("Your shoe size in US is Man's 12+");
            }
        } else if (choice == 2) {
            System.out.println("You chose to convert your shoe size for women.");
            System.out.print("Enter your foot size in cm: ");
            double shoeSize = In.nextDouble();
            if (shoeSize < 0) {
                System.out.println("Your shoe size can't be negative");
            } else if (shoeSize == 0) {
                System.out.println("Your shoe size can't be zero");
            } else if (shoeSize <= 22) {
                System.out.println("Your shoe size in US is Woman's 4 or less");
            } else if (shoeSize <= 23) {
                System.out.println("Your shoe size in US is Woman's 5 to 7");
            } else if (shoeSize <= 25.1) {
                System.out.println("Your shoe size in US is Woman's 8 to 10");
            } else {
                System.out.println("Your shoe size in US is Woman's 10+");
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
