// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzki, zzst, zztb, zzsv, 
//			zzsw, zzakb, zzta, zzsx, 
//			zzsy, zzsz

final class zzsu extends zzki
{

	zzsu(zzst zzst1)
	{
		zzbnw = zzst1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field zzst zzbnw>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void zzki()>
	//    5    9:return          
	}

	public final void onAdClicked()
		throws RemoteException
	{
		zzst.zza(zzbnw).add(((Object) (new zztb(this))));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzst zzbnw>
	//    2    4:invokestatic    #23  <Method List zzst.zza(zzst)>
	//    3    7:new             #25  <Class zztb>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #28  <Method void zztb(zzsu)>
	//    7   15:invokeinterface #34  <Method boolean List.add(Object)>
	//    8   20:pop             
	//    9   21:return          
	}

	public final void onAdClosed()
		throws RemoteException
	{
		zzst.zza(zzbnw).add(((Object) (new zzsv(this))));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzst zzbnw>
	//    2    4:invokestatic    #23  <Method List zzst.zza(zzst)>
	//    3    7:new             #38  <Class zzsv>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #39  <Method void zzsv(zzsu)>
	//    7   15:invokeinterface #34  <Method boolean List.add(Object)>
	//    8   20:pop             
	//    9   21:return          
	}

	public final void onAdFailedToLoad(int i)
		throws RemoteException
	{
		zzst.zza(zzbnw).add(((Object) (new zzsw(this, i))));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzst zzbnw>
	//    2    4:invokestatic    #23  <Method List zzst.zza(zzst)>
	//    3    7:new             #43  <Class zzsw>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:invokespecial   #46  <Method void zzsw(zzsu, int)>
	//    8   16:invokeinterface #34  <Method boolean List.add(Object)>
	//    9   21:pop             
		zzakb.v("Pooled interstitial failed to load.");
	//   10   22:ldc1            #48  <String "Pooled interstitial failed to load.">
	//   11   24:invokestatic    #54  <Method void zzakb.v(String)>
	//   12   27:return          
	}

	public final void onAdImpression()
		throws RemoteException
	{
		zzst.zza(zzbnw).add(((Object) (new zzta(this))));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzst zzbnw>
	//    2    4:invokestatic    #23  <Method List zzst.zza(zzst)>
	//    3    7:new             #57  <Class zzta>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #58  <Method void zzta(zzsu)>
	//    7   15:invokeinterface #34  <Method boolean List.add(Object)>
	//    8   20:pop             
	//    9   21:return          
	}

	public final void onAdLeftApplication()
		throws RemoteException
	{
		zzst.zza(zzbnw).add(((Object) (new zzsx(this))));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzst zzbnw>
	//    2    4:invokestatic    #23  <Method List zzst.zza(zzst)>
	//    3    7:new             #61  <Class zzsx>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #62  <Method void zzsx(zzsu)>
	//    7   15:invokeinterface #34  <Method boolean List.add(Object)>
	//    8   20:pop             
	//    9   21:return          
	}

	public final void onAdLoaded()
		throws RemoteException
	{
		zzst.zza(zzbnw).add(((Object) (new zzsy(this))));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzst zzbnw>
	//    2    4:invokestatic    #23  <Method List zzst.zza(zzst)>
	//    3    7:new             #65  <Class zzsy>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #66  <Method void zzsy(zzsu)>
	//    7   15:invokeinterface #34  <Method boolean List.add(Object)>
	//    8   20:pop             
		zzakb.v("Pooled interstitial loaded.");
	//    9   21:ldc1            #68  <String "Pooled interstitial loaded.">
	//   10   23:invokestatic    #54  <Method void zzakb.v(String)>
	//   11   26:return          
	}

	public final void onAdOpened()
		throws RemoteException
	{
		zzst.zza(zzbnw).add(((Object) (new zzsz(this))));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzst zzbnw>
	//    2    4:invokestatic    #23  <Method List zzst.zza(zzst)>
	//    3    7:new             #71  <Class zzsz>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #72  <Method void zzsz(zzsu)>
	//    7   15:invokeinterface #34  <Method boolean List.add(Object)>
	//    8   20:pop             
	//    9   21:return          
	}

	private final zzst zzbnw;
}
