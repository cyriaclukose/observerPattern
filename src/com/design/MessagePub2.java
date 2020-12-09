package com.design;

public class MessagePub2 implements Observer {

	@Override
	public void Update(Message message) {
	
		System.out.println("printing from publisher 2 : "+message.getMessageContent());

	}

}
