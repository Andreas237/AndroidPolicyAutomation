// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import android.os.Process;

// Referenced classes of package com.bumptech.glide.load.engine:
//			ActiveResources

class ActiveResources$2
	implements Runnable
{

	public void run()
	{
		Process.setThreadPriority(10);
	//    0    0:bipush          10
	//    1    2:invokestatic    #28  <Method void Process.setThreadPriority(int)>
		cleanReferenceQueue();
	//    2    5:aload_0         
	//    3    6:getfield        #17  <Field ActiveResources this$0>
	//    4    9:invokevirtual   #31  <Method void ActiveResources.cleanReferenceQueue()>
	//    5   12:return          
	}

	final ActiveResources this$0;

	ActiveResources$2()
	{
		this$0 = ActiveResources.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ActiveResources this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
