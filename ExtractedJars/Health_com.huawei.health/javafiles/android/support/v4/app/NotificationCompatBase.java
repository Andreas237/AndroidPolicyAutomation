// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;

public class NotificationCompatBase
{
	public static abstract class Action
	{

		public abstract PendingIntent getActionIntent();

		public abstract boolean getAllowGeneratedReplies();

		public abstract RemoteInputCompatBase.RemoteInput[] getDataOnlyRemoteInputs();

		public abstract Bundle getExtras();

		public abstract int getIcon();

		public abstract RemoteInputCompatBase.RemoteInput[] getRemoteInputs();

		public abstract CharSequence getTitle();

		public Action()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface Action.Factory
	{

		public abstract Action build(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInputCompatBase.RemoteInput aremoteinput[], RemoteInputCompatBase.RemoteInput aremoteinput1[], boolean flag);

		public abstract Action[] newArray(int i);
	}

	public static abstract class UnreadConversation
	{

		abstract long getLatestTimestamp();

		abstract String[] getMessages();

		abstract String getParticipant();

		abstract String[] getParticipants();

		abstract PendingIntent getReadPendingIntent();

		abstract RemoteInputCompatBase.RemoteInput getRemoteInput();

		abstract PendingIntent getReplyPendingIntent();

		public UnreadConversation()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface UnreadConversation.Factory
	{

		public abstract UnreadConversation build(String as[], RemoteInputCompatBase.RemoteInput remoteinput, PendingIntent pendingintent, PendingIntent pendingintent1, String as1[], long l);
	}


	public NotificationCompatBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}
}
