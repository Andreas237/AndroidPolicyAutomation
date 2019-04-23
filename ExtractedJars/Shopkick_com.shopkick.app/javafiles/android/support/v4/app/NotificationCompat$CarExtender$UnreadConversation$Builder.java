// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.PendingIntent;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, RemoteInput

public static class NotificationCompat$CarExtender$UnreadConversation$Builder
{

	public NotificationCompat$CarExtender$UnreadConversation$Builder addMessage(String s)
	{
		mMessages.add(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List mMessages>
	//    2    4:aload_1         
	//    3    5:invokeinterface #46  <Method boolean List.add(Object)>
	//    4   10:pop             
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public NotificationCompat.CarExtender.UnreadConversation build()
	{
		List list = mMessages;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List mMessages>
	//    2    4:astore_3        
		String as[] = (String[])list.toArray(((Object []) (new String[list.size()])));
	//    3    5:aload_3         
	//    4    6:aload_3         
	//    5    7:invokeinterface #52  <Method int List.size()>
	//    6   12:anewarray       String[]
	//    7   15:invokeinterface #58  <Method Object[] List.toArray(Object[])>
	//    8   20:checkcast       #60  <Class String[]>
	//    9   23:astore_3        
		String s = mParticipant;
	//   10   24:aload_0         
	//   11   25:getfield        #37  <Field String mParticipant>
	//   12   28:astore          4
		RemoteInput remoteinput = mRemoteInput;
	//   13   30:aload_0         
	//   14   31:getfield        #62  <Field RemoteInput mRemoteInput>
	//   15   34:astore          5
		PendingIntent pendingintent = mReplyPendingIntent;
	//   16   36:aload_0         
	//   17   37:getfield        #64  <Field PendingIntent mReplyPendingIntent>
	//   18   40:astore          6
		PendingIntent pendingintent1 = mReadPendingIntent;
	//   19   42:aload_0         
	//   20   43:getfield        #66  <Field PendingIntent mReadPendingIntent>
	//   21   46:astore          7
		long l = mLatestTimestamp;
	//   22   48:aload_0         
	//   23   49:getfield        #68  <Field long mLatestTimestamp>
	//   24   52:lstore_1        
		return new NotificationCompat.CarExtender.UnreadConversation(as, remoteinput, pendingintent, pendingintent1, new String[] {
			s
		}, l);
	//   25   53:new             #11  <Class NotificationCompat$CarExtender$UnreadConversation>
	//   26   56:dup             
	//   27   57:aload_3         
	//   28   58:aload           5
	//   29   60:aload           6
	//   30   62:aload           7
	//   31   64:iconst_1        
	//   32   65:anewarray       String[]
	//   33   68:dup             
	//   34   69:iconst_0        
	//   35   70:aload           4
	//   36   72:aastore         
	//   37   73:lload_1         
	//   38   74:invokespecial   #71  <Method void NotificationCompat$CarExtender$UnreadConversation(String[], RemoteInput, PendingIntent, PendingIntent, String[], long)>
	//   39   77:areturn         
	}

	public NotificationCompat$CarExtender$UnreadConversation$Builder setLatestTimestamp(long l)
	{
		mLatestTimestamp = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #68  <Field long mLatestTimestamp>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$CarExtender$UnreadConversation$Builder setReadPendingIntent(PendingIntent pendingintent)
	{
		mReadPendingIntent = pendingintent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field PendingIntent mReadPendingIntent>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$CarExtender$UnreadConversation$Builder setReplyAction(PendingIntent pendingintent, RemoteInput remoteinput)
	{
		mRemoteInput = remoteinput;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #62  <Field RemoteInput mRemoteInput>
		mReplyPendingIntent = pendingintent;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #64  <Field PendingIntent mReplyPendingIntent>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	private long mLatestTimestamp;
	private final List mMessages = new ArrayList();
	private final String mParticipant;
	private PendingIntent mReadPendingIntent;
	private RemoteInput mRemoteInput;
	private PendingIntent mReplyPendingIntent;

	public NotificationCompat$CarExtender$UnreadConversation$Builder(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #32  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void ArrayList()>
	//    6   12:putfield        #35  <Field List mMessages>
		mParticipant = s;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #37  <Field String mParticipant>
	//   10   20:return          
	}
}
