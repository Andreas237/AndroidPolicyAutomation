// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat

static interface NotificationCompat$NotificationCompatImpl
{

	public abstract Notification build(NotificationCompat.Builder builder, NotificationCompat.BuilderExtender builderextender);

	public abstract NotificationCompat.Action getAction(Notification notification, int i);

	public abstract NotificationCompat.Action[] getActionsFromParcelableArrayList(ArrayList arraylist);

	public abstract Bundle getBundleForUnreadConversation(NotificationCompatBase$UnreadConversation notificationcompatbase$unreadconversation);

	public abstract ArrayList getParcelableArrayListForActions(NotificationCompat.Action aaction[]);

	public abstract NotificationCompatBase$UnreadConversation getUnreadConversationFromBundle(Bundle bundle, Factory factory, RemoteInputCompatBase$RemoteInput$Factory remoteinputcompatbase$remoteinput$factory);
}
