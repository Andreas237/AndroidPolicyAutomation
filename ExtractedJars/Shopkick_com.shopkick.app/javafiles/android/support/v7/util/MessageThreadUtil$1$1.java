// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

// Referenced classes of package android.support.v7.util:
//			MessageThreadUtil

class MessageThreadUtil$1$1
	implements Runnable
{

	public void run()
	{
		for(QueueItem queueitem = mQueue.next(); queueitem != null; queueitem = mQueue.next())
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field MessageThreadUtil$1 this$1>
	//*   2    4:getfield        #23  <Field MessageThreadUtil$MessageQueue MessageThreadUtil$1.mQueue>
	//*   3    7:invokevirtual   #29  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$MessageQueue.next()>
	//*   4   10:astore_1        
	//*   5   11:aload_1         
	//*   6   12:ifnull          164
			switch(queueitem.what)
	//*   7   15:aload_1         
	//*   8   16:getfield        #35  <Field int MessageThreadUtil$SyncQueueItem.what>
			{
	//*   9   19:tableswitch     1 3: default 44
	//	               1 130
	//	               2 104
	//	               3 81
			default:
				StringBuilder stringbuilder = new StringBuilder();
	//   10   44:new             #37  <Class StringBuilder>
	//   11   47:dup             
	//   12   48:invokespecial   #38  <Method void StringBuilder()>
	//   13   51:astore_2        
				stringbuilder.append("Unsupported message, what=");
	//   14   52:aload_2         
	//   15   53:ldc1            #40  <String "Unsupported message, what=">
	//   16   55:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   17   58:pop             
				stringbuilder.append(queueitem.what);
	//   18   59:aload_2         
	//   19   60:aload_1         
	//   20   61:getfield        #35  <Field int MessageThreadUtil$SyncQueueItem.what>
	//   21   64:invokevirtual   #47  <Method StringBuilder StringBuilder.append(int)>
	//   22   67:pop             
				Log.e("ThreadUtil", stringbuilder.toString());
	//   23   68:ldc1            #49  <String "ThreadUtil">
	//   24   70:aload_2         
	//   25   71:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   26   74:invokestatic    #59  <Method int Log.e(String, String)>
	//   27   77:pop             
				break;

	//*  28   78:goto            150
			case 3: // '\003'
				val$callback.removeTile(queueitem.arg1, queueitem.arg2);
	//   29   81:aload_0         
	//   30   82:getfield        #14  <Field MessageThreadUtil$1 this$1>
	//   31   85:getfield        #63  <Field ThreadUtil$MainThreadCallback MessageThreadUtil$1.val$callback>
	//   32   88:aload_1         
	//   33   89:getfield        #66  <Field int MessageThreadUtil$SyncQueueItem.arg1>
	//   34   92:aload_1         
	//   35   93:getfield        #69  <Field int MessageThreadUtil$SyncQueueItem.arg2>
	//   36   96:invokeinterface #75  <Method void ThreadUtil$MainThreadCallback.removeTile(int, int)>
				break;

	//*  37  101:goto            150
			case 2: // '\002'
				val$callback.addTile(queueitem.arg1, (TileList.Tile)queueitem.data);
	//   38  104:aload_0         
	//   39  105:getfield        #14  <Field MessageThreadUtil$1 this$1>
	//   40  108:getfield        #63  <Field ThreadUtil$MainThreadCallback MessageThreadUtil$1.val$callback>
	//   41  111:aload_1         
	//   42  112:getfield        #66  <Field int MessageThreadUtil$SyncQueueItem.arg1>
	//   43  115:aload_1         
	//   44  116:getfield        #79  <Field Object MessageThreadUtil$SyncQueueItem.data>
	//   45  119:checkcast       #81  <Class TileList$Tile>
	//   46  122:invokeinterface #85  <Method void ThreadUtil$MainThreadCallback.addTile(int, TileList$Tile)>
				break;

	//*  47  127:goto            150
			case 1: // '\001'
				val$callback.updateItemCount(queueitem.arg1, queueitem.arg2);
	//   48  130:aload_0         
	//   49  131:getfield        #14  <Field MessageThreadUtil$1 this$1>
	//   50  134:getfield        #63  <Field ThreadUtil$MainThreadCallback MessageThreadUtil$1.val$callback>
	//   51  137:aload_1         
	//   52  138:getfield        #66  <Field int MessageThreadUtil$SyncQueueItem.arg1>
	//   53  141:aload_1         
	//   54  142:getfield        #69  <Field int MessageThreadUtil$SyncQueueItem.arg2>
	//   55  145:invokeinterface #88  <Method void ThreadUtil$MainThreadCallback.updateItemCount(int, int)>
				break;
			}

	//   56  150:aload_0         
	//   57  151:getfield        #14  <Field MessageThreadUtil$1 this$1>
	//   58  154:getfield        #23  <Field MessageThreadUtil$MessageQueue MessageThreadUtil$1.mQueue>
	//   59  157:invokevirtual   #29  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$MessageQueue.next()>
	//   60  160:astore_1        
	//*  61  161:goto            11
	//   62  164:return          
	}

	final MessageThreadUtil._cls1 this$1;

	MessageThreadUtil$1$1()
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

	// Unreferenced inner class android/support/v7/util/MessageThreadUtil$1

/* anonymous class */
	class MessageThreadUtil._cls1
		implements ThreadUtil.MainThreadCallback
	{

		private void sendMessage(MessageThreadUtil.SyncQueueItem syncqueueitem)
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
			sendMessage(MessageThreadUtil.SyncQueueItem.obtainMessage(2, i, ((Object) (tile))));
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
			sendMessage(MessageThreadUtil.SyncQueueItem.obtainMessage(3, i, j));
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
			sendMessage(MessageThreadUtil.SyncQueueItem.obtainMessage(1, i, j));
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
		final MessageThreadUtil.MessageQueue mQueue = new MessageThreadUtil.MessageQueue();
		final MessageThreadUtil this$0;
		final ThreadUtil.MainThreadCallback val$callback;

			
			{
				this$0 = final_messagethreadutil;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #35  <Field MessageThreadUtil this$0>
				callback = ThreadUtil.MainThreadCallback.this;
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
				mMainThreadRunnable = ((Runnable) (new MessageThreadUtil._cls1._cls1()));
			//   19   39:aload_0         
			//   20   40:new             #14  <Class MessageThreadUtil$1$1>
			//   21   43:dup             
			//   22   44:aload_0         
			//   23   45:invokespecial   #61  <Method void MessageThreadUtil$1$1(MessageThreadUtil$1)>
			//   24   48:putfield        #63  <Field Runnable mMainThreadRunnable>
			//   25   51:return          
			}
	}

}
