// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;


// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap

class GoogleMap$21 extends com.google.android.gms.maps.internal.zzg.zza
{

	public void onCameraMoveCanceled()
	{
		zzbnT.onCameraMoveCanceled();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GoogleMap$OnCameraMoveCanceledListener zzbnT>
	//    2    4:invokeinterface #24  <Method void GoogleMap$OnCameraMoveCanceledListener.onCameraMoveCanceled()>
	//    3    9:return          
	}

	final ameraMoveCanceledListener zzbnT;

	GoogleMap$21(GoogleMap googlemap, ameraMoveCanceledListener ameramovecanceledlistener)
	{
		zzbnT = ameramovecanceledlistener;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field GoogleMap$OnCameraMoveCanceledListener zzbnT>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzg$zza()>
	//    5    9:return          
	}
}
