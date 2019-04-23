// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			og, ol, wd

final class oi
	implements Runnable
{

	oi(og og1, wd wd)
	{
		b = og1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field og b>
		a = wd;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field wd a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		synchronized(b.c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field og b>
	//*   2    4:getfield        #27  <Field Object og.c>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
		{
			og og1 = b;
	//    6   10:aload_0         
	//    7   11:getfield        #14  <Field og b>
	//    8   14:astore_2        
			wd wd = a;
	//    9   15:aload_0         
	//   10   16:getfield        #16  <Field wd a>
	//   11   19:astore_3        
			og1.a.b(wd);
	//   12   20:aload_2         
	//   13   21:getfield        #30  <Field ol og.a>
	//   14   24:aload_3         
	//   15   25:invokeinterface #35  <Method void ol.b(wd)>
		}
	//   16   30:aload_1         
	//   17   31:monitorexit     
		return;
	//   18   32:return          
		exception;
	//   19   33:astore_2        
		obj;
	//   20   34:aload_1         
		JVM INSTR monitorexit ;
	//   21   35:monitorexit     
		throw exception;
	//   22   36:aload_2         
	//   23   37:athrow          
	}

	private final wd a;
	private final og b;
}
