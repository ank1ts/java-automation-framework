package basicCode;

public class reverseString {

	public static void main(String[] args) {
		String a = "INDIA";
		int len=a.length();
		String rev="";
		//String c;
		
		for(int i=len-1;i>=0;i--)
		{
			rev= rev+a.charAt(i);
			
		}
		System.out.println(rev);

	}	
}


