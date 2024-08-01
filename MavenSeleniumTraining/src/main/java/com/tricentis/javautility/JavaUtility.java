package com.tricentis.javautility;

import java.time.LocalDateTime;

public class JavaUtility {
	public String getTime()
	
	{
		return LocalDateTime.now().toString().replace(";","-");
	}
	

}
