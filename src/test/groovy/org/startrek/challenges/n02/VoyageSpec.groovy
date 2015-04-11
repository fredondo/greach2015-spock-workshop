package org.startrek.challenges.n02;

import spock.lang.Specification;

class VoyageSpec extends Specification{
	
	//TODO 2.1 create one each kind of fixture method	
	//fixture methods
	//write them here
	
	//feature methods for one interstellar voyage
	def "depart from earth"() {
		expect:
			println "the mission starts..."
	}
	
	def "arrive to a mysterious planet"() {
		expect:
			println "some incredible adventure..."
	}
	
	def "happy ending"() {
		expect:
			println "the adventure ends well."
	}

}
