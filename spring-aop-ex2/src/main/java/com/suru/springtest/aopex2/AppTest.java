package com.suru.springtest.aopex2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suru.springtest.aopex2.model.Camera;

public class AppTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/suru/springtest/aopex2/beans.xml");
		
		Camera bean = context.getBean("camera", Camera.class);
		bean.snap();
		
		context.close();
	}

}