package spring.choi.test3;


/**
 * 스프링이 적용되지 않은 예
 *
 */

public class MainClass {

	public static void main(String[] args) {
		
		MyCalculator myCalculator = new MyCalculator();
		// 직접 생성하는 방식은 좋지 않음
		// MyCalculator가 변경되야 하는 경우 코드를 직접 변경해야 하는 경우 발생
		myCalculator.setCalculator(new Calculator());
		
		myCalculator.setFirstNum(10);
		myCalculator.setSecondNum(2);
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();
	}

}
