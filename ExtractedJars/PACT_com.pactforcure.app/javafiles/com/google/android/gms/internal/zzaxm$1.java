// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.zzg;

// Referenced classes of package com.google.android.gms.internal:
//			zzaxm, zzaxo, zzaxy

final class zzaxm$1 extends com.google.android.gms.common.api.Api$zza
{

	public volatile com.google.android.gms.common.api.Api$zze zza(Context context, Looper looper, zzg zzg, Object obj, com.google.android.gms.common.api.iClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.iClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		return ((com.google.android.gms.common.api.Api$zze) (zza(context, looper, zzg, (zzaxo)obj, connectioncallbacks, onconnectionfailedlistener)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:checkcast       #16  <Class zzaxo>
	//    6    9:aload           5
	//    7   11:aload           6
	//    8   13:invokevirtual   #19  <Method zzaxy zza(Context, Looper, zzg, zzaxo, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    9   16:areturn         
	}

	public zzaxy zza(Context context, Looper looper, zzg zzg, zzaxo zzaxo1, com.google.android.gms.common.api.iClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.iClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		if(zzaxo1 == null)
	//*   0    0:aload           4
	//*   1    2:ifnonnull       28
			zzaxo1 = zzaxo.zzbCg;
	//    2    5:getstatic       #23  <Field zzaxo zzaxo.zzbCg>
	//    3    8:astore          4
		return new zzaxy(context, looper, true, zzg, zzaxo1, connectioncallbacks, onconnectionfailedlistener);
	//    4   10:new             #25  <Class zzaxy>
	//    5   13:dup             
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:iconst_1        
	//    9   17:aload_3         
	//   10   18:aload           4
	//   11   20:aload           5
	//   12   22:aload           6
	//   13   24:invokespecial   #28  <Method void zzaxy(Context, Looper, boolean, zzg, zzaxo, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   14   27:areturn         
	//*  15   28:goto            10
	}

	zzaxm$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void com.google.android.gms.common.api.Api$zza()>
	//    2    4:return          
	}
}
