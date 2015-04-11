package org.startrek.challenges.n05;

import org.startrek.*;
import spock.lang.Specification


class ShipManagamentSpec extends Specification{
	
	def "interactions with the space ships"() {
		//given:
			//Mock enterprise and saratoga space ships 
		//when:
			//interact with the ships
			enterprise.ignition()
			saratoga.ignition()
			saratoga.speedUp()
			saratoga.slowDown()
			saratoga.speedUp()
			saratoga.slowDown()
		//then:
			//verify the following interactions
			// exactly one call to enterprise.ignition
			// zero calls to enterprise.speedUp
			// between one and three calls (inclusive) to saratoga.speedUp
			// at least one call to saratoga.slowDown
			// at most three calls to satoga.slowDown
		}
	
}

