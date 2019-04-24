// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;

// Referenced classes of package com.google.android.gms.maps:
//			StreetViewPanoramaFragment, StreetViewPanorama, OnStreetViewPanoramaReadyCallback

class StreetViewPanoramaFragment$zza$1 extends com.google.android.gms.maps.internal.zzaf.zza
{

	public void zza(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
		throws RemoteException
	{
		zzboH.onStreetViewPanoramaReady(new StreetViewPanorama(istreetviewpanoramadelegate));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OnStreetViewPanoramaReadyCallback zzboH>
	//    2    4:new             #27  <Class StreetViewPanorama>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #29  <Method void StreetViewPanorama(IStreetViewPanoramaDelegate)>
	//    6   12:invokeinterface #35  <Method void OnStreetViewPanoramaReadyCallback.onStreetViewPanoramaReady(StreetViewPanorama)>
	//    7   17:return          
	}

	final OnStreetViewPanoramaReadyCallback zzboH;

	StreetViewPanoramaFragment$zza$1(StreetViewPanoramaFragment.zza zza1, OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
	{
		zzboH = onstreetviewpanoramareadycallback;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #18  <Field OnStreetViewPanoramaReadyCallback zzboH>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void com.google.android.gms.maps.internal.zzaf$zza()>
	//    5    9:return          
	}
}
