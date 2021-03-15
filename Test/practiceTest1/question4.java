package practiceTest1;
import java.util.*;

public class question4
{
	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		String first=sc.next();
		String second=sc.next();
		String ans=new String();
		int fi=0;
		int si=0;
		while(fi<first.length() && si<second.length())
		{
		    ans+=Character.toString(first.charAt(fi));
		    ans+=Character.toString(second.charAt(si));
		    fi++;
		    si++;
		}
		
		while(fi<first.length())
		{
		    ans+=Character.toString(first.charAt(fi));
		    fi++;
		}
		
		while(si<second.length()){
		    ans+=Character.toString(second.charAt(si));
		    si++;
		}
		System.out.println(ans);
	}
}