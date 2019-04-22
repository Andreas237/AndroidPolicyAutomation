// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.tubesock.ThreadInitializer;

// Referenced classes of package com.firebase.client.core:
//			GaePlatform, ThreadInitializer

class GaePlatform$2
	implements ThreadInitializer
{

	public void setName(Thread thread, String s)
	{
		GaePlatform.threadInitializerInstance.setName(thread, s);
	//    0    0:getstatic       #26  <Field com.firebase.client.core.ThreadInitializer GaePlatform.threadInitializerInstance>
	//    1    3:aload_1         
	//    2    4:aload_2         
	//    3    5:invokeinterface #30  <Method void ThreadInitializer.setName(Thread, String)>
	//    4   10:return          
	}

	final GaePlatform this$0;

	GaePlatform$2()
	{
		this$0 = GaePlatform.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field GaePlatform this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
