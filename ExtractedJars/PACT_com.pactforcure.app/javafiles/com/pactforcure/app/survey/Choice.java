// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.survey;

import java.io.Serializable;

public class Choice
	implements Serializable
{

	public Choice()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public String getCode()
	{
		return code;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String code>
	//    2    4:areturn         
	}

	public String getFailReason()
	{
		return failReason;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String failReason>
	//    2    4:areturn         
	}

	public String getNextQuestionCode()
	{
		return nextQuestionCode;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String nextQuestionCode>
	//    2    4:areturn         
	}

	public String getQuestionCode()
	{
		return questionCode;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String questionCode>
	//    2    4:areturn         
	}

	public String getText()
	{
		return text;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String text>
	//    2    4:areturn         
	}

	public String getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String value>
	//    2    4:areturn         
	}

	public void setCode(String s)
	{
		code = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field String code>
	//    3    5:return          
	}

	public void setFailReason(String s)
	{
		failReason = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field String failReason>
	//    3    5:return          
	}

	public void setNextQuestionCode(String s)
	{
		nextQuestionCode = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field String nextQuestionCode>
	//    3    5:return          
	}

	public void setQuestionCode(String s)
	{
		questionCode = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field String questionCode>
	//    3    5:return          
	}

	public void setText(String s)
	{
		text = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field String text>
	//    3    5:return          
	}

	public void setValue(String s)
	{
		value = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field String value>
	//    3    5:return          
	}

	private String code;
	private String failReason;
	private String nextQuestionCode;
	private String questionCode;
	private String text;
	private String value;
}
