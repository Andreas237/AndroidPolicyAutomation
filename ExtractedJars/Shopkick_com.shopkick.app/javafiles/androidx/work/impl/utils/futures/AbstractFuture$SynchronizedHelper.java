// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils.futures;


// Referenced classes of package androidx.work.impl.utils.futures:
//			AbstractFuture

private static final class AbstractFuture$SynchronizedHelper extends AbstractFuture.AtomicHelper
{

	boolean casListeners(AbstractFuture abstractfuture, AbstractFuture.Listener listener, AbstractFuture.Listener listener1)
	{
		abstractfuture;
	//    0    0:aload_1         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(abstractfuture.listeners != listener)
			break MISSING_BLOCK_LABEL_19;
	//    2    2:aload_1         
	//    3    3:getfield        #19  <Field AbstractFuture$Listener AbstractFuture.listeners>
	//    4    6:aload_2         
	//    5    7:if_acmpne       19
		abstractfuture.listeners = listener1;
	//    6   10:aload_1         
	//    7   11:aload_3         
	//    8   12:putfield        #19  <Field AbstractFuture$Listener AbstractFuture.listeners>
	//*   9   15:aload_1         
	//*  10   16:monitorexit     
		return true;
	//   11   17:iconst_1        
	//   12   18:ireturn         
		abstractfuture;
	//   13   19:aload_1         
		JVM INSTR monitorexit ;
	//   14   20:monitorexit     
		return false;
	//   15   21:iconst_0        
	//   16   22:ireturn         
		listener;
	//   17   23:astore_2        
		abstractfuture;
	//   18   24:aload_1         
		JVM INSTR monitorexit ;
	//   19   25:monitorexit     
		throw listener;
	//   20   26:aload_2         
	//   21   27:athrow          
	}

	boolean casValue(AbstractFuture abstractfuture, Object obj, Object obj1)
	{
		abstractfuture;
	//    0    0:aload_1         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(abstractfuture.value != obj)
			break MISSING_BLOCK_LABEL_19;
	//    2    2:aload_1         
	//    3    3:getfield        #27  <Field Object AbstractFuture.value>
	//    4    6:aload_2         
	//    5    7:if_acmpne       19
		abstractfuture.value = obj1;
	//    6   10:aload_1         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field Object AbstractFuture.value>
	//*   9   15:aload_1         
	//*  10   16:monitorexit     
		return true;
	//   11   17:iconst_1        
	//   12   18:ireturn         
		abstractfuture;
	//   13   19:aload_1         
		JVM INSTR monitorexit ;
	//   14   20:monitorexit     
		return false;
	//   15   21:iconst_0        
	//   16   22:ireturn         
		obj;
	//   17   23:astore_2        
		abstractfuture;
	//   18   24:aload_1         
		JVM INSTR monitorexit ;
	//   19   25:monitorexit     
		throw obj;
	//   20   26:aload_2         
	//   21   27:athrow          
	}

	boolean casWaiters(AbstractFuture abstractfuture, AbstractFuture.Waiter waiter, AbstractFuture.Waiter waiter1)
	{
		abstractfuture;
	//    0    0:aload_1         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(abstractfuture.waiters != waiter)
			break MISSING_BLOCK_LABEL_19;
	//    2    2:aload_1         
	//    3    3:getfield        #34  <Field AbstractFuture$Waiter AbstractFuture.waiters>
	//    4    6:aload_2         
	//    5    7:if_acmpne       19
		abstractfuture.waiters = waiter1;
	//    6   10:aload_1         
	//    7   11:aload_3         
	//    8   12:putfield        #34  <Field AbstractFuture$Waiter AbstractFuture.waiters>
	//*   9   15:aload_1         
	//*  10   16:monitorexit     
		return true;
	//   11   17:iconst_1        
	//   12   18:ireturn         
		abstractfuture;
	//   13   19:aload_1         
		JVM INSTR monitorexit ;
	//   14   20:monitorexit     
		return false;
	//   15   21:iconst_0        
	//   16   22:ireturn         
		waiter;
	//   17   23:astore_2        
		abstractfuture;
	//   18   24:aload_1         
		JVM INSTR monitorexit ;
	//   19   25:monitorexit     
		throw waiter;
	//   20   26:aload_2         
	//   21   27:athrow          
	}

	void putNext(AbstractFuture.Waiter waiter, AbstractFuture.Waiter waiter1)
	{
		waiter.next = waiter1;
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:putfield        #42  <Field AbstractFuture$Waiter AbstractFuture$Waiter.next>
	//    3    5:return          
	}

	void putThread(AbstractFuture.Waiter waiter, Thread thread)
	{
		waiter.thread = thread;
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:putfield        #48  <Field Thread AbstractFuture$Waiter.thread>
	//    3    5:return          
	}

	AbstractFuture$SynchronizedHelper()
	{
		super(((AbstractFuture._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #12  <Method void AbstractFuture$AtomicHelper(AbstractFuture$1)>
	//    3    5:return          
	}
}
