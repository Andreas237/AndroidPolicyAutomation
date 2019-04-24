// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.analytics;


// Referenced classes of package com.comscore.analytics:
//			Core

class x
	implements Runnable
{

	x(Core core, int i, boolean flag)
	{
		c = core;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field Core c>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #18  <Field int a>
		b = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #20  <Field boolean b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #23  <Method void Object()>
	//   11   19:return          
	}

	public void run()
	{
		c.a(a, b);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Core c>
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field int a>
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field boolean b>
	//    6   12:invokevirtual   #30  <Method void Core.a(int, boolean)>
	//    7   15:return          
	}

	final int a;
	final boolean b;
	final Core c;
}
