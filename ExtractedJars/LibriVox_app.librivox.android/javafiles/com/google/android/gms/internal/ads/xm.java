// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zz, wv, xg, xj

final class xm extends BroadcastReceiver
{

	private xm(xg xg)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	xm(xg xg, xj xj)
	{
		this(xg);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void xm(xg)>
	//    3    5:return          
	}

	public final void onReceive(Context context, Intent intent)
	{
		zz.a();
	//    0    0:invokestatic    #20  <Method void zz.a()>
		wv.a(context);
	//    1    3:aload_1         
	//    2    4:invokestatic    #25  <Method void wv.a(Context)>
	//    3    7:return          
	}
}
