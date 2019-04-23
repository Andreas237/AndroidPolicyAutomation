// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ahy, lz, aag, ks, 
//			ml

final class mn
	implements ahy
{

	mn(ml ml, lz lz1, ks ks)
	{
		c = ml;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field ml c>
		a = lz1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field lz a>
		b = ks;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field ks b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #23  <Method void Object()>
	//   11   19:return          
	}

	public final void a(String s)
	{
		try
		{
			a.a(s);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field lz a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #31  <Method void lz.a(String)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5   11:astore_1        
		{
			aag.b("", ((Throwable) (s)));
	//    6   12:ldc1            #33  <String "">
	//    7   14:aload_1         
	//    8   15:invokestatic    #38  <Method void aag.b(String, Throwable)>
		}
	//    9   18:return          
	}

	private final lz a;
	private final ks b;
	private final ml c;
}
