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
//			NotificationCompat, NotificationCompatApi24, NotificationBuilderWithBuilderAccessor, NotificationCompatJellybean

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
			Message message;
			if(!bundle.containsKey("text") || !bundle.containsKey("time"))
		//*   0    0:aload_0         
		//*   1    1:ldc1            #26  <String "text">
		//*   2    3:invokevirtual   #82  <Method boolean Bundle.containsKey(String)>
		//*   3    6:ifeq            114
		//*   4    9:aload_0         
		//*   5   10:ldc1            #29  <String "time">
		//*   6   12:invokevirtual   #82  <Method boolean Bundle.containsKey(String)>
		//*   7   15:ifne            21
				break MISSING_BLOCK_LABEL_114;
		//    8   18:goto            114
			Message message1;
			try
			{
				message1 = new Message(bundle.getCharSequence("text"), bundle.getLong("time"), bundle.getCharSequence("sender"));
		//    9   21:new             #2   <Class NotificationCompat$MessagingStyle$Message>
		//   10   24:dup             
		//   11   25:aload_0         
		//   12   26:ldc1            #26  <String "text">
		//   13   28:invokevirtual   #86  <Method CharSequence Bundle.getCharSequence(String)>
		//   14   31:aload_0         
		//   15   32:ldc1            #29  <String "time">
		//   16   34:invokevirtual   #90  <Method long Bundle.getLong(String)>
		//   17   37:aload_0         
		//   18   38:ldc1            #23  <String "sender">
		//   19   40:invokevirtual   #86  <Method CharSequence Bundle.getCharSequence(String)>
		//   20   43:invokespecial   #92  <Method void NotificationCompat$MessagingStyle$Message(CharSequence, long, CharSequence)>
		//   21   46:astore_2        
				if(bundle.containsKey("type") && bundle.containsKey("uri"))
		//*  22   47:aload_0         
		//*  23   48:ldc1            #14  <String "type">
		//*  24   50:invokevirtual   #82  <Method boolean Bundle.containsKey(String)>
		//*  25   53:ifeq            85
		//*  26   56:aload_0         
		//*  27   57:ldc1            #17  <String "uri">
		//*  28   59:invokevirtual   #82  <Method boolean Bundle.containsKey(String)>
		//*  29   62:ifeq            85
					message1.setData(bundle.getString("type"), (Uri)bundle.getParcelable("uri"));
		//   30   65:aload_2         
		//   31   66:aload_0         
		//   32   67:ldc1            #14  <String "type">
		//   33   69:invokevirtual   #96  <Method String Bundle.getString(String)>
		//   34   72:aload_0         
		//   35   73:ldc1            #17  <String "uri">
		//   36   75:invokevirtual   #100 <Method Parcelable Bundle.getParcelable(String)>
		//   37   78:checkcast       #102 <Class Uri>
		//   38   81:invokevirtual   #106 <Method NotificationCompat$MessagingStyle$Message setData(String, Uri)>
		//   39   84:pop             
			}
		//*  40   85:aload_2         
		//*  41   86:astore_1        
		//*  42   87:aload_0         
		//*  43   88:ldc1            #20  <String "extras">
		//*  44   90:invokevirtual   #82  <Method boolean Bundle.containsKey(String)>
		//*  45   93:ifeq            116
		//*  46   96:aload_2         
		//*  47   97:invokevirtual   #109 <Method Bundle getExtras()>
		//*  48  100:aload_0         
		//*  49  101:ldc1            #20  <String "extras">
		//*  50  103:invokevirtual   #113 <Method Bundle Bundle.getBundle(String)>
		//*  51  106:invokevirtual   #117 <Method void Bundle.putAll(Bundle)>
		//*  52  109:aload_2         
		//*  53  110:areturn         
			// Misplaced declaration of an exception variable
			catch(Bundle bundle)
		//*  54  111:astore_0        
			{
				return null;
		//   55  112:aconst_null     
		//   56  113:areturn         
			}
			message = message1;
			if(!bundle.containsKey("extras"))
				break MISSING_BLOCK_LABEL_116;
			message1.getExtras().putAll(bundle.getBundle("extras"));
			return message1;
			message = null;
		//   57  114:aconst_null     
		//   58  115:astore_1        
			return message;
		//   59  116:aload_1         
		//   60  117:areturn         
		}

		static List getMessagesFromBundleArray(Parcelable aparcelable[])
		{
			ArrayList arraylist = new ArrayList(aparcelable.length);
		//    0    0:new             #121 <Class ArrayList>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:arraylength     
		//    4    6:invokespecial   #124 <Method void ArrayList(int)>
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
		int i;
		boolean flag;
		int j;
		Object obj1;
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   6   14:getstatic       #112 <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   17:bipush          21
	//*   8   19:icmplt          180
			flag = true;
	//    9   22:iconst_1        
	//   10   23:istore_3        
		else
	//*  11   24:iload_3         
	//*  12   25:ifeq            185
	//*  13   28:ldc1            #113 <Int 0xff000000>
	//*  14   30:istore_2        
	//*  15   31:aload_1         
	//*  16   32:invokevirtual   #72  <Method CharSequence NotificationCompat$MessagingStyle$Message.getSender()>
	//*  17   35:astore          6
	//*  18   37:iload_2         
	//*  19   38:istore          4
	//*  20   40:aload_1         
	//*  21   41:invokevirtual   #72  <Method CharSequence NotificationCompat$MessagingStyle$Message.getSender()>
	//*  22   44:invokestatic    #78  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  23   47:ifeq            102
	//*  24   50:aload_0         
	//*  25   51:getfield        #33  <Field CharSequence mUserDisplayName>
	//*  26   54:ifnonnull       190
	//*  27   57:ldc1            #115 <String "">
	//*  28   59:astore          5
	//*  29   61:iload_2         
	//*  30   62:istore          4
	//*  31   64:aload           5
	//*  32   66:astore          6
	//*  33   68:iload_3         
	//*  34   69:ifeq            102
	//*  35   72:iload_2         
	//*  36   73:istore          4
	//*  37   75:aload           5
	//*  38   77:astore          6
	//*  39   79:aload_0         
	//*  40   80:getfield        #119 <Field NotificationCompat$Builder mBuilder>
	//*  41   83:invokevirtual   #124 <Method int NotificationCompat$Builder.getColor()>
	//*  42   86:ifeq            102
	//*  43   89:aload_0         
	//*  44   90:getfield        #119 <Field NotificationCompat$Builder mBuilder>
	//*  45   93:invokevirtual   #124 <Method int NotificationCompat$Builder.getColor()>
	//*  46   96:istore          4
	//*  47   98:aload           5
	//*  48  100:astore          6
	//*  49  102:aload           7
	//*  50  104:aload           6
	//*  51  106:invokevirtual   #128 <Method CharSequence BidiFormatter.unicodeWrap(CharSequence)>
	//*  52  109:astore          5
	//*  53  111:aload           8
	//*  54  113:aload           5
	//*  55  115:invokevirtual   #132 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//*  56  118:pop             
	//*  57  119:aload           8
	//*  58  121:aload_0         
	//*  59  122:iload           4
	//*  60  124:invokespecial   #134 <Method TextAppearanceSpan makeFontColorSpan(int)>
	//*  61  127:aload           8
	//*  62  129:invokevirtual   #137 <Method int SpannableStringBuilder.length()>
	//*  63  132:aload           5
	//*  64  134:invokeinterface #140 <Method int CharSequence.length()>
	//*  65  139:isub            
	//*  66  140:aload           8
	//*  67  142:invokevirtual   #137 <Method int SpannableStringBuilder.length()>
	//*  68  145:bipush          33
	//*  69  147:invokevirtual   #144 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
	//*  70  150:aload_1         
	//*  71  151:invokevirtual   #147 <Method CharSequence NotificationCompat$MessagingStyle$Message.getText()>
	//*  72  154:ifnonnull       199
	//*  73  157:ldc1            #115 <String "">
	//*  74  159:astore_1        
	//*  75  160:aload           8
	//*  76  162:ldc1            #149 <String "  ">
	//*  77  164:invokevirtual   #132 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//*  78  167:aload           7
	//*  79  169:aload_1         
	//*  80  170:invokevirtual   #128 <Method CharSequence BidiFormatter.unicodeWrap(CharSequence)>
	//*  81  173:invokevirtual   #132 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//*  82  176:pop             
	//*  83  177:aload           8
	//*  84  179:areturn         
			flag = false;
	//   85  180:iconst_0        
	//   86  181:istore_3        
		if(flag)
			i = 0xff000000;
		else
	//*  87  182:goto            24
			i = -1;
	//   88  185:iconst_m1       
	//   89  186:istore_2        
		obj1 = ((Object) (message.getSender()));
		j = i;
		if(TextUtils.isEmpty(message.getSender()))
		{
			Object obj;
			if(mUserDisplayName == null)
				obj = "";
			else
	//*  90  187:goto            31
				obj = ((Object) (mUserDisplayName));
	//   91  190:aload_0         
	//   92  191:getfield        #33  <Field CharSequence mUserDisplayName>
	//   93  194:astore          5
			j = i;
			obj1 = obj;
			if(flag)
			{
				j = i;
				obj1 = obj;
				if(mBuilder.getColor() != 0)
				{
					j = mBuilder.getColor();
					obj1 = obj;
				}
			}
		}
		obj = ((Object) (bidiformatter.unicodeWrap(((CharSequence) (obj1)))));
		spannablestringbuilder.append(((CharSequence) (obj)));
		spannablestringbuilder.setSpan(((Object) (makeFontColorSpan(j))), spannablestringbuilder.length() - ((CharSequence) (obj)).length(), spannablestringbuilder.length(), 33);
		if(message.getText() == null)
			message = "";
		else
	//*  94  196:goto            61
			message = ((Message) (message.getText()));
	//   95  199:aload_1         
	//   96  200:invokevirtual   #147 <Method CharSequence NotificationCompat$MessagingStyle$Message.getText()>
	//   97  203:astore_1        
		spannablestringbuilder.append("  ").append(bidiformatter.unicodeWrap(((CharSequence) (message))));
		return ((CharSequence) (spannablestringbuilder));
	//*  98  204:goto            160
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
	//*   2    5:icmplt          180
		{
			ArrayList arraylist = new ArrayList();
	//    3    8:new             #25  <Class ArrayList>
	//    4   11:dup             
	//    5   12:invokespecial   #26  <Method void ArrayList()>
	//    6   15:astore          4
			ArrayList arraylist1 = new ArrayList();
	//    7   17:new             #25  <Class ArrayList>
	//    8   20:dup             
	//    9   21:invokespecial   #26  <Method void ArrayList()>
	//   10   24:astore          5
			ArrayList arraylist2 = new ArrayList();
	//   11   26:new             #25  <Class ArrayList>
	//   12   29:dup             
	//   13   30:invokespecial   #26  <Method void ArrayList()>
	//   14   33:astore          6
			ArrayList arraylist3 = new ArrayList();
	//   15   35:new             #25  <Class ArrayList>
	//   16   38:dup             
	//   17   39:invokespecial   #26  <Method void ArrayList()>
	//   18   42:astore          7
			ArrayList arraylist4 = new ArrayList();
	//   19   44:new             #25  <Class ArrayList>
	//   20   47:dup             
	//   21   48:invokespecial   #26  <Method void ArrayList()>
	//   22   51:astore          8
			Message message;
			for(Iterator iterator = mMessages.iterator(); iterator.hasNext(); ((List) (arraylist4)).add(((Object) (message.getDataUri()))))
	//*  23   53:aload_0         
	//*  24   54:getfield        #28  <Field List mMessages>
	//*  25   57:invokeinterface #193 <Method Iterator List.iterator()>
	//*  26   62:astore          9
	//*  27   64:aload           9
	//*  28   66:invokeinterface #198 <Method boolean Iterator.hasNext()>
	//*  29   71:ifeq            157
			{
				message = (Message)iterator.next();
	//   30   74:aload           9
	//   31   76:invokeinterface #202 <Method Object Iterator.next()>
	//   32   81:checkcast       #9   <Class NotificationCompat$MessagingStyle$Message>
	//   33   84:astore          10
				((List) (arraylist)).add(((Object) (message.getText())));
	//   34   86:aload           4
	//   35   88:aload           10
	//   36   90:invokevirtual   #147 <Method CharSequence NotificationCompat$MessagingStyle$Message.getText()>
	//   37   93:invokeinterface #176 <Method boolean List.add(Object)>
	//   38   98:pop             
				((List) (arraylist1)).add(((Object) (Long.valueOf(message.getTimestamp()))));
	//   39   99:aload           5
	//   40  101:aload           10
	//   41  103:invokevirtual   #206 <Method long NotificationCompat$MessagingStyle$Message.getTimestamp()>
	//   42  106:invokestatic    #211 <Method Long Long.valueOf(long)>
	//   43  109:invokeinterface #176 <Method boolean List.add(Object)>
	//   44  114:pop             
				((List) (arraylist2)).add(((Object) (message.getSender())));
	//   45  115:aload           6
	//   46  117:aload           10
	//   47  119:invokevirtual   #72  <Method CharSequence NotificationCompat$MessagingStyle$Message.getSender()>
	//   48  122:invokeinterface #176 <Method boolean List.add(Object)>
	//   49  127:pop             
				((List) (arraylist3)).add(((Object) (message.getDataMimeType())));
	//   50  128:aload           7
	//   51  130:aload           10
	//   52  132:invokevirtual   #215 <Method String NotificationCompat$MessagingStyle$Message.getDataMimeType()>
	//   53  135:invokeinterface #176 <Method boolean List.add(Object)>
	//   54  140:pop             
			}

	//   55  141:aload           8
	//   56  143:aload           10
	//   57  145:invokevirtual   #219 <Method Uri NotificationCompat$MessagingStyle$Message.getDataUri()>
	//   58  148:invokeinterface #176 <Method boolean List.add(Object)>
	//   59  153:pop             
	//*  60  154:goto            64
			NotificationCompatApi24.addMessagingStyle(notificationbuilderwithbuilderaccessor, mUserDisplayName, mConversationTitle, ((List) (arraylist)), ((List) (arraylist1)), ((List) (arraylist2)), ((List) (arraylist3)), ((List) (arraylist4)));
	//   61  157:aload_1         
	//   62  158:aload_0         
	//   63  159:getfield        #33  <Field CharSequence mUserDisplayName>
	//   64  162:aload_0         
	//   65  163:getfield        #158 <Field CharSequence mConversationTitle>
	//   66  166:aload           4
	//   67  168:aload           5
	//   68  170:aload           6
	//   69  172:aload           7
	//   70  174:aload           8
	//   71  176:invokestatic    #225 <Method void NotificationCompatApi24.addMessagingStyle(NotificationBuilderWithBuilderAccessor, CharSequence, CharSequence, List, List, List, List, List)>
		} else
	//*  72  179:return          
		{
			Object obj = ((Object) (findLatestIncomingMessage()));
	//   73  180:aload_0         
	//   74  181:invokespecial   #227 <Method NotificationCompat$MessagingStyle$Message findLatestIncomingMessage()>
	//   75  184:astore          4
			if(mConversationTitle != null)
	//*  76  186:aload_0         
	//*  77  187:getfield        #158 <Field CharSequence mConversationTitle>
	//*  78  190:ifnull          359
				notificationbuilderwithbuilderaccessor.getBuilder().setContentTitle(mConversationTitle);
	//   79  193:aload_1         
	//   80  194:invokeinterface #233 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//   81  199:aload_0         
	//   82  200:getfield        #158 <Field CharSequence mConversationTitle>
	//   83  203:invokevirtual   #239 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//   84  206:pop             
			else
	//*  85  207:aload           4
	//*  86  209:ifnull          243
	//*  87  212:aload_1         
	//*  88  213:invokeinterface #233 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//*  89  218:astore          5
	//*  90  220:aload_0         
	//*  91  221:getfield        #158 <Field CharSequence mConversationTitle>
	//*  92  224:ifnull          382
	//*  93  227:aload_0         
	//*  94  228:aload           4
	//*  95  230:invokespecial   #241 <Method CharSequence makeMessageLine(NotificationCompat$MessagingStyle$Message)>
	//*  96  233:astore          4
	//*  97  235:aload           5
	//*  98  237:aload           4
	//*  99  239:invokevirtual   #244 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//* 100  242:pop             
	//* 101  243:getstatic       #112 <Field int android.os.Build$VERSION.SDK_INT>
	//* 102  246:bipush          16
	//* 103  248:icmplt          179
	//* 104  251:new             #106 <Class SpannableStringBuilder>
	//* 105  254:dup             
	//* 106  255:invokespecial   #107 <Method void SpannableStringBuilder()>
	//* 107  258:astore          5
	//* 108  260:aload_0         
	//* 109  261:getfield        #158 <Field CharSequence mConversationTitle>
	//* 110  264:ifnonnull       274
	//* 111  267:aload_0         
	//* 112  268:invokespecial   #246 <Method boolean hasMessagesWithoutSender()>
	//* 113  271:ifeq            392
	//* 114  274:iconst_1        
	//* 115  275:istore_2        
	//* 116  276:aload_0         
	//* 117  277:getfield        #28  <Field List mMessages>
	//* 118  280:invokeinterface #64  <Method int List.size()>
	//* 119  285:iconst_1        
	//* 120  286:isub            
	//* 121  287:istore_3        
	//* 122  288:iload_3         
	//* 123  289:iflt            407
	//* 124  292:aload_0         
	//* 125  293:getfield        #28  <Field List mMessages>
	//* 126  296:iload_3         
	//* 127  297:invokeinterface #68  <Method Object List.get(int)>
	//* 128  302:checkcast       #9   <Class NotificationCompat$MessagingStyle$Message>
	//* 129  305:astore          4
	//* 130  307:iload_2         
	//* 131  308:ifeq            397
	//* 132  311:aload_0         
	//* 133  312:aload           4
	//* 134  314:invokespecial   #241 <Method CharSequence makeMessageLine(NotificationCompat$MessagingStyle$Message)>
	//* 135  317:astore          4
	//* 136  319:iload_3         
	//* 137  320:aload_0         
	//* 138  321:getfield        #28  <Field List mMessages>
	//* 139  324:invokeinterface #64  <Method int List.size()>
	//* 140  329:iconst_1        
	//* 141  330:isub            
	//* 142  331:icmpeq          343
	//* 143  334:aload           5
	//* 144  336:iconst_0        
	//* 145  337:ldc1            #248 <String "\n">
	//* 146  339:invokevirtual   #252 <Method SpannableStringBuilder SpannableStringBuilder.insert(int, CharSequence)>
	//* 147  342:pop             
	//* 148  343:aload           5
	//* 149  345:iconst_0        
	//* 150  346:aload           4
	//* 151  348:invokevirtual   #252 <Method SpannableStringBuilder SpannableStringBuilder.insert(int, CharSequence)>
	//* 152  351:pop             
	//* 153  352:iload_3         
	//* 154  353:iconst_1        
	//* 155  354:isub            
	//* 156  355:istore_3        
	//* 157  356:goto            288
			if(obj != null)
	//* 158  359:aload           4
	//* 159  361:ifnull          207
				notificationbuilderwithbuilderaccessor.getBuilder().setContentTitle(((Message) (obj)).getSender());
	//  160  364:aload_1         
	//  161  365:invokeinterface #233 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//  162  370:aload           4
	//  163  372:invokevirtual   #72  <Method CharSequence NotificationCompat$MessagingStyle$Message.getSender()>
	//  164  375:invokevirtual   #239 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//  165  378:pop             
			if(obj != null)
			{
				android.app.Notification.Builder builder = notificationbuilderwithbuilderaccessor.getBuilder();
				int i;
				if(mConversationTitle != null)
					obj = ((Object) (makeMessageLine(((Message) (obj)))));
				else
	//* 166  379:goto            207
					obj = ((Object) (((Message) (obj)).getText()));
	//  167  382:aload           4
	//  168  384:invokevirtual   #147 <Method CharSequence NotificationCompat$MessagingStyle$Message.getText()>
	//  169  387:astore          4
				builder.setContentText(((CharSequence) (obj)));
			}
			if(android.os.Build.VERSION.SDK_INT >= 16)
			{
				SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
				boolean flag;
				if(mConversationTitle != null || hasMessagesWithoutSender())
					flag = true;
				else
	//* 170  389:goto            235
					flag = false;
	//  171  392:iconst_0        
	//  172  393:istore_2        
				i = mMessages.size() - 1;
				while(i >= 0) 
				{
					obj = ((Object) ((Message)mMessages.get(i)));
					if(flag)
						obj = ((Object) (makeMessageLine(((Message) (obj)))));
					else
	//* 173  394:goto            276
						obj = ((Object) (((Message) (obj)).getText()));
	//  174  397:aload           4
	//  175  399:invokevirtual   #147 <Method CharSequence NotificationCompat$MessagingStyle$Message.getText()>
	//  176  402:astore          4
					if(i != mMessages.size() - 1)
						spannablestringbuilder.insert(0, "\n");
					spannablestringbuilder.insert(0, ((CharSequence) (obj)));
					i--;
				}
	//* 177  404:goto            319
				NotificationCompatJellybean.addBigTextStyle(notificationbuilderwithbuilderaccessor, ((CharSequence) (null)), false, ((CharSequence) (null)), ((CharSequence) (spannablestringbuilder)));
	//  178  407:aload_1         
	//  179  408:aconst_null     
	//  180  409:iconst_0        
	//  181  410:aconst_null     
	//  182  411:aload           5
	//  183  413:invokestatic    #258 <Method void NotificationCompatJellybean.addBigTextStyle(NotificationBuilderWithBuilderAccessor, CharSequence, boolean, CharSequence, CharSequence)>
				return;
	//  184  416:return          
			}
		}
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
	//    2    4:invokeinterface #267 <Method void List.clear()>
		mUserDisplayName = ((CharSequence) (bundle.getString("android.selfDisplayName")));
	//    3    9:aload_0         
	//    4   10:aload_1         
	//    5   11:ldc1            #44  <String "android.selfDisplayName">
	//    6   13:invokevirtual   #271 <Method String Bundle.getString(String)>
	//    7   16:putfield        #33  <Field CharSequence mUserDisplayName>
		mConversationTitle = ((CharSequence) (bundle.getString("android.conversationTitle")));
	//    8   19:aload_0         
	//    9   20:aload_1         
	//   10   21:ldc1            #160 <String "android.conversationTitle">
	//   11   23:invokevirtual   #271 <Method String Bundle.getString(String)>
	//   12   26:putfield        #158 <Field CharSequence mConversationTitle>
		bundle = ((Bundle) (bundle.getParcelableArray("android.messages")));
	//   13   29:aload_1         
	//   14   30:ldc1            #162 <String "android.messages">
	//   15   32:invokevirtual   #275 <Method Parcelable[] Bundle.getParcelableArray(String)>
	//   16   35:astore_1        
		if(bundle != null)
	//*  17   36:aload_1         
	//*  18   37:ifnull          48
			mMessages = Message.getMessagesFromBundleArray(((Parcelable []) (bundle)));
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:invokestatic    #279 <Method List NotificationCompat$MessagingStyle$Message.getMessagesFromBundleArray(Parcelable[])>
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
