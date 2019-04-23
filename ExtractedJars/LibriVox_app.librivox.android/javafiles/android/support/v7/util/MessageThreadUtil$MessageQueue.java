// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;


class MessageThreadUtil$MessageQueue
{

	 next()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		  = mRoot;
	//    2    2:aload_0         
	//    3    3:getfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//    4    6:astore_1        
		if( != null)
			break MISSING_BLOCK_LABEL_15;
	//    5    7:aload_1         
	//    6    8:ifnonnull       15
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return null;
	//    9   13:aconst_null     
	//   10   14:areturn         
		 = mRoot;
	//   11   15:aload_0         
	//   12   16:getfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//   13   19:astore_1        
		mRoot = mRoot.next;
	//   14   20:aload_0         
	//   15   21:aload_0         
	//   16   22:getfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//   17   25:getfield        #19  <Field MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.next>
	//   18   28:putfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
		this;
	//   19   31:aload_0         
		JVM INSTR monitorexit ;
	//   20   32:monitorexit     
		return ;
	//   21   33:aload_1         
	//   22   34:areturn         
		Exception exception;
		exception;
	//   23   35:astore_1        
	//*  24   36:aload_0         
		throw exception;
	//   25   37:monitorexit     
	//   26   38:aload_1         
	//   27   39:athrow          
	}

	void removeMessages(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		while(mRoot != null && mRoot.what == i) 
	//*   2    2:aload_0         
	//*   3    3:getfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//*   4    6:ifnull          43
	//*   5    9:aload_0         
	//*   6   10:getfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//*   7   13:getfield        #25  <Field int MessageThreadUtil$SyncQueueItem.what>
	//*   8   16:iload_1         
	//*   9   17:icmpne          43
		{
			  = mRoot;
	//   10   20:aload_0         
	//   11   21:getfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//   12   24:astore_2        
			mRoot = mRoot.next;
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//   16   30:getfield        #19  <Field MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.next>
	//   17   33:putfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
			.recycle();
	//   18   36:aload_2         
	//   19   37:invokevirtual   #28  <Method void MessageThreadUtil$SyncQueueItem.recycle()>
		}
	//*  20   40:goto            2
		 1;
		 2;
		if(mRoot == null)
			break MISSING_BLOCK_LABEL_99;
	//   21   43:aload_0         
	//   22   44:getfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//   23   47:ifnull          99
		2 = mRoot;
	//   24   50:aload_0         
	//   25   51:getfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//   26   54:astore_3        
		1 = 2.next;
	//   27   55:aload_3         
	//   28   56:getfield        #19  <Field MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.next>
	//   29   59:astore_2        
_L3:
		if(1 == null) goto _L2; else goto _L1
	//   30   60:aload_2         
	//   31   61:ifnull          99
_L1:
		 3 = 1.next;
	//   32   64:aload_2         
	//   33   65:getfield        #19  <Field MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.next>
	//   34   68:astore          4
		if(1.what == i)
	//*  35   70:aload_2         
	//*  36   71:getfield        #25  <Field int MessageThreadUtil$SyncQueueItem.what>
	//*  37   74:iload_1         
	//*  38   75:icmpne          91
		{
			2.next = 3;
	//   39   78:aload_3         
	//   40   79:aload           4
	//   41   81:putfield        #19  <Field MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.next>
			1.recycle();
	//   42   84:aload_2         
	//   43   85:invokevirtual   #28  <Method void MessageThreadUtil$SyncQueueItem.recycle()>
			continue; /* Loop/switch isn't completed */
	//   44   88:goto            93
		}
		2 = 1;
	//   45   91:aload_2         
	//   46   92:astore_3        
		1 = 3;
	//   47   93:aload           4
	//   48   95:astore_2        
		  goto _L3
	//*  49   96:goto            60
_L2:
		this;
	//   50   99:aload_0         
		JVM INSTR monitorexit ;
	//   51  100:monitorexit     
		return;
	//   52  101:return          
		Exception exception;
		exception;
	//   53  102:astore_2        
	//*  54  103:aload_0         
		throw exception;
	//   55  104:monitorexit     
	//   56  105:aload_2         
	//   57  106:athrow          
	}

	void sendMessage( )
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mRoot != null)
			break MISSING_BLOCK_LABEL_17;
	//    2    2:aload_0         
	//    3    3:getfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//    4    6:ifnonnull       17
		mRoot = ;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		 1;
		for(1 = mRoot; 1.next != null; 1 = 1.next);
	//   11   17:aload_0         
	//   12   18:getfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//   13   21:astore_2        
	//   14   22:aload_2         
	//   15   23:getfield        #19  <Field MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.next>
	//   16   26:ifnull          37
	//   17   29:aload_2         
	//   18   30:getfield        #19  <Field MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.next>
	//   19   33:astore_2        
	//*  20   34:goto            22
		1.next = ;
	//   21   37:aload_2         
	//   22   38:aload_1         
	//   23   39:putfield        #19  <Field MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.next>
		this;
	//   24   42:aload_0         
		JVM INSTR monitorexit ;
	//   25   43:monitorexit     
		return;
	//   26   44:return          
		;
	//   27   45:astore_1        
	//*  28   46:aload_0         
		throw ;
	//   29   47:monitorexit     
	//   30   48:aload_1         
	//   31   49:athrow          
	}

	void sendMessageAtFrontOfQueue( )
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		.next = mRoot;
	//    2    2:aload_1         
	//    3    3:aload_0         
	//    4    4:getfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//    5    7:putfield        #19  <Field MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.next>
		mRoot = ;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:putfield        #15  <Field MessageThreadUtil$SyncQueueItem mRoot>
		this;
	//    9   15:aload_0         
		JVM INSTR monitorexit ;
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		;
	//   12   18:astore_1        
	//*  13   19:aload_0         
		throw ;
	//   14   20:monitorexit     
	//   15   21:aload_1         
	//   16   22:athrow          
	}

	private  mRoot;

	MessageThreadUtil$MessageQueue()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}
}
