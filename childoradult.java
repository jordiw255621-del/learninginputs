public class childoradult {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        int age = In.nextInt();
        if (age < 0) {
            System.out.println("Your age can't be negative");
        } else if (age == 0) {
            System.out.println("Your age can't be zero");
        } else if (age < 11) {
            System.out.println("You are a Child.");
        } else if (age > 12 && age < 18) {
            System.out.println("You are a Tween.");
        }
        if (age >= 18) {
            System.out.println("You are an Adult.");
        }
    }
}
