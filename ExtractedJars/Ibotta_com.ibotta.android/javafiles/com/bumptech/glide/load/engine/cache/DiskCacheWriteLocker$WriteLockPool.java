// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;

import java.util.ArrayDeque;
import java.util.Queue;

// Referenced classes of package com.bumptech.glide.load.engine.cache:
//			DiskCacheWriteLocker

private static class DiskCacheWriteLocker$WriteLockPool
{

	DiskCacheWriteLocker.WriteLock obtain()
	{
		DiskCacheWriteLocker.WriteLock writelock;
		synchronized(pool)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field Queue pool>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			writelock = (DiskCacheWriteLocker.WriteLock)pool.poll();
	//    5    7:aload_0         
	//    6    8:getfield        #19  <Field Queue pool>
	//    7   11:invokeinterface #28  <Method Object Queue.poll()>
	//    8   16:checkcast       #30  <Class DiskCacheWriteLocker$WriteLock>
	//    9   19:astore_2        
		}
	//   10   20:aload_1         
	//   11   21:monitorexit     
		obj = ((Object) (writelock));
	//   12   22:aload_2         
	//   13   23:astore_1        
		if(writelock == null)
	//*  14   24:aload_2         
	//*  15   25:ifnonnull       36
			obj = ((Object) (new DiskCacheWriteLocker.WriteLock()));
	//   16   28:new             #30  <Class DiskCacheWriteLocker$WriteLock>
	//   17   31:dup             
	//   18   32:invokespecial   #31  <Method void DiskCacheWriteLocker$WriteLock()>
	//   19   35:astore_1        
		return ((DiskCacheWriteLocker.WriteLock) (obj));
	//   20   36:aload_1         
	//   21   37:areturn         
		exception;
	//   22   38:astore_2        
		obj;
	//   23   39:aload_1         
		JVM INSTR monitorexit ;
	//   24   40:monitorexit     
		throw exception;
	//   25   41:aload_2         
	//   26   42:athrow          
	}

	void offer(DiskCacheWriteLocker.WriteLock writelock)
	{
		synchronized(pool)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field Queue pool>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(pool.size() < 10)
	//*   5    7:aload_0         
	//*   6    8:getfield        #19  <Field Queue pool>
	//*   7   11:invokeinterface #37  <Method int Queue.size()>
	//*   8   16:bipush          10
	//*   9   18:icmpge          32
				pool.offer(((Object) (writelock)));
	//   10   21:aload_0         
	//   11   22:getfield        #19  <Field Queue pool>
	//   12   25:aload_1         
	//   13   26:invokeinterface #40  <Method boolean Queue.offer(Object)>
	//   14   31:pop             
		}
	//   15   32:aload_2         
	//   16   33:monitorexit     
		return;
	//   17   34:return          
		writelock;
	//   18   35:astore_1        
		queue;
	//   19   36:aload_2         
		JVM INSTR monitorexit ;
	//   20   37:monitorexit     
		throw writelock;
	//   21   38:aload_1         
	//   22   39:athrow          
	}

	private final Queue pool = new ArrayDeque();

	DiskCacheWriteLocker$WriteLockPool()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ArrayDeque>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void ArrayDeque()>
	//    6   12:putfield        #19  <Field Queue pool>
	//    7   15:return          
	}
}
