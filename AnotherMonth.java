public class AnotherMonth {
    public static void main(String[] args) {
        String[] months = { "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December" };
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        System.out.println("Choose a number between 1-12: ");
        int choice = In.nextInt();
        if (choice >= 1 && choice <= 12) { // This sets up a within range of 1-12, so we don't have to check for each
                                           // number
            System.out.println(months[choice - 1] + " (" + days[choice - 1] + " days)");
        } else {
            System.out.println("You inputted a number higher than 12");
        }
    }
}

// The way line 9 works is that we have an array of months and an array of days.
// The user inputs a number between 1-12, and we check if it's within that
// range. If it is, we use the input to access the corresponding month and
// number of days from the arrays. We need to subtract 1 from the choice because
// array indices start at 0. So if the user inputs 1, we access months[0] which
// is
// "January" and days[0] which is 31.
// This is more efficient than having 12 separate if statements for each month