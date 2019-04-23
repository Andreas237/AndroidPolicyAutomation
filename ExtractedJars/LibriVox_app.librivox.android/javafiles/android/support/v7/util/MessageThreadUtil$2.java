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

class MessageThreadUtil$2
	implements dCallback
{

	private void maybeExecuteBackgroundRunnable()
	{
		if(mBackgroundRunning.compareAndSet(false, true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field AtomicBoolean mBackgroundRunning>
	//*   2    4:iconst_0        
	//*   3    5:iconst_1        
	//*   4    6:invokevirtual   #68  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//*   5    9:ifeq            25
			mExecutor.execute(mBackgroundRunnable);
	//    6   12:aload_0         
	//    7   13:getfield        #48  <Field Executor mExecutor>
	//    8   16:aload_0         
	//    9   17:getfield        #62  <Field Runnable mBackgroundRunnable>
	//   10   20:invokeinterface #74  <Method void Executor.execute(Runnable)>
	//   11   25:return          
	}

	private void sendMessage(ncQueueItem ncqueueitem)
	{
		mQueue.sendMessage(ncqueueitem);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field MessageThreadUtil$MessageQueue mQueue>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #78  <Method void MessageThreadUtil$MessageQueue.sendMessage(MessageThreadUtil$SyncQueueItem)>
		maybeExecuteBackgroundRunnable();
	//    4    8:aload_0         
	//    5    9:invokespecial   #80  <Method void maybeExecuteBackgroundRunnable()>
	//    6   12:return          
	}

	private void sendMessageAtFrontOfQueue(ncQueueItem ncqueueitem)
	{
		mQueue.sendMessageAtFrontOfQueue(ncqueueitem);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field MessageThreadUtil$MessageQueue mQueue>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #83  <Method void MessageThreadUtil$MessageQueue.sendMessageAtFrontOfQueue(MessageThreadUtil$SyncQueueItem)>
		maybeExecuteBackgroundRunnable();
	//    4    8:aload_0         
	//    5    9:invokespecial   #80  <Method void maybeExecuteBackgroundRunnable()>
	//    6   12:return          
	}

	public void loadTile(int i, int j)
	{
		sendMessage(ncQueueItem.obtainMessage(3, i, j));
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:iload_1         
	//    3    3:iload_2         
	//    4    4:invokestatic    #91  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.obtainMessage(int, int, int)>
	//    5    7:invokespecial   #92  <Method void sendMessage(MessageThreadUtil$SyncQueueItem)>
	//    6   10:return          
	}

	public void recycleTile(TileList.Tile tile)
	{
		sendMessage(ncQueueItem.obtainMessage(4, 0, ((Object) (tile))));
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:invokestatic    #97  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.obtainMessage(int, int, Object)>
	//    5    7:invokespecial   #92  <Method void sendMessage(MessageThreadUtil$SyncQueueItem)>
	//    6   10:return          
	}

	public void refresh(int i)
	{
		sendMessageAtFrontOfQueue(ncQueueItem.obtainMessage(1, i, ((Object) (null))));
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iload_1         
	//    3    3:aconst_null     
	//    4    4:invokestatic    #97  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.obtainMessage(int, int, Object)>
	//    5    7:invokespecial   #100 <Method void sendMessageAtFrontOfQueue(MessageThreadUtil$SyncQueueItem)>
	//    6   10:return          
	}

	public void updateRange(int i, int j, int k, int l, int i1)
	{
		sendMessageAtFrontOfQueue(ncQueueItem.obtainMessage(2, i, j, k, l, i1, ((Object) (null))));
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:iload_1         
	//    3    3:iload_2         
	//    4    4:iload_3         
	//    5    5:iload           4
	//    6    7:iload           5
	//    7    9:aconst_null     
	//    8   10:invokestatic    #105 <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$SyncQueueItem.obtainMessage(int, int, int, int, int, int, Object)>
	//    9   13:invokespecial   #100 <Method void sendMessageAtFrontOfQueue(MessageThreadUtil$SyncQueueItem)>
	//   10   16:return          
	}

	static final int LOAD_TILE = 3;
	static final int RECYCLE_TILE = 4;
	static final int REFRESH = 1;
	static final int UPDATE_RANGE = 2;
	private Runnable mBackgroundRunnable;
	AtomicBoolean mBackgroundRunning;
	private final Executor mExecutor;
	final ssageQueue mQueue = new ssageQueue();
	final MessageThreadUtil this$0;
	final dCallback val$callback;

	MessageThreadUtil$2()
	{
		this$0 = final_messagethreadutil;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field MessageThreadUtil this$0>
		val$callback = dCallback.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #33  <Field ThreadUtil$BackgroundCallback val$callback>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #36  <Method void Object()>
	//    8   14:aload_0         
	//    9   15:new             #38  <Class MessageThreadUtil$MessageQueue>
	//   10   18:dup             
	//   11   19:invokespecial   #39  <Method void MessageThreadUtil$MessageQueue()>
	//   12   22:putfield        #41  <Field MessageThreadUtil$MessageQueue mQueue>
		mExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
	//   13   25:aload_0         
	//   14   26:getstatic       #46  <Field Executor AsyncTask.THREAD_POOL_EXECUTOR>
	//   15   29:putfield        #48  <Field Executor mExecutor>
		mBackgroundRunning = new AtomicBoolean(false);
	//   16   32:aload_0         
	//   17   33:new             #50  <Class AtomicBoolean>
	//   18   36:dup             
	//   19   37:iconst_0        
	//   20   38:invokespecial   #53  <Method void AtomicBoolean(boolean)>
	//   21   41:putfield        #55  <Field AtomicBoolean mBackgroundRunning>
		class _cls1
			implements Runnable
		{

			public void run()
			{
				do
				{
					MessageThreadUtil.SyncQueueItem syncqueueitem = mQueue.next();
			//    0    0:aload_0         
			//    1    1:getfield        #12  <Field MessageThreadUtil$2 this$1>
			//    2    4:getfield        #23  <Field MessageThreadUtil$MessageQueue MessageThreadUtil$2.mQueue>
			//    3    7:invokevirtual   #29  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$MessageQueue.next()>
			//    4   10:astore_1        
					if(syncqueueitem == null)
			//*   5   11:aload_1         
			//*   6   12:ifnonnull       27
					{
						mBackgroundRunning.set(false);
			//    7   15:aload_0         
			//    8   16:getfield        #12  <Field MessageThreadUtil$2 this$1>
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
			//			               1 199
			//			               2 142
			//			               3 119
			//			               4 97
					default:
						StringBuilder stringbuilder = new StringBuilder();
			//   16   60:new             #47  <Class StringBuilder>
			//   17   63:dup             
			//   18   64:invokespecial   #48  <Method void StringBuilder()>
			//   19   67:astore_2        
						stringbuilder.append("Unsupported message, what=");
			//   20   68:aload_2         
			//   21   69:ldc1            #50  <String "Unsupported message, what=">
			//   22   71:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
			//   23   74:pop             
						stringbuilder.append(syncqueueitem.what);
			//   24   75:aload_2         
			//   25   76:aload_1         
			//   26   77:getfield        #45  <Field int MessageThreadUtil$SyncQueueItem.what>
			//   27   80:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
			//   28   83:pop             
						Log.e("ThreadUtil", stringbuilder.toString());
			//   29   84:ldc1            #59  <String "ThreadUtil">
			//   30   86:aload_2         
			//   31   87:invokevirtual   #63  <Method String StringBuilder.toString()>
			//   32   90:invokestatic    #69  <Method int Log.e(String, String)>
			//   33   93:pop             
						break;

			//*  34   94:goto            0
					case 4: // '\004'
						callback.recycleTile((TileList.Tile)syncqueueitem.data);
			//   35   97:aload_0         
			//   36   98:getfield        #12  <Field MessageThreadUtil$2 this$1>
			//   37  101:getfield        #73  <Field ThreadUtil$BackgroundCallback MessageThreadUtil$2.val$callback>
			//   38  104:aload_1         
			//   39  105:getfield        #77  <Field Object MessageThreadUtil$SyncQueueItem.data>
			//   40  108:checkcast       #79  <Class TileList$Tile>
			//   41  111:invokeinterface #85  <Method void ThreadUtil$BackgroundCallback.recycleTile(TileList$Tile)>
						break;

			//*  42  116:goto            0
					case 3: // '\003'
						callback.loadTile(syncqueueitem.arg1, syncqueueitem.arg2);
			//   43  119:aload_0         
			//   44  120:getfield        #12  <Field MessageThreadUtil$2 this$1>
			//   45  123:getfield        #73  <Field ThreadUtil$BackgroundCallback MessageThreadUtil$2.val$callback>
			//   46  126:aload_1         
			//   47  127:getfield        #88  <Field int MessageThreadUtil$SyncQueueItem.arg1>
			//   48  130:aload_1         
			//   49  131:getfield        #91  <Field int MessageThreadUtil$SyncQueueItem.arg2>
			//   50  134:invokeinterface #95  <Method void ThreadUtil$BackgroundCallback.loadTile(int, int)>
						break;

			//*  51  139:goto            0
					case 2: // '\002'
						mQueue.removeMessages(2);
			//   52  142:aload_0         
			//   53  143:getfield        #12  <Field MessageThreadUtil$2 this$1>
			//   54  146:getfield        #23  <Field MessageThreadUtil$MessageQueue MessageThreadUtil$2.mQueue>
			//   55  149:iconst_2        
			//   56  150:invokevirtual   #99  <Method void MessageThreadUtil$MessageQueue.removeMessages(int)>
						mQueue.removeMessages(3);
			//   57  153:aload_0         
			//   58  154:getfield        #12  <Field MessageThreadUtil$2 this$1>
			//   59  157:getfield        #23  <Field MessageThreadUtil$MessageQueue MessageThreadUtil$2.mQueue>
			//   60  160:iconst_3        
			//   61  161:invokevirtual   #99  <Method void MessageThreadUtil$MessageQueue.removeMessages(int)>
						callback.updateRange(syncqueueitem.arg1, syncqueueitem.arg2, syncqueueitem.arg3, syncqueueitem.arg4, syncqueueitem.arg5);
			//   62  164:aload_0         
			//   63  165:getfield        #12  <Field MessageThreadUtil$2 this$1>
			//   64  168:getfield        #73  <Field ThreadUtil$BackgroundCallback MessageThreadUtil$2.val$callback>
			//   65  171:aload_1         
			//   66  172:getfield        #88  <Field int MessageThreadUtil$SyncQueueItem.arg1>
			//   67  175:aload_1         
			//   68  176:getfield        #91  <Field int MessageThreadUtil$SyncQueueItem.arg2>
			//   69  179:aload_1         
			//   70  180:getfield        #102 <Field int MessageThreadUtil$SyncQueueItem.arg3>
			//   71  183:aload_1         
			//   72  184:getfield        #105 <Field int MessageThreadUtil$SyncQueueItem.arg4>
			//   73  187:aload_1         
			//   74  188:getfield        #108 <Field int MessageThreadUtil$SyncQueueItem.arg5>
			//   75  191:invokeinterface #112 <Method void ThreadUtil$BackgroundCallback.updateRange(int, int, int, int, int)>
						break;

			//*  76  196:goto            0
					case 1: // '\001'
						mQueue.removeMessages(1);
			//   77  199:aload_0         
			//   78  200:getfield        #12  <Field MessageThreadUtil$2 this$1>
			//   79  203:getfield        #23  <Field MessageThreadUtil$MessageQueue MessageThreadUtil$2.mQueue>
			//   80  206:iconst_1        
			//   81  207:invokevirtual   #99  <Method void MessageThreadUtil$MessageQueue.removeMessages(int)>
						callback.refresh(syncqueueitem.arg1);
			//   82  210:aload_0         
			//   83  211:getfield        #12  <Field MessageThreadUtil$2 this$1>
			//   84  214:getfield        #73  <Field ThreadUtil$BackgroundCallback MessageThreadUtil$2.val$callback>
			//   85  217:aload_1         
			//   86  218:getfield        #88  <Field int MessageThreadUtil$SyncQueueItem.arg1>
			//   87  221:invokeinterface #115 <Method void ThreadUtil$BackgroundCallback.refresh(int)>
						break;
					}
				} while(true);
			//*  88  226:goto            0
			}

			final MessageThreadUtil._cls2 this$1;

			_cls1()
			{
				this$1 = MessageThreadUtil._cls2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field MessageThreadUtil$2 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void Object()>
			//    5    9:return          
			}
		}

		mBackgroundRunnable = ((Runnable) (new _cls1()));
	//   22   44:aload_0         
	//   23   45:new             #57  <Class MessageThreadUtil$2$1>
	//   24   48:dup             
	//   25   49:aload_0         
	//   26   50:invokespecial   #60  <Method void MessageThreadUtil$2$1(MessageThreadUtil$2)>
	//   27   53:putfield        #62  <Field Runnable mBackgroundRunnable>
	//   28   56:return          
	}
}
