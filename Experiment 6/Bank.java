import java.util.*;
import java.lang.*;
class LowBalanceException extends Exception {
    public String toString() {
        return " Balance is low";
    }
}
class NegativeNumberException extends Exception {
    public String toString() {
        return "Negative number not allowed";
    }
}
class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public void balanceEnquiry() {
        System.out.println("Current balance: " + balance);
    }

    public void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException();
        } else {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) throws LowBalanceException, NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException();
        } else if (amount > balance) {
            throw new LowBalanceException();
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}
public class Bank {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount(0);
while (true) {
            System.out.println("\n1. Balance Enquiry\n2. Deposit\n3. Withdraw\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            try {
                switch (choice) {
                    case 1:
                        acc.balanceEnquiry();
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        acc.deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        acc.withdraw(withdrawAmount);
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (LowBalanceException e) {
                System.out.println(e);
            } catch (NegativeNumberException e) {
                System.out.println(e);
            }
        }
    }
}
