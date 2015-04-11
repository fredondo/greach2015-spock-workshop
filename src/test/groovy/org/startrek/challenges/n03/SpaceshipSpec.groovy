package org.startrek.challenges.n03;

import org.startrek.Spaceship;
import spock.lang.Specification

class SpaceshipSpec extends Specification{

	def "fisrt shape of the feature"() {
		//implicit setup block
		def enterprise = new Spaceship()
		expect:
			enterprise != null
	}
	
	def "second shape of the feature"() {
		//TODO 3.1 use setup
	}
	
	def "third shape of the feature"() {
		//TODO 3.2 use given 
	}
	
	def "fouth shape of the feature"() {
		//TODO 3.3 use only expect 
	}
	
}

