// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;

import android.os.*;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package android.support.v7.util:
//			ThreadUtil

class MessageThreadUtil
	implements ThreadUtil
{
	static class MessageQueue
	{

		SyncQueueItem next()
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
			SyncQueueItem syncqueueitem;
			syncqueueitem = mRoot;
		//    9   13:aload_0         
		//   10   14:getfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
		//   11   17:astore_1        
			mRoot = mRoot.next;
		//   12   18:aload_0         
		//   13   19:aload_0         
		//   14   20:getfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
		//   15   23:invokestatic    #24  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.access$000(MessageThreadUtil$SyncQueueItem)>
		//   16   26:putfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
			this;
		//   17   29:aload_0         
			JVM INSTR monitorexit ;
		//   18   30:monitorexit     
			return syncqueueitem;
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
				SyncQueueItem syncqueueitem = mRoot;
		//   10   20:aload_0         
		//   11   21:getfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
		//   12   24:astore_2        
				mRoot = mRoot.next;
		//   13   25:aload_0         
		//   14   26:aload_0         
		//   15   27:getfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
		//   16   30:invokestatic    #24  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.access$000(MessageThreadUtil$SyncQueueItem)>
		//   17   33:putfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
				syncqueueitem.recycle();
		//   18   36:aload_2         
		//   19   37:invokevirtual   #33  <Method void MessageThreadUtil$SyncQueueItem.recycle()>
			}
		//*  20   40:goto            2
			SyncQueueItem syncqueueitem1;
			SyncQueueItem syncqueueitem2;
			if(mRoot == null)
				break MISSING_BLOCK_LABEL_100;
		//   21   43:aload_0         
		//   22   44:getfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
		//   23   47:ifnull          100
			syncqueueitem2 = mRoot;
		//   24   50:aload_0         
		//   25   51:getfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
		//   26   54:astore_3        
			syncqueueitem1 = syncqueueitem2.next;
		//   27   55:aload_3         
		//   28   56:invokestatic    #24  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.access$000(MessageThreadUtil$SyncQueueItem)>
		//   29   59:astore_2        
_L3:
			if(syncqueueitem1 == null) goto _L2; else goto _L1
		//   30   60:aload_2         
		//   31   61:ifnull          100
_L1:
			SyncQueueItem syncqueueitem3 = syncqueueitem1.next;
		//   32   64:aload_2         
		//   33   65:invokestatic    #24  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.access$000(MessageThreadUtil$SyncQueueItem)>
		//   34   68:astore          4
			if(syncqueueitem1.what == i)
		//*  35   70:aload_2         
		//*  36   71:getfield        #30  <Field int MessageThreadUtil$SyncQueueItem.what>
		//*  37   74:iload_1         
		//*  38   75:icmpne          92
			{
				syncqueueitem2.next = syncqueueitem3;
		//   39   78:aload_3         
		//   40   79:aload           4
		//   41   81:invokestatic    #37  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.access$002(MessageThreadUtil$SyncQueueItem, MessageThreadUtil$SyncQueueItem)>
		//   42   84:pop             
				syncqueueitem1.recycle();
		//   43   85:aload_2         
		//   44   86:invokevirtual   #33  <Method void MessageThreadUtil$SyncQueueItem.recycle()>
				continue; /* Loop/switch isn't completed */
		//   45   89:goto            94
			}
			syncqueueitem2 = syncqueueitem1;
		//   46   92:aload_2         
		//   47   93:astore_3        
			syncqueueitem1 = syncqueueitem3;
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

		void sendMessage(SyncQueueItem syncqueueitem)
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
			mRoot = syncqueueitem;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
			this;
		//    8   14:aload_0         
			JVM INSTR monitorexit ;
		//    9   15:monitorexit     
			return;
		//   10   16:return          
			SyncQueueItem syncqueueitem1;
			for(syncqueueitem1 = mRoot; syncqueueitem1.next != null; syncqueueitem1 = syncqueueitem1.next);
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
			syncqueueitem1.next = syncqueueitem;
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
			syncqueueitem;
		//   28   46:astore_1        
		//*  29   47:aload_0         
			throw syncqueueitem;
		//   30   48:monitorexit     
		//   31   49:aload_1         
		//   32   50:athrow          
		}

		void sendMessageAtFrontOfQueue(SyncQueueItem syncqueueitem)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			syncqueueitem.next = mRoot;
		//    2    2:aload_1         
		//    3    3:aload_0         
		//    4    4:getfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
		//    5    7:invokestatic    #37  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.access$002(MessageThreadUtil$SyncQueueItem, MessageThreadUtil$SyncQueueItem)>
		//    6   10:pop             
			mRoot = syncqueueitem;
		//    7   11:aload_0         
		//    8   12:aload_1         
		//    9   13:putfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
			this;
		//   10   16:aload_0         
			JVM INSTR monitorexit ;
		//   11   17:monitorexit     
			return;
		//   12   18:return          
			syncqueueitem;
		//   13   19:astore_1        
		//*  14   20:aload_0         
			throw syncqueueitem;
		//   15   21:monitorexit     
		//   16   22:aload_1         
		//   17   23:athrow          
		}

		private SyncQueueItem mRoot;

		MessageQueue()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static class SyncQueueItem
	{

		static SyncQueueItem obtainMessage(int i, int j, int k)
		{
			return obtainMessage(i, j, k, 0, 0, 0, ((Object) (null)));
		//    0    0:iload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:iconst_0        
		//    4    4:iconst_0        
		//    5    5:iconst_0        
		//    6    6:aconst_null     
		//    7    7:invokestatic    #39  <Method MessageThreadUtil$SyncQueueItem obtainMessage(int, int, int, int, int, int, Object)>
		//    8   10:areturn         
		}

		static SyncQueueItem obtainMessage(int i, int j, int k, int l, int i1, int j1, Object obj)
		{
			Object obj1 = sPoolLock;
		//    0    0:getstatic       #27  <Field Object sPoolLock>
		//    1    3:astore          8
			obj1;
		//    2    5:aload           8
			JVM INSTR monitorenter ;
		//    3    7:monitorenter    
			SyncQueueItem syncqueueitem;
			if(sPool == null)
		//*   4    8:getstatic       #41  <Field MessageThreadUtil$SyncQueueItem sPool>
		//*   5   11:ifnonnull       26
			{
				syncqueueitem = new SyncQueueItem();
		//    6   14:new             #2   <Class MessageThreadUtil$SyncQueueItem>
		//    7   17:dup             
		//    8   18:invokespecial   #42  <Method void MessageThreadUtil$SyncQueueItem()>
		//    9   21:astore          7
				break MISSING_BLOCK_LABEL_46;
		//   10   23:goto            46
			}
			syncqueueitem = sPool;
		//   11   26:getstatic       #41  <Field MessageThreadUtil$SyncQueueItem sPool>
		//   12   29:astore          7
			sPool = sPool.next;
		//   13   31:getstatic       #41  <Field MessageThreadUtil$SyncQueueItem sPool>
		//   14   34:getfield        #32  <Field MessageThreadUtil$SyncQueueItem next>
		//   15   37:putstatic       #41  <Field MessageThreadUtil$SyncQueueItem sPool>
			syncqueueitem.next = null;
		//   16   40:aload           7
		//   17   42:aconst_null     
		//   18   43:putfield        #32  <Field MessageThreadUtil$SyncQueueItem next>
			syncqueueitem.what = i;
		//   19   46:aload           7
		//   20   48:iload_0         
		//   21   49:putfield        #44  <Field int what>
			syncqueueitem.arg1 = j;
		//   22   52:aload           7
		//   23   54:iload_1         
		//   24   55:putfield        #46  <Field int arg1>
			syncqueueitem.arg2 = k;
		//   25   58:aload           7
		//   26   60:iload_2         
		//   27   61:putfield        #48  <Field int arg2>
			syncqueueitem.arg3 = l;
		//   28   64:aload           7
		//   29   66:iload_3         
		//   30   67:putfield        #50  <Field int arg3>
			syncqueueitem.arg4 = i1;
		//   31   70:aload           7
		//   32   72:iload           4
		//   33   74:putfield        #52  <Field int arg4>
			syncqueueitem.arg5 = j1;
		//   34   77:aload           7
		//   35   79:iload           5
		//   36   81:putfield        #54  <Field int arg5>
			syncqueueitem.data = obj;
		//   37   84:aload           7
		//   38   86:aload           6
		//   39   88:putfield        #56  <Field Object data>
			obj1;
		//   40   91:aload           8
			JVM INSTR monitorexit ;
		//   41   93:monitorexit     
			return syncqueueitem;
		//   42   94:aload           7
		//   43   96:areturn         
			obj;
		//   44   97:astore          6
		//*  45   99:aload           8
			throw obj;
		//   46  101:monitorexit     
		//   47  102:aload           6
		//   48  104:athrow          
		}

		static SyncQueueItem obtainMessage(int i, int j, Object obj)
		{
			return obtainMessage(i, j, 0, 0, 0, 0, obj);
		//    0    0:iload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:iconst_0        
		//    4    4:iconst_0        
		//    5    5:iconst_0        
		//    6    6:aload_2         
		//    7    7:invokestatic    #39  <Method MessageThreadUtil$SyncQueueItem obtainMessage(int, int, int, int, int, int, Object)>
		//    8   10:areturn         
		}

		void recycle()
		{
			next = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #32  <Field MessageThreadUtil$SyncQueueItem next>
			arg5 = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #54  <Field int arg5>
			arg4 = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #52  <Field int arg4>
			arg3 = 0;
		//    9   15:aload_0         
		//   10   16:iconst_0        
		//   11   17:putfield        #50  <Field int arg3>
			arg2 = 0;
		//   12   20:aload_0         
		//   13   21:iconst_0        
		//   14   22:putfield        #48  <Field int arg2>
			arg1 = 0;
		//   15   25:aload_0         
		//   16   26:iconst_0        
		//   17   27:putfield        #46  <Field int arg1>
			what = 0;
		//   18   30:aload_0         
		//   19   31:iconst_0        
		//   20   32:putfield        #44  <Field int what>
			data = null;
		//   21   35:aload_0         
		//   22   36:aconst_null     
		//   23   37:putfield        #56  <Field Object data>
			Object obj = sPoolLock;
		//   24   40:getstatic       #27  <Field Object sPoolLock>
		//   25   43:astore_1        
			obj;
		//   26   44:aload_1         
			JVM INSTR monitorenter ;
		//   27   45:monitorenter    
			if(sPool != null)
		//*  28   46:getstatic       #41  <Field MessageThreadUtil$SyncQueueItem sPool>
		//*  29   49:ifnull          59
				next = sPool;
		//   30   52:aload_0         
		//   31   53:getstatic       #41  <Field MessageThreadUtil$SyncQueueItem sPool>
		//   32   56:putfield        #32  <Field MessageThreadUtil$SyncQueueItem next>
			sPool = this;
		//   33   59:aload_0         
		//   34   60:putstatic       #41  <Field MessageThreadUtil$SyncQueueItem sPool>
			obj;
		//   35   63:aload_1         
			JVM INSTR monitorexit ;
		//   36   64:monitorexit     
			return;
		//   37   65:return          
			Exception exception;
			exception;
		//   38   66:astore_2        
		//*  39   67:aload_1         
			throw exception;
		//   40   68:monitorexit     
		//   41   69:aload_2         
		//   42   70:athrow          
		}

		private static SyncQueueItem sPool;
		private static final Object sPoolLock = new Object();
		public int arg1;
		public int arg2;
		public int arg3;
		public int arg4;
		public int arg5;
		public Object data;
		private SyncQueueItem next;
		public int what;

		static 
		{
		//    0    0:new             #4   <Class Object>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void Object()>
		//    3    7:putstatic       #27  <Field Object sPoolLock>
		//*   4   10:return          
		}


/*
		static SyncQueueItem access$000(SyncQueueItem syncqueueitem)
		{
			return syncqueueitem.next;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field MessageThreadUtil$SyncQueueItem next>
		//    2    4:areturn         
		}

*/


/*
		static SyncQueueItem access$002(SyncQueueItem syncqueueitem, SyncQueueItem syncqueueitem1)
		{
			syncqueueitem.next = syncqueueitem1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #32  <Field MessageThreadUtil$SyncQueueItem next>
			return syncqueueitem1;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/

		SyncQueueItem()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
		//    2    4:return          
		}
	}


	MessageThreadUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	public ThreadUtil.BackgroundCallback getBackgroundProxy(final ThreadUtil.BackgroundCallback callback)
	{
		return new ThreadUtil.BackgroundCallback() {

			private void maybeExecuteBackgroundRunnable()
			{
				if(mBackgroundRunning.compareAndSet(false, true))
			//*   0    0:aload_0         
			//*   1    1:getfield        #63  <Field AtomicBoolean mBackgroundRunning>
			//*   2    4:iconst_0        
			//*   3    5:iconst_1        
			//*   4    6:invokevirtual   #74  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
			//*   5    9:ifeq            25
					mExecutor.execute(mBackgroundRunnable);
			//    6   12:aload_0         
			//    7   13:getfield        #56  <Field Executor mExecutor>
			//    8   16:aload_0         
			//    9   17:getfield        #68  <Field Runnable mBackgroundRunnable>
			//   10   20:invokeinterface #80  <Method void Executor.execute(Runnable)>
			//   11   25:return          
			}

			private void sendMessage(SyncQueueItem syncqueueitem)
			{
				mQueue.sendMessage(syncqueueitem);
			//    0    0:aload_0         
			//    1    1:getfield        #49  <Field MessageThreadUtil$MessageQueue mQueue>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #84  <Method void MessageThreadUtil$MessageQueue.sendMessage(MessageThreadUtil$SyncQueueItem)>
				maybeExecuteBackgroundRunnable();
			//    4    8:aload_0         
			//    5    9:invokespecial   #86  <Method void maybeExecuteBackgroundRunnable()>
			//    6   12:return          
			}

			private void sendMessageAtFrontOfQueue(SyncQueueItem syncqueueitem)
			{
				mQueue.sendMessageAtFrontOfQueue(syncqueueitem);
			//    0    0:aload_0         
			//    1    1:getfield        #49  <Field MessageThreadUtil$MessageQueue mQueue>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #89  <Method void MessageThreadUtil$MessageQueue.sendMessageAtFrontOfQueue(MessageThreadUtil$SyncQueueItem)>
				maybeExecuteBackgroundRunnable();
			//    4    8:aload_0         
			//    5    9:invokespecial   #86  <Method void maybeExecuteBackgroundRunnable()>
			//    6   12:return          
			}

			public void loadTile(int i, int j)
			{
				sendMessage(SyncQueueItem.obtainMessage(3, i, j));
			//    0    0:aload_0         
			//    1    1:iconst_3        
			//    2    2:iload_1         
			//    3    3:iload_2         
			//    4    4:invokestatic    #97  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.obtainMessage(int, int, int)>
			//    5    7:invokespecial   #98  <Method void sendMessage(MessageThreadUtil$SyncQueueItem)>
			//    6   10:return          
			}

			public void recycleTile(TileList.Tile tile)
			{
				sendMessage(SyncQueueItem.obtainMessage(4, 0, ((Object) (tile))));
			//    0    0:aload_0         
			//    1    1:iconst_4        
			//    2    2:iconst_0        
			//    3    3:aload_1         
			//    4    4:invokestatic    #103 <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.obtainMessage(int, int, Object)>
			//    5    7:invokespecial   #98  <Method void sendMessage(MessageThreadUtil$SyncQueueItem)>
			//    6   10:return          
			}

			public void refresh(int i)
			{
				sendMessageAtFrontOfQueue(SyncQueueItem.obtainMessage(1, i, ((Object) (null))));
			//    0    0:aload_0         
			//    1    1:iconst_1        
			//    2    2:iload_1         
			//    3    3:aconst_null     
			//    4    4:invokestatic    #103 <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.obtainMessage(int, int, Object)>
			//    5    7:invokespecial   #108 <Method void sendMessageAtFrontOfQueue(MessageThreadUtil$SyncQueueItem)>
			//    6   10:return          
			}

			public void updateRange(int i, int j, int k, int l, int i1)
			{
				sendMessageAtFrontOfQueue(SyncQueueItem.obtainMessage(2, i, j, k, l, i1, ((Object) (null))));
			//    0    0:aload_0         
			//    1    1:iconst_2        
			//    2    2:iload_1         
			//    3    3:iload_2         
			//    4    4:iload_3         
			//    5    5:iload           4
			//    6    7:iload           5
			//    7    9:aconst_null     
			//    8   10:invokestatic    #113 <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.obtainMessage(int, int, int, int, int, int, Object)>
			//    9   13:invokespecial   #108 <Method void sendMessageAtFrontOfQueue(MessageThreadUtil$SyncQueueItem)>
			//   10   16:return          
			}

			static final int LOAD_TILE = 3;
			static final int RECYCLE_TILE = 4;
			static final int REFRESH = 1;
			static final int UPDATE_RANGE = 2;
			private Runnable mBackgroundRunnable;
			AtomicBoolean mBackgroundRunning;
			private final Executor mExecutor;
			final MessageQueue mQueue = new MessageQueue();
			final MessageThreadUtil this$0;
			final ThreadUtil.BackgroundCallback val$callback;

			
			{
				this$0 = MessageThreadUtil.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #39  <Field MessageThreadUtil this$0>
				callback = backgroundcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #41  <Field ThreadUtil$BackgroundCallback val$callback>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #44  <Method void Object()>
			//    8   14:aload_0         
			//    9   15:new             #46  <Class MessageThreadUtil$MessageQueue>
			//   10   18:dup             
			//   11   19:invokespecial   #47  <Method void MessageThreadUtil$MessageQueue()>
			//   12   22:putfield        #49  <Field MessageThreadUtil$MessageQueue mQueue>
				mExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
			//   13   25:aload_0         
			//   14   26:getstatic       #54  <Field Executor AsyncTask.THREAD_POOL_EXECUTOR>
			//   15   29:putfield        #56  <Field Executor mExecutor>
				mBackgroundRunning = new AtomicBoolean(false);
			//   16   32:aload_0         
			//   17   33:new             #58  <Class AtomicBoolean>
			//   18   36:dup             
			//   19   37:iconst_0        
			//   20   38:invokespecial   #61  <Method void AtomicBoolean(boolean)>
			//   21   41:putfield        #63  <Field AtomicBoolean mBackgroundRunning>
				mBackgroundRunnable = new _cls1();
			//   22   44:aload_0         
			//   23   45:new             #14  <Class MessageThreadUtil$2$1>
			//   24   48:dup             
			//   25   49:aload_0         
			//   26   50:invokespecial   #66  <Method void MessageThreadUtil$2$1(MessageThreadUtil$2)>
			//   27   53:putfield        #68  <Field Runnable mBackgroundRunnable>
			//   28   56:return          
			}
		}
;
	//    0    0:new             #13  <Class MessageThreadUtil$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #31  <Method void MessageThreadUtil$2(MessageThreadUtil, ThreadUtil$BackgroundCallback)>
	//    5    9:areturn         
	}

	public ThreadUtil.MainThreadCallback getMainThreadProxy(final ThreadUtil.MainThreadCallback callback)
	{
		return new ThreadUtil.MainThreadCallback() {

			private void sendMessage(SyncQueueItem syncqueueitem)
			{
				mQueue.sendMessage(syncqueueitem);
			//    0    0:aload_0         
			//    1    1:getfield        #45  <Field MessageThreadUtil$MessageQueue mQueue>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #68  <Method void MessageThreadUtil$MessageQueue.sendMessage(MessageThreadUtil$SyncQueueItem)>
				mMainThreadHandler.post(mMainThreadRunnable);
			//    4    8:aload_0         
			//    5    9:getfield        #58  <Field Handler mMainThreadHandler>
			//    6   12:aload_0         
			//    7   13:getfield        #63  <Field Runnable mMainThreadRunnable>
			//    8   16:invokevirtual   #72  <Method boolean Handler.post(Runnable)>
			//    9   19:pop             
			//   10   20:return          
			}

			public void addTile(int i, TileList.Tile tile)
			{
				sendMessage(SyncQueueItem.obtainMessage(2, i, ((Object) (tile))));
			//    0    0:aload_0         
			//    1    1:iconst_2        
			//    2    2:iload_1         
			//    3    3:aload_2         
			//    4    4:invokestatic    #80  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.obtainMessage(int, int, Object)>
			//    5    7:invokespecial   #81  <Method void sendMessage(MessageThreadUtil$SyncQueueItem)>
			//    6   10:return          
			}

			public void removeTile(int i, int j)
			{
				sendMessage(SyncQueueItem.obtainMessage(3, i, j));
			//    0    0:aload_0         
			//    1    1:iconst_3        
			//    2    2:iload_1         
			//    3    3:iload_2         
			//    4    4:invokestatic    #88  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.obtainMessage(int, int, int)>
			//    5    7:invokespecial   #81  <Method void sendMessage(MessageThreadUtil$SyncQueueItem)>
			//    6   10:return          
			}

			public void updateItemCount(int i, int j)
			{
				sendMessage(SyncQueueItem.obtainMessage(1, i, j));
			//    0    0:aload_0         
			//    1    1:iconst_1        
			//    2    2:iload_1         
			//    3    3:iload_2         
			//    4    4:invokestatic    #88  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.obtainMessage(int, int, int)>
			//    5    7:invokespecial   #81  <Method void sendMessage(MessageThreadUtil$SyncQueueItem)>
			//    6   10:return          
			}

			static final int ADD_TILE = 2;
			static final int REMOVE_TILE = 3;
			static final int UPDATE_ITEM_COUNT = 1;
			private final Handler mMainThreadHandler = new Handler(Looper.getMainLooper());
			private Runnable mMainThreadRunnable;
			final MessageQueue mQueue = new MessageQueue();
			final MessageThreadUtil this$0;
			final ThreadUtil.MainThreadCallback val$callback;

			
			{
				this$0 = MessageThreadUtil.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #35  <Field MessageThreadUtil this$0>
				callback = mainthreadcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #37  <Field ThreadUtil$MainThreadCallback val$callback>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #40  <Method void Object()>
			//    8   14:aload_0         
			//    9   15:new             #42  <Class MessageThreadUtil$MessageQueue>
			//   10   18:dup             
			//   11   19:invokespecial   #43  <Method void MessageThreadUtil$MessageQueue()>
			//   12   22:putfield        #45  <Field MessageThreadUtil$MessageQueue mQueue>
			//   13   25:aload_0         
			//   14   26:new             #47  <Class Handler>
			//   15   29:dup             
			//   16   30:invokestatic    #53  <Method Looper Looper.getMainLooper()>
			//   17   33:invokespecial   #56  <Method void Handler(Looper)>
			//   18   36:putfield        #58  <Field Handler mMainThreadHandler>
				mMainThreadRunnable = new _cls1();
			//   19   39:aload_0         
			//   20   40:new             #14  <Class MessageThreadUtil$1$1>
			//   21   43:dup             
			//   22   44:aload_0         
			//   23   45:invokespecial   #61  <Method void MessageThreadUtil$1$1(MessageThreadUtil$1)>
			//   24   48:putfield        #63  <Field Runnable mMainThreadRunnable>
			//   25   51:return          
			}
		}
;
	//    0    0:new             #9   <Class MessageThreadUtil$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #38  <Method void MessageThreadUtil$1(MessageThreadUtil, ThreadUtil$MainThreadCallback)>
	//    5    9:areturn         
	}

	// Unreferenced inner class android/support/v7/util/MessageThreadUtil$1$1

/* anonymous class */
	class _cls1
		implements Runnable
	{

		public void run()
		{
			for(SyncQueueItem syncqueueitem = mQueue.next(); syncqueueitem != null; syncqueueitem = mQueue.next())
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field MessageThreadUtil$1 this$1>
		//*   2    4:getfield        #23  <Field MessageThreadUtil$MessageQueue MessageThreadUtil$1.mQueue>
		//*   3    7:invokevirtual   #29  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$MessageQueue.next()>
		//*   4   10:astore_1        
		//*   5   11:aload_1         
		//*   6   12:ifnull          161
				switch(syncqueueitem.what)
		//*   7   15:aload_1         
		//*   8   16:getfield        #35  <Field int MessageThreadUtil$SyncQueueItem.what>
				{
		//*   9   19:tableswitch     1 3: default 44
		//		               1 47
		//		               2 70
		//		               3 96
		//*  10   44:goto            119
				case 1: // '\001'
					callback.updateItemCount(syncqueueitem.arg1, syncqueueitem.arg2);
		//   11   47:aload_0         
		//   12   48:getfield        #14  <Field MessageThreadUtil$1 this$1>
		//   13   51:getfield        #39  <Field ThreadUtil$MainThreadCallback MessageThreadUtil$1.val$callback>
		//   14   54:aload_1         
		//   15   55:getfield        #42  <Field int MessageThreadUtil$SyncQueueItem.arg1>
		//   16   58:aload_1         
		//   17   59:getfield        #45  <Field int MessageThreadUtil$SyncQueueItem.arg2>
		//   18   62:invokeinterface #51  <Method void ThreadUtil$MainThreadCallback.updateItemCount(int, int)>
					break;

		//*  19   67:goto            147
				case 2: // '\002'
					callback.addTile(syncqueueitem.arg1, (TileList.Tile)syncqueueitem.data);
		//   20   70:aload_0         
		//   21   71:getfield        #14  <Field MessageThreadUtil$1 this$1>
		//   22   74:getfield        #39  <Field ThreadUtil$MainThreadCallback MessageThreadUtil$1.val$callback>
		//   23   77:aload_1         
		//   24   78:getfield        #42  <Field int MessageThreadUtil$SyncQueueItem.arg1>
		//   25   81:aload_1         
		//   26   82:getfield        #55  <Field Object MessageThreadUtil$SyncQueueItem.data>
		//   27   85:checkcast       #57  <Class TileList$Tile>
		//   28   88:invokeinterface #61  <Method void ThreadUtil$MainThreadCallback.addTile(int, TileList$Tile)>
					break;

		//*  29   93:goto            147
				case 3: // '\003'
					callback.removeTile(syncqueueitem.arg1, syncqueueitem.arg2);
		//   30   96:aload_0         
		//   31   97:getfield        #14  <Field MessageThreadUtil$1 this$1>
		//   32  100:getfield        #39  <Field ThreadUtil$MainThreadCallback MessageThreadUtil$1.val$callback>
		//   33  103:aload_1         
		//   34  104:getfield        #42  <Field int MessageThreadUtil$SyncQueueItem.arg1>
		//   35  107:aload_1         
		//   36  108:getfield        #45  <Field int MessageThreadUtil$SyncQueueItem.arg2>
		//   37  111:invokeinterface #64  <Method void ThreadUtil$MainThreadCallback.removeTile(int, int)>
					break;

		//*  38  116:goto            147
				default:
					Log.e("ThreadUtil", (new StringBuilder()).append("Unsupported message, what=").append(syncqueueitem.what).toString());
		//   39  119:ldc1            #66  <String "ThreadUtil">
		//   40  121:new             #68  <Class StringBuilder>
		//   41  124:dup             
		//   42  125:invokespecial   #69  <Method void StringBuilder()>
		//   43  128:ldc1            #71  <String "Unsupported message, what=">
		//   44  130:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   45  133:aload_1         
		//   46  134:getfield        #35  <Field int MessageThreadUtil$SyncQueueItem.what>
		//   47  137:invokevirtual   #78  <Method StringBuilder StringBuilder.append(int)>
		//   48  140:invokevirtual   #82  <Method String StringBuilder.toString()>
		//   49  143:invokestatic    #88  <Method int Log.e(String, String)>
		//   50  146:pop             
					break;
				}

		//   51  147:aload_0         
		//   52  148:getfield        #14  <Field MessageThreadUtil$1 this$1>
		//   53  151:getfield        #23  <Field MessageThreadUtil$MessageQueue MessageThreadUtil$1.mQueue>
		//   54  154:invokevirtual   #29  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$MessageQueue.next()>
		//   55  157:astore_1        
		//*  56  158:goto            11
		//   57  161:return          
		}

		final _cls1 this$1;

			
			{
				this$1 = _cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field MessageThreadUtil$1 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}


	// Unreferenced inner class android/support/v7/util/MessageThreadUtil$2$1

/* anonymous class */
	class _cls1
		implements Runnable
	{

		public void run()
		{
			do
			{
				SyncQueueItem syncqueueitem = mQueue.next();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field MessageThreadUtil$2 this$1>
		//    2    4:getfield        #23  <Field MessageThreadUtil$MessageQueue MessageThreadUtil$2.mQueue>
		//    3    7:invokevirtual   #29  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$MessageQueue.next()>
		//    4   10:astore_1        
				if(syncqueueitem != null)
		//*   5   11:aload_1         
		//*   6   12:ifnonnull       18
		//*   7   15:goto            218
				{
					switch(syncqueueitem.what)
		//*   8   18:aload_1         
		//*   9   19:getfield        #35  <Field int MessageThreadUtil$SyncQueueItem.what>
					{
		//*  10   22:tableswitch     1 4: default 52
		//		               1 55
		//		               2 85
		//		               3 142
		//		               4 165
		//*  11   52:goto            187
					case 1: // '\001'
						mQueue.removeMessages(1);
		//   12   55:aload_0         
		//   13   56:getfield        #14  <Field MessageThreadUtil$2 this$1>
		//   14   59:getfield        #23  <Field MessageThreadUtil$MessageQueue MessageThreadUtil$2.mQueue>
		//   15   62:iconst_1        
		//   16   63:invokevirtual   #39  <Method void MessageThreadUtil$MessageQueue.removeMessages(int)>
						callback.refresh(syncqueueitem.arg1);
		//   17   66:aload_0         
		//   18   67:getfield        #14  <Field MessageThreadUtil$2 this$1>
		//   19   70:getfield        #43  <Field ThreadUtil$BackgroundCallback MessageThreadUtil$2.val$callback>
		//   20   73:aload_1         
		//   21   74:getfield        #46  <Field int MessageThreadUtil$SyncQueueItem.arg1>
		//   22   77:invokeinterface #51  <Method void ThreadUtil$BackgroundCallback.refresh(int)>
						break;

		//*  23   82:goto            215
					case 2: // '\002'
						mQueue.removeMessages(2);
		//   24   85:aload_0         
		//   25   86:getfield        #14  <Field MessageThreadUtil$2 this$1>
		//   26   89:getfield        #23  <Field MessageThreadUtil$MessageQueue MessageThreadUtil$2.mQueue>
		//   27   92:iconst_2        
		//   28   93:invokevirtual   #39  <Method void MessageThreadUtil$MessageQueue.removeMessages(int)>
						mQueue.removeMessages(3);
		//   29   96:aload_0         
		//   30   97:getfield        #14  <Field MessageThreadUtil$2 this$1>
		//   31  100:getfield        #23  <Field MessageThreadUtil$MessageQueue MessageThreadUtil$2.mQueue>
		//   32  103:iconst_3        
		//   33  104:invokevirtual   #39  <Method void MessageThreadUtil$MessageQueue.removeMessages(int)>
						callback.updateRange(syncqueueitem.arg1, syncqueueitem.arg2, syncqueueitem.arg3, syncqueueitem.arg4, syncqueueitem.arg5);
		//   34  107:aload_0         
		//   35  108:getfield        #14  <Field MessageThreadUtil$2 this$1>
		//   36  111:getfield        #43  <Field ThreadUtil$BackgroundCallback MessageThreadUtil$2.val$callback>
		//   37  114:aload_1         
		//   38  115:getfield        #46  <Field int MessageThreadUtil$SyncQueueItem.arg1>
		//   39  118:aload_1         
		//   40  119:getfield        #54  <Field int MessageThreadUtil$SyncQueueItem.arg2>
		//   41  122:aload_1         
		//   42  123:getfield        #57  <Field int MessageThreadUtil$SyncQueueItem.arg3>
		//   43  126:aload_1         
		//   44  127:getfield        #60  <Field int MessageThreadUtil$SyncQueueItem.arg4>
		//   45  130:aload_1         
		//   46  131:getfield        #63  <Field int MessageThreadUtil$SyncQueueItem.arg5>
		//   47  134:invokeinterface #67  <Method void ThreadUtil$BackgroundCallback.updateRange(int, int, int, int, int)>
						break;

		//*  48  139:goto            215
					case 3: // '\003'
						callback.loadTile(syncqueueitem.arg1, syncqueueitem.arg2);
		//   49  142:aload_0         
		//   50  143:getfield        #14  <Field MessageThreadUtil$2 this$1>
		//   51  146:getfield        #43  <Field ThreadUtil$BackgroundCallback MessageThreadUtil$2.val$callback>
		//   52  149:aload_1         
		//   53  150:getfield        #46  <Field int MessageThreadUtil$SyncQueueItem.arg1>
		//   54  153:aload_1         
		//   55  154:getfield        #54  <Field int MessageThreadUtil$SyncQueueItem.arg2>
		//   56  157:invokeinterface #71  <Method void ThreadUtil$BackgroundCallback.loadTile(int, int)>
						break;

		//*  57  162:goto            215
					case 4: // '\004'
						callback.recycleTile((TileList.Tile)syncqueueitem.data);
		//   58  165:aload_0         
		//   59  166:getfield        #14  <Field MessageThreadUtil$2 this$1>
		//   60  169:getfield        #43  <Field ThreadUtil$BackgroundCallback MessageThreadUtil$2.val$callback>
		//   61  172:aload_1         
		//   62  173:getfield        #75  <Field Object MessageThreadUtil$SyncQueueItem.data>
		//   63  176:checkcast       #77  <Class TileList$Tile>
		//   64  179:invokeinterface #81  <Method void ThreadUtil$BackgroundCallback.recycleTile(TileList$Tile)>
						break;

		//*  65  184:goto            215
					default:
						Log.e("ThreadUtil", (new StringBuilder()).append("Unsupported message, what=").append(syncqueueitem.what).toString());
		//   66  187:ldc1            #83  <String "ThreadUtil">
		//   67  189:new             #85  <Class StringBuilder>
		//   68  192:dup             
		//   69  193:invokespecial   #86  <Method void StringBuilder()>
		//   70  196:ldc1            #88  <String "Unsupported message, what=">
		//   71  198:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
		//   72  201:aload_1         
		//   73  202:getfield        #35  <Field int MessageThreadUtil$SyncQueueItem.what>
		//   74  205:invokevirtual   #95  <Method StringBuilder StringBuilder.append(int)>
		//   75  208:invokevirtual   #99  <Method String StringBuilder.toString()>
		//   76  211:invokestatic    #105 <Method int Log.e(String, String)>
		//   77  214:pop             
						break;
					}
				} else
		//*  78  215:goto            0
				{
					mBackgroundRunning.set(false);
		//   79  218:aload_0         
		//   80  219:getfield        #14  <Field MessageThreadUtil$2 this$1>
		//   81  222:getfield        #109 <Field AtomicBoolean MessageThreadUtil$2.mBackgroundRunning>
		//   82  225:iconst_0        
		//   83  226:invokevirtual   #115 <Method void AtomicBoolean.set(boolean)>
					return;
		//   84  229:return          
				}
			} while(true);
		}

		final _cls2 this$1;

			
			{
				this$1 = _cls2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field MessageThreadUtil$2 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}

}
