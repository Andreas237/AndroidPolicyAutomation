// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.concurrency;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//			Dependency

public class DependencyPriorityBlockingQueue extends PriorityBlockingQueue
{

	public DependencyPriorityBlockingQueue()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void PriorityBlockingQueue()>
	//    2    4:aload_0         
	//    3    5:new             #25  <Class LinkedList>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void LinkedList()>
	//    6   12:putfield        #28  <Field Queue blockedQueue>
	//    7   15:aload_0         
	//    8   16:new             #30  <Class ReentrantLock>
	//    9   19:dup             
	//   10   20:invokespecial   #31  <Method void ReentrantLock()>
	//   11   23:putfield        #33  <Field ReentrantLock lock>
	//   12   26:return          
	}

	boolean canProcess(Dependency dependency)
	{
		return dependency.areDependenciesMet();
	//    0    0:aload_1         
	//    1    1:invokeinterface #42  <Method boolean Dependency.areDependenciesMet()>
	//    2    6:ireturn         
	}

	public void clear()
	{
		lock.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ReentrantLock lock>
	//    2    4:invokevirtual   #47  <Method void ReentrantLock.lock()>
		blockedQueue.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field Queue blockedQueue>
	//    5   11:invokeinterface #51  <Method void Queue.clear()>
		super.clear();
	//    6   16:aload_0         
	//    7   17:invokespecial   #52  <Method void PriorityBlockingQueue.clear()>
		lock.unlock();
	//    8   20:aload_0         
	//    9   21:getfield        #33  <Field ReentrantLock lock>
	//   10   24:invokevirtual   #55  <Method void ReentrantLock.unlock()>
		return;
	//   11   27:return          
		Exception exception;
		exception;
	//   12   28:astore_1        
		lock.unlock();
	//   13   29:aload_0         
	//   14   30:getfield        #33  <Field ReentrantLock lock>
	//   15   33:invokevirtual   #55  <Method void ReentrantLock.unlock()>
		throw exception;
	//   16   36:aload_1         
	//   17   37:athrow          
	}

	Object[] concatenate(Object aobj[], Object aobj1[])
	{
		int i = aobj.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		int j = aobj1.length;
	//    3    3:aload_2         
	//    4    4:arraylength     
	//    5    5:istore          4
		Object aobj2[] = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), i + j);
	//    6    7:aload_1         
	//    7    8:invokevirtual   #63  <Method Class Object.getClass()>
	//    8   11:invokevirtual   #68  <Method Class Class.getComponentType()>
	//    9   14:iload_3         
	//   10   15:iload           4
	//   11   17:iadd            
	//   12   18:invokestatic    #74  <Method Object Array.newInstance(Class, int)>
	//   13   21:checkcast       #76  <Class Object[]>
	//   14   24:checkcast       #76  <Class Object[]>
	//   15   27:astore          5
		System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj2)), 0, i);
	//   16   29:aload_1         
	//   17   30:iconst_0        
	//   18   31:aload           5
	//   19   33:iconst_0        
	//   20   34:iload_3         
	//   21   35:invokestatic    #82  <Method void System.arraycopy(Object, int, Object, int, int)>
		System.arraycopy(((Object) (aobj1)), 0, ((Object) (aobj2)), i, j);
	//   22   38:aload_2         
	//   23   39:iconst_0        
	//   24   40:aload           5
	//   25   42:iload_3         
	//   26   43:iload           4
	//   27   45:invokestatic    #82  <Method void System.arraycopy(Object, int, Object, int, int)>
		return aobj2;
	//   28   48:aload           5
	//   29   50:areturn         
	}

	public boolean contains(Object obj)
	{
		lock.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ReentrantLock lock>
	//    2    4:invokevirtual   #47  <Method void ReentrantLock.lock()>
		if(super.contains(obj)) goto _L2; else goto _L1
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #87  <Method boolean PriorityBlockingQueue.contains(Object)>
	//    6   12:ifne            30
_L1:
		boolean flag = blockedQueue.contains(obj);
	//    7   15:aload_0         
	//    8   16:getfield        #28  <Field Queue blockedQueue>
	//    9   19:aload_1         
	//   10   20:invokeinterface #88  <Method boolean Queue.contains(Object)>
	//   11   25:istore_2        
		if(!flag) goto _L3; else goto _L2
	//   12   26:iload_2         
	//   13   27:ifeq            41
_L2:
		flag = true;
	//   14   30:iconst_1        
	//   15   31:istore_2        
_L5:
		lock.unlock();
	//   16   32:aload_0         
	//   17   33:getfield        #33  <Field ReentrantLock lock>
	//   18   36:invokevirtual   #55  <Method void ReentrantLock.unlock()>
		return flag;
	//   19   39:iload_2         
	//   20   40:ireturn         
_L3:
		flag = false;
	//   21   41:iconst_0        
	//   22   42:istore_2        
		if(true) goto _L5; else goto _L4
	//   23   43:goto            32
_L4:
		obj;
	//   24   46:astore_1        
		lock.unlock();
	//   25   47:aload_0         
	//   26   48:getfield        #33  <Field ReentrantLock lock>
	//   27   51:invokevirtual   #55  <Method void ReentrantLock.unlock()>
		throw obj;
	//   28   54:aload_1         
	//   29   55:athrow          
	}

	public int drainTo(Collection collection)
	{
		int i;
		int j;
		lock.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ReentrantLock lock>
	//    2    4:invokevirtual   #47  <Method void ReentrantLock.lock()>
		i = super.drainTo(collection);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #92  <Method int PriorityBlockingQueue.drainTo(Collection)>
	//    6   12:istore_2        
		j = blockedQueue.size();
	//    7   13:aload_0         
	//    8   14:getfield        #28  <Field Queue blockedQueue>
	//    9   17:invokeinterface #96  <Method int Queue.size()>
	//   10   22:istore_3        
		for(; !blockedQueue.isEmpty(); collection.add(blockedQueue.poll()));
	//   11   23:aload_0         
	//   12   24:getfield        #28  <Field Queue blockedQueue>
	//   13   27:invokeinterface #99  <Method boolean Queue.isEmpty()>
	//   14   32:ifne            64
	//   15   35:aload_1         
	//   16   36:aload_0         
	//   17   37:getfield        #28  <Field Queue blockedQueue>
	//   18   40:invokeinterface #103 <Method Object Queue.poll()>
	//   19   45:invokeinterface #108 <Method boolean Collection.add(Object)>
	//   20   50:pop             
		break MISSING_BLOCK_LABEL_64;
	//   21   51:goto            23
		collection;
	//   22   54:astore_1        
		lock.unlock();
	//   23   55:aload_0         
	//   24   56:getfield        #33  <Field ReentrantLock lock>
	//   25   59:invokevirtual   #55  <Method void ReentrantLock.unlock()>
		throw collection;
	//   26   62:aload_1         
	//   27   63:athrow          
		lock.unlock();
	//   28   64:aload_0         
	//   29   65:getfield        #33  <Field ReentrantLock lock>
	//   30   68:invokevirtual   #55  <Method void ReentrantLock.unlock()>
		return i + j;
	//   31   71:iload_2         
	//   32   72:iload_3         
	//   33   73:iadd            
	//   34   74:ireturn         
	}

	public int drainTo(Collection collection, int i)
	{
		int j;
		lock.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ReentrantLock lock>
	//    2    4:invokevirtual   #47  <Method void ReentrantLock.lock()>
		j = super.drainTo(collection, i);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokespecial   #112 <Method int PriorityBlockingQueue.drainTo(Collection, int)>
	//    7   13:istore_3        
_L2:
		if(blockedQueue.isEmpty() || j > i)
			break; /* Loop/switch isn't completed */
	//    8   14:aload_0         
	//    9   15:getfield        #28  <Field Queue blockedQueue>
	//   10   18:invokeinterface #99  <Method boolean Queue.isEmpty()>
	//   11   23:ifne            54
	//   12   26:iload_3         
	//   13   27:iload_2         
	//   14   28:icmpgt          54
		collection.add(blockedQueue.poll());
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #28  <Field Queue blockedQueue>
	//   18   36:invokeinterface #103 <Method Object Queue.poll()>
	//   19   41:invokeinterface #108 <Method boolean Collection.add(Object)>
	//   20   46:pop             
		j++;
	//   21   47:iload_3         
	//   22   48:iconst_1        
	//   23   49:iadd            
	//   24   50:istore_3        
		if(true) goto _L2; else goto _L1
	//   25   51:goto            14
_L1:
		lock.unlock();
	//   26   54:aload_0         
	//   27   55:getfield        #33  <Field ReentrantLock lock>
	//   28   58:invokevirtual   #55  <Method void ReentrantLock.unlock()>
		return j;
	//   29   61:iload_3         
	//   30   62:ireturn         
		collection;
	//   31   63:astore_1        
		lock.unlock();
	//   32   64:aload_0         
	//   33   65:getfield        #33  <Field ReentrantLock lock>
	//   34   68:invokevirtual   #55  <Method void ReentrantLock.unlock()>
		throw collection;
	//   35   71:aload_1         
	//   36   72:athrow          
	}

	Dependency get(int i, Long long1, TimeUnit timeunit)
		throws InterruptedException
	{
		do
		{
			Dependency dependency = performOperation(i, long1, timeunit);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #120 <Method Dependency performOperation(int, Long, TimeUnit)>
	//    5    7:astore          4
			if(dependency == null || canProcess(dependency))
	//*   6    9:aload           4
	//*   7   11:ifnull          23
	//*   8   14:aload_0         
	//*   9   15:aload           4
	//*  10   17:invokevirtual   #122 <Method boolean canProcess(Dependency)>
	//*  11   20:ifeq            26
				return dependency;
	//   12   23:aload           4
	//   13   25:areturn         
			offerBlockedResult(i, dependency);
	//   14   26:aload_0         
	//   15   27:iload_1         
	//   16   28:aload           4
	//   17   30:invokevirtual   #126 <Method boolean offerBlockedResult(int, Dependency)>
	//   18   33:pop             
		} while(true);
	//   19   34:goto            0
	}

	boolean offerBlockedResult(int i, Dependency dependency)
	{
		lock.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ReentrantLock lock>
	//    2    4:invokevirtual   #47  <Method void ReentrantLock.lock()>
		if(i != 1)
			break MISSING_BLOCK_LABEL_18;
	//    3    7:iload_1         
	//    4    8:iconst_1        
	//    5    9:icmpne          18
		super.remove(((Object) (dependency)));
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:invokespecial   #131 <Method boolean PriorityBlockingQueue.remove(Object)>
	//    9   17:pop             
		boolean flag = blockedQueue.offer(((Object) (dependency)));
	//   10   18:aload_0         
	//   11   19:getfield        #28  <Field Queue blockedQueue>
	//   12   22:aload_2         
	//   13   23:invokeinterface #134 <Method boolean Queue.offer(Object)>
	//   14   28:istore_3        
		lock.unlock();
	//   15   29:aload_0         
	//   16   30:getfield        #33  <Field ReentrantLock lock>
	//   17   33:invokevirtual   #55  <Method void ReentrantLock.unlock()>
		return flag;
	//   18   36:iload_3         
	//   19   37:ireturn         
		dependency;
	//   20   38:astore_2        
		lock.unlock();
	//   21   39:aload_0         
	//   22   40:getfield        #33  <Field ReentrantLock lock>
	//   23   43:invokevirtual   #55  <Method void ReentrantLock.unlock()>
		throw dependency;
	//   24   46:aload_2         
	//   25   47:athrow          
	}

	public Dependency peek()
	{
		Dependency dependency;
		try
		{
			dependency = get(1, ((Long) (null)), ((TimeUnit) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #139 <Method Dependency get(int, Long, TimeUnit)>
	//    5    7:astore_1        
		}
	//*   6    8:aload_1         
	//*   7    9:areturn         
		catch(InterruptedException interruptedexception)
	//*   8   10:astore_1        
		{
			return null;
	//    9   11:aconst_null     
	//   10   12:areturn         
		}
		return dependency;
	}

	public volatile Object peek()
	{
		return ((Object) (peek()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #142 <Method Dependency peek()>
	//    2    4:areturn         
	}

	Dependency performOperation(int i, Long long1, TimeUnit timeunit)
		throws InterruptedException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 3: default 32
	//	               0 34
	//	               1 42
	//	               2 50
	//	               3 58
		default:
			return null;
	//    2   32:aconst_null     
	//    3   33:areturn         

		case 0: // '\0'
			return (Dependency)super.take();
	//    4   34:aload_0         
	//    5   35:invokespecial   #145 <Method Object PriorityBlockingQueue.take()>
	//    6   38:checkcast       #38  <Class Dependency>
	//    7   41:areturn         

		case 1: // '\001'
			return (Dependency)super.peek();
	//    8   42:aload_0         
	//    9   43:invokespecial   #147 <Method Object PriorityBlockingQueue.peek()>
	//   10   46:checkcast       #38  <Class Dependency>
	//   11   49:areturn         

		case 2: // '\002'
			return (Dependency)super.poll();
	//   12   50:aload_0         
	//   13   51:invokespecial   #148 <Method Object PriorityBlockingQueue.poll()>
	//   14   54:checkcast       #38  <Class Dependency>
	//   15   57:areturn         

		case 3: // '\003'
			return (Dependency)super.poll(long1.longValue(), timeunit);
	//   16   58:aload_0         
	//   17   59:aload_2         
	//   18   60:invokevirtual   #154 <Method long Long.longValue()>
	//   19   63:aload_3         
	//   20   64:invokespecial   #157 <Method Object PriorityBlockingQueue.poll(long, TimeUnit)>
	//   21   67:checkcast       #38  <Class Dependency>
	//   22   70:areturn         
		}
	}

	public Dependency poll()
	{
		Dependency dependency;
		try
		{
			dependency = get(2, ((Long) (null)), ((TimeUnit) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #139 <Method Dependency get(int, Long, TimeUnit)>
	//    5    7:astore_1        
		}
	//*   6    8:aload_1         
	//*   7    9:areturn         
		catch(InterruptedException interruptedexception)
	//*   8   10:astore_1        
		{
			return null;
	//    9   11:aconst_null     
	//   10   12:areturn         
		}
		return dependency;
	}

	public Dependency poll(long l, TimeUnit timeunit)
		throws InterruptedException
	{
		return get(3, Long.valueOf(l), timeunit);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:lload_1         
	//    3    3:invokestatic    #162 <Method Long Long.valueOf(long)>
	//    4    6:aload_3         
	//    5    7:invokevirtual   #139 <Method Dependency get(int, Long, TimeUnit)>
	//    6   10:areturn         
	}

	public volatile Object poll()
	{
		return ((Object) (poll()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #165 <Method Dependency poll()>
	//    2    4:areturn         
	}

	public volatile Object poll(long l, TimeUnit timeunit)
		throws InterruptedException
	{
		return ((Object) (poll(l, timeunit)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #167 <Method Dependency poll(long, TimeUnit)>
	//    4    6:areturn         
	}

	public void recycleBlockedQueue()
	{
		lock.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ReentrantLock lock>
	//    2    4:invokevirtual   #47  <Method void ReentrantLock.lock()>
		Iterator iterator = blockedQueue.iterator();
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field Queue blockedQueue>
	//    5   11:invokeinterface #172 <Method Iterator Queue.iterator()>
	//    6   16:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    7   17:aload_1         
	//    8   18:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//    9   23:ifeq            69
			Dependency dependency = (Dependency)iterator.next();
	//   10   26:aload_1         
	//   11   27:invokeinterface #180 <Method Object Iterator.next()>
	//   12   32:checkcast       #38  <Class Dependency>
	//   13   35:astore_2        
			if(canProcess(dependency))
	//*  14   36:aload_0         
	//*  15   37:aload_2         
	//*  16   38:invokevirtual   #122 <Method boolean canProcess(Dependency)>
	//*  17   41:ifeq            17
			{
				super.offer(((Object) (dependency)));
	//   18   44:aload_0         
	//   19   45:aload_2         
	//   20   46:invokespecial   #181 <Method boolean PriorityBlockingQueue.offer(Object)>
	//   21   49:pop             
				iterator.remove();
	//   22   50:aload_1         
	//   23   51:invokeinterface #183 <Method void Iterator.remove()>
			}
		} while(true);
	//   24   56:goto            17
		break MISSING_BLOCK_LABEL_69;
		Exception exception;
		exception;
	//   25   59:astore_1        
		lock.unlock();
	//   26   60:aload_0         
	//   27   61:getfield        #33  <Field ReentrantLock lock>
	//   28   64:invokevirtual   #55  <Method void ReentrantLock.unlock()>
		throw exception;
	//   29   67:aload_1         
	//   30   68:athrow          
		lock.unlock();
	//   31   69:aload_0         
	//   32   70:getfield        #33  <Field ReentrantLock lock>
	//   33   73:invokevirtual   #55  <Method void ReentrantLock.unlock()>
		return;
	//   34   76:return          
	}

	public boolean remove(Object obj)
	{
		lock.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ReentrantLock lock>
	//    2    4:invokevirtual   #47  <Method void ReentrantLock.lock()>
		if(super.remove(obj)) goto _L2; else goto _L1
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #131 <Method boolean PriorityBlockingQueue.remove(Object)>
	//    6   12:ifne            30
_L1:
		boolean flag = blockedQueue.remove(obj);
	//    7   15:aload_0         
	//    8   16:getfield        #28  <Field Queue blockedQueue>
	//    9   19:aload_1         
	//   10   20:invokeinterface #184 <Method boolean Queue.remove(Object)>
	//   11   25:istore_2        
		if(!flag) goto _L3; else goto _L2
	//   12   26:iload_2         
	//   13   27:ifeq            41
_L2:
		flag = true;
	//   14   30:iconst_1        
	//   15   31:istore_2        
_L5:
		lock.unlock();
	//   16   32:aload_0         
	//   17   33:getfield        #33  <Field ReentrantLock lock>
	//   18   36:invokevirtual   #55  <Method void ReentrantLock.unlock()>
		return flag;
	//   19   39:iload_2         
	//   20   40:ireturn         
_L3:
		flag = false;
	//   21   41:iconst_0        
	//   22   42:istore_2        
		if(true) goto _L5; else goto _L4
	//   23   43:goto            32
_L4:
		obj;
	//   24   46:astore_1        
		lock.unlock();
	//   25   47:aload_0         
	//   26   48:getfield        #33  <Field ReentrantLock lock>
	//   27   51:invokevirtual   #55  <Method void ReentrantLock.unlock()>
		throw obj;
	//   28   54:aload_1         
	//   29   55:athrow          
	}

	public boolean removeAll(Collection collection)
	{
		boolean flag;
		boolean flag1;
		lock.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ReentrantLock lock>
	//    2    4:invokevirtual   #47  <Method void ReentrantLock.lock()>
		flag = super.removeAll(collection);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #188 <Method boolean PriorityBlockingQueue.removeAll(Collection)>
	//    6   12:istore_2        
		flag1 = blockedQueue.removeAll(collection);
	//    7   13:aload_0         
	//    8   14:getfield        #28  <Field Queue blockedQueue>
	//    9   17:aload_1         
	//   10   18:invokeinterface #189 <Method boolean Queue.removeAll(Collection)>
	//   11   23:istore_3        
		lock.unlock();
	//   12   24:aload_0         
	//   13   25:getfield        #33  <Field ReentrantLock lock>
	//   14   28:invokevirtual   #55  <Method void ReentrantLock.unlock()>
		return flag | flag1;
	//   15   31:iload_2         
	//   16   32:iload_3         
	//   17   33:ior             
	//   18   34:ireturn         
		collection;
	//   19   35:astore_1        
		lock.unlock();
	//   20   36:aload_0         
	//   21   37:getfield        #33  <Field ReentrantLock lock>
	//   22   40:invokevirtual   #55  <Method void ReentrantLock.unlock()>
		throw collection;
	//   23   43:aload_1         
	//   24   44:athrow          
	}

	public int size()
	{
		int i;
		int j;
		lock.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ReentrantLock lock>
	//    2    4:invokevirtual   #47  <Method void ReentrantLock.lock()>
		i = blockedQueue.size();
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field Queue blockedQueue>
	//    5   11:invokeinterface #96  <Method int Queue.size()>
	//    6   16:istore_1        
		j = super.size();
	//    7   17:aload_0         
	//    8   18:invokespecial   #191 <Method int PriorityBlockingQueue.size()>
	//    9   21:istore_2        
		lock.unlock();
	//   10   22:aload_0         
	//   11   23:getfield        #33  <Field ReentrantLock lock>
	//   12   26:invokevirtual   #55  <Method void ReentrantLock.unlock()>
		return i + j;
	//   13   29:iload_1         
	//   14   30:iload_2         
	//   15   31:iadd            
	//   16   32:ireturn         
		Exception exception;
		exception;
	//   17   33:astore_3        
		lock.unlock();
	//   18   34:aload_0         
	//   19   35:getfield        #33  <Field ReentrantLock lock>
	//   20   38:invokevirtual   #55  <Method void ReentrantLock.unlock()>
		throw exception;
	//   21   41:aload_3         
	//   22   42:athrow          
	}

	public Dependency take()
		throws InterruptedException
	{
		return get(0, ((Long) (null)), ((TimeUnit) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #139 <Method Dependency get(int, Long, TimeUnit)>
	//    5    7:areturn         
	}

	public volatile Object take()
		throws InterruptedException
	{
		return ((Object) (take()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #193 <Method Dependency take()>
	//    2    4:areturn         
	}

	public Object[] toArray()
	{
		Object aobj[];
		lock.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ReentrantLock lock>
	//    2    4:invokevirtual   #47  <Method void ReentrantLock.lock()>
		aobj = concatenate(super.toArray(), blockedQueue.toArray());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #197 <Method Object[] PriorityBlockingQueue.toArray()>
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field Queue blockedQueue>
	//    8   16:invokeinterface #198 <Method Object[] Queue.toArray()>
	//    9   21:invokevirtual   #200 <Method Object[] concatenate(Object[], Object[])>
	//   10   24:astore_1        
		lock.unlock();
	//   11   25:aload_0         
	//   12   26:getfield        #33  <Field ReentrantLock lock>
	//   13   29:invokevirtual   #55  <Method void ReentrantLock.unlock()>
		return aobj;
	//   14   32:aload_1         
	//   15   33:areturn         
		Exception exception;
		exception;
	//   16   34:astore_1        
		lock.unlock();
	//   17   35:aload_0         
	//   18   36:getfield        #33  <Field ReentrantLock lock>
	//   19   39:invokevirtual   #55  <Method void ReentrantLock.unlock()>
		throw exception;
	//   20   42:aload_1         
	//   21   43:athrow          
	}

	public Object[] toArray(Object aobj[])
	{
		lock.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ReentrantLock lock>
	//    2    4:invokevirtual   #47  <Method void ReentrantLock.lock()>
		aobj = concatenate(super.toArray(aobj), blockedQueue.toArray(aobj));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #203 <Method Object[] PriorityBlockingQueue.toArray(Object[])>
	//    7   13:aload_0         
	//    8   14:getfield        #28  <Field Queue blockedQueue>
	//    9   17:aload_1         
	//   10   18:invokeinterface #204 <Method Object[] Queue.toArray(Object[])>
	//   11   23:invokevirtual   #200 <Method Object[] concatenate(Object[], Object[])>
	//   12   26:astore_1        
		lock.unlock();
	//   13   27:aload_0         
	//   14   28:getfield        #33  <Field ReentrantLock lock>
	//   15   31:invokevirtual   #55  <Method void ReentrantLock.unlock()>
		return aobj;
	//   16   34:aload_1         
	//   17   35:areturn         
		aobj;
	//   18   36:astore_1        
		lock.unlock();
	//   19   37:aload_0         
	//   20   38:getfield        #33  <Field ReentrantLock lock>
	//   21   41:invokevirtual   #55  <Method void ReentrantLock.unlock()>
		throw aobj;
	//   22   44:aload_1         
	//   23   45:athrow          
	}

	static final int PEEK = 1;
	static final int POLL = 2;
	static final int POLL_WITH_TIMEOUT = 3;
	static final int TAKE = 0;
	final Queue blockedQueue = new LinkedList();
	private final ReentrantLock lock = new ReentrantLock();
}
