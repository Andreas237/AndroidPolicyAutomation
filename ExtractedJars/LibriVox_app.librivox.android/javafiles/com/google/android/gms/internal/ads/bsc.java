// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.e;

// Referenced classes of package com.google.android.gms.internal.ads:
//			brw, abo

final class bsc
	implements e
{

	bsc(brw brw1, abo abo1)
	{
		b = brw1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field brw b>
		a = abo1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field abo a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void a(ConnectionResult connectionresult)
	{
		synchronized(brw.b(b))
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field brw b>
	//*   2    4:invokestatic    #26  <Method Object brw.b(brw)>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
		{
			a.a(((Throwable) (new RuntimeException("Connection failed."))));
	//    6   10:aload_0         
	//    7   11:getfield        #16  <Field abo a>
	//    8   14:new             #28  <Class RuntimeException>
	//    9   17:dup             
	//   10   18:ldc1            #30  <String "Connection failed.">
	//   11   20:invokespecial   #33  <Method void RuntimeException(String)>
	//   12   23:invokevirtual   #38  <Method void abo.a(Throwable)>
		}
	//   13   26:aload_1         
	//   14   27:monitorexit     
		return;
	//   15   28:return          
		exception;
	//   16   29:astore_2        
		connectionresult;
	//   17   30:aload_1         
		JVM INSTR monitorexit ;
	//   18   31:monitorexit     
		throw exception;
	//   19   32:aload_2         
	//   20   33:athrow          
	}

	private final abo a;
	private final brw b;
}
