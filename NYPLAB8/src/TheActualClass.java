public class TheActualClass {
    public static void main(String[] args) {
        Math Cl1 = new Math();
        Physique Cl2 = new Physique();
        Chemistry Cl3 = new Chemistry();

        Cl1.oralControl();
        Cl1.writtenControl();
        Cl1.getName(Cl1.courseName);
        Cl1.getClasss(Cl1.courseClass);
        Cl1.capitalize(Cl1.courseName);
        System.out.println("----------------");
        Cl2.oralControl();
        Cl2.writtenControl();
        Cl2.getName(Cl2.courseName);
        Cl2.getClasss(Cl2.courseClass);
        Cl2.capitalize(Cl2.courseName);
        System.out.println("----------------");
        Cl3.oralControl();
        Cl3.writtenControl();
        Cl3.getName(Cl3.courseName);
        Cl3.getClasss(Cl3.courseClass);
        Cl3.capitalize(Cl3.courseName);
        System.out.println("----------------");

    }
}
