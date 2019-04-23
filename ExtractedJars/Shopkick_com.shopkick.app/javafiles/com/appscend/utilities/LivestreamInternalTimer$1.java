// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.utilities;

import android.os.Handler;
import android.os.SystemClock;

// Referenced classes of package com.appscend.utilities:
//			LivestreamInternalTimer

class LivestreamInternalTimer$1
	implements Runnable
{

	public void run()
	{
		LivestreamInternalTimer livestreaminternaltimer = LivestreamInternalTimer.this;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field LivestreamInternalTimer this$0>
	//    2    4:astore_1        
		LivestreamInternalTimer.access$002(livestreaminternaltimer, LivestreamInternalTimer.access$000(livestreaminternaltimer) + 800);
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:invokestatic    #23  <Method int LivestreamInternalTimer.access$000(LivestreamInternalTimer)>
	//    6   10:sipush          800
	//    7   13:iadd            
	//    8   14:invokestatic    #27  <Method int LivestreamInternalTimer.access$002(LivestreamInternalTimer, int)>
	//    9   17:pop             
		if(!LivestreamInternalTimer.access$100(LivestreamInternalTimer.this))
	//*  10   18:aload_0         
	//*  11   19:getfield        #14  <Field LivestreamInternalTimer this$0>
	//*  12   22:invokestatic    #31  <Method boolean LivestreamInternalTimer.access$100(LivestreamInternalTimer)>
	//*  13   25:ifne            47
			mHandler.postAtTime(((Runnable) (this)), SystemClock.uptimeMillis() + 800L);
	//   14   28:aload_0         
	//   15   29:getfield        #14  <Field LivestreamInternalTimer this$0>
	//   16   32:getfield        #35  <Field Handler LivestreamInternalTimer.mHandler>
	//   17   35:aload_0         
	//   18   36:invokestatic    #41  <Method long SystemClock.uptimeMillis()>
	//   19   39:ldc2w           #42  <Long 800L>
	//   20   42:ladd            
	//   21   43:invokevirtual   #49  <Method boolean Handler.postAtTime(Runnable, long)>
	//   22   46:pop             
	//   23   47:return          
	}

	final LivestreamInternalTimer this$0;

	LivestreamInternalTimer$1()
	{
		this$0 = LivestreamInternalTimer.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field LivestreamInternalTimer this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
