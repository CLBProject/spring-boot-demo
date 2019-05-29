package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

@SpringBootApplication
@Configuration
@ImportResource("integration-context.xml")
public class SpringBootDemoApplication implements ApplicationRunner{

	
	//@Autowired
	//private PrinterGateway gateway;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		/*List<Future<Message<String>>> futures = new ArrayList<Future<Message<String>>>();
		
		for(int x=0;x<10;x++) {
			Message<String> message = MessageBuilder.withPayload("Printing message payload for " + x).setHeader("messageNumber", x).build();
			System.out.println("Sending message " + x);
			futures.add(this.gateway.print(message));
		}
		
		for(Future<Message<String>> future: futures) {
			System.out.println(future.get().getPayload());
		}*/
	}

}
