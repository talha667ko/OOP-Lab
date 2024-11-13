import java.util.Vector;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    static Vector<Integer> numbers = new Vector<>();
    static Vector<Integer> numbersUnique = new Vector<>();
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> namelist = new ArrayList<>();
    static ArrayList<Integer> numberlist = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static float total;

    public static void main(String[] args) {

        while (true) {
            System.out.print("Enter a number (-1 to quit): ");
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        System.out.println("\nUnique numbers:");

        for (int i = 0; i < numbers.size(); i++) {
            int currentNum = numbers.get(i);
            int count = 0;

            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(j) == currentNum) {
                    count++;
                }
            }

            if (count == 1) {
                if (!numbersUnique.contains(currentNum)) {
                    numbersUnique.add(currentNum);
                }
            }
        }

        System.out.println(numbersUnique);

        while (true) {
            System.out.println("Enter student's name:(enter finish to quit) ");
            String name = scan.nextLine();

            if (!name.contains("finish")) {
                namelist.add(name);
            } else {
                System.out.println("Input is finish.\n");
                break;
            }

            System.out.println("Now enter student's note: ");
            int number = scan.nextInt();
            numberlist.add(number);

            scan.nextLine();

        }

        System.out.printf("%-20s %-20s\n", "NAMES", "NUMBERS");
        for (int i = 0; namelist.size() > i; i++) {
            System.out.printf("%-20s %-20d\n", namelist.get(i), numberlist.get(i));
        }
        System.out.println("\n\n");

        for (int i = 0; numberlist.size() > i; i++) {
            total = total + numberlist.get(i);
        }
        float t = total / numberlist.size();
        System.out.println("AVERAGE: " + t + "\n\n");

        System.out.println("Above average students:");
        for (int i = 0; numberlist.size() > i; i++) {
            if (numberlist.get(i) > t) {
                System.out.printf("%-20s %-20d\n", namelist.get(i), numberlist.get(i));
            }
        }
    }
}