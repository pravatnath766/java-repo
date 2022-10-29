package inheritance.comjava;

import inheritance.B;

public class C extends B{
	void m3() {
		System.out.println("im m3 from C class ");
	}
	public static void main(String[] args) {
		C c=new C();
		c.m3();
	B b=new B();
		b.m2();
		b.m1();
		B obj=new C();
		
		
		
		 
	}

}
