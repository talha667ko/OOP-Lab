package Lab_1;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello World!");
        System.out.println(args[0]+" "+args[1]);
        System.out.println("Enter name:");
        String name = scan.nextLine();
        System.out.println(name);

    }
    
}
