import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int n = in.nextInt();
      int i,j;
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=i;j++)
        {
          if(i==1 && j==1)
          System.out.print("*");
          else if(i==2 && j==2)
            System.out.print("*");
            else if(i==3 && j==2)
              System.out.print("*");
              else if(i==4 && j==1)
                System.out.print("*");
          else if(i==4 && j==3)
            System.out.print("*");
          else if(i==5 && j==1)
            System.out.print("*");
          else if(i==5 && j==3)
            System.out.print("*");
          else if(i==5 && j==5)
            System.out.print("*");
          else if(i==6 && j==2)
            System.out.print("*");
          else if(i==6 && j==4)
            System.out.print("*");
          else if(i==6 && j==6)
            System.out.print("*");
          else
            System.out.print("#");
        }
        System.out.print("\n"); 
    }
}
}