class Math extends Course {
    Math() {
        super("Mathematics", 305);
    }

    @Override
    public void oralControl() {
        System.out.println("Oral Control of Math");
    }

    @Override
    public void writtenControl() {
        System.out.println("Written Control of Math");
    }

    @Override
    public void getName(String name) {
        System.out.println("The class name is: " + name);
    }

    @Override
    public void getClasss(int cls) {
        System.out.println("The class is at: " + cls);
    }
}