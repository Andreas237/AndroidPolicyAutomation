// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import com.google.android.gms.internal.maps.zzt;
import com.google.android.gms.maps.internal.zzas;
import com.google.android.gms.maps.model.Marker;

// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap

final class zzb extends zzas
{

	zzb(GoogleMap googlemap, GoogleMap.OnMarkerClickListener onmarkerclicklistener)
	{
		zzj = onmarkerclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #10  <Field GoogleMap$OnMarkerClickListener zzj>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void zzas()>
	//    5    9:return          
	}

	public final boolean zza(zzt zzt)
	{
		return zzj.onMarkerClick(new Marker(zzt));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field GoogleMap$OnMarkerClickListener zzj>
	//    2    4:new             #18  <Class Marker>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #21  <Method void Marker(zzt)>
	//    6   12:invokeinterface #27  <Method boolean GoogleMap$OnMarkerClickListener.onMarkerClick(Marker)>
	//    7   17:ireturn         
	}

	private final GoogleMap.OnMarkerClickListener zzj;
}
