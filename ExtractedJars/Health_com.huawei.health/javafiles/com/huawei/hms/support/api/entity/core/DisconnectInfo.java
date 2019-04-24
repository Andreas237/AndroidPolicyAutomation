// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import java.util.List;

public class DisconnectInfo
	implements IMessageEntity
{

	public DisconnectInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public DisconnectInfo(List list, List list1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		scopeList = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field List scopeList>
		apiNameList = list1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field List apiNameList>
	//    8   14:return          
	}

	public List getApiNameList()
	{
		return apiNameList;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field List apiNameList>
	//    2    4:areturn         
	}

	public List getScopeList()
	{
		return scopeList;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List scopeList>
	//    2    4:areturn         
	}

	public List apiNameList;
	public List scopeList;
}
