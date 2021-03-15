package module1;
import java.util.Scanner;
public class question7
{
			
		public static void checkNumber(int n)
		{
		boolean temp=true;
		int digit=n%10;
		n=n/10;
		while(n>0)
		{
			if(digit<n%10)
			{
				temp=false;
				break;
			}
			digit=n%10;
			n=n/10;
		}
		if(temp)
			System.out.println("yes");
		else
			System.out.println("no");
	}

		public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
checkNumber(n);
sc.close();
}
}