// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.zzg;

// Referenced classes of package com.google.android.gms.internal:
//			zzaxm, zzaxy

final class zzaxm$2 extends com.google.android.gms.common.api.Api$zza
{

	public volatile com.google.android.gms.common.api.Api$zze zza(Context context, Looper looper, zzg zzg, Object obj, com.google.android.gms.common.api.iClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.iClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		return ((com.google.android.gms.common.api.Api$zze) (zza(context, looper, zzg, (a)obj, connectioncallbacks, onconnectionfailedlistener)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:checkcast       #16  <Class zzaxm$zza>
	//    6    9:aload           5
	//    7   11:aload           6
	//    8   13:invokevirtual   #19  <Method zzaxy zza(Context, Looper, zzg, zzaxm$zza, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    9   16:areturn         
	}

	public zzaxy zza(Context context, Looper looper, zzg zzg, a a, com.google.android.gms.common.api.iClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.iClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		return new zzaxy(context, looper, false, zzg, a.zzOd(), connectioncallbacks, onconnectionfailedlistener);
	//    0    0:new             #21  <Class zzaxy>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iconst_0        
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokevirtual   #25  <Method android.os.Bundle zzaxm$zza.zzOd()>
	//    8   13:aload           5
	//    9   15:aload           6
	//   10   17:invokespecial   #28  <Method void zzaxy(Context, Looper, boolean, zzg, android.os.Bundle, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   11   20:areturn         
	}

	zzaxm$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void com.google.android.gms.common.api.Api$zza()>
	//    2    4:return          
	}
}
