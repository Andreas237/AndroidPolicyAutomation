// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.internal.zzf;

// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap

class GoogleMap$3 extends com.google.android.gms.maps.internal.zzv.zza
{

	public void zzb(zzf zzf)
	{
		zzbnA.onMarkerDragStart(new Marker(zzf));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GoogleMap$OnMarkerDragListener zzbnA>
	//    2    4:new             #23  <Class Marker>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #25  <Method void Marker(zzf)>
	//    6   12:invokeinterface #31  <Method void GoogleMap$OnMarkerDragListener.onMarkerDragStart(Marker)>
	//    7   17:return          
	}

	public void zzc(zzf zzf)
	{
		zzbnA.onMarkerDragEnd(new Marker(zzf));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GoogleMap$OnMarkerDragListener zzbnA>
	//    2    4:new             #23  <Class Marker>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #25  <Method void Marker(zzf)>
	//    6   12:invokeinterface #35  <Method void GoogleMap$OnMarkerDragListener.onMarkerDragEnd(Marker)>
	//    7   17:return          
	}

	public void zzd(zzf zzf)
	{
		zzbnA.onMarkerDrag(new Marker(zzf));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GoogleMap$OnMarkerDragListener zzbnA>
	//    2    4:new             #23  <Class Marker>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #25  <Method void Marker(zzf)>
	//    6   12:invokeinterface #39  <Method void GoogleMap$OnMarkerDragListener.onMarkerDrag(Marker)>
	//    7   17:return          
	}

	final MarkerDragListener zzbnA;

	GoogleMap$3(GoogleMap googlemap, MarkerDragListener markerdraglistener)
	{
		zzbnA = markerdraglistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field GoogleMap$OnMarkerDragListener zzbnA>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzv$zza()>
	//    5    9:return          
	}
}
