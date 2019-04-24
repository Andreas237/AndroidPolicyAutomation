// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.location.Location;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap

class GoogleMap$8 extends com.google.android.gms.maps.internal.zzx.zza
{

	public void zzG(IObjectWrapper iobjectwrapper)
	{
		zzbnF.onMyLocationChange((Location)zzd.zzF(iobjectwrapper));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GoogleMap$OnMyLocationChangeListener zzbnF>
	//    2    4:aload_1         
	//    3    5:invokestatic    #27  <Method Object zzd.zzF(IObjectWrapper)>
	//    4    8:checkcast       #29  <Class Location>
	//    5   11:invokeinterface #35  <Method void GoogleMap$OnMyLocationChangeListener.onMyLocationChange(Location)>
	//    6   16:return          
	}

	final MyLocationChangeListener zzbnF;

	GoogleMap$8(GoogleMap googlemap, MyLocationChangeListener mylocationchangelistener)
	{
		zzbnF = mylocationchangelistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field GoogleMap$OnMyLocationChangeListener zzbnF>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzx$zza()>
	//    5    9:return          
	}
}
