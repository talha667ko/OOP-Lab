class Chemistry extends Course {
    Chemistry() {
        super("chemistry", 301);
    }

    @Override
    public void oralControl() {
        System.out.println("Oral Control of Chemistry");
    }

    @Override
    public void writtenControl() {
        System.out.println("Written Control of Chemistry");
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