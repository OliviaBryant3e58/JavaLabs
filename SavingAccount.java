import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;
import java.lang.Exception;

public class SavingAccount extends BankAccount {
    
    private static double interestRate = 0.5;
    
    public SavingAccount() {
        super();
    }
    
    public SavingAccount(final double money) {
        super(money);
    }
    
    public double calculateInterestRate() {
        return getBalance() * Math.pow(1.0 + (0.5 / 12.0), 12.0 * 1.0);
    }
    
    public void addInterest() {
        super.deposit(calculateInterestRate());
    }
    
}
