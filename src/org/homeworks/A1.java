package org.homeworks;

public class A1 extends Abstract {
	public void january() {
		System.out.println("1st month");
	}

	public void february() {
		System.out.println("2nd month");
	}

	public void name(){
		System.out.println();
	}

	public static void main(String[] args) {
		A1 a = new A1();
		a.january();
		a.february();
	}
}
