package com.example.Code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);
		// DI : dependency injection
//		Outfit outfit = new Bikini();
//
//		Girl girl = new Girl(outfit);
//		girl.wear();

		// IOC đang quản lý Class Bikini
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//
//		Outfit outfit = context.getBean(Bikini.class);
//		outfit.wear();

		//

		Girl girl = context.getBean(Girl.class);

		girl.wear();
	}

}
