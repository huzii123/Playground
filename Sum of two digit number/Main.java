import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int b=a%10;
      int c=a/10;
      int sum=b+c;
      System.out.println(sum);
	}
}