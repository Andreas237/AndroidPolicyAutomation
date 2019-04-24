// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.core.aidl;

import java.util.List;

// Referenced classes of package com.huawei.hms.core.aidl:
//			IMessageEntity

public class RequestHeader
	implements IMessageEntity
{

	public RequestHeader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public RequestHeader(String s, String s1, int i, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		appId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field String appId>
		packageName = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field String packageName>
		sdkVersion = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #28  <Field int sdkVersion>
		sessionId = s2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #30  <Field String sessionId>
	//   14   25:return          
	}

	public List getApiNameList()
	{
		return apiNameList;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field List apiNameList>
	//    2    4:areturn         
	}

	public String getAppID()
	{
		return appId;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String appId>
	//    2    4:areturn         
	}

	public String getPackageName()
	{
		return packageName;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String packageName>
	//    2    4:areturn         
	}

	public int getSdkVersion()
	{
		return sdkVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int sdkVersion>
	//    2    4:ireturn         
	}

	public String getSessionId()
	{
		return sessionId;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String sessionId>
	//    2    4:areturn         
	}

	public void setApiNameList(List list)
	{
		apiNameList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field List apiNameList>
	//    3    5:return          
	}

	public void setAppID(String s)
	{
		appId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field String appId>
	//    3    5:return          
	}

	public void setPackageName(String s)
	{
		packageName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field String packageName>
	//    3    5:return          
	}

	public void setSdkVersion(int i)
	{
		sdkVersion = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #28  <Field int sdkVersion>
	//    3    5:return          
	}

	public void setSessionId(String s)
	{
		sessionId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field String sessionId>
	//    3    5:return          
	}

	private List apiNameList;
	private String appId;
	private String packageName;
	private int sdkVersion;
	private String sessionId;
}
