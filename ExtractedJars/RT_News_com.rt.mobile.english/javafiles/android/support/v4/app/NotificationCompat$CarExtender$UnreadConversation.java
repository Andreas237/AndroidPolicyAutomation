// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.PendingIntent;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, RemoteInput

public static class NotificationCompat$CarExtender$UnreadConversation
{
	public static class Builder
	{

		public Builder addMessage(String s)
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
			String as[] = (String[])mMessages.toArray(((Object []) (new String[mMessages.size()])));
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field List mMessages>
		//    2    4:aload_0         
		//    3    5:getfield        #35  <Field List mMessages>
		//    4    8:invokeinterface #52  <Method int List.size()>
		//    5   13:anewarray       String[]
		//    6   16:invokeinterface #58  <Method Object[] List.toArray(Object[])>
		//    7   21:checkcast       #60  <Class String[]>
		//    8   24:astore_3        
			String s = mParticipant;
		//    9   25:aload_0         
		//   10   26:getfield        #37  <Field String mParticipant>
		//   11   29:astore          4
			RemoteInput remoteinput = mRemoteInput;
		//   12   31:aload_0         
		//   13   32:getfield        #62  <Field RemoteInput mRemoteInput>
		//   14   35:astore          5
			PendingIntent pendingintent = mReplyPendingIntent;
		//   15   37:aload_0         
		//   16   38:getfield        #64  <Field PendingIntent mReplyPendingIntent>
		//   17   41:astore          6
			PendingIntent pendingintent1 = mReadPendingIntent;
		//   18   43:aload_0         
		//   19   44:getfield        #66  <Field PendingIntent mReadPendingIntent>
		//   20   47:astore          7
			long l = mLatestTimestamp;
		//   21   49:aload_0         
		//   22   50:getfield        #68  <Field long mLatestTimestamp>
		//   23   53:lstore_1        
			return new NotificationCompat.CarExtender.UnreadConversation(as, remoteinput, pendingintent, pendingintent1, new String[] {
				s
			}, l);
		//   24   54:new             #11  <Class NotificationCompat$CarExtender$UnreadConversation>
		//   25   57:dup             
		//   26   58:aload_3         
		//   27   59:aload           5
		//   28   61:aload           6
		//   29   63:aload           7
		//   30   65:iconst_1        
		//   31   66:anewarray       String[]
		//   32   69:dup             
		//   33   70:iconst_0        
		//   34   71:aload           4
		//   35   73:aastore         
		//   36   74:lload_1         
		//   37   75:invokespecial   #71  <Method void NotificationCompat$CarExtender$UnreadConversation(String[], RemoteInput, PendingIntent, PendingIntent, String[], long)>
		//   38   78:areturn         
		}

		public Builder setLatestTimestamp(long l)
		{
			mLatestTimestamp = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #68  <Field long mLatestTimestamp>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setReadPendingIntent(PendingIntent pendingintent)
		{
			mReadPendingIntent = pendingintent;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #66  <Field PendingIntent mReadPendingIntent>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setReplyAction(PendingIntent pendingintent, RemoteInput remoteinput)
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

		public Builder(String s)
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


	public long getLatestTimestamp()
	{
		return mLatestTimestamp;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field long mLatestTimestamp>
	//    2    4:lreturn         
	}

	public String[] getMessages()
	{
		return mMessages;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String[] mMessages>
	//    2    4:areturn         
	}

	public String getParticipant()
	{
		if(mParticipants.length > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field String[] mParticipants>
	//*   2    4:arraylength     
	//*   3    5:ifle            15
			return mParticipants[0];
	//    4    8:aload_0         
	//    5    9:getfield        #38  <Field String[] mParticipants>
	//    6   12:iconst_0        
	//    7   13:aaload          
	//    8   14:areturn         
		else
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
	}

	public String[] getParticipants()
	{
		return mParticipants;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String[] mParticipants>
	//    2    4:areturn         
	}

	public PendingIntent getReadPendingIntent()
	{
		return mReadPendingIntent;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field PendingIntent mReadPendingIntent>
	//    2    4:areturn         
	}

	public RemoteInput getRemoteInput()
	{
		return mRemoteInput;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field RemoteInput mRemoteInput>
	//    2    4:areturn         
	}

	public PendingIntent getReplyPendingIntent()
	{
		return mReplyPendingIntent;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field PendingIntent mReplyPendingIntent>
	//    2    4:areturn         
	}

	private final long mLatestTimestamp;
	private final String mMessages[];
	private final String mParticipants[];
	private final PendingIntent mReadPendingIntent;
	private final RemoteInput mRemoteInput;
	private final PendingIntent mReplyPendingIntent;

	NotificationCompat$CarExtender$UnreadConversation(String as[], RemoteInput remoteinput, PendingIntent pendingintent, PendingIntent pendingintent1, String as1[], long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		mMessages = as;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field String[] mMessages>
		mRemoteInput = remoteinput;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #32  <Field RemoteInput mRemoteInput>
		mReadPendingIntent = pendingintent1;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #34  <Field PendingIntent mReadPendingIntent>
		mReplyPendingIntent = pendingintent;
	//   11   20:aload_0         
	//   12   21:aload_3         
	//   13   22:putfield        #36  <Field PendingIntent mReplyPendingIntent>
		mParticipants = as1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #38  <Field String[] mParticipants>
		mLatestTimestamp = l;
	//   17   31:aload_0         
	//   18   32:lload           6
	//   19   34:putfield        #40  <Field long mLatestTimestamp>
	//   20   37:return          
	}
}
