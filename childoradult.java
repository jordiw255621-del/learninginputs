public class ChildOrAdult {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        int age = In.nextInt();
        if (age < 0) {
            System.out.println("Your age can't be negative");
        } else if (age == 0) {
            System.out.println("Your age can't be zero");
        } else if (age <= 11) {
            System.out.println("You are a Child.");
        } else if (age <= 17) {
            System.out.println("You are a Tween.");
        } else {
            System.out.println("You are an Adult.");
        }
    }
}