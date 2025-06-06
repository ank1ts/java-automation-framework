package basicCode;

public class star_Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
		
//		int i,j;
//		
//		for(i=1;i<=5;i++) {
//			for(j=1;j<=i;j++) {
//				System.out.print("*"); //print
//			}
//			System.out.println(); //println
//		}
//======================================================================
//		*****
//		****
//		***
//		**
//		*
		
//		int x,y;
//		for(x=1;x<=5;x++) {
//			for(y=5;y>=x;y--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//======================================================================
//print i for this pattern
//		1
//		22
//		333
//		4444
//		55555
//	print j for this pattern
//		1
//		12
//		123
//		1234
//		12345
		
		int i,j;
		
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
