package com.abstractdemo;

public class Dog extends Canine{
	@Override
	public void makeNoise() {
		System.out.println("Dog making a noise");
		
	}

	@Override
	public void eat() {
		System.out.println("Dog eating\n");
		
	}
}
