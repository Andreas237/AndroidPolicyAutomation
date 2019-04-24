// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.model.PointOfInterest;

// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap

class GoogleMap$17 extends com.google.android.gms.maps.internal.zzy.zza
{

	public void zza(PointOfInterest pointofinterest)
		throws RemoteException
	{
		zzbnP.onPoiClick(pointofinterest);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GoogleMap$OnPoiClickListener zzbnP>
	//    2    4:aload_1         
	//    3    5:invokeinterface #28  <Method void GoogleMap$OnPoiClickListener.onPoiClick(PointOfInterest)>
	//    4   10:return          
	}

	final oiClickListener zzbnP;

	GoogleMap$17(GoogleMap googlemap, oiClickListener oiclicklistener)
	{
		zzbnP = oiclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field GoogleMap$OnPoiClickListener zzbnP>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzy$zza()>
	//    5    9:return          
	}
}
