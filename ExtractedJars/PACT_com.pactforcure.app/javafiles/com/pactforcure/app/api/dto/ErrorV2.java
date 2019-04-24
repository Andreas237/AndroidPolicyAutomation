// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.api.dto;


public class ErrorV2
{

	public ErrorV2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public ErrorV2(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		statusCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #16  <Field int statusCode>
		code = "";
	//    5    9:aload_0         
	//    6   10:ldc1            #18  <String "">
	//    7   12:putfield        #20  <Field String code>
	//    8   15:return          
	}

	public String getCode()
	{
		return code;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String code>
	//    2    4:areturn         
	}

	public int getStatusCode()
	{
		return statusCode;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int statusCode>
	//    2    4:ireturn         
	}

	public void setCode(String s)
	{
		code = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field String code>
	//    3    5:return          
	}

	public void setStatusCode(int i)
	{
		statusCode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #16  <Field int statusCode>
	//    3    5:return          
	}

	private String code;
	private int statusCode;
}
