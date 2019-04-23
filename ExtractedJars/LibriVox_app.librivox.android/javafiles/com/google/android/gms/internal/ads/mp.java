// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ahy, mb, aag, ks, 
//			ml

final class mp
	implements ahy
{

	mp(ml ml, mb mb1, ks ks)
	{
		a = mb1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #14  <Field mb a>
		b = ks;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #16  <Field ks b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void a(String s)
	{
		try
		{
			a.a(s);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field mb a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #27  <Method void mb.a(String)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5   11:astore_1        
		{
			aag.b("", ((Throwable) (s)));
	//    6   12:ldc1            #29  <String "">
	//    7   14:aload_1         
	//    8   15:invokestatic    #34  <Method void aag.b(String, Throwable)>
		}
	//    9   18:return          
	}

	private final mb a;
	private final ks b;
}
