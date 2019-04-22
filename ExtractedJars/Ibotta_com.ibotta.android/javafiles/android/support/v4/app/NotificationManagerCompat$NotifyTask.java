// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.os.RemoteException;

// Referenced classes of package android.support.v4.app:
//			NotificationManagerCompat, INotificationSideChannel

private static class NotificationManagerCompat$NotifyTask
	implements NotificationManagerCompat.Task
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

	NotificationManagerCompat$NotifyTask(String s, int i, String s1, Notification notification)
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
