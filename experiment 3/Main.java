import java.util.Scanner;
class BankAccount {
private double balance;
public BankAccount(double initialBalance) {
balance = initialBalance;
}
public void deposit(double amount) {
if (amount > 0) {
balance += amount;
System.out.println("Deposited: " + amount);
} else {
System.out.println("Deposit amount must be positive.");
} }
public void withdraw(double amount) {
if (amount > 0 && amount <= balance) {
balance -= amount;
System.out.println("Withdrew: " + amount);
} else {
System.out.println("Insufficient balance or invalid amount.");
}
}
public double getBalance() {
return balance;
}
}class SavingsAccount extends BankAccount {
public SavingsAccount(double initialBalance) {
super(initialBalance);
}
public void withdraw(double amount) {
if (getBalance() - amount < 100) {
System.out.println("Withdrawal denied: Balance cannot fall below 100.");
} else {
super.withdraw(amount);
}
}
}
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter initial balance for BankAccount: ");
double initialBalance = scanner.nextDouble();
BankAccount myAccount = new
BankAccount(initialBalance);
System.out.print("Enter deposit amount for BankAccount: ");
myAccount.deposit(scanner.nextDouble());
System.out.print("Enter withdrawal amount for BankAccount: ");
myAccount.withdraw(scanner.nextDouble());
System.out.println("Current Balance: " + myAccount.getBalance());
System.out.print("Enter initial balance for SavingsAccount: ");
initialBalance = scanner.nextDouble();
SavingsAccount mySavingsAccount = new SavingsAccount(initialBalance);
System.out.print("Enter deposit amount for SavingsAccount: ");
mySavingsAccount.deposit(scanner.nextDouble());
System.out.print("Enter first withdrawal amount for SavingsAccount: ");
mySavingsAccount.withdraw(scanner.nextDouble());
System.out.print("Enter second withdrawal amount for SavingsAccount: ");
mySavingsAccount.withdraw(scanner.nextDouble());
System.out.println("Current Balance: " + mySavingsAccount.getBalance());
scanner.close();
}
}