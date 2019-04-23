// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzbk;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;

// Referenced classes of package com.google.android.gms.maps:
//			StreetViewPanorama

final class zzad extends zzbk
{

	zzad(StreetViewPanorama streetviewpanorama, StreetViewPanorama.OnStreetViewPanoramaChangeListener onstreetviewpanoramachangelistener)
	{
		zzbo = onstreetviewpanoramachangelistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #10  <Field StreetViewPanorama$OnStreetViewPanoramaChangeListener zzbo>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void zzbk()>
	//    5    9:return          
	}

	public final void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetviewpanoramalocation)
	{
		zzbo.onStreetViewPanoramaChange(streetviewpanoramalocation);
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field StreetViewPanorama$OnStreetViewPanoramaChangeListener zzbo>
	//    2    4:aload_1         
	//    3    5:invokeinterface #20  <Method void StreetViewPanorama$OnStreetViewPanoramaChangeListener.onStreetViewPanoramaChange(StreetViewPanoramaLocation)>
	//    4   10:return          
	}

	private final StreetViewPanorama.OnStreetViewPanoramaChangeListener zzbo;
}
