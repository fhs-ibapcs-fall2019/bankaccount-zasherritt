public class BankAccount
{
    private double balance;
    private String accountHolder;
    private int accountNumber;
    private String password;
    private boolean loggedIn;
    private double deposit;
    private double withDrawal;
    
    // constructor (always has the name of a class) 
    public BankAccount(double balance, String accountHolder, int accountNumber,String password, double deposit, double withDrawal)
    {
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.password = password;
        this.loggedIn = false;
        this.deposit = deposit;
        this.withDrawal = withDrawal;
    }
    
    //mutator - allow you to change an instance variable (attribute)
    public void logIn(String name, String password)
    {
        if (accountHolder.equals(name) && this.password.equals(password))
        {
            loggedIn = true;
        }
    }
    
    //this.balance could be changed to balance because there is no other variable with a shared identifier
    //accessor - gives access to the balance instance variable (attribute)
    public double getBalance()
    {
        if (this.loggedIn == true)
        {
            return balance;
        }
        else
        {
            throw new IllegalStateException("You are not logged in");
        }
    }  
    
    //mutator - logs out the user 
    public void logout()
    {
        loggedIn = false;
    }
        
    //why use toString in this instance instead of naming the method accountHolder
    public String toString()
    {
         if (this.loggedIn == true)
        {
          return accountHolder + " Account# " + accountNumber + " Balance: $" + balance;  
        }
        else
        {
          throw new IllegalStateException("You are not logged in");
        }
        
    }
    
    //deposit
    public String deposit() 
    {
       if (this.loggedIn == true)
       {
          return "Current Balance: " + balance + " How much would you like to deposit? " + deposit;
       }
       else
       {
          throw new IllegalStateException("You are not logged in");
       } 
    }
    
    //withdrawal
    public String withDrawal()
    {
       if (this.loggedIn == true)
       {
          return "Current Balance: " + balance + " How much would you like to withdrawal? " + withDrawal;
       }
       else
       {
          throw new IllegalStateException("You are not logged in");
       } 
    }
}
