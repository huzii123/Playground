import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=0,a=0;
      while(n>0)
      {
       a=n%10;
        sum=sum+a;
        n=n/10;
        
      }
      System.out.println(sum);
	}
}