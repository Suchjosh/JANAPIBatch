package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileHandle;
import org.testng.annotations.Test;

public class TC7_GetAllRequest_Emp {
	@Test
	public void testcase7() throws IOException
	{
		Properties pr=PropertiesFileHandle.loadProperties("../JanAPIBatch/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		http.getAllRequest("EMP_URI1");
	}

	
}
