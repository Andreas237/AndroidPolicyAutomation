// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.location.LocationStatusCodes;

// Referenced classes of package com.google.android.gms.internal:
//			zzash

static final class zzash$zza extends zzasd$zza
{

	public void zza(int i, PendingIntent pendingintent)
	{
		Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult");
	//    0    0:ldc1            #23  <String "LocationClientImpl">
	//    1    2:ldc1            #25  <String "Unexpected call to onRemoveGeofencesByPendingIntentResult">
	//    2    4:invokestatic    #31  <Method int Log.wtf(String, String)>
	//    3    7:pop             
	//    4    8:return          
	}

	public void zza(int i, String as[])
	{
		if(zzbkL == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field zzaad$zzb zzbkL>
	//*   2    4:ifnonnull       16
		{
			Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
	//    3    7:ldc1            #23  <String "LocationClientImpl">
	//    4    9:ldc1            #34  <String "onAddGeofenceResult called multiple times">
	//    5   11:invokestatic    #31  <Method int Log.wtf(String, String)>
	//    6   14:pop             
			return;
	//    7   15:return          
		} else
		{
			as = ((String []) (LocationStatusCodes.zzkt(LocationStatusCodes.zzks(i))));
	//    8   16:iload_1         
	//    9   17:invokestatic    #40  <Method int LocationStatusCodes.zzks(int)>
	//   10   20:invokestatic    #44  <Method com.google.android.gms.common.api.Status LocationStatusCodes.zzkt(int)>
	//   11   23:astore_2        
			zzbkL.setResult(((Object) (as)));
	//   12   24:aload_0         
	//   13   25:getfield        #17  <Field zzaad$zzb zzbkL>
	//   14   28:aload_2         
	//   15   29:invokeinterface #50  <Method void zzaad$zzb.setResult(Object)>
			zzbkL = null;
	//   16   34:aload_0         
	//   17   35:aconst_null     
	//   18   36:putfield        #17  <Field zzaad$zzb zzbkL>
			return;
	//   19   39:return          
		}
	}

	public void zzb(int i, String as[])
	{
		Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult");
	//    0    0:ldc1            #23  <String "LocationClientImpl">
	//    1    2:ldc1            #53  <String "Unexpected call to onRemoveGeofencesByRequestIdsResult">
	//    2    4:invokestatic    #31  <Method int Log.wtf(String, String)>
	//    3    7:pop             
	//    4    8:return          
	}

	private zzaad$zzb zzbkL;

	public zzash$zza(zzaad$zzb zzaad$zzb1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void zzasd$zza()>
		zzbkL = zzaad$zzb1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field zzaad$zzb zzbkL>
	//    5    9:return          
	}
}
