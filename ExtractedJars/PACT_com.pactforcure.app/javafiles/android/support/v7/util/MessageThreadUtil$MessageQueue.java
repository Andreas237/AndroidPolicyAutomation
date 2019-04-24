// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;


// Referenced classes of package android.support.v7.util:
//			MessageThreadUtil

static class MessageThreadUtil$MessageQueue
{

	 next()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		  = mRoot;
	//    2    2:aload_0         
	//    3    3:getfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//    4    6:astore_1        
		if( != null) goto _L2; else goto _L1
	//    5    7:aload_1         
	//    6    8:ifnonnull       17
_L1:
		 = null;
	//    7   11:aconst_null     
	//    8   12:astore_1        
_L4:
		this;
	//    9   13:aload_0         
		JVM INSTR monitorexit ;
	//   10   14:monitorexit     
		return ;
	//   11   15:aload_1         
	//   12   16:areturn         
_L2:
		 = mRoot;
	//   13   17:aload_0         
	//   14   18:getfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//   15   21:astore_1        
		mRoot = .access._mth000(mRoot);
	//   16   22:aload_0         
	//   17   23:aload_0         
	//   18   24:getfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//   19   27:invokestatic    #24  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.access$000(MessageThreadUtil$SyncQueueItem)>
	//   20   30:putfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
		if(true) goto _L4; else goto _L3
	//   21   33:goto            13
_L3:
		Exception exception;
		exception;
	//   22   36:astore_1        
	//*  23   37:aload_0         
		throw exception;
	//   24   38:monitorexit     
	//   25   39:aload_1         
	//   26   40:athrow          
	}


// JavaClassFileOutputException: Prev chain is broken

	void sendMessage( )
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mRoot != null) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//    4    6:ifnonnull       17
_L1:
		mRoot = ;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
_L3:
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
_L2:
		 1;
		for(1 = mRoot; .access._mth000(1) != null; 1 = .access._mth000(1));
	//   11   17:aload_0         
	//   12   18:getfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//   13   21:astore_2        
	//   14   22:aload_2         
	//   15   23:invokestatic    #24  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.access$000(MessageThreadUtil$SyncQueueItem)>
	//   16   26:ifnull          37
	//   17   29:aload_2         
	//   18   30:invokestatic    #24  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.access$000(MessageThreadUtil$SyncQueueItem)>
	//   19   33:astore_2        
	//*  20   34:goto            22
		.access._mth002(1, );
	//   21   37:aload_2         
	//   22   38:aload_1         
	//   23   39:invokestatic    #37  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.access$002(MessageThreadUtil$SyncQueueItem, MessageThreadUtil$SyncQueueItem)>
	//   24   42:pop             
		  goto _L3
	//*  25   43:goto            14
		;
	//   26   46:astore_1        
	//*  27   47:aload_0         
		throw ;
	//   28   48:monitorexit     
	//   29   49:aload_1         
	//   30   50:athrow          
	}

	void sendMessageAtFrontOfQueue( )
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		.access._mth002(, mRoot);
	//    2    2:aload_1         
	//    3    3:aload_0         
	//    4    4:getfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//    5    7:invokestatic    #37  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.access$002(MessageThreadUtil$SyncQueueItem, MessageThreadUtil$SyncQueueItem)>
	//    6   10:pop             
		mRoot = ;
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:putfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
		this;
	//   10   16:aload_0         
		JVM INSTR monitorexit ;
	//   11   17:monitorexit     
		return;
	//   12   18:return          
		;
	//   13   19:astore_1        
	//*  14   20:aload_0         
		throw ;
	//   15   21:monitorexit     
	//   16   22:aload_1         
	//   17   23:athrow          
	}

	private  mRoot;

	MessageThreadUtil$MessageQueue()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
