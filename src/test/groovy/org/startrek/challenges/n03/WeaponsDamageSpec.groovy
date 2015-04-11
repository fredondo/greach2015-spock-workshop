package org.startrek.challenges.n03;

import spock.lang.Specification
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
		//expect:
			//weapon.firedTo(target) == damage
		//where:
			//todo 3.4 create the data provider with the colum syntax "|"
	}
	
	//todo 3.5 create the same method with data provider variable unrolling

}

