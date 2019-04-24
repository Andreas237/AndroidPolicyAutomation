// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//			NotificationCompatBase

public static abstract class NotificationCompatBase$Action
{
	public static interface Factory
	{

		public abstract NotificationCompatBase.Action build(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInputCompatBase.RemoteInput aremoteinput[], RemoteInputCompatBase.RemoteInput aremoteinput1[], boolean flag);

		public abstract NotificationCompatBase.Action[] newArray(int i);
	}


	public abstract PendingIntent getActionIntent();

	public abstract boolean getAllowGeneratedReplies();

	public abstract put[] getDataOnlyRemoteInputs();

	public abstract Bundle getExtras();

	public abstract int getIcon();

	public abstract put[] getRemoteInputs();

	public abstract CharSequence getTitle();

	public NotificationCompatBase$Action()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
