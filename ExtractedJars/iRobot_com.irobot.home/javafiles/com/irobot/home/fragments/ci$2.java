// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;


// Referenced classes of package com.irobot.home.fragments:
//			ci

class ci$2
	implements Runnable
{

	public void run()
	{
		ci.b(a);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ci a>
	//    2    4:invokestatic    #24  <Method void ci.b(ci)>
	//    3    7:return          
	}

	final ci a;

	ci$2(ci ci1)
	{
		a = ci1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ci a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
