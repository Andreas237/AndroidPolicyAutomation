// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzahf, zzst, zztm, zztp, 
//			zzto, zztj, zztk, zztq, 
//			zztl, zztn, zzagu

final class zzti extends zzahf
{

	zzti(zzst zzst1)
	{
		zzbnw = zzst1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field zzst zzbnw>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void zzahf()>
	//    5    9:return          
	}

	public final void onRewardedVideoAdClosed()
		throws RemoteException
	{
		zzst.zza(zzbnw).add(((Object) (new zztm(this))));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzst zzbnw>
	//    2    4:invokestatic    #23  <Method List zzst.zza(zzst)>
	//    3    7:new             #25  <Class zztm>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #28  <Method void zztm(zzti)>
	//    7   15:invokeinterface #34  <Method boolean List.add(Object)>
	//    8   20:pop             
	//    9   21:return          
	}

	public final void onRewardedVideoAdFailedToLoad(int i)
		throws RemoteException
	{
		zzst.zza(zzbnw).add(((Object) (new zztp(this, i))));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzst zzbnw>
	//    2    4:invokestatic    #23  <Method List zzst.zza(zzst)>
	//    3    7:new             #39  <Class zztp>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:invokespecial   #42  <Method void zztp(zzti, int)>
	//    8   16:invokeinterface #34  <Method boolean List.add(Object)>
	//    9   21:pop             
	//   10   22:return          
	}

	public final void onRewardedVideoAdLeftApplication()
		throws RemoteException
	{
		zzst.zza(zzbnw).add(((Object) (new zzto(this))));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzst zzbnw>
	//    2    4:invokestatic    #23  <Method List zzst.zza(zzst)>
	//    3    7:new             #45  <Class zzto>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #46  <Method void zzto(zzti)>
	//    7   15:invokeinterface #34  <Method boolean List.add(Object)>
	//    8   20:pop             
	//    9   21:return          
	}

	public final void onRewardedVideoAdLoaded()
		throws RemoteException
	{
		zzst.zza(zzbnw).add(((Object) (new zztj(this))));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzst zzbnw>
	//    2    4:invokestatic    #23  <Method List zzst.zza(zzst)>
	//    3    7:new             #49  <Class zztj>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #50  <Method void zztj(zzti)>
	//    7   15:invokeinterface #34  <Method boolean List.add(Object)>
	//    8   20:pop             
	//    9   21:return          
	}

	public final void onRewardedVideoAdOpened()
		throws RemoteException
	{
		zzst.zza(zzbnw).add(((Object) (new zztk(this))));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzst zzbnw>
	//    2    4:invokestatic    #23  <Method List zzst.zza(zzst)>
	//    3    7:new             #53  <Class zztk>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #54  <Method void zztk(zzti)>
	//    7   15:invokeinterface #34  <Method boolean List.add(Object)>
	//    8   20:pop             
	//    9   21:return          
	}

	public final void onRewardedVideoCompleted()
		throws RemoteException
	{
		zzst.zza(zzbnw).add(((Object) (new zztq(this))));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzst zzbnw>
	//    2    4:invokestatic    #23  <Method List zzst.zza(zzst)>
	//    3    7:new             #57  <Class zztq>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #58  <Method void zztq(zzti)>
	//    7   15:invokeinterface #34  <Method boolean List.add(Object)>
	//    8   20:pop             
	//    9   21:return          
	}

	public final void onRewardedVideoStarted()
		throws RemoteException
	{
		zzst.zza(zzbnw).add(((Object) (new zztl(this))));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzst zzbnw>
	//    2    4:invokestatic    #23  <Method List zzst.zza(zzst)>
	//    3    7:new             #61  <Class zztl>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #62  <Method void zztl(zzti)>
	//    7   15:invokeinterface #34  <Method boolean List.add(Object)>
	//    8   20:pop             
	//    9   21:return          
	}

	public final void zza(zzagu zzagu)
		throws RemoteException
	{
		zzst.zza(zzbnw).add(((Object) (new zztn(this, zzagu))));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzst zzbnw>
	//    2    4:invokestatic    #23  <Method List zzst.zza(zzst)>
	//    3    7:new             #65  <Class zztn>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #68  <Method void zztn(zzti, zzagu)>
	//    8   16:invokeinterface #34  <Method boolean List.add(Object)>
	//    9   21:pop             
	//   10   22:return          
	}

	private final zzst zzbnw;
}
