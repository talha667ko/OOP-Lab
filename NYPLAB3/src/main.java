import java.util.Scanner;

public class main {
    public static void main(String[] args){

        int aCount = 0;
        int Upcount = 0; 
        String line;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a line:");
        line = scan.nextLine();
        
        for(int i =0; i < line.length();i++){
            if(line.charAt(i) == 'a' || line.charAt(i) == 'A'){
                aCount++;
            }

            char letter = line.charAt(i);

            if(Character.isUpperCase(letter)){
                Upcount++;
            }
        }
        System.out.println("The number of a : "+aCount);
        System.out.println("The number of upper case letter: "+Upcount);

        String template = "Java Programlama Dersi Fall 2024";
        int start = template.indexOf("P");
        int end = template.indexOf("i");
        System.out.println(template.substring(start, end+1));
    
    }
}
