// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.annotation;

import java.lang.annotation.Annotation;

public interface JsonPOJOBuilder
	extends Annotation
{
	public static class Value
	{

		public final String buildMethodName;
		public final String withPrefix;

		public Value(JsonPOJOBuilder jsonpojobuilder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			buildMethodName = jsonpojobuilder.buildMethodName();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokeinterface #18  <Method String JsonPOJOBuilder.buildMethodName()>
		//    5   11:putfield        #20  <Field String buildMethodName>
			withPrefix = jsonpojobuilder.withPrefix();
		//    6   14:aload_0         
		//    7   15:aload_1         
		//    8   16:invokeinterface #22  <Method String JsonPOJOBuilder.withPrefix()>
		//    9   21:putfield        #24  <Field String withPrefix>
		//   10   24:return          
		}
	}


	public abstract String buildMethodName();

	public abstract String withPrefix();
}
