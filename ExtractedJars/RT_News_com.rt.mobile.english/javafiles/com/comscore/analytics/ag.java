// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.analytics;


// Referenced classes of package com.comscore.analytics:
//			Core

class ag
	implements Runnable
{

	ag(Core core)
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
		a.a();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field Core a>
	//    2    4:invokevirtual   #21  <Method void Core.a()>
		a.l();
	//    3    7:aload_0         
	//    4    8:getfield        #12  <Field Core a>
	//    5   11:invokevirtual   #24  <Method void Core.l()>
	//    6   14:return          
	}

	final Core a;
}
