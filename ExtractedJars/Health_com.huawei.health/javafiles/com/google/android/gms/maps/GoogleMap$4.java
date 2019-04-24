// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.internal.zzf;

// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap

class GoogleMap$4 extends com.google.android.gms.maps.internal.zzm.zza
{

	public void zze(zzf zzf)
	{
		zzbnB.onInfoWindowClick(new Marker(zzf));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GoogleMap$OnInfoWindowClickListener zzbnB>
	//    2    4:new             #23  <Class Marker>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #25  <Method void Marker(zzf)>
	//    6   12:invokeinterface #31  <Method void GoogleMap$OnInfoWindowClickListener.onInfoWindowClick(Marker)>
	//    7   17:return          
	}

	final InfoWindowClickListener zzbnB;

	GoogleMap$4(GoogleMap googlemap, InfoWindowClickListener infowindowclicklistener)
	{
		zzbnB = infowindowclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field GoogleMap$OnInfoWindowClickListener zzbnB>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzm$zza()>
	//    5    9:return          
	}
}
