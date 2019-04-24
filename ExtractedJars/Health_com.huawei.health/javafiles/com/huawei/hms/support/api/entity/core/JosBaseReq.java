// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;

public class JosBaseReq
	implements IMessageEntity
{

	public JosBaseReq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	private static Object get(Object obj)
	{
		return obj;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public String getChannelId()
	{
		return (String)get(((Object) (channelId)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String channelId>
	//    2    4:invokestatic    #26  <Method Object get(Object)>
	//    3    7:checkcast       #28  <Class String>
	//    4   10:areturn         
	}

	public String getCpID()
	{
		return (String)get(((Object) (cpId)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String cpId>
	//    2    4:invokestatic    #26  <Method Object get(Object)>
	//    3    7:checkcast       #28  <Class String>
	//    4   10:areturn         
	}

	public String getHmsSdkVersionName()
	{
		return (String)get(((Object) (hmsSdkVersionName)));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String hmsSdkVersionName>
	//    2    4:invokestatic    #26  <Method Object get(Object)>
	//    3    7:checkcast       #28  <Class String>
	//    4   10:areturn         
	}

	public void setChannelId(String s)
	{
		channelId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field String channelId>
	//    3    5:return          
	}

	public void setCpID(String s)
	{
		cpId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field String cpId>
	//    3    5:return          
	}

	public void setHmsSdkVersionName(String s)
	{
		hmsSdkVersionName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field String hmsSdkVersionName>
	//    3    5:return          
	}

	private String channelId;
	private String cpId;
	private String hmsSdkVersionName;
}
