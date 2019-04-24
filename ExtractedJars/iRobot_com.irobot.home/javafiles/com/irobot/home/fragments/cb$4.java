// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;


// Referenced classes of package com.irobot.home.fragments:
//			cb

class cb$4
	implements Runnable
{

	public void run()
	{
		cb.a(b, a);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field cb b>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field String a>
	//    4    8:invokestatic    #27  <Method void cb.a(cb, String)>
	//    5   11:return          
	}

	final String a;
	final cb b;

	cb$4(cb cb1, String s)
	{
		b = cb1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field cb b>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field String a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
