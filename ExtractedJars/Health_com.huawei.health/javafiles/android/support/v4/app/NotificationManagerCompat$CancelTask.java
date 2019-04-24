// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.RemoteException;

// Referenced classes of package android.support.v4.app:
//			NotificationManagerCompat, INotificationSideChannel

static class NotificationManagerCompat$CancelTask
	implements NotificationManagerCompat.Task
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

	public NotificationManagerCompat$CancelTask(String s)
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

	public NotificationManagerCompat$CancelTask(String s, int i, String s1)
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
