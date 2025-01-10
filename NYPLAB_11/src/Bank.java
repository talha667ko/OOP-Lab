import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ChequeA AA = new ChequeA("1020jhK", "Talha", "Korkmaz", 4000);
        DepositA BB = new DepositA("hgd165", "Alperen", "Palak", 3000);
        Account CC = new ChequeA(null, null, null, 0);

        System.out.println(CC.amount);
        try {
            AA.placeM(400);
            BB.placeM(400);
            if (AA.amount < 100) {
                throw new MinusMException("You don't have eough money in your account!\n");
            } else {
                AA.withdrawM(100);
            }
            AA.placeM(3000);
            if (AA.amount < 2000) {
                throw new MinusMException("You don't have eough money in your account!\n");
            } else {
                AA.withdrawM(2000);
            }
            if (BB.amount < 9500) {
                throw new MinusMException("You don't have eough money in your account!\n");
            } else {
                BB.withdrawM(9500);
            }
            AA.placeM(2500);
        } catch (MinusMException e) {
            e.printStackTrace();
        }
    }
}
