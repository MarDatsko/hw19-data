package com.example.enterprise;

import com.example.enterprise.controller.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EnterpriseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(EnterpriseApplication.class, args);

		Controller runProgramBean = run.getBean(Controller.class);
		runProgramBean.executeProgram();
	}



}
