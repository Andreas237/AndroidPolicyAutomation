// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;

// Referenced classes of package android.support.v4.app:
//			NotificationManagerCompat

static interface NotificationManagerCompat$Impl
{

	public abstract boolean areNotificationsEnabled(Context context, NotificationManager notificationmanager);

	public abstract void cancelNotification(NotificationManager notificationmanager, String s, int i);

	public abstract int getImportance(NotificationManager notificationmanager);

	public abstract void postNotification(NotificationManager notificationmanager, String s, int i, Notification notification);
}
