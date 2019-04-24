// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat

public static class NotificationCompat$MessagingStyle extends NotificationCompat.Style
{
	public static final class Message
	{

		static Bundle[] getBundleArrayForMessages(List list)
		{
			Bundle abundle[] = new Bundle[list.size()];
		//    0    0:aload_0         
		//    1    1:invokeinterface #54  <Method int List.size()>
		//    2    6:anewarray       Bundle[]
		//    3    9:astore_3        
			int j = list.size();
		//    4   10:aload_0         
		//    5   11:invokeinterface #54  <Method int List.size()>
		//    6   16:istore_2        
			for(int i = 0; i < j; i++)
		//*   7   17:iconst_0        
		//*   8   18:istore_1        
		//*   9   19:iload_1         
		//*  10   20:iload_2         
		//*  11   21:icmpge          47
				abundle[i] = ((Message)list.get(i)).toBundle();
		//   12   24:aload_3         
		//   13   25:iload_1         
		//   14   26:aload_0         
		//   15   27:iload_1         
		//   16   28:invokeinterface #60  <Method Object List.get(int)>
		//   17   33:checkcast       #2   <Class NotificationCompat$MessagingStyle$Message>
		//   18   36:invokespecial   #64  <Method Bundle toBundle()>
		//   19   39:aastore         

		//   20   40:iload_1         
		//   21   41:iconst_1        
		//   22   42:iadd            
		//   23   43:istore_1        
		//*  24   44:goto            19
			return abundle;
		//   25   47:aload_3         
		//   26   48:areturn         
		}

		static Message getMessageFromBundle(Bundle bundle)
		{
			boolean flag;
			if(!bundle.containsKey("text"))
				break MISSING_BLOCK_LABEL_20;
		//    0    0:aload_0         
		//    1    1:ldc1            #23  <String "text">
		//    2    3:invokevirtual   #74  <Method boolean Bundle.containsKey(String)>
		//    3    6:ifeq            20
			flag = bundle.containsKey("time");
		//    4    9:aload_0         
		//    5   10:ldc1            #26  <String "time">
		//    6   12:invokevirtual   #74  <Method boolean Bundle.containsKey(String)>
		//    7   15:istore_1        
			if(flag)
				break MISSING_BLOCK_LABEL_22;
		//    8   16:iload_1         
		//    9   17:ifne            22
			return null;
		//   10   20:aconst_null     
		//   11   21:areturn         
			Message message;
			try
			{
				message = new Message(bundle.getCharSequence("text"), bundle.getLong("time"), bundle.getCharSequence("sender"));
		//   12   22:new             #2   <Class NotificationCompat$MessagingStyle$Message>
		//   13   25:dup             
		//   14   26:aload_0         
		//   15   27:ldc1            #23  <String "text">
		//   16   29:invokevirtual   #78  <Method CharSequence Bundle.getCharSequence(String)>
		//   17   32:aload_0         
		//   18   33:ldc1            #26  <String "time">
		//   19   35:invokevirtual   #82  <Method long Bundle.getLong(String)>
		//   20   38:aload_0         
		//   21   39:ldc1            #20  <String "sender">
		//   22   41:invokevirtual   #78  <Method CharSequence Bundle.getCharSequence(String)>
		//   23   44:invokespecial   #84  <Method void NotificationCompat$MessagingStyle$Message(CharSequence, long, CharSequence)>
		//   24   47:astore_2        
				if(bundle.containsKey("type") && bundle.containsKey("uri"))
		//*  25   48:aload_0         
		//*  26   49:ldc1            #14  <String "type">
		//*  27   51:invokevirtual   #74  <Method boolean Bundle.containsKey(String)>
		//*  28   54:ifeq            86
		//*  29   57:aload_0         
		//*  30   58:ldc1            #17  <String "uri">
		//*  31   60:invokevirtual   #74  <Method boolean Bundle.containsKey(String)>
		//*  32   63:ifeq            86
					message.setData(bundle.getString("type"), (Uri)bundle.getParcelable("uri"));
		//   33   66:aload_2         
		//   34   67:aload_0         
		//   35   68:ldc1            #14  <String "type">
		//   36   70:invokevirtual   #88  <Method String Bundle.getString(String)>
		//   37   73:aload_0         
		//   38   74:ldc1            #17  <String "uri">
		//   39   76:invokevirtual   #92  <Method Parcelable Bundle.getParcelable(String)>
		//   40   79:checkcast       #94  <Class Uri>
		//   41   82:invokevirtual   #98  <Method NotificationCompat$MessagingStyle$Message setData(String, Uri)>
		//   42   85:pop             
			}
		//*  43   86:aload_2         
		//*  44   87:areturn         
			// Misplaced declaration of an exception variable
			catch(Bundle bundle)
		//*  45   88:astore_0        
			{
				return null;
		//   46   89:aconst_null     
		//   47   90:areturn         
			}
			return message;
		}

		static List getMessagesFromBundleArray(Parcelable aparcelable[])
		{
			ArrayList arraylist = new ArrayList(aparcelable.length);
		//    0    0:new             #102 <Class ArrayList>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:arraylength     
		//    4    6:invokespecial   #105 <Method void ArrayList(int)>
		//    5    9:astore_2        
			for(int i = 0; i < aparcelable.length; i++)
		//*   6   10:iconst_0        
		//*   7   11:istore_1        
		//*   8   12:iload_1         
		//*   9   13:aload_0         
		//*  10   14:arraylength     
		//*  11   15:icmpge          56
			{
				if(!(aparcelable[i] instanceof Bundle))
					continue;
		//   12   18:aload_0         
		//   13   19:iload_1         
		//   14   20:aaload          
		//   15   21:instanceof      #56  <Class Bundle>
		//   16   24:ifeq            49
				Message message = getMessageFromBundle((Bundle)aparcelable[i]);
		//   17   27:aload_0         
		//   18   28:iload_1         
		//   19   29:aaload          
		//   20   30:checkcast       #56  <Class Bundle>
		//   21   33:invokestatic    #107 <Method NotificationCompat$MessagingStyle$Message getMessageFromBundle(Bundle)>
		//   22   36:astore_3        
				if(message != null)
		//*  23   37:aload_3         
		//*  24   38:ifnull          49
					((List) (arraylist)).add(((Object) (message)));
		//   25   41:aload_2         
		//   26   42:aload_3         
		//   27   43:invokeinterface #111 <Method boolean List.add(Object)>
		//   28   48:pop             
			}

		//   29   49:iload_1         
		//   30   50:iconst_1        
		//   31   51:iadd            
		//   32   52:istore_1        
		//*  33   53:goto            12
			return ((List) (arraylist));
		//   34   56:aload_2         
		//   35   57:areturn         
		}

		private Bundle toBundle()
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #56  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #113 <Method void Bundle()>
		//    3    7:astore_1        
			if(mText != null)
		//*   4    8:aload_0         
		//*   5    9:getfield        #41  <Field CharSequence mText>
		//*   6   12:ifnull          25
				bundle.putCharSequence("text", mText);
		//    7   15:aload_1         
		//    8   16:ldc1            #23  <String "text">
		//    9   18:aload_0         
		//   10   19:getfield        #41  <Field CharSequence mText>
		//   11   22:invokevirtual   #117 <Method void Bundle.putCharSequence(String, CharSequence)>
			bundle.putLong("time", mTimestamp);
		//   12   25:aload_1         
		//   13   26:ldc1            #26  <String "time">
		//   14   28:aload_0         
		//   15   29:getfield        #43  <Field long mTimestamp>
		//   16   32:invokevirtual   #121 <Method void Bundle.putLong(String, long)>
			if(mSender != null)
		//*  17   35:aload_0         
		//*  18   36:getfield        #45  <Field CharSequence mSender>
		//*  19   39:ifnull          52
				bundle.putCharSequence("sender", mSender);
		//   20   42:aload_1         
		//   21   43:ldc1            #20  <String "sender">
		//   22   45:aload_0         
		//   23   46:getfield        #45  <Field CharSequence mSender>
		//   24   49:invokevirtual   #117 <Method void Bundle.putCharSequence(String, CharSequence)>
			if(mDataMimeType != null)
		//*  25   52:aload_0         
		//*  26   53:getfield        #123 <Field String mDataMimeType>
		//*  27   56:ifnull          69
				bundle.putString("type", mDataMimeType);
		//   28   59:aload_1         
		//   29   60:ldc1            #14  <String "type">
		//   30   62:aload_0         
		//   31   63:getfield        #123 <Field String mDataMimeType>
		//   32   66:invokevirtual   #127 <Method void Bundle.putString(String, String)>
			if(mDataUri != null)
		//*  33   69:aload_0         
		//*  34   70:getfield        #129 <Field Uri mDataUri>
		//*  35   73:ifnull          86
				bundle.putParcelable("uri", ((Parcelable) (mDataUri)));
		//   36   76:aload_1         
		//   37   77:ldc1            #17  <String "uri">
		//   38   79:aload_0         
		//   39   80:getfield        #129 <Field Uri mDataUri>
		//   40   83:invokevirtual   #133 <Method void Bundle.putParcelable(String, Parcelable)>
			return bundle;
		//   41   86:aload_1         
		//   42   87:areturn         
		}

		public String getDataMimeType()
		{
			return mDataMimeType;
		//    0    0:aload_0         
		//    1    1:getfield        #123 <Field String mDataMimeType>
		//    2    4:areturn         
		}

		public Uri getDataUri()
		{
			return mDataUri;
		//    0    0:aload_0         
		//    1    1:getfield        #129 <Field Uri mDataUri>
		//    2    4:areturn         
		}

		public CharSequence getSender()
		{
			return mSender;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field CharSequence mSender>
		//    2    4:areturn         
		}

		public CharSequence getText()
		{
			return mText;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field CharSequence mText>
		//    2    4:areturn         
		}

		public long getTimestamp()
		{
			return mTimestamp;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field long mTimestamp>
		//    2    4:lreturn         
		}

		public Message setData(String s, Uri uri)
		{
			mDataMimeType = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #123 <Field String mDataMimeType>
			mDataUri = uri;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #129 <Field Uri mDataUri>
			return this;
		//    6   10:aload_0         
		//    7   11:areturn         
		}

		static final String KEY_DATA_MIME_TYPE = "type";
		static final String KEY_DATA_URI = "uri";
		static final String KEY_SENDER = "sender";
		static final String KEY_TEXT = "text";
		static final String KEY_TIMESTAMP = "time";
		private String mDataMimeType;
		private Uri mDataUri;
		private final CharSequence mSender;
		private final CharSequence mText;
		private final long mTimestamp;

		public Message(CharSequence charsequence, long l, CharSequence charsequence1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #39  <Method void Object()>
			mText = charsequence;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #41  <Field CharSequence mText>
			mTimestamp = l;
		//    5    9:aload_0         
		//    6   10:lload_2         
		//    7   11:putfield        #43  <Field long mTimestamp>
			mSender = charsequence1;
		//    8   14:aload_0         
		//    9   15:aload           4
		//   10   17:putfield        #45  <Field CharSequence mSender>
		//   11   20:return          
		}
	}


	public static NotificationCompat$MessagingStyle extractMessagingStyleFromNotification(Notification notification)
	{
		notification = ((Notification) (NotificationCompat.IMPL.getExtras(notification)));
	//    0    0:getstatic       #42  <Field NotificationCompat$NotificationCompatImpl NotificationCompat.IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #48  <Method Bundle NotificationCompat$NotificationCompatImpl.getExtras(Notification)>
	//    3    9:astore_0        
		if(notification != null && !((Bundle) (notification)).containsKey("android.selfDisplayName"))
	//*   4   10:aload_0         
	//*   5   11:ifnull          25
	//*   6   14:aload_0         
	//*   7   15:ldc1            #50  <String "android.selfDisplayName">
	//*   8   17:invokevirtual   #56  <Method boolean Bundle.containsKey(String)>
	//*   9   20:ifne            25
			return null;
	//   10   23:aconst_null     
	//   11   24:areturn         
		NotificationCompat$MessagingStyle notificationcompat$messagingstyle;
		try
		{
			notificationcompat$messagingstyle = new NotificationCompat$MessagingStyle();
	//   12   25:new             #2   <Class NotificationCompat$MessagingStyle>
	//   13   28:dup             
	//   14   29:invokespecial   #57  <Method void NotificationCompat$MessagingStyle()>
	//   15   32:astore_1        
			notificationcompat$messagingstyle.restoreFromCompatExtras(((Bundle) (notification)));
	//   16   33:aload_1         
	//   17   34:aload_0         
	//   18   35:invokevirtual   #61  <Method void restoreFromCompatExtras(Bundle)>
		}
	//*  19   38:aload_1         
	//*  20   39:areturn         
		// Misplaced declaration of an exception variable
		catch(Notification notification)
	//*  21   40:astore_0        
		{
			return null;
	//   22   41:aconst_null     
	//   23   42:areturn         
		}
		return notificationcompat$messagingstyle;
	}

	public void addCompatExtras(Bundle bundle)
	{
		super.addCompatExtras(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #64  <Method void NotificationCompat$Style.addCompatExtras(Bundle)>
		if(mUserDisplayName != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #33  <Field CharSequence mUserDisplayName>
	//*   5    9:ifnull          22
			bundle.putCharSequence("android.selfDisplayName", mUserDisplayName);
	//    6   12:aload_1         
	//    7   13:ldc1            #50  <String "android.selfDisplayName">
	//    8   15:aload_0         
	//    9   16:getfield        #33  <Field CharSequence mUserDisplayName>
	//   10   19:invokevirtual   #68  <Method void Bundle.putCharSequence(String, CharSequence)>
		if(mConversationTitle != null)
	//*  11   22:aload_0         
	//*  12   23:getfield        #70  <Field CharSequence mConversationTitle>
	//*  13   26:ifnull          39
			bundle.putCharSequence("android.conversationTitle", mConversationTitle);
	//   14   29:aload_1         
	//   15   30:ldc1            #72  <String "android.conversationTitle">
	//   16   32:aload_0         
	//   17   33:getfield        #70  <Field CharSequence mConversationTitle>
	//   18   36:invokevirtual   #68  <Method void Bundle.putCharSequence(String, CharSequence)>
		if(!mMessages.isEmpty())
	//*  19   39:aload_0         
	//*  20   40:getfield        #28  <Field List mMessages>
	//*  21   43:invokeinterface #78  <Method boolean List.isEmpty()>
	//*  22   48:ifne            64
			bundle.putParcelableArray("android.messages", ((Parcelable []) (Message.getBundleArrayForMessages(mMessages))));
	//   23   51:aload_1         
	//   24   52:ldc1            #80  <String "android.messages">
	//   25   54:aload_0         
	//   26   55:getfield        #28  <Field List mMessages>
	//   27   58:invokestatic    #84  <Method Bundle[] NotificationCompat$MessagingStyle$Message.getBundleArrayForMessages(List)>
	//   28   61:invokevirtual   #88  <Method void Bundle.putParcelableArray(String, Parcelable[])>
	//   29   64:return          
	}

	public NotificationCompat$MessagingStyle addMessage(Message message)
	{
		mMessages.add(((Object) (message)));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List mMessages>
	//    2    4:aload_1         
	//    3    5:invokeinterface #94  <Method boolean List.add(Object)>
	//    4   10:pop             
		if(mMessages.size() > 25)
	//*   5   11:aload_0         
	//*   6   12:getfield        #28  <Field List mMessages>
	//*   7   15:invokeinterface #98  <Method int List.size()>
	//*   8   20:bipush          25
	//*   9   22:icmple          36
			mMessages.remove(0);
	//   10   25:aload_0         
	//   11   26:getfield        #28  <Field List mMessages>
	//   12   29:iconst_0        
	//   13   30:invokeinterface #102 <Method Object List.remove(int)>
	//   14   35:pop             
		return this;
	//   15   36:aload_0         
	//   16   37:areturn         
	}

	public NotificationCompat$MessagingStyle addMessage(CharSequence charsequence, long l, CharSequence charsequence1)
	{
		mMessages.add(((Object) (new Message(charsequence, l, charsequence1))));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List mMessages>
	//    2    4:new             #9   <Class NotificationCompat$MessagingStyle$Message>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:lload_2         
	//    6   10:aload           4
	//    7   12:invokespecial   #106 <Method void NotificationCompat$MessagingStyle$Message(CharSequence, long, CharSequence)>
	//    8   15:invokeinterface #94  <Method boolean List.add(Object)>
	//    9   20:pop             
		if(mMessages.size() > 25)
	//*  10   21:aload_0         
	//*  11   22:getfield        #28  <Field List mMessages>
	//*  12   25:invokeinterface #98  <Method int List.size()>
	//*  13   30:bipush          25
	//*  14   32:icmple          46
			mMessages.remove(0);
	//   15   35:aload_0         
	//   16   36:getfield        #28  <Field List mMessages>
	//   17   39:iconst_0        
	//   18   40:invokeinterface #102 <Method Object List.remove(int)>
	//   19   45:pop             
		return this;
	//   20   46:aload_0         
	//   21   47:areturn         
	}

	public CharSequence getConversationTitle()
	{
		return mConversationTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field CharSequence mConversationTitle>
	//    2    4:areturn         
	}

	public List getMessages()
	{
		return mMessages;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List mMessages>
	//    2    4:areturn         
	}

	public CharSequence getUserDisplayName()
	{
		return mUserDisplayName;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field CharSequence mUserDisplayName>
	//    2    4:areturn         
	}

	protected void restoreFromCompatExtras(Bundle bundle)
	{
		mMessages.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List mMessages>
	//    2    4:invokeinterface #120 <Method void List.clear()>
		mUserDisplayName = ((CharSequence) (bundle.getString("android.selfDisplayName")));
	//    3    9:aload_0         
	//    4   10:aload_1         
	//    5   11:ldc1            #50  <String "android.selfDisplayName">
	//    6   13:invokevirtual   #124 <Method String Bundle.getString(String)>
	//    7   16:putfield        #33  <Field CharSequence mUserDisplayName>
		mConversationTitle = ((CharSequence) (bundle.getString("android.conversationTitle")));
	//    8   19:aload_0         
	//    9   20:aload_1         
	//   10   21:ldc1            #72  <String "android.conversationTitle">
	//   11   23:invokevirtual   #124 <Method String Bundle.getString(String)>
	//   12   26:putfield        #70  <Field CharSequence mConversationTitle>
		bundle = ((Bundle) (bundle.getParcelableArray("android.messages")));
	//   13   29:aload_1         
	//   14   30:ldc1            #80  <String "android.messages">
	//   15   32:invokevirtual   #128 <Method Parcelable[] Bundle.getParcelableArray(String)>
	//   16   35:astore_1        
		if(bundle != null)
	//*  17   36:aload_1         
	//*  18   37:ifnull          48
			mMessages = Message.getMessagesFromBundleArray(((Parcelable []) (bundle)));
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:invokestatic    #132 <Method List NotificationCompat$MessagingStyle$Message.getMessagesFromBundleArray(Parcelable[])>
	//   22   45:putfield        #28  <Field List mMessages>
	//   23   48:return          
	}

	public NotificationCompat$MessagingStyle setConversationTitle(CharSequence charsequence)
	{
		mConversationTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #70  <Field CharSequence mConversationTitle>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public static final int MAXIMUM_RETAINED_MESSAGES = 25;
	CharSequence mConversationTitle;
	List mMessages;
	CharSequence mUserDisplayName;

	NotificationCompat$MessagingStyle()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void NotificationCompat$Style()>
		mMessages = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #25  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void ArrayList()>
	//    6   12:putfield        #28  <Field List mMessages>
	//    7   15:return          
	}

	public NotificationCompat$MessagingStyle(CharSequence charsequence)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void NotificationCompat$Style()>
		mMessages = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #25  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void ArrayList()>
	//    6   12:putfield        #28  <Field List mMessages>
		mUserDisplayName = charsequence;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #33  <Field CharSequence mUserDisplayName>
	//   10   20:return          
	}
}
