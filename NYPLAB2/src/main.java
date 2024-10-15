import java.util.Scanner;

public class main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        double radius;
        double area;
        double perimeter;

        System.out.println("Enter the radius of the circle:");
        radius = scan.nextDouble();

        area = Math.PI * Math.pow(radius, 2);
        System.out.println("The are of your circle is "+ area);

        perimeter = (double)2 * Math.PI * radius;
        System.out.println("The perimeter of your circle is "+ perimeter);
        System.out.println();

        float x= 1.2f;
        float y= 14f;
        System.out.println("(3x+7/y)^2 = "+ Math.pow((3*x + (float)7/y),2));

        x= 6f;
        y= 4f;
        System.out.println("(x^2 + 2y)/(y^2 / 2) = "+ (Math.pow(x,2) + 2*y)/(Math.pow(y, 2)/2));
    }
}
