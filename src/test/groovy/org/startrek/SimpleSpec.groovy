
import spock.lang.Specification

class SimpleSpec extends Specification{

	def "test logic values"() {
		expect:
			true != false
	}
	
}

