// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.wearable.internal.zzcx;

// Referenced classes of package com.google.android.gms.wearable:
//			Wearable

final class Wearable$1 extends com.google.android.gms.common.api.Api.zza
{

	public volatile com.google.android.gms.common.api.Api.zze zza(Context context, Looper looper, zzg zzg, Object obj, com.google.android.gms.common.api.ient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.ient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		return ((com.google.android.gms.common.api.Api.zze) (zza(context, looper, zzg, (arableOptions)obj, connectioncallbacks, onconnectionfailedlistener)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:checkcast       #16  <Class Wearable$WearableOptions>
	//    6    9:aload           5
	//    7   11:aload           6
	//    8   13:invokevirtual   #19  <Method zzcx zza(Context, Looper, zzg, Wearable$WearableOptions, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//    9   16:areturn         
	}

	public zzcx zza(Context context, Looper looper, zzg zzg, arableOptions arableoptions, com.google.android.gms.common.api.ient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.ient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		if(arableoptions == null)
	//*   0    0:aload           4
	//*   1    2:ifnull          8
	//*   2    5:goto            24
			new arableOptions(new arableOptions.Builder(), ((Wearable$1) (null)));
	//    3    8:new             #16  <Class Wearable$WearableOptions>
	//    4   11:dup             
	//    5   12:new             #21  <Class Wearable$WearableOptions$Builder>
	//    6   15:dup             
	//    7   16:invokespecial   #22  <Method void Wearable$WearableOptions$Builder()>
	//    8   19:aconst_null     
	//    9   20:invokespecial   #25  <Method void Wearable$WearableOptions(Wearable$WearableOptions$Builder, Wearable$1)>
	//   10   23:pop             
		return new zzcx(context, looper, connectioncallbacks, onconnectionfailedlistener, zzg);
	//   11   24:new             #27  <Class zzcx>
	//   12   27:dup             
	//   13   28:aload_1         
	//   14   29:aload_2         
	//   15   30:aload           5
	//   16   32:aload           6
	//   17   34:aload_3         
	//   18   35:invokespecial   #30  <Method void zzcx(Context, Looper, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener, zzg)>
	//   19   38:areturn         
	}

	Wearable$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void com.google.android.gms.common.api.Api$zza()>
	//    2    4:return          
	}
}
