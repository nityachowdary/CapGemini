package module2;

public class question1 {
	public static int getSecondSmallest(int[]a,int length)
	{
	int temp,i,j;
	for(i=0;i<length;i++)
	{
	for(j=i+1;j<length;j++)
	{
	if(a[i]>a[j])
	         {
	           temp=a[i];
	           a[i]=a[j];
	           a[j]=temp;
	           
	        }

	}
	}
	return a[1]; //second element
	}
	public static void main(String[] args) {



  int a[]= {1,6,3};
  System.out.println("Second smallest: "+getSecondSmallest(a, 3));
  
}

}
