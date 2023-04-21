package org.testing.Helper;

import io.restassured.response.Response;

public class JsonParsingUsingJsonPath {

	public static String jsonparsing(Response res,String jsonpath)
	{
		return res.jsonPath().get(jsonpath);
		
	}
}
