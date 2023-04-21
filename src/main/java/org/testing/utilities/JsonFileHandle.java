package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

//purpose of the method--to load the json data
//input parameter-----file path
//output parameter---string json data
public class JsonFileHandle {

	public static String loadjsonData(String filepath) throws FileNotFoundException
	{
		File f=new File(filepath);
		FileReader fr=new FileReader(f);
		JSONTokener js=new JSONTokener(fr);
		JSONObject j= new JSONObject(js);
		return j.toString();
		
	}
}
