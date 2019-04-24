// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap

class GoogleMap$10 extends com.google.android.gms.maps.internal.zzr.zza
{

	public void onMapLoaded()
		throws RemoteException
	{
		zzbnH.onMapLoaded();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GoogleMap$OnMapLoadedCallback zzbnH>
	//    2    4:invokeinterface #26  <Method void GoogleMap$OnMapLoadedCallback.onMapLoaded()>
	//    3    9:return          
	}

	final apLoadedCallback zzbnH;

	GoogleMap$10(GoogleMap googlemap, apLoadedCallback aploadedcallback)
	{
		zzbnH = aploadedcallback;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field GoogleMap$OnMapLoadedCallback zzbnH>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzr$zza()>
	//    5    9:return          
	}
}
