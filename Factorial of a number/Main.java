

import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int number=in.nextInt();
      int m=1;
      for(int i = 1; i <= number; ++i)
              m=m*i;
                System.out.println(m);
            }
	
}
