import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    
      Scanner sc =new Scanner(System.in);
      int n = sc.nextInt();
      int min=1;
      for(int i=1;i<=n;i++)
      {
        for(int space=n-1;space>=i;space--)
        {
          System.out.print(" ");
        }
        for(int j=0;j<min;j++)
        {
          System.out.print("*");
        }
        min+=2;
        System.out.print("\n");
      }
	}
}