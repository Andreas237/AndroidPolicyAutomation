// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;


// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap

class GoogleMap$20 extends com.google.android.gms.maps.internal.zzh.zza
{

	public void onCameraMove()
	{
		zzbnS.onCameraMove();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GoogleMap$OnCameraMoveListener zzbnS>
	//    2    4:invokeinterface #24  <Method void GoogleMap$OnCameraMoveListener.onCameraMove()>
	//    3    9:return          
	}

	final ameraMoveListener zzbnS;

	GoogleMap$20(GoogleMap googlemap, ameraMoveListener ameramovelistener)
	{
		zzbnS = ameramovelistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field GoogleMap$OnCameraMoveListener zzbnS>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzh$zza()>
	//    5    9:return          
	}
}
