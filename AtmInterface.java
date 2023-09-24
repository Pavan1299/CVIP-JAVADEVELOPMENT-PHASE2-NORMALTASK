import java.util.Scanner;
public class AtmInterface
{
	public static void main(String[] args)
	{
		int amount=75000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for deposit\nEnter 2 for withdraw\nEnter 3 for check balance\nEnter any other number for exit\n");
		int n=sc.nextInt();
		switch(n)
		{
			case 1 :
				System.out.println("Enter amount for deposit ");
				int d=sc.nextInt();
				amount=amount+d;
				System.out.println("Your balance after deposit is "+d+" to your account is "+amount+".\n");
				break;
			case 2 :
				System.out.println("Enter amout for withdraw ");
				int w=sc.nextInt();
				if(amount>=w)
				{
					amount=amount-w;
					System.out.println("Your balance after withdraw is "+w+" from your account is "+amount+".\n");
					break;
				}
				else
				{
					System.out.println("Entered amount is insufficient.Enter amount is more than balance amount");
					break;
				}
			case 3 :
				System.out.println("Your balance amount in your account is "+amount+".\n");
				break;
			case 4 :
				System.out.println("You have entered exit option.\n");
				System.out.println("Thank You for visiting.\nPlease visit again.");
				break;
		}
	}	
}