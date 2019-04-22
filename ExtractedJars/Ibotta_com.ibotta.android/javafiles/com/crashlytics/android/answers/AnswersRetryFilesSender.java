// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.concurrency.internal.*;
import io.fabric.sdk.android.services.events.FilesSender;
import java.util.List;

// Referenced classes of package com.crashlytics.android.answers:
//			RetryManager, RandomBackoff, SessionAnalyticsFilesSender

class AnswersRetryFilesSender
	implements FilesSender
{

	AnswersRetryFilesSender(SessionAnalyticsFilesSender sessionanalyticsfilessender, RetryManager retrymanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		filesSender = sessionanalyticsfilessender;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field SessionAnalyticsFilesSender filesSender>
		retryManager = retrymanager;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field RetryManager retryManager>
	//    8   14:return          
	}

	public static AnswersRetryFilesSender build(SessionAnalyticsFilesSender sessionanalyticsfilessender)
	{
		return new AnswersRetryFilesSender(sessionanalyticsfilessender, new RetryManager(new RetryState(((io.fabric.sdk.android.services.concurrency.internal.Backoff) (new RandomBackoff(((io.fabric.sdk.android.services.concurrency.internal.Backoff) (new ExponentialBackoff(1000L, 8))), 0.10000000000000001D))), ((io.fabric.sdk.android.services.concurrency.internal.RetryPolicy) (new DefaultRetryPolicy(5))))));
	//    0    0:new             #2   <Class AnswersRetryFilesSender>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:new             #24  <Class RetryManager>
	//    4    8:dup             
	//    5    9:new             #26  <Class RetryState>
	//    6   12:dup             
	//    7   13:new             #28  <Class RandomBackoff>
	//    8   16:dup             
	//    9   17:new             #30  <Class ExponentialBackoff>
	//   10   20:dup             
	//   11   21:ldc2w           #31  <Long 1000L>
	//   12   24:bipush          8
	//   13   26:invokespecial   #35  <Method void ExponentialBackoff(long, int)>
	//   14   29:ldc2w           #36  <Double 0.10000000000000001D>
	//   15   32:invokespecial   #40  <Method void RandomBackoff(io.fabric.sdk.android.services.concurrency.internal.Backoff, double)>
	//   16   35:new             #42  <Class DefaultRetryPolicy>
	//   17   38:dup             
	//   18   39:iconst_5        
	//   19   40:invokespecial   #45  <Method void DefaultRetryPolicy(int)>
	//   20   43:invokespecial   #48  <Method void RetryState(io.fabric.sdk.android.services.concurrency.internal.Backoff, io.fabric.sdk.android.services.concurrency.internal.RetryPolicy)>
	//   21   46:invokespecial   #51  <Method void RetryManager(RetryState)>
	//   22   49:invokespecial   #53  <Method void AnswersRetryFilesSender(SessionAnalyticsFilesSender, RetryManager)>
	//   23   52:areturn         
	}

	public boolean send(List list)
	{
		long l = System.nanoTime();
	//    0    0:invokestatic    #61  <Method long System.nanoTime()>
	//    1    3:lstore_2        
		if(retryManager.canRetry(l))
	//*   2    4:aload_0         
	//*   3    5:getfield        #19  <Field RetryManager retryManager>
	//*   4    8:lload_2         
	//*   5    9:invokevirtual   #65  <Method boolean RetryManager.canRetry(long)>
	//*   6   12:ifeq            45
		{
			if(filesSender.send(list))
	//*   7   15:aload_0         
	//*   8   16:getfield        #17  <Field SessionAnalyticsFilesSender filesSender>
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #69  <Method boolean SessionAnalyticsFilesSender.send(List)>
	//*  11   23:ifeq            35
			{
				retryManager.reset();
	//   12   26:aload_0         
	//   13   27:getfield        #19  <Field RetryManager retryManager>
	//   14   30:invokevirtual   #72  <Method void RetryManager.reset()>
				return true;
	//   15   33:iconst_1        
	//   16   34:ireturn         
			} else
			{
				retryManager.recordRetry(l);
	//   17   35:aload_0         
	//   18   36:getfield        #19  <Field RetryManager retryManager>
	//   19   39:lload_2         
	//   20   40:invokevirtual   #76  <Method void RetryManager.recordRetry(long)>
				return false;
	//   21   43:iconst_0        
	//   22   44:ireturn         
			}
		} else
		{
			return false;
	//   23   45:iconst_0        
	//   24   46:ireturn         
		}
	}

	private final SessionAnalyticsFilesSender filesSender;
	private final RetryManager retryManager;
}
