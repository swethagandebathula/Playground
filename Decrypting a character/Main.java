import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    char ch = in . next().charAt(0);
    int key = in.nextInt();
    if(ch >= 'a' && ch <= 'z'){
      int offset = (ch - key)%26;
      ch = (char)(offset + 'h');
    }
    else if(ch >= 'A' && ch <= 'Z'){
      int offset = (ch - key)%26;
      ch = (char)(offset + 'N');
    }
    System.out.print(ch);
  }
}