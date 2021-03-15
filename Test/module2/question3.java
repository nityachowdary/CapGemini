package module2;

public class question3 {


static void getSorted(int a[], int n) 
   { 
       int i, k, t; 
       for (i = 0; i < n / 2; i++) { 
           t = a[i]; 
           a[i] = a[n - i - 1]; 
           a[n - i - 1] = t; 
       } 
 
      System.out.println("Reversed array is: \n"); //reversed array
       for (k = 0; k < n; k++) { 
           System.out.println(a[k]); 
       } 
   } 
 
   public static void main(String[] args) 
   { 
       int [] arr = {25,35,45,55,65}; 
       getSorted(arr, arr.length); 
   } 


}
