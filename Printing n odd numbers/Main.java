import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc= new Scanner (System.in);
      int n= sc.nextInt();
      for(int j=1,i=1;j<=n;i=i+2,j++)
	{
		System.out.println(i);
	}
	}
}