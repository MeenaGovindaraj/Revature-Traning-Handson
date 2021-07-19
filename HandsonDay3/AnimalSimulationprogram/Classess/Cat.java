package com.abstractdemo;

import com.animals.interfaces.Sound;

public class Cat extends Feline implements Sound{

	@Override
	public void makeNoise() {
		System.out.println("Cat making a noise");
		
	}

	@Override
	public void eat() {
		System.out.println("Cat eating");
		
	}

	@Override
	public void sounds() {
		System.out.println("cat sounds like Meoww Meoww!!\n");
	}

}
