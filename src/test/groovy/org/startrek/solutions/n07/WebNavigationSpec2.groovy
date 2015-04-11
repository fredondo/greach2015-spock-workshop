package org.startrek.solutions.n07;

import geb.spock.GebSpec
 
class WebNavigationSpec2 extends GebSpec {
	def "search in google for star trek stuff"() {
		when:
			to MemoryAlphaPage		 
		then:
			at MemoryAlphaPage
		when:
			searchBox.value("spock")
			searchButton.click()
		then:
			waitFor { at MemoryAlphaResultsPage  }
			results.startsWith("About 3,600 results")
			
	}
}

