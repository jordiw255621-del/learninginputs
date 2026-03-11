public class HundredYears {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        String name = In.nextLine();

        System.out.print("Enter your age: ");
        int age = In.nextInt();

        // Calculate the year when the user will turn 100
        int year100 = (100 - age) + 2026;
        int birthYear = 2026 - age;

        if (age < 13) {
            System.out.println("Hi " + name + ", you're still a child! Enjoy these wonderful years!");
        } else if (age < 20) {
            System.out.println("Hello " + name + ", you're a teenager! Embrace new experiences and learn from them!");
        } else if (age < 30) {
            System.out.println(
                    "Hey " + name + ", you're in your twenties! A great time for personal growth and exploration!");
        } else if (age < 50) {
            System.out.println("Hi " + name + ", you're in the prime of your life! Make the most of these years!");
        } else {
            System.out.println("Hello " + name + ", age is just a number! Keep living life to the fullest!");
        }
        if (age > 100) {
            System.out.println("Wow " + name + ", you're a centenarian!");
        }
        System.out.println("Fun fact: you will turn 100 in the year " + year100);
        System.out.println(name + ", you were born in " + birthYear);
    }
}

// This program simply asks for your name and age, then prints a
// personalized message based on age group the user input and calculates what
// year it will be when they turn 100

// This program works by using reads input with In class, uses if-else for age
// categories, computes year with (100 - age) + 2026.

// When a user inputs anything over 100, it will calculate wrong because it does
// not account for the fact that they have already turned 100. Eg. if a
// user inputs 101, it will calculate the year as (100 - 101) + 2026 = 2025,
// which is incorrect.

// To add Wow you're a centenarian!' message for users above 100, we can add an
// additional if statement to check if the age is greater than 100 and print the
// message accordingly.

// To add a print for when the user was born, simply added int birthYear = 2026
// - age; and then printed it with System.out.println(name + ", you were born in
// " + birthYear) at the end of the program.