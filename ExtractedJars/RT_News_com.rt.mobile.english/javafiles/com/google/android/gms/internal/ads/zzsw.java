// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzts, zztt, zzkh, zzsu

final class zzsw
	implements zzts
{

	zzsw(zzsu zzsu, int i)
	{
		zzbnx = i;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #12  <Field int zzbnx>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void zzb(zztt zztt1)
		throws RemoteException
	{
		if(zztt1.zzxs != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #26  <Field zzkh zztt.zzxs>
	//*   2    4:ifnull          20
			zztt1.zzxs.onAdFailedToLoad(zzbnx);
	//    3    7:aload_1         
	//    4    8:getfield        #26  <Field zzkh zztt.zzxs>
	//    5   11:aload_0         
	//    6   12:getfield        #12  <Field int zzbnx>
	//    7   15:invokeinterface #32  <Method void zzkh.onAdFailedToLoad(int)>
	//    8   20:return          
	}

	private final int zzbnx;
}
