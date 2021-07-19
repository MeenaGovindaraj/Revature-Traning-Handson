package com.animals.amp;

import com.abstractdemo.Animal;
import com.abstractdemo.Cat;
import com.abstractdemo.Dog;
import com.abstractdemo.Lion;
import com.abstractdemo.Tiger;
import com.abstractdemo.Wolf;
import com.animals.interfaces.Hippopotamus;
import com.animals.interfaces.Sound;

public class AMP {
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

		animal=new Dog();
		animal.roam();
		animal.makeNoise();
		animal.eat();
		
		animal=new Wolf();
		animal.makeNoise();
		animal.eat();
		s=new Wolf();
		s.sounds();
		
		
		System.out.println("-------------------Hippo fam---------------");
		Animal hip=new Animal()
				{

			@Override
			public void makeNoise() {
				System.out.println("Hippo making a noise");
				
			}

			@Override
			public void eat() {
				System.out.println("Hippo eating");
			}
			

			@Override
			public void roam() {
				System.out.println("---------------------Hippo Roaming---------------------");
				
			}
			
				};
				
				hip.eat();
				hip.makeNoise();
				hip.roam();
				
			Hippopotamus h=new Hippopotamus() {
				
				@Override
				public void largestAnimal() {
					System.out.println("I am the hippopotamus,Second largest animal in world\n");
				}
			};
			h.largestAnimal();
			
			animal.sleep();
			
	}
}
