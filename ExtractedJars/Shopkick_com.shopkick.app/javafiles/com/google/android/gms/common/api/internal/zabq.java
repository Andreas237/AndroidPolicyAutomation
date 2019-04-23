// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.content.*;
import android.net.Uri;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zabr

public final class zabq extends BroadcastReceiver
{

	public zabq(zabr zabr1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void BroadcastReceiver()>
		zajh = zabr1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field zabr zajh>
	//    5    9:return          
	}

	public final void onReceive(Context context, Intent intent)
	{
		context = ((Context) (intent.getData()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #24  <Method Uri Intent.getData()>
	//    2    4:astore_1        
		if(context != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
			context = ((Context) (((Uri) (context)).getSchemeSpecificPart()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #30  <Method String Uri.getSchemeSpecificPart()>
	//    7   13:astore_1        
		else
	//*   8   14:goto            19
			context = null;
	//    9   17:aconst_null     
	//   10   18:astore_1        
		if("com.google.android.gms".equals(((Object) (context))))
	//*  11   19:ldc1            #32  <String "com.google.android.gms">
	//*  12   21:aload_1         
	//*  13   22:invokevirtual   #38  <Method boolean String.equals(Object)>
	//*  14   25:ifeq            39
		{
			zajh.zas();
	//   15   28:aload_0         
	//   16   29:getfield        #15  <Field zabr zajh>
	//   17   32:invokevirtual   #43  <Method void zabr.zas()>
			unregister();
	//   18   35:aload_0         
	//   19   36:invokevirtual   #46  <Method void unregister()>
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
	//*   3    3:getfield        #48  <Field Context mContext>
	//*   4    6:ifnull          17
			mContext.unregisterReceiver(((BroadcastReceiver) (this)));
	//    5    9:aload_0         
	//    6   10:getfield        #48  <Field Context mContext>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #54  <Method void Context.unregisterReceiver(BroadcastReceiver)>
		mContext = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #48  <Field Context mContext>
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

	public final void zac(Context context)
	{
		mContext = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field Context mContext>
	//    3    5:return          
	}

	private Context mContext;
	private final zabr zajh;
}
