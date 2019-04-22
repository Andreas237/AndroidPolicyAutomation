// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.content.*;
import android.net.Uri;

public final class GooglePlayServicesUpdatedReceiver extends BroadcastReceiver
{
	public static abstract class Callback
	{

		public abstract void zzv();

		public Callback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	public GooglePlayServicesUpdatedReceiver(Callback callback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void BroadcastReceiver()>
		zzkt = callback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field GooglePlayServicesUpdatedReceiver$Callback zzkt>
	//    5    9:return          
	}

	public final void onReceive(Context context, Intent intent)
	{
		context = ((Context) (intent.getData()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #27  <Method Uri Intent.getData()>
	//    2    4:astore_1        
		if(context != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
			context = ((Context) (((Uri) (context)).getSchemeSpecificPart()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #33  <Method String Uri.getSchemeSpecificPart()>
	//    7   13:astore_1        
		else
	//*   8   14:goto            19
			context = null;
	//    9   17:aconst_null     
	//   10   18:astore_1        
		if("com.google.android.gms".equals(((Object) (context))))
	//*  11   19:ldc1            #35  <String "com.google.android.gms">
	//*  12   21:aload_1         
	//*  13   22:invokevirtual   #41  <Method boolean String.equals(Object)>
	//*  14   25:ifeq            39
		{
			zzkt.zzv();
	//   15   28:aload_0         
	//   16   29:getfield        #18  <Field GooglePlayServicesUpdatedReceiver$Callback zzkt>
	//   17   32:invokevirtual   #44  <Method void GooglePlayServicesUpdatedReceiver$Callback.zzv()>
			unregister();
	//   18   35:aload_0         
	//   19   36:invokevirtual   #47  <Method void unregister()>
		}
	//   20   39:return          
	}

	public final void unregister()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mContext != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #49  <Field Context mContext>
	//*   4    6:ifnull          17
			mContext.unregisterReceiver(((BroadcastReceiver) (this)));
	//    5    9:aload_0         
	//    6   10:getfield        #49  <Field Context mContext>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #55  <Method void Context.unregisterReceiver(BroadcastReceiver)>
		mContext = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #49  <Field Context mContext>
		this;
	//   12   22:aload_0         
		JVM INSTR monitorexit ;
	//   13   23:monitorexit     
		return;
	//   14   24:return          
		Exception exception;
		exception;
	//   15   25:astore_1        
	//*  16   26:aload_0         
		throw exception;
	//   17   27:monitorexit     
	//   18   28:aload_1         
	//   19   29:athrow          
	}

	public final void zzc(Context context)
	{
		mContext = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field Context mContext>
	//    3    5:return          
	}

	private Context mContext;
	private final Callback zzkt;
}
