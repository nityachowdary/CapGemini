package module2;

public class question4 {
private static final String[] a = null;
public static int modifyArray(int[]a,int n)
{
if(n==0 || n==1){
return n;
}
int j = 0;//for next element
for (int i=0; i < n-1; i++){
if (a[i] != a[i+1]){
a[j++] = a[i];
}
}
a[j++] = a[n-1];
return j;
}

public static void main(String[] args) {
int temp;

int a[] = {1,1,5,5,5,8,9};
int length = a.length;
length = modifyArray(a, length);
//printing array elements
for(int i=0; i<length; i++)
System.out.print(a[i]+" ");
}
}
