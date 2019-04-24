// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;

import java.util.ArrayDeque;
import java.util.Queue;

// Referenced classes of package com.bumptech.glide.load.engine.cache:
//			DiskCacheWriteLocker

static class DiskCacheWriteLocker$WriteLockPool
{

	DiskCacheWriteLocker.WriteLock obtain()
	{
		Queue queue = pool;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Queue pool>
	//    2    4:astore_1        
		queue;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Object obj1 = ((Object) ((DiskCacheWriteLocker.WriteLock)pool.poll()));
	//    5    7:aload_0         
	//    6    8:getfield        #22  <Field Queue pool>
	//    7   11:invokeinterface #31  <Method Object Queue.poll()>
	//    8   16:checkcast       #33  <Class DiskCacheWriteLocker$WriteLock>
	//    9   19:astore_2        
		queue;
	//   10   20:aload_1         
		JVM INSTR monitorexit ;
	//   11   21:monitorexit     
		  goto _L1
	//*  12   22:goto            30
		obj1;
	//   13   25:astore_2        
	//*  14   26:aload_1         
		throw obj1;
	//   15   27:monitorexit     
	//   16   28:aload_2         
	//   17   29:athrow          
_L1:
		Object obj = obj1;
	//   18   30:aload_2         
	//   19   31:astore_1        
		if(obj1 == null)
	//*  20   32:aload_2         
	//*  21   33:ifnonnull       44
			obj = ((Object) (new DiskCacheWriteLocker.WriteLock()));
	//   22   36:new             #33  <Class DiskCacheWriteLocker$WriteLock>
	//   23   39:dup             
	//   24   40:invokespecial   #34  <Method void DiskCacheWriteLocker$WriteLock()>
	//   25   43:astore_1        
		return ((DiskCacheWriteLocker.WriteLock) (obj));
	//   26   44:aload_1         
	//   27   45:areturn         
	}

	void offer(DiskCacheWriteLocker.WriteLock writelock)
	{
		Queue queue = pool;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Queue pool>
	//    2    4:astore_2        
		queue;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(pool.size() < 10)
	//*   5    7:aload_0         
	//*   6    8:getfield        #22  <Field Queue pool>
	//*   7   11:invokeinterface #40  <Method int Queue.size()>
	//*   8   16:bipush          10
	//*   9   18:icmpge          32
			pool.offer(((Object) (writelock)));
	//   10   21:aload_0         
	//   11   22:getfield        #22  <Field Queue pool>
	//   12   25:aload_1         
	//   13   26:invokeinterface #43  <Method boolean Queue.offer(Object)>
	//   14   31:pop             
		queue;
	//   15   32:aload_2         
		JVM INSTR monitorexit ;
	//   16   33:monitorexit     
		return;
	//   17   34:return          
		writelock;
	//   18   35:astore_1        
	//*  19   36:aload_2         
		throw writelock;
	//   20   37:monitorexit     
	//   21   38:aload_1         
	//   22   39:athrow          
	}

	private static final int MAX_POOL_SIZE = 10;
	private final Queue pool = new ArrayDeque();

	DiskCacheWriteLocker$WriteLockPool()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class ArrayDeque>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void ArrayDeque()>
	//    6   12:putfield        #22  <Field Queue pool>
	//    7   15:return          
	}
}
