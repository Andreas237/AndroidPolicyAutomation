// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.b;

// Referenced classes of package com.google.android.gms.internal.ads:
//			lq, lt, ks, aag

final class lr
	implements Runnable
{

	lr(lq lq1, b b1)
	{
		b = lq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field lq b>
		a = b1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field b a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		try
		{
			lq.a(b).a(lt.a(a));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field lq b>
	//    2    4:invokestatic    #28  <Method ks lq.a(lq)>
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field b a>
	//    5   11:invokestatic    #33  <Method int lt.a(b)>
	//    6   14:invokeinterface #38  <Method void ks.a(int)>
			return;
	//    7   19:return          
		}
		catch(RemoteException remoteexception)
	//*   8   20:astore_1        
		{
			aag.d("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//    9   21:ldc1            #40  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #46  <Method void aag.d(String, Throwable)>
		}
	//   12   27:return          
	}

	private final b a;
	private final lq b;
}
