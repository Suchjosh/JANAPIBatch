package org.testing.ResponseVallidation;

import org.testing.Helper.JsonParsingUsingJsonPath;

import io.restassured.response.Response;
import junit.framework.Assert;

public class ValidateResponse {

	public static void validateStatusCode(int expectedStatusCode,Response res)
	{
		Assert.assertEquals(expectedStatusCode,res.statusCode());
	}
	
	public static void ValidateResponseData(String expectedData,Response res,String Jsonpath)
	{
		String actualData=JsonParsingUsingJsonPath.jsonparsing(res, Jsonpath);
		Assert.assertEquals(actualData,expectedData, "Response Data is not matching");
	}
}