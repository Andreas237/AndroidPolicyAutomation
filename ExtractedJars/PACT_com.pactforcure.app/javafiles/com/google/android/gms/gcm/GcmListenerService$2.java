// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.gcm;

import android.content.Intent;
import android.os.AsyncTask;

// Referenced classes of package com.google.android.gms.gcm:
//			GcmListenerService

class GcmListenerService$2 extends AsyncTask
{

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((Void[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #28  <Class Void[]>
	//    3    5:invokevirtual   #31  <Method Void doInBackground(Void[])>
	//    4    8:areturn         
	}

	protected transient Void doInBackground(Void avoid[])
	{
		GcmListenerService.zza(zzbfK, val$intent);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field GcmListenerService zzbfK>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Intent val$intent>
	//    4    8:invokestatic    #34  <Method void GcmListenerService.zza(GcmListenerService, Intent)>
		return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
	}

	final Intent val$intent;
	final GcmListenerService zzbfK;

	GcmListenerService$2(Intent intent1)
	{
		zzbfK = final_gcmlistenerservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field GcmListenerService zzbfK>
		val$intent = intent1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field Intent val$intent>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void AsyncTask()>
	//    8   14:return          
	}
}
