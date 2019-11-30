package com.codingdojo.phone;

public interface Ringable {
	
	public default String ring() {
		return "Ting Ting";
	}
	public default String unlock() {
		return " Yehh ! -- Phone is Unlocked";
	}

}


// Interface can not be instantiated 