package basicCode;

public class repeatation_Number {

	public static void main(String[] args) {
		
		// number provided is 10. check the repeatation of this number
		
		int a[]= {100,200,10,20,10,30};
		
		int num = 10;
		int count= 0;
		int len=a.length;
		
		
		for(int i=0;i<=len-1;i++) {
			if(num==a[i]) {
				count++;
			}
		}
		
		System.out.println(count);
		
		

	}

}
