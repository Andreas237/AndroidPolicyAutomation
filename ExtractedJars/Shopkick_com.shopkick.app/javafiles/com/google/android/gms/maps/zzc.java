// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzt;
import com.google.android.gms.maps.internal.zzau;
import com.google.android.gms.maps.model.Marker;

// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap

final class zzc extends zzau
{

	zzc(GoogleMap googlemap, GoogleMap.OnMarkerDragListener onmarkerdraglistener)
	{
		zzk = onmarkerdraglistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #10  <Field GoogleMap$OnMarkerDragListener zzk>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void zzau()>
	//    5    9:return          
	}

	public final void zzb(zzt zzt)
	{
		zzk.onMarkerDragStart(new Marker(zzt));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field GoogleMap$OnMarkerDragListener zzk>
	//    2    4:new             #18  <Class Marker>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #20  <Method void Marker(zzt)>
	//    6   12:invokeinterface #26  <Method void GoogleMap$OnMarkerDragListener.onMarkerDragStart(Marker)>
	//    7   17:return          
	}

	public final void zzc(zzt zzt)
	{
		zzk.onMarkerDragEnd(new Marker(zzt));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field GoogleMap$OnMarkerDragListener zzk>
	//    2    4:new             #18  <Class Marker>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #20  <Method void Marker(zzt)>
	//    6   12:invokeinterface #30  <Method void GoogleMap$OnMarkerDragListener.onMarkerDragEnd(Marker)>
	//    7   17:return          
	}

	public final void zzd(zzt zzt)
	{
		zzk.onMarkerDrag(new Marker(zzt));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field GoogleMap$OnMarkerDragListener zzk>
	//    2    4:new             #18  <Class Marker>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #20  <Method void Marker(zzt)>
	//    6   12:invokeinterface #34  <Method void GoogleMap$OnMarkerDragListener.onMarkerDrag(Marker)>
	//    7   17:return          
	}

	private final GoogleMap.OnMarkerDragListener zzk;
}
