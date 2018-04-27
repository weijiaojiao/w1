package com.ning.test;

public class LeiSingleton {
	
	private LeiSingleton(){
		System.out.println("LeiSingleton....");
	}
	
	public static class Singleton{
		private static LeiSingleton instance = new LeiSingleton();
	}
	
	private static synchronized LeiSingleton getInstance() {
		return Singleton.instance;
	}
	
	public static void main(String[] args) {
		LeiSingleton.getInstance();
	}

}
