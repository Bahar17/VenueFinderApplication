package com.java;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Venue Finder
 * @author Baharak
 */

@Controller 
public class VenueSeaController{
	
          @RequestMapping("/search")
	      public ModelAndView venueSea(HttpServletRequest req,HttpServletResponse res) throws IOException  {  
	          String name=req.getParameter("name"); 
	          String jsonoutput= objectMapper(name);
	          ModelAndView modelandView = new ModelAndView("mysearch");          
	          modelandView.addObject("output", jsonoutput);
	          return modelandView;                     
          }
          
          public String objectMapper(String name) throws JsonProcessingException, IOException {
        	  InputStream inputStream = new URL("https://api.foursquare.com/v2/venues/explore?near=London,London&type=venueless&client_id=RV5EB5MHKJS13TFRTPYVSMJXTOGP3YGAIUEL4J0JZBFDGJKI&client_secret=U5D3SOVI0L2ICX2ZPWW34HPE4MERPLMI1VI0WN5JTBZS2JRH&limit=10&v=20130815&query="+ name).openStream();     
        	  ObjectMapper mapper = new ObjectMapper();
	          JsonNode root = mapper.readTree(inputStream);
	          String sjson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(root);
	          return sjson;
          }


}