package com.java.test;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import static org.junit.Assert.*;
import com.java.VenueSeaController;

/**
 * Venue Finder
 * @author Baharak
 */

@WebAppConfiguration
@ContextConfiguration
public class VenueSeaControllerTest {
	
	private String name = "pizza";	
    VenueSeaController controller = new VenueSeaController();
   
    	
    @Test
    public void testVenueSea() throws Exception {
        String result = null;
        try {
             result = controller.objectMapper(name);
        } catch(Exception e) {
            e.printStackTrace();
            fail();
        }     
        assertNotNull(result);
    }
}    
	
    