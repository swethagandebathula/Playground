import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
  public static int sum(int num)
  {
    int sum=0;
    for(int i=1;i<=num;i++)
    {
      sum= sum + i;
    }
    return sum;
}
}