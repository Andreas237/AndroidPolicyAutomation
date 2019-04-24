// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import com.google.android.gms.maps.model.StreetViewPanoramaLocation;

// Referenced classes of package com.google.android.gms.maps:
//			StreetViewPanorama

class StreetViewPanorama$1 extends com.google.android.gms.maps.internal.zzac.zza
{

	public void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetviewpanoramalocation)
	{
		zzboB.onStreetViewPanoramaChange(streetviewpanoramalocation);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field StreetViewPanorama$OnStreetViewPanoramaChangeListener zzboB>
	//    2    4:aload_1         
	//    3    5:invokeinterface #25  <Method void StreetViewPanorama$OnStreetViewPanoramaChangeListener.onStreetViewPanoramaChange(StreetViewPanoramaLocation)>
	//    4   10:return          
	}

	final StreetViewPanoramaChangeListener zzboB;

	StreetViewPanorama$1(StreetViewPanorama streetviewpanorama, StreetViewPanoramaChangeListener streetviewpanoramachangelistener)
	{
		zzboB = streetviewpanoramachangelistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field StreetViewPanorama$OnStreetViewPanoramaChangeListener zzboB>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzac$zza()>
	//    5    9:return          
	}
}
