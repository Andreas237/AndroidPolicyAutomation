// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bzc, bwr, aag

final class bzd
	implements Runnable
{

	bzd(bzc bzc1)
	{
		a = bzc1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field bzc a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		if(bzc.a(a) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field bzc a>
	//*   2    4:invokestatic    #24  <Method bwr bzc.a(bzc)>
	//*   3    7:ifnull          31
			try
			{
				bzc.a(a).a(1);
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field bzc a>
	//    6   14:invokestatic    #24  <Method bwr bzc.a(bzc)>
	//    7   17:iconst_1        
	//    8   18:invokeinterface #29  <Method void bwr.a(int)>
				return;
	//    9   23:return          
			}
			catch(RemoteException remoteexception)
	//*  10   24:astore_1        
			{
				aag.c("Could not notify onAdFailedToLoad event.", ((Throwable) (remoteexception)));
	//   11   25:ldc1            #31  <String "Could not notify onAdFailedToLoad event.">
	//   12   27:aload_1         
	//   13   28:invokestatic    #37  <Method void aag.c(String, Throwable)>
			}
	//   14   31:return          
	}

	private final bzc a;
}
