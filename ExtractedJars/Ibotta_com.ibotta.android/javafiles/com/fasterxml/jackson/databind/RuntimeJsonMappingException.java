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
}
