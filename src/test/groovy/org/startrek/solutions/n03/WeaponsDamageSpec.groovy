package org.startrek.solutions.n03;

import spock.lang.Specification
import spock.lang.Unroll
import static org.startrek.Weapon.*


class WeaponsDamageSpec extends Specification{	
	//data driven feature methods
	def "verify the damage produced by a weapon on a target (row syntax)"() {
		expect:
			weapon.firedTo(target) == damage
		where:
			weapon << [Phaser_pulse, Antimatter_missile, Photonic_torpedo]
			target << ["Planet", "Spaceship", "Spaceshuttle"]
			damage << [5, 25, 50]
	}
	
	def "verify the damage produced by a weapon on a target (column syntax)"() {
		expect:
			weapon.firedTo(target) == damage
		where:
			weapon 				| target 		 | damage
			Phaser_pulse		| "Planet"		 | 5
			Antimatter_missile	| "Spaceship"	 | 25
			Photonic_torpedo	| "Spaceshuttle" | 50
	}
	
	@Unroll
	def "verify the damage produced by a #weapon on a #target is #damage (column syntax with unrolling)"() {
		expect:
			weapon.firedTo(target) == damage
		where:
			weapon 				| target 		 | damage
			Phaser_pulse		| "Planet"		 | 5
			Antimatter_missile	| "Spaceship"	 | 25
			Photonic_torpedo	| "Spaceshuttle" | 50
	}
	
}

