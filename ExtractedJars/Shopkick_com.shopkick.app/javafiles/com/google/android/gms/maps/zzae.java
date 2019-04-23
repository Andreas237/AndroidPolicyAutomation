// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzbi;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

// Referenced classes of package com.google.android.gms.maps:
//			StreetViewPanorama

final class zzae extends zzbi
{

	zzae(StreetViewPanorama streetviewpanorama, StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener onstreetviewpanoramacamerachangelistener)
	{
		zzbp = onstreetviewpanoramacamerachangelistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #10  <Field StreetViewPanorama$OnStreetViewPanoramaCameraChangeListener zzbp>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void zzbi()>
	//    5    9:return          
	}

	public final void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetviewpanoramacamera)
	{
		zzbp.onStreetViewPanoramaCameraChange(streetviewpanoramacamera);
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field StreetViewPanorama$OnStreetViewPanoramaCameraChangeListener zzbp>
	//    2    4:aload_1         
	//    3    5:invokeinterface #20  <Method void StreetViewPanorama$OnStreetViewPanoramaCameraChangeListener.onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera)>
	//    4   10:return          
	}

	private final StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener zzbp;
}
