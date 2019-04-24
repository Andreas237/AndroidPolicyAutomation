// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzmj, zzkh, zzane

final class zzmk
	implements Runnable
{

	zzmk(zzmj zzmj1)
	{
		zzatk = zzmj1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzmj zzatk>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		if(zzmj.zza(zzatk) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field zzmj zzatk>
	//*   2    4:invokestatic    #25  <Method zzkh zzmj.zza(zzmj)>
	//*   3    7:ifnull          31
			try
			{
				zzmj.zza(zzatk).onAdFailedToLoad(1);
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field zzmj zzatk>
	//    6   14:invokestatic    #25  <Method zzkh zzmj.zza(zzmj)>
	//    7   17:iconst_1        
	//    8   18:invokeinterface #31  <Method void zzkh.onAdFailedToLoad(int)>
				return;
	//    9   23:return          
			}
			catch(RemoteException remoteexception)
	//*  10   24:astore_1        
			{
				zzane.zzc("Could not notify onAdFailedToLoad event.", ((Throwable) (remoteexception)));
	//   11   25:ldc1            #33  <String "Could not notify onAdFailedToLoad event.">
	//   12   27:aload_1         
	//   13   28:invokestatic    #39  <Method void zzane.zzc(String, Throwable)>
			}
	//   14   31:return          
	}

	private final zzmj zzatk;
}
