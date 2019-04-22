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

		boolean bound;
		final ComponentName componentName;
		int retryCount;
		INotificationSideChannel service;
		ArrayDeque taskQueue;

		ListenerRecord(ComponentName componentname)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			bound = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #28  <Field boolean bound>
			taskQueue = new ArrayDeque();
		//    5    9:aload_0         
		//    6   10:new             #30  <Class ArrayDeque>
		//    7   13:dup             
		//    8   14:invokespecial   #31  <Method void ArrayDeque()>
		//    9   17:putfield        #33  <Field ArrayDeque taskQueue>
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
	//*   1    1:getfield        #73  <Field boolean NotificationManagerCompat$SideChannelManager$ListenerRecord.bound>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		Intent intent = (new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL")).setComponent(listenerrecord.componentName);
	//    5    9:new             #75  <Class Intent>
	//    6   12:dup             
	//    7   13:ldc1            #77  <String "android.support.BIND_NOTIFICATION_SIDE_CHANNEL">
	//    8   15:invokespecial   #78  <Method void Intent(String)>
	//    9   18:aload_1         
	//   10   19:getfield        #82  <Field ComponentName NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName>
	//   11   22:invokevirtual   #86  <Method Intent Intent.setComponent(ComponentName)>
	//   12   25:astore_2        
		listenerrecord.bound = mContext.bindService(intent, ((ServiceConnection) (this)), 33);
	//   13   26:aload_1         
	//   14   27:aload_0         
	//   15   28:getfield        #43  <Field Context mContext>
	//   16   31:aload_2         
	//   17   32:aload_0         
	//   18   33:bipush          33
	//   19   35:invokevirtual   #92  <Method boolean Context.bindService(Intent, ServiceConnection, int)>
	//   20   38:putfield        #73  <Field boolean NotificationManagerCompat$SideChannelManager$ListenerRecord.bound>
		if(listenerrecord.bound)
	//*  21   41:aload_1         
	//*  22   42:getfield        #73  <Field boolean NotificationManagerCompat$SideChannelManager$ListenerRecord.bound>
	//*  23   45:ifeq            56
		{
			listenerrecord.retryCount = 0;
	//   24   48:aload_1         
	//   25   49:iconst_0        
	//   26   50:putfield        #96  <Field int NotificationManagerCompat$SideChannelManager$ListenerRecord.retryCount>
		} else
	//*  27   53:goto            98
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   28   56:new             #98  <Class StringBuilder>
	//   29   59:dup             
	//   30   60:invokespecial   #99  <Method void StringBuilder()>
	//   31   63:astore_2        
			stringbuilder.append("Unable to bind to listener ");
	//   32   64:aload_2         
	//   33   65:ldc1            #101 <String "Unable to bind to listener ">
	//   34   67:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   35   70:pop             
			stringbuilder.append(((Object) (listenerrecord.componentName)));
	//   36   71:aload_2         
	//   37   72:aload_1         
	//   38   73:getfield        #82  <Field ComponentName NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName>
	//   39   76:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//   40   79:pop             
			Log.w("NotifManCompat", stringbuilder.toString());
	//   41   80:ldc1            #110 <String "NotifManCompat">
	//   42   82:aload_2         
	//   43   83:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   44   86:invokestatic    #120 <Method int Log.w(String, String)>
	//   45   89:pop             
			mContext.unbindService(((ServiceConnection) (this)));
	//   46   90:aload_0         
	//   47   91:getfield        #43  <Field Context mContext>
	//   48   94:aload_0         
	//   49   95:invokevirtual   #124 <Method void Context.unbindService(ServiceConnection)>
		}
		return listenerrecord.bound;
	//   50   98:aload_1         
	//   51   99:getfield        #73  <Field boolean NotificationManagerCompat$SideChannelManager$ListenerRecord.bound>
	//   52  102:ireturn         
	}

	private void ensureServiceUnbound(ListenerRecord listenerrecord)
	{
		if(listenerrecord.bound)
	//*   0    0:aload_1         
	//*   1    1:getfield        #73  <Field boolean NotificationManagerCompat$SideChannelManager$ListenerRecord.bound>
	//*   2    4:ifeq            20
		{
			mContext.unbindService(((ServiceConnection) (this)));
	//    3    7:aload_0         
	//    4    8:getfield        #43  <Field Context mContext>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #124 <Method void Context.unbindService(ServiceConnection)>
			listenerrecord.bound = false;
	//    7   15:aload_1         
	//    8   16:iconst_0        
	//    9   17:putfield        #73  <Field boolean NotificationManagerCompat$SideChannelManager$ListenerRecord.bound>
		}
		listenerrecord.service = null;
	//   10   20:aload_1         
	//   11   21:aconst_null     
	//   12   22:putfield        #130 <Field INotificationSideChannel NotificationManagerCompat$SideChannelManager$ListenerRecord.service>
	//   13   25:return          
	}

	private void handleQueueTask(NotificationManagerCompat.Task task)
	{
		updateListenerMap();
	//    0    0:aload_0         
	//    1    1:invokespecial   #135 <Method void updateListenerMap()>
		ListenerRecord listenerrecord;
		for(Iterator iterator = mRecordMap.values().iterator(); iterator.hasNext(); processListenerQueue(listenerrecord))
	//*   2    4:aload_0         
	//*   3    5:getfield        #36  <Field Map mRecordMap>
	//*   4    8:invokeinterface #141 <Method Collection Map.values()>
	//*   5   13:invokeinterface #147 <Method Iterator Collection.iterator()>
	//*   6   18:astore_2        
	//*   7   19:aload_2         
	//*   8   20:invokeinterface #153 <Method boolean Iterator.hasNext()>
	//*   9   25:ifeq            55
		{
			listenerrecord = (ListenerRecord)iterator.next();
	//   10   28:aload_2         
	//   11   29:invokeinterface #157 <Method Object Iterator.next()>
	//   12   34:checkcast       #13  <Class NotificationManagerCompat$SideChannelManager$ListenerRecord>
	//   13   37:astore_3        
			listenerrecord.taskQueue.add(((Object) (task)));
	//   14   38:aload_3         
	//   15   39:getfield        #161 <Field ArrayDeque NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
	//   16   42:aload_1         
	//   17   43:invokevirtual   #167 <Method boolean ArrayDeque.add(Object)>
	//   18   46:pop             
		}

	//   19   47:aload_0         
	//   20   48:aload_3         
	//   21   49:invokespecial   #170 <Method void processListenerQueue(NotificationManagerCompat$SideChannelManager$ListenerRecord)>
	//*  22   52:goto            19
	//   23   55:return          
	}

	private void handleRetryListenerQueue(ComponentName componentname)
	{
		componentname = ((ComponentName) ((ListenerRecord)mRecordMap.get(((Object) (componentname)))));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Map mRecordMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #176 <Method Object Map.get(Object)>
	//    4   10:checkcast       #13  <Class NotificationManagerCompat$SideChannelManager$ListenerRecord>
	//    5   13:astore_1        
		if(componentname != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          23
			processListenerQueue(((ListenerRecord) (componentname)));
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokespecial   #170 <Method void processListenerQueue(NotificationManagerCompat$SideChannelManager$ListenerRecord)>
	//   11   23:return          
	}

	private void handleServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		componentname = ((ComponentName) ((ListenerRecord)mRecordMap.get(((Object) (componentname)))));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Map mRecordMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #176 <Method Object Map.get(Object)>
	//    4   10:checkcast       #13  <Class NotificationManagerCompat$SideChannelManager$ListenerRecord>
	//    5   13:astore_1        
		if(componentname != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          36
		{
			componentname.service = INotificationSideChannel.Stub.asInterface(ibinder);
	//    8   18:aload_1         
	//    9   19:aload_2         
	//   10   20:invokestatic    #184 <Method INotificationSideChannel INotificationSideChannel$Stub.asInterface(IBinder)>
	//   11   23:putfield        #130 <Field INotificationSideChannel NotificationManagerCompat$SideChannelManager$ListenerRecord.service>
			componentname.retryCount = 0;
	//   12   26:aload_1         
	//   13   27:iconst_0        
	//   14   28:putfield        #96  <Field int NotificationManagerCompat$SideChannelManager$ListenerRecord.retryCount>
			processListenerQueue(((ListenerRecord) (componentname)));
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokespecial   #170 <Method void processListenerQueue(NotificationManagerCompat$SideChannelManager$ListenerRecord)>
		}
	//   18   36:return          
	}

	private void handleServiceDisconnected(ComponentName componentname)
	{
		componentname = ((ComponentName) ((ListenerRecord)mRecordMap.get(((Object) (componentname)))));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Map mRecordMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #176 <Method Object Map.get(Object)>
	//    4   10:checkcast       #13  <Class NotificationManagerCompat$SideChannelManager$ListenerRecord>
	//    5   13:astore_1        
		if(componentname != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          23
			ensureServiceUnbound(((ListenerRecord) (componentname)));
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokespecial   #187 <Method void ensureServiceUnbound(NotificationManagerCompat$SideChannelManager$ListenerRecord)>
	//   11   23:return          
	}

	private void processListenerQueue(ListenerRecord listenerrecord)
	{
		if(Log.isLoggable("NotifManCompat", 3))
	//*   0    0:ldc1            #110 <String "NotifManCompat">
	//*   1    2:iconst_3        
	//*   2    3:invokestatic    #195 <Method boolean Log.isLoggable(String, int)>
	//*   3    6:ifeq            69
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    9:new             #98  <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #99  <Method void StringBuilder()>
	//    7   16:astore_2        
			stringbuilder.append("Processing component ");
	//    8   17:aload_2         
	//    9   18:ldc1            #197 <String "Processing component ">
	//   10   20:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			stringbuilder.append(((Object) (listenerrecord.componentName)));
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:getfield        #82  <Field ComponentName NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName>
	//   15   29:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//   16   32:pop             
			stringbuilder.append(", ");
	//   17   33:aload_2         
	//   18   34:ldc1            #199 <String ", ">
	//   19   36:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
			stringbuilder.append(listenerrecord.taskQueue.size());
	//   21   40:aload_2         
	//   22   41:aload_1         
	//   23   42:getfield        #161 <Field ArrayDeque NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
	//   24   45:invokevirtual   #203 <Method int ArrayDeque.size()>
	//   25   48:invokevirtual   #206 <Method StringBuilder StringBuilder.append(int)>
	//   26   51:pop             
			stringbuilder.append(" queued tasks");
	//   27   52:aload_2         
	//   28   53:ldc1            #208 <String " queued tasks">
	//   29   55:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   30   58:pop             
			Log.d("NotifManCompat", stringbuilder.toString());
	//   31   59:ldc1            #110 <String "NotifManCompat">
	//   32   61:aload_2         
	//   33   62:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   34   65:invokestatic    #211 <Method int Log.d(String, String)>
	//   35   68:pop             
		}
		if(listenerrecord.taskQueue.isEmpty())
	//*  36   69:aload_1         
	//*  37   70:getfield        #161 <Field ArrayDeque NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
	//*  38   73:invokevirtual   #214 <Method boolean ArrayDeque.isEmpty()>
	//*  39   76:ifeq            80
			return;
	//   40   79:return          
		if(ensureServiceBound(listenerrecord) && listenerrecord.service != null) goto _L2; else goto _L1
	//   41   80:aload_0         
	//   42   81:aload_1         
	//   43   82:invokespecial   #216 <Method boolean ensureServiceBound(NotificationManagerCompat$SideChannelManager$ListenerRecord)>
	//   44   85:ifeq            275
	//   45   88:aload_1         
	//   46   89:getfield        #130 <Field INotificationSideChannel NotificationManagerCompat$SideChannelManager$ListenerRecord.service>
	//   47   92:ifnonnull       98
	//*  48   95:goto            275
_L2:
		NotificationManagerCompat.Task task;
		task = (NotificationManagerCompat.Task)listenerrecord.taskQueue.peek();
	//   49   98:aload_1         
	//   50   99:getfield        #161 <Field ArrayDeque NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
	//   51  102:invokevirtual   #219 <Method Object ArrayDeque.peek()>
	//   52  105:checkcast       #221 <Class NotificationManagerCompat$Task>
	//   53  108:astore_2        
		if(task == null)
	//*  54  109:aload_2         
	//*  55  110:ifnonnull       116
			break; /* Loop/switch isn't completed */
	//   56  113:goto            259
		if(Log.isLoggable("NotifManCompat", 3))
	//*  57  116:ldc1            #110 <String "NotifManCompat">
	//*  58  118:iconst_3        
	//*  59  119:invokestatic    #195 <Method boolean Log.isLoggable(String, int)>
	//*  60  122:ifeq            156
		{
			StringBuilder stringbuilder2 = new StringBuilder();
	//   61  125:new             #98  <Class StringBuilder>
	//   62  128:dup             
	//   63  129:invokespecial   #99  <Method void StringBuilder()>
	//   64  132:astore_3        
			stringbuilder2.append("Sending task ");
	//   65  133:aload_3         
	//   66  134:ldc1            #223 <String "Sending task ">
	//   67  136:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   68  139:pop             
			stringbuilder2.append(((Object) (task)));
	//   69  140:aload_3         
	//   70  141:aload_2         
	//   71  142:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//   72  145:pop             
			Log.d("NotifManCompat", stringbuilder2.toString());
	//   73  146:ldc1            #110 <String "NotifManCompat">
	//   74  148:aload_3         
	//   75  149:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   76  152:invokestatic    #211 <Method int Log.d(String, String)>
	//   77  155:pop             
		}
		task.send(listenerrecord.service);
	//   78  156:aload_2         
	//   79  157:aload_1         
	//   80  158:getfield        #130 <Field INotificationSideChannel NotificationManagerCompat$SideChannelManager$ListenerRecord.service>
	//   81  161:invokeinterface #227 <Method void NotificationManagerCompat$Task.send(INotificationSideChannel)>
		listenerrecord.taskQueue.remove();
	//   82  166:aload_1         
	//   83  167:getfield        #161 <Field ArrayDeque NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
	//   84  170:invokevirtual   #230 <Method Object ArrayDeque.remove()>
	//   85  173:pop             
		if(true) goto _L2; else goto _L3
	//   86  174:goto            98
		Object obj;
		obj;
	//   87  177:astore_2        
		StringBuilder stringbuilder3 = new StringBuilder();
	//   88  178:new             #98  <Class StringBuilder>
	//   89  181:dup             
	//   90  182:invokespecial   #99  <Method void StringBuilder()>
	//   91  185:astore_3        
		stringbuilder3.append("RemoteException communicating with ");
	//   92  186:aload_3         
	//   93  187:ldc1            #232 <String "RemoteException communicating with ">
	//   94  189:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   95  192:pop             
		stringbuilder3.append(((Object) (listenerrecord.componentName)));
	//   96  193:aload_3         
	//   97  194:aload_1         
	//   98  195:getfield        #82  <Field ComponentName NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName>
	//   99  198:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//  100  201:pop             
		Log.w("NotifManCompat", stringbuilder3.toString(), ((Throwable) (obj)));
	//  101  202:ldc1            #110 <String "NotifManCompat">
	//  102  204:aload_3         
	//  103  205:invokevirtual   #114 <Method String StringBuilder.toString()>
	//  104  208:aload_2         
	//  105  209:invokestatic    #235 <Method int Log.w(String, String, Throwable)>
	//  106  212:pop             
		  goto _L3
	//* 107  213:goto            259
_L5:
		if(Log.isLoggable("NotifManCompat", 3))
	//* 108  216:ldc1            #110 <String "NotifManCompat">
	//* 109  218:iconst_3        
	//* 110  219:invokestatic    #195 <Method boolean Log.isLoggable(String, int)>
	//* 111  222:ifeq            259
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//  112  225:new             #98  <Class StringBuilder>
	//  113  228:dup             
	//  114  229:invokespecial   #99  <Method void StringBuilder()>
	//  115  232:astore_2        
			stringbuilder1.append("Remote service has died: ");
	//  116  233:aload_2         
	//  117  234:ldc1            #237 <String "Remote service has died: ">
	//  118  236:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  119  239:pop             
			stringbuilder1.append(((Object) (listenerrecord.componentName)));
	//  120  240:aload_2         
	//  121  241:aload_1         
	//  122  242:getfield        #82  <Field ComponentName NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName>
	//  123  245:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//  124  248:pop             
			Log.d("NotifManCompat", stringbuilder1.toString());
	//  125  249:ldc1            #110 <String "NotifManCompat">
	//  126  251:aload_2         
	//  127  252:invokevirtual   #114 <Method String StringBuilder.toString()>
	//  128  255:invokestatic    #211 <Method int Log.d(String, String)>
	//  129  258:pop             
		}
_L3:
		if(!listenerrecord.taskQueue.isEmpty())
	//* 130  259:aload_1         
	//* 131  260:getfield        #161 <Field ArrayDeque NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
	//* 132  263:invokevirtual   #214 <Method boolean ArrayDeque.isEmpty()>
	//* 133  266:ifne            274
			scheduleListenerRetry(listenerrecord);
	//  134  269:aload_0         
	//  135  270:aload_1         
	//  136  271:invokespecial   #240 <Method void scheduleListenerRetry(NotificationManagerCompat$SideChannelManager$ListenerRecord)>
		return;
	//  137  274:return          
_L1:
		scheduleListenerRetry(listenerrecord);
	//  138  275:aload_0         
	//  139  276:aload_1         
	//  140  277:invokespecial   #240 <Method void scheduleListenerRetry(NotificationManagerCompat$SideChannelManager$ListenerRecord)>
		return;
	//  141  280:return          
		stringbuilder1;
	//  142  281:astore_2        
		if(true) goto _L5; else goto _L4
_L4:
	//* 143  282:goto            216
	}

	private void scheduleListenerRetry(ListenerRecord listenerrecord)
	{
		if(mHandler.hasMessages(3, ((Object) (listenerrecord.componentName))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field Handler mHandler>
	//*   2    4:iconst_3        
	//*   3    5:aload_1         
	//*   4    6:getfield        #82  <Field ComponentName NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName>
	//*   5    9:invokevirtual   #244 <Method boolean Handler.hasMessages(int, Object)>
	//*   6   12:ifeq            16
			return;
	//    7   15:return          
		listenerrecord.retryCount = listenerrecord.retryCount + 1;
	//    8   16:aload_1         
	//    9   17:aload_1         
	//   10   18:getfield        #96  <Field int NotificationManagerCompat$SideChannelManager$ListenerRecord.retryCount>
	//   11   21:iconst_1        
	//   12   22:iadd            
	//   13   23:putfield        #96  <Field int NotificationManagerCompat$SideChannelManager$ListenerRecord.retryCount>
		if(listenerrecord.retryCount > 6)
	//*  14   26:aload_1         
	//*  15   27:getfield        #96  <Field int NotificationManagerCompat$SideChannelManager$ListenerRecord.retryCount>
	//*  16   30:bipush          6
	//*  17   32:icmple          119
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   18   35:new             #98  <Class StringBuilder>
	//   19   38:dup             
	//   20   39:invokespecial   #99  <Method void StringBuilder()>
	//   21   42:astore_3        
			stringbuilder.append("Giving up on delivering ");
	//   22   43:aload_3         
	//   23   44:ldc1            #246 <String "Giving up on delivering ">
	//   24   46:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
			stringbuilder.append(listenerrecord.taskQueue.size());
	//   26   50:aload_3         
	//   27   51:aload_1         
	//   28   52:getfield        #161 <Field ArrayDeque NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
	//   29   55:invokevirtual   #203 <Method int ArrayDeque.size()>
	//   30   58:invokevirtual   #206 <Method StringBuilder StringBuilder.append(int)>
	//   31   61:pop             
			stringbuilder.append(" tasks to ");
	//   32   62:aload_3         
	//   33   63:ldc1            #248 <String " tasks to ">
	//   34   65:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   35   68:pop             
			stringbuilder.append(((Object) (listenerrecord.componentName)));
	//   36   69:aload_3         
	//   37   70:aload_1         
	//   38   71:getfield        #82  <Field ComponentName NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName>
	//   39   74:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//   40   77:pop             
			stringbuilder.append(" after ");
	//   41   78:aload_3         
	//   42   79:ldc1            #250 <String " after ">
	//   43   81:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   44   84:pop             
			stringbuilder.append(listenerrecord.retryCount);
	//   45   85:aload_3         
	//   46   86:aload_1         
	//   47   87:getfield        #96  <Field int NotificationManagerCompat$SideChannelManager$ListenerRecord.retryCount>
	//   48   90:invokevirtual   #206 <Method StringBuilder StringBuilder.append(int)>
	//   49   93:pop             
			stringbuilder.append(" retries");
	//   50   94:aload_3         
	//   51   95:ldc1            #252 <String " retries">
	//   52   97:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   53  100:pop             
			Log.w("NotifManCompat", stringbuilder.toString());
	//   54  101:ldc1            #110 <String "NotifManCompat">
	//   55  103:aload_3         
	//   56  104:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   57  107:invokestatic    #120 <Method int Log.w(String, String)>
	//   58  110:pop             
			listenerrecord.taskQueue.clear();
	//   59  111:aload_1         
	//   60  112:getfield        #161 <Field ArrayDeque NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
	//   61  115:invokevirtual   #255 <Method void ArrayDeque.clear()>
			return;
	//   62  118:return          
		}
		int i = (1 << listenerrecord.retryCount - 1) * 1000;
	//   63  119:iconst_1        
	//   64  120:aload_1         
	//   65  121:getfield        #96  <Field int NotificationManagerCompat$SideChannelManager$ListenerRecord.retryCount>
	//   66  124:iconst_1        
	//   67  125:isub            
	//   68  126:ishl            
	//   69  127:sipush          1000
	//   70  130:imul            
	//   71  131:istore_2        
		if(Log.isLoggable("NotifManCompat", 3))
	//*  72  132:ldc1            #110 <String "NotifManCompat">
	//*  73  134:iconst_3        
	//*  74  135:invokestatic    #195 <Method boolean Log.isLoggable(String, int)>
	//*  75  138:ifeq            181
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   76  141:new             #98  <Class StringBuilder>
	//   77  144:dup             
	//   78  145:invokespecial   #99  <Method void StringBuilder()>
	//   79  148:astore_3        
			stringbuilder1.append("Scheduling retry for ");
	//   80  149:aload_3         
	//   81  150:ldc2            #257 <String "Scheduling retry for ">
	//   82  153:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   83  156:pop             
			stringbuilder1.append(i);
	//   84  157:aload_3         
	//   85  158:iload_2         
	//   86  159:invokevirtual   #206 <Method StringBuilder StringBuilder.append(int)>
	//   87  162:pop             
			stringbuilder1.append(" ms");
	//   88  163:aload_3         
	//   89  164:ldc2            #259 <String " ms">
	//   90  167:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   91  170:pop             
			Log.d("NotifManCompat", stringbuilder1.toString());
	//   92  171:ldc1            #110 <String "NotifManCompat">
	//   93  173:aload_3         
	//   94  174:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   95  177:invokestatic    #211 <Method int Log.d(String, String)>
	//   96  180:pop             
		}
		listenerrecord = ((ListenerRecord) (mHandler.obtainMessage(3, ((Object) (listenerrecord.componentName)))));
	//   97  181:aload_0         
	//   98  182:getfield        #66  <Field Handler mHandler>
	//   99  185:iconst_3        
	//  100  186:aload_1         
	//  101  187:getfield        #82  <Field ComponentName NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName>
	//  102  190:invokevirtual   #263 <Method Message Handler.obtainMessage(int, Object)>
	//  103  193:astore_1        
		mHandler.sendMessageDelayed(((Message) (listenerrecord)), i);
	//  104  194:aload_0         
	//  105  195:getfield        #66  <Field Handler mHandler>
	//  106  198:aload_1         
	//  107  199:iload_2         
	//  108  200:i2l             
	//  109  201:invokevirtual   #267 <Method boolean Handler.sendMessageDelayed(Message, long)>
	//  110  204:pop             
	//  111  205:return          
	}

	private void updateListenerMap()
	{
		Object obj = ((Object) (NotificationManagerCompat.getEnabledListenerPackages(mContext)));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Context mContext>
	//    2    4:invokestatic    #271 <Method Set NotificationManagerCompat.getEnabledListenerPackages(Context)>
	//    3    7:astore_2        
		if(((Set) (obj)).equals(((Object) (mCachedEnabledPackages))))
	//*   4    8:aload_2         
	//*   5    9:aload_0         
	//*   6   10:getfield        #41  <Field Set mCachedEnabledPackages>
	//*   7   13:invokeinterface #276 <Method boolean Set.equals(Object)>
	//*   8   18:ifeq            22
			return;
	//    9   21:return          
		mCachedEnabledPackages = ((Set) (obj));
	//   10   22:aload_0         
	//   11   23:aload_2         
	//   12   24:putfield        #41  <Field Set mCachedEnabledPackages>
		Object obj1 = ((Object) (mContext.getPackageManager().queryIntentServices((new Intent()).setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0)));
	//   13   27:aload_0         
	//   14   28:getfield        #43  <Field Context mContext>
	//   15   31:invokevirtual   #280 <Method PackageManager Context.getPackageManager()>
	//   16   34:new             #75  <Class Intent>
	//   17   37:dup             
	//   18   38:invokespecial   #281 <Method void Intent()>
	//   19   41:ldc1            #77  <String "android.support.BIND_NOTIFICATION_SIDE_CHANNEL">
	//   20   43:invokevirtual   #285 <Method Intent Intent.setAction(String)>
	//   21   46:iconst_0        
	//   22   47:invokevirtual   #291 <Method List PackageManager.queryIntentServices(Intent, int)>
	//   23   50:astore_3        
		HashSet hashset = new HashSet();
	//   24   51:new             #38  <Class HashSet>
	//   25   54:dup             
	//   26   55:invokespecial   #39  <Method void HashSet()>
	//   27   58:astore_1        
		obj1 = ((Object) (((List) (obj1)).iterator()));
	//   28   59:aload_3         
	//   29   60:invokeinterface #294 <Method Iterator List.iterator()>
	//   30   65:astore_3        
		do
		{
			if(!((Iterator) (obj1)).hasNext())
				break;
	//   31   66:aload_3         
	//   32   67:invokeinterface #153 <Method boolean Iterator.hasNext()>
	//   33   72:ifeq            203
			ResolveInfo resolveinfo = (ResolveInfo)((Iterator) (obj1)).next();
	//   34   75:aload_3         
	//   35   76:invokeinterface #157 <Method Object Iterator.next()>
	//   36   81:checkcast       #296 <Class ResolveInfo>
	//   37   84:astore          5
			if(((Set) (obj)).contains(((Object) (resolveinfo.serviceInfo.packageName))))
	//*  38   86:aload_2         
	//*  39   87:aload           5
	//*  40   89:getfield        #300 <Field ServiceInfo ResolveInfo.serviceInfo>
	//*  41   92:getfield        #306 <Field String ServiceInfo.packageName>
	//*  42   95:invokeinterface #309 <Method boolean Set.contains(Object)>
	//*  43  100:ifne            106
	//*  44  103:goto            66
			{
				ComponentName componentname1 = new ComponentName(resolveinfo.serviceInfo.packageName, resolveinfo.serviceInfo.name);
	//   45  106:new             #311 <Class ComponentName>
	//   46  109:dup             
	//   47  110:aload           5
	//   48  112:getfield        #300 <Field ServiceInfo ResolveInfo.serviceInfo>
	//   49  115:getfield        #306 <Field String ServiceInfo.packageName>
	//   50  118:aload           5
	//   51  120:getfield        #300 <Field ServiceInfo ResolveInfo.serviceInfo>
	//   52  123:getfield        #314 <Field String ServiceInfo.name>
	//   53  126:invokespecial   #317 <Method void ComponentName(String, String)>
	//   54  129:astore          4
				if(resolveinfo.serviceInfo.permission != null)
	//*  55  131:aload           5
	//*  56  133:getfield        #300 <Field ServiceInfo ResolveInfo.serviceInfo>
	//*  57  136:getfield        #320 <Field String ServiceInfo.permission>
	//*  58  139:ifnull          191
				{
					StringBuilder stringbuilder2 = new StringBuilder();
	//   59  142:new             #98  <Class StringBuilder>
	//   60  145:dup             
	//   61  146:invokespecial   #99  <Method void StringBuilder()>
	//   62  149:astore          5
					stringbuilder2.append("Permission present on component ");
	//   63  151:aload           5
	//   64  153:ldc2            #322 <String "Permission present on component ">
	//   65  156:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   66  159:pop             
					stringbuilder2.append(((Object) (componentname1)));
	//   67  160:aload           5
	//   68  162:aload           4
	//   69  164:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//   70  167:pop             
					stringbuilder2.append(", not adding listener record.");
	//   71  168:aload           5
	//   72  170:ldc2            #324 <String ", not adding listener record.">
	//   73  173:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   74  176:pop             
					Log.w("NotifManCompat", stringbuilder2.toString());
	//   75  177:ldc1            #110 <String "NotifManCompat">
	//   76  179:aload           5
	//   77  181:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   78  184:invokestatic    #120 <Method int Log.w(String, String)>
	//   79  187:pop             
				} else
	//*  80  188:goto            66
				{
					((Set) (hashset)).add(((Object) (componentname1)));
	//   81  191:aload_1         
	//   82  192:aload           4
	//   83  194:invokeinterface #325 <Method boolean Set.add(Object)>
	//   84  199:pop             
				}
			}
		} while(true);
	//   85  200:goto            66
		obj = ((Object) (((Set) (hashset)).iterator()));
	//   86  203:aload_1         
	//   87  204:invokeinterface #326 <Method Iterator Set.iterator()>
	//   88  209:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   89  210:aload_2         
	//   90  211:invokeinterface #153 <Method boolean Iterator.hasNext()>
	//   91  216:ifeq            309
			ComponentName componentname = (ComponentName)((Iterator) (obj)).next();
	//   92  219:aload_2         
	//   93  220:invokeinterface #157 <Method Object Iterator.next()>
	//   94  225:checkcast       #311 <Class ComponentName>
	//   95  228:astore_3        
			if(!mRecordMap.containsKey(((Object) (componentname))))
	//*  96  229:aload_0         
	//*  97  230:getfield        #36  <Field Map mRecordMap>
	//*  98  233:aload_3         
	//*  99  234:invokeinterface #329 <Method boolean Map.containsKey(Object)>
	//* 100  239:ifne            210
			{
				if(Log.isLoggable("NotifManCompat", 3))
	//* 101  242:ldc1            #110 <String "NotifManCompat">
	//* 102  244:iconst_3        
	//* 103  245:invokestatic    #195 <Method boolean Log.isLoggable(String, int)>
	//* 104  248:ifeq            287
				{
					StringBuilder stringbuilder = new StringBuilder();
	//  105  251:new             #98  <Class StringBuilder>
	//  106  254:dup             
	//  107  255:invokespecial   #99  <Method void StringBuilder()>
	//  108  258:astore          4
					stringbuilder.append("Adding listener record for ");
	//  109  260:aload           4
	//  110  262:ldc2            #331 <String "Adding listener record for ">
	//  111  265:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  112  268:pop             
					stringbuilder.append(((Object) (componentname)));
	//  113  269:aload           4
	//  114  271:aload_3         
	//  115  272:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//  116  275:pop             
					Log.d("NotifManCompat", stringbuilder.toString());
	//  117  276:ldc1            #110 <String "NotifManCompat">
	//  118  278:aload           4
	//  119  280:invokevirtual   #114 <Method String StringBuilder.toString()>
	//  120  283:invokestatic    #211 <Method int Log.d(String, String)>
	//  121  286:pop             
				}
				mRecordMap.put(((Object) (componentname)), ((Object) (new ListenerRecord(componentname))));
	//  122  287:aload_0         
	//  123  288:getfield        #36  <Field Map mRecordMap>
	//  124  291:aload_3         
	//  125  292:new             #13  <Class NotificationManagerCompat$SideChannelManager$ListenerRecord>
	//  126  295:dup             
	//  127  296:aload_3         
	//  128  297:invokespecial   #333 <Method void NotificationManagerCompat$SideChannelManager$ListenerRecord(ComponentName)>
	//  129  300:invokeinterface #337 <Method Object Map.put(Object, Object)>
	//  130  305:pop             
			}
		} while(true);
	//  131  306:goto            210
		obj = ((Object) (mRecordMap.entrySet().iterator()));
	//  132  309:aload_0         
	//  133  310:getfield        #36  <Field Map mRecordMap>
	//  134  313:invokeinterface #341 <Method Set Map.entrySet()>
	//  135  318:invokeinterface #326 <Method Iterator Set.iterator()>
	//  136  323:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//  137  324:aload_2         
	//  138  325:invokeinterface #153 <Method boolean Iterator.hasNext()>
	//  139  330:ifeq            430
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//  140  333:aload_2         
	//  141  334:invokeinterface #157 <Method Object Iterator.next()>
	//  142  339:checkcast       #343 <Class java.util.Map$Entry>
	//  143  342:astore_3        
			if(!((Set) (hashset)).contains(entry.getKey()))
	//* 144  343:aload_1         
	//* 145  344:aload_3         
	//* 146  345:invokeinterface #346 <Method Object java.util.Map$Entry.getKey()>
	//* 147  350:invokeinterface #309 <Method boolean Set.contains(Object)>
	//* 148  355:ifne            324
			{
				if(Log.isLoggable("NotifManCompat", 3))
	//* 149  358:ldc1            #110 <String "NotifManCompat">
	//* 150  360:iconst_3        
	//* 151  361:invokestatic    #195 <Method boolean Log.isLoggable(String, int)>
	//* 152  364:ifeq            408
				{
					StringBuilder stringbuilder1 = new StringBuilder();
	//  153  367:new             #98  <Class StringBuilder>
	//  154  370:dup             
	//  155  371:invokespecial   #99  <Method void StringBuilder()>
	//  156  374:astore          4
					stringbuilder1.append("Removing listener record for ");
	//  157  376:aload           4
	//  158  378:ldc2            #348 <String "Removing listener record for ">
	//  159  381:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//  160  384:pop             
					stringbuilder1.append(entry.getKey());
	//  161  385:aload           4
	//  162  387:aload_3         
	//  163  388:invokeinterface #346 <Method Object java.util.Map$Entry.getKey()>
	//  164  393:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//  165  396:pop             
					Log.d("NotifManCompat", stringbuilder1.toString());
	//  166  397:ldc1            #110 <String "NotifManCompat">
	//  167  399:aload           4
	//  168  401:invokevirtual   #114 <Method String StringBuilder.toString()>
	//  169  404:invokestatic    #211 <Method int Log.d(String, String)>
	//  170  407:pop             
				}
				ensureServiceUnbound((ListenerRecord)entry.getValue());
	//  171  408:aload_0         
	//  172  409:aload_3         
	//  173  410:invokeinterface #351 <Method Object java.util.Map$Entry.getValue()>
	//  174  415:checkcast       #13  <Class NotificationManagerCompat$SideChannelManager$ListenerRecord>
	//  175  418:invokespecial   #187 <Method void ensureServiceUnbound(NotificationManagerCompat$SideChannelManager$ListenerRecord)>
				((Iterator) (obj)).remove();
	//  176  421:aload_2         
	//  177  422:invokeinterface #353 <Method void Iterator.remove()>
			}
		} while(true);
	//  178  427:goto            324
	//  179  430:return          
	}

	public boolean handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #360 <Field int Message.what>
		{
	//*   2    4:tableswitch     0 3: default 36
	//	               0 86
	//	               1 64
	//	               2 51
	//	               3 38
		default:
			return false;
	//    3   36:iconst_0        
	//    4   37:ireturn         

		case 3: // '\003'
			handleRetryListenerQueue((ComponentName)message.obj);
	//    5   38:aload_0         
	//    6   39:aload_1         
	//    7   40:getfield        #364 <Field Object Message.obj>
	//    8   43:checkcast       #311 <Class ComponentName>
	//    9   46:invokespecial   #366 <Method void handleRetryListenerQueue(ComponentName)>
			return true;
	//   10   49:iconst_1        
	//   11   50:ireturn         

		case 2: // '\002'
			handleServiceDisconnected((ComponentName)message.obj);
	//   12   51:aload_0         
	//   13   52:aload_1         
	//   14   53:getfield        #364 <Field Object Message.obj>
	//   15   56:checkcast       #311 <Class ComponentName>
	//   16   59:invokespecial   #368 <Method void handleServiceDisconnected(ComponentName)>
			return true;
	//   17   62:iconst_1        
	//   18   63:ireturn         

		case 1: // '\001'
			message = ((Message) ((nt)message.obj));
	//   19   64:aload_1         
	//   20   65:getfield        #364 <Field Object Message.obj>
	//   21   68:checkcast       #370 <Class NotificationManagerCompat$ServiceConnectedEvent>
	//   22   71:astore_1        
			handleServiceConnected(((nt) (message)).componentName, ((nt) (message)).iBinder);
	//   23   72:aload_0         
	//   24   73:aload_1         
	//   25   74:getfield        #371 <Field ComponentName NotificationManagerCompat$ServiceConnectedEvent.componentName>
	//   26   77:aload_1         
	//   27   78:getfield        #375 <Field IBinder NotificationManagerCompat$ServiceConnectedEvent.iBinder>
	//   28   81:invokespecial   #377 <Method void handleServiceConnected(ComponentName, IBinder)>
			return true;
	//   29   84:iconst_1        
	//   30   85:ireturn         

		case 0: // '\0'
			handleQueueTask((NotificationManagerCompat.Task)message.obj);
	//   31   86:aload_0         
	//   32   87:aload_1         
	//   33   88:getfield        #364 <Field Object Message.obj>
	//   34   91:checkcast       #221 <Class NotificationManagerCompat$Task>
	//   35   94:invokespecial   #379 <Method void handleQueueTask(NotificationManagerCompat$Task)>
			return true;
	//   36   97:iconst_1        
	//   37   98:ireturn         
		}
	}

	public void onServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		if(Log.isLoggable("NotifManCompat", 3))
	//*   0    0:ldc1            #110 <String "NotifManCompat">
	//*   1    2:iconst_3        
	//*   2    3:invokestatic    #195 <Method boolean Log.isLoggable(String, int)>
	//*   3    6:ifeq            41
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    9:new             #98  <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #99  <Method void StringBuilder()>
	//    7   16:astore_3        
			stringbuilder.append("Connected to service ");
	//    8   17:aload_3         
	//    9   18:ldc2            #382 <String "Connected to service ">
	//   10   21:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
			stringbuilder.append(((Object) (componentname)));
	//   12   25:aload_3         
	//   13   26:aload_1         
	//   14   27:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//   15   30:pop             
			Log.d("NotifManCompat", stringbuilder.toString());
	//   16   31:ldc1            #110 <String "NotifManCompat">
	//   17   33:aload_3         
	//   18   34:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   19   37:invokestatic    #211 <Method int Log.d(String, String)>
	//   20   40:pop             
		}
		mHandler.obtainMessage(1, ((Object) (new nt(componentname, ibinder)))).sendToTarget();
	//   21   41:aload_0         
	//   22   42:getfield        #66  <Field Handler mHandler>
	//   23   45:iconst_1        
	//   24   46:new             #370 <Class NotificationManagerCompat$ServiceConnectedEvent>
	//   25   49:dup             
	//   26   50:aload_1         
	//   27   51:aload_2         
	//   28   52:invokespecial   #384 <Method void NotificationManagerCompat$ServiceConnectedEvent(ComponentName, IBinder)>
	//   29   55:invokevirtual   #263 <Method Message Handler.obtainMessage(int, Object)>
	//   30   58:invokevirtual   #387 <Method void Message.sendToTarget()>
	//   31   61:return          
	}

	public void onServiceDisconnected(ComponentName componentname)
	{
		if(Log.isLoggable("NotifManCompat", 3))
	//*   0    0:ldc1            #110 <String "NotifManCompat">
	//*   1    2:iconst_3        
	//*   2    3:invokestatic    #195 <Method boolean Log.isLoggable(String, int)>
	//*   3    6:ifeq            41
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    9:new             #98  <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #99  <Method void StringBuilder()>
	//    7   16:astore_2        
			stringbuilder.append("Disconnected from service ");
	//    8   17:aload_2         
	//    9   18:ldc2            #390 <String "Disconnected from service ">
	//   10   21:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
			stringbuilder.append(((Object) (componentname)));
	//   12   25:aload_2         
	//   13   26:aload_1         
	//   14   27:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//   15   30:pop             
			Log.d("NotifManCompat", stringbuilder.toString());
	//   16   31:ldc1            #110 <String "NotifManCompat">
	//   17   33:aload_2         
	//   18   34:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   19   37:invokestatic    #211 <Method int Log.d(String, String)>
	//   20   40:pop             
		}
		mHandler.obtainMessage(2, ((Object) (componentname))).sendToTarget();
	//   21   41:aload_0         
	//   22   42:getfield        #66  <Field Handler mHandler>
	//   23   45:iconst_2        
	//   24   46:aload_1         
	//   25   47:invokevirtual   #263 <Method Message Handler.obtainMessage(int, Object)>
	//   26   50:invokevirtual   #387 <Method void Message.sendToTarget()>
	//   27   53:return          
	}

	public void queueTask(NotificationManagerCompat.Task task)
	{
		mHandler.obtainMessage(0, ((Object) (task))).sendToTarget();
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Handler mHandler>
	//    2    4:iconst_0        
	//    3    5:aload_1         
	//    4    6:invokevirtual   #263 <Method Message Handler.obtainMessage(int, Object)>
	//    5    9:invokevirtual   #387 <Method void Message.sendToTarget()>
	//    6   12:return          
	}

	private Set mCachedEnabledPackages;
	private final Context mContext;
	private final Handler mHandler;
	private final HandlerThread mHandlerThread = new HandlerThread("NotificationManagerCompat");
	private final Map mRecordMap = new HashMap();

	NotificationManagerCompat$SideChannelManager(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #33  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void HashMap()>
	//    6   12:putfield        #36  <Field Map mRecordMap>
		mCachedEnabledPackages = ((Set) (new HashSet()));
	//    7   15:aload_0         
	//    8   16:new             #38  <Class HashSet>
	//    9   19:dup             
	//   10   20:invokespecial   #39  <Method void HashSet()>
	//   11   23:putfield        #41  <Field Set mCachedEnabledPackages>
		mContext = context;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #43  <Field Context mContext>
	//   15   31:aload_0         
	//   16   32:new             #45  <Class HandlerThread>
	//   17   35:dup             
	//   18   36:ldc1            #47  <String "NotificationManagerCompat">
	//   19   38:invokespecial   #50  <Method void HandlerThread(String)>
	//   20   41:putfield        #52  <Field HandlerThread mHandlerThread>
		mHandlerThread.start();
	//   21   44:aload_0         
	//   22   45:getfield        #52  <Field HandlerThread mHandlerThread>
	//   23   48:invokevirtual   #55  <Method void HandlerThread.start()>
		mHandler = new Handler(mHandlerThread.getLooper(), ((android.os.Handler.Callback) (this)));
	//   24   51:aload_0         
	//   25   52:new             #57  <Class Handler>
	//   26   55:dup             
	//   27   56:aload_0         
	//   28   57:getfield        #52  <Field HandlerThread mHandlerThread>
	//   29   60:invokevirtual   #61  <Method android.os.Looper HandlerThread.getLooper()>
	//   30   63:aload_0         
	//   31   64:invokespecial   #64  <Method void Handler(android.os.Looper, android.os.Handler$Callback)>
	//   32   67:putfield        #66  <Field Handler mHandler>
	//   33   70:return          
	}
}
