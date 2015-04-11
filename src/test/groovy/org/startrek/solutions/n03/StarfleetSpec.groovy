package org.startrek.solutions.n03;

import org.startrek.Spaceship;
import spock.lang.Specification

class StarfleetSpec extends Specification{
	def "add ships to starfleet"() {
		//implicit setup block
		def starfleet = []
		//stimulus
		when:
			def enterprise = new Spaceship()
			starfleet << enterprise
			def saratoga = new Spaceship()
			starfleet << saratoga
		//response
		then:
			starfleet.size() == 2
			starfleet.containsAll(enterprise,saratoga)
	}
	
}

