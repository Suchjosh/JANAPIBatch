package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonFileHandle;
import org.testing.utilities.PropertiesFileHandle;
import org.testng.annotations.Test;

public class TC9_UpdateReqest_Emp {
	@Test
	public void testcase9() throws IOException
	{
		Properties pr=PropertiesFileHandle.loadProperties("../JanAPIBatch/URI.properties");
		String requestbody=JsonFileHandle.loadjsonData("../JanAPIBatch/RequestDataforUpdate.json");
			
		HTTPMethods http=new HTTPMethods(pr);
		http.PutRequest("EMP_URI3", requestbody,"Suchitra1");
		
	}
}
