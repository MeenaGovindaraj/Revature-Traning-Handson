package com.abstractdemo;

import com.animals.interfaces.Hippopotamus;

public abstract class Hippo extends Animal implements Hippopotamus{

	@Override
	public void makeNoise() {
		System.out.println("Hippo making a noise");
		
	}

	@Override
	public void eat() {
		System.out.println("Hippo eating");
	}
	
	@Override
	public void largestAnimal() {
		System.out.println("I am the hippopotamus,Second largest animal in world\n");
	}

	@Override
	public void roam() {
		System.out.println("---------------------Hippo Roaming---------------------");
		
	}
	}
	

