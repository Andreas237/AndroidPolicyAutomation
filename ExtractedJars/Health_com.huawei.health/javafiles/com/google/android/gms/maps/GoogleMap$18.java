// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap

class GoogleMap$18 extends com.google.android.gms.maps.internal.zze.zza
{

	public void onCameraChange(CameraPosition cameraposition)
	{
		zzbnQ.onCameraChange(cameraposition);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GoogleMap$OnCameraChangeListener zzbnQ>
	//    2    4:aload_1         
	//    3    5:invokeinterface #25  <Method void GoogleMap$OnCameraChangeListener.onCameraChange(CameraPosition)>
	//    4   10:return          
	}

	final ameraChangeListener zzbnQ;

	GoogleMap$18(GoogleMap googlemap, ameraChangeListener amerachangelistener)
	{
		zzbnQ = amerachangelistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field GoogleMap$OnCameraChangeListener zzbnQ>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zze$zza()>
	//    5    9:return          
	}
}
