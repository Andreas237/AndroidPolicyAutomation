// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.location.LocationListener;

// Referenced classes of package com.google.android.gms.internal:
//			zzasg

class zzasg$zzb$1
	implements zzabh.zzc
{

	public void zza(LocationListener locationlistener)
	{
		locationlistener.onLocationChanged(zzbkJ);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field Location zzbkJ>
	//    3    5:invokeinterface #30  <Method void LocationListener.onLocationChanged(Location)>
	//    4   10:return          
	}

	public void zzs(Object obj)
	{
		zza((LocationListener)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #29  <Class LocationListener>
	//    3    5:invokevirtual   #34  <Method void zza(LocationListener)>
	//    4    8:return          
	}

	public void zzwc()
	{
	//    0    0:return          
	}

	final Location zzbkJ;

	zzasg$zzb$1(zzasg.zzb zzb1, Location location)
	{
		zzbkJ = location;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #21  <Field Location zzbkJ>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
	//    5    9:return          
	}
}
