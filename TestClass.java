/**
 * Write a description of class TestClass here.
 * 
 * @author (Zach Sherritt) 
 * @version (9-4-19)
 */
public class TestClass
{
    public static void main(String[] args)
    {
       
        BankAccount a1 = new BankAccount(500, "Zach", 123, "pass");
        a1.logIn("Zach","pass");
        a1.deposit(50);
        System.out.println(a1);
        
    }
}
