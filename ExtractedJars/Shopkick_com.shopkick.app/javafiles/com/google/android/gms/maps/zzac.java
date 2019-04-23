// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zzaq;

// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap, OnMapReadyCallback

final class zzac extends zzaq
{

	zzac(MapView.zza zza1, OnMapReadyCallback onmapreadycallback)
	{
		zzbb = onmapreadycallback;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #10  <Field OnMapReadyCallback zzbb>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void zzaq()>
	//    5    9:return          
	}

	public final void zza(IGoogleMapDelegate igooglemapdelegate)
		throws RemoteException
	{
		zzbb.onMapReady(new GoogleMap(igooglemapdelegate));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field OnMapReadyCallback zzbb>
	//    2    4:new             #20  <Class GoogleMap>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #22  <Method void GoogleMap(IGoogleMapDelegate)>
	//    6   12:invokeinterface #28  <Method void OnMapReadyCallback.onMapReady(GoogleMap)>
	//    7   17:return          
	}

	private final OnMapReadyCallback zzbb;
}
