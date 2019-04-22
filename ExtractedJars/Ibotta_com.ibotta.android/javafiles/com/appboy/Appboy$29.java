// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;


// Referenced classes of package com.appboy:
//			Appboy

class Appboy$29
	implements Runnable
{

	public void run()
	{
		Appboy.f(a);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Appboy a>
	//    2    4:invokestatic    #24  <Method void Appboy.f(Appboy)>
	//    3    7:return          
	}

	final Appboy a;

	Appboy$29(Appboy appboy)
	{
		a = appboy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field Appboy a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
