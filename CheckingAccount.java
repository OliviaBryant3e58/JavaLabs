import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;
import java.lang.Exception;

public class CheckingAccount extends BankAccount {
    
    private static double transfactionFee = 1.0;
    
    public CheckingAccount() {
        super();
    }
    
    public CheckingAccount(final double accBalance) {
        super(accBalance);
    }
    
    public void deductFee() throws AccountException {
        super.withdraw(transfactionFee);
    }
    
    @Override
    
    public void deposit(double money) {
        money--;
        super.deposit(money);
    }
    
    public void withdraw(final double money) throws AccountException {
        deductFee();
        super.withdraw(money);
    }
    
    public void transfer(final double money, final BankAccount anAccount) throws AccountException {
        deductFee();
        super.transfer(money, anAccount);
    }
    
}
