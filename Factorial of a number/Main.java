import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int i=1,sum=1;
      while(i<=num)
      {
        sum=sum*i;
        i++;
      }
      System.out.println(sum);
	}
}