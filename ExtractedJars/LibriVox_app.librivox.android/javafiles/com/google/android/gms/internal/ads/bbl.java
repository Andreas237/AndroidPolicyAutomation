// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.android.gms.internal.ads:
//			baj, boq

final class bbl
	implements Runnable
{

	bbl(baj baj1, boq boq)
	{
		b = baj1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field baj b>
		a = boq;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field boq a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		InterruptedException interruptedexception;
		try
		{
			baj.a(b).put(((Object) (a)));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field baj b>
	//    2    4:invokestatic    #28  <Method BlockingQueue baj.a(baj)>
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field boq a>
	//    5   11:invokeinterface #34  <Method void BlockingQueue.put(Object)>
			return;
	//    6   16:return          
		}
	//*   7   17:invokestatic    #40  <Method Thread Thread.currentThread()>
	//*   8   20:invokevirtual   #43  <Method void Thread.interrupt()>
	//*   9   23:return          
		// Misplaced declaration of an exception variable
		catch(InterruptedException interruptedexception)
		{
			Thread.currentThread().interrupt();
		}
	//*  10   24:astore_1        
	//*  11   25:goto            17
	}

	private final boq a;
	private final baj b;
}
