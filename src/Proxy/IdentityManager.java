package Proxy;

public class IdentityManager 
{
	//DAO SIW
	public static boolean checkUser(String username, String password) 
	{
        return (username.equals(password)) ? true : false;
    }
}
