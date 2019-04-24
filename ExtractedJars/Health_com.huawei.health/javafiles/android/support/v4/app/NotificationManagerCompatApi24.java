// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.NotificationManager;

class NotificationManagerCompatApi24
{

	NotificationManagerCompatApi24()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static boolean areNotificationsEnabled(NotificationManager notificationmanager)
	{
		return notificationmanager.areNotificationsEnabled();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #19  <Method boolean NotificationManager.areNotificationsEnabled()>
	//    2    4:ireturn         
	}

	public static int getImportance(NotificationManager notificationmanager)
	{
		return notificationmanager.getImportance();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method int NotificationManager.getImportance()>
	//    2    4:ireturn         
	}
}
