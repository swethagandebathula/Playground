import java.util.Scanner;
class Main
{
  public static int square(int num)
  {
    int re = num*num;
    return re;
  }
	public static void main (String[] args)
    {
	 Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int result = square(n);
      System.out.println(result);
	} 
}