// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.auth;

import com.huawei.hms.core.aidl.IMessageEntity;

public class AppInfo
	implements IMessageEntity
{

	public AppInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public AppInfo(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		appID = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field String appID>
		packageName = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field String packageName>
	//    8   14:return          
	}

	public String getAppID()
	{
		return appID;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String appID>
	//    2    4:areturn         
	}

	public String getPackageName()
	{
		return packageName;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String packageName>
	//    2    4:areturn         
	}

	public void setAppID(String s)
	{
		appID = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field String appID>
	//    3    5:return          
	}

	public void setPackageName(String s)
	{
		packageName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field String packageName>
	//    3    5:return          
	}

	private String appID;
	private String packageName;
}
