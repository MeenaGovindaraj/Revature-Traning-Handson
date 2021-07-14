package com.abstractdemo;

public abstract class Animal {
	String picture="";
	String foode="";
	String hunger="";
	String boundaries="";
	String location="";
	
	public abstract void makeNoise();
	public abstract void eat();
	public abstract void roam();
	
	public void sleep()
	{
		System.out.println("Animals Sleeping");
	}
	
	public static void main(String[] args) {
	    Animal animal=new Lion();
		animal.roam();
		animal.makeNoise();
		animal.eat();
		Sound s=new Lion();
		s.sounds();
		
		animal=new Tiger();
		animal.makeNoise();
		animal.eat();
		
		animal=new Cat();
		animal.makeNoise();
		animal.eat();
		s=new Cat();
		s.sounds();
		
		animal=new Hippo();
		animal.roam();
		animal.makeNoise();
		animal.eat();
		Hippopotamus h=new Hippo();
		h.largestAnimal();
		animal=new Dog();
		animal.roam();
		animal.makeNoise();
		animal.eat();
		
		animal=new Wolf();
		animal.makeNoise();
		animal.eat();
		s=new Wolf();
		s.sounds();
		
		animal.sleep();
		
	}
}
