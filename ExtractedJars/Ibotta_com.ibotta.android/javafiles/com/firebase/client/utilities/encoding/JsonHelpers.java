// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.utilities.encoding;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonHelpers
{

	public JsonHelpers()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static ObjectMapper getMapper()
	{
		return mapperInstance;
	//    0    0:getstatic       #15  <Field ObjectMapper mapperInstance>
	//    1    3:areturn         
	}

	private static final ObjectMapper mapperInstance = new ObjectMapper();

	static 
	{
	//    0    0:new             #10  <Class ObjectMapper>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void ObjectMapper()>
	//    3    7:putstatic       #15  <Field ObjectMapper mapperInstance>
	//*   4   10:return          
	}
}
