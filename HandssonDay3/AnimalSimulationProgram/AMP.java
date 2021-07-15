package com.animals.amp;

import com.abstractdemo.Animal;
import com.abstractdemo.Cat;
import com.abstractdemo.Dog;
import com.abstractdemo.Lion;
import com.abstractdemo.Tiger;
import com.abstractdemo.Wolf;
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
		
		animal.sleep();
		
	}
}
