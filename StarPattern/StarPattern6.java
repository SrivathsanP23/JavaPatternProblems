public class StarPattern6{
	
	/*
	
	 *********
      *******
       *****
        ***
         *
         *
        ***
       *****
      *******
     *********

	
	*/
	
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){    //increasing
  				System.out.print(" ");
			}
			for(int j=5;j>=i;j--){ //decreasing
				 System.out.print("*");
			}
			for(int j=5;j>=i+1;j--){ //decreasing
				 System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--){    //decreasing`
				System.out.print(" ");
			}
			for(int j=1;j<=i-1;j++){   //decreasing
				System.out.print("*");
			}
			for(int j=1;j<=i;j++){   //decreasing
				System.out.print("*");
			}
			
			
			System.out.println();
		}
	}
}