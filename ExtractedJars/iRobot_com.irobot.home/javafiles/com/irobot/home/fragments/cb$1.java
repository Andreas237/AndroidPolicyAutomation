// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;


// Referenced classes of package com.irobot.home.fragments:
//			cb

class cb$1
	implements Runnable
{

	public void run()
	{
		cb.a(c, a, b);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field cb c>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field String a>
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field ca$a$a b>
	//    6   12:invokestatic    #31  <Method void cb.a(cb, String, ca$a$a)>
	//    7   15:return          
	}

	final String a;
	final a b;
	final cb c;

	cb$1(cb cb1, String s, a a1)
	{
		c = cb1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field cb c>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field String a>
		b = a1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field ca$a$a b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
