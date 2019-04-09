import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3= sc.nextInt();
      int result = greatest(n1,n2,n3);
      System.out.println(result);
	}
  public static int greatest(int x1,int x2,int x3)
  {
  if(x2<x1)
  {
    if(x3<x1)
    {
      return x1;
    }
  }
    else if(x1<x2)
    {
      if(x3<x2)
      {
        return x2;
      }
    }
    else if(x1<x3)
    {
      if(x2<x3)
      {
        return x3;
      }
    }
    return x1;
  }
}