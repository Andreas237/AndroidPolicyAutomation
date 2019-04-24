// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

// Referenced classes of package android.support.v7.util:
//			MessageThreadUtil

class MessageThreadUtil$1
	implements dCallback
{

	private void sendMessage(ncQueueItem ncqueueitem)
	{
		mQueue.sendMessage(ncqueueitem);
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
		sendMessage(ncQueueItem.obtainMessage(2, i, ((Object) (tile))));
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
		sendMessage(ncQueueItem.obtainMessage(3, i, j));
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
		sendMessage(ncQueueItem.obtainMessage(1, i, j));
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
	final ssageQueue mQueue = new ssageQueue();
	final MessageThreadUtil this$0;
	final dCallback val$callback;

	MessageThreadUtil$1()
	{
		this$0 = final_messagethreadutil;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field MessageThreadUtil this$0>
		val$callback = dCallback.this;
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
		mMainThreadRunnable = new Runnable() {

			public void run()
			{
				for(MessageThreadUtil.SyncQueueItem syncqueueitem = mQueue.next(); syncqueueitem != null; syncqueueitem = mQueue.next())
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
			//			               1 47
			//			               2 70
			//			               3 96
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

			final MessageThreadUtil._cls1 this$1;

			
			{
				this$1 = MessageThreadUtil._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field MessageThreadUtil$1 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   19   39:aload_0         
	//   20   40:new             #14  <Class MessageThreadUtil$1$1>
	//   21   43:dup             
	//   22   44:aload_0         
	//   23   45:invokespecial   #61  <Method void MessageThreadUtil$1$1(MessageThreadUtil$1)>
	//   24   48:putfield        #63  <Field Runnable mMainThreadRunnable>
	//   25   51:return          
	}
}
