// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.iid;

import android.os.*;

// Referenced classes of package com.google.android.gms.iid:
//			InstanceIDListenerService, MessengerCompat

class InstanceIDListenerService$1 extends Handler
{

	public void handleMessage(Message message)
	{
		InstanceIDListenerService.zza(zzbhn, message, MessengerCompat.zzc(message));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field InstanceIDListenerService zzbhn>
	//    2    4:aload_1         
	//    3    5:aload_1         
	//    4    6:invokestatic    #24  <Method int MessengerCompat.zzc(Message)>
	//    5    9:invokestatic    #28  <Method void InstanceIDListenerService.zza(InstanceIDListenerService, Message, int)>
	//    6   12:return          
	}

	final InstanceIDListenerService zzbhn;

	InstanceIDListenerService$1(InstanceIDListenerService instanceidlistenerservice, Looper looper)
	{
		zzbhn = instanceidlistenerservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field InstanceIDListenerService zzbhn>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #15  <Method void Handler(Looper)>
	//    6   10:return          
	}
}
