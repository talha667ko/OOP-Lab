
import java.util.ArrayList;

public class Inheritance {

    public static void main(String[] args) {
        Cat Garfield = new Cat();
        Dog Odie = new Dog();
        Bird Red = new Bird();

        Animals[] a = new Animals[3];
        a[0] = Red;
        a[1] = Odie;
        a[2] = Garfield;

        a[0].makeNoise();
        a[1].makeNoise();
        a[2].makeNoise();
        a[0].move();
        a[1].move();
        a[2].move();

        Red.fly();
        Garfield.toy();
        Odie.play();
    }

}

class Animals {

    String name;
    int age;

    public void makeNoise() {
        System.out.println("The animal makes noises.");
    }

    public void move() {
        System.out.println("The animal moves.");
    }

}

class Cat extends Animals {
    public void makeNoise() {
        System.out.println("Miaow Miaow.");
    }

    public void toy() {
        System.out.println("Garfield eats lasagna.");
    }
}

class Dog extends Animals {
    public void makeNoise() {
        System.out.println("Bark Bark.");
    }

    public void play() {
        System.out.println("Odie plays with the ball.");
    }
}

class Bird extends Animals {
    public void makeNoise() {
        System.out.println("Piou Piou.");
    }

    public void fly() {
        System.out.println("Red gets angry and flies.");
    }
}