// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.request.ResourceCallback;

// Referenced classes of package com.bumptech.glide.load.engine:
//			EngineJob

private class EngineJob$CallLoadFailed
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
	//*  11   21:ifeq            35
				callCallbackOnLoadFailed(cb);
	//   12   24:aload_0         
	//   13   25:getfield        #17  <Field EngineJob this$0>
	//   14   28:aload_0         
	//   15   29:getfield        #22  <Field ResourceCallback cb>
	//   16   32:invokevirtual   #38  <Method void EngineJob.callCallbackOnLoadFailed(ResourceCallback)>
			decrementPendingCallbacks();
	//   17   35:aload_0         
	//   18   36:getfield        #17  <Field EngineJob this$0>
	//   19   39:invokevirtual   #41  <Method void EngineJob.decrementPendingCallbacks()>
		}
	//   20   42:aload_1         
	//   21   43:monitorexit     
		return;
	//   22   44:return          
		exception;
	//   23   45:astore_2        
		enginejob;
	//   24   46:aload_1         
		JVM INSTR monitorexit ;
	//   25   47:monitorexit     
		throw exception;
	//   26   48:aload_2         
	//   27   49:athrow          
	}

	private final ResourceCallback cb;
	final EngineJob this$0;

	EngineJob$CallLoadFailed(ResourceCallback resourcecallback)
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
