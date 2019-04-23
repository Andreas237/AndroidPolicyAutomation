// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import com.facebook.FacebookSdk;
import java.util.concurrent.Executor;

public class WorkQueue
{
	public static interface WorkItem
	{

		public abstract boolean cancel();

		public abstract boolean isRunning();

		public abstract void moveToFront();
	}

	private class WorkNode
		implements WorkItem
	{

		WorkNode addToList(WorkNode worknode, boolean flag)
		{
			if(worknode == null)
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
				worknode = this;
		//    8   14:aload_0         
		//    9   15:astore_1        
			} else
		//*  10   16:goto            50
			{
				next = worknode;
		//   11   19:aload_0         
		//   12   20:aload_1         
		//   13   21:putfield        #37  <Field WorkQueue$WorkNode next>
				prev = worknode.prev;
		//   14   24:aload_0         
		//   15   25:aload_1         
		//   16   26:getfield        #35  <Field WorkQueue$WorkNode prev>
		//   17   29:putfield        #35  <Field WorkQueue$WorkNode prev>
				WorkNode worknode1 = next;
		//   18   32:aload_0         
		//   19   33:getfield        #37  <Field WorkQueue$WorkNode next>
		//   20   36:astore_3        
				prev.next = this;
		//   21   37:aload_0         
		//   22   38:getfield        #35  <Field WorkQueue$WorkNode prev>
		//   23   41:aload_0         
		//   24   42:putfield        #37  <Field WorkQueue$WorkNode next>
				worknode1.prev = this;
		//   25   45:aload_3         
		//   26   46:aload_0         
		//   27   47:putfield        #35  <Field WorkQueue$WorkNode prev>
			}
			if(flag)
		//*  28   50:iload_2         
		//*  29   51:ifeq            56
				worknode = this;
		//   30   54:aload_0         
		//   31   55:astore_1        
			return worknode;
		//   32   56:aload_1         
		//   33   57:areturn         
		}

		public boolean cancel()
		{
			Object obj = workLock;
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
			pendingJobs = removeFromList(pendingJobs);
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

		WorkNode getNext()
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
			synchronized(workLock)
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
					pendingJobs = removeFromList(pendingJobs);
		//    9   17:aload_0         
		//   10   18:getfield        #27  <Field WorkQueue this$0>
		//   11   21:aload_0         
		//   12   22:aload_0         
		//   13   23:getfield        #27  <Field WorkQueue this$0>
		//   14   26:invokestatic    #49  <Method WorkQueue$WorkNode WorkQueue.access$200(WorkQueue)>
		//   15   29:invokevirtual   #53  <Method WorkQueue$WorkNode removeFromList(WorkQueue$WorkNode)>
		//   16   32:invokestatic    #57  <Method WorkQueue$WorkNode WorkQueue.access$202(WorkQueue, WorkQueue$WorkNode)>
		//   17   35:pop             
					pendingJobs = addToList(pendingJobs, true);
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

		WorkNode removeFromList(WorkNode worknode)
		{
			WorkNode worknode1 = worknode;
		//    0    0:aload_1         
		//    1    1:astore_2        
			if(worknode == this)
		//*   2    2:aload_1         
		//*   3    3:aload_0         
		//*   4    4:if_acmpne       21
			{
				worknode = next;
		//    5    7:aload_0         
		//    6    8:getfield        #37  <Field WorkQueue$WorkNode next>
		//    7   11:astore_1        
				worknode1 = worknode;
		//    8   12:aload_1         
		//    9   13:astore_2        
				if(worknode == this)
		//*  10   14:aload_1         
		//*  11   15:aload_0         
		//*  12   16:if_acmpne       21
					worknode1 = null;
		//   13   19:aconst_null     
		//   14   20:astore_2        
			}
			worknode = next;
		//   15   21:aload_0         
		//   16   22:getfield        #37  <Field WorkQueue$WorkNode next>
		//   17   25:astore_1        
			worknode.prev = prev;
		//   18   26:aload_1         
		//   19   27:aload_0         
		//   20   28:getfield        #35  <Field WorkQueue$WorkNode prev>
		//   21   31:putfield        #35  <Field WorkQueue$WorkNode prev>
			prev.next = worknode;
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
			return worknode1;
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
		private WorkNode next;
		private WorkNode prev;
		final WorkQueue this$0;

		static 
		{
		//    0    0:return          
		}

		WorkNode(Runnable runnable)
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


	public WorkQueue()
	{
		this(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokespecial   #34  <Method void WorkQueue(int)>
	//    3    6:return          
	}

	public WorkQueue(int i)
	{
		this(i, FacebookSdk.getExecutor());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #40  <Method Executor FacebookSdk.getExecutor()>
	//    3    5:invokespecial   #43  <Method void WorkQueue(int, Executor)>
	//    4    8:return          
	}

	public WorkQueue(int i, Executor executor1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		workLock = new Object();
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #45  <Method void Object()>
	//    6   12:putfield        #47  <Field Object workLock>
		runningJobs = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #49  <Field WorkQueue$WorkNode runningJobs>
		runningCount = 0;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #51  <Field int runningCount>
		maxConcurrent = i;
	//   13   25:aload_0         
	//   14   26:iload_1         
	//   15   27:putfield        #53  <Field int maxConcurrent>
		executor = executor1;
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:putfield        #55  <Field Executor executor>
	//   19   35:return          
	}

	private void execute(final WorkNode node)
	{
		executor.execute(new Runnable() {

			public void run()
			{
				node.getCallback().run();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field WorkQueue$WorkNode val$node>
			//    2    4:invokevirtual   #32  <Method Runnable WorkQueue$WorkNode.getCallback()>
			//    3    7:invokeinterface #34  <Method void Runnable.run()>
				finishItemAndStartNew(node);
			//    4   12:aload_0         
			//    5   13:getfield        #19  <Field WorkQueue this$0>
			//    6   16:aload_0         
			//    7   17:getfield        #21  <Field WorkQueue$WorkNode val$node>
			//    8   20:invokestatic    #37  <Method void WorkQueue.access$000(WorkQueue, WorkQueue$WorkNode)>
				return;
			//    9   23:return          
				Exception exception;
				exception;
			//   10   24:astore_1        
				finishItemAndStartNew(node);
			//   11   25:aload_0         
			//   12   26:getfield        #19  <Field WorkQueue this$0>
			//   13   29:aload_0         
			//   14   30:getfield        #21  <Field WorkQueue$WorkNode val$node>
			//   15   33:invokestatic    #37  <Method void WorkQueue.access$000(WorkQueue, WorkQueue$WorkNode)>
				throw exception;
			//   16   36:aload_1         
			//   17   37:athrow          
			}

			final WorkQueue this$0;
			final WorkNode val$node;

			
			{
				this$0 = WorkQueue.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field WorkQueue this$0>
				node = worknode;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field WorkQueue$WorkNode val$node>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Executor executor>
	//    2    4:new             #6   <Class WorkQueue$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #72  <Method void WorkQueue$1(WorkQueue, WorkQueue$WorkNode)>
	//    7   13:invokeinterface #77  <Method void Executor.execute(Runnable)>
	//    8   18:return          
	}

	private void finishItemAndStartNew(WorkNode worknode)
	{
		Object obj = workLock;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Object workLock>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(worknode == null)
			break MISSING_BLOCK_LABEL_33;
	//    5    7:aload_1         
	//    6    8:ifnull          33
		runningJobs = worknode.removeFromList(runningJobs);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:aload_0         
	//   10   14:getfield        #49  <Field WorkQueue$WorkNode runningJobs>
	//   11   17:invokevirtual   #81  <Method WorkQueue$WorkNode WorkQueue$WorkNode.removeFromList(WorkQueue$WorkNode)>
	//   12   20:putfield        #49  <Field WorkQueue$WorkNode runningJobs>
		runningCount = runningCount - 1;
	//   13   23:aload_0         
	//   14   24:aload_0         
	//   15   25:getfield        #51  <Field int runningCount>
	//   16   28:iconst_1        
	//   17   29:isub            
	//   18   30:putfield        #51  <Field int runningCount>
		if(runningCount >= maxConcurrent) goto _L2; else goto _L1
	//   19   33:aload_0         
	//   20   34:getfield        #51  <Field int runningCount>
	//   21   37:aload_0         
	//   22   38:getfield        #53  <Field int maxConcurrent>
	//   23   41:icmpge          117
_L1:
		WorkNode worknode1 = pendingJobs;
	//   24   44:aload_0         
	//   25   45:getfield        #67  <Field WorkQueue$WorkNode pendingJobs>
	//   26   48:astore_2        
		worknode = worknode1;
	//   27   49:aload_2         
	//   28   50:astore_1        
		if(worknode1 == null)
			break MISSING_BLOCK_LABEL_100;
	//   29   51:aload_2         
	//   30   52:ifnull          100
		pendingJobs = worknode1.removeFromList(pendingJobs);
	//   31   55:aload_0         
	//   32   56:aload_2         
	//   33   57:aload_0         
	//   34   58:getfield        #67  <Field WorkQueue$WorkNode pendingJobs>
	//   35   61:invokevirtual   #81  <Method WorkQueue$WorkNode WorkQueue$WorkNode.removeFromList(WorkQueue$WorkNode)>
	//   36   64:putfield        #67  <Field WorkQueue$WorkNode pendingJobs>
		runningJobs = worknode1.addToList(runningJobs, false);
	//   37   67:aload_0         
	//   38   68:aload_2         
	//   39   69:aload_0         
	//   40   70:getfield        #49  <Field WorkQueue$WorkNode runningJobs>
	//   41   73:iconst_0        
	//   42   74:invokevirtual   #85  <Method WorkQueue$WorkNode WorkQueue$WorkNode.addToList(WorkQueue$WorkNode, boolean)>
	//   43   77:putfield        #49  <Field WorkQueue$WorkNode runningJobs>
		runningCount = runningCount + 1;
	//   44   80:aload_0         
	//   45   81:aload_0         
	//   46   82:getfield        #51  <Field int runningCount>
	//   47   85:iconst_1        
	//   48   86:iadd            
	//   49   87:putfield        #51  <Field int runningCount>
		worknode1.setIsRunning(true);
	//   50   90:aload_2         
	//   51   91:iconst_1        
	//   52   92:invokevirtual   #89  <Method void WorkQueue$WorkNode.setIsRunning(boolean)>
		worknode = worknode1;
	//   53   95:aload_2         
	//   54   96:astore_1        
	//*  55   97:goto            100
_L4:
		obj;
	//   56  100:aload_3         
		JVM INSTR monitorexit ;
	//   57  101:monitorexit     
		if(worknode != null)
	//*  58  102:aload_1         
	//*  59  103:ifnull          111
			execute(worknode);
	//   60  106:aload_0         
	//   61  107:aload_1         
	//   62  108:invokespecial   #91  <Method void execute(WorkQueue$WorkNode)>
		return;
	//   63  111:return          
		worknode;
	//   64  112:astore_1        
		obj;
	//   65  113:aload_3         
		JVM INSTR monitorexit ;
	//   66  114:monitorexit     
		throw worknode;
	//   67  115:aload_1         
	//   68  116:athrow          
_L2:
		worknode = null;
	//   69  117:aconst_null     
	//   70  118:astore_1        
		if(true) goto _L4; else goto _L3
	//   71  119:goto            100
_L3:
	}

	private void startItem()
	{
		finishItemAndStartNew(((WorkNode) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #61  <Method void finishItemAndStartNew(WorkQueue$WorkNode)>
	//    3    5:return          
	}

	public WorkItem addActiveWorkItem(Runnable runnable)
	{
		return addActiveWorkItem(runnable, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #97  <Method WorkQueue$WorkItem addActiveWorkItem(Runnable, boolean)>
	//    4    6:areturn         
	}

	public WorkItem addActiveWorkItem(Runnable runnable, boolean flag)
	{
		WorkNode worknode = new WorkNode(runnable);
	//    0    0:new             #11  <Class WorkQueue$WorkNode>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #100 <Method void WorkQueue$WorkNode(WorkQueue, Runnable)>
	//    5    9:astore_3        
		synchronized(workLock)
	//*   6   10:aload_0         
	//*   7   11:getfield        #47  <Field Object workLock>
	//*   8   14:astore_1        
	//*   9   15:aload_1         
	//*  10   16:monitorenter    
		{
			pendingJobs = worknode.addToList(pendingJobs, flag);
	//   11   17:aload_0         
	//   12   18:aload_3         
	//   13   19:aload_0         
	//   14   20:getfield        #67  <Field WorkQueue$WorkNode pendingJobs>
	//   15   23:iload_2         
	//   16   24:invokevirtual   #85  <Method WorkQueue$WorkNode WorkQueue$WorkNode.addToList(WorkQueue$WorkNode, boolean)>
	//   17   27:putfield        #67  <Field WorkQueue$WorkNode pendingJobs>
		}
	//   18   30:aload_1         
	//   19   31:monitorexit     
		startItem();
	//   20   32:aload_0         
	//   21   33:invokespecial   #102 <Method void startItem()>
		return ((WorkItem) (worknode));
	//   22   36:aload_3         
	//   23   37:areturn         
		exception;
	//   24   38:astore_3        
		runnable;
	//   25   39:aload_1         
		JVM INSTR monitorexit ;
	//   26   40:monitorexit     
		throw exception;
	//   27   41:aload_3         
	//   28   42:athrow          
	}

	public void validate()
	{
		Object obj = workLock;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Object workLock>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(runningJobs == null) goto _L2; else goto _L1
	//    5    7:aload_0         
	//    6    8:getfield        #49  <Field WorkQueue$WorkNode runningJobs>
	//    7   11:ifnull          39
_L1:
		WorkNode worknode = runningJobs;
	//    8   14:aload_0         
	//    9   15:getfield        #49  <Field WorkQueue$WorkNode runningJobs>
	//   10   18:astore_1        
_L3:
		WorkNode worknode1;
		worknode.verify(true);
	//   11   19:aload_1         
	//   12   20:iconst_1        
	//   13   21:invokevirtual   #106 <Method void WorkQueue$WorkNode.verify(boolean)>
		worknode1 = worknode.getNext();
	//   14   24:aload_1         
	//   15   25:invokevirtual   #110 <Method WorkQueue$WorkNode WorkQueue$WorkNode.getNext()>
	//   16   28:astore_2        
		worknode = worknode1;
	//   17   29:aload_2         
	//   18   30:astore_1        
		if(worknode1 != runningJobs) goto _L3; else goto _L2
	//   19   31:aload_2         
	//   20   32:aload_0         
	//   21   33:getfield        #49  <Field WorkQueue$WorkNode runningJobs>
	//   22   36:if_acmpne       19
_L2:
		obj;
	//   23   39:aload_3         
		JVM INSTR monitorexit ;
	//   24   40:monitorexit     
		return;
	//   25   41:return          
		Exception exception;
		exception;
	//   26   42:astore_1        
		obj;
	//   27   43:aload_3         
		JVM INSTR monitorexit ;
	//   28   44:monitorexit     
		throw exception;
	//   29   45:aload_1         
	//   30   46:athrow          
	}

	static final boolean $assertionsDisabled = false;
	public static final int DEFAULT_MAX_CONCURRENT = 8;
	private final Executor executor;
	private final int maxConcurrent;
	private WorkNode pendingJobs;
	private int runningCount;
	private WorkNode runningJobs;
	private final Object workLock;

	static 
	{
	//    0    0:return          
	}


/*
	static void access$000(WorkQueue workqueue, WorkNode worknode)
	{
		workqueue.finishItemAndStartNew(worknode);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #61  <Method void finishItemAndStartNew(WorkQueue$WorkNode)>
		return;
	//    3    5:return          
	}

*/


/*
	static Object access$100(WorkQueue workqueue)
	{
		return workqueue.workLock;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Object workLock>
	//    2    4:areturn         
	}

*/


/*
	static WorkNode access$200(WorkQueue workqueue)
	{
		return workqueue.pendingJobs;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field WorkQueue$WorkNode pendingJobs>
	//    2    4:areturn         
	}

*/


/*
	static WorkNode access$202(WorkQueue workqueue, WorkNode worknode)
	{
		workqueue.pendingJobs = worknode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field WorkQueue$WorkNode pendingJobs>
		return worknode;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/
}
