package org.homeworks;

public class Inta1 implements Interface {

	
	public void one() {
		System.out.println("ten");
	}

	public void two() {
		System.out.println("twenty");
	}
public static void main(String[] args) {
	Inta1 d  = new Inta1();
	d.one();
	d.two();
}
}
