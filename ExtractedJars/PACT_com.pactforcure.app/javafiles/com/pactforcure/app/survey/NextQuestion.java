// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;

import java.io.Serializable;

public class NextQuestion
	implements Serializable
{

	public NextQuestion()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public String getNextQuestionCode()
	{
		return nextQuestionCode;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String nextQuestionCode>
	//    2    4:areturn         
	}

	public String getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String value>
	//    2    4:areturn         
	}

	public void setNextQuestionCode(String s)
	{
		nextQuestionCode = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field String nextQuestionCode>
	//    3    5:return          
	}

	public void setValue(String s)
	{
		value = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field String value>
	//    3    5:return          
	}

	private String nextQuestionCode;
	private String value;
}
