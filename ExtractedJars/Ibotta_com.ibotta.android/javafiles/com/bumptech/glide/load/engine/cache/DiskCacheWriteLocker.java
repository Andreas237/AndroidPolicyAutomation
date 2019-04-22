// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.util.Preconditions;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class DiskCacheWriteLocker
{
	private static class WriteLock
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

	private static class WriteLockPool
	{

		WriteLock obtain()
		{
			WriteLock writelock;
			synchronized(pool)
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field Queue pool>
		//*   2    4:astore_1        
		//*   3    5:aload_1         
		//*   4    6:monitorenter    
			{
				writelock = (WriteLock)pool.poll();
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
				obj = ((Object) (new WriteLock()));
		//   16   28:new             #30  <Class DiskCacheWriteLocker$WriteLock>
		//   17   31:dup             
		//   18   32:invokespecial   #31  <Method void DiskCacheWriteLocker$WriteLock()>
		//   19   35:astore_1        
			return ((WriteLock) (obj));
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

		void offer(WriteLock writelock)
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

		WriteLockPool()
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

	void acquire(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		WriteLock writelock1 = (WriteLock)locks.get(((Object) (s)));
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
		locks.put(((Object) (s)), ((Object) (writelock)));
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
		writelock.lock.lock();
	//   30   54:aload_2         
	//   31   55:getfield        #52  <Field Lock DiskCacheWriteLocker$WriteLock.lock>
	//   32   58:invokeinterface #56  <Method void Lock.lock()>
		return;
	//   33   63:return          
		s;
	//   34   64:astore_1        
		this;
	//   35   65:aload_0         
		JVM INSTR monitorexit ;
	//   36   66:monitorexit     
		throw s;
	//   37   67:aload_1         
	//   38   68:athrow          
	}

	void release(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		WriteLock writelock;
		WriteLock writelock1;
		writelock = (WriteLock)Preconditions.checkNotNull(locks.get(((Object) (s))));
	//    2    2:aload_0         
	//    3    3:getfield        #24  <Field Map locks>
	//    4    6:aload_1         
	//    5    7:invokeinterface #36  <Method Object Map.get(Object)>
	//    6   12:invokestatic    #62  <Method Object Preconditions.checkNotNull(Object)>
	//    7   15:checkcast       #6   <Class DiskCacheWriteLocker$WriteLock>
	//    8   18:astore_2        
		if(writelock.interestedThreads < 1)
			break MISSING_BLOCK_LABEL_156;
	//    9   19:aload_2         
	//   10   20:getfield        #48  <Field int DiskCacheWriteLocker$WriteLock.interestedThreads>
	//   11   23:iconst_1        
	//   12   24:icmplt          156
		writelock.interestedThreads = writelock.interestedThreads - 1;
	//   13   27:aload_2         
	//   14   28:aload_2         
	//   15   29:getfield        #48  <Field int DiskCacheWriteLocker$WriteLock.interestedThreads>
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:putfield        #48  <Field int DiskCacheWriteLocker$WriteLock.interestedThreads>
		if(writelock.interestedThreads != 0)
			break MISSING_BLOCK_LABEL_144;
	//   19   37:aload_2         
	//   20   38:getfield        #48  <Field int DiskCacheWriteLocker$WriteLock.interestedThreads>
	//   21   41:ifne            144
		writelock1 = (WriteLock)locks.remove(((Object) (s)));
	//   22   44:aload_0         
	//   23   45:getfield        #24  <Field Map locks>
	//   24   48:aload_1         
	//   25   49:invokeinterface #65  <Method Object Map.remove(Object)>
	//   26   54:checkcast       #6   <Class DiskCacheWriteLocker$WriteLock>
	//   27   57:astore_3        
		if(((Object) (writelock1)).equals(((Object) (writelock))))
	//*  28   58:aload_3         
	//*  29   59:aload_2         
	//*  30   60:invokevirtual   #69  <Method boolean Object.equals(Object)>
	//*  31   63:ifeq            77
		{
			writeLockPool.offer(writelock1);
	//   32   66:aload_0         
	//   33   67:getfield        #27  <Field DiskCacheWriteLocker$WriteLockPool writeLockPool>
	//   34   70:aload_3         
	//   35   71:invokevirtual   #73  <Method void DiskCacheWriteLocker$WriteLockPool.offer(DiskCacheWriteLocker$WriteLock)>
			break MISSING_BLOCK_LABEL_144;
	//   36   74:goto            144
		}
		StringBuilder stringbuilder1 = new StringBuilder();
	//   37   77:new             #75  <Class StringBuilder>
	//   38   80:dup             
	//   39   81:invokespecial   #76  <Method void StringBuilder()>
	//   40   84:astore          4
		stringbuilder1.append("Removed the wrong lock, expected to remove: ");
	//   41   86:aload           4
	//   42   88:ldc1            #78  <String "Removed the wrong lock, expected to remove: ">
	//   43   90:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   44   93:pop             
		stringbuilder1.append(((Object) (writelock)));
	//   45   94:aload           4
	//   46   96:aload_2         
	//   47   97:invokevirtual   #85  <Method StringBuilder StringBuilder.append(Object)>
	//   48  100:pop             
		stringbuilder1.append(", but actually removed: ");
	//   49  101:aload           4
	//   50  103:ldc1            #87  <String ", but actually removed: ">
	//   51  105:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   52  108:pop             
		stringbuilder1.append(((Object) (writelock1)));
	//   53  109:aload           4
	//   54  111:aload_3         
	//   55  112:invokevirtual   #85  <Method StringBuilder StringBuilder.append(Object)>
	//   56  115:pop             
		stringbuilder1.append(", safeKey: ");
	//   57  116:aload           4
	//   58  118:ldc1            #89  <String ", safeKey: ">
	//   59  120:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   60  123:pop             
		stringbuilder1.append(s);
	//   61  124:aload           4
	//   62  126:aload_1         
	//   63  127:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   64  130:pop             
		throw new IllegalStateException(stringbuilder1.toString());
	//   65  131:new             #91  <Class IllegalStateException>
	//   66  134:dup             
	//   67  135:aload           4
	//   68  137:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   69  140:invokespecial   #97  <Method void IllegalStateException(String)>
	//   70  143:athrow          
		this;
	//   71  144:aload_0         
		JVM INSTR monitorexit ;
	//   72  145:monitorexit     
		writelock.lock.unlock();
	//   73  146:aload_2         
	//   74  147:getfield        #52  <Field Lock DiskCacheWriteLocker$WriteLock.lock>
	//   75  150:invokeinterface #100 <Method void Lock.unlock()>
		return;
	//   76  155:return          
		StringBuilder stringbuilder = new StringBuilder();
	//   77  156:new             #75  <Class StringBuilder>
	//   78  159:dup             
	//   79  160:invokespecial   #76  <Method void StringBuilder()>
	//   80  163:astore_3        
		stringbuilder.append("Cannot release a lock that is not held, safeKey: ");
	//   81  164:aload_3         
	//   82  165:ldc1            #102 <String "Cannot release a lock that is not held, safeKey: ">
	//   83  167:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   84  170:pop             
		stringbuilder.append(s);
	//   85  171:aload_3         
	//   86  172:aload_1         
	//   87  173:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   88  176:pop             
		stringbuilder.append(", interestedThreads: ");
	//   89  177:aload_3         
	//   90  178:ldc1            #104 <String ", interestedThreads: ">
	//   91  180:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   92  183:pop             
		stringbuilder.append(writelock.interestedThreads);
	//   93  184:aload_3         
	//   94  185:aload_2         
	//   95  186:getfield        #48  <Field int DiskCacheWriteLocker$WriteLock.interestedThreads>
	//   96  189:invokevirtual   #107 <Method StringBuilder StringBuilder.append(int)>
	//   97  192:pop             
		throw new IllegalStateException(stringbuilder.toString());
	//   98  193:new             #91  <Class IllegalStateException>
	//   99  196:dup             
	//  100  197:aload_3         
	//  101  198:invokevirtual   #95  <Method String StringBuilder.toString()>
	//  102  201:invokespecial   #97  <Method void IllegalStateException(String)>
	//  103  204:athrow          
		s;
	//  104  205:astore_1        
		this;
	//  105  206:aload_0         
		JVM INSTR monitorexit ;
	//  106  207:monitorexit     
		throw s;
	//  107  208:aload_1         
	//  108  209:athrow          
	}

	private final Map locks = new HashMap();
	private final WriteLockPool writeLockPool = new WriteLockPool();
}
