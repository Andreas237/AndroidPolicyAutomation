// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.os.RemoteException;

// Referenced classes of package android.support.v4.app:
//			NotificationManagerCompat, INotificationSideChannel

static class NotificationManagerCompat$NotifyTask
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

	public NotificationManagerCompat$NotifyTask(String s, int i, String s1, Notification notification)
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
