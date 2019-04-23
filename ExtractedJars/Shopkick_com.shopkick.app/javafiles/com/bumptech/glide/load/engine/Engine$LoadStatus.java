// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.request.ResourceCallback;

// Referenced classes of package com.bumptech.glide.load.engine:
//			Engine, EngineJob

public static class Engine$LoadStatus
{

	public void cancel()
	{
		engineJob.removeCallback(cb);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field EngineJob engineJob>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field ResourceCallback cb>
	//    4    8:invokevirtual   #31  <Method void EngineJob.removeCallback(ResourceCallback)>
	//    5   11:return          
	}

	private final ResourceCallback cb;
	private final EngineJob engineJob;

	Engine$LoadStatus(ResourceCallback resourcecallback, EngineJob enginejob)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		cb = resourcecallback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field ResourceCallback cb>
		engineJob = enginejob;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field EngineJob engineJob>
	//    8   14:return          
	}
}
