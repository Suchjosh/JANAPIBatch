package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseVallidation.ValidateResponse;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileHandle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC3_GetRequest {
	@Test
	public void testcase3() throws IOException

	{
		Properties pr=PropertiesFileHandle.loadProperties("../JanAPIBatch/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.getRequest("QA_URI", TC1_PostRequest1.returnIdvalue); //to get a particular record  id value not hardcoded
		//http.getReqest("QA_URI", "720789950"); //to get particular record.. hardcoded id value
		ValidateResponse.validateStatusCode(200, res);
		ValidateResponse.ValidateResponseData("SSSS", res, "firstname");
	}

}
