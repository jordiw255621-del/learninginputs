public class ShoeSize {
    public static void main(String[] args) {
        System.out.print("Enter your foot size in cm: ");
        double shoeSize = In.nextDouble();
        if (shoeSize < 0) {
            System.out.println("Your shoe size can't be negative");
        } else if (shoeSize <= 1) {
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
    }
}
