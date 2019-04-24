// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.IMessageEntity;

public class TokenResp
	implements IMessageEntity
{

	public TokenResp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		token = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #17  <String "">
	//    4    7:putfield        #19  <Field String token>
		retCode = 0;
	//    5   10:aload_0         
	//    6   11:iconst_0        
	//    7   12:putfield        #21  <Field int retCode>
	//    8   15:return          
	}

	public int getRetCode()
	{
		return retCode;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int retCode>
	//    2    4:ireturn         
	}

	public String getToken()
	{
		return token;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String token>
	//    2    4:areturn         
	}

	public void setRetCode(int i)
	{
		retCode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #21  <Field int retCode>
	//    3    5:return          
	}

	public void setToken(String s)
	{
		token = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field String token>
	//    3    5:return          
	}

	private int retCode;
	private String token;
}
