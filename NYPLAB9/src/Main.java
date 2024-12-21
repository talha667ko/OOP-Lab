import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<animals> ANIMALS = new ArrayList<>();
        animals A1 = new animals();
        animals A2 = new animals();
        Fish F1 = new Fish(4, false, 3, "male");
        Fish F2 = new Fish(3, true, 5, "female");
        Duck D1 = new Duck(1, "male");
        Duck D2 = new Duck(5, "female");
        Duck D3 = new Duck(3, "male");
        Zebra Z1 = new Zebra(6, "male", true);
        Zebra Z2 = new Zebra(12, "female", false);
        Zebra Z3 = new Zebra(6, "male", true);
        Zebra Z4 = new Zebra(10, "female", true);
        ANIMALS.add(A1);
        ANIMALS.add(A2);
        ANIMALS.add(F1);
        ANIMALS.add(F2);
        ANIMALS.add(D1);
        ANIMALS.add(D2);
        ANIMALS.add(D3);
        ANIMALS.add(Z1);
        ANIMALS.add(Z2);
        ANIMALS.add(Z3);
        ANIMALS.add(Z4);

        for (int i = 0; i < ANIMALS.size(); i++) {
            ANIMALS.get(i).isMamal(true);
            ANIMALS.get(i).mate("animal", "animal");
            ANIMALS.get(i).voice();
            ANIMALS.get(i).sleep();
            System.out.println(ANIMALS.get(i).toString());
            System.out.println("------------------------------------");
        }

        F1.swim();
        F2.swim();
        D1.swim();
        D2.swim();
        D3.swim();
        D1.quack();
        D2.quack();
        D3.quack();
        Z1.run();
        Z2.run();
        Z3.run();
        Z4.run();

    }
}
