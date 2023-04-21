package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonFileHandle;
import org.testing.utilities.PropertiesFileHandle;
import org.testng.annotations.Test;

public class TC1_PostRequest {
	
	//static string returnIdvalue;
	@Test
	public static void main(String[] args) throws IOException {
		
		Properties pr=PropertiesFileHandle.loadProperties("../JanAPIBatch/URI.properties");
		String requestbodyData=JsonFileHandle.loadjsonData("../JanAPIBatch/RequestData.json");
		HTTPMethods http=new HTTPMethods(pr);
		http.postRequest("QA_URI", requestbodyData);
		
		
	}

}
