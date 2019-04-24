// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.auth;

import com.huawei.hms.core.aidl.IMessageEntity;

public abstract class AbstractResp
	implements IMessageEntity
{

	public AbstractResp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		rtnCode = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #17  <Field int rtnCode>
	//    5    9:return          
	}

	public String getErrorReason()
	{
		return errorReason;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String errorReason>
	//    2    4:areturn         
	}

	public int getRtnCode()
	{
		return rtnCode;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int rtnCode>
	//    2    4:ireturn         
	}

	public void setErrorReason(String s)
	{
		errorReason = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field String errorReason>
	//    3    5:return          
	}

	public void setRtnCode(int i)
	{
		rtnCode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #17  <Field int rtnCode>
	//    3    5:return          
	}

	private String errorReason;
	private int rtnCode;
}
