package inheritance;

public class B extends A {
	public void m2() {
		System.out.println("im m2 from B");
	}
	public static void main(String[] args) {
		B b=new B();
		b.m2();
		//b.m1();
		A a=new A();
		a.m1();
		
		
	}
	
	

}
