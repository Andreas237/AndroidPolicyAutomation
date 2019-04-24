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
			stringbuilder.append("packageName:");
		//    5   10:aload_1         
		//    6   11:ldc1            #54  <String "packageName:">
		//    7   13:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//    8   16:pop             
			stringbuilder.append(packageName);
		//    9   17:aload_1         
		//   10   18:aload_0         
		//   11   19:getfield        #23  <Field String packageName>
		//   12   22:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   13   25:pop             
			stringbuilder.append(", id:");
		//   14   26:aload_1         
		//   15   27:ldc1            #60  <String ", id:">
		//   16   29:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   17   32:pop             
			stringbuilder.append(id);
		//   18   33:aload_1         
		//   19   34:aload_0         
		//   20   35:getfield        #25  <Field int id>
		//   21   38:invokevirtual   #63  <Method StringBuilder StringBuilder.append(int)>
		//   22   41:pop             
			stringbuilder.append(", tag:");
		//   23   42:aload_1         
		//   24   43:ldc1            #65  <String ", tag:">
		//   25   45:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   26   48:pop             
			stringbuilder.append(tag);
		//   27   49:aload_1         
		//   28   50:aload_0         
		//   29   51:getfield        #27  <Field String tag>
		//   30   54:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   31   57:pop             
			stringbuilder.append(", all:");
		//   32   58:aload_1         
		//   33   59:ldc1            #67  <String ", all:">
		//   34   61:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   35   64:pop             
			stringbuilder.append(all);
		//   36   65:aload_1         
		//   37   66:aload_0         
		//   38   67:getfield        #29  <Field boolean all>
		//   39   70:invokevirtual   #70  <Method StringBuilder StringBuilder.append(boolean)>
		//   40   73:pop             
			stringbuilder.append("]");
		//   41   74:aload_1         
		//   42   75:ldc1            #72  <String "]">
		//   43   77:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   44   80:pop             
			return stringbuilder.toString();
		//   45   81:aload_1         
		//   46   82:invokevirtual   #74  <Method String StringBuilder.toString()>
		//   47   85:areturn         
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
			stringbuilder.append("packageName:");
		//    5   10:aload_1         
		//    6   11:ldc1            #51  <String "packageName:">
		//    7   13:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//    8   16:pop             
			stringbuilder.append(packageName);
		//    9   17:aload_1         
		//   10   18:aload_0         
		//   11   19:getfield        #23  <Field String packageName>
		//   12   22:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   13   25:pop             
			stringbuilder.append(", id:");
		//   14   26:aload_1         
		//   15   27:ldc1            #57  <String ", id:">
		//   16   29:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   17   32:pop             
			stringbuilder.append(id);
		//   18   33:aload_1         
		//   19   34:aload_0         
		//   20   35:getfield        #25  <Field int id>
		//   21   38:invokevirtual   #60  <Method StringBuilder StringBuilder.append(int)>
		//   22   41:pop             
			stringbuilder.append(", tag:");
		//   23   42:aload_1         
		//   24   43:ldc1            #62  <String ", tag:">
		//   25   45:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   26   48:pop             
			stringbuilder.append(tag);
		//   27   49:aload_1         
		//   28   50:aload_0         
		//   29   51:getfield        #27  <Field String tag>
		//   30   54:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   31   57:pop             
			stringbuilder.append("]");
		//   32   58:aload_1         
		//   33   59:ldc1            #64  <String "]">
		//   34   61:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   35   64:pop             
			return stringbuilder.toString();
		//   36   65:aload_1         
		//   37   66:invokevirtual   #66  <Method String StringBuilder.toString()>
		//   38   69:areturn         
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
		//*  23   45:ifeq            56
			{
				listenerrecord.retryCount = 0;
		//   24   48:aload_1         
		//   25   49:iconst_0        
		//   26   50:putfield        #104 <Field int NotificationManagerCompat$SideChannelManager$ListenerRecord.retryCount>
			} else
		//*  27   53:goto            98
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   28   56:new             #106 <Class StringBuilder>
		//   29   59:dup             
		//   30   60:invokespecial   #107 <Method void StringBuilder()>
		//   31   63:astore_2        
				stringbuilder.append("Unable to bind to listener ");
		//   32   64:aload_2         
		//   33   65:ldc1            #109 <String "Unable to bind to listener ">
		//   34   67:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
		//   35   70:pop             
				stringbuilder.append(((Object) (listenerrecord.componentName)));
		//   36   71:aload_2         
		//   37   72:aload_1         
		//   38   73:getfield        #91  <Field ComponentName NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName>
		//   39   76:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
		//   40   79:pop             
				Log.w("NotifManCompat", stringbuilder.toString());
		//   41   80:ldc1            #118 <String "NotifManCompat">
		//   42   82:aload_2         
		//   43   83:invokevirtual   #122 <Method String StringBuilder.toString()>
		//   44   86:invokestatic    #128 <Method int Log.w(String, String)>
		//   45   89:pop             
				mContext.unbindService(((ServiceConnection) (this)));
		//   46   90:aload_0         
		//   47   91:getfield        #52  <Field Context mContext>
		//   48   94:aload_0         
		//   49   95:invokevirtual   #132 <Method void Context.unbindService(ServiceConnection)>
			}
			return listenerrecord.bound;
		//   50   98:aload_1         
		//   51   99:getfield        #82  <Field boolean NotificationManagerCompat$SideChannelManager$ListenerRecord.bound>
		//   52  102:ireturn         
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
		//   15   39:getfield        #169 <Field ArrayDeque NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
		//   16   42:aload_1         
		//   17   43:invokevirtual   #175 <Method boolean ArrayDeque.add(Object)>
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
		//*   0    0:ldc1            #118 <String "NotifManCompat">
		//*   1    2:iconst_3        
		//*   2    3:invokestatic    #203 <Method boolean Log.isLoggable(String, int)>
		//*   3    6:ifeq            69
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    4    9:new             #106 <Class StringBuilder>
		//    5   12:dup             
		//    6   13:invokespecial   #107 <Method void StringBuilder()>
		//    7   16:astore_2        
				stringbuilder.append("Processing component ");
		//    8   17:aload_2         
		//    9   18:ldc1            #205 <String "Processing component ">
		//   10   20:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
		//   11   23:pop             
				stringbuilder.append(((Object) (listenerrecord.componentName)));
		//   12   24:aload_2         
		//   13   25:aload_1         
		//   14   26:getfield        #91  <Field ComponentName NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName>
		//   15   29:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
		//   16   32:pop             
				stringbuilder.append(", ");
		//   17   33:aload_2         
		//   18   34:ldc1            #207 <String ", ">
		//   19   36:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
		//   20   39:pop             
				stringbuilder.append(listenerrecord.taskQueue.size());
		//   21   40:aload_2         
		//   22   41:aload_1         
		//   23   42:getfield        #169 <Field ArrayDeque NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
		//   24   45:invokevirtual   #211 <Method int ArrayDeque.size()>
		//   25   48:invokevirtual   #214 <Method StringBuilder StringBuilder.append(int)>
		//   26   51:pop             
				stringbuilder.append(" queued tasks");
		//   27   52:aload_2         
		//   28   53:ldc1            #216 <String " queued tasks">
		//   29   55:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
		//   30   58:pop             
				Log.d("NotifManCompat", stringbuilder.toString());
		//   31   59:ldc1            #118 <String "NotifManCompat">
		//   32   61:aload_2         
		//   33   62:invokevirtual   #122 <Method String StringBuilder.toString()>
		//   34   65:invokestatic    #219 <Method int Log.d(String, String)>
		//   35   68:pop             
			}
			if(listenerrecord.taskQueue.isEmpty())
		//*  36   69:aload_1         
		//*  37   70:getfield        #169 <Field ArrayDeque NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
		//*  38   73:invokevirtual   #222 <Method boolean ArrayDeque.isEmpty()>
		//*  39   76:ifeq            80
				return;
		//   40   79:return          
			if(ensureServiceBound(listenerrecord) && listenerrecord.service != null) goto _L2; else goto _L1
		//   41   80:aload_0         
		//   42   81:aload_1         
		//   43   82:invokespecial   #224 <Method boolean ensureServiceBound(NotificationManagerCompat$SideChannelManager$ListenerRecord)>
		//   44   85:ifeq            275
		//   45   88:aload_1         
		//   46   89:getfield        #138 <Field INotificationSideChannel NotificationManagerCompat$SideChannelManager$ListenerRecord.service>
		//   47   92:ifnonnull       98
		//*  48   95:goto            275
_L2:
			Task task;
			task = (Task)listenerrecord.taskQueue.peek();
		//   49   98:aload_1         
		//   50   99:getfield        #169 <Field ArrayDeque NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
		//   51  102:invokevirtual   #227 <Method Object ArrayDeque.peek()>
		//   52  105:checkcast       #229 <Class NotificationManagerCompat$Task>
		//   53  108:astore_2        
			if(task == null)
		//*  54  109:aload_2         
		//*  55  110:ifnonnull       116
				break; /* Loop/switch isn't completed */
		//   56  113:goto            259
			if(Log.isLoggable("NotifManCompat", 3))
		//*  57  116:ldc1            #118 <String "NotifManCompat">
		//*  58  118:iconst_3        
		//*  59  119:invokestatic    #203 <Method boolean Log.isLoggable(String, int)>
		//*  60  122:ifeq            156
			{
				StringBuilder stringbuilder2 = new StringBuilder();
		//   61  125:new             #106 <Class StringBuilder>
		//   62  128:dup             
		//   63  129:invokespecial   #107 <Method void StringBuilder()>
		//   64  132:astore_3        
				stringbuilder2.append("Sending task ");
		//   65  133:aload_3         
		//   66  134:ldc1            #231 <String "Sending task ">
		//   67  136:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
		//   68  139:pop             
				stringbuilder2.append(((Object) (task)));
		//   69  140:aload_3         
		//   70  141:aload_2         
		//   71  142:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
		//   72  145:pop             
				Log.d("NotifManCompat", stringbuilder2.toString());
		//   73  146:ldc1            #118 <String "NotifManCompat">
		//   74  148:aload_3         
		//   75  149:invokevirtual   #122 <Method String StringBuilder.toString()>
		//   76  152:invokestatic    #219 <Method int Log.d(String, String)>
		//   77  155:pop             
			}
			task.send(listenerrecord.service);
		//   78  156:aload_2         
		//   79  157:aload_1         
		//   80  158:getfield        #138 <Field INotificationSideChannel NotificationManagerCompat$SideChannelManager$ListenerRecord.service>
		//   81  161:invokeinterface #235 <Method void NotificationManagerCompat$Task.send(INotificationSideChannel)>
			listenerrecord.taskQueue.remove();
		//   82  166:aload_1         
		//   83  167:getfield        #169 <Field ArrayDeque NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
		//   84  170:invokevirtual   #238 <Method Object ArrayDeque.remove()>
		//   85  173:pop             
			if(true) goto _L2; else goto _L3
		//   86  174:goto            98
			Object obj;
			obj;
		//   87  177:astore_2        
			StringBuilder stringbuilder3 = new StringBuilder();
		//   88  178:new             #106 <Class StringBuilder>
		//   89  181:dup             
		//   90  182:invokespecial   #107 <Method void StringBuilder()>
		//   91  185:astore_3        
			stringbuilder3.append("RemoteException communicating with ");
		//   92  186:aload_3         
		//   93  187:ldc1            #240 <String "RemoteException communicating with ">
		//   94  189:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
		//   95  192:pop             
			stringbuilder3.append(((Object) (listenerrecord.componentName)));
		//   96  193:aload_3         
		//   97  194:aload_1         
		//   98  195:getfield        #91  <Field ComponentName NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName>
		//   99  198:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
		//  100  201:pop             
			Log.w("NotifManCompat", stringbuilder3.toString(), ((Throwable) (obj)));
		//  101  202:ldc1            #118 <String "NotifManCompat">
		//  102  204:aload_3         
		//  103  205:invokevirtual   #122 <Method String StringBuilder.toString()>
		//  104  208:aload_2         
		//  105  209:invokestatic    #243 <Method int Log.w(String, String, Throwable)>
		//  106  212:pop             
			  goto _L3
		//* 107  213:goto            259
_L5:
			if(Log.isLoggable("NotifManCompat", 3))
		//* 108  216:ldc1            #118 <String "NotifManCompat">
		//* 109  218:iconst_3        
		//* 110  219:invokestatic    #203 <Method boolean Log.isLoggable(String, int)>
		//* 111  222:ifeq            259
			{
				StringBuilder stringbuilder1 = new StringBuilder();
		//  112  225:new             #106 <Class StringBuilder>
		//  113  228:dup             
		//  114  229:invokespecial   #107 <Method void StringBuilder()>
		//  115  232:astore_2        
				stringbuilder1.append("Remote service has died: ");
		//  116  233:aload_2         
		//  117  234:ldc1            #245 <String "Remote service has died: ">
		//  118  236:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
		//  119  239:pop             
				stringbuilder1.append(((Object) (listenerrecord.componentName)));
		//  120  240:aload_2         
		//  121  241:aload_1         
		//  122  242:getfield        #91  <Field ComponentName NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName>
		//  123  245:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
		//  124  248:pop             
				Log.d("NotifManCompat", stringbuilder1.toString());
		//  125  249:ldc1            #118 <String "NotifManCompat">
		//  126  251:aload_2         
		//  127  252:invokevirtual   #122 <Method String StringBuilder.toString()>
		//  128  255:invokestatic    #219 <Method int Log.d(String, String)>
		//  129  258:pop             
			}
_L3:
			if(!listenerrecord.taskQueue.isEmpty())
		//* 130  259:aload_1         
		//* 131  260:getfield        #169 <Field ArrayDeque NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
		//* 132  263:invokevirtual   #222 <Method boolean ArrayDeque.isEmpty()>
		//* 133  266:ifne            274
				scheduleListenerRetry(listenerrecord);
		//  134  269:aload_0         
		//  135  270:aload_1         
		//  136  271:invokespecial   #248 <Method void scheduleListenerRetry(NotificationManagerCompat$SideChannelManager$ListenerRecord)>
			return;
		//  137  274:return          
_L1:
			scheduleListenerRetry(listenerrecord);
		//  138  275:aload_0         
		//  139  276:aload_1         
		//  140  277:invokespecial   #248 <Method void scheduleListenerRetry(NotificationManagerCompat$SideChannelManager$ListenerRecord)>
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
		//*  17   32:icmple          122
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   18   35:new             #106 <Class StringBuilder>
		//   19   38:dup             
		//   20   39:invokespecial   #107 <Method void StringBuilder()>
		//   21   42:astore_3        
				stringbuilder.append("Giving up on delivering ");
		//   22   43:aload_3         
		//   23   44:ldc1            #254 <String "Giving up on delivering ">
		//   24   46:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
		//   25   49:pop             
				stringbuilder.append(listenerrecord.taskQueue.size());
		//   26   50:aload_3         
		//   27   51:aload_1         
		//   28   52:getfield        #169 <Field ArrayDeque NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
		//   29   55:invokevirtual   #211 <Method int ArrayDeque.size()>
		//   30   58:invokevirtual   #214 <Method StringBuilder StringBuilder.append(int)>
		//   31   61:pop             
				stringbuilder.append(" tasks to ");
		//   32   62:aload_3         
		//   33   63:ldc2            #256 <String " tasks to ">
		//   34   66:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
		//   35   69:pop             
				stringbuilder.append(((Object) (listenerrecord.componentName)));
		//   36   70:aload_3         
		//   37   71:aload_1         
		//   38   72:getfield        #91  <Field ComponentName NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName>
		//   39   75:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
		//   40   78:pop             
				stringbuilder.append(" after ");
		//   41   79:aload_3         
		//   42   80:ldc2            #258 <String " after ">
		//   43   83:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
		//   44   86:pop             
				stringbuilder.append(listenerrecord.retryCount);
		//   45   87:aload_3         
		//   46   88:aload_1         
		//   47   89:getfield        #104 <Field int NotificationManagerCompat$SideChannelManager$ListenerRecord.retryCount>
		//   48   92:invokevirtual   #214 <Method StringBuilder StringBuilder.append(int)>
		//   49   95:pop             
				stringbuilder.append(" retries");
		//   50   96:aload_3         
		//   51   97:ldc2            #260 <String " retries">
		//   52  100:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
		//   53  103:pop             
				Log.w("NotifManCompat", stringbuilder.toString());
		//   54  104:ldc1            #118 <String "NotifManCompat">
		//   55  106:aload_3         
		//   56  107:invokevirtual   #122 <Method String StringBuilder.toString()>
		//   57  110:invokestatic    #128 <Method int Log.w(String, String)>
		//   58  113:pop             
				listenerrecord.taskQueue.clear();
		//   59  114:aload_1         
		//   60  115:getfield        #169 <Field ArrayDeque NotificationManagerCompat$SideChannelManager$ListenerRecord.taskQueue>
		//   61  118:invokevirtual   #263 <Method void ArrayDeque.clear()>
				return;
		//   62  121:return          
			}
			int i = 1000 * (1 << listenerrecord.retryCount - 1);
		//   63  122:sipush          1000
		//   64  125:iconst_1        
		//   65  126:aload_1         
		//   66  127:getfield        #104 <Field int NotificationManagerCompat$SideChannelManager$ListenerRecord.retryCount>
		//   67  130:iconst_1        
		//   68  131:isub            
		//   69  132:ishl            
		//   70  133:imul            
		//   71  134:istore_2        
			if(Log.isLoggable("NotifManCompat", 3))
		//*  72  135:ldc1            #118 <String "NotifManCompat">
		//*  73  137:iconst_3        
		//*  74  138:invokestatic    #203 <Method boolean Log.isLoggable(String, int)>
		//*  75  141:ifeq            184
			{
				StringBuilder stringbuilder1 = new StringBuilder();
		//   76  144:new             #106 <Class StringBuilder>
		//   77  147:dup             
		//   78  148:invokespecial   #107 <Method void StringBuilder()>
		//   79  151:astore_3        
				stringbuilder1.append("Scheduling retry for ");
		//   80  152:aload_3         
		//   81  153:ldc2            #265 <String "Scheduling retry for ">
		//   82  156:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
		//   83  159:pop             
				stringbuilder1.append(i);
		//   84  160:aload_3         
		//   85  161:iload_2         
		//   86  162:invokevirtual   #214 <Method StringBuilder StringBuilder.append(int)>
		//   87  165:pop             
				stringbuilder1.append(" ms");
		//   88  166:aload_3         
		//   89  167:ldc2            #267 <String " ms">
		//   90  170:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
		//   91  173:pop             
				Log.d("NotifManCompat", stringbuilder1.toString());
		//   92  174:ldc1            #118 <String "NotifManCompat">
		//   93  176:aload_3         
		//   94  177:invokevirtual   #122 <Method String StringBuilder.toString()>
		//   95  180:invokestatic    #219 <Method int Log.d(String, String)>
		//   96  183:pop             
			}
			listenerrecord = ((ListenerRecord) (mHandler.obtainMessage(3, ((Object) (listenerrecord.componentName)))));
		//   97  184:aload_0         
		//   98  185:getfield        #75  <Field Handler mHandler>
		//   99  188:iconst_3        
		//  100  189:aload_1         
		//  101  190:getfield        #91  <Field ComponentName NotificationManagerCompat$SideChannelManager$ListenerRecord.componentName>
		//  102  193:invokevirtual   #271 <Method Message Handler.obtainMessage(int, Object)>
		//  103  196:astore_1        
			mHandler.sendMessageDelayed(((Message) (listenerrecord)), i);
		//  104  197:aload_0         
		//  105  198:getfield        #75  <Field Handler mHandler>
		//  106  201:aload_1         
		//  107  202:iload_2         
		//  108  203:i2l             
		//  109  204:invokevirtual   #275 <Method boolean Handler.sendMessageDelayed(Message, long)>
		//  110  207:pop             
		//  111  208:return          
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
		//   33   72:ifeq            203
				ResolveInfo resolveinfo = (ResolveInfo)((Iterator) (obj1)).next();
		//   34   75:aload_3         
		//   35   76:invokeinterface #165 <Method Object Iterator.next()>
		//   36   81:checkcast       #304 <Class ResolveInfo>
		//   37   84:astore          5
				if(((Set) (obj)).contains(((Object) (resolveinfo.serviceInfo.packageName))))
		//*  38   86:aload_2         
		//*  39   87:aload           5
		//*  40   89:getfield        #308 <Field ServiceInfo ResolveInfo.serviceInfo>
		//*  41   92:getfield        #314 <Field String ServiceInfo.packageName>
		//*  42   95:invokeinterface #317 <Method boolean Set.contains(Object)>
		//*  43  100:ifne            106
		//*  44  103:goto            66
				{
					ComponentName componentname1 = new ComponentName(resolveinfo.serviceInfo.packageName, resolveinfo.serviceInfo.name);
		//   45  106:new             #319 <Class ComponentName>
		//   46  109:dup             
		//   47  110:aload           5
		//   48  112:getfield        #308 <Field ServiceInfo ResolveInfo.serviceInfo>
		//   49  115:getfield        #314 <Field String ServiceInfo.packageName>
		//   50  118:aload           5
		//   51  120:getfield        #308 <Field ServiceInfo ResolveInfo.serviceInfo>
		//   52  123:getfield        #322 <Field String ServiceInfo.name>
		//   53  126:invokespecial   #325 <Method void ComponentName(String, String)>
		//   54  129:astore          4
					if(resolveinfo.serviceInfo.permission != null)
		//*  55  131:aload           5
		//*  56  133:getfield        #308 <Field ServiceInfo ResolveInfo.serviceInfo>
		//*  57  136:getfield        #328 <Field String ServiceInfo.permission>
		//*  58  139:ifnull          191
					{
						StringBuilder stringbuilder2 = new StringBuilder();
		//   59  142:new             #106 <Class StringBuilder>
		//   60  145:dup             
		//   61  146:invokespecial   #107 <Method void StringBuilder()>
		//   62  149:astore          5
						stringbuilder2.append("Permission present on component ");
		//   63  151:aload           5
		//   64  153:ldc2            #330 <String "Permission present on component ">
		//   65  156:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
		//   66  159:pop             
						stringbuilder2.append(((Object) (componentname1)));
		//   67  160:aload           5
		//   68  162:aload           4
		//   69  164:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
		//   70  167:pop             
						stringbuilder2.append(", not adding listener record.");
		//   71  168:aload           5
		//   72  170:ldc2            #332 <String ", not adding listener record.">
		//   73  173:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
		//   74  176:pop             
						Log.w("NotifManCompat", stringbuilder2.toString());
		//   75  177:ldc1            #118 <String "NotifManCompat">
		//   76  179:aload           5
		//   77  181:invokevirtual   #122 <Method String StringBuilder.toString()>
		//   78  184:invokestatic    #128 <Method int Log.w(String, String)>
		//   79  187:pop             
					} else
		//*  80  188:goto            66
					{
						((Set) (hashset)).add(((Object) (componentname1)));
		//   81  191:aload_1         
		//   82  192:aload           4
		//   83  194:invokeinterface #333 <Method boolean Set.add(Object)>
		//   84  199:pop             
					}
				}
			} while(true);
		//   85  200:goto            66
			obj = ((Object) (((Set) (hashset)).iterator()));
		//   86  203:aload_1         
		//   87  204:invokeinterface #334 <Method Iterator Set.iterator()>
		//   88  209:astore_2        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
		//   89  210:aload_2         
		//   90  211:invokeinterface #161 <Method boolean Iterator.hasNext()>
		//   91  216:ifeq            309
				ComponentName componentname = (ComponentName)((Iterator) (obj)).next();
		//   92  219:aload_2         
		//   93  220:invokeinterface #165 <Method Object Iterator.next()>
		//   94  225:checkcast       #319 <Class ComponentName>
		//   95  228:astore_3        
				if(!mRecordMap.containsKey(((Object) (componentname))))
		//*  96  229:aload_0         
		//*  97  230:getfield        #45  <Field Map mRecordMap>
		//*  98  233:aload_3         
		//*  99  234:invokeinterface #337 <Method boolean Map.containsKey(Object)>
		//* 100  239:ifne            210
				{
					if(Log.isLoggable("NotifManCompat", 3))
		//* 101  242:ldc1            #118 <String "NotifManCompat">
		//* 102  244:iconst_3        
		//* 103  245:invokestatic    #203 <Method boolean Log.isLoggable(String, int)>
		//* 104  248:ifeq            287
					{
						StringBuilder stringbuilder = new StringBuilder();
		//  105  251:new             #106 <Class StringBuilder>
		//  106  254:dup             
		//  107  255:invokespecial   #107 <Method void StringBuilder()>
		//  108  258:astore          4
						stringbuilder.append("Adding listener record for ");
		//  109  260:aload           4
		//  110  262:ldc2            #339 <String "Adding listener record for ">
		//  111  265:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
		//  112  268:pop             
						stringbuilder.append(((Object) (componentname)));
		//  113  269:aload           4
		//  114  271:aload_3         
		//  115  272:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
		//  116  275:pop             
						Log.d("NotifManCompat", stringbuilder.toString());
		//  117  276:ldc1            #118 <String "NotifManCompat">
		//  118  278:aload           4
		//  119  280:invokevirtual   #122 <Method String StringBuilder.toString()>
		//  120  283:invokestatic    #219 <Method int Log.d(String, String)>
		//  121  286:pop             
					}
					mRecordMap.put(((Object) (componentname)), ((Object) (new ListenerRecord(componentname))));
		//  122  287:aload_0         
		//  123  288:getfield        #45  <Field Map mRecordMap>
		//  124  291:aload_3         
		//  125  292:new             #13  <Class NotificationManagerCompat$SideChannelManager$ListenerRecord>
		//  126  295:dup             
		//  127  296:aload_3         
		//  128  297:invokespecial   #341 <Method void NotificationManagerCompat$SideChannelManager$ListenerRecord(ComponentName)>
		//  129  300:invokeinterface #345 <Method Object Map.put(Object, Object)>
		//  130  305:pop             
				}
			} while(true);
		//  131  306:goto            210
			obj = ((Object) (mRecordMap.entrySet().iterator()));
		//  132  309:aload_0         
		//  133  310:getfield        #45  <Field Map mRecordMap>
		//  134  313:invokeinterface #349 <Method Set Map.entrySet()>
		//  135  318:invokeinterface #334 <Method Iterator Set.iterator()>
		//  136  323:astore_2        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
		//  137  324:aload_2         
		//  138  325:invokeinterface #161 <Method boolean Iterator.hasNext()>
		//  139  330:ifeq            430
				java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
		//  140  333:aload_2         
		//  141  334:invokeinterface #165 <Method Object Iterator.next()>
		//  142  339:checkcast       #351 <Class java.util.Map$Entry>
		//  143  342:astore_3        
				if(!((Set) (hashset)).contains(entry.getKey()))
		//* 144  343:aload_1         
		//* 145  344:aload_3         
		//* 146  345:invokeinterface #354 <Method Object java.util.Map$Entry.getKey()>
		//* 147  350:invokeinterface #317 <Method boolean Set.contains(Object)>
		//* 148  355:ifne            324
				{
					if(Log.isLoggable("NotifManCompat", 3))
		//* 149  358:ldc1            #118 <String "NotifManCompat">
		//* 150  360:iconst_3        
		//* 151  361:invokestatic    #203 <Method boolean Log.isLoggable(String, int)>
		//* 152  364:ifeq            408
					{
						StringBuilder stringbuilder1 = new StringBuilder();
		//  153  367:new             #106 <Class StringBuilder>
		//  154  370:dup             
		//  155  371:invokespecial   #107 <Method void StringBuilder()>
		//  156  374:astore          4
						stringbuilder1.append("Removing listener record for ");
		//  157  376:aload           4
		//  158  378:ldc2            #356 <String "Removing listener record for ">
		//  159  381:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
		//  160  384:pop             
						stringbuilder1.append(entry.getKey());
		//  161  385:aload           4
		//  162  387:aload_3         
		//  163  388:invokeinterface #354 <Method Object java.util.Map$Entry.getKey()>
		//  164  393:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
		//  165  396:pop             
						Log.d("NotifManCompat", stringbuilder1.toString());
		//  166  397:ldc1            #118 <String "NotifManCompat">
		//  167  399:aload           4
		//  168  401:invokevirtual   #122 <Method String StringBuilder.toString()>
		//  169  404:invokestatic    #219 <Method int Log.d(String, String)>
		//  170  407:pop             
					}
					ensureServiceUnbound((ListenerRecord)entry.getValue());
		//  171  408:aload_0         
		//  172  409:aload_3         
		//  173  410:invokeinterface #359 <Method Object java.util.Map$Entry.getValue()>
		//  174  415:checkcast       #13  <Class NotificationManagerCompat$SideChannelManager$ListenerRecord>
		//  175  418:invokespecial   #195 <Method void ensureServiceUnbound(NotificationManagerCompat$SideChannelManager$ListenerRecord)>
					((Iterator) (obj)).remove();
		//  176  421:aload_2         
		//  177  422:invokeinterface #361 <Method void Iterator.remove()>
				}
			} while(true);
		//  178  427:goto            324
		//  179  430:return          
		}

		public boolean handleMessage(Message message)
		{
			switch(message.what)
		//*   0    0:aload_1         
		//*   1    1:getfield        #368 <Field int Message.what>
			{
		//*   2    4:tableswitch     0 3: default 36
		//		               0 86
		//		               1 64
		//		               2 51
		//		               3 38
			default:
				return false;
		//    3   36:iconst_0        
		//    4   37:ireturn         

			case 3: // '\003'
				handleRetryListenerQueue((ComponentName)message.obj);
		//    5   38:aload_0         
		//    6   39:aload_1         
		//    7   40:getfield        #372 <Field Object Message.obj>
		//    8   43:checkcast       #319 <Class ComponentName>
		//    9   46:invokespecial   #374 <Method void handleRetryListenerQueue(ComponentName)>
				return true;
		//   10   49:iconst_1        
		//   11   50:ireturn         

			case 2: // '\002'
				handleServiceDisconnected((ComponentName)message.obj);
		//   12   51:aload_0         
		//   13   52:aload_1         
		//   14   53:getfield        #372 <Field Object Message.obj>
		//   15   56:checkcast       #319 <Class ComponentName>
		//   16   59:invokespecial   #376 <Method void handleServiceDisconnected(ComponentName)>
				return true;
		//   17   62:iconst_1        
		//   18   63:ireturn         

			case 1: // '\001'
				message = ((Message) ((ServiceConnectedEvent)message.obj));
		//   19   64:aload_1         
		//   20   65:getfield        #372 <Field Object Message.obj>
		//   21   68:checkcast       #378 <Class NotificationManagerCompat$ServiceConnectedEvent>
		//   22   71:astore_1        
				handleServiceConnected(((ServiceConnectedEvent) (message)).componentName, ((ServiceConnectedEvent) (message)).iBinder);
		//   23   72:aload_0         
		//   24   73:aload_1         
		//   25   74:getfield        #379 <Field ComponentName NotificationManagerCompat$ServiceConnectedEvent.componentName>
		//   26   77:aload_1         
		//   27   78:getfield        #383 <Field IBinder NotificationManagerCompat$ServiceConnectedEvent.iBinder>
		//   28   81:invokespecial   #385 <Method void handleServiceConnected(ComponentName, IBinder)>
				return true;
		//   29   84:iconst_1        
		//   30   85:ireturn         

			case 0: // '\0'
				handleQueueTask((Task)message.obj);
		//   31   86:aload_0         
		//   32   87:aload_1         
		//   33   88:getfield        #372 <Field Object Message.obj>
		//   34   91:checkcast       #229 <Class NotificationManagerCompat$Task>
		//   35   94:invokespecial   #387 <Method void handleQueueTask(NotificationManagerCompat$Task)>
				return true;
		//   36   97:iconst_1        
		//   37   98:ireturn         
			}
		}

		public void onServiceConnected(ComponentName componentname, IBinder ibinder)
		{
			if(Log.isLoggable("NotifManCompat", 3))
		//*   0    0:ldc1            #118 <String "NotifManCompat">
		//*   1    2:iconst_3        
		//*   2    3:invokestatic    #203 <Method boolean Log.isLoggable(String, int)>
		//*   3    6:ifeq            41
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    4    9:new             #106 <Class StringBuilder>
		//    5   12:dup             
		//    6   13:invokespecial   #107 <Method void StringBuilder()>
		//    7   16:astore_3        
				stringbuilder.append("Connected to service ");
		//    8   17:aload_3         
		//    9   18:ldc2            #390 <String "Connected to service ">
		//   10   21:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
		//   11   24:pop             
				stringbuilder.append(((Object) (componentname)));
		//   12   25:aload_3         
		//   13   26:aload_1         
		//   14   27:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
		//   15   30:pop             
				Log.d("NotifManCompat", stringbuilder.toString());
		//   16   31:ldc1            #118 <String "NotifManCompat">
		//   17   33:aload_3         
		//   18   34:invokevirtual   #122 <Method String StringBuilder.toString()>
		//   19   37:invokestatic    #219 <Method int Log.d(String, String)>
		//   20   40:pop             
			}
			mHandler.obtainMessage(1, ((Object) (new ServiceConnectedEvent(componentname, ibinder)))).sendToTarget();
		//   21   41:aload_0         
		//   22   42:getfield        #75  <Field Handler mHandler>
		//   23   45:iconst_1        
		//   24   46:new             #378 <Class NotificationManagerCompat$ServiceConnectedEvent>
		//   25   49:dup             
		//   26   50:aload_1         
		//   27   51:aload_2         
		//   28   52:invokespecial   #392 <Method void NotificationManagerCompat$ServiceConnectedEvent(ComponentName, IBinder)>
		//   29   55:invokevirtual   #271 <Method Message Handler.obtainMessage(int, Object)>
		//   30   58:invokevirtual   #395 <Method void Message.sendToTarget()>
		//   31   61:return          
		}

		public void onServiceDisconnected(ComponentName componentname)
		{
			if(Log.isLoggable("NotifManCompat", 3))
		//*   0    0:ldc1            #118 <String "NotifManCompat">
		//*   1    2:iconst_3        
		//*   2    3:invokestatic    #203 <Method boolean Log.isLoggable(String, int)>
		//*   3    6:ifeq            41
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    4    9:new             #106 <Class StringBuilder>
		//    5   12:dup             
		//    6   13:invokespecial   #107 <Method void StringBuilder()>
		//    7   16:astore_2        
				stringbuilder.append("Disconnected from service ");
		//    8   17:aload_2         
		//    9   18:ldc2            #398 <String "Disconnected from service ">
		//   10   21:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
		//   11   24:pop             
				stringbuilder.append(((Object) (componentname)));
		//   12   25:aload_2         
		//   13   26:aload_1         
		//   14   27:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
		//   15   30:pop             
				Log.d("NotifManCompat", stringbuilder.toString());
		//   16   31:ldc1            #118 <String "NotifManCompat">
		//   17   33:aload_2         
		//   18   34:invokevirtual   #122 <Method String StringBuilder.toString()>
		//   19   37:invokestatic    #219 <Method int Log.d(String, String)>
		//   20   40:pop             
			}
			mHandler.obtainMessage(2, ((Object) (componentname))).sendToTarget();
		//   21   41:aload_0         
		//   22   42:getfield        #75  <Field Handler mHandler>
		//   23   45:iconst_2        
		//   24   46:aload_1         
		//   25   47:invokevirtual   #271 <Method Message Handler.obtainMessage(int, Object)>
		//   26   50:invokevirtual   #395 <Method void Message.sendToTarget()>
		//   27   53:return          
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

		SideChannelManager(Context context)
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

		boolean bound;
		final ComponentName componentName;
		int retryCount;
		INotificationSideChannel service;
		ArrayDeque taskQueue;

		SideChannelManager.ListenerRecord(ComponentName componentname)
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
	//    3    5:invokespecial   #111 <Method void NotificationManagerCompat(Context)>
	//    4    8:areturn         
	}

	public static Set getEnabledListenerPackages(Context context)
	{
		Object obj = ((Object) (android.provider.Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners")));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #119 <Method android.content.ContentResolver Context.getContentResolver()>
	//    2    4:ldc1            #54  <String "enabled_notification_listeners">
	//    3    6:invokestatic    #125 <Method String android.provider.Settings$Secure.getString(android.content.ContentResolver, String)>
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
	//   10   17:ifnull          103
_L1:
		if(((String) (obj)).equals(((Object) (sEnabledNotificationListeners)))) goto _L2; else goto _L3
	//   11   20:aload_3         
	//   12   21:getstatic       #127 <Field String sEnabledNotificationListeners>
	//   13   24:invokevirtual   #133 <Method boolean String.equals(Object)>
	//   14   27:ifne            103
_L3:
		int j;
		String as[];
		HashSet hashset;
		as = ((String) (obj)).split(":");
	//   15   30:aload_3         
	//   16   31:ldc1            #135 <String ":">
	//   17   33:invokevirtual   #139 <Method String[] String.split(String)>
	//   18   36:astore          4
		hashset = new HashSet(as.length);
	//   19   38:new             #85  <Class HashSet>
	//   20   41:dup             
	//   21   42:aload           4
	//   22   44:arraylength     
	//   23   45:invokespecial   #142 <Method void HashSet(int)>
	//   24   48:astore          5
		j = as.length;
	//   25   50:aload           4
	//   26   52:arraylength     
	//   27   53:istore_2        
		int i = 0;
	//   28   54:iconst_0        
	//   29   55:istore_1        
_L8:
		if(i >= j) goto _L5; else goto _L4
	//   30   56:iload_1         
	//   31   57:iload_2         
	//   32   58:icmpge          91
_L4:
		ComponentName componentname = ComponentName.unflattenFromString(as[i]);
	//   33   61:aload           4
	//   34   63:iload_1         
	//   35   64:aaload          
	//   36   65:invokestatic    #148 <Method ComponentName ComponentName.unflattenFromString(String)>
	//   37   68:astore          6
		if(componentname == null) goto _L7; else goto _L6
	//   38   70:aload           6
	//   39   72:ifnull          115
_L6:
		((Set) (hashset)).add(((Object) (componentname.getPackageName())));
	//   40   75:aload           5
	//   41   77:aload           6
	//   42   79:invokevirtual   #152 <Method String ComponentName.getPackageName()>
	//   43   82:invokeinterface #157 <Method boolean Set.add(Object)>
	//   44   87:pop             
		  goto _L7
	//*  45   88:goto            115
_L5:
		sEnabledNotificationListenerPackages = ((Set) (hashset));
	//   46   91:aload           5
	//   47   93:putstatic       #88  <Field Set sEnabledNotificationListenerPackages>
		sEnabledNotificationListeners = ((String) (obj));
	//   48   96:aload_3         
	//   49   97:putstatic       #127 <Field String sEnabledNotificationListeners>
	//*  50  100:goto            103
_L2:
		obj = ((Object) (sEnabledNotificationListenerPackages));
	//   51  103:getstatic       #88  <Field Set sEnabledNotificationListenerPackages>
	//   52  106:astore_3        
		context;
	//   53  107:aload_0         
		JVM INSTR monitorexit ;
	//   54  108:monitorexit     
		return ((Set) (obj));
	//   55  109:aload_3         
	//   56  110:areturn         
_L9:
		context;
	//   57  111:aload_0         
		JVM INSTR monitorexit ;
	//   58  112:monitorexit     
		Exception exception;
		throw exception;
	//   59  113:aload_3         
	//   60  114:athrow          
_L7:
		i++;
	//   61  115:iload_1         
	//   62  116:iconst_1        
	//   63  117:iadd            
	//   64  118:istore_1        
		  goto _L8
	//*  65  119:goto            56
		exception;
	//   66  122:astore_3        
		  goto _L9
	//*  67  123:goto            111
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
	//*   4    6:getstatic       #163 <Field NotificationManagerCompat$SideChannelManager sSideChannelManager>
	//*   5    9:ifnonnull       29
				sSideChannelManager = new SideChannelManager(mContext.getApplicationContext());
	//    6   12:new             #15  <Class NotificationManagerCompat$SideChannelManager>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #94  <Field Context mContext>
	//   10   20:invokevirtual   #167 <Method Context Context.getApplicationContext()>
	//   11   23:invokespecial   #168 <Method void NotificationManagerCompat$SideChannelManager(Context)>
	//   12   26:putstatic       #163 <Field NotificationManagerCompat$SideChannelManager sSideChannelManager>
			sSideChannelManager.queueTask(task);
	//   13   29:getstatic       #163 <Field NotificationManagerCompat$SideChannelManager sSideChannelManager>
	//   14   32:aload_1         
	//   15   33:invokevirtual   #171 <Method void NotificationManagerCompat$SideChannelManager.queueTask(NotificationManagerCompat$Task)>
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
	//    1    1:invokestatic    #179 <Method Bundle NotificationCompat.getExtras(Notification)>
	//    2    4:astore_0        
		return notification != null && ((Bundle) (notification)).getBoolean("android.support.useSideChannel");
	//    3    5:aload_0         
	//    4    6:ifnull          20
	//    5    9:aload_0         
	//    6   10:ldc1            #32  <String "android.support.useSideChannel">
	//    7   12:invokevirtual   #185 <Method boolean Bundle.getBoolean(String)>
	//    8   15:ifeq            20
	//    9   18:iconst_1        
	//   10   19:ireturn         
	//   11   20:iconst_0        
	//   12   21:ireturn         
	}

	public boolean areNotificationsEnabled()
	{
		int i;
		AppOpsManager appopsmanager;
		String s;
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #204 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          16
			return mNotificationManager.areNotificationsEnabled();
	//    3    8:aload_0         
	//    4    9:getfield        #106 <Field NotificationManager mNotificationManager>
	//    5   12:invokevirtual   #206 <Method boolean NotificationManager.areNotificationsEnabled()>
	//    6   15:ireturn         
		if(android.os.Build.VERSION.SDK_INT < 19)
			break MISSING_BLOCK_LABEL_159;
	//    7   16:getstatic       #204 <Field int android.os.Build$VERSION.SDK_INT>
	//    8   19:bipush          19
	//    9   21:icmplt          159
		appopsmanager = (AppOpsManager)mContext.getSystemService("appops");
	//   10   24:aload_0         
	//   11   25:getfield        #94  <Field Context mContext>
	//   12   28:ldc1            #208 <String "appops">
	//   13   30:invokevirtual   #102 <Method Object Context.getSystemService(String)>
	//   14   33:checkcast       #210 <Class AppOpsManager>
	//   15   36:astore_2        
		ApplicationInfo applicationinfo = mContext.getApplicationInfo();
	//   16   37:aload_0         
	//   17   38:getfield        #94  <Field Context mContext>
	//   18   41:invokevirtual   #214 <Method ApplicationInfo Context.getApplicationInfo()>
	//   19   44:astore          4
		s = mContext.getApplicationContext().getPackageName();
	//   20   46:aload_0         
	//   21   47:getfield        #94  <Field Context mContext>
	//   22   50:invokevirtual   #167 <Method Context Context.getApplicationContext()>
	//   23   53:invokevirtual   #215 <Method String Context.getPackageName()>
	//   24   56:astore_3        
		i = applicationinfo.uid;
	//   25   57:aload           4
	//   26   59:getfield        #220 <Field int ApplicationInfo.uid>
	//   27   62:istore_1        
		try
		{
			Class class1 = Class.forName(((Class) (android/app/AppOpsManager)).getName());
	//   28   63:ldc1            #210 <Class AppOpsManager>
	//   29   65:invokevirtual   #225 <Method String Class.getName()>
	//   30   68:invokestatic    #229 <Method Class Class.forName(String)>
	//   31   71:astore          4
			i = ((Integer)class1.getMethod("checkOpNoThrow", new Class[] {
				Integer.TYPE, Integer.TYPE, java/lang/String
			}).invoke(((Object) (appopsmanager)), new Object[] {
				Integer.valueOf(((Integer)class1.getDeclaredField("OP_POST_NOTIFICATION").get(java/lang/Integer)).intValue()), Integer.valueOf(i), s
			})).intValue();
	//   32   73:aload           4
	//   33   75:ldc1            #29  <String "checkOpNoThrow">
	//   34   77:iconst_3        
	//   35   78:anewarray       Class[]
	//   36   81:dup             
	//   37   82:iconst_0        
	//   38   83:getstatic       #235 <Field Class Integer.TYPE>
	//   39   86:aastore         
	//   40   87:dup             
	//   41   88:iconst_1        
	//   42   89:getstatic       #235 <Field Class Integer.TYPE>
	//   43   92:aastore         
	//   44   93:dup             
	//   45   94:iconst_2        
	//   46   95:ldc1            #129 <Class String>
	//   47   97:aastore         
	//   48   98:invokevirtual   #239 <Method Method Class.getMethod(String, Class[])>
	//   49  101:aload_2         
	//   50  102:iconst_3        
	//   51  103:anewarray       Object[]
	//   52  106:dup             
	//   53  107:iconst_0        
	//   54  108:aload           4
	//   55  110:ldc1            #51  <String "OP_POST_NOTIFICATION">
	//   56  112:invokevirtual   #243 <Method Field Class.getDeclaredField(String)>
	//   57  115:ldc1            #231 <Class Integer>
	//   58  117:invokevirtual   #249 <Method Object Field.get(Object)>
	//   59  120:checkcast       #231 <Class Integer>
	//   60  123:invokevirtual   #253 <Method int Integer.intValue()>
	//   61  126:invokestatic    #257 <Method Integer Integer.valueOf(int)>
	//   62  129:aastore         
	//   63  130:dup             
	//   64  131:iconst_1        
	//   65  132:iload_1         
	//   66  133:invokestatic    #257 <Method Integer Integer.valueOf(int)>
	//   67  136:aastore         
	//   68  137:dup             
	//   69  138:iconst_2        
	//   70  139:aload_3         
	//   71  140:aastore         
	//   72  141:invokevirtual   #263 <Method Object Method.invoke(Object, Object[])>
	//   73  144:checkcast       #231 <Class Integer>
	//   74  147:invokevirtual   #253 <Method int Integer.intValue()>
	//   75  150:istore_1        
		}
	//*  76  151:iload_1         
	//*  77  152:ifne            157
	//*  78  155:iconst_1        
	//*  79  156:ireturn         
	//*  80  157:iconst_0        
	//*  81  158:ireturn         
	//*  82  159:iconst_1        
	//*  83  160:ireturn         
		catch(Object obj)
	//*  84  161:astore_2        
		{
			return true;
	//   85  162:iconst_1        
	//   86  163:ireturn         
		}
		return i == 0;
		return true;
	}

	public void cancel(int i)
	{
		cancel(((String) (null)), i);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:iload_1         
	//    3    3:invokevirtual   #267 <Method void cancel(String, int)>
	//    4    6:return          
	}

	public void cancel(String s, int i)
	{
		mNotificationManager.cancel(s, i);
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field NotificationManager mNotificationManager>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #269 <Method void NotificationManager.cancel(String, int)>
		if(android.os.Build.VERSION.SDK_INT <= 19)
	//*   5    9:getstatic       #204 <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   12:bipush          19
	//*   7   14:icmpgt          37
			pushSideChannelQueue(((Task) (new CancelTask(mContext.getPackageName(), i, s))));
	//    8   17:aload_0         
	//    9   18:new             #6   <Class NotificationManagerCompat$CancelTask>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:getfield        #94  <Field Context mContext>
	//   13   26:invokevirtual   #215 <Method String Context.getPackageName()>
	//   14   29:iload_2         
	//   15   30:aload_1         
	//   16   31:invokespecial   #272 <Method void NotificationManagerCompat$CancelTask(String, int, String)>
	//   17   34:invokespecial   #274 <Method void pushSideChannelQueue(NotificationManagerCompat$Task)>
	//   18   37:return          
	}

	public void cancelAll()
	{
		mNotificationManager.cancelAll();
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field NotificationManager mNotificationManager>
	//    2    4:invokevirtual   #277 <Method void NotificationManager.cancelAll()>
		if(android.os.Build.VERSION.SDK_INT <= 19)
	//*   3    7:getstatic       #204 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          19
	//*   5   12:icmpgt          33
			pushSideChannelQueue(((Task) (new CancelTask(mContext.getPackageName()))));
	//    6   15:aload_0         
	//    7   16:new             #6   <Class NotificationManagerCompat$CancelTask>
	//    8   19:dup             
	//    9   20:aload_0         
	//   10   21:getfield        #94  <Field Context mContext>
	//   11   24:invokevirtual   #215 <Method String Context.getPackageName()>
	//   12   27:invokespecial   #280 <Method void NotificationManagerCompat$CancelTask(String)>
	//   13   30:invokespecial   #274 <Method void pushSideChannelQueue(NotificationManagerCompat$Task)>
	//   14   33:return          
	}

	public int getImportance()
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #204 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          16
			return mNotificationManager.getImportance();
	//    3    8:aload_0         
	//    4    9:getfield        #106 <Field NotificationManager mNotificationManager>
	//    5   12:invokevirtual   #283 <Method int NotificationManager.getImportance()>
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
	//    4    4:invokevirtual   #288 <Method void notify(String, int, Notification)>
	//    5    7:return          
	}

	public void notify(String s, int i, Notification notification)
	{
		if(useSideChannelForNotification(notification))
	//*   0    0:aload_3         
	//*   1    1:invokestatic    #290 <Method boolean useSideChannelForNotification(Notification)>
	//*   2    4:ifeq            38
		{
			pushSideChannelQueue(((Task) (new NotifyTask(mContext.getPackageName(), i, s, notification))));
	//    3    7:aload_0         
	//    4    8:new             #9   <Class NotificationManagerCompat$NotifyTask>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #94  <Field Context mContext>
	//    8   16:invokevirtual   #215 <Method String Context.getPackageName()>
	//    9   19:iload_2         
	//   10   20:aload_1         
	//   11   21:aload_3         
	//   12   22:invokespecial   #293 <Method void NotificationManagerCompat$NotifyTask(String, int, String, Notification)>
	//   13   25:invokespecial   #274 <Method void pushSideChannelQueue(NotificationManagerCompat$Task)>
			mNotificationManager.cancel(s, i);
	//   14   28:aload_0         
	//   15   29:getfield        #106 <Field NotificationManager mNotificationManager>
	//   16   32:aload_1         
	//   17   33:iload_2         
	//   18   34:invokevirtual   #269 <Method void NotificationManager.cancel(String, int)>
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
	//   25   45:invokevirtual   #294 <Method void NotificationManager.notify(String, int, Notification)>
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
