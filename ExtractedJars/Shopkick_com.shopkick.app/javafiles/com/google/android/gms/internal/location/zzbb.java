// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.location.LocationStatusCodes;

// Referenced classes of package com.google.android.gms.internal.location:
//			zzan

final class zzbb extends zzan
{

	public zzbb(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void zzan()>
		zzdf = resultholder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder zzdf>
	//    5    9:return          
	}

	private final void zze(int i)
	{
		if(zzdf == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder zzdf>
	//*   2    4:ifnonnull       16
		{
			Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times");
	//    3    7:ldc1            #21  <String "LocationClientImpl">
	//    4    9:ldc1            #23  <String "onRemoveGeofencesResult called multiple times">
	//    5   11:invokestatic    #29  <Method int Log.wtf(String, String)>
	//    6   14:pop             
			return;
	//    7   15:return          
		} else
		{
			com.google.android.gms.common.api.Status status = LocationStatusCodes.zzd(LocationStatusCodes.zzc(i));
	//    8   16:iload_1         
	//    9   17:invokestatic    #35  <Method int LocationStatusCodes.zzc(int)>
	//   10   20:invokestatic    #39  <Method com.google.android.gms.common.api.Status LocationStatusCodes.zzd(int)>
	//   11   23:astore_2        
			zzdf.setResult(((Object) (status)));
	//   12   24:aload_0         
	//   13   25:getfield        #14  <Field com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder zzdf>
	//   14   28:aload_2         
	//   15   29:invokeinterface #45  <Method void com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder.setResult(Object)>
			zzdf = null;
	//   16   34:aload_0         
	//   17   35:aconst_null     
	//   18   36:putfield        #14  <Field com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder zzdf>
			return;
	//   19   39:return          
		}
	}

	public final void zza(int i, PendingIntent pendingintent)
	{
		zze(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #49  <Method void zze(int)>
	//    3    5:return          
	}

	public final void zza(int i, String as[])
	{
		Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult");
	//    0    0:ldc1            #21  <String "LocationClientImpl">
	//    1    2:ldc1            #52  <String "Unexpected call to onAddGeofencesResult">
	//    2    4:invokestatic    #29  <Method int Log.wtf(String, String)>
	//    3    7:pop             
	//    4    8:return          
	}

	public final void zzb(int i, String as[])
	{
		zze(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #49  <Method void zze(int)>
	//    3    5:return          
	}

	private com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder zzdf;
}
