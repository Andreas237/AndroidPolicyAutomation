// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;


// Referenced classes of package com.irobot.home.fragments:
//			bv

class bv$4
	implements Runnable
{

	public void run()
	{
		bv.a(c, a, b);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field bv c>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field int a>
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field String b>
	//    6   12:invokestatic    #31  <Method void bv.a(bv, int, String)>
	//    7   15:return          
	}

	final int a;
	final String b;
	final bv c;

	bv$4(bv bv1, int i, String s)
	{
		c = bv1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field bv c>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #22  <Field int a>
		b = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field String b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
