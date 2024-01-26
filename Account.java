//Problem 1.3

package taskstwo
import java.util.Scanner;
public class Account {
    double balance;
    public Account() {
        System.out.println(balance);
    }
    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account(0);
        boolean isQuit = false;
        while (!isQuit) {
            System.out.println("Press 1 to deposit amount, \nPress 2 to withdraw amount, \npress 3 to check balance, \nPress 0 to quit the process : ");
            int n = scanner.nextInt();
            if(n == 3){
                displayBalance(account);
            } else if(n == 2){
                withdrawAmount(account);
            } else if (n == 1) {
                depositAmount(account);
            } else {
                System.out.println("Press Valid Number or Press 0 to quit");
                isQuit = true;
            }
        }

    }

    private static void depositAmount(Account account) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount you want deposit : ");
        double depositAmount = scanner.nextDouble();
        double balanceAmt = account.getBalance() + depositAmount;
        account.setBalance(balanceAmt);
        System.out.println("you have deposited rs." + depositAmount + " and your balance is rs." + balanceAmt);
    }

    private static void withdrawAmount(Account account) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw : ");
        double withdrawAmount = scanner.nextDouble();
        if(account.getBalance() < withdrawAmount) {
            System.out.println("You dont't have sufficient amount to withdraw and your balance is rs." + account.getBalance());
        }
        else {
            double balanceAmt = account.getBalance() - withdrawAmount;
            account.setBalance(balanceAmt);
            System.out.println("you have debited rs." + withdrawAmount + " and your balance is rs." + balanceAmt);
        }
    }

    private static void displayBalance(Account account) {
        System.out.println("Your Current balance is rs." + account.getBalance());
    }




}
