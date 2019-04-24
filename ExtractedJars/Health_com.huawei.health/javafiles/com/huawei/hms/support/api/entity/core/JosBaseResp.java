// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;

public class JosBaseResp
	implements IMessageEntity
{

	public JosBaseResp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public int getStatusCode()
	{
		return statusCode;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int statusCode>
	//    2    4:ireturn         
	}

	public void setStatusCode(int i)
	{
		statusCode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #18  <Field int statusCode>
	//    3    5:return          
	}

	private int statusCode;
}
