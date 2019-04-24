// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.internal.zzf;

// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap

class GoogleMap$5 extends com.google.android.gms.maps.internal.zzo.zza
{

	public void zzf(zzf zzf1)
	{
		zzbnC.onInfoWindowLongClick(new Marker(zzf1));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GoogleMap$OnInfoWindowLongClickListener zzbnC>
	//    2    4:new             #23  <Class Marker>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #25  <Method void Marker(zzf)>
	//    6   12:invokeinterface #31  <Method void GoogleMap$OnInfoWindowLongClickListener.onInfoWindowLongClick(Marker)>
	//    7   17:return          
	}

	final InfoWindowLongClickListener zzbnC;

	GoogleMap$5(GoogleMap googlemap, InfoWindowLongClickListener infowindowlongclicklistener)
	{
		zzbnC = infowindowlongclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field GoogleMap$OnInfoWindowLongClickListener zzbnC>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzo$zza()>
	//    5    9:return          
	}
}
