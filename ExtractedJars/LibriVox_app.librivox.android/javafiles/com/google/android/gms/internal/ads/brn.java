// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.e;

// Referenced classes of package com.google.android.gms.internal.ads:
//			brj

final class brn
	implements e
{

	brn(brj brj1)
	{
		a = brj1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field brj a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void a(ConnectionResult connectionresult)
	{
		synchronized(brj.c(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field brj a>
	//*   2    4:invokestatic    #23  <Method Object brj.c(brj)>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
		{
			brj.a(a, ((brt) (null)));
	//    6   10:aload_0         
	//    7   11:getfield        #12  <Field brj a>
	//    8   14:aconst_null     
	//    9   15:invokestatic    #26  <Method brt brj.a(brj, brt)>
	//   10   18:pop             
			if(brj.d(a) != null)
	//*  11   19:aload_0         
	//*  12   20:getfield        #12  <Field brj a>
	//*  13   23:invokestatic    #30  <Method brp brj.d(brj)>
	//*  14   26:ifnull          38
				brj.a(a, ((brp) (null)));
	//   15   29:aload_0         
	//   16   30:getfield        #12  <Field brj a>
	//   17   33:aconst_null     
	//   18   34:invokestatic    #33  <Method brp brj.a(brj, brp)>
	//   19   37:pop             
			brj.c(a).notifyAll();
	//   20   38:aload_0         
	//   21   39:getfield        #12  <Field brj a>
	//   22   42:invokestatic    #23  <Method Object brj.c(brj)>
	//   23   45:invokevirtual   #36  <Method void Object.notifyAll()>
		}
	//   24   48:aload_1         
	//   25   49:monitorexit     
		return;
	//   26   50:return          
		exception;
	//   27   51:astore_2        
		connectionresult;
	//   28   52:aload_1         
		JVM INSTR monitorexit ;
	//   29   53:monitorexit     
		throw exception;
	//   30   54:aload_2         
	//   31   55:athrow          
	}

	private final brj a;
}
