package com.xworkz.camera;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TesterCamera {

			public static void main(String[] args) {

				String springConfigFile = "cctv.xml";

				ApplicationContext springContiner = new ClassPathXmlApplicationContext(springConfigFile);

				System.out.println("springContiner is created..!!!!! " + springContiner.hashCode());

				Camera camera = springContiner.getBean(Camera.class);
				System.out.println(camera);

}
}
