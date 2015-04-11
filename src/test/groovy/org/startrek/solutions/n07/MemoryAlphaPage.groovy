package org.startrek.solutions.n07

import geb.Page

class MemoryAlphaPage extends Page{
		
		static url = "http://en.memory-alpha.org/wiki/Portal:Main"
	
		static at = {
			title == 'Memory Alpha - The Star Trek Wiki'
		}
	
		static content = {
			searchBox { $("input", name: "search") }
			searchButton { $("form input", 1) }
		}
}


