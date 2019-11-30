package com.codingdojo.phone;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	String ringer = getRingTone();
		return ringer;
    }
    @Override
    public String unlock() {
		return "Unlocked via facial recognition.";
    }
    @Override
    public void displayInfo() {
    	System.out.println("IPhone " + getVersionNumber() + " from " + getCarrier() + " has " + getBatteryPercentage() + "% battery.");          
    }
}

// In any object-oriented programming language, Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.
//When a method in a subclass has the same name, same parameters or signature and same return type(or sub-type) as a method in its super-class, 
//then the method in the subclass is said to override the method in the super-class.
