package com.design;

public class TestObserverPattern {
	
	
	
	public static void main(String [] args)
	{
		Message msg1=new Message();
		Message msg2=new Message();
		msg1.setMessageContent("first message");
		msg2.setMessageContent("second mesage");
		
		Observer ob1=new MessagePub1();
		Observer ob2=new MessagePub2();
		Observer ob3=new MessagePub3();
		SubjectImpl sub=new SubjectImpl();
		sub.attach(ob1);
		sub.attach(ob2);
		sub.notify(msg1);
		sub.detach(ob1);
		sub.attach(ob3);
		sub.notify(msg2);
		
		
		
	}

}
