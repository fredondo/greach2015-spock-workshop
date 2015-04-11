package org.startrek.solutions.n06;

import org.hamcrest.core.IsNot;
import org.startrek.*

import static org.startrek.Race.*
import spock.lang.*
import static spock.util.matcher.HamcrestSupport.*
import static org.hamcrest.Matchers.*


class MoviesSpec extends Specification{
	
	@Shared spock=Race.Vulcans 						//shared instance variables
	
	def "Star Trek III: The Search for Spock "(){
		expect: "spock always appears" 				//especification as documentation
			that spock, notNullValue() 				//hamcrest asserts
		}
	
	def "Star Trek V: The Final Frontier"(){
		given:
			isSpockInTheMovie() 					//helper methods
		when:
			def enterprise = new Spaceship()
		then:
			expect enterprise, is(Spaceship) 		//hamcrest asserts 
	}
	
	def isSpockInTheMovie(){ 						//helper methodw
		assert spock != null						//explicit conditions
	}
}

