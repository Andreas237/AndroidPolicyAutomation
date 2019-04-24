// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap

class GoogleMap$16 extends com.google.android.gms.maps.internal.zzag.zza
{

	public void onSnapshotReady(Bitmap bitmap)
		throws RemoteException
	{
		zzbnO.onSnapshotReady(bitmap);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GoogleMap$SnapshotReadyCallback zzbnO>
	//    2    4:aload_1         
	//    3    5:invokeinterface #27  <Method void GoogleMap$SnapshotReadyCallback.onSnapshotReady(Bitmap)>
	//    4   10:return          
	}

	public void zzH(IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
		zzbnO.onSnapshotReady((Bitmap)zzd.zzF(iobjectwrapper));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field GoogleMap$SnapshotReadyCallback zzbnO>
	//    2    4:aload_1         
	//    3    5:invokestatic    #36  <Method Object zzd.zzF(IObjectWrapper)>
	//    4    8:checkcast       #38  <Class Bitmap>
	//    5   11:invokeinterface #27  <Method void GoogleMap$SnapshotReadyCallback.onSnapshotReady(Bitmap)>
	//    6   16:return          
	}

	final pshotReadyCallback zzbnO;

	GoogleMap$16(GoogleMap googlemap, pshotReadyCallback pshotreadycallback)
	{
		zzbnO = pshotreadycallback;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field GoogleMap$SnapshotReadyCallback zzbnO>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void com.google.android.gms.maps.internal.zzag$zza()>
	//    5    9:return          
	}
}
