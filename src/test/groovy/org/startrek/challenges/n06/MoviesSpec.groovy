package org.startrek.challenges.n06;

import org.hamcrest.core.IsNot;
import org.startrek.*

import static org.startrek.Race.*
import spock.lang.*
import static spock.util.matcher.HamcrestSupport.*
import static org.hamcrest.Matchers.*


class MoviesSpec extends Specification{
	
	@Shared spock=Race.Vulcans
	
	def "Star Trek III: The Search for Spock "(){
		expect: "spock always appears"
			that spock, notNullValue()
		}
	
	def "Star Trek V: The Final Frontier"(){
		given:
			isSpockInTheMovie()
		when:
			def enterprise = new Spaceship()
		then:
			expect enterprise, is(Spaceship) 
	}
	
	def isSpockInTheMovie(){
		assert spock != null
	}
}

