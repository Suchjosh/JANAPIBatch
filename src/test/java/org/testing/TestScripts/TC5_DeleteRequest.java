package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileHandle;
import org.testng.annotations.Test;

public class TC5_DeleteRequest {
	@Test
	public void testcase5() throws IOException
	
	{
		Properties pr=PropertiesFileHandle.loadProperties("../JanAPIBatch/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		http.deleteRequest("QA_URI", TC1_PostRequest1.returnIdvalue); 
		//http.getReqest("QA_URI", "720789950"); //to get particular record.hardcoded id value
	}

}
