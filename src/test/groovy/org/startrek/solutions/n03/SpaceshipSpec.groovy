package org.startrek.solutions.n03;

import org.startrek.Race;
import org.startrek.Spaceship;
import org.startrek.Weapon;

import spock.lang.Specification
import static org.startrek.Race.*
import static org.startrek.Weapon.*


class SpaceshipSpec extends Specification{

	def "fisrt shape of the feature"() {
		//implicit setup block
		def enterprise = new Spaceship()
		expect:
			enterprise != null
	}
	
	def "second shape of the feature"() {
		setup:
			def enterprise = new Spaceship()
		expect:
			enterprise != null
	}
	
	def "third shape of the feature"() {
		given:
			def enterprise = new Spaceship()
		expect:
			enterprise != null
	}
	
	def "fouth shape of the feature"() {
		expect:
			def enterprise = new Spaceship()
			enterprise != null
	}
	
}

