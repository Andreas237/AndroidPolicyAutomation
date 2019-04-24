// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.iid;

import android.os.*;

// Referenced classes of package com.google.android.gms.iid:
//			MessengerCompat

private final class MessengerCompat$zza extends zzb.zza
{

	public void send(Message message)
		throws RemoteException
	{
		message.arg2 = Binder.getCallingUid();
	//    0    0:aload_1         
	//    1    1:invokestatic    #27  <Method int Binder.getCallingUid()>
	//    2    4:putfield        #33  <Field int Message.arg2>
		handler.dispatchMessage(message);
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field Handler handler>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #38  <Method void Handler.dispatchMessage(Message)>
	//    7   15:return          
	}

	Handler handler;

	MessengerCompat$zza(MessengerCompat messengercompat, Handler handler1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void zzb$zza()>
		handler = handler1;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #16  <Field Handler handler>
	//    5    9:return          
	}
}
