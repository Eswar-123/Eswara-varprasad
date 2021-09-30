package Banking;

public class Bank {
	public void account(String name,int age) throws AgeException
	{
		if (age<18)
			throw new AgeException(age);
		else
			System.out.println("your account has been created. ");
	}

	public static void main(String[] args) {
		Bank age=new Bank();
		try
		{
			age.account("Yash",22);
		    age.account("mohan",14);
		}
        catch(AgeException a)
        {
        System.out.println(a);	
        }
	}

}
