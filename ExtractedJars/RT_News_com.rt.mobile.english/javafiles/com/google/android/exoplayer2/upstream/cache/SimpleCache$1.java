// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream.cache;

import android.os.ConditionVariable;

// Referenced classes of package com.google.android.exoplayer2.upstream.cache:
//			SimpleCache, CacheEvictor

class SimpleCache$1 extends Thread
{

	public void run()
	{
		synchronized(SimpleCache.this)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field SimpleCache this$0>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			val$conditionVariable.open();
	//    5    7:aload_0         
	//    6    8:getfield        #18  <Field ConditionVariable val$conditionVariable>
	//    7   11:invokevirtual   #29  <Method void ConditionVariable.open()>
			SimpleCache.access$000(SimpleCache.this);
	//    8   14:aload_0         
	//    9   15:getfield        #16  <Field SimpleCache this$0>
	//   10   18:invokestatic    #33  <Method void SimpleCache.access$000(SimpleCache)>
			SimpleCache.access$100(SimpleCache.this).onCacheInitialized();
	//   11   21:aload_0         
	//   12   22:getfield        #16  <Field SimpleCache this$0>
	//   13   25:invokestatic    #37  <Method CacheEvictor SimpleCache.access$100(SimpleCache)>
	//   14   28:invokeinterface #42  <Method void CacheEvictor.onCacheInitialized()>
		}
	//   15   33:aload_1         
	//   16   34:monitorexit     
		return;
	//   17   35:return          
		exception;
	//   18   36:astore_2        
		simplecache;
	//   19   37:aload_1         
		JVM INSTR monitorexit ;
	//   20   38:monitorexit     
		throw exception;
	//   21   39:aload_2         
	//   22   40:athrow          
	}

	final SimpleCache this$0;
	final ConditionVariable val$conditionVariable;

	SimpleCache$1(ConditionVariable conditionvariable)
	{
		this$0 = final_simplecache;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field SimpleCache this$0>
		val$conditionVariable = conditionvariable;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #18  <Field ConditionVariable val$conditionVariable>
		super(String.this);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #21  <Method void Thread(String)>
	//    9   15:return          
	}
}
