import java.util.*;

class passwordauthentication extends Exception{
    public passwordauthentication(String str)
    {
        super(str);
    }
}
public class usepass 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
    String username ="user";
    String password ="pass";
    System.out.println("Enter Username : ");
    String uname=s.nextLine();
    System.out.println("Enter Password : ");
    String pass1=s.nextLine();
    try
    {
        if(password.equals(pass1) && username.equals(uname))
        {
            System.out.println("Success ");
        }
        else
        {
            throw new passwordauthentication("Invalid username or Password ");
            
            
        }
    }
    catch(passwordauthentication pa)
    {
        System.out.println(pa);
    }
    }
    
}
