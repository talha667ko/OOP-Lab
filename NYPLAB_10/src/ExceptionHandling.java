import java.util.Scanner;

public class ExceptionHandling {

    static String input;
    static int age;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your number to be squared: ");
        input = scan.nextLine();
        System.out.println("Enter your Age: ");
        age = scan.nextInt();
        getNumAge();

    }

    public static void getNumAge() throws NumberFormatException {
        Integer number = 0;
        try {
            number = Integer.parseInt(input);
            if (age < 18) {
                throw new InvalidAgeException("ERROR! You are too young.");
            } else {
                System.out.println("You are old enough!");
            }
        } catch (NumberFormatException e) {
            System.err.println("ERROR! Enter a number please!!!");
            number = (Integer) null;
        } catch (InvalidAgeException eA) {
            System.err.println(eA.getMessage());
        }

        if (number != null) {
            number = number * number;
            System.out.println("Your number squared: " + number);
        }

    }
}
