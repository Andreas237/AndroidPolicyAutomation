// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy:
//			Appboy

class Appboy$1
	implements Runnable
{

	public void run()
	{
		AppboyLogger.checkForSystemLogLevelProperty();
	//    0    0:invokestatic    #26  <Method void AppboyLogger.checkForSystemLogLevelProperty()>
	//    1    3:return          
	}

	final Appboy a;

	Appboy$1(Appboy appboy)
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
