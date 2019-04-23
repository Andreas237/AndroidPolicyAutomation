// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzbq;

// Referenced classes of package com.google.android.gms.maps:
//			StreetViewPanorama, OnStreetViewPanoramaReadyCallback

final class zzaj extends zzbq
{

	zzaj(StreetViewPanoramaView.zza zza1, OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
	{
		zzbu = onstreetviewpanoramareadycallback;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #10  <Field OnStreetViewPanoramaReadyCallback zzbu>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void zzbq()>
	//    5    9:return          
	}

	public final void zza(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
		throws RemoteException
	{
		zzbu.onStreetViewPanoramaReady(new StreetViewPanorama(istreetviewpanoramadelegate));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field OnStreetViewPanoramaReadyCallback zzbu>
	//    2    4:new             #20  <Class StreetViewPanorama>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #22  <Method void StreetViewPanorama(IStreetViewPanoramaDelegate)>
	//    6   12:invokeinterface #28  <Method void OnStreetViewPanoramaReadyCallback.onStreetViewPanoramaReady(StreetViewPanorama)>
	//    7   17:return          
	}

	private final OnStreetViewPanoramaReadyCallback zzbu;
}
