// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.zzg;

// Referenced classes of package com.google.android.gms.internal:
//			zzbah, zzbaj, zzbat

final class zzbah$1 extends com.google.android.gms.common.api.Api$zza
{

	public volatile com.google.android.gms.common.api.Api$zze zza(Context context, Looper looper, zzg zzg, Object obj, com.google.android.gms.common.api.iClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.iClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		return ((com.google.android.gms.common.api.Api$zze) (zza(context, looper, zzg, (zzbaj)obj, connectioncallbacks, onconnectionfailedlistener)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:checkcast       #16  <Class zzbaj>
	//    6    9:aload           5
	//    7   11:aload           6
	//    8   13:invokevirtual   #19  <Method zzbat zza(Context, Looper, zzg, zzbaj, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    9   16:areturn         
	}

	public zzbat zza(Context context, Looper looper, zzg zzg, zzbaj zzbaj1, com.google.android.gms.common.api.iClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.iClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		zzbaj zzbaj2 = zzbaj1;
	//    0    0:aload           4
	//    1    2:astore          7
		if(zzbaj1 == null)
	//*   2    4:aload           4
	//*   3    6:ifnonnull       14
			zzbaj2 = zzbaj.zzbEi;
	//    4    9:getstatic       #23  <Field zzbaj zzbaj.zzbEi>
	//    5   12:astore          7
		return new zzbat(context, looper, true, zzg, zzbaj2, connectioncallbacks, onconnectionfailedlistener);
	//    6   14:new             #25  <Class zzbat>
	//    7   17:dup             
	//    8   18:aload_1         
	//    9   19:aload_2         
	//   10   20:iconst_1        
	//   11   21:aload_3         
	//   12   22:aload           7
	//   13   24:aload           5
	//   14   26:aload           6
	//   15   28:invokespecial   #28  <Method void zzbat(Context, Looper, boolean, zzg, zzbaj, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   16   31:areturn         
	}

	zzbah$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void com.google.android.gms.common.api.Api$zza()>
	//    2    4:return          
	}
}
