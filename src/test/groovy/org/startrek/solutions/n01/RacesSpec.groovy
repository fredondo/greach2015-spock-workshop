package org.startrek.solutions.n01;

import spock.lang.Specification
import static org.startrek.Race.*


//our first Spec
class RacesSpec extends Specification{
	
	//feature method
	def "compare two diferent races"() {
		expect:
			Humans != Klingons
	}
	
	def "compare three diferent races"() {
		expect:
			Humans != Klingons 
			Humans != Vulcans
			Vulcans != Klingons
	}
}
