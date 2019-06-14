import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in  = new Scanner(System.in);
        // Get the n value
	    int n = in.nextInt();
       int b=n;
	    for(int curr_row = 1; curr_row <= n; ++curr_row)
	    {
            // Handle space for each row
	       
            // Handle stars for each row
         
	        for(int curr_col = b; curr_col >= 1; --curr_col)
	        {
	            System.out.print(curr_col);
              
	        }
          b--;
	        System.out.println();
	    }
	}
}