// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class DiskCacheWriteLocker
{
	static class WriteLock
	{

		int interestedThreads;
		final Lock lock = new ReentrantLock();

		WriteLock()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #17  <Class ReentrantLock>
		//    4    8:dup             
		//    5    9:invokespecial   #18  <Method void ReentrantLock()>
		//    6   12:putfield        #20  <Field Lock lock>
		//    7   15:return          
		}
	}

	static class WriteLockPool
	{

		WriteLock obtain()
		{
			Queue queue = pool;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field Queue pool>
		//    2    4:astore_1        
			queue;
		//    3    5:aload_1         
			JVM INSTR monitorenter ;
		//    4    6:monitorenter    
			Object obj1 = ((Object) ((WriteLock)pool.poll()));
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
				obj = ((Object) (new WriteLock()));
		//   22   36:new             #33  <Class DiskCacheWriteLocker$WriteLock>
		//   23   39:dup             
		//   24   40:invokespecial   #34  <Method void DiskCacheWriteLocker$WriteLock()>
		//   25   43:astore_1        
			return ((WriteLock) (obj));
		//   26   44:aload_1         
		//   27   45:areturn         
		}

		void offer(WriteLock writelock)
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

		WriteLockPool()
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


	DiskCacheWriteLocker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void HashMap()>
	//    6   12:putfield        #24  <Field Map locks>
	//    7   15:aload_0         
	//    8   16:new             #9   <Class DiskCacheWriteLocker$WriteLockPool>
	//    9   19:dup             
	//   10   20:invokespecial   #25  <Method void DiskCacheWriteLocker$WriteLockPool()>
	//   11   23:putfield        #27  <Field DiskCacheWriteLocker$WriteLockPool writeLockPool>
	//   12   26:return          
	}

	void acquire(Key key)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		WriteLock writelock1 = (WriteLock)locks.get(((Object) (key)));
	//    2    2:aload_0         
	//    3    3:getfield        #24  <Field Map locks>
	//    4    6:aload_1         
	//    5    7:invokeinterface #36  <Method Object Map.get(Object)>
	//    6   12:checkcast       #6   <Class DiskCacheWriteLocker$WriteLock>
	//    7   15:astore_3        
		WriteLock writelock;
		writelock = writelock1;
	//    8   16:aload_3         
	//    9   17:astore_2        
		if(writelock1 != null)
			break MISSING_BLOCK_LABEL_42;
	//   10   18:aload_3         
	//   11   19:ifnonnull       42
		writelock = writeLockPool.obtain();
	//   12   22:aload_0         
	//   13   23:getfield        #27  <Field DiskCacheWriteLocker$WriteLockPool writeLockPool>
	//   14   26:invokevirtual   #40  <Method DiskCacheWriteLocker$WriteLock DiskCacheWriteLocker$WriteLockPool.obtain()>
	//   15   29:astore_2        
		locks.put(((Object) (key)), ((Object) (writelock)));
	//   16   30:aload_0         
	//   17   31:getfield        #24  <Field Map locks>
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:invokeinterface #44  <Method Object Map.put(Object, Object)>
	//   21   41:pop             
		writelock.interestedThreads = writelock.interestedThreads + 1;
	//   22   42:aload_2         
	//   23   43:aload_2         
	//   24   44:getfield        #48  <Field int DiskCacheWriteLocker$WriteLock.interestedThreads>
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:putfield        #48  <Field int DiskCacheWriteLocker$WriteLock.interestedThreads>
		this;
	//   28   52:aload_0         
		JVM INSTR monitorexit ;
	//   29   53:monitorexit     
		  goto _L1
	//*  30   54:goto            62
		key;
	//   31   57:astore_1        
	//*  32   58:aload_0         
		throw key;
	//   33   59:monitorexit     
	//   34   60:aload_1         
	//   35   61:athrow          
_L1:
		writelock.lock.lock();
	//   36   62:aload_2         
	//   37   63:getfield        #52  <Field Lock DiskCacheWriteLocker$WriteLock.lock>
	//   38   66:invokeinterface #56  <Method void Lock.lock()>
		return;
	//   39   71:return          
	}

	void release(Key key)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		WriteLock writelock;
		writelock = (WriteLock)Preconditions.checkNotNull(locks.get(((Object) (key))));
	//    2    2:aload_0         
	//    3    3:getfield        #24  <Field Map locks>
	//    4    6:aload_1         
	//    5    7:invokeinterface #36  <Method Object Map.get(Object)>
	//    6   12:invokestatic    #62  <Method Object Preconditions.checkNotNull(Object)>
	//    7   15:checkcast       #6   <Class DiskCacheWriteLocker$WriteLock>
	//    8   18:astore_2        
		if(writelock.interestedThreads < 1)
	//*   9   19:aload_2         
	//*  10   20:getfield        #48  <Field int DiskCacheWriteLocker$WriteLock.interestedThreads>
	//*  11   23:iconst_1        
	//*  12   24:icmpge          66
			throw new IllegalStateException((new StringBuilder()).append("Cannot release a lock that is not held, key: ").append(((Object) (key))).append(", interestedThreads: ").append(writelock.interestedThreads).toString());
	//   13   27:new             #64  <Class IllegalStateException>
	//   14   30:dup             
	//   15   31:new             #66  <Class StringBuilder>
	//   16   34:dup             
	//   17   35:invokespecial   #67  <Method void StringBuilder()>
	//   18   38:ldc1            #69  <String "Cannot release a lock that is not held, key: ">
	//   19   40:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   20   43:aload_1         
	//   21   44:invokevirtual   #76  <Method StringBuilder StringBuilder.append(Object)>
	//   22   47:ldc1            #78  <String ", interestedThreads: ">
	//   23   49:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   24   52:aload_2         
	//   25   53:getfield        #48  <Field int DiskCacheWriteLocker$WriteLock.interestedThreads>
	//   26   56:invokevirtual   #81  <Method StringBuilder StringBuilder.append(int)>
	//   27   59:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   28   62:invokespecial   #88  <Method void IllegalStateException(String)>
	//   29   65:athrow          
		writelock.interestedThreads = writelock.interestedThreads - 1;
	//   30   66:aload_2         
	//   31   67:aload_2         
	//   32   68:getfield        #48  <Field int DiskCacheWriteLocker$WriteLock.interestedThreads>
	//   33   71:iconst_1        
	//   34   72:isub            
	//   35   73:putfield        #48  <Field int DiskCacheWriteLocker$WriteLock.interestedThreads>
		if(writelock.interestedThreads == 0)
	//*  36   76:aload_2         
	//*  37   77:getfield        #48  <Field int DiskCacheWriteLocker$WriteLock.interestedThreads>
	//*  38   80:ifne            158
		{
			WriteLock writelock1 = (WriteLock)locks.remove(((Object) (key)));
	//   39   83:aload_0         
	//   40   84:getfield        #24  <Field Map locks>
	//   41   87:aload_1         
	//   42   88:invokeinterface #91  <Method Object Map.remove(Object)>
	//   43   93:checkcast       #6   <Class DiskCacheWriteLocker$WriteLock>
	//   44   96:astore_3        
			if(!((Object) (writelock1)).equals(((Object) (writelock))))
	//*  45   97:aload_3         
	//*  46   98:aload_2         
	//*  47   99:invokevirtual   #95  <Method boolean Object.equals(Object)>
	//*  48  102:ifne            150
				throw new IllegalStateException((new StringBuilder()).append("Removed the wrong lock, expected to remove: ").append(((Object) (writelock))).append(", but actually removed: ").append(((Object) (writelock1))).append(", key: ").append(((Object) (key))).toString());
	//   49  105:new             #64  <Class IllegalStateException>
	//   50  108:dup             
	//   51  109:new             #66  <Class StringBuilder>
	//   52  112:dup             
	//   53  113:invokespecial   #67  <Method void StringBuilder()>
	//   54  116:ldc1            #97  <String "Removed the wrong lock, expected to remove: ">
	//   55  118:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   56  121:aload_2         
	//   57  122:invokevirtual   #76  <Method StringBuilder StringBuilder.append(Object)>
	//   58  125:ldc1            #99  <String ", but actually removed: ">
	//   59  127:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   60  130:aload_3         
	//   61  131:invokevirtual   #76  <Method StringBuilder StringBuilder.append(Object)>
	//   62  134:ldc1            #101 <String ", key: ">
	//   63  136:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   64  139:aload_1         
	//   65  140:invokevirtual   #76  <Method StringBuilder StringBuilder.append(Object)>
	//   66  143:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   67  146:invokespecial   #88  <Method void IllegalStateException(String)>
	//   68  149:athrow          
			writeLockPool.offer(writelock1);
	//   69  150:aload_0         
	//   70  151:getfield        #27  <Field DiskCacheWriteLocker$WriteLockPool writeLockPool>
	//   71  154:aload_3         
	//   72  155:invokevirtual   #105 <Method void DiskCacheWriteLocker$WriteLockPool.offer(DiskCacheWriteLocker$WriteLock)>
		}
		this;
	//   73  158:aload_0         
		JVM INSTR monitorexit ;
	//   74  159:monitorexit     
		  goto _L1
	//*  75  160:goto            168
		key;
	//   76  163:astore_1        
	//*  77  164:aload_0         
		throw key;
	//   78  165:monitorexit     
	//   79  166:aload_1         
	//   80  167:athrow          
_L1:
		writelock.lock.unlock();
	//   81  168:aload_2         
	//   82  169:getfield        #52  <Field Lock DiskCacheWriteLocker$WriteLock.lock>
	//   83  172:invokeinterface #108 <Method void Lock.unlock()>
		return;
	//   84  177:return          
	}

	private final Map locks = new HashMap();
	private final WriteLockPool writeLockPool = new WriteLockPool();
}
