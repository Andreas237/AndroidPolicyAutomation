// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;


// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap

class GoogleMap$19 extends com.google.android.gms.maps.internal.zzi.zza
{

	public void onCameraMoveStarted(int i)
	{
		zzbnR.onCameraMoveStarted(i);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GoogleMap$OnCameraMoveStartedListener zzbnR>
	//    2    4:iload_1         
	//    3    5:invokeinterface #25  <Method void GoogleMap$OnCameraMoveStartedListener.onCameraMoveStarted(int)>
	//    4   10:return          
	}

	final ameraMoveStartedListener zzbnR;

	GoogleMap$19(GoogleMap googlemap, ameraMoveStartedListener ameramovestartedlistener)
	{
		zzbnR = ameramovestartedlistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field GoogleMap$OnCameraMoveStartedListener zzbnR>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzi$zza()>
	//    5    9:return          
	}
}
