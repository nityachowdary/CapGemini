package module1;
import java.util.Scanner;
public class question2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("select a colour: ");
		String colour=sc.nextLine();
		switch(colour)
		{
		case "red": System.out.println("stop");
		break;
		case "yellow": System.out.println("ready");
		break;
		case "green": System.out.println("go");
		break;
		default: System.out.println("wrong colour selected");
		
		}
		
		
	}

}
