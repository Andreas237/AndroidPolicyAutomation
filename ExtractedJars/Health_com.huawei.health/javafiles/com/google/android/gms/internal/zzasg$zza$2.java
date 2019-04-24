// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;

// Referenced classes of package com.google.android.gms.internal:
//			zzasg

class zzasg$zza$2
	implements zzabh.zzc
{

	public void zza(LocationCallback locationcallback)
	{
		locationcallback.onLocationAvailability(zzbkI);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field LocationAvailability zzbkI>
	//    3    5:invokevirtual   #29  <Method void LocationCallback.onLocationAvailability(LocationAvailability)>
	//    4    8:return          
	}

	public void zzs(Object obj)
	{
		zza((LocationCallback)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #28  <Class LocationCallback>
	//    3    5:invokevirtual   #33  <Method void zza(LocationCallback)>
	//    4    8:return          
	}

	public void zzwc()
	{
	//    0    0:return          
	}

	final LocationAvailability zzbkI;

	zzasg$zza$2(zzasg.zza zza1, LocationAvailability locationavailability)
	{
		zzbkI = locationavailability;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #21  <Field LocationAvailability zzbkI>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
	//    5    9:return          
	}
}
