// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.internal.zzc;

// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap

class GoogleMap$11 extends com.google.android.gms.maps.internal.zzk.zza
{

	public void zza(zzc zzc)
	{
		zzbnI.onGroundOverlayClick(new GroundOverlay(zzc));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GoogleMap$OnGroundOverlayClickListener zzbnI>
	//    2    4:new             #23  <Class GroundOverlay>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #25  <Method void GroundOverlay(zzc)>
	//    6   12:invokeinterface #31  <Method void GoogleMap$OnGroundOverlayClickListener.onGroundOverlayClick(GroundOverlay)>
	//    7   17:return          
	}

	final roundOverlayClickListener zzbnI;

	GoogleMap$11(GoogleMap googlemap, roundOverlayClickListener roundoverlayclicklistener)
	{
		zzbnI = roundoverlayclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field GoogleMap$OnGroundOverlayClickListener zzbnI>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzk$zza()>
	//    5    9:return          
	}
}
