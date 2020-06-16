import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;
import java.lang.Exception;

public class AccountException extends Throwable {
    
    public AccountException(final String message) {
        super(message);
    }
    
}
