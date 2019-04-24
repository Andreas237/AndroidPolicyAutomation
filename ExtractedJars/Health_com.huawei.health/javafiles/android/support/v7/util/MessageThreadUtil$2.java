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

	private void sendMessage(ncQueueItem ncqueueitem)
	{
		mQueue.sendMessage(ncqueueitem);
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field MessageThreadUtil$MessageQueue mQueue>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #84  <Method void MessageThreadUtil$MessageQueue.sendMessage(MessageThreadUtil$SyncQueueItem)>
		maybeExecuteBackgroundRunnable();
	//    4    8:aload_0         
	//    5    9:invokespecial   #86  <Method void maybeExecuteBackgroundRunnable()>
	//    6   12:return          
	}

	private void sendMessageAtFrontOfQueue(ncQueueItem ncqueueitem)
	{
		mQueue.sendMessageAtFrontOfQueue(ncqueueitem);
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
		sendMessage(ncQueueItem.obtainMessage(3, i, j));
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
		sendMessage(ncQueueItem.obtainMessage(4, 0, ((Object) (tile))));
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
		sendMessageAtFrontOfQueue(ncQueueItem.obtainMessage(1, i, ((Object) (null))));
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
		sendMessageAtFrontOfQueue(ncQueueItem.obtainMessage(2, i, j, k, l, i1, ((Object) (null))));
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
	final ssageQueue mQueue = new ssageQueue();
	final MessageThreadUtil this$0;
	final dCallback val$callback;

	MessageThreadUtil$2()
	{
		this$0 = final_messagethreadutil;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field MessageThreadUtil this$0>
		val$callback = dCallback.this;
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
		mBackgroundRunnable = new Runnable() {

			public void run()
			{
				do
				{
					MessageThreadUtil.SyncQueueItem syncqueueitem = mQueue.next();
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
			//			               1 55
			//			               2 85
			//			               3 142
			//			               4 165
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

			final MessageThreadUtil._cls2 this$1;

			
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
		}
;
	//   22   44:aload_0         
	//   23   45:new             #14  <Class MessageThreadUtil$2$1>
	//   24   48:dup             
	//   25   49:aload_0         
	//   26   50:invokespecial   #66  <Method void MessageThreadUtil$2$1(MessageThreadUtil$2)>
	//   27   53:putfield        #68  <Field Runnable mBackgroundRunnable>
	//   28   56:return          
	}
}
