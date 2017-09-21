package spring.choi.test3_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		/*myCalculator.setCalculator(new Calculator());
		// 직접 생성
		myCalculator.setFirstNum(10);
		myCalculator.setSecondNum(2);
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();*/
		
		// Spring DI 방식이 적용됨
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);
		// 외부(xml 파일)에서 만들어져서 옴
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();;
		myCalculator.div();
		
		ctx.close();
	}

}
