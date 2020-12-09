package com.design;

public class MessagePub1 implements Observer {

	@Override
	public void Update(Message message) {
		System.out.println("printing form publisher 1 : "+message.getMessageContent());

	}

}
