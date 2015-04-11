package org.startrek.solutions.n05;

import org.startrek.*;
import spock.lang.Specification


class ShipManagamentSpec extends Specification{
	
	def "interactions with the Spaceship"() {
		given:
			def enterprise=Mock(Spaceship)
			Spaceship saratoga=Mock()
		when:
			enterprise.ignition()
			saratoga.ignition()
			saratoga.speedUp()
			saratoga.slowDown()
			saratoga.speedUp()
			saratoga.slowDown()
		then:
			1 * enterprise.ignition()      	// exactly one call
			0 * enterprise.speedUp()      	// zero calls
			(1..3) * saratoga.speedUp() 	// between one and three calls (inclusive)
			(1.._) * saratoga.slowDown() 	// at least one call
			(_..3) * saratoga.slowDown() 	// at most three calls
		}
	
}

