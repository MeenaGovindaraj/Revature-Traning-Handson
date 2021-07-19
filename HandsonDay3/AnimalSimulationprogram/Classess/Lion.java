package com.abstractdemo;

import com.animals.interfaces.Sound;

public class Lion extends Feline implements King,Sound{

	@Override
	public void makeNoise() {
		System.out.println("Lion making a noise");
		
	}

	@Override
	public void eat() {
		System.out.println("Lion eating");
		
	}

	@Override
	public void forestKing() {
		System.out.println("I am the Lion , THE KING OF THE FOREST");;
		
	}

	@Override
	public void sounds() {
		System.out.println("Lion sounds like roar, growl\n");
		
	}

}
