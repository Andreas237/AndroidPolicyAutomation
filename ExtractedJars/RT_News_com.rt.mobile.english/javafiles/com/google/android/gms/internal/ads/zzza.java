// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzyq, zzzc, zzxt, zzane

final class zzza
	implements Runnable
{

	zzza(zzyq zzyq1, com.google.ads.AdRequest.ErrorCode errorcode)
	{
		zzbvd = zzyq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzyq zzbvd>
		zzbve = errorcode;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field com.google.ads.AdRequest$ErrorCode zzbve>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		try
		{
			zzyq.zza(zzbvd).onAdFailedToLoad(zzzc.zza(zzbve));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzyq zzbvd>
	//    2    4:invokestatic    #29  <Method zzxt zzyq.zza(zzyq)>
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field com.google.ads.AdRequest$ErrorCode zzbve>
	//    5   11:invokestatic    #34  <Method int zzzc.zza(com.google.ads.AdRequest$ErrorCode)>
	//    6   14:invokeinterface #40  <Method void zzxt.onAdFailedToLoad(int)>
			return;
	//    7   19:return          
		}
		catch(RemoteException remoteexception)
	//*   8   20:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//    9   21:ldc1            #42  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #48  <Method void zzane.zzd(String, Throwable)>
		}
	//   12   27:return          
	}

	private final zzyq zzbvd;
	private final com.google.ads.AdRequest.ErrorCode zzbve;
}
