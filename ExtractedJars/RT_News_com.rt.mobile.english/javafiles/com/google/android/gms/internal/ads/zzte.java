// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzoe, zzst, zztf, zzoa

final class zzte extends zzoe
{

	zzte(zzst zzst1)
	{
		zzbnw = zzst1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field zzst zzbnw>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void zzoe()>
	//    5    9:return          
	}

	public final void zza(zzoa zzoa)
		throws RemoteException
	{
		zzst.zza(zzbnw).add(((Object) (new zztf(this, zzoa))));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzst zzbnw>
	//    2    4:invokestatic    #23  <Method List zzst.zza(zzst)>
	//    3    7:new             #25  <Class zztf>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #28  <Method void zztf(zzte, zzoa)>
	//    8   16:invokeinterface #34  <Method boolean List.add(Object)>
	//    9   21:pop             
	//   10   22:return          
	}

	private final zzst zzbnw;
}
