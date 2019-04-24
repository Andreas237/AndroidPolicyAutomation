// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.*;
import android.net.Uri;

public final class zzaar extends BroadcastReceiver
{
	public static abstract class zza
	{

		public abstract void zzvb();

		public zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	public zzaar(zza zza1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void BroadcastReceiver()>
		zzaBm = zza1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field zzaar$zza zzaBm>
	//    5    9:return          
	}

	public void onReceive(Context context, Intent intent)
	{
		intent = ((Intent) (intent.getData()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #27  <Method Uri Intent.getData()>
	//    2    4:astore_2        
		context = null;
	//    3    5:aconst_null     
	//    4    6:astore_1        
		if(intent != null)
	//*   5    7:aload_2         
	//*   6    8:ifnull          16
			context = ((Context) (((Uri) (intent)).getSchemeSpecificPart()));
	//    7   11:aload_2         
	//    8   12:invokevirtual   #33  <Method String Uri.getSchemeSpecificPart()>
	//    9   15:astore_1        
		if("com.google.android.gms".equals(((Object) (context))))
	//*  10   16:ldc1            #35  <String "com.google.android.gms">
	//*  11   18:aload_1         
	//*  12   19:invokevirtual   #41  <Method boolean String.equals(Object)>
	//*  13   22:ifeq            36
		{
			zzaBm.zzvb();
	//   14   25:aload_0         
	//   15   26:getfield        #18  <Field zzaar$zza zzaBm>
	//   16   29:invokevirtual   #44  <Method void zzaar$zza.zzvb()>
			unregister();
	//   17   32:aload_0         
	//   18   33:invokevirtual   #47  <Method void unregister()>
		}
	//   19   36:return          
	}

	public void setContext(Context context)
	{
		mContext = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field Context mContext>
	//    3    5:return          
	}

	public void unregister()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mContext != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #51  <Field Context mContext>
	//*   4    6:ifnull          17
			mContext.unregisterReceiver(((BroadcastReceiver) (this)));
	//    5    9:aload_0         
	//    6   10:getfield        #51  <Field Context mContext>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #57  <Method void Context.unregisterReceiver(BroadcastReceiver)>
		mContext = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #51  <Field Context mContext>
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

	protected Context mContext;
	private final zza zzaBm;
}
