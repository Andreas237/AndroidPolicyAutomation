// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzxe, zzxq, zzakb, zzxk

final class zzxl
	implements Runnable
{

	zzxl(zzxk zzxk, zzxe zzxe1)
	{
		zzbun = zzxe1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #12  <Field zzxe zzbun>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		try
		{
			zzbun.zzbtx.destroy();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzxe zzbun>
	//    2    4:getfield        #25  <Field zzxq zzxe.zzbtx>
	//    3    7:invokeinterface #30  <Method void zzxq.destroy()>
			return;
	//    4   12:return          
		}
		catch(RemoteException remoteexception)
	//*   5   13:astore_1        
		{
			zzakb.zzc("Could not destroy mediation adapter.", ((Throwable) (remoteexception)));
	//    6   14:ldc1            #32  <String "Could not destroy mediation adapter.">
	//    7   16:aload_1         
	//    8   17:invokestatic    #38  <Method void zzakb.zzc(String, Throwable)>
		}
	//    9   20:return          
	}

	private final zzxe zzbun;
}
