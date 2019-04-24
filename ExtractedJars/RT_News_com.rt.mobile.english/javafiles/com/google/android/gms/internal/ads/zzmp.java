// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzmo, zzahe, zzane

final class zzmp
	implements Runnable
{

	zzmp(zzmo zzmo1)
	{
		zzatm = zzmo1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzmo zzatm>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		if(zzmo.zza(zzatm) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field zzmo zzatm>
	//*   2    4:invokestatic    #25  <Method zzahe zzmo.zza(zzmo)>
	//*   3    7:ifnull          31
			try
			{
				zzmo.zza(zzatm).onRewardedVideoAdFailedToLoad(1);
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field zzmo zzatm>
	//    6   14:invokestatic    #25  <Method zzahe zzmo.zza(zzmo)>
	//    7   17:iconst_1        
	//    8   18:invokeinterface #31  <Method void zzahe.onRewardedVideoAdFailedToLoad(int)>
				return;
	//    9   23:return          
			}
			catch(RemoteException remoteexception)
	//*  10   24:astore_1        
			{
				zzane.zzc("Could not notify onRewardedVideoAdFailedToLoad event.", ((Throwable) (remoteexception)));
	//   11   25:ldc1            #33  <String "Could not notify onRewardedVideoAdFailedToLoad event.">
	//   12   27:aload_1         
	//   13   28:invokestatic    #39  <Method void zzane.zzc(String, Throwable)>
			}
	//   14   31:return          
	}

	private final zzmo zzatm;
}
