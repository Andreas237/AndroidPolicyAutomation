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
			SyncQueueItem syncqueueitem = mRoot;
		//    2    2:aload_0         
		//    3    3:getfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
		//    4    6:astore_1        
			if(syncqueueitem != null) goto _L2; else goto _L1
		//    5    7:aload_1         
		//    6    8:ifnonnull       17
_L1:
			syncqueueitem = null;
		//    7   11:aconst_null     
		//    8   12:astore_1        
_L4:
			this;
		//    9   13:aload_0         
			JVM INSTR monitorexit ;
		//   10   14:monitorexit     
			return syncqueueitem;
		//   11   15:aload_1         
		//   12   16:areturn         
_L2:
			syncqueueitem = mRoot;
		//   13   17:aload_0         
		//   14   18:getfield        #18  <Field MessageThreadUtil$SyncQueueItem mRoot>
		//   15   21:astore_1        
			mRoot = mRoot.next;
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

		void sendMessage(SyncQueueItem syncqueueitem)
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
			mRoot = syncqueueitem;
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
			  goto _L3
		//*  25   43:goto            14
			syncqueueitem;
		//   26   46:astore_1        
		//*  27   47:aload_0         
			throw syncqueueitem;
		//   28   48:monitorexit     
		//   29   49:aload_1         
		//   30   50:athrow          
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
			if(sPool != null)
				break MISSING_BLOCK_LABEL_74;
		//    4    8:getstatic       #41  <Field MessageThreadUtil$SyncQueueItem sPool>
		//    5   11:ifnonnull       74
			syncqueueitem = new SyncQueueItem();
		//    6   14:new             #2   <Class MessageThreadUtil$SyncQueueItem>
		//    7   17:dup             
		//    8   18:invokespecial   #42  <Method void MessageThreadUtil$SyncQueueItem()>
		//    9   21:astore          7
_L1:
			syncqueueitem.what = i;
		//   10   23:aload           7
		//   11   25:iload_0         
		//   12   26:putfield        #44  <Field int what>
			syncqueueitem.arg1 = j;
		//   13   29:aload           7
		//   14   31:iload_1         
		//   15   32:putfield        #46  <Field int arg1>
			syncqueueitem.arg2 = k;
		//   16   35:aload           7
		//   17   37:iload_2         
		//   18   38:putfield        #48  <Field int arg2>
			syncqueueitem.arg3 = l;
		//   19   41:aload           7
		//   20   43:iload_3         
		//   21   44:putfield        #50  <Field int arg3>
			syncqueueitem.arg4 = i1;
		//   22   47:aload           7
		//   23   49:iload           4
		//   24   51:putfield        #52  <Field int arg4>
			syncqueueitem.arg5 = j1;
		//   25   54:aload           7
		//   26   56:iload           5
		//   27   58:putfield        #54  <Field int arg5>
			syncqueueitem.data = obj;
		//   28   61:aload           7
		//   29   63:aload           6
		//   30   65:putfield        #56  <Field Object data>
		//*  31   68:aload           8
			return syncqueueitem;
		//   32   70:monitorexit     
		//   33   71:aload           7
		//   34   73:areturn         
			syncqueueitem = sPool;
		//   35   74:getstatic       #41  <Field MessageThreadUtil$SyncQueueItem sPool>
		//   36   77:astore          7
			sPool = sPool.next;
		//   37   79:getstatic       #41  <Field MessageThreadUtil$SyncQueueItem sPool>
		//   38   82:getfield        #32  <Field MessageThreadUtil$SyncQueueItem next>
		//   39   85:putstatic       #41  <Field MessageThreadUtil$SyncQueueItem sPool>
			syncqueueitem.next = null;
		//   40   88:aload           7
		//   41   90:aconst_null     
		//   42   91:putfield        #32  <Field MessageThreadUtil$SyncQueueItem next>
			  goto _L1
		//*  43   94:goto            23
			obj;
		//   44   97:astore          6
			obj1;
		//   45   99:aload           8
			JVM INSTR monitorexit ;
		//   46  101:monitorexit     
			throw obj;
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
			synchronized(sPoolLock)
		//*  24   40:getstatic       #27  <Field Object sPoolLock>
		//*  25   43:astore_1        
		//*  26   44:aload_1         
		//*  27   45:monitorenter    
			{
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
			}
		//   35   63:aload_1         
		//   36   64:monitorexit     
			return;
		//   37   65:return          
			exception;
		//   38   66:astore_2        
			obj;
		//   39   67:aload_1         
			JVM INSTR monitorexit ;
		//   40   68:monitorexit     
			throw exception;
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
			SyncQueueItem syncqueueitem = mQueue.next();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field MessageThreadUtil$1 this$1>
		//    2    4:getfield        #23  <Field MessageThreadUtil$MessageQueue MessageThreadUtil$1.mQueue>
		//    3    7:invokevirtual   #29  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$MessageQueue.next()>
		//    4   10:astore_1        
_L6:
			if(syncqueueitem == null)
				break MISSING_BLOCK_LABEL_158;
		//    5   11:aload_1         
		//    6   12:ifnull          158
			syncqueueitem.what;
		//    7   15:aload_1         
		//    8   16:getfield        #35  <Field int MessageThreadUtil$SyncQueueItem.what>
			JVM INSTR tableswitch 1 3: default 44
		//		               1 86
		//		               2 109
		//		               3 135;
		//    9   19:tableswitch     1 3: default 44
		//		               1 86
		//		               2 109
		//		               3 135
			   goto _L1 _L2 _L3 _L4
_L4:
			break MISSING_BLOCK_LABEL_135;
_L2:
			break; /* Loop/switch isn't completed */
_L1:
			Log.e("ThreadUtil", (new StringBuilder()).append("Unsupported message, what=").append(syncqueueitem.what).toString());
		//   10   44:ldc1            #37  <String "ThreadUtil">
		//   11   46:new             #39  <Class StringBuilder>
		//   12   49:dup             
		//   13   50:invokespecial   #40  <Method void StringBuilder()>
		//   14   53:ldc1            #42  <String "Unsupported message, what=">
		//   15   55:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
		//   16   58:aload_1         
		//   17   59:getfield        #35  <Field int MessageThreadUtil$SyncQueueItem.what>
		//   18   62:invokevirtual   #49  <Method StringBuilder StringBuilder.append(int)>
		//   19   65:invokevirtual   #53  <Method String StringBuilder.toString()>
		//   20   68:invokestatic    #59  <Method int Log.e(String, String)>
		//   21   71:pop             
_L7:
			syncqueueitem = mQueue.next();
		//   22   72:aload_0         
		//   23   73:getfield        #14  <Field MessageThreadUtil$1 this$1>
		//   24   76:getfield        #23  <Field MessageThreadUtil$MessageQueue MessageThreadUtil$1.mQueue>
		//   25   79:invokevirtual   #29  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$MessageQueue.next()>
		//   26   82:astore_1        
			if(true) goto _L6; else goto _L5
		//   27   83:goto            11
_L5:
			callback.updateItemCount(syncqueueitem.arg1, syncqueueitem.arg2);
		//   28   86:aload_0         
		//   29   87:getfield        #14  <Field MessageThreadUtil$1 this$1>
		//   30   90:getfield        #63  <Field ThreadUtil$MainThreadCallback MessageThreadUtil$1.val$callback>
		//   31   93:aload_1         
		//   32   94:getfield        #66  <Field int MessageThreadUtil$SyncQueueItem.arg1>
		//   33   97:aload_1         
		//   34   98:getfield        #69  <Field int MessageThreadUtil$SyncQueueItem.arg2>
		//   35  101:invokeinterface #75  <Method void ThreadUtil$MainThreadCallback.updateItemCount(int, int)>
			  goto _L7
		//*  36  106:goto            72
_L3:
			callback.addTile(syncqueueitem.arg1, (TileList.Tile)syncqueueitem.data);
		//   37  109:aload_0         
		//   38  110:getfield        #14  <Field MessageThreadUtil$1 this$1>
		//   39  113:getfield        #63  <Field ThreadUtil$MainThreadCallback MessageThreadUtil$1.val$callback>
		//   40  116:aload_1         
		//   41  117:getfield        #66  <Field int MessageThreadUtil$SyncQueueItem.arg1>
		//   42  120:aload_1         
		//   43  121:getfield        #79  <Field Object MessageThreadUtil$SyncQueueItem.data>
		//   44  124:checkcast       #81  <Class TileList$Tile>
		//   45  127:invokeinterface #85  <Method void ThreadUtil$MainThreadCallback.addTile(int, TileList$Tile)>
			  goto _L7
		//*  46  132:goto            72
			callback.removeTile(syncqueueitem.arg1, syncqueueitem.arg2);
		//   47  135:aload_0         
		//   48  136:getfield        #14  <Field MessageThreadUtil$1 this$1>
		//   49  139:getfield        #63  <Field ThreadUtil$MainThreadCallback MessageThreadUtil$1.val$callback>
		//   50  142:aload_1         
		//   51  143:getfield        #66  <Field int MessageThreadUtil$SyncQueueItem.arg1>
		//   52  146:aload_1         
		//   53  147:getfield        #69  <Field int MessageThreadUtil$SyncQueueItem.arg2>
		//   54  150:invokeinterface #88  <Method void ThreadUtil$MainThreadCallback.removeTile(int, int)>
			  goto _L7
		//*  55  155:goto            72
		//   56  158:return          
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
				if(syncqueueitem == null)
		//*   5   11:aload_1         
		//*   6   12:ifnonnull       27
				{
					mBackgroundRunning.set(false);
		//    7   15:aload_0         
		//    8   16:getfield        #14  <Field MessageThreadUtil$2 this$1>
		//    9   19:getfield        #33  <Field AtomicBoolean MessageThreadUtil$2.mBackgroundRunning>
		//   10   22:iconst_0        
		//   11   23:invokevirtual   #39  <Method void AtomicBoolean.set(boolean)>
					return;
		//   12   26:return          
				}
				switch(syncqueueitem.what)
		//*  13   27:aload_1         
		//*  14   28:getfield        #45  <Field int MessageThreadUtil$SyncQueueItem.what>
				{
		//*  15   31:tableswitch     1 4: default 60
		//		               1 91
		//		               2 121
		//		               3 178
		//		               4 201
				default:
					Log.e("ThreadUtil", (new StringBuilder()).append("Unsupported message, what=").append(syncqueueitem.what).toString());
		//   16   60:ldc1            #47  <String "ThreadUtil">
		//   17   62:new             #49  <Class StringBuilder>
		//   18   65:dup             
		//   19   66:invokespecial   #50  <Method void StringBuilder()>
		//   20   69:ldc1            #52  <String "Unsupported message, what=">
		//   21   71:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//   22   74:aload_1         
		//   23   75:getfield        #45  <Field int MessageThreadUtil$SyncQueueItem.what>
		//   24   78:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
		//   25   81:invokevirtual   #63  <Method String StringBuilder.toString()>
		//   26   84:invokestatic    #69  <Method int Log.e(String, String)>
		//   27   87:pop             
					break;

		//*  28   88:goto            0
				case 1: // '\001'
					mQueue.removeMessages(1);
		//   29   91:aload_0         
		//   30   92:getfield        #14  <Field MessageThreadUtil$2 this$1>
		//   31   95:getfield        #23  <Field MessageThreadUtil$MessageQueue MessageThreadUtil$2.mQueue>
		//   32   98:iconst_1        
		//   33   99:invokevirtual   #73  <Method void MessageThreadUtil$MessageQueue.removeMessages(int)>
					callback.refresh(syncqueueitem.arg1);
		//   34  102:aload_0         
		//   35  103:getfield        #14  <Field MessageThreadUtil$2 this$1>
		//   36  106:getfield        #77  <Field ThreadUtil$BackgroundCallback MessageThreadUtil$2.val$callback>
		//   37  109:aload_1         
		//   38  110:getfield        #80  <Field int MessageThreadUtil$SyncQueueItem.arg1>
		//   39  113:invokeinterface #85  <Method void ThreadUtil$BackgroundCallback.refresh(int)>
					break;

		//*  40  118:goto            0
				case 2: // '\002'
					mQueue.removeMessages(2);
		//   41  121:aload_0         
		//   42  122:getfield        #14  <Field MessageThreadUtil$2 this$1>
		//   43  125:getfield        #23  <Field MessageThreadUtil$MessageQueue MessageThreadUtil$2.mQueue>
		//   44  128:iconst_2        
		//   45  129:invokevirtual   #73  <Method void MessageThreadUtil$MessageQueue.removeMessages(int)>
					mQueue.removeMessages(3);
		//   46  132:aload_0         
		//   47  133:getfield        #14  <Field MessageThreadUtil$2 this$1>
		//   48  136:getfield        #23  <Field MessageThreadUtil$MessageQueue MessageThreadUtil$2.mQueue>
		//   49  139:iconst_3        
		//   50  140:invokevirtual   #73  <Method void MessageThreadUtil$MessageQueue.removeMessages(int)>
					callback.updateRange(syncqueueitem.arg1, syncqueueitem.arg2, syncqueueitem.arg3, syncqueueitem.arg4, syncqueueitem.arg5);
		//   51  143:aload_0         
		//   52  144:getfield        #14  <Field MessageThreadUtil$2 this$1>
		//   53  147:getfield        #77  <Field ThreadUtil$BackgroundCallback MessageThreadUtil$2.val$callback>
		//   54  150:aload_1         
		//   55  151:getfield        #80  <Field int MessageThreadUtil$SyncQueueItem.arg1>
		//   56  154:aload_1         
		//   57  155:getfield        #88  <Field int MessageThreadUtil$SyncQueueItem.arg2>
		//   58  158:aload_1         
		//   59  159:getfield        #91  <Field int MessageThreadUtil$SyncQueueItem.arg3>
		//   60  162:aload_1         
		//   61  163:getfield        #94  <Field int MessageThreadUtil$SyncQueueItem.arg4>
		//   62  166:aload_1         
		//   63  167:getfield        #97  <Field int MessageThreadUtil$SyncQueueItem.arg5>
		//   64  170:invokeinterface #101 <Method void ThreadUtil$BackgroundCallback.updateRange(int, int, int, int, int)>
					break;

		//*  65  175:goto            0
				case 3: // '\003'
					callback.loadTile(syncqueueitem.arg1, syncqueueitem.arg2);
		//   66  178:aload_0         
		//   67  179:getfield        #14  <Field MessageThreadUtil$2 this$1>
		//   68  182:getfield        #77  <Field ThreadUtil$BackgroundCallback MessageThreadUtil$2.val$callback>
		//   69  185:aload_1         
		//   70  186:getfield        #80  <Field int MessageThreadUtil$SyncQueueItem.arg1>
		//   71  189:aload_1         
		//   72  190:getfield        #88  <Field int MessageThreadUtil$SyncQueueItem.arg2>
		//   73  193:invokeinterface #105 <Method void ThreadUtil$BackgroundCallback.loadTile(int, int)>
					break;

		//*  74  198:goto            0
				case 4: // '\004'
					callback.recycleTile((TileList.Tile)syncqueueitem.data);
		//   75  201:aload_0         
		//   76  202:getfield        #14  <Field MessageThreadUtil$2 this$1>
		//   77  205:getfield        #77  <Field ThreadUtil$BackgroundCallback MessageThreadUtil$2.val$callback>
		//   78  208:aload_1         
		//   79  209:getfield        #109 <Field Object MessageThreadUtil$SyncQueueItem.data>
		//   80  212:checkcast       #111 <Class TileList$Tile>
		//   81  215:invokeinterface #115 <Method void ThreadUtil$BackgroundCallback.recycleTile(TileList$Tile)>
					break;
				}
			} while(true);
		//*  82  220:goto            0
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
