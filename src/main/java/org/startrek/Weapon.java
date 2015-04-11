package org.startrek;

public enum Weapon {
	
	Phaser_pulse(5), Antimatter_missile(25), Photonic_torpedo(50);
	
	int damage;
	
	Weapon(int damage) {
		this.damage = damage;
	}
	
	public int firedTo(String target) throws TargetDestroyedException{
		if("asteroid".equals(target)){
			throw new TargetDestroyedException("shattered!");
		}
		return damage;
	}
}
