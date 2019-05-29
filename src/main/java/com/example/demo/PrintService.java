package com.example.demo;

import java.io.File;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

public class PrintService {

	public Message<String> print(Message<String> message) {
		System.out.println(message.getPayload());
		int messageNumber = (int) message.getHeaders().get("messageNumber");
		return MessageBuilder.withPayload("Sending a reply for message " + messageNumber).build();
	}
	
	public void printFile(File file) {
		System.out.println("File: " + file.getAbsolutePath());
	}
}
