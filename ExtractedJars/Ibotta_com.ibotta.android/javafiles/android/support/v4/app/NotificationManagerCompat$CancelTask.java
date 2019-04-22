// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.RemoteException;

// Referenced classes of package android.support.v4.app:
//			NotificationManagerCompat, INotificationSideChannel

private static class NotificationManagerCompat$CancelTask
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

	NotificationManagerCompat$CancelTask(String s)
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

	NotificationManagerCompat$CancelTask(String s, int i, String s1)
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
