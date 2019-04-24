// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzlb, zzst, zztd

final class zztc extends zzlb
{

	zztc(zzst zzst1)
	{
		zzbnw = zzst1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field zzst zzbnw>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void zzlb()>
	//    5    9:return          
	}

	public final void onAppEvent(String s, String s1)
		throws RemoteException
	{
		zzst.zza(zzbnw).add(((Object) (new zztd(this, s, s1))));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzst zzbnw>
	//    2    4:invokestatic    #24  <Method List zzst.zza(zzst)>
	//    3    7:new             #26  <Class zztd>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokespecial   #29  <Method void zztd(zztc, String, String)>
	//    9   17:invokeinterface #35  <Method boolean List.add(Object)>
	//   10   22:pop             
	//   11   23:return          
	}

	private final zzst zzbnw;
}
