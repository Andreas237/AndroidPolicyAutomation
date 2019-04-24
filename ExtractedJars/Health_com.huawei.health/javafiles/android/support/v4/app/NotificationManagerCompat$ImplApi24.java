// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.NotificationManager;
import android.content.Context;

// Referenced classes of package android.support.v4.app:
//			NotificationManagerCompat, NotificationManagerCompatApi24

static class NotificationManagerCompat$ImplApi24 extends 
{

	public boolean areNotificationsEnabled(Context context, NotificationManager notificationmanager)
	{
		return NotificationManagerCompatApi24.areNotificationsEnabled(notificationmanager);
	//    0    0:aload_2         
	//    1    1:invokestatic    #22  <Method boolean NotificationManagerCompatApi24.areNotificationsEnabled(NotificationManager)>
	//    2    4:ireturn         
	}

	public int getImportance(NotificationManager notificationmanager)
	{
		return NotificationManagerCompatApi24.getImportance(notificationmanager);
	//    0    0:aload_1         
	//    1    1:invokestatic    #26  <Method int NotificationManagerCompatApi24.getImportance(NotificationManager)>
	//    2    4:ireturn         
	}

	NotificationManagerCompat$ImplApi24()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void NotificationManagerCompat$ImplKitKat()>
	//    2    4:return          
	}
}
