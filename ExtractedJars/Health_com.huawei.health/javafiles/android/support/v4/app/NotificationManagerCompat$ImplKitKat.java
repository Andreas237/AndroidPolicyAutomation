// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.NotificationManager;
import android.content.Context;

// Referenced classes of package android.support.v4.app:
//			NotificationManagerCompat, NotificationManagerCompatKitKat

static class NotificationManagerCompat$ImplKitKat extends NotificationManagerCompat.ImplBase
{

	public boolean areNotificationsEnabled(Context context, NotificationManager notificationmanager)
	{
		return NotificationManagerCompatKitKat.areNotificationsEnabled(context);
	//    0    0:aload_1         
	//    1    1:invokestatic    #22  <Method boolean NotificationManagerCompatKitKat.areNotificationsEnabled(Context)>
	//    2    4:ireturn         
	}

	NotificationManagerCompat$ImplKitKat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void NotificationManagerCompat$ImplBase()>
	//    2    4:return          
	}
}
