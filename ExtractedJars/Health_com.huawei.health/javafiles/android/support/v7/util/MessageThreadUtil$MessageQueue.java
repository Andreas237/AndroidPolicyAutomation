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
		if(mRoot != null)
			break MISSING_BLOCK_LABEL_13;
	//    2    2:aload_0         
	//    3    3:getfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//    4    6:ifnonnull       13
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return null;
	//    7   11:aconst_null     
	//    8   12:areturn         
		 ;
		 = mRoot;
	//    9   13:aload_0         
	//   10   14:getfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//   11   17:astore_1        
		mRoot = .access._mth000(mRoot);
	//   12   18:aload_0         
	//   13   19:aload_0         
	//   14   20:getfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//   15   23:invokestatic    #24  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.access$000(MessageThreadUtil$SyncQueueItem)>
	//   16   26:putfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
		this;
	//   17   29:aload_0         
		JVM INSTR monitorexit ;
	//   18   30:monitorexit     
		return ;
	//   19   31:aload_1         
	//   20   32:areturn         
		Exception exception;
		exception;
	//   21   33:astore_1        
	//*  22   34:aload_0         
		throw exception;
	//   23   35:monitorexit     
	//   24   36:aload_1         
	//   25   37:athrow          
	}

	void removeMessages(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		while(mRoot != null && mRoot.what == i) 
	//*   2    2:aload_0         
	//*   3    3:getfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//*   4    6:ifnull          43
	//*   5    9:aload_0         
	//*   6   10:getfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//*   7   13:getfield        #30  <Field int MessageThreadUtil$SyncQueueItem.what>
	//*   8   16:iload_1         
	//*   9   17:icmpne          43
		{
			  = mRoot;
	//   10   20:aload_0         
	//   11   21:getfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//   12   24:astore_2        
			mRoot = .access._mth000(mRoot);
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//   16   30:invokestatic    #24  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.access$000(MessageThreadUtil$SyncQueueItem)>
	//   17   33:putfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
			.recycle();
	//   18   36:aload_2         
	//   19   37:invokevirtual   #33  <Method void MessageThreadUtil$SyncQueueItem.recycle()>
		}
	//*  20   40:goto            2
		 1;
		 2;
		if(mRoot == null)
			break MISSING_BLOCK_LABEL_100;
	//   21   43:aload_0         
	//   22   44:getfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//   23   47:ifnull          100
		2 = mRoot;
	//   24   50:aload_0         
	//   25   51:getfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//   26   54:astore_3        
		1 = .access._mth000(2);
	//   27   55:aload_3         
	//   28   56:invokestatic    #24  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.access$000(MessageThreadUtil$SyncQueueItem)>
	//   29   59:astore_2        
_L3:
		if(1 == null) goto _L2; else goto _L1
	//   30   60:aload_2         
	//   31   61:ifnull          100
_L1:
		 3 = .access._mth000(1);
	//   32   64:aload_2         
	//   33   65:invokestatic    #24  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.access$000(MessageThreadUtil$SyncQueueItem)>
	//   34   68:astore          4
		if(1.what == i)
	//*  35   70:aload_2         
	//*  36   71:getfield        #30  <Field int MessageThreadUtil$SyncQueueItem.what>
	//*  37   74:iload_1         
	//*  38   75:icmpne          92
		{
			.access._mth002(2, 3);
	//   39   78:aload_3         
	//   40   79:aload           4
	//   41   81:invokestatic    #37  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.access$002(MessageThreadUtil$SyncQueueItem, MessageThreadUtil$SyncQueueItem)>
	//   42   84:pop             
			1.recycle();
	//   43   85:aload_2         
	//   44   86:invokevirtual   #33  <Method void MessageThreadUtil$SyncQueueItem.recycle()>
			continue; /* Loop/switch isn't completed */
	//   45   89:goto            94
		}
		2 = 1;
	//   46   92:aload_2         
	//   47   93:astore_3        
		1 = 3;
	//   48   94:aload           4
	//   49   96:astore_2        
		  goto _L3
	//*  50   97:goto            60
_L2:
		this;
	//   51  100:aload_0         
		JVM INSTR monitorexit ;
	//   52  101:monitorexit     
		return;
	//   53  102:return          
		Exception exception;
		exception;
	//   54  103:astore_2        
	//*  55  104:aload_0         
		throw exception;
	//   56  105:monitorexit     
	//   57  106:aload_2         
	//   58  107:athrow          
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
	//    3    3:getfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
	//    4    6:ifnonnull       17
		mRoot = ;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
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
		this;
	//   25   43:aload_0         
		JVM INSTR monitorexit ;
	//   26   44:monitorexit     
		return;
	//   27   45:return          
		;
	//   28   46:astore_1        
	//*  29   47:aload_0         
		throw ;
	//   30   48:monitorexit     
	//   31   49:aload_1         
	//   32   50:athrow          
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
