// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;

import android.os.AsyncTask;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package android.support.v7.util:
//			MessageThreadUtil

class MessageThreadUtil$2$1
	implements Runnable
{

	public void run()
	{
		do
		{
			QueueItem queueitem = mQueue.next();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field MessageThreadUtil$2 this$1>
	//    2    4:getfield        #23  <Field MessageThreadUtil$MessageQueue MessageThreadUtil$2.mQueue>
	//    3    7:invokevirtual   #29  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$MessageQueue.next()>
	//    4   10:astore_1        
			if(queueitem == null)
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
			switch(queueitem.what)
	//*  13   27:aload_1         
	//*  14   28:getfield        #45  <Field int MessageThreadUtil$SyncQueueItem.what>
			{
	//*  15   31:tableswitch     1 4: default 60
	//	               1 91
	//	               2 121
	//	               3 178
	//	               4 201
			default:
				Log.e("ThreadUtil", (new StringBuilder()).append("Unsupported message, what=").append(queueitem.what).toString());
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
				val$callback.refresh(queueitem.arg1);
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
				val$callback.updateRange(queueitem.arg1, queueitem.arg2, queueitem.arg3, queueitem.arg4, queueitem.arg5);
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
				val$callback.loadTile(queueitem.arg1, queueitem.arg2);
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
				val$callback.recycleTile((TileList.Tile)queueitem.data);
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

	final MessageThreadUtil._cls2 this$1;

	MessageThreadUtil$2$1()
	{
		this$1 = MessageThreadUtil._cls2.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field MessageThreadUtil$2 this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class android/support/v7/util/MessageThreadUtil$2

/* anonymous class */
	class MessageThreadUtil._cls2
		implements ThreadUtil.BackgroundCallback
	{

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

		private void sendMessage(MessageThreadUtil.SyncQueueItem syncqueueitem)
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

		private void sendMessageAtFrontOfQueue(MessageThreadUtil.SyncQueueItem syncqueueitem)
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
			sendMessage(MessageThreadUtil.SyncQueueItem.obtainMessage(3, i, j));
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
			sendMessage(MessageThreadUtil.SyncQueueItem.obtainMessage(4, 0, ((Object) (tile))));
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
			sendMessageAtFrontOfQueue(MessageThreadUtil.SyncQueueItem.obtainMessage(1, i, ((Object) (null))));
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
			sendMessageAtFrontOfQueue(MessageThreadUtil.SyncQueueItem.obtainMessage(2, i, j, k, l, i1, ((Object) (null))));
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
		final MessageThreadUtil.MessageQueue mQueue = new MessageThreadUtil.MessageQueue();
		final MessageThreadUtil this$0;
		final ThreadUtil.BackgroundCallback val$callback;

			
			{
				this$0 = final_messagethreadutil;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #39  <Field MessageThreadUtil this$0>
				callback = ThreadUtil.BackgroundCallback.this;
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
				mBackgroundRunnable = ((Runnable) (new MessageThreadUtil._cls2._cls1()));
			//   22   44:aload_0         
			//   23   45:new             #14  <Class MessageThreadUtil$2$1>
			//   24   48:dup             
			//   25   49:aload_0         
			//   26   50:invokespecial   #66  <Method void MessageThreadUtil$2$1(MessageThreadUtil$2)>
			//   27   53:putfield        #68  <Field Runnable mBackgroundRunnable>
			//   28   56:return          
			}
	}

}
