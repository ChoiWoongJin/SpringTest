package spring.choi.test;

public class Calculation {
	private int firstNum;
	private int secondNum;
	
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public void add() {
		System.out.println("add");
		int result = firstNum + secondNum;
		System.out.println(firstNum + " + " + secondNum + " = " + result);
	}
	
	public void sub() {
		System.out.println("sub");
		int result = firstNum - secondNum;
		System.out.println(firstNum + " - " + secondNum + " = " + result);
	}
	
	public void multi() {
		System.out.println("multi");
		int result = firstNum * secondNum;
		System.out.println(firstNum + " * " + secondNum + " = " + result);
	}
	
	public void div() {
		System.out.println("div");
		int result = firstNum / secondNum;
		System.out.println(firstNum + " / " + secondNum + " = " + result);
	}
}
