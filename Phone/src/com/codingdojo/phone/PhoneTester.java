package com.codingdojo.phone;

public class PhoneTester {
	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("S9", 99, "Verizon", "Ring RIng Ring!");
		IPhone iPhoneX = new IPhone("X", 11, "AT&T", "Tang Tong Tanog!");
		
		s9.displayInfo();
		System.out.println("SAmsumg Galaxy S9 Says " + s9.ring());
		System.out.println(s9.unlock());
		
		iPhoneX.displayInfo();
		System.out.println("Iphone X says " + iPhoneX.ring());
		System.out.println(iPhoneX.unlock());
	}

}
