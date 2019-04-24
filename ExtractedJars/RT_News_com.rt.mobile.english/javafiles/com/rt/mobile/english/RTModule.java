// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.rt.mobile.english;

import android.app.Application;

// Referenced classes of package com.rt.mobile.english:
//			RTApp

public final class RTModule
{

	public RTModule(RTApp rtapp)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		app = rtapp;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field RTApp app>
	//    5    9:return          
	}

	Application provideApplication()
	{
		return ((Application) (app));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RTApp app>
	//    2    4:areturn         
	}

	private final RTApp app;
}
