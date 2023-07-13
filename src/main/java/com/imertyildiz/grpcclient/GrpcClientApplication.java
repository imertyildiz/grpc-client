package com.imertyildiz.grpcclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.imertyildiz.grpcclient.Service.ClientClient;

@SpringBootApplication
public class GrpcClientApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(GrpcClientApplication.class, args);
		ClientClient greeterClientService = applicationContext.getBean(ClientClient.class);
		greeterClientService.sayHello("Client", "Hello Server !!!");
	}
}