## VenueFinderApplication
### Summary
It is a web appliaction to display JSON result from Foursquare API.
### Prerequisite
  - Windows 7

  - Java 8

  - Eclipse Mars Java EE Developer

  - Tomcat 7 
	
  - Spring 4.2.5

  - JUnit 4.8.2

### How the appliaction works

After entering a name in search box and clicking on search button, "name" parameter is passed as a object to the request processing method of the Controller class.
 
 After that there is a connection to the Foursquare API url with query=name and the class returns the instance of ModelAndView 
 controller with the result of recommended venues near that location as a formatted JSON with correct data structures. The result value is displayed in a html page. 
 
 

