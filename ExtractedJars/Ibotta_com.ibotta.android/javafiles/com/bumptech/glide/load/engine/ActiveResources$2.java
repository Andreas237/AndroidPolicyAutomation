// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;


// Referenced classes of package com.bumptech.glide.load.engine:
//			ActiveResources

class ActiveResources$2
	implements Runnable
{

	public void run()
	{
		cleanReferenceQueue();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ActiveResources this$0>
	//    2    4:invokevirtual   #24  <Method void ActiveResources.cleanReferenceQueue()>
	//    3    7:return          
	}

	final ActiveResources this$0;

	ActiveResources$2()
	{
		this$0 = ActiveResources.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field ActiveResources this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
