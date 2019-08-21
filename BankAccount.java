public class BankAccount
{
    private double balance;
    private String accountHolder;
    private int accountNumber;
    private String password;
    private boolean loggedIn;
    
    public BankAccount(double balance, String accountHolder, int accountNumber,
    String password)
    {

    }
    
    //mutator - allow you to change an instance variable (attribute)
    public void logIn(String name, String password)
    {
        if (accountHolder.equals(name) && this.password.equals(password))
        {
            loggedIn = true;
        }
    }
    
    //accessor - gives access to the balance instance variable (attribute)
    public double getBalance()
    {
        return 0;
    }  
}