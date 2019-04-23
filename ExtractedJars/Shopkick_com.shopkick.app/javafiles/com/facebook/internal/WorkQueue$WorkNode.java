// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;


// Referenced classes of package com.facebook.internal:
//			WorkQueue

private class WorkQueue$WorkNode
	implements WorkQueue$WorkItem
{

	WorkQueue$WorkNode addToList(WorkQueue$WorkNode workqueue$worknode, boolean flag)
	{
		if(workqueue$worknode == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       19
		{
			prev = this;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:putfield        #35  <Field WorkQueue$WorkNode prev>
			next = this;
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:putfield        #37  <Field WorkQueue$WorkNode next>
			workqueue$worknode = this;
	//    8   14:aload_0         
	//    9   15:astore_1        
		} else
	//*  10   16:goto            50
		{
			next = workqueue$worknode;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #37  <Field WorkQueue$WorkNode next>
			prev = workqueue$worknode.prev;
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:getfield        #35  <Field WorkQueue$WorkNode prev>
	//   17   29:putfield        #35  <Field WorkQueue$WorkNode prev>
			WorkQueue$WorkNode workqueue$worknode1 = next;
	//   18   32:aload_0         
	//   19   33:getfield        #37  <Field WorkQueue$WorkNode next>
	//   20   36:astore_3        
			prev.next = this;
	//   21   37:aload_0         
	//   22   38:getfield        #35  <Field WorkQueue$WorkNode prev>
	//   23   41:aload_0         
	//   24   42:putfield        #37  <Field WorkQueue$WorkNode next>
			workqueue$worknode1.prev = this;
	//   25   45:aload_3         
	//   26   46:aload_0         
	//   27   47:putfield        #35  <Field WorkQueue$WorkNode prev>
		}
		if(flag)
	//*  28   50:iload_2         
	//*  29   51:ifeq            56
			workqueue$worknode = this;
	//   30   54:aload_0         
	//   31   55:astore_1        
		return workqueue$worknode;
	//   32   56:aload_1         
	//   33   57:areturn         
	}

	public boolean cancel()
	{
		Object obj = WorkQueue.access$100(WorkQueue.this);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field WorkQueue this$0>
	//    2    4:invokestatic    #43  <Method Object WorkQueue.access$100(WorkQueue)>
	//    3    7:astore_1        
		obj;
	//    4    8:aload_1         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		if(isRunning())
			break MISSING_BLOCK_LABEL_40;
	//    6   10:aload_0         
	//    7   11:invokevirtual   #45  <Method boolean isRunning()>
	//    8   14:ifne            40
		WorkQueue.access$202(WorkQueue.this, removeFromList(WorkQueue.access$200(WorkQueue.this)));
	//    9   17:aload_0         
	//   10   18:getfield        #27  <Field WorkQueue this$0>
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #27  <Field WorkQueue this$0>
	//   14   26:invokestatic    #49  <Method WorkQueue$WorkNode WorkQueue.access$200(WorkQueue)>
	//   15   29:invokevirtual   #53  <Method WorkQueue$WorkNode removeFromList(WorkQueue$WorkNode)>
	//   16   32:invokestatic    #57  <Method WorkQueue$WorkNode WorkQueue.access$202(WorkQueue, WorkQueue$WorkNode)>
	//   17   35:pop             
	//*  18   36:aload_1         
	//*  19   37:monitorexit     
		return true;
	//   20   38:iconst_1        
	//   21   39:ireturn         
		obj;
	//   22   40:aload_1         
		JVM INSTR monitorexit ;
	//   23   41:monitorexit     
		return false;
	//   24   42:iconst_0        
	//   25   43:ireturn         
		Exception exception;
		exception;
	//   26   44:astore_2        
		obj;
	//   27   45:aload_1         
		JVM INSTR monitorexit ;
	//   28   46:monitorexit     
		throw exception;
	//   29   47:aload_2         
	//   30   48:athrow          
	}

	Runnable getCallback()
	{
		return callback;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Runnable callback>
	//    2    4:areturn         
	}

	WorkQueue$WorkNode getNext()
	{
		return next;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field WorkQueue$WorkNode next>
	//    2    4:areturn         
	}

	public boolean isRunning()
	{
		return isRunning;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field boolean isRunning>
	//    2    4:ireturn         
	}

	public void moveToFront()
	{
		synchronized(WorkQueue.access$100(WorkQueue.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field WorkQueue this$0>
	//*   2    4:invokestatic    #43  <Method Object WorkQueue.access$100(WorkQueue)>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
		{
			if(!isRunning())
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #45  <Method boolean isRunning()>
	//*   8   14:ifne            56
			{
				WorkQueue.access$202(WorkQueue.this, removeFromList(WorkQueue.access$200(WorkQueue.this)));
	//    9   17:aload_0         
	//   10   18:getfield        #27  <Field WorkQueue this$0>
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #27  <Field WorkQueue this$0>
	//   14   26:invokestatic    #49  <Method WorkQueue$WorkNode WorkQueue.access$200(WorkQueue)>
	//   15   29:invokevirtual   #53  <Method WorkQueue$WorkNode removeFromList(WorkQueue$WorkNode)>
	//   16   32:invokestatic    #57  <Method WorkQueue$WorkNode WorkQueue.access$202(WorkQueue, WorkQueue$WorkNode)>
	//   17   35:pop             
				WorkQueue.access$202(WorkQueue.this, addToList(WorkQueue.access$200(WorkQueue.this), true));
	//   18   36:aload_0         
	//   19   37:getfield        #27  <Field WorkQueue this$0>
	//   20   40:aload_0         
	//   21   41:aload_0         
	//   22   42:getfield        #27  <Field WorkQueue this$0>
	//   23   45:invokestatic    #49  <Method WorkQueue$WorkNode WorkQueue.access$200(WorkQueue)>
	//   24   48:iconst_1        
	//   25   49:invokevirtual   #66  <Method WorkQueue$WorkNode addToList(WorkQueue$WorkNode, boolean)>
	//   26   52:invokestatic    #57  <Method WorkQueue$WorkNode WorkQueue.access$202(WorkQueue, WorkQueue$WorkNode)>
	//   27   55:pop             
			}
		}
	//   28   56:aload_1         
	//   29   57:monitorexit     
		return;
	//   30   58:return          
		exception;
	//   31   59:astore_2        
		obj;
	//   32   60:aload_1         
		JVM INSTR monitorexit ;
	//   33   61:monitorexit     
		throw exception;
	//   34   62:aload_2         
	//   35   63:athrow          
	}

	WorkQueue$WorkNode removeFromList(WorkQueue$WorkNode workqueue$worknode)
	{
		WorkQueue$WorkNode workqueue$worknode1 = workqueue$worknode;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(workqueue$worknode == this)
	//*   2    2:aload_1         
	//*   3    3:aload_0         
	//*   4    4:if_acmpne       21
		{
			workqueue$worknode = next;
	//    5    7:aload_0         
	//    6    8:getfield        #37  <Field WorkQueue$WorkNode next>
	//    7   11:astore_1        
			workqueue$worknode1 = workqueue$worknode;
	//    8   12:aload_1         
	//    9   13:astore_2        
			if(workqueue$worknode == this)
	//*  10   14:aload_1         
	//*  11   15:aload_0         
	//*  12   16:if_acmpne       21
				workqueue$worknode1 = null;
	//   13   19:aconst_null     
	//   14   20:astore_2        
		}
		workqueue$worknode = next;
	//   15   21:aload_0         
	//   16   22:getfield        #37  <Field WorkQueue$WorkNode next>
	//   17   25:astore_1        
		workqueue$worknode.prev = prev;
	//   18   26:aload_1         
	//   19   27:aload_0         
	//   20   28:getfield        #35  <Field WorkQueue$WorkNode prev>
	//   21   31:putfield        #35  <Field WorkQueue$WorkNode prev>
		prev.next = workqueue$worknode;
	//   22   34:aload_0         
	//   23   35:getfield        #35  <Field WorkQueue$WorkNode prev>
	//   24   38:aload_1         
	//   25   39:putfield        #37  <Field WorkQueue$WorkNode next>
		prev = null;
	//   26   42:aload_0         
	//   27   43:aconst_null     
	//   28   44:putfield        #35  <Field WorkQueue$WorkNode prev>
		next = null;
	//   29   47:aload_0         
	//   30   48:aconst_null     
	//   31   49:putfield        #37  <Field WorkQueue$WorkNode next>
		return workqueue$worknode1;
	//   32   52:aload_2         
	//   33   53:areturn         
	}

	void setIsRunning(boolean flag)
	{
		isRunning = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #63  <Field boolean isRunning>
	//    3    5:return          
	}

	void verify(boolean flag)
	{
	//    0    0:return          
	}

	static final boolean $assertionsDisabled = false;
	private final Runnable callback;
	private boolean isRunning;
	private WorkQueue$WorkNode next;
	private WorkQueue$WorkNode prev;
	final WorkQueue this$0;

	static 
	{
	//    0    0:return          
	}

	WorkQueue$WorkNode(Runnable runnable)
	{
		this$0 = WorkQueue.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field WorkQueue this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #29  <Method void Object()>
		callback = runnable;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field Runnable callback>
	//    8   14:return          
	}
}
