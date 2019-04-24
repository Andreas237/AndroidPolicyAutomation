// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.internal:
//			zzaat, zzabt

class zzaat$2
	implements com.google.android.gms.common.api.iClient.ConnectionCallbacks
{

	public void onConnected(Bundle bundle)
	{
		zzaat.zza(zzaBY, (GoogleApiClient)zzaBZ.get(), zzaCa, true);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzaat zzaBY>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field AtomicReference zzaBZ>
	//    4    8:invokevirtual   #37  <Method Object AtomicReference.get()>
	//    5   11:checkcast       #39  <Class GoogleApiClient>
	//    6   14:aload_0         
	//    7   15:getfield        #25  <Field zzabt zzaCa>
	//    8   18:iconst_1        
	//    9   19:invokestatic    #43  <Method void zzaat.zza(zzaat, GoogleApiClient, zzabt, boolean)>
	//   10   22:return          
	}

	public void onConnectionSuspended(int i)
	{
	//    0    0:return          
	}

	final zzaat zzaBY;
	final AtomicReference zzaBZ;
	final zzabt zzaCa;

	zzaat$2(zzaat zzaat1, AtomicReference atomicreference, zzabt zzabt)
	{
		zzaBY = zzaat1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field zzaat zzaBY>
		zzaBZ = atomicreference;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field AtomicReference zzaBZ>
		zzaCa = zzabt;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field zzabt zzaCa>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
