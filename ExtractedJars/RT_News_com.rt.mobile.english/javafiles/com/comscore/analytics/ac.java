// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.analytics;

import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.comscore.analytics:
//			Core

class ac
	implements Runnable
{

	ac(Core core)
	{
		a = core;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field Core a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public void run()
	{
		if(a.z())
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field Core a>
	//*   2    4:invokevirtual   #23  <Method boolean Core.z()>
	//*   3    7:ifeq            11
		{
			return;
	//    4   10:return          
		} else
		{
			a.z.getAndIncrement();
	//    5   11:aload_0         
	//    6   12:getfield        #12  <Field Core a>
	//    7   15:getfield        #26  <Field AtomicInteger Core.z>
	//    8   18:invokevirtual   #32  <Method int AtomicInteger.getAndIncrement()>
	//    9   21:pop             
			a.n();
	//   10   22:aload_0         
	//   11   23:getfield        #12  <Field Core a>
	//   12   26:invokevirtual   #35  <Method void Core.n()>
			return;
	//   13   29:return          
		}
	}

	final Core a;
}
