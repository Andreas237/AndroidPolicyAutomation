// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.core.aidl;

import com.huawei.hms.support.api.client.Status;

// Referenced classes of package com.huawei.hms.core.aidl:
//			IMessageEntity

public class AbstractMessageEntity
	implements IMessageEntity
{

	public AbstractMessageEntity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public Status getCommonStatus()
	{
		return commonStatus;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Status commonStatus>
	//    2    4:areturn         
	}

	public void setCommonStatus(Status status)
	{
		commonStatus = status;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Status commonStatus>
	//    3    5:return          
	}

	private Status commonStatus;
}
