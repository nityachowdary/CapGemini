package module3;
import java.util.*;
public class question2 {

	public static void main(String[] args) {
		
		String a = "EARTH";
		Stack stack = new Stack();
		StringTokenizer tempStringTokenizer = new StringTokenizer(a);
		while (tempStringTokenizer.hasMoreTokens()) {
			stack.push(tempStringTokenizer.nextElement());
			}

			System.out.println("\nOriginal string: " + a);

			System.out.print("Reverse string: ");
			while(!stack.empty()) {
				System.out.print(stack.pop());
				System.out.print(" ");
				}

				System.out.println("\n");
				}
		
	}




