package com.bf.management;


import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages ={"com.bf.management.controller","com.bf.management.entity","com.bf.management.service","com.bf.management.repository"})
public class AirlineManagementApplication {



	public static void main(String[] args) throws BeansException {

	ConfigurableApplicationContext ctx=SpringApplication.run(AirlineManagementApplication.class, args);

	System.out.println("eroor+++++++++++++++++++++++");


	//ctx.close();


}
}