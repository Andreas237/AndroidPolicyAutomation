// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzmh, zzmf, zzkh, zzane

final class zzmi
	implements Runnable
{

	zzmi(zzmh zzmh1)
	{
		zzatj = zzmh1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzmh zzatj>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		if(zzmf.zza(zzatj.zzati) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field zzmh zzatj>
	//*   2    4:getfield        #25  <Field zzmf zzmh.zzati>
	//*   3    7:invokestatic    #31  <Method zzkh zzmf.zza(zzmf)>
	//*   4   10:ifnull          37
			try
			{
				zzmf.zza(zzatj.zzati).onAdFailedToLoad(1);
	//    5   13:aload_0         
	//    6   14:getfield        #12  <Field zzmh zzatj>
	//    7   17:getfield        #25  <Field zzmf zzmh.zzati>
	//    8   20:invokestatic    #31  <Method zzkh zzmf.zza(zzmf)>
	//    9   23:iconst_1        
	//   10   24:invokeinterface #37  <Method void zzkh.onAdFailedToLoad(int)>
				return;
	//   11   29:return          
			}
			catch(RemoteException remoteexception)
	//*  12   30:astore_1        
			{
				zzane.zzc("Could not notify onAdFailedToLoad event.", ((Throwable) (remoteexception)));
	//   13   31:ldc1            #39  <String "Could not notify onAdFailedToLoad event.">
	//   14   33:aload_1         
	//   15   34:invokestatic    #45  <Method void zzane.zzc(String, Throwable)>
			}
	//   16   37:return          
	}

	private final zzmh zzatj;
}
