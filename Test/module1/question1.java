package module1;
import java.util.Scanner;
public class question1 {

	public static void main(String[] args) {
		int a,n,sum=0;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number:");
		a=sc.nextInt();
		while(a!=0) {
			n=a%10;
			sum=sum+(n*n*n);
			a=a/10;
		}
System.out.println("sum of cube=" + sum);

	}

}

