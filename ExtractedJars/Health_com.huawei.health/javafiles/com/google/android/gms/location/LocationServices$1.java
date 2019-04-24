// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.internal.zzash;

// Referenced classes of package com.google.android.gms.location:
//			LocationServices

final class LocationServices$1 extends com.google.android.gms.common.api.Api.zza
{

	public com.google.android.gms.common.api.Api.zze zza(Context context, Looper looper, zzg zzg, Object obj, com.google.android.gms.common.api.nectionCallbacks nectioncallbacks, com.google.android.gms.common.api.onnectionFailedListener onnectionfailedlistener)
	{
		return ((com.google.android.gms.common.api.Api.zze) (zzq(context, looper, zzg, (com.google.android.gms.common.api.tions)obj, nectioncallbacks, onnectionfailedlistener)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:checkcast       #16  <Class com.google.android.gms.common.api.Api$ApiOptions$NoOptions>
	//    6    9:aload           5
	//    7   11:aload           6
	//    8   13:invokevirtual   #20  <Method zzash zzq(Context, Looper, zzg, com.google.android.gms.common.api.Api$ApiOptions$NoOptions, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    9   16:areturn         
	}

	public zzash zzq(Context context, Looper looper, zzg zzg, com.google.android.gms.common.api.tions tions, com.google.android.gms.common.api.nectionCallbacks nectioncallbacks, com.google.android.gms.common.api.onnectionFailedListener onnectionfailedlistener)
	{
		return new zzash(context, looper, nectioncallbacks, onnectionfailedlistener, "locationServices", zzg);
	//    0    0:new             #22  <Class zzash>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload           5
	//    5    8:aload           6
	//    6   10:ldc1            #24  <String "locationServices">
	//    7   12:aload_3         
	//    8   13:invokespecial   #27  <Method void zzash(Context, Looper, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener, String, zzg)>
	//    9   16:areturn         
	}

	LocationServices$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void com.google.android.gms.common.api.Api$zza()>
	//    2    4:return          
	}
}
