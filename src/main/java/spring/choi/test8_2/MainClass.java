package spring.choi.test8_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX8_2.xml");
		
		AdminConnection connection = ctx.getBean("adminConnection", AdminConnection.class);
		
		System.out.println("adminID : " + connection.getAdminId());
		System.out.println("adminPW : " + connection.getAdminPw());
		System.out.println("sub_adminID : " + connection.getSub_adminId());
		System.out.println("sub_adminPW : " + connection.getSub_adminPw());

	}

}