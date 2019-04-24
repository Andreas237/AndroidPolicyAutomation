// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;

// Referenced classes of package android.support.v4.app:
//			NotificationManagerCompat

static class NotificationManagerCompat$ImplBase
	implements NotificationManagerCompat.Impl
{

	public boolean areNotificationsEnabled(Context context, NotificationManager notificationmanager)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void cancelNotification(NotificationManager notificationmanager, String s, int i)
	{
		notificationmanager.cancel(s, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokevirtual   #24  <Method void NotificationManager.cancel(String, int)>
	//    4    6:return          
	}

	public int getImportance(NotificationManager notificationmanager)
	{
		return -1000;
	//    0    0:sipush          -1000
	//    1    3:ireturn         
	}

	public void postNotification(NotificationManager notificationmanager, String s, int i, Notification notification)
	{
		notificationmanager.notify(s, i, notification);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:aload           4
	//    4    5:invokevirtual   #32  <Method void NotificationManager.notify(String, int, Notification)>
	//    5    8:return          
	}

	NotificationManagerCompat$ImplBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
