package practiceTest1;
import java.util.*;
public class question5 {

	public static void main(String[] args) {
		
		
	
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.nextLine();
        int n=sc.nextInt();
        System.out.println(readEnd(str,n));
	}
	
	public static String readEnd(String str,int n){
	    String ans=new String();
	    String temp=new String();
	    for(int i=str.length()-1,j=0;j<=n && i>=0;j++,i--)
	    {
	        temp+=new String(str.charAt(i));
	    }
	    
	    for(int i=0;i<n;i++)
	    {
	        ans+=temp;
	    }
	    return ans;
	}
	
}