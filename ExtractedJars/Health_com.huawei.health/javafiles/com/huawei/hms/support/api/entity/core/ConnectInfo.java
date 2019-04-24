// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import java.util.List;

public class ConnectInfo
	implements IMessageEntity
{

	public ConnectInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	public ConnectInfo(List list, List list1, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		apiNameList = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field List apiNameList>
		scopeList = list1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field List scopeList>
		fingerprint = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field String fingerprint>
		subAppID = s1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #29  <Field String subAppID>
	//   14   25:return          
	}

	public List getApiNameList()
	{
		return apiNameList;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List apiNameList>
	//    2    4:areturn         
	}

	public String getFingerprint()
	{
		return fingerprint;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String fingerprint>
	//    2    4:areturn         
	}

	public List getScopeList()
	{
		return scopeList;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field List scopeList>
	//    2    4:areturn         
	}

	public String getSubAppID()
	{
		return subAppID;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String subAppID>
	//    2    4:areturn         
	}

	public void setApiNameList(List list)
	{
		apiNameList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field List apiNameList>
	//    3    5:return          
	}

	public void setFingerprint(String s)
	{
		fingerprint = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field String fingerprint>
	//    3    5:return          
	}

	public void setScopeList(List list)
	{
		scopeList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field List scopeList>
	//    3    5:return          
	}

	public void setSubAppID(String s)
	{
		subAppID = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field String subAppID>
	//    3    5:return          
	}

	private List apiNameList;
	private String fingerprint;
	private List scopeList;
	private String subAppID;
}
