public class Zebra extends animals {
    boolean is_wild;

    public void run() {
        System.out.println("The zebra is running.");
    }

    @Override
    public void voice() {
        System.out.println("KINSHHHHHH!");
    }

    Zebra(int age, String gender, boolean w) {
        super(age, gender);
        is_wild = w;
    }
}
