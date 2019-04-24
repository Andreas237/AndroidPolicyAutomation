// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, RemoteInput

public static final class NotificationCompat$CarExtender
	implements NotificationCompat.Extender
{
	public static class UnreadConversation extends NotificationCompatBase.UnreadConversation
	{

		public long getLatestTimestamp()
		{
			return mLatestTimestamp;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field long mLatestTimestamp>
		//    2    4:lreturn         
		}

		public String[] getMessages()
		{
			return mMessages;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field String[] mMessages>
		//    2    4:areturn         
		}

		public String getParticipant()
		{
			if(mParticipants.length > 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #47  <Field String[] mParticipants>
		//*   2    4:arraylength     
		//*   3    5:ifle            15
				return mParticipants[0];
		//    4    8:aload_0         
		//    5    9:getfield        #47  <Field String[] mParticipants>
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
		//    1    1:getfield        #47  <Field String[] mParticipants>
		//    2    4:areturn         
		}

		public PendingIntent getReadPendingIntent()
		{
			return mReadPendingIntent;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field PendingIntent mReadPendingIntent>
		//    2    4:areturn         
		}

		public RemoteInput getRemoteInput()
		{
			return mRemoteInput;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field RemoteInput mRemoteInput>
		//    2    4:areturn         
		}

		public volatile RemoteInputCompatBase.RemoteInput getRemoteInput()
		{
			return ((RemoteInputCompatBase.RemoteInput) (getRemoteInput()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #63  <Method RemoteInput getRemoteInput()>
		//    2    4:areturn         
		}

		public PendingIntent getReplyPendingIntent()
		{
			return mReplyPendingIntent;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field PendingIntent mReplyPendingIntent>
		//    2    4:areturn         
		}

		static final NotificationCompatBase.UnreadConversation.Factory FACTORY = new NotificationCompatBase.UnreadConversation.Factory() {

			public UnreadConversation build(String as[], RemoteInputCompatBase.RemoteInput remoteinput, PendingIntent pendingintent, PendingIntent pendingintent1, String as1[], long l)
			{
				return new UnreadConversation(as, (RemoteInput)remoteinput, pendingintent, pendingintent1, as1, l);
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

		}
;
		private final long mLatestTimestamp;
		private final String mMessages[];
		private final String mParticipants[];
		private final PendingIntent mReadPendingIntent;
		private final RemoteInput mRemoteInput;
		private final PendingIntent mReplyPendingIntent;

		static 
		{
		//    0    0:new             #12  <Class NotificationCompat$CarExtender$UnreadConversation$1>
		//    1    3:dup             
		//    2    4:invokespecial   #32  <Method void NotificationCompat$CarExtender$UnreadConversation$1()>
		//    3    7:putstatic       #34  <Field NotificationCompatBase$UnreadConversation$Factory FACTORY>
		//*   4   10:return          
		}

		UnreadConversation(String as[], RemoteInput remoteinput, PendingIntent pendingintent, PendingIntent pendingintent1, String as1[], long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #37  <Method void NotificationCompatBase$UnreadConversation()>
			mMessages = as;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #39  <Field String[] mMessages>
			mRemoteInput = remoteinput;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #41  <Field RemoteInput mRemoteInput>
			mReadPendingIntent = pendingintent1;
		//    8   14:aload_0         
		//    9   15:aload           4
		//   10   17:putfield        #43  <Field PendingIntent mReadPendingIntent>
			mReplyPendingIntent = pendingintent;
		//   11   20:aload_0         
		//   12   21:aload_3         
		//   13   22:putfield        #45  <Field PendingIntent mReplyPendingIntent>
			mParticipants = as1;
		//   14   25:aload_0         
		//   15   26:aload           5
		//   16   28:putfield        #47  <Field String[] mParticipants>
			mLatestTimestamp = l;
		//   17   31:aload_0         
		//   18   32:lload           6
		//   19   34:putfield        #49  <Field long mLatestTimestamp>
		//   20   37:return          
		}
	}

	public static class UnreadConversation.Builder
	{

		public UnreadConversation.Builder addMessage(String s)
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

		public UnreadConversation build()
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
			return new UnreadConversation(as, remoteinput, pendingintent, pendingintent1, new String[] {
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

		public UnreadConversation.Builder setLatestTimestamp(long l)
		{
			mLatestTimestamp = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #68  <Field long mLatestTimestamp>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public UnreadConversation.Builder setReadPendingIntent(PendingIntent pendingintent)
		{
			mReadPendingIntent = pendingintent;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #66  <Field PendingIntent mReadPendingIntent>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public UnreadConversation.Builder setReplyAction(PendingIntent pendingintent, RemoteInput remoteinput)
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

		public UnreadConversation.Builder(String s)
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


	public NotificationCompat.Builder extend(NotificationCompat.Builder builder)
	{
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:getstatic       #51  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          10
			return builder;
	//    3    8:aload_1         
	//    4    9:areturn         
		Bundle bundle = new Bundle();
	//    5   10:new             #57  <Class Bundle>
	//    6   13:dup             
	//    7   14:invokespecial   #97  <Method void Bundle()>
	//    8   17:astore_2        
		if(mLargeIcon != null)
	//*   9   18:aload_0         
	//*  10   19:getfield        #69  <Field Bitmap mLargeIcon>
	//*  11   22:ifnull          35
			bundle.putParcelable("large_icon", ((android.os.Parcelable) (mLargeIcon)));
	//   12   25:aload_2         
	//   13   26:ldc1            #30  <String "large_icon">
	//   14   28:aload_0         
	//   15   29:getfield        #69  <Field Bitmap mLargeIcon>
	//   16   32:invokevirtual   #101 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		if(mColor != 0)
	//*  17   35:aload_0         
	//*  18   36:getfield        #44  <Field int mColor>
	//*  19   39:ifeq            52
			bundle.putInt("app_color", mColor);
	//   20   42:aload_2         
	//   21   43:ldc1            #24  <String "app_color">
	//   22   45:aload_0         
	//   23   46:getfield        #44  <Field int mColor>
	//   24   49:invokevirtual   #105 <Method void Bundle.putInt(String, int)>
		if(mUnreadConversation != null)
	//*  25   52:aload_0         
	//*  26   53:getfield        #94  <Field NotificationCompat$CarExtender$UnreadConversation mUnreadConversation>
	//*  27   56:ifnull          77
			bundle.putBundle("car_conversation", NotificationCompat.IMPL.getBundleForUnreadConversation(((nversation) (mUnreadConversation))));
	//   28   59:aload_2         
	//   29   60:ldc1            #27  <String "car_conversation">
	//   30   62:getstatic       #77  <Field NotificationCompat$NotificationCompatImpl NotificationCompat.IMPL>
	//   31   65:aload_0         
	//   32   66:getfield        #94  <Field NotificationCompat$CarExtender$UnreadConversation mUnreadConversation>
	//   33   69:invokeinterface #109 <Method Bundle NotificationCompat$NotificationCompatImpl.getBundleForUnreadConversation(NotificationCompatBase$UnreadConversation)>
	//   34   74:invokevirtual   #113 <Method void Bundle.putBundle(String, Bundle)>
		builder.getExtras().putBundle("android.car.EXTENSIONS", bundle);
	//   35   77:aload_1         
	//   36   78:invokevirtual   #118 <Method Bundle NotificationCompat$Builder.getExtras()>
	//   37   81:ldc1            #21  <String "android.car.EXTENSIONS">
	//   38   83:aload_2         
	//   39   84:invokevirtual   #113 <Method void Bundle.putBundle(String, Bundle)>
		return builder;
	//   40   87:aload_1         
	//   41   88:areturn         
	}

	public int getColor()
	{
		return mColor;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int mColor>
	//    2    4:ireturn         
	}

	public Bitmap getLargeIcon()
	{
		return mLargeIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Bitmap mLargeIcon>
	//    2    4:areturn         
	}

	public UnreadConversation getUnreadConversation()
	{
		return mUnreadConversation;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field NotificationCompat$CarExtender$UnreadConversation mUnreadConversation>
	//    2    4:areturn         
	}

	public NotificationCompat$CarExtender setColor(int i)
	{
		mColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #44  <Field int mColor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$CarExtender setLargeIcon(Bitmap bitmap)
	{
		mLargeIcon = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #69  <Field Bitmap mLargeIcon>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$CarExtender setUnreadConversation(UnreadConversation unreadconversation)
	{
		mUnreadConversation = unreadconversation;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #94  <Field NotificationCompat$CarExtender$UnreadConversation mUnreadConversation>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private static final String EXTRA_CAR_EXTENDER = "android.car.EXTENSIONS";
	private static final String EXTRA_COLOR = "app_color";
	private static final String EXTRA_CONVERSATION = "car_conversation";
	private static final String EXTRA_LARGE_ICON = "large_icon";
	private static final String TAG = "CarExtender";
	private int mColor;
	private Bitmap mLargeIcon;
	private UnreadConversation mUnreadConversation;

	public NotificationCompat$CarExtender()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		mColor = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #44  <Field int mColor>
	//    5    9:return          
	}

	public NotificationCompat$CarExtender(Notification notification)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		mColor = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #44  <Field int mColor>
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   5    9:getstatic       #51  <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   12:bipush          21
	//*   7   14:icmpge          18
			return;
	//    8   17:return          
		if(NotificationCompat.getExtras(notification) == null)
	//*   9   18:aload_1         
	//*  10   19:invokestatic    #55  <Method Bundle NotificationCompat.getExtras(Notification)>
	//*  11   22:ifnonnull       30
			notification = null;
	//   12   25:aconst_null     
	//   13   26:astore_1        
		else
	//*  14   27:goto            40
			notification = ((Notification) (NotificationCompat.getExtras(notification).getBundle("android.car.EXTENSIONS")));
	//   15   30:aload_1         
	//   16   31:invokestatic    #55  <Method Bundle NotificationCompat.getExtras(Notification)>
	//   17   34:ldc1            #21  <String "android.car.EXTENSIONS">
	//   18   36:invokevirtual   #61  <Method Bundle Bundle.getBundle(String)>
	//   19   39:astore_1        
		if(notification != null)
	//*  20   40:aload_1         
	//*  21   41:ifnull          97
		{
			mLargeIcon = (Bitmap)((Bundle) (notification)).getParcelable("large_icon");
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:ldc1            #30  <String "large_icon">
	//   25   48:invokevirtual   #65  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   26   51:checkcast       #67  <Class Bitmap>
	//   27   54:putfield        #69  <Field Bitmap mLargeIcon>
			mColor = ((Bundle) (notification)).getInt("app_color", 0);
	//   28   57:aload_0         
	//   29   58:aload_1         
	//   30   59:ldc1            #24  <String "app_color">
	//   31   61:iconst_0        
	//   32   62:invokevirtual   #73  <Method int Bundle.getInt(String, int)>
	//   33   65:putfield        #44  <Field int mColor>
			notification = ((Notification) (((Bundle) (notification)).getBundle("car_conversation")));
	//   34   68:aload_1         
	//   35   69:ldc1            #27  <String "car_conversation">
	//   36   71:invokevirtual   #61  <Method Bundle Bundle.getBundle(String)>
	//   37   74:astore_1        
			mUnreadConversation = (UnreadConversation)NotificationCompat.IMPL.getUnreadConversationFromBundle(((Bundle) (notification)), UnreadConversation.FACTORY, RemoteInput.FACTORY);
	//   38   75:aload_0         
	//   39   76:getstatic       #77  <Field NotificationCompat$NotificationCompatImpl NotificationCompat.IMPL>
	//   40   79:aload_1         
	//   41   80:getstatic       #81  <Field NotificationCompatBase$UnreadConversation$Factory NotificationCompat$CarExtender$UnreadConversation.FACTORY>
	//   42   83:getstatic       #86  <Field RemoteInputCompatBase$RemoteInput$Factory RemoteInput.FACTORY>
	//   43   86:invokeinterface #92  <Method NotificationCompatBase$UnreadConversation NotificationCompat$NotificationCompatImpl.getUnreadConversationFromBundle(Bundle, NotificationCompatBase$UnreadConversation$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
	//   44   91:checkcast       #11  <Class NotificationCompat$CarExtender$UnreadConversation>
	//   45   94:putfield        #94  <Field NotificationCompat$CarExtender$UnreadConversation mUnreadConversation>
		}
	//   46   97:return          
	}
}
