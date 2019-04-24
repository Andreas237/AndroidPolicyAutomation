// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import b.a.a.a.a.c.a.*;
import b.a.a.a.a.d.f;
import java.util.List;

// Referenced classes of package com.crashlytics.android.answers:
//			RetryManager, RandomBackoff, SessionAnalyticsFilesSender

class AnswersRetryFilesSender
	implements f
{

	AnswersRetryFilesSender(SessionAnalyticsFilesSender sessionanalyticsfilessender, RetryManager retrymanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		filesSender = sessionanalyticsfilessender;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field SessionAnalyticsFilesSender filesSender>
		retryManager = retrymanager;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #30  <Field RetryManager retryManager>
	//    8   14:return          
	}

	public static AnswersRetryFilesSender build(SessionAnalyticsFilesSender sessionanalyticsfilessender)
	{
		return new AnswersRetryFilesSender(sessionanalyticsfilessender, new RetryManager(new e(((b.a.a.a.a.c.a.a) (new RandomBackoff(((b.a.a.a.a.c.a.a) (new c(1000L, 8))), 0.10000000000000001D))), ((b.a.a.a.a.c.a.d) (new b(5))))));
	//    0    0:new             #2   <Class AnswersRetryFilesSender>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:new             #35  <Class RetryManager>
	//    4    8:dup             
	//    5    9:new             #37  <Class e>
	//    6   12:dup             
	//    7   13:new             #39  <Class RandomBackoff>
	//    8   16:dup             
	//    9   17:new             #41  <Class c>
	//   10   20:dup             
	//   11   21:ldc2w           #42  <Long 1000L>
	//   12   24:bipush          8
	//   13   26:invokespecial   #46  <Method void c(long, int)>
	//   14   29:ldc2w           #14  <Double 0.10000000000000001D>
	//   15   32:invokespecial   #49  <Method void RandomBackoff(b.a.a.a.a.c.a.a, double)>
	//   16   35:new             #51  <Class b>
	//   17   38:dup             
	//   18   39:iconst_5        
	//   19   40:invokespecial   #54  <Method void b(int)>
	//   20   43:invokespecial   #57  <Method void e(b.a.a.a.a.c.a.a, b.a.a.a.a.c.a.d)>
	//   21   46:invokespecial   #60  <Method void RetryManager(e)>
	//   22   49:invokespecial   #62  <Method void AnswersRetryFilesSender(SessionAnalyticsFilesSender, RetryManager)>
	//   23   52:areturn         
	}

	public boolean send(List list)
	{
		long l = System.nanoTime();
	//    0    0:invokestatic    #70  <Method long System.nanoTime()>
	//    1    3:lstore_2        
		if(retryManager.canRetry(l))
	//*   2    4:aload_0         
	//*   3    5:getfield        #30  <Field RetryManager retryManager>
	//*   4    8:lload_2         
	//*   5    9:invokevirtual   #74  <Method boolean RetryManager.canRetry(long)>
	//*   6   12:ifeq            43
		{
			if(filesSender.send(list))
	//*   7   15:aload_0         
	//*   8   16:getfield        #28  <Field SessionAnalyticsFilesSender filesSender>
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #78  <Method boolean SessionAnalyticsFilesSender.send(List)>
	//*  11   23:ifeq            35
			{
				retryManager.reset();
	//   12   26:aload_0         
	//   13   27:getfield        #30  <Field RetryManager retryManager>
	//   14   30:invokevirtual   #81  <Method void RetryManager.reset()>
				return true;
	//   15   33:iconst_1        
	//   16   34:ireturn         
			}
			retryManager.recordRetry(l);
	//   17   35:aload_0         
	//   18   36:getfield        #30  <Field RetryManager retryManager>
	//   19   39:lload_2         
	//   20   40:invokevirtual   #85  <Method void RetryManager.recordRetry(long)>
		}
		return false;
	//   21   43:iconst_0        
	//   22   44:ireturn         
	}

	private static final int BACKOFF_MS = 1000;
	private static final int BACKOFF_POWER = 8;
	private static final double JITTER_PERCENT = 0.10000000000000001D;
	private static final int MAX_RETRIES = 5;
	private final SessionAnalyticsFilesSender filesSender;
	private final RetryManager retryManager;
}
