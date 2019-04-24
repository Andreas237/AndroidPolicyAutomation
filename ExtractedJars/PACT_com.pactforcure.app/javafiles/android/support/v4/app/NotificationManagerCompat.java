// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.*;
import android.content.*;
import android.content.pm.*;
import android.os.*;
import android.util.Log;
import java.lang.reflect.*;
import java.util.*;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, INotificationSideChannel

public final class NotificationManagerCompat
{
	private static class CancelTask
		implements Task
	{

		public void send(INotificationSideChannel inotificationsidechannel)
			throws RemoteException
		{
			if(all)
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field boolean all>
		//*   2    4:ifeq            18
			{
				inotificationsidechannel.cancelAll(packageName);
		//    3    7:aload_1         
		//    4    8:aload_0         
		//    5    9:getfield        #23  <Field String packageName>
		//    6   12:invokeinterface #40  <Method void INotificationSideChannel.cancelAll(String)>
				return;
		//    7   17:return          
			} else
			{
				inotificationsidechannel.cancel(packageName, id, tag);
		//    8   18:aload_1         
		//    9   19:aload_0         
		//   10   20:getfield        #23  <Field String packageName>
		//   11   23:aload_0         
		//   12   24:getfield        #25  <Field int id>
		//   13   27:aload_0         
		//   14   28:getfield        #27  <Field String tag>
		//   15   31:invokeinterface #43  <Method void INotificationSideChannel.cancel(String, int, String)>
				return;
		//   16   36:return          
			}
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder("CancelTask[");
		//    0    0:new             #48  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:ldc1            #50  <String "CancelTask[">
		//    3    6:invokespecial   #52  <Method void StringBuilder(String)>
		//    4    9:astore_1        
			stringbuilder.append("packageName:").append(packageName);
		//    5   10:aload_1         
		//    6   11:ldc1            #54  <String "packageName:">
		//    7   13:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//    8   16:aload_0         
		//    9   17:getfield        #23  <Field String packageName>
		//   10   20:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   11   23:pop             
			stringbuilder.append(", id:").append(id);
		//   12   24:aload_1         
		//   13   25:ldc1            #60  <String ", id:">
		//   14   27:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   15   30:aload_0         
		//   16   31:getfield        #25  <Field int id>
		//   17   34:invokevirtual   #63  <Method StringBuilder StringBuilder.append(int)>
		//   18   37:pop             
			stringbuilder.append(", tag:").append(tag);
		//   19   38:aload_1         
		//   20   39:ldc1            #65  <String ", tag:">
		//   21   41:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   22   44:aload_0         
		//   23   45:getfield        #27  <Field String tag>
		//   24   48:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   25   51:pop             
			stringbuilder.append(", all:").append(all);
		//   26   52:aload_1         
		//   27   53:ldc1            #67  <String ", all:">
		//   28   55:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   29   58:aload_0         
		//   30   59:getfield        #29  <Field boolean all>
		//   31   62:invokevirtual   #70  <Method StringBuilder StringBuilder.append(boolean)>
		//   32   65:pop             
			stringbuilder.append("]");
		//   33   66:aload_1         
		//   34   67:ldc1            #72  <String "]">
		//   35   69:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   36   72:pop             
			return stringbuilder.toString();
		//   37   73:aload_1         
		//   38   74:invokevirtual   #74  <Method String StringBuilder.toString()>
		//   39   77:areturn         
		}

		final boolean all;
		final int id;
		final String packageName;
		final String tag;

		CancelTask(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			packageName = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field String packageName>
			id = 0;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #25  <Field int id>
			tag = null;
		//    8   14:aload_0         
		//    9   15:aconst_null     
		//   10   16:putfield        #27  <Field String tag>
			all = true;
		//   11   19:aload_0         
		//   12   20:iconst_1        
		//   13   21:putfield        #29  <Field boolean all>
		//   14   24:return          
		}

		CancelTask(String s, int i, String s1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			packageName = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field String packageName>
			id = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #25  <Field int id>
			tag = s1;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #27  <Field String tag>
			all = false;
		//   11   19:aload_0         
		//   12   20:iconst_0        
		//   13   21:putfield        #29  <Field boolean all>
		//   14   24:return          
		}
	}

	private static class NotifyTask
		implements Task
	{

		public void send(INotificationSideChannel inotificationsidechannel)
			throws RemoteException
		{
			inotificationsidechannel.notify(packageName, id, tag, notif);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #23  <Field String packageName>
		//    3    5:aload_0         
		//    4    6:getfield        #25  <Field int id>
		//    5    9:aload_0         
		//    6   10:getfield        #27  <Field String tag>
		//    7   13:aload_0         
		//    8   14:getfield        #29  <Field Notification notif>
		//    9   17:invokeinterface #39  <Method void INotificationSideChannel.notify(String, int, String, Notification)>
		//   10   22:return          
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder("NotifyTask[");
		//    0    0:new             #44  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:ldc1            #46  <String "NotifyTask[">
		//    3    6:invokespecial   #49  <Method void StringBuilder(String)>
		//    4    9:astore_1        
			stringbuilder.append("packageName:").append(packageName);
		//    5   10:aload_1         
		//    6   11:ldc1            #51  <String "packageName:">
		//    7   13:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//    8   16:aload_0         
		//    9   17:getfield        #23  <Field String packageName>
		//   10   20:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   11   23:pop             
			stringbuilder.append(", id:").append(id);
		//   12   24:aload_1         
		//   13   25:ldc1            #57  <String ", id:">
		//   14   27:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   15   30:aload_0         
		//   16   31:getfield        #25  <Field int id>
		//   17   34:invokevirtual   #60  <Method StringBuilder StringBuilder.append(int)>
		//   18   37:pop             
			stringbuilder.append(", tag:").append(tag);
		//   19   38:aload_1         
		//   20   39:ldc1            #62  <String ", tag:">
		//   21   41:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   22   44:aload_0         
		//   23   45:getfield        #27  <Field String tag>
		//   24   48:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   25   51:pop             
			stringbuilder.append("]");
		//   26   52:aload_1         
		//   27   53:ldc1            #64  <String "]">
		//   28   55:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   29   58:pop             
			return stringbuilder.toString();
		//   30   59:aload_1         
		//   31   60:invokevirtual   #66  <Method String StringBuilder.toString()>
		//   32   63:areturn         
		}

		final int id;
		final Notification notif;
		final String packageName;
		final String tag;

		NotifyTask(String s, int i, String s1, Notification notification)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			packageName = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field String packageName>
			id = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #25  <Field int id>
			tag = s1;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #27  <Field String tag>
			notif = notification;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #29  <Field Notification notif>
		//   14   25:return          
		}
	}

	private static class ServiceConnectedEvent
	{

		final ComponentName componentName;
		final IBinder iBinder;

		ServiceConnectedEvent(ComponentName componentname, IBinder ibinder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			componentName = componentname;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field ComponentName componentName>
			iBinder = ibinder;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field IBinder iBinder>
		//    8   14:return          
		}
	}

	private static class SideChannelManager
		implements android.os.Handler.Callback, ServiceConnection
	{

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

		private void handleQueueTask(Task task)
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
			Task task;
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
			if((task = (Task)listenerrecord.taskQueue.peek()) != null) goto _L5; else goto _L4
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
		//		               0 38
		//		               1 51
		//		               2 73
		//		               3 86
			default:
				return false;
		//    3   36:iconst_0        
		//    4   37:ireturn         

			case 0: // '\0'
				handleQueueTask((Task)message.obj);
		//    5   38:aload_0         
		//    6   39:aload_1         
		//    7   40:getfield        #372 <Field Object Message.obj>
		//    8   43:checkcast       #231 <Class NotificationManagerCompat$Task>
		//    9   46:invokespecial   #374 <Method void handleQueueTask(NotificationManagerCompat$Task)>
				return true;
		//   10   49:iconst_1        
		//   11   50:ireturn         

			case 1: // '\001'
				message = ((Message) ((ServiceConnectedEvent)message.obj));
		//   12   51:aload_1         
		//   13   52:getfield        #372 <Field Object Message.obj>
		//   14   55:checkcast       #376 <Class NotificationManagerCompat$ServiceConnectedEvent>
		//   15   58:astore_1        
				handleServiceConnected(((ServiceConnectedEvent) (message)).componentName, ((ServiceConnectedEvent) (message)).iBinder);
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
			mHandler.obtainMessage(1, ((Object) (new ServiceConnectedEvent(componentname, ibinder)))).sendToTarget();
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

		public void queueTask(Task task)
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

		public SideChannelManager(Context context)
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

	private static class SideChannelManager.ListenerRecord
	{

		public boolean bound;
		public final ComponentName componentName;
		public int retryCount;
		public INotificationSideChannel service;
		public LinkedList taskQueue;

		public SideChannelManager.ListenerRecord(ComponentName componentname)
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

	private static interface Task
	{

		public abstract void send(INotificationSideChannel inotificationsidechannel)
			throws RemoteException;
	}


	private NotificationManagerCompat(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #94  <Field Context mContext>
		mNotificationManager = (NotificationManager)mContext.getSystemService("notification");
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #94  <Field Context mContext>
	//    8   14:ldc1            #96  <String "notification">
	//    9   16:invokevirtual   #102 <Method Object Context.getSystemService(String)>
	//   10   19:checkcast       #104 <Class NotificationManager>
	//   11   22:putfield        #106 <Field NotificationManager mNotificationManager>
	//   12   25:return          
	}

	public static NotificationManagerCompat from(Context context)
	{
		return new NotificationManagerCompat(context);
	//    0    0:new             #2   <Class NotificationManagerCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #110 <Method void NotificationManagerCompat(Context)>
	//    4    8:areturn         
	}

	public static Set getEnabledListenerPackages(Context context)
	{
		Object obj = ((Object) (android.provider.Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners")));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #116 <Method android.content.ContentResolver Context.getContentResolver()>
	//    2    4:ldc1            #54  <String "enabled_notification_listeners">
	//    3    6:invokestatic    #122 <Method String android.provider.Settings$Secure.getString(android.content.ContentResolver, String)>
	//    4    9:astore_3        
		context = ((Context) (sEnabledNotificationListenersLock));
	//    5   10:getstatic       #83  <Field Object sEnabledNotificationListenersLock>
	//    6   13:astore_0        
		context;
	//    7   14:aload_0         
		JVM INSTR monitorenter ;
	//    8   15:monitorenter    
		if(obj == null) goto _L2; else goto _L1
	//    9   16:aload_3         
	//   10   17:ifnull          100
_L1:
		if(((String) (obj)).equals(((Object) (sEnabledNotificationListeners)))) goto _L2; else goto _L3
	//   11   20:aload_3         
	//   12   21:getstatic       #124 <Field String sEnabledNotificationListeners>
	//   13   24:invokevirtual   #130 <Method boolean String.equals(Object)>
	//   14   27:ifne            100
_L3:
		int j;
		String as[];
		HashSet hashset;
		as = ((String) (obj)).split(":");
	//   15   30:aload_3         
	//   16   31:ldc1            #132 <String ":">
	//   17   33:invokevirtual   #136 <Method String[] String.split(String)>
	//   18   36:astore          4
		hashset = new HashSet(as.length);
	//   19   38:new             #85  <Class HashSet>
	//   20   41:dup             
	//   21   42:aload           4
	//   22   44:arraylength     
	//   23   45:invokespecial   #139 <Method void HashSet(int)>
	//   24   48:astore          5
		j = as.length;
	//   25   50:aload           4
	//   26   52:arraylength     
	//   27   53:istore_2        
		int i = 0;
	//   28   54:iconst_0        
	//   29   55:istore_1        
_L9:
		if(i >= j) goto _L5; else goto _L4
	//   30   56:iload_1         
	//   31   57:iload_2         
	//   32   58:icmpge          91
_L4:
		ComponentName componentname = ComponentName.unflattenFromString(as[i]);
	//   33   61:aload           4
	//   34   63:iload_1         
	//   35   64:aaload          
	//   36   65:invokestatic    #145 <Method ComponentName ComponentName.unflattenFromString(String)>
	//   37   68:astore          6
		if(componentname == null) goto _L7; else goto _L6
	//   38   70:aload           6
	//   39   72:ifnull          113
_L6:
		((Set) (hashset)).add(((Object) (componentname.getPackageName())));
	//   40   75:aload           5
	//   41   77:aload           6
	//   42   79:invokevirtual   #149 <Method String ComponentName.getPackageName()>
	//   43   82:invokeinterface #154 <Method boolean Set.add(Object)>
	//   44   87:pop             
		  goto _L7
	//*  45   88:goto            113
_L5:
		sEnabledNotificationListenerPackages = ((Set) (hashset));
	//   46   91:aload           5
	//   47   93:putstatic       #88  <Field Set sEnabledNotificationListenerPackages>
		sEnabledNotificationListeners = ((String) (obj));
	//   48   96:aload_3         
	//   49   97:putstatic       #124 <Field String sEnabledNotificationListeners>
_L2:
		obj = ((Object) (sEnabledNotificationListenerPackages));
	//   50  100:getstatic       #88  <Field Set sEnabledNotificationListenerPackages>
	//   51  103:astore_3        
		context;
	//   52  104:aload_0         
		JVM INSTR monitorexit ;
	//   53  105:monitorexit     
		return ((Set) (obj));
	//   54  106:aload_3         
	//   55  107:areturn         
		Exception exception;
		exception;
	//   56  108:astore_3        
		context;
	//   57  109:aload_0         
		JVM INSTR monitorexit ;
	//   58  110:monitorexit     
		throw exception;
	//   59  111:aload_3         
	//   60  112:athrow          
_L7:
		i++;
	//   61  113:iload_1         
	//   62  114:iconst_1        
	//   63  115:iadd            
	//   64  116:istore_1        
		if(true) goto _L9; else goto _L8
	//   65  117:goto            56
_L8:
	}

	private void pushSideChannelQueue(Task task)
	{
		synchronized(sLock)
	//*   0    0:getstatic       #90  <Field Object sLock>
	//*   1    3:astore_2        
	//*   2    4:aload_2         
	//*   3    5:monitorenter    
		{
			if(sSideChannelManager == null)
	//*   4    6:getstatic       #160 <Field NotificationManagerCompat$SideChannelManager sSideChannelManager>
	//*   5    9:ifnonnull       29
				sSideChannelManager = new SideChannelManager(mContext.getApplicationContext());
	//    6   12:new             #15  <Class NotificationManagerCompat$SideChannelManager>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #94  <Field Context mContext>
	//   10   20:invokevirtual   #164 <Method Context Context.getApplicationContext()>
	//   11   23:invokespecial   #165 <Method void NotificationManagerCompat$SideChannelManager(Context)>
	//   12   26:putstatic       #160 <Field NotificationManagerCompat$SideChannelManager sSideChannelManager>
			sSideChannelManager.queueTask(task);
	//   13   29:getstatic       #160 <Field NotificationManagerCompat$SideChannelManager sSideChannelManager>
	//   14   32:aload_1         
	//   15   33:invokevirtual   #168 <Method void NotificationManagerCompat$SideChannelManager.queueTask(NotificationManagerCompat$Task)>
		}
	//   16   36:aload_2         
	//   17   37:monitorexit     
		return;
	//   18   38:return          
		task;
	//   19   39:astore_1        
		obj;
	//   20   40:aload_2         
		JVM INSTR monitorexit ;
	//   21   41:monitorexit     
		throw task;
	//   22   42:aload_1         
	//   23   43:athrow          
	}

	private static boolean useSideChannelForNotification(Notification notification)
	{
		notification = ((Notification) (NotificationCompat.getExtras(notification)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #176 <Method Bundle NotificationCompat.getExtras(Notification)>
	//    2    4:astore_0        
		return notification != null && ((Bundle) (notification)).getBoolean("android.support.useSideChannel");
	//    3    5:aload_0         
	//    4    6:ifnull          20
	//    5    9:aload_0         
	//    6   10:ldc1            #32  <String "android.support.useSideChannel">
	//    7   12:invokevirtual   #182 <Method boolean Bundle.getBoolean(String)>
	//    8   15:ifeq            20
	//    9   18:iconst_1        
	//   10   19:ireturn         
	//   11   20:iconst_0        
	//   12   21:ireturn         
	}

	public boolean areNotificationsEnabled()
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   2    2:getstatic       #201 <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    5:bipush          24
	//*   4    7:icmplt          20
			flag = mNotificationManager.areNotificationsEnabled();
	//    5   10:aload_0         
	//    6   11:getfield        #106 <Field NotificationManager mNotificationManager>
	//    7   14:invokevirtual   #203 <Method boolean NotificationManager.areNotificationsEnabled()>
	//    8   17:istore_2        
		else
	//*   9   18:iload_2         
	//*  10   19:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  11   20:getstatic       #201 <Field int android.os.Build$VERSION.SDK_INT>
	//*  12   23:bipush          19
	//*  13   25:icmplt          18
		{
			AppOpsManager appopsmanager = (AppOpsManager)mContext.getSystemService("appops");
	//   14   28:aload_0         
	//   15   29:getfield        #94  <Field Context mContext>
	//   16   32:ldc1            #205 <String "appops">
	//   17   34:invokevirtual   #102 <Method Object Context.getSystemService(String)>
	//   18   37:checkcast       #207 <Class AppOpsManager>
	//   19   40:astore_3        
			ApplicationInfo applicationinfo = mContext.getApplicationInfo();
	//   20   41:aload_0         
	//   21   42:getfield        #94  <Field Context mContext>
	//   22   45:invokevirtual   #211 <Method ApplicationInfo Context.getApplicationInfo()>
	//   23   48:astore          5
			String s = mContext.getApplicationContext().getPackageName();
	//   24   50:aload_0         
	//   25   51:getfield        #94  <Field Context mContext>
	//   26   54:invokevirtual   #164 <Method Context Context.getApplicationContext()>
	//   27   57:invokevirtual   #212 <Method String Context.getPackageName()>
	//   28   60:astore          4
			int i = applicationinfo.uid;
	//   29   62:aload           5
	//   30   64:getfield        #217 <Field int ApplicationInfo.uid>
	//   31   67:istore_1        
			boolean flag1;
			try
			{
				Class class1 = Class.forName(((Class) (android/app/AppOpsManager)).getName());
	//   32   68:ldc1            #207 <Class AppOpsManager>
	//   33   70:invokevirtual   #222 <Method String Class.getName()>
	//   34   73:invokestatic    #226 <Method Class Class.forName(String)>
	//   35   76:astore          5
				i = ((Integer)class1.getMethod("checkOpNoThrow", new Class[] {
					Integer.TYPE, Integer.TYPE, java/lang/String
				}).invoke(((Object) (appopsmanager)), new Object[] {
					Integer.valueOf(((Integer)class1.getDeclaredField("OP_POST_NOTIFICATION").get(java/lang/Integer)).intValue()), Integer.valueOf(i), s
				})).intValue();
	//   36   78:aload           5
	//   37   80:ldc1            #29  <String "checkOpNoThrow">
	//   38   82:iconst_3        
	//   39   83:anewarray       Class[]
	//   40   86:dup             
	//   41   87:iconst_0        
	//   42   88:getstatic       #232 <Field Class Integer.TYPE>
	//   43   91:aastore         
	//   44   92:dup             
	//   45   93:iconst_1        
	//   46   94:getstatic       #232 <Field Class Integer.TYPE>
	//   47   97:aastore         
	//   48   98:dup             
	//   49   99:iconst_2        
	//   50  100:ldc1            #126 <Class String>
	//   51  102:aastore         
	//   52  103:invokevirtual   #236 <Method Method Class.getMethod(String, Class[])>
	//   53  106:aload_3         
	//   54  107:iconst_3        
	//   55  108:anewarray       Object[]
	//   56  111:dup             
	//   57  112:iconst_0        
	//   58  113:aload           5
	//   59  115:ldc1            #51  <String "OP_POST_NOTIFICATION">
	//   60  117:invokevirtual   #240 <Method Field Class.getDeclaredField(String)>
	//   61  120:ldc1            #228 <Class Integer>
	//   62  122:invokevirtual   #246 <Method Object Field.get(Object)>
	//   63  125:checkcast       #228 <Class Integer>
	//   64  128:invokevirtual   #250 <Method int Integer.intValue()>
	//   65  131:invokestatic    #254 <Method Integer Integer.valueOf(int)>
	//   66  134:aastore         
	//   67  135:dup             
	//   68  136:iconst_1        
	//   69  137:iload_1         
	//   70  138:invokestatic    #254 <Method Integer Integer.valueOf(int)>
	//   71  141:aastore         
	//   72  142:dup             
	//   73  143:iconst_2        
	//   74  144:aload           4
	//   75  146:aastore         
	//   76  147:invokevirtual   #260 <Method Object Method.invoke(Object, Object[])>
	//   77  150:checkcast       #228 <Class Integer>
	//   78  153:invokevirtual   #250 <Method int Integer.intValue()>
	//   79  156:istore_1        
			}
	//*  80  157:iload_1         
	//*  81  158:ifne            165
	//*  82  161:iconst_1        
	//*  83  162:istore_2        
	//*  84  163:iload_2         
	//*  85  164:ireturn         
	//*  86  165:iconst_0        
	//*  87  166:istore_2        
	//*  88  167:goto            163
			catch(ClassNotFoundException classnotfoundexception)
	//*  89  170:astore_3        
			{
				return true;
	//   90  171:iconst_1        
	//   91  172:ireturn         
			}
	//*  92  173:astore_3        
	//*  93  174:iconst_1        
	//*  94  175:ireturn         
	//*  95  176:astore_3        
	//*  96  177:iconst_1        
	//*  97  178:ireturn         
	//*  98  179:astore_3        
	//*  99  180:iconst_1        
	//* 100  181:ireturn         
			catch(NoSuchMethodException nosuchmethodexception)
	//* 101  182:astore_3        
			{
				return true;
	//  102  183:iconst_1        
	//  103  184:ireturn         
			}
			catch(NoSuchFieldException nosuchfieldexception)
			{
				return true;
			}
			catch(InvocationTargetException invocationtargetexception)
	//* 104  185:astore_3        
			{
				return true;
	//  105  186:iconst_1        
	//  106  187:ireturn         
			}
			catch(IllegalAccessException illegalaccessexception)
			{
				return true;
			}
			catch(RuntimeException runtimeexception)
			{
				return true;
			}
			if(i == 0)
				flag1 = true;
			else
				flag1 = false;
			return flag1;
		}
		return flag;
	}

	public void cancel(int i)
	{
		cancel(((String) (null)), i);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:iload_1         
	//    3    3:invokevirtual   #264 <Method void cancel(String, int)>
	//    4    6:return          
	}

	public void cancel(String s, int i)
	{
		mNotificationManager.cancel(s, i);
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field NotificationManager mNotificationManager>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #265 <Method void NotificationManager.cancel(String, int)>
		if(android.os.Build.VERSION.SDK_INT <= 19)
	//*   5    9:getstatic       #201 <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   12:bipush          19
	//*   7   14:icmpgt          37
			pushSideChannelQueue(((Task) (new CancelTask(mContext.getPackageName(), i, s))));
	//    8   17:aload_0         
	//    9   18:new             #6   <Class NotificationManagerCompat$CancelTask>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:getfield        #94  <Field Context mContext>
	//   13   26:invokevirtual   #212 <Method String Context.getPackageName()>
	//   14   29:iload_2         
	//   15   30:aload_1         
	//   16   31:invokespecial   #268 <Method void NotificationManagerCompat$CancelTask(String, int, String)>
	//   17   34:invokespecial   #270 <Method void pushSideChannelQueue(NotificationManagerCompat$Task)>
	//   18   37:return          
	}

	public void cancelAll()
	{
		mNotificationManager.cancelAll();
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field NotificationManager mNotificationManager>
	//    2    4:invokevirtual   #273 <Method void NotificationManager.cancelAll()>
		if(android.os.Build.VERSION.SDK_INT <= 19)
	//*   3    7:getstatic       #201 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          19
	//*   5   12:icmpgt          33
			pushSideChannelQueue(((Task) (new CancelTask(mContext.getPackageName()))));
	//    6   15:aload_0         
	//    7   16:new             #6   <Class NotificationManagerCompat$CancelTask>
	//    8   19:dup             
	//    9   20:aload_0         
	//   10   21:getfield        #94  <Field Context mContext>
	//   11   24:invokevirtual   #212 <Method String Context.getPackageName()>
	//   12   27:invokespecial   #276 <Method void NotificationManagerCompat$CancelTask(String)>
	//   13   30:invokespecial   #270 <Method void pushSideChannelQueue(NotificationManagerCompat$Task)>
	//   14   33:return          
	}

	public int getImportance()
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #201 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          16
			return mNotificationManager.getImportance();
	//    3    8:aload_0         
	//    4    9:getfield        #106 <Field NotificationManager mNotificationManager>
	//    5   12:invokevirtual   #279 <Method int NotificationManager.getImportance()>
	//    6   15:ireturn         
		else
			return -1000;
	//    7   16:sipush          -1000
	//    8   19:ireturn         
	}

	public void notify(int i, Notification notification)
	{
		notify(((String) (null)), i, notification);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:iload_1         
	//    3    3:aload_2         
	//    4    4:invokevirtual   #284 <Method void notify(String, int, Notification)>
	//    5    7:return          
	}

	public void notify(String s, int i, Notification notification)
	{
		if(useSideChannelForNotification(notification))
	//*   0    0:aload_3         
	//*   1    1:invokestatic    #286 <Method boolean useSideChannelForNotification(Notification)>
	//*   2    4:ifeq            38
		{
			pushSideChannelQueue(((Task) (new NotifyTask(mContext.getPackageName(), i, s, notification))));
	//    3    7:aload_0         
	//    4    8:new             #9   <Class NotificationManagerCompat$NotifyTask>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #94  <Field Context mContext>
	//    8   16:invokevirtual   #212 <Method String Context.getPackageName()>
	//    9   19:iload_2         
	//   10   20:aload_1         
	//   11   21:aload_3         
	//   12   22:invokespecial   #289 <Method void NotificationManagerCompat$NotifyTask(String, int, String, Notification)>
	//   13   25:invokespecial   #270 <Method void pushSideChannelQueue(NotificationManagerCompat$Task)>
			mNotificationManager.cancel(s, i);
	//   14   28:aload_0         
	//   15   29:getfield        #106 <Field NotificationManager mNotificationManager>
	//   16   32:aload_1         
	//   17   33:iload_2         
	//   18   34:invokevirtual   #265 <Method void NotificationManager.cancel(String, int)>
			return;
	//   19   37:return          
		} else
		{
			mNotificationManager.notify(s, i, notification);
	//   20   38:aload_0         
	//   21   39:getfield        #106 <Field NotificationManager mNotificationManager>
	//   22   42:aload_1         
	//   23   43:iload_2         
	//   24   44:aload_3         
	//   25   45:invokevirtual   #290 <Method void NotificationManager.notify(String, int, Notification)>
			return;
	//   26   48:return          
		}
	}

	public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
	private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
	public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
	public static final int IMPORTANCE_DEFAULT = 3;
	public static final int IMPORTANCE_HIGH = 4;
	public static final int IMPORTANCE_LOW = 2;
	public static final int IMPORTANCE_MAX = 5;
	public static final int IMPORTANCE_MIN = 1;
	public static final int IMPORTANCE_NONE = 0;
	public static final int IMPORTANCE_UNSPECIFIED = -1000;
	static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
	private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
	private static final String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
	private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
	private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
	private static final String TAG = "NotifManCompat";
	private static Set sEnabledNotificationListenerPackages = new HashSet();
	private static String sEnabledNotificationListeners;
	private static final Object sEnabledNotificationListenersLock = new Object();
	private static final Object sLock = new Object();
	private static SideChannelManager sSideChannelManager;
	private final Context mContext;
	private final NotificationManager mNotificationManager;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #81  <Method void Object()>
	//    3    7:putstatic       #83  <Field Object sEnabledNotificationListenersLock>
	//    4   10:new             #85  <Class HashSet>
	//    5   13:dup             
	//    6   14:invokespecial   #86  <Method void HashSet()>
	//    7   17:putstatic       #88  <Field Set sEnabledNotificationListenerPackages>
	//    8   20:new             #4   <Class Object>
	//    9   23:dup             
	//   10   24:invokespecial   #81  <Method void Object()>
	//   11   27:putstatic       #90  <Field Object sLock>
	//*  12   30:return          
	}
}
