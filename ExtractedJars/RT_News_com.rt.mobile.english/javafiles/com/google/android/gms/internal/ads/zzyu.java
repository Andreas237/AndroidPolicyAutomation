// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzyq, zzxt, zzane

final class zzyu
	implements Runnable
{

	zzyu(zzyq zzyq1)
	{
		zzbvd = zzyq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzyq zzbvd>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		try
		{
			zzyq.zza(zzbvd).onAdClosed();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzyq zzbvd>
	//    2    4:invokestatic    #25  <Method zzxt zzyq.zza(zzyq)>
	//    3    7:invokeinterface #30  <Method void zzxt.onAdClosed()>
			return;
	//    4   12:return          
		}
		catch(RemoteException remoteexception)
	//*   5   13:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//    6   14:ldc1            #32  <String "#007 Could not call remote method.">
	//    7   16:aload_1         
	//    8   17:invokestatic    #38  <Method void zzane.zzd(String, Throwable)>
		}
	//    9   20:return          
	}

	private final zzyq zzbvd;
}
