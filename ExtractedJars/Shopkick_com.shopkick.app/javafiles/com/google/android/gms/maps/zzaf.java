// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzbm;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

// Referenced classes of package com.google.android.gms.maps:
//			StreetViewPanorama

final class zzaf extends zzbm
{

	zzaf(StreetViewPanorama streetviewpanorama, StreetViewPanorama.OnStreetViewPanoramaClickListener onstreetviewpanoramaclicklistener)
	{
		zzbq = onstreetviewpanoramaclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #10  <Field StreetViewPanorama$OnStreetViewPanoramaClickListener zzbq>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void zzbm()>
	//    5    9:return          
	}

	public final void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetviewpanoramaorientation)
	{
		zzbq.onStreetViewPanoramaClick(streetviewpanoramaorientation);
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field StreetViewPanorama$OnStreetViewPanoramaClickListener zzbq>
	//    2    4:aload_1         
	//    3    5:invokeinterface #20  <Method void StreetViewPanorama$OnStreetViewPanoramaClickListener.onStreetViewPanoramaClick(StreetViewPanoramaOrientation)>
	//    4   10:return          
	}

	private final StreetViewPanorama.OnStreetViewPanoramaClickListener zzbq;
}
