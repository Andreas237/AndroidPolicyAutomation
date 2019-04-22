// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

final class zzbk
	implements Runnable
{

	zzbk(GoogleApiManager.zza zza, ConnectionResult connectionresult)
	{
		zzkk = zza;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field GoogleApiManager$zza zzkk>
		zzkl = connectionresult;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field ConnectionResult zzkl>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		zzkk.onConnectionFailed(zzkl);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field GoogleApiManager$zza zzkk>
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field ConnectionResult zzkl>
	//    4    8:invokevirtual   #27  <Method void GoogleApiManager$zza.onConnectionFailed(ConnectionResult)>
	//    5   11:return          
	}

	private final GoogleApiManager.zza zzkk;
	private final ConnectionResult zzkl;
}
