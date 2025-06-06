package practice;

class a{
	public void m1() {
		System.out.println("class a");
	}
}
class b extends a{
	public void m1() {
		System.out.println("class b");
	}
}

class c extends b {
	public static void main(String[] args) {
		
		b obj = new b();
		obj.m1();
	}
	
}


