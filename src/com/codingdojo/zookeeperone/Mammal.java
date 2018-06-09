package com.codingdojo.zookeeperone;

public class Mammal {
	private int energyLevel = 200;
	
	public int displayEnergy() {
		return this.energyLevel;
	}
	
	public int getEnergyLevel() {
		return this.energyLevel;
	}
	
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
