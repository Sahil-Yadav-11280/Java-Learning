// ATM System example:

// Custom exception:
class InsufficientFundsException extends Exception{
    private double amountNeeded;

    public InsufficientFundsException(double amountNeeded){
        super("Transaction failed, you are short by: $" + amountNeeded);
        this.amountNeeded = amountNeeded;
    }
}

class ATM{
    private double balance = 500.00;

    public void withdraw(double amount) throws InsufficientFundsException{
        System.out.println("Attempting to withdraw: $" + amount);

        if(amount <= 0){
            throw new IllegalArgumentException("Withdrawal amount must be positive!");
        }
        if(amount>0){
            double missing = amount-balance;
            throw new InsufficientFundsException(missing);
        }

        balance -= amount;
        System.out.println("Success remaining balance: $"+ balance);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        ATM myAtm = new ATM();

        try {
            myAtm.withdraw(600);
        } catch (InsufficientFundsException e) {
            System.err.println("CUSTOMER ALERT: " + e.getMessage());
            System.out.println("Would you like to apply for a credit line instead?");
        } catch(IllegalArgumentException e){
            System.err.println("INPUT ERROR: "+e.getMessage());
        } catch (Exception e){
            System.err.println("UNEXPECTED ERROR: "+e.getMessage());
        } finally{
            System.out.println("Thank You for using our ATM. Please remove your card now.");
        }
    }
}
