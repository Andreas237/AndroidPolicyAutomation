// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;


// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap

class GoogleMap$22 extends com.google.android.gms.maps.internal.zzf.zza
{

	public void onCameraIdle()
	{
		zzbnU.onCameraIdle();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GoogleMap$OnCameraIdleListener zzbnU>
	//    2    4:invokeinterface #24  <Method void GoogleMap$OnCameraIdleListener.onCameraIdle()>
	//    3    9:return          
	}

	final ameraIdleListener zzbnU;

	GoogleMap$22(GoogleMap googlemap, ameraIdleListener ameraidlelistener)
	{
		zzbnU = ameraidlelistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field GoogleMap$OnCameraIdleListener zzbnU>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzf$zza()>
	//    5    9:return          
	}
}
