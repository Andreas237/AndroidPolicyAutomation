// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.pay;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.core.aidl.AbstractMessageEntity;
import java.security.SecureRandom;

public class PayResp extends AbstractMessageEntity
{

	public PayResp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void AbstractMessageEntity()>
	//    2    4:return          
	}

	public PendingIntent getPendingIntent()
	{
		return pendingIntent;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field PendingIntent pendingIntent>
	//    2    4:areturn         
	}

	public void setPendingIntent(Context context, Intent intent)
	{
		pendingIntent = PendingIntent.getActivity(context, (new SecureRandom()).nextInt(), intent, 0x8000000);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #22  <Class SecureRandom>
	//    3    5:dup             
	//    4    6:invokespecial   #23  <Method void SecureRandom()>
	//    5    9:invokevirtual   #27  <Method int SecureRandom.nextInt()>
	//    6   12:aload_2         
	//    7   13:ldc1            #28  <Int 0x8000000>
	//    8   15:invokestatic    #34  <Method PendingIntent PendingIntent.getActivity(Context, int, Intent, int)>
	//    9   18:putfield        #18  <Field PendingIntent pendingIntent>
	//   10   21:return          
	}

	public PendingIntent pendingIntent;
	public int retCode;
}
