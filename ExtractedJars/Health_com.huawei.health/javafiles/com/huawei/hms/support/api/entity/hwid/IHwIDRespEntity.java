// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.hwid;

import android.content.Intent;
import com.huawei.hms.core.aidl.IMessageEntity;

public abstract class IHwIDRespEntity
	implements IMessageEntity
{

	public IHwIDRespEntity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public Intent getData()
	{
		return data;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Intent data>
	//    2    4:areturn         
	}

	public int getRetCode()
	{
		return retCode;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int retCode>
	//    2    4:ireturn         
	}

	public void setData(Intent intent)
	{
		data = intent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field Intent data>
	//    3    5:return          
	}

	public void setRetCode(int i)
	{
		retCode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field int retCode>
	//    3    5:return          
	}

	private Intent data;
	private int retCode;
}
