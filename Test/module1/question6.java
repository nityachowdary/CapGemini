package module1;
import java.util.Scanner;

public class question6 {
	static int calculateDifference(int n) {
		int a,b,c,d;
		a= (n*(n+1)*(2*n+1))/6;
		b=(n*(n+1))/2;
		c=b*b;
		d=Math.abs(a-c);

		return d;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		System.out.println(calculateDifference(n));
	}

}




