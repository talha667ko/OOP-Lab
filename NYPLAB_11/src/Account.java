import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

abstract public class Account implements ReportA {
    String accountID;
    String firstName;
    String lastName;
    float amount;

    Account(String id, String fname, String name, float amnt) {
        accountID = id;
        firstName = fname;
        lastName = name;
        amount = amnt;
    }

    abstract void withdrawM(float money);

    abstract void placeM(float money);

}

class ChequeA extends Account {

    ChequeA(String id, String fname, String name, float amnt) {
        super(id, fname, name, amnt);
    }

    File report = new File(this.accountID + ".txt");
    File log = new File(this.accountID + "_log.txt");

    void withdrawM(float money) {
        money = (float) (money * 1.05);
        this.amount -= money;
        makeReport("Withdrawed", money, this.amount);
    }

    void placeM(float money) {
        this.amount += money;
        makeReport("Placed", money, this.amount);
    }

    public void makeReport(String S, float m$, float newAmnt) {
        try {
            if (!(report.exists())) {
                report.createNewFile();
            }
            if (!(log.exists())) {
                log.createNewFile();
                FileWriter writerL = new FileWriter(this.accountID + "_log.txt");
                writerL.write("Account ID: " + this.accountID + "\n");
                writerL.close();
            }
            FileWriter writerR = new FileWriter(this.accountID + ".txt");
            FileWriter writerL = new FileWriter(this.accountID + "_log.txt", true);

            writerR.write("Acount ID: " + this.accountID + "\n" +
                    "Owner: " + this.firstName + this.lastName + "\n" +
                    "Money: " + this.amount + "$");
            writerR.close();
            writerL.append("You have " + S + m$ + "from your account; your new balance: " + newAmnt + "\n");
            if (S == "Withdrawed") {
                writerL.append("You have withdraw money: penalization of %5.\n");
            }
            writerL.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}

class DepositA extends Account {

    DepositA(String id, String fname, String name, float amnt) {
        super(id, fname, name, amnt);
    }

    File report = new File(this.accountID + ".txt");
    File log = new File(this.accountID + "_log.txt");

    void withdrawM(float money) {
        this.amount -= money;
        makeReport("Withdrawed", money, this.amount);
    }

    void placeM(float money) {
        this.amount += money;
        makeReport("Placed", money, this.amount);
    }

    public void makeReport(String S, float m$, float newAmnt) {
        try {
            if (!(report.exists())) {
                report.createNewFile();
            }
            if (!(log.exists())) {
                log.createNewFile();
                FileWriter writerL = new FileWriter(this.accountID + "_log.txt");
                writerL.write("Account ID: " + this.accountID + "\n");
                writerL.close();
            }
            FileWriter writerR = new FileWriter(this.accountID + ".txt");
            FileWriter writerL = new FileWriter(this.accountID + "_log.txt", true);

            writerR.write("Acount ID: " + this.accountID + "\n" +
                    "Owner: " + this.firstName + this.lastName + "\n" +
                    "Money: " + this.amount + "$");
            writerR.close();
            writerL.append("You have " + S + " " + m$ + "$ from your account; your new balance: " + newAmnt + "$\n");
            writerL.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}