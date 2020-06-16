import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;
import java.lang.Exception;

public class BankAccount {
    
    private double accBalance;
    
    public BankAccount() {
        accBalance = 0.0;
    }
    
    public BankAccount(final double money) {
        this.accBalance = money;
    }
    
    public void deposit(double money) {
        this.accBalance = accBalance + money;
    }
    
    public double getBalance() {
        return this.accBalance;
    }
    
    public void withdraw(final double money) throws AccountException {
        
        validateAmount(money, this.getBalance());
        this.accBalance = accBalance - money;
        
    }
    
    public void transfer(final double money, final BankAccount anAccount) throws AccountException {
        
        validateAccount(anAccount);
        this.withdraw(money);
        anAccount.deposit(money);
        
    }
    
    public static void validateAmount(final double amount, final double balance) throws AccountException {
        
        if (amount < 0) {
            throw new  AccountException("Invalid Amount");
        }
        
        if (amount > balance) {
            throw new  AccountException("Insufficient Funds");
        }
        
    }
    
    public static void validateAccount(final BankAccount anAccount) throws AccountException {
        
        if (anAccount == null) {
            throw new AccountException("Bank Account Doesn't Exist");
        }
        
    }
    
}
