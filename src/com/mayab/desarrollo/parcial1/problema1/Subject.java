package com.mayab.desarrollo.parcial1.problema1;

public interface Subject {
	
	  	public void registerObserver(Observer obs);
	    public void removeObserver(Observer obs);
	    public void notifyObserver();
}
