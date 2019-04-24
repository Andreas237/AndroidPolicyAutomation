// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.ui;

import android.app.Notification;

// Referenced classes of package com.google.android.exoplayer2.ui:
//			PlayerNotificationManager

public static interface PlayerNotificationManager$NotificationListener
{

	public abstract void onNotificationCancelled(int i);

	public abstract void onNotificationStarted(int i, Notification notification);
}
