// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.gcm;

import android.content.Intent;

// Referenced classes of package com.google.android.gms.gcm:
//			GcmListenerService

class GcmListenerService$1
	implements Runnable
{

	public void run()
	{
		GcmListenerService.zza(zzbfK, val$intent);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field GcmListenerService zzbfK>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Intent val$intent>
	//    4    8:invokestatic    #29  <Method void GcmListenerService.zza(GcmListenerService, Intent)>
	//    5   11:return          
	}

	final Intent val$intent;
	final GcmListenerService zzbfK;

	GcmListenerService$1(Intent intent1)
	{
		zzbfK = final_gcmlistenerservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field GcmListenerService zzbfK>
		val$intent = intent1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Intent val$intent>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
