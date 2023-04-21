package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonFileHandle;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesFileHandle;
import org.testng.annotations.Test;

public class TC4_PutRequest {
	@Test
	public void testcase4() throws IOException
	{
		Properties pr=PropertiesFileHandle.loadProperties("../JanAPIBatch/URI.properties");
		String requestbody=JsonFileHandle.loadjsonData("../JanAPIBatch/RequestDataforPut.json");
		
		//String idvalue=RandonNumberGeneration.generateNumber();
		requestbody=JsonReplacement.replaceVariable(requestbody,"id",TC1_PostRequest1.returnIdvalue);
		
		
		HTTPMethods http=new HTTPMethods(pr);
		http.PutRequest("QA_URI", requestbody,TC1_PostRequest1.returnIdvalue);
		
	}
}
