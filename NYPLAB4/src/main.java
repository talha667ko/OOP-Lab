import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String mystr = "";
        System.out.println("Enter a sentence: ");
        mystr = scan.nextLine();

        String regex = "[,\\.\\s]";
        String[] arrayStr = mystr.split(regex);
        System.out.println("Your sentence: " + mystr);
        for (String s : arrayStr) {
            if (s.length() < 4) {
                s = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
                System.out.println("\nWords: " + s);
                System.out.println("Short word");
                String reversed = new StringBuilder(s).reverse().toString();
                System.out.println("Reversed: " + reversed);
            } else {
                System.out.println("\nWords: " + s);
                s = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
                System.out.println("Capitilized first letter: " + s);
                String reversed = new StringBuilder(s).reverse().toString();
                System.out.println("Reversed: " + reversed);
            }
        }
        System.out.println("\nTotal character: " + mystr.length());
    }
}
