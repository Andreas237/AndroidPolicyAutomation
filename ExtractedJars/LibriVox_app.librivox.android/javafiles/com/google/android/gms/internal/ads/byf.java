// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			byc, aag

public final class byf
{

	public byf(byc byc1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		b = byc1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field byc b>
		try
		{
			byc1 = ((byc) (byc1.a()));
	//    5    9:aload_1         
	//    6   10:invokeinterface #23  <Method String byc.a()>
	//    7   15:astore_1        
		}
	//*   8   16:goto            28
		// Misplaced declaration of an exception variable
		catch(byc byc1)
	//*   9   19:astore_1        
		{
			aag.b("", ((Throwable) (byc1)));
	//   10   20:ldc1            #25  <String "">
	//   11   22:aload_1         
	//   12   23:invokestatic    #30  <Method void aag.b(String, Throwable)>
			byc1 = null;
	//   13   26:aconst_null     
	//   14   27:astore_1        
		}
		a = ((String) (byc1));
	//   15   28:aload_0         
	//   16   29:aload_1         
	//   17   30:putfield        #32  <Field String a>
	//   18   33:return          
	}

	private final String a;
	private byc b;
}
