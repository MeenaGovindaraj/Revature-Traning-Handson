package com.abstractdemo;

import com.animals.interfaces.Sound;

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
	
	
}
