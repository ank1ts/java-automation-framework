package basicCode;

public class max_Min {

	public static void main(String[] args) {
		int a[]= {111,2,4,66,7,30};
		int len=a.length;
		int max=a[0];
		
		for(int i=1;i<len;i++) {
			
				if(a[i]>max)
				{
				max=a[i];
				System.out.println("mx num ="+a[i]);
				}				
			}
		
		System.out.println("mx num= "+a[0]);
	}

}
