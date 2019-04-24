// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzts, zzakb, zztt, zzst

final class zztr
	implements Runnable
{

	zztr(zzst zzst, zzts zzts1, zztt zztt)
	{
		zzbob = zzts1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #14  <Field zzts zzbob>
		zzboc = zztt;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #16  <Field zztt zzboc>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		try
		{
			zzbob.zzb(zzboc);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzts zzbob>
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field zztt zzboc>
	//    4    8:invokeinterface #29  <Method void zzts.zzb(zztt)>
			return;
	//    5   13:return          
		}
		catch(RemoteException remoteexception)
	//*   6   14:astore_1        
		{
			zzakb.zzc("Could not propagate interstitial ad event.", ((Throwable) (remoteexception)));
	//    7   15:ldc1            #31  <String "Could not propagate interstitial ad event.">
	//    8   17:aload_1         
	//    9   18:invokestatic    #37  <Method void zzakb.zzc(String, Throwable)>
		}
	//   10   21:return          
	}

	private final zzts zzbob;
	private final zztt zzboc;
}
