package org.testing.runner;

import java.io.IOException;

import org.testing.TestScripts.TC10_DeleteRequest_Emp;
import org.testing.TestScripts.TC1_PostRequest1;
import org.testing.TestScripts.TC2_GetAllRequest;
import org.testing.TestScripts.TC3_GetRequest;
import org.testing.TestScripts.TC4_PutRequest;
import org.testing.TestScripts.TC5_DeleteRequest;
import org.testing.TestScripts.TC6_PostRequest_Emp;
import org.testing.TestScripts.TC7_GetAllRequest_Emp;
import org.testing.TestScripts.TC8_GetRequest_Emp;
import org.testing.TestScripts.TC9_UpdateReqest_Emp;

public class Runner 
{
public static void main(String[] args) throws IOException {
	
	TC1_PostRequest1 tc1= new TC1_PostRequest1();
	tc1.testcase1();
	
	TC2_GetAllRequest tc2=new TC2_GetAllRequest();
	tc2.testcase2();
	
	TC3_GetRequest tc3=new TC3_GetRequest();
	tc3.testcase3();
	
	TC4_PutRequest tc4=new TC4_PutRequest();
	tc4.testcase4();
	
	TC5_DeleteRequest tc5=new TC5_DeleteRequest();
	tc5.testcase5();
	
	TC6_PostRequest_Emp tc6= new TC6_PostRequest_Emp();
	tc6.testcase6();
	
	TC7_GetAllRequest_Emp tc7=new TC7_GetAllRequest_Emp();
	tc7.testcase7();
	
	TC8_GetRequest_Emp tc8=new TC8_GetRequest_Emp();
	tc8.testcase8();
	
	TC9_UpdateReqest_Emp tc9=new TC9_UpdateReqest_Emp();
	tc9.testcase9();
	
	TC10_DeleteRequest_Emp tc10=new TC10_DeleteRequest_Emp();
	tc10.testcase10();
}
}
