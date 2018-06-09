package com.codingdojo.zookeeperone;

public class Bat extends Mammal {
	protected Bat(){
		super.setEnergyLevel(super.getEnergyLevel()+100);
	}
	public void fly() {
		super.setEnergyLevel(super.getEnergyLevel()-50);
		System.out.println("I Fly!");
		System.out.println(displayEnergy());
	}
	public void eatHumans() {
		System.out.println("I love Humans!");
		super.setEnergyLevel(super.getEnergyLevel()+25);
		System.out.println(displayEnergy());
	}
	public void attackTown() {
		super.setEnergyLevel(super.getEnergyLevel()-100);
		System.out.println("I Throw!");
		System.out.println(displayEnergy());
	}
}
