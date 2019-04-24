// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

// Referenced classes of package com.google.android.gms.maps:
//			StreetViewPanorama

class StreetViewPanorama$2 extends com.google.android.gms.maps.internal.zzab.zza
{

	public void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetviewpanoramacamera)
	{
		zzboC.onStreetViewPanoramaCameraChange(streetviewpanoramacamera);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field StreetViewPanorama$OnStreetViewPanoramaCameraChangeListener zzboC>
	//    2    4:aload_1         
	//    3    5:invokeinterface #25  <Method void StreetViewPanorama$OnStreetViewPanoramaCameraChangeListener.onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera)>
	//    4   10:return          
	}

	final StreetViewPanoramaCameraChangeListener zzboC;

	StreetViewPanorama$2(StreetViewPanorama streetviewpanorama, StreetViewPanoramaCameraChangeListener streetviewpanoramacamerachangelistener)
	{
		zzboC = streetviewpanoramacamerachangelistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field StreetViewPanorama$OnStreetViewPanoramaCameraChangeListener zzboC>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzab$zza()>
	//    5    9:return          
	}
}
