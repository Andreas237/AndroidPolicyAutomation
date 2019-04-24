// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.text.BidiFormatter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import java.util.*;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, NotificationBuilderWithBuilderAccessor

public static class NotificationCompat$MessagingStyle extends NotificationCompat.Style
{
	public static final class Message
	{

		static Bundle[] getBundleArrayForMessages(List list)
		{
			Bundle abundle[] = new Bundle[list.size()];
		//    0    0:aload_0         
		//    1    1:invokeinterface #64  <Method int List.size()>
		//    2    6:anewarray       Bundle[]
		//    3    9:astore_3        
			int j = list.size();
		//    4   10:aload_0         
		//    5   11:invokeinterface #64  <Method int List.size()>
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
		//   16   28:invokeinterface #68  <Method Object List.get(int)>
		//   17   33:checkcast       #2   <Class NotificationCompat$MessagingStyle$Message>
		//   18   36:invokespecial   #72  <Method Bundle toBundle()>
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
			if(bundle.containsKey("text"))
		//*   0    0:aload_0         
		//*   1    1:ldc1            #26  <String "text">
		//*   2    3:invokevirtual   #82  <Method boolean Bundle.containsKey(String)>
		//*   3    6:ifeq            108
			{
				if(!bundle.containsKey("time"))
		//*   4    9:aload_0         
		//*   5   10:ldc1            #29  <String "time">
		//*   6   12:invokevirtual   #82  <Method boolean Bundle.containsKey(String)>
		//*   7   15:ifne            20
					return null;
		//    8   18:aconst_null     
		//    9   19:areturn         
				Message message;
				try
				{
					message = new Message(bundle.getCharSequence("text"), bundle.getLong("time"), bundle.getCharSequence("sender"));
		//   10   20:new             #2   <Class NotificationCompat$MessagingStyle$Message>
		//   11   23:dup             
		//   12   24:aload_0         
		//   13   25:ldc1            #26  <String "text">
		//   14   27:invokevirtual   #86  <Method CharSequence Bundle.getCharSequence(String)>
		//   15   30:aload_0         
		//   16   31:ldc1            #29  <String "time">
		//   17   33:invokevirtual   #90  <Method long Bundle.getLong(String)>
		//   18   36:aload_0         
		//   19   37:ldc1            #23  <String "sender">
		//   20   39:invokevirtual   #86  <Method CharSequence Bundle.getCharSequence(String)>
		//   21   42:invokespecial   #92  <Method void NotificationCompat$MessagingStyle$Message(CharSequence, long, CharSequence)>
		//   22   45:astore_1        
					if(bundle.containsKey("type") && bundle.containsKey("uri"))
		//*  23   46:aload_0         
		//*  24   47:ldc1            #14  <String "type">
		//*  25   49:invokevirtual   #82  <Method boolean Bundle.containsKey(String)>
		//*  26   52:ifeq            84
		//*  27   55:aload_0         
		//*  28   56:ldc1            #17  <String "uri">
		//*  29   58:invokevirtual   #82  <Method boolean Bundle.containsKey(String)>
		//*  30   61:ifeq            84
						message.setData(bundle.getString("type"), (Uri)bundle.getParcelable("uri"));
		//   31   64:aload_1         
		//   32   65:aload_0         
		//   33   66:ldc1            #14  <String "type">
		//   34   68:invokevirtual   #96  <Method String Bundle.getString(String)>
		//   35   71:aload_0         
		//   36   72:ldc1            #17  <String "uri">
		//   37   74:invokevirtual   #100 <Method Parcelable Bundle.getParcelable(String)>
		//   38   77:checkcast       #102 <Class Uri>
		//   39   80:invokevirtual   #106 <Method NotificationCompat$MessagingStyle$Message setData(String, Uri)>
		//   40   83:pop             
					if(bundle.containsKey("extras"))
		//*  41   84:aload_0         
		//*  42   85:ldc1            #20  <String "extras">
		//*  43   87:invokevirtual   #82  <Method boolean Bundle.containsKey(String)>
		//*  44   90:ifeq            106
						message.getExtras().putAll(bundle.getBundle("extras"));
		//   45   93:aload_1         
		//   46   94:invokevirtual   #109 <Method Bundle getExtras()>
		//   47   97:aload_0         
		//   48   98:ldc1            #20  <String "extras">
		//   49  100:invokevirtual   #113 <Method Bundle Bundle.getBundle(String)>
		//   50  103:invokevirtual   #117 <Method void Bundle.putAll(Bundle)>
				}
		//*  51  106:aload_1         
		//*  52  107:areturn         
		//*  53  108:aconst_null     
		//*  54  109:areturn         
				// Misplaced declaration of an exception variable
				catch(Bundle bundle)
		//*  55  110:astore_0        
				{
					return null;
		//   56  111:aconst_null     
		//   57  112:areturn         
				}
				return message;
			} else
			{
				return null;
			}
		}

		static List getMessagesFromBundleArray(Parcelable aparcelable[])
		{
			int i = 0;
		//    0    0:iconst_0        
		//    1    1:istore_1        
			ArrayList arraylist = new ArrayList(aparcelable.length);
		//    2    2:new             #121 <Class ArrayList>
		//    3    5:dup             
		//    4    6:aload_0         
		//    5    7:arraylength     
		//    6    8:invokespecial   #124 <Method void ArrayList(int)>
		//    7   11:astore_2        
			for(; i < aparcelable.length; i++)
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
		//   15   21:instanceof      #46  <Class Bundle>
		//   16   24:ifeq            49
				Message message = getMessageFromBundle((Bundle)aparcelable[i]);
		//   17   27:aload_0         
		//   18   28:iload_1         
		//   19   29:aaload          
		//   20   30:checkcast       #46  <Class Bundle>
		//   21   33:invokestatic    #126 <Method NotificationCompat$MessagingStyle$Message getMessageFromBundle(Bundle)>
		//   22   36:astore_3        
				if(message != null)
		//*  23   37:aload_3         
		//*  24   38:ifnull          49
					((List) (arraylist)).add(((Object) (message)));
		//   25   41:aload_2         
		//   26   42:aload_3         
		//   27   43:invokeinterface #130 <Method boolean List.add(Object)>
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
		//    0    0:new             #46  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #47  <Method void Bundle()>
		//    3    7:astore_1        
			if(mText != null)
		//*   4    8:aload_0         
		//*   5    9:getfield        #51  <Field CharSequence mText>
		//*   6   12:ifnull          25
				bundle.putCharSequence("text", mText);
		//    7   15:aload_1         
		//    8   16:ldc1            #26  <String "text">
		//    9   18:aload_0         
		//   10   19:getfield        #51  <Field CharSequence mText>
		//   11   22:invokevirtual   #135 <Method void Bundle.putCharSequence(String, CharSequence)>
			bundle.putLong("time", mTimestamp);
		//   12   25:aload_1         
		//   13   26:ldc1            #29  <String "time">
		//   14   28:aload_0         
		//   15   29:getfield        #53  <Field long mTimestamp>
		//   16   32:invokevirtual   #139 <Method void Bundle.putLong(String, long)>
			if(mSender != null)
		//*  17   35:aload_0         
		//*  18   36:getfield        #55  <Field CharSequence mSender>
		//*  19   39:ifnull          52
				bundle.putCharSequence("sender", mSender);
		//   20   42:aload_1         
		//   21   43:ldc1            #23  <String "sender">
		//   22   45:aload_0         
		//   23   46:getfield        #55  <Field CharSequence mSender>
		//   24   49:invokevirtual   #135 <Method void Bundle.putCharSequence(String, CharSequence)>
			if(mDataMimeType != null)
		//*  25   52:aload_0         
		//*  26   53:getfield        #141 <Field String mDataMimeType>
		//*  27   56:ifnull          69
				bundle.putString("type", mDataMimeType);
		//   28   59:aload_1         
		//   29   60:ldc1            #14  <String "type">
		//   30   62:aload_0         
		//   31   63:getfield        #141 <Field String mDataMimeType>
		//   32   66:invokevirtual   #145 <Method void Bundle.putString(String, String)>
			if(mDataUri != null)
		//*  33   69:aload_0         
		//*  34   70:getfield        #147 <Field Uri mDataUri>
		//*  35   73:ifnull          86
				bundle.putParcelable("uri", ((Parcelable) (mDataUri)));
		//   36   76:aload_1         
		//   37   77:ldc1            #17  <String "uri">
		//   38   79:aload_0         
		//   39   80:getfield        #147 <Field Uri mDataUri>
		//   40   83:invokevirtual   #151 <Method void Bundle.putParcelable(String, Parcelable)>
			if(mExtras != null)
		//*  41   86:aload_0         
		//*  42   87:getfield        #49  <Field Bundle mExtras>
		//*  43   90:ifnull          103
				bundle.putBundle("extras", mExtras);
		//   44   93:aload_1         
		//   45   94:ldc1            #20  <String "extras">
		//   46   96:aload_0         
		//   47   97:getfield        #49  <Field Bundle mExtras>
		//   48  100:invokevirtual   #155 <Method void Bundle.putBundle(String, Bundle)>
			return bundle;
		//   49  103:aload_1         
		//   50  104:areturn         
		}

		public String getDataMimeType()
		{
			return mDataMimeType;
		//    0    0:aload_0         
		//    1    1:getfield        #141 <Field String mDataMimeType>
		//    2    4:areturn         
		}

		public Uri getDataUri()
		{
			return mDataUri;
		//    0    0:aload_0         
		//    1    1:getfield        #147 <Field Uri mDataUri>
		//    2    4:areturn         
		}

		public Bundle getExtras()
		{
			return mExtras;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field Bundle mExtras>
		//    2    4:areturn         
		}

		public CharSequence getSender()
		{
			return mSender;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field CharSequence mSender>
		//    2    4:areturn         
		}

		public CharSequence getText()
		{
			return mText;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field CharSequence mText>
		//    2    4:areturn         
		}

		public long getTimestamp()
		{
			return mTimestamp;
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field long mTimestamp>
		//    2    4:lreturn         
		}

		public Message setData(String s, Uri uri)
		{
			mDataMimeType = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #141 <Field String mDataMimeType>
			mDataUri = uri;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #147 <Field Uri mDataUri>
			return this;
		//    6   10:aload_0         
		//    7   11:areturn         
		}

		static final String KEY_DATA_MIME_TYPE = "type";
		static final String KEY_DATA_URI = "uri";
		static final String KEY_EXTRAS_BUNDLE = "extras";
		static final String KEY_SENDER = "sender";
		static final String KEY_TEXT = "text";
		static final String KEY_TIMESTAMP = "time";
		private String mDataMimeType;
		private Uri mDataUri;
		private Bundle mExtras;
		private final CharSequence mSender;
		private final CharSequence mText;
		private final long mTimestamp;

		public Message(CharSequence charsequence, long l, CharSequence charsequence1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #44  <Method void Object()>
			mExtras = new Bundle();
		//    2    4:aload_0         
		//    3    5:new             #46  <Class Bundle>
		//    4    8:dup             
		//    5    9:invokespecial   #47  <Method void Bundle()>
		//    6   12:putfield        #49  <Field Bundle mExtras>
			mText = charsequence;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #51  <Field CharSequence mText>
			mTimestamp = l;
		//   10   20:aload_0         
		//   11   21:lload_2         
		//   12   22:putfield        #53  <Field long mTimestamp>
			mSender = charsequence1;
		//   13   25:aload_0         
		//   14   26:aload           4
		//   15   28:putfield        #55  <Field CharSequence mSender>
		//   16   31:return          
		}
	}


	public static NotificationCompat$MessagingStyle extractMessagingStyleFromNotification(Notification notification)
	{
		notification = ((Notification) (NotificationCompat.getExtras(notification)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #42  <Method Bundle NotificationCompat.getExtras(Notification)>
	//    2    4:astore_0        
		if(notification != null && !((Bundle) (notification)).containsKey("android.selfDisplayName"))
	//*   3    5:aload_0         
	//*   4    6:ifnull          20
	//*   5    9:aload_0         
	//*   6   10:ldc1            #44  <String "android.selfDisplayName">
	//*   7   12:invokevirtual   #50  <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifne            20
			return null;
	//    9   18:aconst_null     
	//   10   19:areturn         
		NotificationCompat$MessagingStyle notificationcompat$messagingstyle;
		try
		{
			notificationcompat$messagingstyle = new NotificationCompat$MessagingStyle();
	//   11   20:new             #2   <Class NotificationCompat$MessagingStyle>
	//   12   23:dup             
	//   13   24:invokespecial   #51  <Method void NotificationCompat$MessagingStyle()>
	//   14   27:astore_1        
			notificationcompat$messagingstyle.restoreFromCompatExtras(((Bundle) (notification)));
	//   15   28:aload_1         
	//   16   29:aload_0         
	//   17   30:invokevirtual   #55  <Method void restoreFromCompatExtras(Bundle)>
		}
	//*  18   33:aload_1         
	//*  19   34:areturn         
		// Misplaced declaration of an exception variable
		catch(Notification notification)
	//*  20   35:astore_0        
		{
			return null;
	//   21   36:aconst_null     
	//   22   37:areturn         
		}
		return notificationcompat$messagingstyle;
	}

	private Message findLatestIncomingMessage()
	{
		for(int i = mMessages.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field List mMessages>
	//*   2    4:invokeinterface #64  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:isub            
	//*   5   11:istore_1        
	//*   6   12:iload_1         
	//*   7   13:iflt            49
		{
			Message message = (Message)mMessages.get(i);
	//    8   16:aload_0         
	//    9   17:getfield        #28  <Field List mMessages>
	//   10   20:iload_1         
	//   11   21:invokeinterface #68  <Method Object List.get(int)>
	//   12   26:checkcast       #9   <Class NotificationCompat$MessagingStyle$Message>
	//   13   29:astore_2        
			if(!TextUtils.isEmpty(message.getSender()))
	//*  14   30:aload_2         
	//*  15   31:invokevirtual   #72  <Method CharSequence NotificationCompat$MessagingStyle$Message.getSender()>
	//*  16   34:invokestatic    #78  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   37:ifne            42
				return message;
	//   18   40:aload_2         
	//   19   41:areturn         
		}

	//   20   42:iload_1         
	//   21   43:iconst_1        
	//   22   44:isub            
	//   23   45:istore_1        
	//*  24   46:goto            12
		if(!mMessages.isEmpty())
	//*  25   49:aload_0         
	//*  26   50:getfield        #28  <Field List mMessages>
	//*  27   53:invokeinterface #81  <Method boolean List.isEmpty()>
	//*  28   58:ifne            85
			return (Message)mMessages.get(mMessages.size() - 1);
	//   29   61:aload_0         
	//   30   62:getfield        #28  <Field List mMessages>
	//   31   65:aload_0         
	//   32   66:getfield        #28  <Field List mMessages>
	//   33   69:invokeinterface #64  <Method int List.size()>
	//   34   74:iconst_1        
	//   35   75:isub            
	//   36   76:invokeinterface #68  <Method Object List.get(int)>
	//   37   81:checkcast       #9   <Class NotificationCompat$MessagingStyle$Message>
	//   38   84:areturn         
		else
			return null;
	//   39   85:aconst_null     
	//   40   86:areturn         
	}

	private boolean hasMessagesWithoutSender()
	{
		for(int i = mMessages.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field List mMessages>
	//*   2    4:invokeinterface #64  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:isub            
	//*   5   11:istore_1        
	//*   6   12:iload_1         
	//*   7   13:iflt            44
			if(((Message)mMessages.get(i)).getSender() == null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #28  <Field List mMessages>
	//*  10   20:iload_1         
	//*  11   21:invokeinterface #68  <Method Object List.get(int)>
	//*  12   26:checkcast       #9   <Class NotificationCompat$MessagingStyle$Message>
	//*  13   29:invokevirtual   #72  <Method CharSequence NotificationCompat$MessagingStyle$Message.getSender()>
	//*  14   32:ifnonnull       37
				return true;
	//   15   35:iconst_1        
	//   16   36:ireturn         

	//   17   37:iload_1         
	//   18   38:iconst_1        
	//   19   39:isub            
	//   20   40:istore_1        
	//*  21   41:goto            12
		return false;
	//   22   44:iconst_0        
	//   23   45:ireturn         
	}

	private TextAppearanceSpan makeFontColorSpan(int i)
	{
		return new TextAppearanceSpan(((String) (null)), 0, 0, ColorStateList.valueOf(i), ((ColorStateList) (null)));
	//    0    0:new             #87  <Class TextAppearanceSpan>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:iload_1         
	//    6    8:invokestatic    #93  <Method ColorStateList ColorStateList.valueOf(int)>
	//    7   11:aconst_null     
	//    8   12:invokespecial   #96  <Method void TextAppearanceSpan(String, int, int, ColorStateList, ColorStateList)>
	//    9   15:areturn         
	}

	private CharSequence makeMessageLine(Message message)
	{
		BidiFormatter bidiformatter = BidiFormatter.getInstance();
	//    0    0:invokestatic    #104 <Method BidiFormatter BidiFormatter.getInstance()>
	//    1    3:astore          7
		SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
	//    2    5:new             #106 <Class SpannableStringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #107 <Method void SpannableStringBuilder()>
	//    5   12:astore          8
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   6   14:getstatic       #112 <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   17:bipush          21
	//*   8   19:icmplt          27
			flag = true;
	//    9   22:iconst_1        
	//   10   23:istore_3        
		else
	//*  11   24:goto            29
			flag = false;
	//   12   27:iconst_0        
	//   13   28:istore_3        
		int i;
		if(flag)
	//*  14   29:iload_3         
	//*  15   30:ifeq            39
			i = 0xff000000;
	//   16   33:ldc1            #113 <Int 0xff000000>
	//   17   35:istore_2        
		else
	//*  18   36:goto            41
			i = -1;
	//   19   39:iconst_m1       
	//   20   40:istore_2        
		Object obj1 = ((Object) (message.getSender()));
	//   21   41:aload_1         
	//   22   42:invokevirtual   #72  <Method CharSequence NotificationCompat$MessagingStyle$Message.getSender()>
	//   23   45:astore          6
		int j = i;
	//   24   47:iload_2         
	//   25   48:istore          4
		if(TextUtils.isEmpty(message.getSender()))
	//*  26   50:aload_1         
	//*  27   51:invokevirtual   #72  <Method CharSequence NotificationCompat$MessagingStyle$Message.getSender()>
	//*  28   54:invokestatic    #78  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  29   57:ifeq            121
		{
			Object obj;
			if(mUserDisplayName == null)
	//*  30   60:aload_0         
	//*  31   61:getfield        #33  <Field CharSequence mUserDisplayName>
	//*  32   64:ifnonnull       74
				obj = "";
	//   33   67:ldc1            #115 <String "">
	//   34   69:astore          5
			else
	//*  35   71:goto            80
				obj = ((Object) (mUserDisplayName));
	//   36   74:aload_0         
	//   37   75:getfield        #33  <Field CharSequence mUserDisplayName>
	//   38   78:astore          5
			j = i;
	//   39   80:iload_2         
	//   40   81:istore          4
			obj1 = obj;
	//   41   83:aload           5
	//   42   85:astore          6
			if(flag)
	//*  43   87:iload_3         
	//*  44   88:ifeq            121
			{
				j = i;
	//   45   91:iload_2         
	//   46   92:istore          4
				obj1 = obj;
	//   47   94:aload           5
	//   48   96:astore          6
				if(mBuilder.getColor() != 0)
	//*  49   98:aload_0         
	//*  50   99:getfield        #119 <Field NotificationCompat$Builder mBuilder>
	//*  51  102:invokevirtual   #124 <Method int NotificationCompat$Builder.getColor()>
	//*  52  105:ifeq            121
				{
					j = mBuilder.getColor();
	//   53  108:aload_0         
	//   54  109:getfield        #119 <Field NotificationCompat$Builder mBuilder>
	//   55  112:invokevirtual   #124 <Method int NotificationCompat$Builder.getColor()>
	//   56  115:istore          4
					obj1 = obj;
	//   57  117:aload           5
	//   58  119:astore          6
				}
			}
		}
		CharSequence charsequence = bidiformatter.unicodeWrap(((CharSequence) (obj1)));
	//   59  121:aload           7
	//   60  123:aload           6
	//   61  125:invokevirtual   #128 <Method CharSequence BidiFormatter.unicodeWrap(CharSequence)>
	//   62  128:astore          5
		spannablestringbuilder.append(charsequence);
	//   63  130:aload           8
	//   64  132:aload           5
	//   65  134:invokevirtual   #132 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   66  137:pop             
		spannablestringbuilder.setSpan(((Object) (makeFontColorSpan(j))), spannablestringbuilder.length() - charsequence.length(), spannablestringbuilder.length(), 33);
	//   67  138:aload           8
	//   68  140:aload_0         
	//   69  141:iload           4
	//   70  143:invokespecial   #134 <Method TextAppearanceSpan makeFontColorSpan(int)>
	//   71  146:aload           8
	//   72  148:invokevirtual   #137 <Method int SpannableStringBuilder.length()>
	//   73  151:aload           5
	//   74  153:invokeinterface #140 <Method int CharSequence.length()>
	//   75  158:isub            
	//   76  159:aload           8
	//   77  161:invokevirtual   #137 <Method int SpannableStringBuilder.length()>
	//   78  164:bipush          33
	//   79  166:invokevirtual   #144 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
		if(message.getText() == null)
	//*  80  169:aload_1         
	//*  81  170:invokevirtual   #147 <Method CharSequence NotificationCompat$MessagingStyle$Message.getText()>
	//*  82  173:ifnonnull       182
			message = "";
	//   83  176:ldc1            #115 <String "">
	//   84  178:astore_1        
		else
	//*  85  179:goto            187
			message = ((Message) (message.getText()));
	//   86  182:aload_1         
	//   87  183:invokevirtual   #147 <Method CharSequence NotificationCompat$MessagingStyle$Message.getText()>
	//   88  186:astore_1        
		spannablestringbuilder.append("  ").append(bidiformatter.unicodeWrap(((CharSequence) (message))));
	//   89  187:aload           8
	//   90  189:ldc1            #149 <String "  ">
	//   91  191:invokevirtual   #132 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   92  194:aload           7
	//   93  196:aload_1         
	//   94  197:invokevirtual   #128 <Method CharSequence BidiFormatter.unicodeWrap(CharSequence)>
	//   95  200:invokevirtual   #132 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   96  203:pop             
		return ((CharSequence) (spannablestringbuilder));
	//   97  204:aload           8
	//   98  206:areturn         
	}

	public void addCompatExtras(Bundle bundle)
	{
		super.addCompatExtras(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #152 <Method void NotificationCompat$Style.addCompatExtras(Bundle)>
		if(mUserDisplayName != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #33  <Field CharSequence mUserDisplayName>
	//*   5    9:ifnull          22
			bundle.putCharSequence("android.selfDisplayName", mUserDisplayName);
	//    6   12:aload_1         
	//    7   13:ldc1            #44  <String "android.selfDisplayName">
	//    8   15:aload_0         
	//    9   16:getfield        #33  <Field CharSequence mUserDisplayName>
	//   10   19:invokevirtual   #156 <Method void Bundle.putCharSequence(String, CharSequence)>
		if(mConversationTitle != null)
	//*  11   22:aload_0         
	//*  12   23:getfield        #158 <Field CharSequence mConversationTitle>
	//*  13   26:ifnull          39
			bundle.putCharSequence("android.conversationTitle", mConversationTitle);
	//   14   29:aload_1         
	//   15   30:ldc1            #160 <String "android.conversationTitle">
	//   16   32:aload_0         
	//   17   33:getfield        #158 <Field CharSequence mConversationTitle>
	//   18   36:invokevirtual   #156 <Method void Bundle.putCharSequence(String, CharSequence)>
		if(!mMessages.isEmpty())
	//*  19   39:aload_0         
	//*  20   40:getfield        #28  <Field List mMessages>
	//*  21   43:invokeinterface #81  <Method boolean List.isEmpty()>
	//*  22   48:ifne            64
			bundle.putParcelableArray("android.messages", ((Parcelable []) (Message.getBundleArrayForMessages(mMessages))));
	//   23   51:aload_1         
	//   24   52:ldc1            #162 <String "android.messages">
	//   25   54:aload_0         
	//   26   55:getfield        #28  <Field List mMessages>
	//   27   58:invokestatic    #166 <Method Bundle[] NotificationCompat$MessagingStyle$Message.getBundleArrayForMessages(List)>
	//   28   61:invokevirtual   #170 <Method void Bundle.putParcelableArray(String, Parcelable[])>
	//   29   64:return          
	}

	public NotificationCompat$MessagingStyle addMessage(Message message)
	{
		mMessages.add(((Object) (message)));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List mMessages>
	//    2    4:aload_1         
	//    3    5:invokeinterface #176 <Method boolean List.add(Object)>
	//    4   10:pop             
		if(mMessages.size() > 25)
	//*   5   11:aload_0         
	//*   6   12:getfield        #28  <Field List mMessages>
	//*   7   15:invokeinterface #64  <Method int List.size()>
	//*   8   20:bipush          25
	//*   9   22:icmple          36
			mMessages.remove(0);
	//   10   25:aload_0         
	//   11   26:getfield        #28  <Field List mMessages>
	//   12   29:iconst_0        
	//   13   30:invokeinterface #179 <Method Object List.remove(int)>
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
	//    7   12:invokespecial   #183 <Method void NotificationCompat$MessagingStyle$Message(CharSequence, long, CharSequence)>
	//    8   15:invokeinterface #176 <Method boolean List.add(Object)>
	//    9   20:pop             
		if(mMessages.size() > 25)
	//*  10   21:aload_0         
	//*  11   22:getfield        #28  <Field List mMessages>
	//*  12   25:invokeinterface #64  <Method int List.size()>
	//*  13   30:bipush          25
	//*  14   32:icmple          46
			mMessages.remove(0);
	//   15   35:aload_0         
	//   16   36:getfield        #28  <Field List mMessages>
	//   17   39:iconst_0        
	//   18   40:invokeinterface #179 <Method Object List.remove(int)>
	//   19   45:pop             
		return this;
	//   20   46:aload_0         
	//   21   47:areturn         
	}

	public void apply(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #112 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          132
		{
			android.app.Notification.MessagingStyle messagingstyle = (new android.app.Notification.MessagingStyle(mUserDisplayName)).setConversationTitle(mConversationTitle);
	//    3    8:new             #191 <Class android.app.Notification$MessagingStyle>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:getfield        #33  <Field CharSequence mUserDisplayName>
	//    7   16:invokespecial   #193 <Method void android.app.Notification$MessagingStyle(CharSequence)>
	//    8   19:aload_0         
	//    9   20:getfield        #158 <Field CharSequence mConversationTitle>
	//   10   23:invokevirtual   #197 <Method android.app.Notification$MessagingStyle android.app.Notification$MessagingStyle.setConversationTitle(CharSequence)>
	//   11   26:astore          4
			android.app.e e;
			for(Iterator iterator = mMessages.iterator(); iterator.hasNext(); messagingstyle.addMessage(e))
	//*  12   28:aload_0         
	//*  13   29:getfield        #28  <Field List mMessages>
	//*  14   32:invokeinterface #201 <Method Iterator List.iterator()>
	//*  15   37:astore          5
	//*  16   39:aload           5
	//*  17   41:invokeinterface #206 <Method boolean Iterator.hasNext()>
	//*  18   46:ifeq            120
			{
				Message message = (Message)iterator.next();
	//   19   49:aload           5
	//   20   51:invokeinterface #210 <Method Object Iterator.next()>
	//   21   56:checkcast       #9   <Class NotificationCompat$MessagingStyle$Message>
	//   22   59:astore          6
				e = new android.app.e(message.getText(), message.getTimestamp(), message.getSender());
	//   23   61:new             #212 <Class android.app.Notification$MessagingStyle$Message>
	//   24   64:dup             
	//   25   65:aload           6
	//   26   67:invokevirtual   #147 <Method CharSequence NotificationCompat$MessagingStyle$Message.getText()>
	//   27   70:aload           6
	//   28   72:invokevirtual   #216 <Method long NotificationCompat$MessagingStyle$Message.getTimestamp()>
	//   29   75:aload           6
	//   30   77:invokevirtual   #72  <Method CharSequence NotificationCompat$MessagingStyle$Message.getSender()>
	//   31   80:invokespecial   #217 <Method void android.app.Notification$MessagingStyle$Message(CharSequence, long, CharSequence)>
	//   32   83:astore          7
				if(message.getDataMimeType() != null)
	//*  33   85:aload           6
	//*  34   87:invokevirtual   #221 <Method String NotificationCompat$MessagingStyle$Message.getDataMimeType()>
	//*  35   90:ifnull          109
					e.setData(message.getDataMimeType(), message.getDataUri());
	//   36   93:aload           7
	//   37   95:aload           6
	//   38   97:invokevirtual   #221 <Method String NotificationCompat$MessagingStyle$Message.getDataMimeType()>
	//   39  100:aload           6
	//   40  102:invokevirtual   #225 <Method Uri NotificationCompat$MessagingStyle$Message.getDataUri()>
	//   41  105:invokevirtual   #229 <Method android.app.Notification$MessagingStyle$Message android.app.Notification$MessagingStyle$Message.setData(String, Uri)>
	//   42  108:pop             
			}

	//   43  109:aload           4
	//   44  111:aload           7
	//   45  113:invokevirtual   #232 <Method android.app.Notification$MessagingStyle android.app.Notification$MessagingStyle.addMessage(android.app.Notification$MessagingStyle$Message)>
	//   46  116:pop             
	//*  47  117:goto            39
			messagingstyle.setBuilder(notificationbuilderwithbuilderaccessor.getBuilder());
	//   48  120:aload           4
	//   49  122:aload_1         
	//   50  123:invokeinterface #238 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//   51  128:invokevirtual   #242 <Method void android.app.Notification$MessagingStyle.setBuilder(android.app.Notification$Builder)>
			return;
	//   52  131:return          
		}
		Object obj = ((Object) (findLatestIncomingMessage()));
	//   53  132:aload_0         
	//   54  133:invokespecial   #244 <Method NotificationCompat$MessagingStyle$Message findLatestIncomingMessage()>
	//   55  136:astore          4
		if(mConversationTitle != null)
	//*  56  138:aload_0         
	//*  57  139:getfield        #158 <Field CharSequence mConversationTitle>
	//*  58  142:ifnull          162
			notificationbuilderwithbuilderaccessor.getBuilder().setContentTitle(mConversationTitle);
	//   59  145:aload_1         
	//   60  146:invokeinterface #238 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//   61  151:aload_0         
	//   62  152:getfield        #158 <Field CharSequence mConversationTitle>
	//   63  155:invokevirtual   #250 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//   64  158:pop             
		else
	//*  65  159:goto            182
		if(obj != null)
	//*  66  162:aload           4
	//*  67  164:ifnull          182
			notificationbuilderwithbuilderaccessor.getBuilder().setContentTitle(((Message) (obj)).getSender());
	//   68  167:aload_1         
	//   69  168:invokeinterface #238 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//   70  173:aload           4
	//   71  175:invokevirtual   #72  <Method CharSequence NotificationCompat$MessagingStyle$Message.getSender()>
	//   72  178:invokevirtual   #250 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//   73  181:pop             
		if(obj != null)
	//*  74  182:aload           4
	//*  75  184:ifnull          228
		{
			android.app.Notification.Builder builder = notificationbuilderwithbuilderaccessor.getBuilder();
	//   76  187:aload_1         
	//   77  188:invokeinterface #238 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//   78  193:astore          5
			if(mConversationTitle != null)
	//*  79  195:aload_0         
	//*  80  196:getfield        #158 <Field CharSequence mConversationTitle>
	//*  81  199:ifnull          213
				obj = ((Object) (makeMessageLine(((Message) (obj)))));
	//   82  202:aload_0         
	//   83  203:aload           4
	//   84  205:invokespecial   #252 <Method CharSequence makeMessageLine(NotificationCompat$MessagingStyle$Message)>
	//   85  208:astore          4
			else
	//*  86  210:goto            220
				obj = ((Object) (((Message) (obj)).getText()));
	//   87  213:aload           4
	//   88  215:invokevirtual   #147 <Method CharSequence NotificationCompat$MessagingStyle$Message.getText()>
	//   89  218:astore          4
			builder.setContentText(((CharSequence) (obj)));
	//   90  220:aload           5
	//   91  222:aload           4
	//   92  224:invokevirtual   #255 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//   93  227:pop             
		}
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  94  228:getstatic       #112 <Field int android.os.Build$VERSION.SDK_INT>
	//*  95  231:bipush          16
	//*  96  233:icmplt          386
		{
			SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
	//   97  236:new             #106 <Class SpannableStringBuilder>
	//   98  239:dup             
	//   99  240:invokespecial   #107 <Method void SpannableStringBuilder()>
	//  100  243:astore          5
			boolean flag;
			if(mConversationTitle == null && !hasMessagesWithoutSender())
	//* 101  245:aload_0         
	//* 102  246:getfield        #158 <Field CharSequence mConversationTitle>
	//* 103  249:ifnonnull       267
	//* 104  252:aload_0         
	//* 105  253:invokespecial   #257 <Method boolean hasMessagesWithoutSender()>
	//* 106  256:ifeq            262
	//* 107  259:goto            267
				flag = false;
	//  108  262:iconst_0        
	//  109  263:istore_2        
			else
	//* 110  264:goto            269
				flag = true;
	//  111  267:iconst_1        
	//  112  268:istore_2        
			for(int i = mMessages.size() - 1; i >= 0; i--)
	//* 113  269:aload_0         
	//* 114  270:getfield        #28  <Field List mMessages>
	//* 115  273:invokeinterface #64  <Method int List.size()>
	//* 116  278:iconst_1        
	//* 117  279:isub            
	//* 118  280:istore_3        
	//* 119  281:iload_3         
	//* 120  282:iflt            363
			{
				Object obj1 = ((Object) ((Message)mMessages.get(i)));
	//  121  285:aload_0         
	//  122  286:getfield        #28  <Field List mMessages>
	//  123  289:iload_3         
	//  124  290:invokeinterface #68  <Method Object List.get(int)>
	//  125  295:checkcast       #9   <Class NotificationCompat$MessagingStyle$Message>
	//  126  298:astore          4
				if(flag)
	//* 127  300:iload_2         
	//* 128  301:ifeq            315
					obj1 = ((Object) (makeMessageLine(((Message) (obj1)))));
	//  129  304:aload_0         
	//  130  305:aload           4
	//  131  307:invokespecial   #252 <Method CharSequence makeMessageLine(NotificationCompat$MessagingStyle$Message)>
	//  132  310:astore          4
				else
	//* 133  312:goto            322
					obj1 = ((Object) (((Message) (obj1)).getText()));
	//  134  315:aload           4
	//  135  317:invokevirtual   #147 <Method CharSequence NotificationCompat$MessagingStyle$Message.getText()>
	//  136  320:astore          4
				if(i != mMessages.size() - 1)
	//* 137  322:iload_3         
	//* 138  323:aload_0         
	//* 139  324:getfield        #28  <Field List mMessages>
	//* 140  327:invokeinterface #64  <Method int List.size()>
	//* 141  332:iconst_1        
	//* 142  333:isub            
	//* 143  334:icmpeq          347
					spannablestringbuilder.insert(0, "\n");
	//  144  337:aload           5
	//  145  339:iconst_0        
	//  146  340:ldc2            #259 <String "\n">
	//  147  343:invokevirtual   #263 <Method SpannableStringBuilder SpannableStringBuilder.insert(int, CharSequence)>
	//  148  346:pop             
				spannablestringbuilder.insert(0, ((CharSequence) (obj1)));
	//  149  347:aload           5
	//  150  349:iconst_0        
	//  151  350:aload           4
	//  152  352:invokevirtual   #263 <Method SpannableStringBuilder SpannableStringBuilder.insert(int, CharSequence)>
	//  153  355:pop             
			}

	//  154  356:iload_3         
	//  155  357:iconst_1        
	//  156  358:isub            
	//  157  359:istore_3        
	//* 158  360:goto            281
			(new android.app.Notification.BigTextStyle(notificationbuilderwithbuilderaccessor.getBuilder())).setBigContentTitle(((CharSequence) (null))).bigText(((CharSequence) (spannablestringbuilder)));
	//  159  363:new             #265 <Class android.app.Notification$BigTextStyle>
	//  160  366:dup             
	//  161  367:aload_1         
	//  162  368:invokeinterface #238 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//  163  373:invokespecial   #267 <Method void android.app.Notification$BigTextStyle(android.app.Notification$Builder)>
	//  164  376:aconst_null     
	//  165  377:invokevirtual   #271 <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.setBigContentTitle(CharSequence)>
	//  166  380:aload           5
	//  167  382:invokevirtual   #274 <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.bigText(CharSequence)>
	//  168  385:pop             
		}
	//  169  386:return          
	}

	public CharSequence getConversationTitle()
	{
		return mConversationTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field CharSequence mConversationTitle>
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
	//    2    4:invokeinterface #283 <Method void List.clear()>
		mUserDisplayName = ((CharSequence) (bundle.getString("android.selfDisplayName")));
	//    3    9:aload_0         
	//    4   10:aload_1         
	//    5   11:ldc1            #44  <String "android.selfDisplayName">
	//    6   13:invokevirtual   #287 <Method String Bundle.getString(String)>
	//    7   16:putfield        #33  <Field CharSequence mUserDisplayName>
		mConversationTitle = ((CharSequence) (bundle.getString("android.conversationTitle")));
	//    8   19:aload_0         
	//    9   20:aload_1         
	//   10   21:ldc1            #160 <String "android.conversationTitle">
	//   11   23:invokevirtual   #287 <Method String Bundle.getString(String)>
	//   12   26:putfield        #158 <Field CharSequence mConversationTitle>
		bundle = ((Bundle) (bundle.getParcelableArray("android.messages")));
	//   13   29:aload_1         
	//   14   30:ldc1            #162 <String "android.messages">
	//   15   32:invokevirtual   #291 <Method Parcelable[] Bundle.getParcelableArray(String)>
	//   16   35:astore_1        
		if(bundle != null)
	//*  17   36:aload_1         
	//*  18   37:ifnull          48
			mMessages = Message.getMessagesFromBundleArray(((Parcelable []) (bundle)));
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:invokestatic    #295 <Method List NotificationCompat$MessagingStyle$Message.getMessagesFromBundleArray(Parcelable[])>
	//   22   45:putfield        #28  <Field List mMessages>
	//   23   48:return          
	}

	public NotificationCompat$MessagingStyle setConversationTitle(CharSequence charsequence)
	{
		mConversationTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #158 <Field CharSequence mConversationTitle>
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
