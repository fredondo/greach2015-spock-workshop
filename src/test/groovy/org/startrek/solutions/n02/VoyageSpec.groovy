package org.startrek.solutions.n02;

import spock.lang.Specification;

class VoyageSpec extends Specification{
	
	//fixture methods
	def setup(){
		println "run before every feature method"
	}
	
	def cleanup(){
		println "run after every feature method"
	}
	
	def setupSpec(){
		println "run before first feature method"
	}
	
	def cleanupSpec(){
		print "run after las feature method"
	}
	
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
