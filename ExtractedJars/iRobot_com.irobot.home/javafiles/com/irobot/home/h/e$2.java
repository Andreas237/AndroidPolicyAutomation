// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.h;

import com.irobot.core.DiscoveryCallback;

// Referenced classes of package com.irobot.home.h:
//			e

class e$2
	implements Runnable
{

	public void run()
	{
		a.onDiscoveryFinished();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field DiscoveryCallback a>
	//    2    4:invokevirtual   #31  <Method void DiscoveryCallback.onDiscoveryFinished()>
	//    3    7:return          
	}

	final DiscoveryCallback a;
	final e b;

	e$2(e e1, DiscoveryCallback discoverycallback)
	{
		b = e1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field e b>
		a = discoverycallback;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field DiscoveryCallback a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
