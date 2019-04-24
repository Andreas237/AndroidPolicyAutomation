// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.zzg;

// Referenced classes of package com.google.android.gms.internal:
//			zzabx, zzacb

final class zzabx$1 extends com.google.android.gms.common.api.Api$zza
{

	public com.google.android.gms.common.api.Api$zze zza(Context context, Looper looper, zzg zzg, Object obj, com.google.android.gms.common.api.iClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.iClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		return ((com.google.android.gms.common.api.Api$zze) (zzf(context, looper, zzg, (com.google.android.gms.common.api.ptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:checkcast       #16  <Class com.google.android.gms.common.api.Api$ApiOptions$NoOptions>
	//    6    9:aload           5
	//    7   11:aload           6
	//    8   13:invokevirtual   #20  <Method zzacb zzf(Context, Looper, zzg, com.google.android.gms.common.api.Api$ApiOptions$NoOptions, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    9   16:areturn         
	}

	public zzacb zzf(Context context, Looper looper, zzg zzg, com.google.android.gms.common.api.ptions.NoOptions nooptions, com.google.android.gms.common.api.iClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.iClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		return new zzacb(context, looper, zzg, connectioncallbacks, onconnectionfailedlistener);
	//    0    0:new             #22  <Class zzacb>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           5
	//    6    9:aload           6
	//    7   11:invokespecial   #25  <Method void zzacb(Context, Looper, zzg, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    8   14:areturn         
	}

	zzabx$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void com.google.android.gms.common.api.Api$zza()>
	//    2    4:return          
	}
}
