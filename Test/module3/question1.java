package module3;
import java.util.*;
public class question1 {

	public static void main(String[] args) {
		
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens())
        {
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum = sum + n;
        }
        System.out.println("sum of the numbers is: " + sum);
        sc.close();
    }
}