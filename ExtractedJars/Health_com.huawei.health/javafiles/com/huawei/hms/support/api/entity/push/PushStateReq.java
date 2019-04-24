// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.IMessageEntity;

public class PushStateReq
	implements IMessageEntity
{

	public PushStateReq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public String getPkgName()
	{
		return pkgName;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String pkgName>
	//    2    4:areturn         
	}

	public void setPkgName(String s)
	{
		pkgName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field String pkgName>
	//    3    5:return          
	}

	private String pkgName;
}
