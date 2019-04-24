// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap

class GoogleMap$23 extends com.google.android.gms.maps.internal.zzq.zza
{

	public void onMapClick(LatLng latlng)
	{
		zzbnV.onMapClick(latlng);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GoogleMap$OnMapClickListener zzbnV>
	//    2    4:aload_1         
	//    3    5:invokeinterface #25  <Method void GoogleMap$OnMapClickListener.onMapClick(LatLng)>
	//    4   10:return          
	}

	final apClickListener zzbnV;

	GoogleMap$23(GoogleMap googlemap, apClickListener apclicklistener)
	{
		zzbnV = apclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field GoogleMap$OnMapClickListener zzbnV>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzq$zza()>
	//    5    9:return          
	}
}
