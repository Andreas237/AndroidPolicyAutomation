// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.annotation;


// Referenced classes of package com.fasterxml.jackson.databind.annotation:
//			JsonPOJOBuilder

public static class JsonPOJOBuilder$Value
{

	public final String buildMethodName;
	public final String withPrefix;

	public JsonPOJOBuilder$Value(JsonPOJOBuilder jsonpojobuilder)
	{
		this(jsonpojobuilder.buildMethodName(), jsonpojobuilder.withPrefix());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #15  <Method String JsonPOJOBuilder.buildMethodName()>
	//    3    7:aload_1         
	//    4    8:invokeinterface #17  <Method String JsonPOJOBuilder.withPrefix()>
	//    5   13:invokespecial   #20  <Method void JsonPOJOBuilder$Value(String, String)>
	//    6   16:return          
	}

	public JsonPOJOBuilder$Value(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		buildMethodName = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field String buildMethodName>
		withPrefix = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field String withPrefix>
	//    8   14:return          
	}
}
