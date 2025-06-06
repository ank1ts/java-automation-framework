package practice;

class keyword_practice {
	int i=10;
}
class keyword_practice_child extends  keyword_practice{
	int i=20;
	
	void show() {
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
}
public class super_this {
	
	public static void main(String[] args) {
		//line 18 = this keyword
		keyword_practice_child obj = new keyword_practice_child();
		obj.show();
	}

}
 
