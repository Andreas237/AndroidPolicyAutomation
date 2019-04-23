// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bza, byy, bwr, aag

final class bzb
	implements Runnable
{

	bzb(bza bza1)
	{
		a = bza1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field bza a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		if(byy.a(a.a) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field bza a>
	//*   2    4:getfield        #24  <Field byy bza.a>
	//*   3    7:invokestatic    #29  <Method bwr byy.a(byy)>
	//*   4   10:ifnull          37
			try
			{
				byy.a(a.a).a(1);
	//    5   13:aload_0         
	//    6   14:getfield        #12  <Field bza a>
	//    7   17:getfield        #24  <Field byy bza.a>
	//    8   20:invokestatic    #29  <Method bwr byy.a(byy)>
	//    9   23:iconst_1        
	//   10   24:invokeinterface #34  <Method void bwr.a(int)>
				return;
	//   11   29:return          
			}
			catch(RemoteException remoteexception)
	//*  12   30:astore_1        
			{
				aag.c("Could not notify onAdFailedToLoad event.", ((Throwable) (remoteexception)));
	//   13   31:ldc1            #36  <String "Could not notify onAdFailedToLoad event.">
	//   14   33:aload_1         
	//   15   34:invokestatic    #42  <Method void aag.c(String, Throwable)>
			}
	//   16   37:return          
	}

	private final bza a;
}
