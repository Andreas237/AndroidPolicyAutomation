// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzav, StatusPendingResult

final class zzax
	implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
{

	zzax(zzav zzav1, AtomicReference atomicreference, StatusPendingResult statuspendingresult)
	{
		zzit = zzav1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field zzav zzit>
		zziu = atomicreference;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field AtomicReference zziu>
		zziv = statuspendingresult;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field StatusPendingResult zziv>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #23  <Method void Object()>
	//   11   19:return          
	}

	public final void onConnected(Bundle bundle)
	{
		zzav.zza(zzit, (GoogleApiClient)zziu.get(), zziv, true);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzav zzit>
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field AtomicReference zziu>
	//    4    8:invokevirtual   #32  <Method Object AtomicReference.get()>
	//    5   11:checkcast       #34  <Class GoogleApiClient>
	//    6   14:aload_0         
	//    7   15:getfield        #20  <Field StatusPendingResult zziv>
	//    8   18:iconst_1        
	//    9   19:invokestatic    #40  <Method void zzav.zza(zzav, GoogleApiClient, StatusPendingResult, boolean)>
	//   10   22:return          
	}

	public final void onConnectionSuspended(int i)
	{
	//    0    0:return          
	}

	private final zzav zzit;
	private final AtomicReference zziu;
	private final StatusPendingResult zziv;
}
