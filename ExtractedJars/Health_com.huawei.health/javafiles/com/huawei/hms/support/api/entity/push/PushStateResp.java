// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.IMessageEntity;

public class PushStateResp
	implements IMessageEntity
{

	public PushStateResp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		retCode = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #15  <Field int retCode>
	//    5    9:return          
	}

	public int getRetCode()
	{
		return retCode;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field int retCode>
	//    2    4:ireturn         
	}

	public void setRetCode(int i)
	{
		retCode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #15  <Field int retCode>
	//    3    5:return          
	}

	private int retCode;
}
