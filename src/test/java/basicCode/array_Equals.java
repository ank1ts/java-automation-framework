package basicCode;

import java.util.Arrays;

public class array_Equals {

	public static void main(String[] args) {
		int a[]= {1,3,5,7,8};
		int b[]= {1,3,5,7,8};
		
//		boolean status=Arrays.equals(a,b);
//		if (status==true) {
//			System.out.println("Equals");
//		}
//		else {
//			System.out.println("not Equals");
//			 }
		
		int l1=a.length;
		int l2=b.length;
		
		boolean flag=true;
		if(l1==l2)
		{
			for(int i=0;i<l1;i++)
			{
				if(a[i] != b[i]) 
				{
					flag=false;
					break;
				}
			}
			
			if(flag==true) {
				System.out.println("equals");
				}
				else {
					System.out.println("not euqals"); }
			}
		}	
	
	}

	

