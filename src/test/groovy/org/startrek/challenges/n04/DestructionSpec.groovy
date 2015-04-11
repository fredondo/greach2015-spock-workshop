package org.startrek.challenges.n04;

import org.startrek.*;
import static org.startrek.Weapon.*
import spock.lang.Specification

class DestructionSpec extends Specification{
	
	def "the target is destroyed"() {
		//TODO 4.1 write the feature
		//stimulus
			//a photonic torpedo is fired to an asteroid
		//response
			//the asteroid is destroyed firing TargetDestroyedException
	}
	
	def "the target is not destroyed"() {
		//TODO 4.2 write the feature
		//stimulus
			//a photonic torpedo is fired to an planet
		//response
			//the planet is NOT destroyed firing TargetDestroyedException

	}

}
