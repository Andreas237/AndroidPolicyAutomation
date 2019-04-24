// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;

// Referenced classes of package com.google.android.gms.maps:
//			SupportMapFragment, GoogleMap, OnMapReadyCallback

class SupportMapFragment$zza$1 extends com.google.android.gms.maps.internal.zzt.zza
{

	public void zza(IGoogleMapDelegate igooglemapdelegate)
		throws RemoteException
	{
		zzboq.onMapReady(new GoogleMap(igooglemapdelegate));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OnMapReadyCallback zzboq>
	//    2    4:new             #27  <Class GoogleMap>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #29  <Method void GoogleMap(IGoogleMapDelegate)>
	//    6   12:invokeinterface #35  <Method void OnMapReadyCallback.onMapReady(GoogleMap)>
	//    7   17:return          
	}

	final OnMapReadyCallback zzboq;

	SupportMapFragment$zza$1(SupportMapFragment.zza zza1, OnMapReadyCallback onmapreadycallback)
	{
		zzboq = onmapreadycallback;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #18  <Field OnMapReadyCallback zzboq>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void com.google.android.gms.maps.internal.zzt$zza()>
	//    5    9:return          
	}
}
