// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream.cache;

import android.os.ConditionVariable;

// Referenced classes of package com.google.android.exoplayer.upstream.cache:
//			SimpleCache, CacheEvictor

class SimpleCache$1 extends Thread
{

	public void run()
	{
		SimpleCache simplecache = SimpleCache.this;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SimpleCache this$0>
	//    2    4:astore_1        
		simplecache;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		val$conditionVariable.open();
	//    5    7:aload_0         
	//    6    8:getfield        #18  <Field ConditionVariable val$conditionVariable>
	//    7   11:invokevirtual   #31  <Method void ConditionVariable.open()>
		SimpleCache.access$000(SimpleCache.this);
	//    8   14:aload_0         
	//    9   15:getfield        #16  <Field SimpleCache this$0>
	//   10   18:invokestatic    #35  <Method void SimpleCache.access$000(SimpleCache)>
		break MISSING_BLOCK_LABEL_34;
	//   11   21:goto            34
		Object obj;
		obj;
	//   12   24:astore_2        
		SimpleCache.access$102(SimpleCache.this, ((eption) (obj)));
	//   13   25:aload_0         
	//   14   26:getfield        #16  <Field SimpleCache this$0>
	//   15   29:aload_2         
	//   16   30:invokestatic    #39  <Method Cache$CacheException SimpleCache.access$102(SimpleCache, Cache$CacheException)>
	//   17   33:pop             
		SimpleCache.access$200(SimpleCache.this).onCacheInitialized();
	//   18   34:aload_0         
	//   19   35:getfield        #16  <Field SimpleCache this$0>
	//   20   38:invokestatic    #43  <Method CacheEvictor SimpleCache.access$200(SimpleCache)>
	//   21   41:invokeinterface #48  <Method void CacheEvictor.onCacheInitialized()>
		simplecache;
	//   22   46:aload_1         
		JVM INSTR monitorexit ;
	//   23   47:monitorexit     
		return;
	//   24   48:return          
		obj;
	//   25   49:astore_2        
		simplecache;
	//   26   50:aload_1         
		JVM INSTR monitorexit ;
	//   27   51:monitorexit     
		throw obj;
	//   28   52:aload_2         
	//   29   53:athrow          
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
