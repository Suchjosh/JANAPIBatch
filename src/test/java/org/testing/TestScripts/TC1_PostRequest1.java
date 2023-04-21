package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.Helper.JsonParsingUsingJsonPath;
import org.testing.ResponseVallidation.ValidateResponse;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonFileHandle;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesFileHandle;
import org.testing.utilities.RandonNumberGeneration;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1_PostRequest1 {
	
	static String returnIdvalue;
	@Test
	public void testcase1() throws IOException
	{
		Properties pr=PropertiesFileHandle.loadProperties("../JanAPIBatch/URI.properties");
		String requestbody=JsonFileHandle.loadjsonData("../JanAPIBatch/RequestData.json");
		
		String idvalue=RandonNumberGeneration.generateNumber();
		requestbody=JsonReplacement.replaceVariable(requestbody,"id",idvalue);
		
		
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.postRequest("QA_URI", requestbody);
		returnIdvalue=JsonParsingUsingJsonPath.jsonparsing(res,"id");
		
		ValidateResponse.validateStatusCode(201, res);
		
	}

}
