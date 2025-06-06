package practice;

public class euqals_method {

	public static void main(String[] args) {

		String s1="welcome";
		String s2 = "welcome";
		System.out.println(s1==s2); // match the refrence
		System.out.println(s1.equals(s2)); //match the content
		
		//use new keyword and create 2 objects.
		//when we create new objects and compare == then it compare both objects with its name.
		String m1 = new String("hello");
		String m2 = new String("hello");
		System.out.println(m1==m2);
		System.out.println(m1.equals(m2));

	}

}
