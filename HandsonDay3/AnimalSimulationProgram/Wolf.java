package com.abstractdemo;

public class Wolf extends Canine implements Sound{
	@Override
	public void makeNoise() {
		System.out.println("Wolf making a Noise");
	}

	@Override
	public void eat() {
		System.out.println("Wolf eating");
		
	}

	@Override
	public void sounds() {
		System.out.println("Wolf sounds like owooooo!!\n");
		
	}
}
