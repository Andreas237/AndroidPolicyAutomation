// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.api.dto;

import java.util.List;

public class SaveResponesRequestBody
{

	public SaveResponesRequestBody()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public SaveResponesRequestBody(String s, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		access_token = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field String access_token>
		responses = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field List responses>
	//    8   14:return          
	}

	public String access_token;
	public List responses;
}
