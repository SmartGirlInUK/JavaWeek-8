package Q3;

import java.util.Scanner;

public class SavingsAccount extends BankAccount {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.withdraw();
    }

    public void withdraw() {
        double withdraw = 0;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the amount that you withdraw : ");
        withdraw = s.nextDouble();

        if (withdraw <= 100) {
            System.out.println("Success");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}