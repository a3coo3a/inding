package com.itbank.java.exceptions;

// Exception : ����

class Calculator {
	int left, right;
	public void setOprands (int left, int right) {
		this.left = left;
		this.right = right;
	}
	// ���� : java.lang.ArithmeticException: / by zero
	public void divide() {
		try {
			System.out.println("�������");
			System.out.println(this.left/this.right);
			System.out.println("�Դϴ�");
		}catch(Exception e){	// �Ű������� ������ ���� ������ ��� �ִ� ��ü ����
			// ������ Ÿ���� Exception�̶�� Ŭ����
			System.out.println("�����߻�!! "+ e.getMessage());
			System.out.println("e.toString: "+e.toString());
			System.out.println("e.printStackTrace(): ");
			e.printStackTrace();
			
			// 1. e.getMessage() : / by zero
			// 2. e.toString() : java.lang.ArithmeticException: / by zero
			// 3. e.printStackTrace() 
			//    : java.lang.ArithmeticException: / by zero
			//		at com.itbank.java.exceptions.Calculator.divide(CalculatorDemo.java:15)
			//		at com.itbank.java.exceptions.CalculatorDemo.main(CalculatorDemo.java:31)
			
			// 1. ������ ���� �⺻���� ���, ������ ����
			// 2. ���ܻ�Ȳ�� ���� �� �� �ڼ��� ���� ��� (ArithmeticException: ������ �������� ����)
			// 3. ���ϰ��� ������ ����, ���� ��ü���� �������� ���� ���
		}
			
	}
}
public class CalculatorDemo {
	
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		c1.divide();
				
	}
	
}