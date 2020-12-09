package com.design;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl  implements Subject{
	
	
	List <Observer> observers=new ArrayList<>();

	@Override
	public void attach(Observer o) {
		
		observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notify(Message m) {
		
		for(Observer o:observers)
		{
			o.Update(m);
		}
		
	}

}
