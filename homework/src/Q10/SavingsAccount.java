package Q10;

public class SavingsAccount extends BankAccount {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.deposit();
        sa.withdraw();
    }

    public void deposit() {
        System.out.println("This is Saving Account's Deposit Method!!");
    }

    public void withdraw() {
        System.out.println("This is Saving Account's Withdraw Method!!");
    }
}