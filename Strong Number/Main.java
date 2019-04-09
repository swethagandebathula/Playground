import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc= new Scanner(System.in);
      int num =sc.nextInt();
      int Sum = 0, i, Factorial,Temp,Reminder;
      Temp=num;
    while( Temp > 0)
		{
			Factorial = 1; 
			i = 1; 
		    Reminder = Temp % 10;
		    while (i <= Reminder)
		    {
		     	Factorial = Factorial * i;
		     	i++;
		    }  
      Sum = Sum + Factorial;
		     Temp = Temp /10;
    }
      if ( num == Sum )
		{
			System.out.println("Yes");
		}
		else
		{
		   System.out.println("No");
		}
    }
}