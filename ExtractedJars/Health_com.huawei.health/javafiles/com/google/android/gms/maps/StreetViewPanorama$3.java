// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

// Referenced classes of package com.google.android.gms.maps:
//			StreetViewPanorama

class StreetViewPanorama$3 extends com.google.android.gms.maps.internal.zzad.zza
{

	public void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetviewpanoramaorientation)
	{
		zzboD.onStreetViewPanoramaClick(streetviewpanoramaorientation);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field StreetViewPanorama$OnStreetViewPanoramaClickListener zzboD>
	//    2    4:aload_1         
	//    3    5:invokeinterface #25  <Method void StreetViewPanorama$OnStreetViewPanoramaClickListener.onStreetViewPanoramaClick(StreetViewPanoramaOrientation)>
	//    4   10:return          
	}

	final StreetViewPanoramaClickListener zzboD;

	StreetViewPanorama$3(StreetViewPanorama streetviewpanorama, StreetViewPanoramaClickListener streetviewpanoramaclicklistener)
	{
		zzboD = streetviewpanoramaclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field StreetViewPanorama$OnStreetViewPanoramaClickListener zzboD>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzad$zza()>
	//    5    9:return          
	}
}
