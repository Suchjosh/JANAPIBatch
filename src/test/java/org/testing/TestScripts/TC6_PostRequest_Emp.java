package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonFileHandle;
import org.testing.utilities.PropertiesFileHandle;
import org.testng.annotations.Test;

public class TC6_PostRequest_Emp {

	//static String returnIdvalue;
	@Test
	public void testcase6() throws IOException
	{
		Properties pr=PropertiesFileHandle.loadProperties("../JanAPIBatch/URI.properties");
		String requestbodyData=JsonFileHandle.loadjsonData("../JanAPIBatch/RequestData_emp.json");
		
		/*String idvalue=RandonNumberGeneration.generateNumber();
		requestbody=JsonReplacement.replaceVariable(requestbody,"id",idvalue);*/
		
		
		HTTPMethods http=new HTTPMethods(pr);
		http.postRequest("EMP_URI", requestbodyData);
		//returnIdvalue=JsonParsingUsingJsonPath.jsonparsing(res,"id");
		
	
		
	}
	}


