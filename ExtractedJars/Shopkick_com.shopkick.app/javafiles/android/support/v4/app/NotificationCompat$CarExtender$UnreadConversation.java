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
		String as[] = mParticipants;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String[] mParticipants>
	//    2    4:astore_1        
		if(as.length > 0)
	//*   3    5:aload_1         
	//*   4    6:arraylength     
	//*   5    7:ifle            14
			return as[0];
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:aaload          
	//    9   13:areturn         
		else
			return null;
	//   10   14:aconst_null     
	//   11   15:areturn         
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
