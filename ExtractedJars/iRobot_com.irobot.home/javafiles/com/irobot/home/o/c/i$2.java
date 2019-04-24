// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.o.c;


// Referenced classes of package com.irobot.home.o.c:
//			i

class i$2
	implements Runnable
{

	public void run()
	{
		i.a(a, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field i a>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #24  <Method void i.a(i, int)>
	//    4    8:return          
	}

	final i a;

	i$2(i j)
	{
		a = j;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field i a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
