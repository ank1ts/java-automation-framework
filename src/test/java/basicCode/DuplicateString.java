package basicCode;

public class DuplicateString {

	public static void main(String[] args) {
		String a[]= {"java","C","python","java","C"};
		int i,j;
		int len=a.length;
		
		for(i=0; i<len; i++)
		{
			for(j=i+1; j<len; j++)
			{
				if (a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
			
		}
		


		}

	}

