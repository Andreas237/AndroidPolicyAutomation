// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzts, zztt, zzkh, zzsu

final class zztb
	implements zzts
{

	zztb(zzsu zzsu)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final void zzb(zztt zztt1)
		throws RemoteException
	{
		if(zztt1.zzxs != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #22  <Field zzkh zztt.zzxs>
	//*   2    4:ifnull          16
			zztt1.zzxs.onAdClicked();
	//    3    7:aload_1         
	//    4    8:getfield        #22  <Field zzkh zztt.zzxs>
	//    5   11:invokeinterface #27  <Method void zzkh.onAdClicked()>
	//    6   16:return          
	}
}
