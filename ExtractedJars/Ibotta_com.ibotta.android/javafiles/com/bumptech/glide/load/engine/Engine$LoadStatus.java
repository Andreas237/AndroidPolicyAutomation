// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.request.ResourceCallback;

// Referenced classes of package com.bumptech.glide.load.engine:
//			Engine, EngineJob

public class Engine$LoadStatus
{

	public void cancel()
	{
		synchronized(Engine.this)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Engine this$0>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			engineJob.removeCallback(cb);
	//    5    7:aload_0         
	//    6    8:getfield        #25  <Field EngineJob engineJob>
	//    7   11:aload_0         
	//    8   12:getfield        #23  <Field ResourceCallback cb>
	//    9   15:invokevirtual   #35  <Method void EngineJob.removeCallback(ResourceCallback)>
		}
	//   10   18:aload_1         
	//   11   19:monitorexit     
		return;
	//   12   20:return          
		exception;
	//   13   21:astore_2        
		engine;
	//   14   22:aload_1         
		JVM INSTR monitorexit ;
	//   15   23:monitorexit     
		throw exception;
	//   16   24:aload_2         
	//   17   25:athrow          
	}

	private final ResourceCallback cb;
	private final EngineJob engineJob;
	final Engine this$0;

	Engine$LoadStatus(ResourceCallback resourcecallback, EngineJob enginejob)
	{
		this$0 = Engine.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Engine this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		cb = resourcecallback;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field ResourceCallback cb>
		engineJob = enginejob;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field EngineJob engineJob>
	//   11   19:return          
	}
}
