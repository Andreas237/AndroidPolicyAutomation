// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.support.v4.util.SimpleArrayMap;

// Referenced classes of package com.firebase.jobdispatcher:
//			JobService, JobParameters

class JobService$2
	implements Runnable
{

	public void run()
	{
		SimpleArrayMap simplearraymap = JobService.access$100(JobService.this);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JobService this$0>
	//    2    4:invokestatic    #30  <Method SimpleArrayMap JobService.access$100(JobService)>
	//    3    7:astore_1        
		simplearraymap;
	//    4    8:aload_1         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		bCallback bcallback;
		if(onStartJob(val$job))
			break MISSING_BLOCK_LABEL_56;
	//    6   10:aload_0         
	//    7   11:getfield        #19  <Field JobService this$0>
	//    8   14:aload_0         
	//    9   15:getfield        #21  <Field JobParameters val$job>
	//   10   18:invokevirtual   #34  <Method boolean JobService.onStartJob(JobParameters)>
	//   11   21:ifne            56
		bcallback = (bCallback)JobService.access$100(JobService.this).remove(((Object) (val$job.getTag())));
	//   12   24:aload_0         
	//   13   25:getfield        #19  <Field JobService this$0>
	//   14   28:invokestatic    #30  <Method SimpleArrayMap JobService.access$100(JobService)>
	//   15   31:aload_0         
	//   16   32:getfield        #21  <Field JobParameters val$job>
	//   17   35:invokeinterface #40  <Method String JobParameters.getTag()>
	//   18   40:invokevirtual   #46  <Method Object SimpleArrayMap.remove(Object)>
	//   19   43:checkcast       #48  <Class JobService$JobCallback>
	//   20   46:astore_2        
		if(bcallback == null)
			break MISSING_BLOCK_LABEL_56;
	//   21   47:aload_2         
	//   22   48:ifnull          56
		bcallback.sendResult(0);
	//   23   51:aload_2         
	//   24   52:iconst_0        
	//   25   53:invokevirtual   #52  <Method void JobService$JobCallback.sendResult(int)>
		simplearraymap;
	//   26   56:aload_1         
		JVM INSTR monitorexit ;
	//   27   57:monitorexit     
		return;
	//   28   58:return          
		Exception exception;
		exception;
	//   29   59:astore_2        
		simplearraymap;
	//   30   60:aload_1         
		JVM INSTR monitorexit ;
	//   31   61:monitorexit     
		throw exception;
	//   32   62:aload_2         
	//   33   63:athrow          
	}

	final JobService this$0;
	final JobParameters val$job;

	JobService$2()
	{
		this$0 = final_jobservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field JobService this$0>
		val$job = JobParameters.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field JobParameters val$job>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
