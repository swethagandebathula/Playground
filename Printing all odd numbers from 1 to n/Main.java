import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int temp=1;
      while(temp<=n)
      {
        if(temp%2==1)
        {
          System.out.println(temp);
        }
        temp=temp+1;
      }
	}
}