package org.startrek.solutions.n04;

import org.startrek.*;
import static org.startrek.Weapon.*
import spock.lang.Specification


class DestructionSpec extends Specification{
	
	def "the target is destroyed"() {
		def starfleet
		when:
			Photonic_torpedo.firedTo("asteroid")
		then:
			// exception condition
			thrown(TargetDestroyedException)
			//or
			//def ex=thrown(TargetDestroyedException)
			//or
			//TargetDestroyedException ex=thrown()
			//ex.msg = "shatered"
	}
	
	def "the target is not destroyed"() {
		when:
			Photonic_torpedo.firedTo("planet")
		then:
			notThrown(TargetDestroyedException)
	}
	
}

