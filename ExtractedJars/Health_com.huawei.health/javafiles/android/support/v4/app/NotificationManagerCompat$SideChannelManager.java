// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.*;
import android.content.pm.*;
import android.os.*;
import android.util.Log;
import java.util.*;

// Referenced classes of package android.support.v4.app:
//			NotificationManagerCompat, INotificationSideChannel

static class NotificationManagerCompat$SideChannelManager
	implements android.os.Handler.Callback, ServiceConnection
{
	static class ListenerRecord
	{

		public boolean bound;
		public final ComponentName componentName;
		public int retryCount;
		public INotificationSideChannel service;
		public LinkedList taskQueue;

		public ListenerRecord(ComponentName componentname)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			bound = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #28  <Field boolean bound>
			taskQueue = new LinkedList();
		//    5    9:aload_0         
		//    6   10:new             #30  <Class LinkedList>
		//    7   13:dup             
		//    8   14:invokespecial   #31  <Method void LinkedList()>
		//    9   17:putfield        #33  <Field LinkedList taskQueue>
			retryCount = 0;
		//   10   20:aload_0         
		//   11   21:iconst_0        
		//   12   22:putfield        #35  <Field int retryCount>
			componentName = componentname;
		//   13   25:aload_0         
		//   14   26:aload_1         
		//   15   27:putfield        #37  <Field ComponentName componentName>
		//   16   30:return          
		}
	}


	private boolean ensureServiceBound(ListenerRecord listenerrecord)
	{
		if(listenerrecord.bound)
	//*   0    0:aload_1         
	//*   1    1:getfield        #82  <Field boolean NotificationManagerCompat$SideChannelManager$ListenerRecord.bound>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		Intent intent = (new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL")).setComponent(listenerrecord.componentName);
	//    5    9:new             #84  <Class Intent>
	//    6   12:dup             
	//    7   13:ldc1            #86  <String "android.support.BIND_NOTIFICATION_SIDE_CHANNEL">
	//    8   15:invokespecial   #87  <Method void Intent(String)>
	//    9   18:aload_1         
	//   10   19:getfield        #91  <Field ComponentName NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName>
	//   11   22:invokevirtual   #95  <Method Intent Intent.setComponent(ComponentName)>
	//   12   25:astore_2        
		listenerrecord.bound = mContext.bindService(intent, ((ServiceConnection) (this)), 33);
	//   13   26:aload_1         
	//   14   27:aload_0         
	//   15   28:getfield        #52  <Field Context mContext>
	//   16   31:aload_2         
	//   17   32:aload_0         
	//   18   33:bipush          33
	//   19   35:invokevirtual   #101 <Method boolean Context.bindService(Intent, ServiceConnection, int)>
	//   20   38:putfield        #82  <Field boolean NotificationManagerCompat$SideChannelManager$ListenerRecord.bound>
		if(listenerrecord.bound)
	//*  21   41:aload_1         
	//*  22   42:getfield        #82  <Field boolean NotificationManagerCompat$SideChannelManager$ListenerRecord.bound>
	//*  23   45:ifeq            56
		{
			listenerrecord.retryCount = 0;
	//   24   48:aload_1         
	//   25   49:iconst_0        
	//   26   50:putfield        #104 <Field int NotificationManagerCompat$SideChannelManager$ListenerRecord.retryCount>
		} else
	//*  27   53:goto            92
		{
			Log.w("NotifManCompat", (new StringBuilder()).append("Unable to bind to listener ").append(((Object) (listenerrecord.componentName))).toString());
	//   28   56:ldc1            #106 <String "NotifManCompat">
	//   29   58:new             #108 <Class StringBuilder>
	//   30   61:dup             
	//   31   62:invokespecial   #109 <Method void StringBuilder()>
	//   32   65:ldc1            #111 <String "Unable to bind to listener ">
	//   33   67:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   34   70:aload_1         
	//   35   71:getfield        #91  <Field ComponentName NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName>
	//   36   74:invokevirtual   #118 <Method StringBuilder StringBuilder.append(Object)>
	//   37   77:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   38   80:invokestatic    #128 <Method int Log.w(String, String)>
	//   39   83:pop             
			mContext.unbindService(((ServiceConnection) (this)));
	//   40   84:aload_0         
	//   41   85:getfield        #52  <Field Context mContext>
	//   42   88:aload_0         
	//   43   89:invokevirtual   #132 <Method void Context.unbindService(ServiceConnection)>
		}
		return listenerrecord.bound;
	//   44   92:aload_1         
	//   45   93:getfield        #82  <Field boolean NotificationManagerCompat$SideChannelManager$ListenerRecord.bound>
	//   46   96:ireturn         
	}

	private void ensureServiceUnbound(ListenerRecord listenerrecord)
	{
		if(listenerrecord.bound)
	//*   0    0:aload_1         
	//*   1    1:getfield        #82  <Field boolean NotificationManagerCompat$SideChannelManager$ListenerRecord.bound>
	//*   2    4:ifeq            20
		{
			mContext.unbindService(((ServiceConnection) (this)));
	//    3    7:aload_0         
	//    4    8:getfield        #52  <Field Context mContext>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #132 <Method void Context.unbindService(ServiceConnection)>
			listenerrecord.bound = false;
	//    7   15:aload_1         
	//    8   16:iconst_0        
	//    9   17:putfield        #82  <Field boolean NotificationManagerCompat$SideChannelManager$ListenerRecord.bound>
		}
		listenerrecord.service = null;
	//   10   20:aload_1         
	//   11   21:aconst_null     
	//   12   22:putfield        #138 <Field INotificationSideChannel NotificationManagerCompat$SideChannelManager$ListenerRecord.service>
	//   13   25:return          
	}

	private void handleQueueTask(NotificationManagerCompat.Task task)
	{
		updateListenerMap();
	//    0    0:aload_0         
	//    1    1:invokespecial   #143 <Method void updateListenerMap()>
		ListenerRecord listenerrecord;
		for(Iterator iterator = mRecordMap.values().iterator(); iterator.hasNext(); processListenerQueue(listenerrecord))
	//*   2    4:aload_0         
	//*   3    5:getfield        #45  <Field Map mRecordMap>
	//*   4    8:invokeinterface #149 <Method Collection Map.values()>
	//*   5   13:invokeinterface #155 <Method Iterator Collection.iterator()>
	//*   6   18:astore_2        
	//*   7   19:aload_2         
	//*   8   20:invokeinterface #161 <Method boolean Iterator.hasNext()>
	//*   9   25:ifeq            55
		{
			listenerrecord = (ListenerRecord)iterator.next();
	//   10   28:aload_2         
	//   11   29:invokeinterface #165 <Method Object Iterator.next()>
	//   12   34:checkcast       #13  <Class NotificationManagerCompat$SideChannelManager$ListenerRecord>
	//   13   37:astore_3        
			listenerrecord.taskQueue.add(((Object) (task)));
	//   14   38:aload_3         
	//   15   39:getfield        #169 <Field LinkedList NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
	//   16   42:aload_1         
	//   17   43:invokevirtual   #175 <Method boolean LinkedList.add(Object)>
	//   18   46:pop             
		}

	//   19   47:aload_0         
	//   20   48:aload_3         
	//   21   49:invokespecial   #178 <Method void processListenerQueue(NotificationManagerCompat$SideChannelManager$ListenerRecord)>
	//*  22   52:goto            19
	//   23   55:return          
	}

	private void handleRetryListenerQueue(ComponentName componentname)
	{
		componentname = ((ComponentName) ((ListenerRecord)mRecordMap.get(((Object) (componentname)))));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Map mRecordMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #184 <Method Object Map.get(Object)>
	//    4   10:checkcast       #13  <Class NotificationManagerCompat$SideChannelManager$ListenerRecord>
	//    5   13:astore_1        
		if(componentname != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          23
			processListenerQueue(((ListenerRecord) (componentname)));
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokespecial   #178 <Method void processListenerQueue(NotificationManagerCompat$SideChannelManager$ListenerRecord)>
	//   11   23:return          
	}

	private void handleServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		componentname = ((ComponentName) ((ListenerRecord)mRecordMap.get(((Object) (componentname)))));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Map mRecordMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #184 <Method Object Map.get(Object)>
	//    4   10:checkcast       #13  <Class NotificationManagerCompat$SideChannelManager$ListenerRecord>
	//    5   13:astore_1        
		if(componentname != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          36
		{
			componentname.service = INotificationSideChannel.Stub.asInterface(ibinder);
	//    8   18:aload_1         
	//    9   19:aload_2         
	//   10   20:invokestatic    #192 <Method INotificationSideChannel INotificationSideChannel$Stub.asInterface(IBinder)>
	//   11   23:putfield        #138 <Field INotificationSideChannel NotificationManagerCompat$SideChannelManager$ListenerRecord.service>
			componentname.retryCount = 0;
	//   12   26:aload_1         
	//   13   27:iconst_0        
	//   14   28:putfield        #104 <Field int NotificationManagerCompat$SideChannelManager$ListenerRecord.retryCount>
			processListenerQueue(((ListenerRecord) (componentname)));
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokespecial   #178 <Method void processListenerQueue(NotificationManagerCompat$SideChannelManager$ListenerRecord)>
		}
	//   18   36:return          
	}

	private void handleServiceDisconnected(ComponentName componentname)
	{
		componentname = ((ComponentName) ((ListenerRecord)mRecordMap.get(((Object) (componentname)))));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Map mRecordMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #184 <Method Object Map.get(Object)>
	//    4   10:checkcast       #13  <Class NotificationManagerCompat$SideChannelManager$ListenerRecord>
	//    5   13:astore_1        
		if(componentname != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          23
			ensureServiceUnbound(((ListenerRecord) (componentname)));
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokespecial   #195 <Method void ensureServiceUnbound(NotificationManagerCompat$SideChannelManager$ListenerRecord)>
	//   11   23:return          
	}

	private void processListenerQueue(ListenerRecord listenerrecord)
	{
		if(Log.isLoggable("NotifManCompat", 3))
	//*   0    0:ldc1            #106 <String "NotifManCompat">
	//*   1    2:iconst_3        
	//*   2    3:invokestatic    #203 <Method boolean Log.isLoggable(String, int)>
	//*   3    6:ifeq            57
			Log.d("NotifManCompat", (new StringBuilder()).append("Processing component ").append(((Object) (listenerrecord.componentName))).append(", ").append(listenerrecord.taskQueue.size()).append(" queued tasks").toString());
	//    4    9:ldc1            #106 <String "NotifManCompat">
	//    5   11:new             #108 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #109 <Method void StringBuilder()>
	//    8   18:ldc1            #205 <String "Processing component ">
	//    9   20:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   10   23:aload_1         
	//   11   24:getfield        #91  <Field ComponentName NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName>
	//   12   27:invokevirtual   #118 <Method StringBuilder StringBuilder.append(Object)>
	//   13   30:ldc1            #207 <String ", ">
	//   14   32:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:aload_1         
	//   16   36:getfield        #169 <Field LinkedList NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
	//   17   39:invokevirtual   #211 <Method int LinkedList.size()>
	//   18   42:invokevirtual   #214 <Method StringBuilder StringBuilder.append(int)>
	//   19   45:ldc1            #216 <String " queued tasks">
	//   20   47:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   21   50:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   22   53:invokestatic    #219 <Method int Log.d(String, String)>
	//   23   56:pop             
		if(listenerrecord.taskQueue.isEmpty())
	//*  24   57:aload_1         
	//*  25   58:getfield        #169 <Field LinkedList NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
	//*  26   61:invokevirtual   #222 <Method boolean LinkedList.isEmpty()>
	//*  27   64:ifeq            68
			return;
	//   28   67:return          
		if(!ensureServiceBound(listenerrecord) || listenerrecord.service == null)
	//*  29   68:aload_0         
	//*  30   69:aload_1         
	//*  31   70:invokespecial   #224 <Method boolean ensureServiceBound(NotificationManagerCompat$SideChannelManager$ListenerRecord)>
	//*  32   73:ifeq            83
	//*  33   76:aload_1         
	//*  34   77:getfield        #138 <Field INotificationSideChannel NotificationManagerCompat$SideChannelManager$ListenerRecord.service>
	//*  35   80:ifnonnull       89
		{
			scheduleListenerRetry(listenerrecord);
	//   36   83:aload_0         
	//   37   84:aload_1         
	//   38   85:invokespecial   #227 <Method void scheduleListenerRetry(NotificationManagerCompat$SideChannelManager$ListenerRecord)>
			return;
	//   39   88:return          
		}
_L2:
		NotificationManagerCompat.Task task;
		task = (NotificationManagerCompat.Task)listenerrecord.taskQueue.peek();
	//   40   89:aload_1         
	//   41   90:getfield        #169 <Field LinkedList NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
	//   42   93:invokevirtual   #230 <Method Object LinkedList.peek()>
	//   43   96:checkcast       #232 <Class NotificationManagerCompat$Task>
	//   44   99:astore_2        
		if(task == null)
	//*  45  100:aload_2         
	//*  46  101:ifnonnull       107
			break; /* Loop/switch isn't completed */
	//   47  104:goto            239
		if(Log.isLoggable("NotifManCompat", 3))
	//*  48  107:ldc1            #106 <String "NotifManCompat">
	//*  49  109:iconst_3        
	//*  50  110:invokestatic    #203 <Method boolean Log.isLoggable(String, int)>
	//*  51  113:ifeq            141
			Log.d("NotifManCompat", (new StringBuilder()).append("Sending task ").append(((Object) (task))).toString());
	//   52  116:ldc1            #106 <String "NotifManCompat">
	//   53  118:new             #108 <Class StringBuilder>
	//   54  121:dup             
	//   55  122:invokespecial   #109 <Method void StringBuilder()>
	//   56  125:ldc1            #234 <String "Sending task ">
	//   57  127:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   58  130:aload_2         
	//   59  131:invokevirtual   #118 <Method StringBuilder StringBuilder.append(Object)>
	//   60  134:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   61  137:invokestatic    #219 <Method int Log.d(String, String)>
	//   62  140:pop             
		task.send(listenerrecord.service);
	//   63  141:aload_2         
	//   64  142:aload_1         
	//   65  143:getfield        #138 <Field INotificationSideChannel NotificationManagerCompat$SideChannelManager$ListenerRecord.service>
	//   66  146:invokeinterface #238 <Method void NotificationManagerCompat$Task.send(INotificationSideChannel)>
		listenerrecord.taskQueue.remove();
	//   67  151:aload_1         
	//   68  152:getfield        #169 <Field LinkedList NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
	//   69  155:invokevirtual   #241 <Method Object LinkedList.remove()>
	//   70  158:pop             
		if(true) goto _L2; else goto _L1
	//   71  159:goto            236
		Object obj;
		obj;
	//   72  162:astore_2        
		if(Log.isLoggable("NotifManCompat", 3))
	//*  73  163:ldc1            #106 <String "NotifManCompat">
	//*  74  165:iconst_3        
	//*  75  166:invokestatic    #203 <Method boolean Log.isLoggable(String, int)>
	//*  76  169:ifeq            200
			Log.d("NotifManCompat", (new StringBuilder()).append("Remote service has died: ").append(((Object) (listenerrecord.componentName))).toString());
	//   77  172:ldc1            #106 <String "NotifManCompat">
	//   78  174:new             #108 <Class StringBuilder>
	//   79  177:dup             
	//   80  178:invokespecial   #109 <Method void StringBuilder()>
	//   81  181:ldc1            #243 <String "Remote service has died: ">
	//   82  183:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   83  186:aload_1         
	//   84  187:getfield        #91  <Field ComponentName NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName>
	//   85  190:invokevirtual   #118 <Method StringBuilder StringBuilder.append(Object)>
	//   86  193:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   87  196:invokestatic    #219 <Method int Log.d(String, String)>
	//   88  199:pop             
		  goto _L1
	//*  89  200:goto            239
		obj;
	//   90  203:astore_2        
		Log.w("NotifManCompat", (new StringBuilder()).append("RemoteException communicating with ").append(((Object) (listenerrecord.componentName))).toString(), ((Throwable) (obj)));
	//   91  204:ldc1            #106 <String "NotifManCompat">
	//   92  206:new             #108 <Class StringBuilder>
	//   93  209:dup             
	//   94  210:invokespecial   #109 <Method void StringBuilder()>
	//   95  213:ldc1            #245 <String "RemoteException communicating with ">
	//   96  215:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   97  218:aload_1         
	//   98  219:getfield        #91  <Field ComponentName NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName>
	//   99  222:invokevirtual   #118 <Method StringBuilder StringBuilder.append(Object)>
	//  100  225:invokevirtual   #122 <Method String StringBuilder.toString()>
	//  101  228:aload_2         
	//  102  229:invokestatic    #248 <Method int Log.w(String, String, Throwable)>
	//  103  232:pop             
	//* 104  233:goto            239
	//* 105  236:goto            89
_L1:
		if(!listenerrecord.taskQueue.isEmpty())
	//* 106  239:aload_1         
	//* 107  240:getfield        #169 <Field LinkedList NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
	//* 108  243:invokevirtual   #222 <Method boolean LinkedList.isEmpty()>
	//* 109  246:ifne            254
			scheduleListenerRetry(listenerrecord);
	//  110  249:aload_0         
	//  111  250:aload_1         
	//  112  251:invokespecial   #227 <Method void scheduleListenerRetry(NotificationManagerCompat$SideChannelManager$ListenerRecord)>
		return;
	//  113  254:return          
	}

	private void scheduleListenerRetry(ListenerRecord listenerrecord)
	{
		if(mHandler.hasMessages(3, ((Object) (listenerrecord.componentName))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field Handler mHandler>
	//*   2    4:iconst_3        
	//*   3    5:aload_1         
	//*   4    6:getfield        #91  <Field ComponentName NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName>
	//*   5    9:invokevirtual   #252 <Method boolean Handler.hasMessages(int, Object)>
	//*   6   12:ifeq            16
			return;
	//    7   15:return          
		listenerrecord.retryCount = listenerrecord.retryCount + 1;
	//    8   16:aload_1         
	//    9   17:aload_1         
	//   10   18:getfield        #104 <Field int NotificationManagerCompat$SideChannelManager$ListenerRecord.retryCount>
	//   11   21:iconst_1        
	//   12   22:iadd            
	//   13   23:putfield        #104 <Field int NotificationManagerCompat$SideChannelManager$ListenerRecord.retryCount>
		if(listenerrecord.retryCount > 6)
	//*  14   26:aload_1         
	//*  15   27:getfield        #104 <Field int NotificationManagerCompat$SideChannelManager$ListenerRecord.retryCount>
	//*  16   30:bipush          6
	//*  17   32:icmple          106
		{
			Log.w("NotifManCompat", (new StringBuilder()).append("Giving up on delivering ").append(listenerrecord.taskQueue.size()).append(" tasks to ").append(((Object) (listenerrecord.componentName))).append(" after ").append(listenerrecord.retryCount).append(" retries").toString());
	//   18   35:ldc1            #106 <String "NotifManCompat">
	//   19   37:new             #108 <Class StringBuilder>
	//   20   40:dup             
	//   21   41:invokespecial   #109 <Method void StringBuilder()>
	//   22   44:ldc1            #254 <String "Giving up on delivering ">
	//   23   46:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   24   49:aload_1         
	//   25   50:getfield        #169 <Field LinkedList NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
	//   26   53:invokevirtual   #211 <Method int LinkedList.size()>
	//   27   56:invokevirtual   #214 <Method StringBuilder StringBuilder.append(int)>
	//   28   59:ldc2            #256 <String " tasks to ">
	//   29   62:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   30   65:aload_1         
	//   31   66:getfield        #91  <Field ComponentName NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName>
	//   32   69:invokevirtual   #118 <Method StringBuilder StringBuilder.append(Object)>
	//   33   72:ldc2            #258 <String " after ">
	//   34   75:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   35   78:aload_1         
	//   36   79:getfield        #104 <Field int NotificationManagerCompat$SideChannelManager$ListenerRecord.retryCount>
	//   37   82:invokevirtual   #214 <Method StringBuilder StringBuilder.append(int)>
	//   38   85:ldc2            #260 <String " retries">
	//   39   88:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   40   91:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   41   94:invokestatic    #128 <Method int Log.w(String, String)>
	//   42   97:pop             
			listenerrecord.taskQueue.clear();
	//   43   98:aload_1         
	//   44   99:getfield        #169 <Field LinkedList NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
	//   45  102:invokevirtual   #263 <Method void LinkedList.clear()>
			return;
	//   46  105:return          
		}
		int i = (1 << listenerrecord.retryCount - 1) * 1000;
	//   47  106:iconst_1        
	//   48  107:aload_1         
	//   49  108:getfield        #104 <Field int NotificationManagerCompat$SideChannelManager$ListenerRecord.retryCount>
	//   50  111:iconst_1        
	//   51  112:isub            
	//   52  113:ishl            
	//   53  114:sipush          1000
	//   54  117:imul            
	//   55  118:istore_2        
		if(Log.isLoggable("NotifManCompat", 3))
	//*  56  119:ldc1            #106 <String "NotifManCompat">
	//*  57  121:iconst_3        
	//*  58  122:invokestatic    #203 <Method boolean Log.isLoggable(String, int)>
	//*  59  125:ifeq            160
			Log.d("NotifManCompat", (new StringBuilder()).append("Scheduling retry for ").append(i).append(" ms").toString());
	//   60  128:ldc1            #106 <String "NotifManCompat">
	//   61  130:new             #108 <Class StringBuilder>
	//   62  133:dup             
	//   63  134:invokespecial   #109 <Method void StringBuilder()>
	//   64  137:ldc2            #265 <String "Scheduling retry for ">
	//   65  140:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   66  143:iload_2         
	//   67  144:invokevirtual   #214 <Method StringBuilder StringBuilder.append(int)>
	//   68  147:ldc2            #267 <String " ms">
	//   69  150:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   70  153:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   71  156:invokestatic    #219 <Method int Log.d(String, String)>
	//   72  159:pop             
		listenerrecord = ((ListenerRecord) (mHandler.obtainMessage(3, ((Object) (listenerrecord.componentName)))));
	//   73  160:aload_0         
	//   74  161:getfield        #75  <Field Handler mHandler>
	//   75  164:iconst_3        
	//   76  165:aload_1         
	//   77  166:getfield        #91  <Field ComponentName NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName>
	//   78  169:invokevirtual   #271 <Method Message Handler.obtainMessage(int, Object)>
	//   79  172:astore_1        
		mHandler.sendMessageDelayed(((Message) (listenerrecord)), i);
	//   80  173:aload_0         
	//   81  174:getfield        #75  <Field Handler mHandler>
	//   82  177:aload_1         
	//   83  178:iload_2         
	//   84  179:i2l             
	//   85  180:invokevirtual   #275 <Method boolean Handler.sendMessageDelayed(Message, long)>
	//   86  183:pop             
	//   87  184:return          
	}

	private void updateListenerMap()
	{
		Object obj = ((Object) (NotificationManagerCompat.getEnabledListenerPackages(mContext)));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Context mContext>
	//    2    4:invokestatic    #279 <Method Set NotificationManagerCompat.getEnabledListenerPackages(Context)>
	//    3    7:astore_2        
		if(((Set) (obj)).equals(((Object) (mCachedEnabledPackages))))
	//*   4    8:aload_2         
	//*   5    9:aload_0         
	//*   6   10:getfield        #50  <Field Set mCachedEnabledPackages>
	//*   7   13:invokeinterface #284 <Method boolean Set.equals(Object)>
	//*   8   18:ifeq            22
			return;
	//    9   21:return          
		mCachedEnabledPackages = ((Set) (obj));
	//   10   22:aload_0         
	//   11   23:aload_2         
	//   12   24:putfield        #50  <Field Set mCachedEnabledPackages>
		Object obj1 = ((Object) (mContext.getPackageManager().queryIntentServices((new Intent()).setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 4)));
	//   13   27:aload_0         
	//   14   28:getfield        #52  <Field Context mContext>
	//   15   31:invokevirtual   #288 <Method PackageManager Context.getPackageManager()>
	//   16   34:new             #84  <Class Intent>
	//   17   37:dup             
	//   18   38:invokespecial   #289 <Method void Intent()>
	//   19   41:ldc1            #86  <String "android.support.BIND_NOTIFICATION_SIDE_CHANNEL">
	//   20   43:invokevirtual   #293 <Method Intent Intent.setAction(String)>
	//   21   46:iconst_4        
	//   22   47:invokevirtual   #299 <Method List PackageManager.queryIntentServices(Intent, int)>
	//   23   50:astore_3        
		HashSet hashset = new HashSet();
	//   24   51:new             #47  <Class HashSet>
	//   25   54:dup             
	//   26   55:invokespecial   #48  <Method void HashSet()>
	//   27   58:astore_1        
		obj1 = ((Object) (((List) (obj1)).iterator()));
	//   28   59:aload_3         
	//   29   60:invokeinterface #302 <Method Iterator List.iterator()>
	//   30   65:astore_3        
		do
		{
			if(!((Iterator) (obj1)).hasNext())
				break;
	//   31   66:aload_3         
	//   32   67:invokeinterface #161 <Method boolean Iterator.hasNext()>
	//   33   72:ifeq            190
			ResolveInfo resolveinfo = (ResolveInfo)((Iterator) (obj1)).next();
	//   34   75:aload_3         
	//   35   76:invokeinterface #165 <Method Object Iterator.next()>
	//   36   81:checkcast       #304 <Class ResolveInfo>
	//   37   84:astore          4
			if(((Set) (obj)).contains(((Object) (resolveinfo.serviceInfo.packageName))))
	//*  38   86:aload_2         
	//*  39   87:aload           4
	//*  40   89:getfield        #308 <Field ServiceInfo ResolveInfo.serviceInfo>
	//*  41   92:getfield        #314 <Field String ServiceInfo.packageName>
	//*  42   95:invokeinterface #317 <Method boolean Set.contains(Object)>
	//*  43  100:ifne            106
	//*  44  103:goto            66
			{
				ComponentName componentname1 = new ComponentName(resolveinfo.serviceInfo.packageName, resolveinfo.serviceInfo.name);
	//   45  106:new             #319 <Class ComponentName>
	//   46  109:dup             
	//   47  110:aload           4
	//   48  112:getfield        #308 <Field ServiceInfo ResolveInfo.serviceInfo>
	//   49  115:getfield        #314 <Field String ServiceInfo.packageName>
	//   50  118:aload           4
	//   51  120:getfield        #308 <Field ServiceInfo ResolveInfo.serviceInfo>
	//   52  123:getfield        #322 <Field String ServiceInfo.name>
	//   53  126:invokespecial   #325 <Method void ComponentName(String, String)>
	//   54  129:astore          5
				if(resolveinfo.serviceInfo.permission != null)
	//*  55  131:aload           4
	//*  56  133:getfield        #308 <Field ServiceInfo ResolveInfo.serviceInfo>
	//*  57  136:getfield        #328 <Field String ServiceInfo.permission>
	//*  58  139:ifnull          178
					Log.w("NotifManCompat", (new StringBuilder()).append("Permission present on component ").append(((Object) (componentname1))).append(", not adding listener record.").toString());
	//   59  142:ldc1            #106 <String "NotifManCompat">
	//   60  144:new             #108 <Class StringBuilder>
	//   61  147:dup             
	//   62  148:invokespecial   #109 <Method void StringBuilder()>
	//   63  151:ldc2            #330 <String "Permission present on component ">
	//   64  154:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   65  157:aload           5
	//   66  159:invokevirtual   #118 <Method StringBuilder StringBuilder.append(Object)>
	//   67  162:ldc2            #332 <String ", not adding listener record.">
	//   68  165:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   69  168:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   70  171:invokestatic    #128 <Method int Log.w(String, String)>
	//   71  174:pop             
				else
	//*  72  175:goto            66
					((Set) (hashset)).add(((Object) (componentname1)));
	//   73  178:aload_1         
	//   74  179:aload           5
	//   75  181:invokeinterface #333 <Method boolean Set.add(Object)>
	//   76  186:pop             
			}
		} while(true);
	//   77  187:goto            66
		obj = ((Object) (((Set) (hashset)).iterator()));
	//   78  190:aload_1         
	//   79  191:invokeinterface #334 <Method Iterator Set.iterator()>
	//   80  196:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   81  197:aload_2         
	//   82  198:invokeinterface #161 <Method boolean Iterator.hasNext()>
	//   83  203:ifeq            286
			ComponentName componentname = (ComponentName)((Iterator) (obj)).next();
	//   84  206:aload_2         
	//   85  207:invokeinterface #165 <Method Object Iterator.next()>
	//   86  212:checkcast       #319 <Class ComponentName>
	//   87  215:astore_3        
			if(!mRecordMap.containsKey(((Object) (componentname))))
	//*  88  216:aload_0         
	//*  89  217:getfield        #45  <Field Map mRecordMap>
	//*  90  220:aload_3         
	//*  91  221:invokeinterface #337 <Method boolean Map.containsKey(Object)>
	//*  92  226:ifne            283
			{
				if(Log.isLoggable("NotifManCompat", 3))
	//*  93  229:ldc1            #106 <String "NotifManCompat">
	//*  94  231:iconst_3        
	//*  95  232:invokestatic    #203 <Method boolean Log.isLoggable(String, int)>
	//*  96  235:ifeq            264
					Log.d("NotifManCompat", (new StringBuilder()).append("Adding listener record for ").append(((Object) (componentname))).toString());
	//   97  238:ldc1            #106 <String "NotifManCompat">
	//   98  240:new             #108 <Class StringBuilder>
	//   99  243:dup             
	//  100  244:invokespecial   #109 <Method void StringBuilder()>
	//  101  247:ldc2            #339 <String "Adding listener record for ">
	//  102  250:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  103  253:aload_3         
	//  104  254:invokevirtual   #118 <Method StringBuilder StringBuilder.append(Object)>
	//  105  257:invokevirtual   #122 <Method String StringBuilder.toString()>
	//  106  260:invokestatic    #219 <Method int Log.d(String, String)>
	//  107  263:pop             
				mRecordMap.put(((Object) (componentname)), ((Object) (new ListenerRecord(componentname))));
	//  108  264:aload_0         
	//  109  265:getfield        #45  <Field Map mRecordMap>
	//  110  268:aload_3         
	//  111  269:new             #13  <Class NotificationManagerCompat$SideChannelManager$ListenerRecord>
	//  112  272:dup             
	//  113  273:aload_3         
	//  114  274:invokespecial   #341 <Method void NotificationManagerCompat$SideChannelManager$ListenerRecord(ComponentName)>
	//  115  277:invokeinterface #345 <Method Object Map.put(Object, Object)>
	//  116  282:pop             
			}
		} while(true);
	//  117  283:goto            197
		obj = ((Object) (mRecordMap.entrySet().iterator()));
	//  118  286:aload_0         
	//  119  287:getfield        #45  <Field Map mRecordMap>
	//  120  290:invokeinterface #349 <Method Set Map.entrySet()>
	//  121  295:invokeinterface #334 <Method Iterator Set.iterator()>
	//  122  300:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//  123  301:aload_2         
	//  124  302:invokeinterface #161 <Method boolean Iterator.hasNext()>
	//  125  307:ifeq            397
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//  126  310:aload_2         
	//  127  311:invokeinterface #165 <Method Object Iterator.next()>
	//  128  316:checkcast       #351 <Class java.util.Map$Entry>
	//  129  319:astore_3        
			if(!((Set) (hashset)).contains(entry.getKey()))
	//* 130  320:aload_1         
	//* 131  321:aload_3         
	//* 132  322:invokeinterface #354 <Method Object java.util.Map$Entry.getKey()>
	//* 133  327:invokeinterface #317 <Method boolean Set.contains(Object)>
	//* 134  332:ifne            394
			{
				if(Log.isLoggable("NotifManCompat", 3))
	//* 135  335:ldc1            #106 <String "NotifManCompat">
	//* 136  337:iconst_3        
	//* 137  338:invokestatic    #203 <Method boolean Log.isLoggable(String, int)>
	//* 138  341:ifeq            375
					Log.d("NotifManCompat", (new StringBuilder()).append("Removing listener record for ").append(entry.getKey()).toString());
	//  139  344:ldc1            #106 <String "NotifManCompat">
	//  140  346:new             #108 <Class StringBuilder>
	//  141  349:dup             
	//  142  350:invokespecial   #109 <Method void StringBuilder()>
	//  143  353:ldc2            #356 <String "Removing listener record for ">
	//  144  356:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  145  359:aload_3         
	//  146  360:invokeinterface #354 <Method Object java.util.Map$Entry.getKey()>
	//  147  365:invokevirtual   #118 <Method StringBuilder StringBuilder.append(Object)>
	//  148  368:invokevirtual   #122 <Method String StringBuilder.toString()>
	//  149  371:invokestatic    #219 <Method int Log.d(String, String)>
	//  150  374:pop             
				ensureServiceUnbound((ListenerRecord)entry.getValue());
	//  151  375:aload_0         
	//  152  376:aload_3         
	//  153  377:invokeinterface #359 <Method Object java.util.Map$Entry.getValue()>
	//  154  382:checkcast       #13  <Class NotificationManagerCompat$SideChannelManager$ListenerRecord>
	//  155  385:invokespecial   #195 <Method void ensureServiceUnbound(NotificationManagerCompat$SideChannelManager$ListenerRecord)>
				((Iterator) (obj)).remove();
	//  156  388:aload_2         
	//  157  389:invokeinterface #361 <Method void Iterator.remove()>
			}
		} while(true);
	//  158  394:goto            301
	//  159  397:return          
	}

	public boolean handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #368 <Field int Message.what>
		{
	//*   2    4:tableswitch     0 3: default 36
	//	               0 39
	//	               1 52
	//	               2 74
	//	               3 87
	//*   3   36:goto            100
		case 0: // '\0'
			handleQueueTask((NotificationManagerCompat.Task)message.obj);
	//    4   39:aload_0         
	//    5   40:aload_1         
	//    6   41:getfield        #372 <Field Object Message.obj>
	//    7   44:checkcast       #232 <Class NotificationManagerCompat$Task>
	//    8   47:invokespecial   #374 <Method void handleQueueTask(NotificationManagerCompat$Task)>
			return true;
	//    9   50:iconst_1        
	//   10   51:ireturn         

		case 1: // '\001'
			message = ((Message) ((nt)message.obj));
	//   11   52:aload_1         
	//   12   53:getfield        #372 <Field Object Message.obj>
	//   13   56:checkcast       #376 <Class NotificationManagerCompat$ServiceConnectedEvent>
	//   14   59:astore_1        
			handleServiceConnected(((nt) (message)).componentName, ((nt) (message)).iBinder);
	//   15   60:aload_0         
	//   16   61:aload_1         
	//   17   62:getfield        #377 <Field ComponentName NotificationManagerCompat$ServiceConnectedEvent.componentName>
	//   18   65:aload_1         
	//   19   66:getfield        #381 <Field IBinder NotificationManagerCompat$ServiceConnectedEvent.iBinder>
	//   20   69:invokespecial   #383 <Method void handleServiceConnected(ComponentName, IBinder)>
			return true;
	//   21   72:iconst_1        
	//   22   73:ireturn         

		case 2: // '\002'
			handleServiceDisconnected((ComponentName)message.obj);
	//   23   74:aload_0         
	//   24   75:aload_1         
	//   25   76:getfield        #372 <Field Object Message.obj>
	//   26   79:checkcast       #319 <Class ComponentName>
	//   27   82:invokespecial   #385 <Method void handleServiceDisconnected(ComponentName)>
			return true;
	//   28   85:iconst_1        
	//   29   86:ireturn         

		case 3: // '\003'
			handleRetryListenerQueue((ComponentName)message.obj);
	//   30   87:aload_0         
	//   31   88:aload_1         
	//   32   89:getfield        #372 <Field Object Message.obj>
	//   33   92:checkcast       #319 <Class ComponentName>
	//   34   95:invokespecial   #387 <Method void handleRetryListenerQueue(ComponentName)>
			return true;
	//   35   98:iconst_1        
	//   36   99:ireturn         
		}
		return false;
	//   37  100:iconst_0        
	//   38  101:ireturn         
	}

	public void onServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		if(Log.isLoggable("NotifManCompat", 3))
	//*   0    0:ldc1            #106 <String "NotifManCompat">
	//*   1    2:iconst_3        
	//*   2    3:invokestatic    #203 <Method boolean Log.isLoggable(String, int)>
	//*   3    6:ifeq            35
			Log.d("NotifManCompat", (new StringBuilder()).append("Connected to service ").append(((Object) (componentname))).toString());
	//    4    9:ldc1            #106 <String "NotifManCompat">
	//    5   11:new             #108 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #109 <Method void StringBuilder()>
	//    8   18:ldc2            #390 <String "Connected to service ">
	//    9   21:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_1         
	//   11   25:invokevirtual   #118 <Method StringBuilder StringBuilder.append(Object)>
	//   12   28:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   13   31:invokestatic    #219 <Method int Log.d(String, String)>
	//   14   34:pop             
		mHandler.obtainMessage(1, ((Object) (new nt(componentname, ibinder)))).sendToTarget();
	//   15   35:aload_0         
	//   16   36:getfield        #75  <Field Handler mHandler>
	//   17   39:iconst_1        
	//   18   40:new             #376 <Class NotificationManagerCompat$ServiceConnectedEvent>
	//   19   43:dup             
	//   20   44:aload_1         
	//   21   45:aload_2         
	//   22   46:invokespecial   #392 <Method void NotificationManagerCompat$ServiceConnectedEvent(ComponentName, IBinder)>
	//   23   49:invokevirtual   #271 <Method Message Handler.obtainMessage(int, Object)>
	//   24   52:invokevirtual   #395 <Method void Message.sendToTarget()>
	//   25   55:return          
	}

	public void onServiceDisconnected(ComponentName componentname)
	{
		if(Log.isLoggable("NotifManCompat", 3))
	//*   0    0:ldc1            #106 <String "NotifManCompat">
	//*   1    2:iconst_3        
	//*   2    3:invokestatic    #203 <Method boolean Log.isLoggable(String, int)>
	//*   3    6:ifeq            35
			Log.d("NotifManCompat", (new StringBuilder()).append("Disconnected from service ").append(((Object) (componentname))).toString());
	//    4    9:ldc1            #106 <String "NotifManCompat">
	//    5   11:new             #108 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #109 <Method void StringBuilder()>
	//    8   18:ldc2            #398 <String "Disconnected from service ">
	//    9   21:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_1         
	//   11   25:invokevirtual   #118 <Method StringBuilder StringBuilder.append(Object)>
	//   12   28:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   13   31:invokestatic    #219 <Method int Log.d(String, String)>
	//   14   34:pop             
		mHandler.obtainMessage(2, ((Object) (componentname))).sendToTarget();
	//   15   35:aload_0         
	//   16   36:getfield        #75  <Field Handler mHandler>
	//   17   39:iconst_2        
	//   18   40:aload_1         
	//   19   41:invokevirtual   #271 <Method Message Handler.obtainMessage(int, Object)>
	//   20   44:invokevirtual   #395 <Method void Message.sendToTarget()>
	//   21   47:return          
	}

	public void queueTask(NotificationManagerCompat.Task task)
	{
		mHandler.obtainMessage(0, ((Object) (task))).sendToTarget();
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field Handler mHandler>
	//    2    4:iconst_0        
	//    3    5:aload_1         
	//    4    6:invokevirtual   #271 <Method Message Handler.obtainMessage(int, Object)>
	//    5    9:invokevirtual   #395 <Method void Message.sendToTarget()>
	//    6   12:return          
	}

	private static final int MSG_QUEUE_TASK = 0;
	private static final int MSG_RETRY_LISTENER_QUEUE = 3;
	private static final int MSG_SERVICE_CONNECTED = 1;
	private static final int MSG_SERVICE_DISCONNECTED = 2;
	private Set mCachedEnabledPackages;
	private final Context mContext;
	private final Handler mHandler;
	private final HandlerThread mHandlerThread = new HandlerThread("NotificationManagerCompat");
	private final Map mRecordMap = new HashMap();

	public NotificationManagerCompat$SideChannelManager(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #42  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #43  <Method void HashMap()>
	//    6   12:putfield        #45  <Field Map mRecordMap>
		mCachedEnabledPackages = ((Set) (new HashSet()));
	//    7   15:aload_0         
	//    8   16:new             #47  <Class HashSet>
	//    9   19:dup             
	//   10   20:invokespecial   #48  <Method void HashSet()>
	//   11   23:putfield        #50  <Field Set mCachedEnabledPackages>
		mContext = context;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #52  <Field Context mContext>
	//   15   31:aload_0         
	//   16   32:new             #54  <Class HandlerThread>
	//   17   35:dup             
	//   18   36:ldc1            #56  <String "NotificationManagerCompat">
	//   19   38:invokespecial   #59  <Method void HandlerThread(String)>
	//   20   41:putfield        #61  <Field HandlerThread mHandlerThread>
		mHandlerThread.start();
	//   21   44:aload_0         
	//   22   45:getfield        #61  <Field HandlerThread mHandlerThread>
	//   23   48:invokevirtual   #64  <Method void HandlerThread.start()>
		mHandler = new Handler(mHandlerThread.getLooper(), ((android.os.Handler.Callback) (this)));
	//   24   51:aload_0         
	//   25   52:new             #66  <Class Handler>
	//   26   55:dup             
	//   27   56:aload_0         
	//   28   57:getfield        #61  <Field HandlerThread mHandlerThread>
	//   29   60:invokevirtual   #70  <Method android.os.Looper HandlerThread.getLooper()>
	//   30   63:aload_0         
	//   31   64:invokespecial   #73  <Method void Handler(android.os.Looper, android.os.Handler$Callback)>
	//   32   67:putfield        #75  <Field Handler mHandler>
	//   33   70:return          
	}
}
