import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a=n%10;
    int c=a*100;
    int x=n/10;
    int b=x%10;
    
    int d=b*10;
    int y=n/100;
    int sum=c+d+y;
    System.out.println(sum);
    
  }
}