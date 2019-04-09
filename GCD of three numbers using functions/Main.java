import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	   Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();
      int hcfOfNumbers = hcf(n1, n2, n3);
      System.out.println(hcfOfNumbers);
	}
    public static int hcf(int a, int b) {
		if (b == 0)
			return a;
		else
			return hcf(b, a % b);
    }
    public static int hcf(int a, int b, int c) {

		return hcf(hcf(a, b), c);

	}
  }