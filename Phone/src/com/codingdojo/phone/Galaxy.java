package com.codingdojo.phone;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
       String ringer = getRingTone();
       return ringer;
    }
    @Override
    public String unlock() {
    	return " Your Phone is Unlocked by FingerPrint";
    }
    @Override
    public void displayInfo() {
        System.out.println("Galaxy " + getVersionNumber() + " from " + getCarrier());          
    }
}

//In any object-oriented programming language, Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.
//When a method in a subclass has the same name, same parameters or signature and same return type(or sub-type) as a method in its super-class, 
//then the method in the subclass is said to override the method in the super-class.
