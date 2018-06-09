package com.codingdojo.zookeeperone;
public class Gorilla extends Mammal {
	public void throwSomething() {
		super.setEnergyLevel(super.getEnergyLevel()-5);
		System.out.println("I Throw!");
		System.out.println(displayEnergy());
	}
	
	public void climb() {
		super.setEnergyLevel(super.getEnergyLevel()-10);
		System.out.println("I Climb!");
		System.out.println(displayEnergy());
	}
	
	public void eatBananas() {
		System.out.println("I love Bananas!");
		super.setEnergyLevel(super.getEnergyLevel()+10);
		System.out.println(displayEnergy());
	}

}