package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileHandle;
import org.testng.annotations.Test;

public class TC8_GetRequest_Emp {
	@Test
	public void testcase8() throws IOException

	{
		Properties pr=PropertiesFileHandle.loadProperties("../JanAPIBatch/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		//http.getReqest("EMP_URI2", TC1_PostRequest1.returnIdvalue); //to get a particular record  id value not hardcoded
		http.getRequest("QA_URI2", "9"); //to get particular record.. hardcoded id value
	}

}

