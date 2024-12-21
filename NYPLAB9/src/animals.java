class animals {
    int age;
    String gender;

    animals(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    animals() {

    }

    @Override
    public String toString() {
        return "Object " + this.getClass() + " is mammal";
    }

    public void isMamal(Boolean a) {
        if (a)
            System.out.println("This is a mamal.");
        else
            System.out.println("This is not a mamal.");
    }

    public void mate(String animal, String animal2) {
        if (animal.equals(animal2))
            System.out.println("These animals are mate.");
        else
            System.out.println("These animals are not mate.");
    }

    public void voice() {
        System.out.println("Animal's voices");
    }

    final void sleep() {
        System.out.println("Zzzz!!!");
    }
}
