// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.PendingIntent;

// Referenced classes of package android.support.v4.app:
//			NotificationCompatBase

public static abstract class NotificationCompatBase$UnreadConversation
{
	public static interface Factory
	{

		public abstract NotificationCompatBase.UnreadConversation build(String as[], RemoteInputCompatBase.RemoteInput remoteinput, PendingIntent pendingintent, PendingIntent pendingintent1, String as1[], long l);
	}


	abstract long getLatestTimestamp();

	abstract String[] getMessages();

	abstract String getParticipant();

	abstract String[] getParticipants();

	abstract PendingIntent getReadPendingIntent();

	abstract RemoteInputCompatBase.RemoteInput getRemoteInput();

	abstract PendingIntent getReplyPendingIntent();

	public NotificationCompatBase$UnreadConversation()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
