// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.request.ResourceCallback;

// Referenced classes of package com.bumptech.glide.load.engine:
//			EngineJob, EngineResource

private class EngineJob$CallResourceReady
	implements Runnable
{

	public void run()
	{
		synchronized(EngineJob.this)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field EngineJob this$0>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(cbs.contains(cb))
	//*   5    7:aload_0         
	//*   6    8:getfield        #17  <Field EngineJob this$0>
	//*   7   11:getfield        #28  <Field EngineJob$ResourceCallbacksAndExecutors EngineJob.cbs>
	//*   8   14:aload_0         
	//*   9   15:getfield        #22  <Field ResourceCallback cb>
	//*  10   18:invokevirtual   #34  <Method boolean EngineJob$ResourceCallbacksAndExecutors.contains(ResourceCallback)>
	//*  11   21:ifeq            56
			{
				engineResource.acquire();
	//   12   24:aload_0         
	//   13   25:getfield        #17  <Field EngineJob this$0>
	//   14   28:getfield        #38  <Field EngineResource EngineJob.engineResource>
	//   15   31:invokevirtual   #43  <Method void EngineResource.acquire()>
				callCallbackOnResourceReady(cb);
	//   16   34:aload_0         
	//   17   35:getfield        #17  <Field EngineJob this$0>
	//   18   38:aload_0         
	//   19   39:getfield        #22  <Field ResourceCallback cb>
	//   20   42:invokevirtual   #47  <Method void EngineJob.callCallbackOnResourceReady(ResourceCallback)>
				removeCallback(cb);
	//   21   45:aload_0         
	//   22   46:getfield        #17  <Field EngineJob this$0>
	//   23   49:aload_0         
	//   24   50:getfield        #22  <Field ResourceCallback cb>
	//   25   53:invokevirtual   #50  <Method void EngineJob.removeCallback(ResourceCallback)>
			}
			decrementPendingCallbacks();
	//   26   56:aload_0         
	//   27   57:getfield        #17  <Field EngineJob this$0>
	//   28   60:invokevirtual   #53  <Method void EngineJob.decrementPendingCallbacks()>
		}
	//   29   63:aload_1         
	//   30   64:monitorexit     
		return;
	//   31   65:return          
		exception;
	//   32   66:astore_2        
		enginejob;
	//   33   67:aload_1         
		JVM INSTR monitorexit ;
	//   34   68:monitorexit     
		throw exception;
	//   35   69:aload_2         
	//   36   70:athrow          
	}

	private final ResourceCallback cb;
	final EngineJob this$0;

	EngineJob$CallResourceReady(ResourceCallback resourcecallback)
	{
		this$0 = EngineJob.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field EngineJob this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		cb = resourcecallback;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field ResourceCallback cb>
	//    8   14:return          
	}
}
