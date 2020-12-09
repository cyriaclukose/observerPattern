package com.design;

public class MessagePub3 implements Observer {

	@Override
	public void Update(Message message) {
		
		System.out.println("printing from publisher 3 : "+message.getMessageContent());


	}

}
