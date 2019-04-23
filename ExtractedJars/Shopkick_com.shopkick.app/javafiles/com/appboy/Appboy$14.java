// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import java.util.concurrent.Callable;

// Referenced classes of package com.appboy:
//			Appboy, AppboyUser

class Appboy$14
	implements Callable
{

	public AppboyUser a()
	{
		return Appboy.g(a);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Appboy a>
	//    2    4:invokestatic    #26  <Method AppboyUser Appboy.g(Appboy)>
	//    3    7:areturn         
	}

	public Object call()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method AppboyUser a()>
	//    2    4:areturn         
	}

	final Appboy a;

	Appboy$14(Appboy appboy)
	{
		a = appboy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Appboy a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
