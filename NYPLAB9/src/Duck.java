public class Duck extends animals {
    String beakColor;

    public void quack() {
        System.out.println("quack! quack!");
    }

    public void swim() {
        System.out.println("The duck is swimming.");
    }

    @Override
    public void voice() {
        System.out.println("QUACK!");
    }

    Duck(int age, String gender) {
        super(age, gender);
        beakColor = "yellow";
    }
}
