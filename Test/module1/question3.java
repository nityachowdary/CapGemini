package module1;
import java.util.Scanner;
public class question3 {

	public static void main(String[] args) {
		System.out.println("enter te number to print fibonacci series");
		Scanner sc=new Scanner(System.in);
				short a=sc.nextShort();
		        Series sc1=new Series();
		        long b=sc1.input(a);
		        System.out.println("the "+a+"th number of the fibonacci series is :" +b);
		        
		
	}

}


class Series
{
	int a=1;
	int b=1;
	int c=0;
	int count;
	int input(int a)
	{
		count=a;
		count=fab(count);
        return count;		
	}
	int fab(int count)
	{
		if(count!=2)
		{
			c=a+b;
			a=b;
			b=c;
			fab(--count);
		}
		return c;
	}
}