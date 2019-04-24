// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//			NotificationCompatBase

public static interface NotificationCompatBase$Action$Factory
{

	public abstract NotificationCompatBase.Action build(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInputCompatBase.RemoteInput aremoteinput[], RemoteInputCompatBase.RemoteInput aremoteinput1[], boolean flag);

	public abstract NotificationCompatBase.Action[] newArray(int i);
}
