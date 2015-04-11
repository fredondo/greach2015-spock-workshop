package org.startrek.solutions.n07

import geb.Page

class MemoryAlphaResultsPage extends  Page {
	   
	
		static at = {
			title == 
				"Search results for 'Spock' - Memory Alpha - Memory Alpha, the Star Trek Wiki"
		}
	
		static content = {
			results { $("p.result-count").text()}
		}
}

