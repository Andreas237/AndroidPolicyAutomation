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
		QueueItem queueitem = mQueue.next();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field MessageThreadUtil$1 this$1>
	//    2    4:getfield        #23  <Field MessageThreadUtil$MessageQueue MessageThreadUtil$1.mQueue>
	//    3    7:invokevirtual   #29  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$MessageQueue.next()>
	//    4   10:astore_1        
_L6:
		if(queueitem == null)
			break MISSING_BLOCK_LABEL_158;
	//    5   11:aload_1         
	//    6   12:ifnull          158
		queueitem.what;
	//    7   15:aload_1         
	//    8   16:getfield        #35  <Field int MessageThreadUtil$SyncQueueItem.what>
		JVM INSTR tableswitch 1 3: default 44
	//	               1 86
	//	               2 109
	//	               3 135;
	//    9   19:tableswitch     1 3: default 44
	//	               1 86
	//	               2 109
	//	               3 135
		   goto _L1 _L2 _L3 _L4
_L4:
		break MISSING_BLOCK_LABEL_135;
_L2:
		break; /* Loop/switch isn't completed */
_L1:
		Log.e("ThreadUtil", (new StringBuilder()).append("Unsupported message, what=").append(queueitem.what).toString());
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
		queueitem = mQueue.next();
	//   22   72:aload_0         
	//   23   73:getfield        #14  <Field MessageThreadUtil$1 this$1>
	//   24   76:getfield        #23  <Field MessageThreadUtil$MessageQueue MessageThreadUtil$1.mQueue>
	//   25   79:invokevirtual   #29  <Method MessageThreadUtil$SyncQueueItem MessageThreadUtil$MessageQueue.next()>
	//   26   82:astore_1        
		if(true) goto _L6; else goto _L5
	//   27   83:goto            11
_L5:
		val$callback.updateItemCount(queueitem.arg1, queueitem.arg2);
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
		val$callback.addTile(queueitem.arg1, (TileList.Tile)queueitem.data);
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
		val$callback.removeTile(queueitem.arg1, queueitem.arg2);
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
