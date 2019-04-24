// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.*;
import android.util.Log;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.android.gms.gcm:
//			GoogleCloudMessaging

class GoogleCloudMessaging$1 extends Handler
{

	public void handleMessage(Message message)
	{
		if(message == null || !(message.obj instanceof Intent))
	//*   0    0:aload_1         
	//*   1    1:ifnull          14
	//*   2    4:aload_1         
	//*   3    5:getfield        #26  <Field Object Message.obj>
	//*   4    8:instanceof      #28  <Class Intent>
	//*   5   11:ifne            22
			Log.w("GCM", "Dropping invalid message");
	//    6   14:ldc1            #30  <String "GCM">
	//    7   16:ldc1            #32  <String "Dropping invalid message">
	//    8   18:invokestatic    #38  <Method int Log.w(String, String)>
	//    9   21:pop             
		message = ((Message) ((Intent)message.obj));
	//   10   22:aload_1         
	//   11   23:getfield        #26  <Field Object Message.obj>
	//   12   26:checkcast       #28  <Class Intent>
	//   13   29:astore_1        
		if("com.google.android.c2dm.intent.REGISTRATION".equals(((Object) (((Intent) (message)).getAction()))))
	//*  14   30:ldc1            #40  <String "com.google.android.c2dm.intent.REGISTRATION">
	//*  15   32:aload_1         
	//*  16   33:invokevirtual   #44  <Method String Intent.getAction()>
	//*  17   36:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  18   39:ifeq            57
			GoogleCloudMessaging.zza(zzbgf).add(((Object) (message)));
	//   19   42:aload_0         
	//   20   43:getfield        #14  <Field GoogleCloudMessaging zzbgf>
	//   21   46:invokestatic    #54  <Method BlockingQueue GoogleCloudMessaging.zza(GoogleCloudMessaging)>
	//   22   49:aload_1         
	//   23   50:invokeinterface #59  <Method boolean BlockingQueue.add(Object)>
	//   24   55:pop             
		else
	//*  25   56:return          
		if(!GoogleCloudMessaging.zza(zzbgf, ((Intent) (message))))
	//*  26   57:aload_0         
	//*  27   58:getfield        #14  <Field GoogleCloudMessaging zzbgf>
	//*  28   61:aload_1         
	//*  29   62:invokestatic    #62  <Method boolean GoogleCloudMessaging.zza(GoogleCloudMessaging, Intent)>
	//*  30   65:ifne            56
		{
			((Intent) (message)).setPackage(GoogleCloudMessaging.zzb(zzbgf).getPackageName());
	//   31   68:aload_1         
	//   32   69:aload_0         
	//   33   70:getfield        #14  <Field GoogleCloudMessaging zzbgf>
	//   34   73:invokestatic    #66  <Method Context GoogleCloudMessaging.zzb(GoogleCloudMessaging)>
	//   35   76:invokevirtual   #71  <Method String Context.getPackageName()>
	//   36   79:invokevirtual   #75  <Method Intent Intent.setPackage(String)>
	//   37   82:pop             
			GoogleCloudMessaging.zzb(zzbgf).sendBroadcast(((Intent) (message)));
	//   38   83:aload_0         
	//   39   84:getfield        #14  <Field GoogleCloudMessaging zzbgf>
	//   40   87:invokestatic    #66  <Method Context GoogleCloudMessaging.zzb(GoogleCloudMessaging)>
	//   41   90:aload_1         
	//   42   91:invokevirtual   #79  <Method void Context.sendBroadcast(Intent)>
			return;
	//   43   94:return          
		}
	}

	final GoogleCloudMessaging zzbgf;

	GoogleCloudMessaging$1(GoogleCloudMessaging googlecloudmessaging, Looper looper)
	{
		zzbgf = googlecloudmessaging;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field GoogleCloudMessaging zzbgf>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #17  <Method void Handler(Looper)>
	//    6   10:return          
	}
}
