public class Fish extends animals {
    int Size;
    boolean canEat;

    public void swim() {
        System.out.println("The fish is swimming.");
    }

    @Override
    public void voice() {
        System.out.println("Blurp!!!!");
    }

    Fish(int size, boolean canEat, int age, String gender) {
        super(age, gender);
        this.Size = size;
        this.canEat = canEat;
    }
}