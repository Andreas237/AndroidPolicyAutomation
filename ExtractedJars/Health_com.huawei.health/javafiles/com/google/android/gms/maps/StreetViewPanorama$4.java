// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

// Referenced classes of package com.google.android.gms.maps:
//			StreetViewPanorama

class StreetViewPanorama$4 extends com.google.android.gms.maps.internal.zzae.zza
{

	public void onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation streetviewpanoramaorientation)
	{
		zzboE.onStreetViewPanoramaLongClick(streetviewpanoramaorientation);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field StreetViewPanorama$OnStreetViewPanoramaLongClickListener zzboE>
	//    2    4:aload_1         
	//    3    5:invokeinterface #25  <Method void StreetViewPanorama$OnStreetViewPanoramaLongClickListener.onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation)>
	//    4   10:return          
	}

	final StreetViewPanoramaLongClickListener zzboE;

	StreetViewPanorama$4(StreetViewPanorama streetviewpanorama, StreetViewPanoramaLongClickListener streetviewpanoramalongclicklistener)
	{
		zzboE = streetviewpanoramalongclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field StreetViewPanorama$OnStreetViewPanoramaLongClickListener zzboE>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzae$zza()>
	//    5    9:return          
	}
}
