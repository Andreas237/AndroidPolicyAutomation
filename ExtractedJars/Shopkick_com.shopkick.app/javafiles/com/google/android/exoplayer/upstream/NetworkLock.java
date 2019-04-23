// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;

import java.io.IOException;
import java.util.PriorityQueue;

public final class NetworkLock
{
	public static class PriorityTooLowException extends IOException
	{

		public PriorityTooLowException(int i, int j)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #11  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #14  <Method void StringBuilder()>
		//    3    7:astore_3        
			stringbuilder.append("Priority too low [priority=");
		//    4    8:aload_3         
		//    5    9:ldc1            #16  <String "Priority too low [priority=">
		//    6   11:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(i);
		//    8   15:aload_3         
		//    9   16:iload_1         
		//   10   17:invokevirtual   #23  <Method StringBuilder StringBuilder.append(int)>
		//   11   20:pop             
			stringbuilder.append(", highest=");
		//   12   21:aload_3         
		//   13   22:ldc1            #25  <String ", highest=">
		//   14   24:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
		//   15   27:pop             
			stringbuilder.append(j);
		//   16   28:aload_3         
		//   17   29:iload_2         
		//   18   30:invokevirtual   #23  <Method StringBuilder StringBuilder.append(int)>
		//   19   33:pop             
			stringbuilder.append("]");
		//   20   34:aload_3         
		//   21   35:ldc1            #27  <String "]">
		//   22   37:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
		//   23   40:pop             
			super(stringbuilder.toString());
		//   24   41:aload_0         
		//   25   42:aload_3         
		//   26   43:invokevirtual   #31  <Method String StringBuilder.toString()>
		//   27   46:invokespecial   #34  <Method void IOException(String)>
		//   28   49:return          
		}
	}


	private NetworkLock()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void Object()>
	//    6   12:putfield        #31  <Field Object lock>
	//    7   15:aload_0         
	//    8   16:new             #33  <Class PriorityQueue>
	//    9   19:dup             
	//   10   20:invokespecial   #34  <Method void PriorityQueue()>
	//   11   23:putfield        #36  <Field PriorityQueue queue>
		highestPriority = 0x7fffffff;
	//   12   26:aload_0         
	//   13   27:ldc1            #37  <Int 0x7fffffff>
	//   14   29:putfield        #39  <Field int highestPriority>
	//   15   32:return          
	}

	public void add(int i)
	{
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			queue.add(((Object) (Integer.valueOf(i))));
	//    5    7:aload_0         
	//    6    8:getfield        #36  <Field PriorityQueue queue>
	//    7   11:iload_1         
	//    8   12:invokestatic    #47  <Method Integer Integer.valueOf(int)>
	//    9   15:invokevirtual   #50  <Method boolean PriorityQueue.add(Object)>
	//   10   18:pop             
			highestPriority = Math.min(highestPriority, i);
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:getfield        #39  <Field int highestPriority>
	//   14   24:iload_1         
	//   15   25:invokestatic    #56  <Method int Math.min(int, int)>
	//   16   28:putfield        #39  <Field int highestPriority>
		}
	//   17   31:aload_2         
	//   18   32:monitorexit     
		return;
	//   19   33:return          
		exception;
	//   20   34:astore_3        
		obj;
	//   21   35:aload_2         
		JVM INSTR monitorexit ;
	//   22   36:monitorexit     
		throw exception;
	//   23   37:aload_3         
	//   24   38:athrow          
	}

	public void proceed(int i)
		throws InterruptedException
	{
		Object obj = lock;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Object lock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		while(highestPriority < i) 
	//*   5    7:aload_0         
	//*   6    8:getfield        #39  <Field int highestPriority>
	//*   7   11:iload_1         
	//*   8   12:icmpge          25
			lock.wait();
	//    9   15:aload_0         
	//   10   16:getfield        #31  <Field Object lock>
	//   11   19:invokevirtual   #62  <Method void Object.wait()>
	//*  12   22:goto            7
		obj;
	//   13   25:aload_2         
		JVM INSTR monitorexit ;
	//   14   26:monitorexit     
		return;
	//   15   27:return          
		Exception exception;
		exception;
	//   16   28:astore_3        
		obj;
	//   17   29:aload_2         
		JVM INSTR monitorexit ;
	//   18   30:monitorexit     
		throw exception;
	//   19   31:aload_3         
	//   20   32:athrow          
	}

	public boolean proceedNonBlocking(int i)
	{
		Object obj = lock;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Object lock>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(highestPriority >= i)
	//*   5    7:aload_0         
	//*   6    8:getfield        #39  <Field int highestPriority>
	//*   7   11:iload_1         
	//*   8   12:icmplt          31
			flag = true;
	//    9   15:iconst_1        
	//   10   16:istore_2        
		else
	//*  11   17:goto            20
	//*  12   20:aload_3         
	//*  13   21:monitorexit     
	//*  14   22:iload_2         
	//*  15   23:ireturn         
	//*  16   24:astore          4
	//*  17   26:aload_3         
	//*  18   27:monitorexit     
	//*  19   28:aload           4
	//*  20   30:athrow          
			flag = false;
	//   21   31:iconst_0        
	//   22   32:istore_2        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  23   33:goto            20
	}

	public void proceedOrThrow(int i)
		throws PriorityTooLowException
	{
label0:
		{
			synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(highestPriority < i)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #39  <Field int highestPriority>
	//    7   11:iload_1         
	//    8   12:icmplt          18
			}
	//    9   15:aload_2         
	//   10   16:monitorexit     
			return;
	//   11   17:return          
		}
		throw new PriorityTooLowException(i, highestPriority);
	//   12   18:new             #6   <Class NetworkLock$PriorityTooLowException>
	//   13   21:dup             
	//   14   22:iload_1         
	//   15   23:aload_0         
	//   16   24:getfield        #39  <Field int highestPriority>
	//   17   27:invokespecial   #69  <Method void NetworkLock$PriorityTooLowException(int, int)>
	//   18   30:athrow          
		exception;
	//   19   31:astore_3        
		obj;
	//   20   32:aload_2         
		JVM INSTR monitorexit ;
	//   21   33:monitorexit     
		throw exception;
	//   22   34:aload_3         
	//   23   35:athrow          
	}

	public void remove(int i)
	{
		Object obj = lock;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Object lock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		queue.remove(((Object) (Integer.valueOf(i))));
	//    5    7:aload_0         
	//    6    8:getfield        #36  <Field PriorityQueue queue>
	//    7   11:iload_1         
	//    8   12:invokestatic    #47  <Method Integer Integer.valueOf(int)>
	//    9   15:invokevirtual   #72  <Method boolean PriorityQueue.remove(Object)>
	//   10   18:pop             
		if(queue.isEmpty())
	//*  11   19:aload_0         
	//*  12   20:getfield        #36  <Field PriorityQueue queue>
	//*  13   23:invokevirtual   #76  <Method boolean PriorityQueue.isEmpty()>
	//*  14   26:ifeq            35
		{
			i = 0x7fffffff;
	//   15   29:ldc1            #37  <Int 0x7fffffff>
	//   16   31:istore_1        
			break MISSING_BLOCK_LABEL_49;
	//   17   32:goto            49
		}
		i = ((Integer)queue.peek()).intValue();
	//   18   35:aload_0         
	//   19   36:getfield        #36  <Field PriorityQueue queue>
	//   20   39:invokevirtual   #80  <Method Object PriorityQueue.peek()>
	//   21   42:checkcast       #43  <Class Integer>
	//   22   45:invokevirtual   #84  <Method int Integer.intValue()>
	//   23   48:istore_1        
		highestPriority = i;
	//   24   49:aload_0         
	//   25   50:iload_1         
	//   26   51:putfield        #39  <Field int highestPriority>
		lock.notifyAll();
	//   27   54:aload_0         
	//   28   55:getfield        #31  <Field Object lock>
	//   29   58:invokevirtual   #87  <Method void Object.notifyAll()>
		obj;
	//   30   61:aload_2         
		JVM INSTR monitorexit ;
	//   31   62:monitorexit     
		return;
	//   32   63:return          
		Exception exception;
		exception;
	//   33   64:astore_3        
		obj;
	//   34   65:aload_2         
		JVM INSTR monitorexit ;
	//   35   66:monitorexit     
		throw exception;
	//   36   67:aload_3         
	//   37   68:athrow          
	}

	public static final int DOWNLOAD_PRIORITY = 10;
	public static final int STREAMING_PRIORITY = 0;
	public static final NetworkLock instance = new NetworkLock();
	private int highestPriority;
	private final Object lock = new Object();
	private final PriorityQueue queue = new PriorityQueue();

	static 
	{
	//    0    0:new             #2   <Class NetworkLock>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void NetworkLock()>
	//    3    7:putstatic       #27  <Field NetworkLock instance>
	//*   4   10:return          
	}
}
