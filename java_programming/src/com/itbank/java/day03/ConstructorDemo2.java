package com.itbank.java.day03;

class Calculator2 {
	int left, right;
	
	public Calculator2() {}
	
	public Calculator2(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	/*	public void setOprands(int left, int right) {
			this.left = left;
			this.right = right;
		}*/
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	
}
class AddSubstractCalculator2 extends Calculator2{
	public AddSubstractCalculator2 (int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void substract() {
		System.out.println(this.left - this.right);
	}
}


public class ConstructorDemo2 {

	public static void main(String[] args) {
		AddSubstractCalculator2 c = new AddSubstractCalculator2(10, 20);
		// setOprands 메소드 없어도 생성자의 초기화를 통해 진행가능
		c.sum();
		c.avg();
		c.substract();
		
		// error
		// Implicit super constructor Calculator2() is undefined.
		// 암시적으로 부모클래스에 Calculator2()라는 생성자가 정의 되어 있지 않다.
		// Must explicitly invoke another constructor
		// 명시적으로 생성자를 정의해 주어야만 한다.
		
		// 자식클래스를 인스턴스화시키면, 자식클래스의 생성자를 호출하기 전에 부모클래스의 생성자를 자동으로 호출한다.
		// 부모클래스가 기본생성자가 아닌 생성자를 명시적으로 정의해 두었다면,
		// 기본생성자가 생성되지 않기 때문에 에러가 발생
		
		// 간단한 해결?
		// 부모클래스에 기본 생성자를 직접 정의해 주어야 함.
		// public Calculator2() {}
		
	}

}
