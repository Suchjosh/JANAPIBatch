package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileHandle;
import org.testng.annotations.Test;

public class TC10_DeleteRequest_Emp {
	
	@Test
	public void testcase10() throws IOException
	
	{
		Properties pr=PropertiesFileHandle.loadProperties("../JanAPIBatch/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		//http.deleteRequest("QA_URI", TC1_PostRequest1.returnIdvalue); 
		http.getRequest("EMP_URI4", "2"); //to get particular record.hardcoded id value
	}
}
