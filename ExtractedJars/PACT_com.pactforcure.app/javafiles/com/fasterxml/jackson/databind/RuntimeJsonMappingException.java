// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;


// Referenced classes of package com.fasterxml.jackson.databind:
//			JsonMappingException

public class RuntimeJsonMappingException extends RuntimeException
{

	public RuntimeJsonMappingException(JsonMappingException jsonmappingexception)
	{
		super(((Throwable) (jsonmappingexception)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void RuntimeException(Throwable)>
	//    3    5:return          
	}

	public RuntimeJsonMappingException(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void RuntimeException(String)>
	//    3    5:return          
	}

	public RuntimeJsonMappingException(String s, JsonMappingException jsonmappingexception)
	{
		super(s, ((Throwable) (jsonmappingexception)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #17  <Method void RuntimeException(String, Throwable)>
	//    4    6:return          
	}
}
