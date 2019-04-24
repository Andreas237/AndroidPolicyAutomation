// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.PendingIntent;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, RemoteInput

static final class NotificationCompat$CarExtender$UnreadConversation$1
	implements NotificationCompatBase.UnreadConversation.Factory
{

	public NotificationCompat.CarExtender.UnreadConversation build(String as[], RemoteInputCompatBase.RemoteInput remoteinput, PendingIntent pendingintent, PendingIntent pendingintent1, String as1[], long l)
	{
		return new NotificationCompat.CarExtender.UnreadConversation(as, (RemoteInput)remoteinput, pendingintent, pendingintent1, as1, l);
	//    0    0:new             #8   <Class NotificationCompat$CarExtender$UnreadConversation>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:checkcast       #23  <Class RemoteInput>
	//    5    9:aload_3         
	//    6   10:aload           4
	//    7   12:aload           5
	//    8   14:lload           6
	//    9   16:invokespecial   #26  <Method void NotificationCompat$CarExtender$UnreadConversation(String[], RemoteInput, PendingIntent, PendingIntent, String[], long)>
	//   10   19:areturn         
	}

	public volatile NotificationCompatBase.UnreadConversation build(String as[], RemoteInputCompatBase.RemoteInput remoteinput, PendingIntent pendingintent, PendingIntent pendingintent1, String as1[], long l)
	{
		return ((NotificationCompatBase.UnreadConversation) (build(as, remoteinput, pendingintent, pendingintent1, as1, l)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:lload           6
	//    7   10:invokevirtual   #29  <Method NotificationCompat$CarExtender$UnreadConversation build(String[], RemoteInputCompatBase$RemoteInput, PendingIntent, PendingIntent, String[], long)>
	//    8   13:areturn         
	}

	NotificationCompat$CarExtender$UnreadConversation$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}
}
