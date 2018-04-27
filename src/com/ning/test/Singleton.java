package com.ning.test;

public class Singleton {
	
	//private static Singleton instance = new Singleton();
	private static Singleton instance = null;
	private Singleton(){
		
		System.out.println("Singleton. e han");
		
	}
	public static Singleton getInstance(){
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	private static void createString() {
		System.out.println("createString");
	}

	public static void main(String[] args) {
		Singleton.getInstance();
		Singleton.createString();
	}
}
