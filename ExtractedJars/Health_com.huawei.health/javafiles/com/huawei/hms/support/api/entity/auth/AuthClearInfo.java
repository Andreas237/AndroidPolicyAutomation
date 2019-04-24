// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.auth;

import com.huawei.hms.core.aidl.IMessageEntity;

public class AuthClearInfo
	implements IMessageEntity
{

	public AuthClearInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		type = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #21  <Field int type>
	//    5    9:return          
	}

	public String getAppID()
	{
		return appID;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String appID>
	//    2    4:areturn         
	}

	public int getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int type>
	//    2    4:ireturn         
	}

	public void setAppID(String s)
	{
		appID = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field String appID>
	//    3    5:return          
	}

	public void setType(int i)
	{
		type = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #21  <Field int type>
	//    3    5:return          
	}

	public static final int TYPE_CLEAR_ALL = 1;
	public static final int TYPE_CLEAR_APP = 0;
	private String appID;
	private int type;
}
