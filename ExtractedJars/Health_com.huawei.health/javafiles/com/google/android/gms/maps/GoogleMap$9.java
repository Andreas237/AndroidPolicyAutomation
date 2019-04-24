// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap

class GoogleMap$9 extends com.google.android.gms.maps.internal.zzw.zza
{

	public boolean onMyLocationButtonClick()
		throws RemoteException
	{
		return zzbnG.onMyLocationButtonClick();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GoogleMap$OnMyLocationButtonClickListener zzbnG>
	//    2    4:invokeinterface #27  <Method boolean GoogleMap$OnMyLocationButtonClickListener.onMyLocationButtonClick()>
	//    3    9:ireturn         
	}

	final MyLocationButtonClickListener zzbnG;

	GoogleMap$9(GoogleMap googlemap, MyLocationButtonClickListener mylocationbuttonclicklistener)
	{
		zzbnG = mylocationbuttonclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field GoogleMap$OnMyLocationButtonClickListener zzbnG>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzw$zza()>
	//    5    9:return          
	}
}
