package org.pro;

import org.testng.annotations.DataProvider;

public class DataProv {
	
	
	@DataProvider(name="login")
	public Object method() {
		Object obj[][] = new Object[][]{
				{"renurenu","renurenu","15/12/20","17/12/20","subi","ravi","dfgjhbswdefg","1234567890123456","123"}
					};
				
				return obj;
	}

}
