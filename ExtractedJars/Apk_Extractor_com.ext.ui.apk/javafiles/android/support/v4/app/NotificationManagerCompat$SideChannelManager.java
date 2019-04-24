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

private static class NotificationManagerCompat$SideChannelManager
	implements ServiceConnection, android.os.Handler.Callback
{
	private static class ListenerRecord
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
	//*  23   45:ifeq            58
		{
			listenerrecord.retryCount = 0;
	//   24   48:aload_1         
	//   25   49:iconst_0        
	//   26   50:putfield        #104 <Field int NotificationManagerCompat$SideChannelManager$ListenerRecord.retryCount>
		} else
	//*  27   53:aload_1         
	//*  28   54:getfield        #82  <Field boolean NotificationManagerCompat$SideChannelManager$ListenerRecord.bound>
	//*  29   57:ireturn         
		{
			Log.w("NotifManCompat", (new StringBuilder()).append("Unable to bind to listener ").append(((Object) (listenerrecord.componentName))).toString());
	//   30   58:ldc1            #106 <String "NotifManCompat">
	//   31   60:new             #108 <Class StringBuilder>
	//   32   63:dup             
	//   33   64:invokespecial   #109 <Method void StringBuilder()>
	//   34   67:ldc1            #111 <String "Unable to bind to listener ">
	//   35   69:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   36   72:aload_1         
	//   37   73:getfield        #91  <Field ComponentName NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName>
	//   38   76:invokevirtual   #118 <Method StringBuilder StringBuilder.append(Object)>
	//   39   79:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   40   82:invokestatic    #128 <Method int Log.w(String, String)>
	//   41   85:pop             
			mContext.unbindService(((ServiceConnection) (this)));
	//   42   86:aload_0         
	//   43   87:getfield        #52  <Field Context mContext>
	//   44   90:aload_0         
	//   45   91:invokevirtual   #132 <Method void Context.unbindService(ServiceConnection)>
		}
		return listenerrecord.bound;
	//*  46   94:goto            53
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
		if(!listenerrecord.taskQueue.isEmpty()) goto _L2; else goto _L1
	//   24   57:aload_1         
	//   25   58:getfield        #169 <Field LinkedList NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
	//   26   61:invokevirtual   #222 <Method boolean LinkedList.isEmpty()>
	//   27   64:ifeq            68
_L1:
		return;
	//   28   67:return          
_L2:
		if(!ensureServiceBound(listenerrecord) || listenerrecord.service == null)
	//*  29   68:aload_0         
	//*  30   69:aload_1         
	//*  31   70:invokespecial   #224 <Method boolean ensureServiceBound(NotificationManagerCompat$SideChannelManager$ListenerRecord)>
	//*  32   73:ifeq            83
	//*  33   76:aload_1         
	//*  34   77:getfield        #138 <Field INotificationSideChannel NotificationManagerCompat$SideChannelManager$ListenerRecord.service>
	//*  35   80:ifnonnull       141
		{
			scheduleListenerRetry(listenerrecord);
	//   36   83:aload_0         
	//   37   84:aload_1         
	//   38   85:invokespecial   #227 <Method void scheduleListenerRetry(NotificationManagerCompat$SideChannelManager$ListenerRecord)>
			return;
	//   39   88:return          
		}
		  goto _L3
_L5:
		NotificationManagerCompat.Task task;
		if(Log.isLoggable("NotifManCompat", 3))
	//*  40   89:ldc1            #106 <String "NotifManCompat">
	//*  41   91:iconst_3        
	//*  42   92:invokestatic    #203 <Method boolean Log.isLoggable(String, int)>
	//*  43   95:ifeq            123
			Log.d("NotifManCompat", (new StringBuilder()).append("Sending task ").append(((Object) (task))).toString());
	//   44   98:ldc1            #106 <String "NotifManCompat">
	//   45  100:new             #108 <Class StringBuilder>
	//   46  103:dup             
	//   47  104:invokespecial   #109 <Method void StringBuilder()>
	//   48  107:ldc1            #229 <String "Sending task ">
	//   49  109:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   50  112:aload_2         
	//   51  113:invokevirtual   #118 <Method StringBuilder StringBuilder.append(Object)>
	//   52  116:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   53  119:invokestatic    #219 <Method int Log.d(String, String)>
	//   54  122:pop             
		task.send(listenerrecord.service);
	//   55  123:aload_2         
	//   56  124:aload_1         
	//   57  125:getfield        #138 <Field INotificationSideChannel NotificationManagerCompat$SideChannelManager$ListenerRecord.service>
	//   58  128:invokeinterface #235 <Method void NotificationManagerCompat$Task.send(INotificationSideChannel)>
		listenerrecord.taskQueue.remove();
	//   59  133:aload_1         
	//   60  134:getfield        #169 <Field LinkedList NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
	//   61  137:invokevirtual   #238 <Method Object LinkedList.remove()>
	//   62  140:pop             
	//*  63  141:aload_1         
	//*  64  142:getfield        #169 <Field LinkedList NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
	//*  65  145:invokevirtual   #241 <Method Object LinkedList.peek()>
	//*  66  148:checkcast       #231 <Class NotificationManagerCompat$Task>
	//*  67  151:astore_2        
_L3:
		if((task = (NotificationManagerCompat.Task)listenerrecord.taskQueue.peek()) != null) goto _L5; else goto _L4
	//   68  152:aload_2         
	//   69  153:ifnonnull       89
_L4:
		if(!listenerrecord.taskQueue.isEmpty())
	//*  70  156:aload_1         
	//*  71  157:getfield        #169 <Field LinkedList NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
	//*  72  160:invokevirtual   #222 <Method boolean LinkedList.isEmpty()>
	//*  73  163:ifne            67
		{
			scheduleListenerRetry(listenerrecord);
	//   74  166:aload_0         
	//   75  167:aload_1         
	//   76  168:invokespecial   #227 <Method void scheduleListenerRetry(NotificationManagerCompat$SideChannelManager$ListenerRecord)>
			return;
	//   77  171:return          
		}
		if(true) goto _L1; else goto _L6
_L6:
		Object obj;
		obj;
	//   78  172:astore_2        
		if(Log.isLoggable("NotifManCompat", 3))
	//*  79  173:ldc1            #106 <String "NotifManCompat">
	//*  80  175:iconst_3        
	//*  81  176:invokestatic    #203 <Method boolean Log.isLoggable(String, int)>
	//*  82  179:ifeq            156
			Log.d("NotifManCompat", (new StringBuilder()).append("Remote service has died: ").append(((Object) (listenerrecord.componentName))).toString());
	//   83  182:ldc1            #106 <String "NotifManCompat">
	//   84  184:new             #108 <Class StringBuilder>
	//   85  187:dup             
	//   86  188:invokespecial   #109 <Method void StringBuilder()>
	//   87  191:ldc1            #243 <String "Remote service has died: ">
	//   88  193:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   89  196:aload_1         
	//   90  197:getfield        #91  <Field ComponentName NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName>
	//   91  200:invokevirtual   #118 <Method StringBuilder StringBuilder.append(Object)>
	//   92  203:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   93  206:invokestatic    #219 <Method int Log.d(String, String)>
	//   94  209:pop             
		  goto _L4
	//*  95  210:goto            156
		obj;
	//   96  213:astore_2        
		Log.w("NotifManCompat", (new StringBuilder()).append("RemoteException communicating with ").append(((Object) (listenerrecord.componentName))).toString(), ((Throwable) (obj)));
	//   97  214:ldc1            #106 <String "NotifManCompat">
	//   98  216:new             #108 <Class StringBuilder>
	//   99  219:dup             
	//  100  220:invokespecial   #109 <Method void StringBuilder()>
	//  101  223:ldc1            #245 <String "RemoteException communicating with ">
	//  102  225:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  103  228:aload_1         
	//  104  229:getfield        #91  <Field ComponentName NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName>
	//  105  232:invokevirtual   #118 <Method StringBuilder StringBuilder.append(Object)>
	//  106  235:invokevirtual   #122 <Method String StringBuilder.toString()>
	//  107  238:aload_2         
	//  108  239:invokestatic    #248 <Method int Log.w(String, String, Throwable)>
	//  109  242:pop             
		  goto _L4
	//* 110  243:goto            156
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
		if(!((Set) (obj)).equals(((Object) (mCachedEnabledPackages))))
	//*   4    8:aload_2         
	//*   5    9:aload_0         
	//*   6   10:getfield        #50  <Field Set mCachedEnabledPackages>
	//*   7   13:invokeinterface #284 <Method boolean Set.equals(Object)>
	//*   8   18:ifeq            22
	//*   9   21:return          
		{
			mCachedEnabledPackages = ((Set) (obj));
	//   10   22:aload_0         
	//   11   23:aload_2         
	//   12   24:putfield        #50  <Field Set mCachedEnabledPackages>
			Object obj1 = ((Object) (mContext.getPackageManager().queryIntentServices((new Intent()).setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0)));
	//   13   27:aload_0         
	//   14   28:getfield        #52  <Field Context mContext>
	//   15   31:invokevirtual   #288 <Method PackageManager Context.getPackageManager()>
	//   16   34:new             #84  <Class Intent>
	//   17   37:dup             
	//   18   38:invokespecial   #289 <Method void Intent()>
	//   19   41:ldc1            #86  <String "android.support.BIND_NOTIFICATION_SIDE_CHANNEL">
	//   20   43:invokevirtual   #293 <Method Intent Intent.setAction(String)>
	//   21   46:iconst_0        
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
	//   33   72:ifeq            187
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
	//*  43  100:ifeq            66
				{
					ComponentName componentname1 = new ComponentName(resolveinfo.serviceInfo.packageName, resolveinfo.serviceInfo.name);
	//   44  103:new             #319 <Class ComponentName>
	//   45  106:dup             
	//   46  107:aload           4
	//   47  109:getfield        #308 <Field ServiceInfo ResolveInfo.serviceInfo>
	//   48  112:getfield        #314 <Field String ServiceInfo.packageName>
	//   49  115:aload           4
	//   50  117:getfield        #308 <Field ServiceInfo ResolveInfo.serviceInfo>
	//   51  120:getfield        #322 <Field String ServiceInfo.name>
	//   52  123:invokespecial   #325 <Method void ComponentName(String, String)>
	//   53  126:astore          5
					if(resolveinfo.serviceInfo.permission != null)
	//*  54  128:aload           4
	//*  55  130:getfield        #308 <Field ServiceInfo ResolveInfo.serviceInfo>
	//*  56  133:getfield        #328 <Field String ServiceInfo.permission>
	//*  57  136:ifnull          175
						Log.w("NotifManCompat", (new StringBuilder()).append("Permission present on component ").append(((Object) (componentname1))).append(", not adding listener record.").toString());
	//   58  139:ldc1            #106 <String "NotifManCompat">
	//   59  141:new             #108 <Class StringBuilder>
	//   60  144:dup             
	//   61  145:invokespecial   #109 <Method void StringBuilder()>
	//   62  148:ldc2            #330 <String "Permission present on component ">
	//   63  151:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   64  154:aload           5
	//   65  156:invokevirtual   #118 <Method StringBuilder StringBuilder.append(Object)>
	//   66  159:ldc2            #332 <String ", not adding listener record.">
	//   67  162:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   68  165:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   69  168:invokestatic    #128 <Method int Log.w(String, String)>
	//   70  171:pop             
					else
	//*  71  172:goto            66
						((Set) (hashset)).add(((Object) (componentname1)));
	//   72  175:aload_1         
	//   73  176:aload           5
	//   74  178:invokeinterface #333 <Method boolean Set.add(Object)>
	//   75  183:pop             
				}
			} while(true);
	//   76  184:goto            66
			obj = ((Object) (((Set) (hashset)).iterator()));
	//   77  187:aload_1         
	//   78  188:invokeinterface #334 <Method Iterator Set.iterator()>
	//   79  193:astore_2        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
	//   80  194:aload_2         
	//   81  195:invokeinterface #161 <Method boolean Iterator.hasNext()>
	//   82  200:ifeq            283
				ComponentName componentname = (ComponentName)((Iterator) (obj)).next();
	//   83  203:aload_2         
	//   84  204:invokeinterface #165 <Method Object Iterator.next()>
	//   85  209:checkcast       #319 <Class ComponentName>
	//   86  212:astore_3        
				if(!mRecordMap.containsKey(((Object) (componentname))))
	//*  87  213:aload_0         
	//*  88  214:getfield        #45  <Field Map mRecordMap>
	//*  89  217:aload_3         
	//*  90  218:invokeinterface #337 <Method boolean Map.containsKey(Object)>
	//*  91  223:ifne            194
				{
					if(Log.isLoggable("NotifManCompat", 3))
	//*  92  226:ldc1            #106 <String "NotifManCompat">
	//*  93  228:iconst_3        
	//*  94  229:invokestatic    #203 <Method boolean Log.isLoggable(String, int)>
	//*  95  232:ifeq            261
						Log.d("NotifManCompat", (new StringBuilder()).append("Adding listener record for ").append(((Object) (componentname))).toString());
	//   96  235:ldc1            #106 <String "NotifManCompat">
	//   97  237:new             #108 <Class StringBuilder>
	//   98  240:dup             
	//   99  241:invokespecial   #109 <Method void StringBuilder()>
	//  100  244:ldc2            #339 <String "Adding listener record for ">
	//  101  247:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  102  250:aload_3         
	//  103  251:invokevirtual   #118 <Method StringBuilder StringBuilder.append(Object)>
	//  104  254:invokevirtual   #122 <Method String StringBuilder.toString()>
	//  105  257:invokestatic    #219 <Method int Log.d(String, String)>
	//  106  260:pop             
					mRecordMap.put(((Object) (componentname)), ((Object) (new ListenerRecord(componentname))));
	//  107  261:aload_0         
	//  108  262:getfield        #45  <Field Map mRecordMap>
	//  109  265:aload_3         
	//  110  266:new             #13  <Class NotificationManagerCompat$SideChannelManager$ListenerRecord>
	//  111  269:dup             
	//  112  270:aload_3         
	//  113  271:invokespecial   #341 <Method void NotificationManagerCompat$SideChannelManager$ListenerRecord(ComponentName)>
	//  114  274:invokeinterface #345 <Method Object Map.put(Object, Object)>
	//  115  279:pop             
				}
			} while(true);
	//  116  280:goto            194
			obj = ((Object) (mRecordMap.entrySet().iterator()));
	//  117  283:aload_0         
	//  118  284:getfield        #45  <Field Map mRecordMap>
	//  119  287:invokeinterface #349 <Method Set Map.entrySet()>
	//  120  292:invokeinterface #334 <Method Iterator Set.iterator()>
	//  121  297:astore_2        
			while(((Iterator) (obj)).hasNext()) 
	//* 122  298:aload_2         
	//* 123  299:invokeinterface #161 <Method boolean Iterator.hasNext()>
	//* 124  304:ifeq            21
			{
				java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//  125  307:aload_2         
	//  126  308:invokeinterface #165 <Method Object Iterator.next()>
	//  127  313:checkcast       #351 <Class java.util.Map$Entry>
	//  128  316:astore_3        
				if(!((Set) (hashset)).contains(entry.getKey()))
	//* 129  317:aload_1         
	//* 130  318:aload_3         
	//* 131  319:invokeinterface #354 <Method Object java.util.Map$Entry.getKey()>
	//* 132  324:invokeinterface #317 <Method boolean Set.contains(Object)>
	//* 133  329:ifne            298
				{
					if(Log.isLoggable("NotifManCompat", 3))
	//* 134  332:ldc1            #106 <String "NotifManCompat">
	//* 135  334:iconst_3        
	//* 136  335:invokestatic    #203 <Method boolean Log.isLoggable(String, int)>
	//* 137  338:ifeq            372
						Log.d("NotifManCompat", (new StringBuilder()).append("Removing listener record for ").append(entry.getKey()).toString());
	//  138  341:ldc1            #106 <String "NotifManCompat">
	//  139  343:new             #108 <Class StringBuilder>
	//  140  346:dup             
	//  141  347:invokespecial   #109 <Method void StringBuilder()>
	//  142  350:ldc2            #356 <String "Removing listener record for ">
	//  143  353:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//  144  356:aload_3         
	//  145  357:invokeinterface #354 <Method Object java.util.Map$Entry.getKey()>
	//  146  362:invokevirtual   #118 <Method StringBuilder StringBuilder.append(Object)>
	//  147  365:invokevirtual   #122 <Method String StringBuilder.toString()>
	//  148  368:invokestatic    #219 <Method int Log.d(String, String)>
	//  149  371:pop             
					ensureServiceUnbound((ListenerRecord)entry.getValue());
	//  150  372:aload_0         
	//  151  373:aload_3         
	//  152  374:invokeinterface #359 <Method Object java.util.Map$Entry.getValue()>
	//  153  379:checkcast       #13  <Class NotificationManagerCompat$SideChannelManager$ListenerRecord>
	//  154  382:invokespecial   #195 <Method void ensureServiceUnbound(NotificationManagerCompat$SideChannelManager$ListenerRecord)>
					((Iterator) (obj)).remove();
	//  155  385:aload_2         
	//  156  386:invokeinterface #361 <Method void Iterator.remove()>
				}
			}
		}
	//* 157  391:goto            298
	}

	public boolean handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #368 <Field int Message.what>
		{
	//*   2    4:tableswitch     0 3: default 36
	//	               0 38
	//	               1 51
	//	               2 73
	//	               3 86
		default:
			return false;
	//    3   36:iconst_0        
	//    4   37:ireturn         

		case 0: // '\0'
			handleQueueTask((NotificationManagerCompat.Task)message.obj);
	//    5   38:aload_0         
	//    6   39:aload_1         
	//    7   40:getfield        #372 <Field Object Message.obj>
	//    8   43:checkcast       #231 <Class NotificationManagerCompat$Task>
	//    9   46:invokespecial   #374 <Method void handleQueueTask(NotificationManagerCompat$Task)>
			return true;
	//   10   49:iconst_1        
	//   11   50:ireturn         

		case 1: // '\001'
			message = ((Message) ((nt)message.obj));
	//   12   51:aload_1         
	//   13   52:getfield        #372 <Field Object Message.obj>
	//   14   55:checkcast       #376 <Class NotificationManagerCompat$ServiceConnectedEvent>
	//   15   58:astore_1        
			handleServiceConnected(((nt) (message)).componentName, ((nt) (message)).iBinder);
	//   16   59:aload_0         
	//   17   60:aload_1         
	//   18   61:getfield        #377 <Field ComponentName NotificationManagerCompat$ServiceConnectedEvent.componentName>
	//   19   64:aload_1         
	//   20   65:getfield        #381 <Field IBinder NotificationManagerCompat$ServiceConnectedEvent.iBinder>
	//   21   68:invokespecial   #383 <Method void handleServiceConnected(ComponentName, IBinder)>
			return true;
	//   22   71:iconst_1        
	//   23   72:ireturn         

		case 2: // '\002'
			handleServiceDisconnected((ComponentName)message.obj);
	//   24   73:aload_0         
	//   25   74:aload_1         
	//   26   75:getfield        #372 <Field Object Message.obj>
	//   27   78:checkcast       #319 <Class ComponentName>
	//   28   81:invokespecial   #385 <Method void handleServiceDisconnected(ComponentName)>
			return true;
	//   29   84:iconst_1        
	//   30   85:ireturn         

		case 3: // '\003'
			handleRetryListenerQueue((ComponentName)message.obj);
	//   31   86:aload_0         
	//   32   87:aload_1         
	//   33   88:getfield        #372 <Field Object Message.obj>
	//   34   91:checkcast       #319 <Class ComponentName>
	//   35   94:invokespecial   #387 <Method void handleRetryListenerQueue(ComponentName)>
			break;
		}
		return true;
	//   36   97:iconst_1        
	//   37   98:ireturn         
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
