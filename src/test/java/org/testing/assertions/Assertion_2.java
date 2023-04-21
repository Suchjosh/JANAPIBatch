package org.testing.assertions;

public class Assertion_2 {

	public static void assertion2(String expected,String actual)
	{
		if(expected.equals(actual))
		{
			System.out.println("Data is matching");
		}
		else
		{
			System.out.println("Data is not matching");
		}
	}
}
