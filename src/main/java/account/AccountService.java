package account;

public class AccountService {

    Logger logger =Logger.getInstance();

    public void withdraw(String accountNumber, double amount) {
        if (amount > 0 && AccountNumberValidator.validate(accountNumber)) {
//            System.out.println(amount + " has been withdraw from " + accountNumber);
//            Logger.getInstance().log(amount + " has been withdraw from " + accountNumber);
            logger.log(amount + " has been withdraw from " + accountNumber);
        }
    }

    public void deposit(String accountNumber, double amount) {
        if (amount > 0 && AccountNumberValidator.validate(accountNumber)) {
//            System.out.println(amount + " has been deposit into " + accountNumber);
            Logger.getInstance().log(amount + " has been deposit into " + accountNumber);
            logger.log(amount + " has been deposit into " + accountNumber);


        }
    }
}
