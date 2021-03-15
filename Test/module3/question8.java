package module3;
import java.util.Arrays;
import java.util.Scanner;
public class question8 {
	static boolean isAlphabeticalOrder(String s)
	{
	 int n = s.length();  
	       char c[] = new char [n];
	       for (int i = 0; i < n; i++) {  
	           c[i] = s.charAt(i);  
	       }
	Arrays.sort(c);

	for (int i1 = 0; i1 < n; i1++)  
	         if (c[i1] != s.charAt(i1))  
	             return false;  
	            
	     return true;  
	       }
	      





   public static void main(String args[])
{
 System.out.println("Enter the string: ");
   Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       if (isAlphabeticalOrder(s))  
          System.out.println("True");  
       else
           System.out.println("False");  
     }
}
