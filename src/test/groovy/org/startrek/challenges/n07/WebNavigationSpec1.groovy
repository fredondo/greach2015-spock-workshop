package org.startrek.challenges.n07;

import geb.spock.GebSpec

class WebNavigationSpec1 extends GebSpec {
  def "go to memory-alpha page"() {
	  given:
	  		go "http://en.memory-alpha.org/wiki/Portal:Main"
      when:
	  		// make sure we actually got to the page
	  		assert title == "Memory Alpha - The Star Trek Wiki"

			// enter data into the search field
			$("input", name: "search").value("spock")
			//click the submit button
			$("form input", 1).click()
	
			//wait for page to change
			waitFor {
				 title == "Search results for 'Spock' - Memory Alpha - Memory Alpha, the Star Trek Wiki" }
	  then:
	  		//expect 3600 results
	  		$("p.result-count").text().startsWith("About 3,600 results")
  }
}

