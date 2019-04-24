// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.e.a;
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
	//    1    1:invokestatic    #40  <Method Bundle NotificationCompat.getExtras(Notification)>
	//    2    4:astore_0        
		if(notification != null && !((Bundle) (notification)).containsKey("android.selfDisplayName"))
	//*   3    5:aload_0         
	//*   4    6:ifnull          20
	//*   5    9:aload_0         
	//*   6   10:ldc1            #42  <String "android.selfDisplayName">
	//*   7   12:invokevirtual   #48  <Method boolean Bundle.containsKey(String)>
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
	//   13   24:invokespecial   #49  <Method void NotificationCompat$MessagingStyle()>
	//   14   27:astore_1        
			notificationcompat$messagingstyle.restoreFromCompatExtras(((Bundle) (notification)));
	//   15   28:aload_1         
	//   16   29:aload_0         
	//   17   30:invokevirtual   #53  <Method void restoreFromCompatExtras(Bundle)>
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
	//*   2    4:invokeinterface #61  <Method int List.size()>
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
	//   11   21:invokeinterface #65  <Method Object List.get(int)>
	//   12   26:checkcast       #9   <Class NotificationCompat$MessagingStyle$Message>
	//   13   29:astore_2        
			if(!TextUtils.isEmpty(message.getSender()))
	//*  14   30:aload_2         
	//*  15   31:invokevirtual   #69  <Method CharSequence NotificationCompat$MessagingStyle$Message.getSender()>
	//*  16   34:invokestatic    #75  <Method boolean TextUtils.isEmpty(CharSequence)>
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
	//*  27   53:invokeinterface #78  <Method boolean List.isEmpty()>
	//*  28   58:ifne            85
			return (Message)mMessages.get(mMessages.size() - 1);
	//   29   61:aload_0         
	//   30   62:getfield        #28  <Field List mMessages>
	//   31   65:aload_0         
	//   32   66:getfield        #28  <Field List mMessages>
	//   33   69:invokeinterface #61  <Method int List.size()>
	//   34   74:iconst_1        
	//   35   75:isub            
	//   36   76:invokeinterface #65  <Method Object List.get(int)>
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
	//*   2    4:invokeinterface #61  <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:isub            
	//*   5   11:istore_1        
	//*   6   12:iload_1         
	//*   7   13:iflt            44
			if(((Message)mMessages.get(i)).getSender() == null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #28  <Field List mMessages>
	//*  10   20:iload_1         
	//*  11   21:invokeinterface #65  <Method Object List.get(int)>
	//*  12   26:checkcast       #9   <Class NotificationCompat$MessagingStyle$Message>
	//*  13   29:invokevirtual   #69  <Method CharSequence NotificationCompat$MessagingStyle$Message.getSender()>
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
	//    0    0:new             #83  <Class TextAppearanceSpan>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:iload_1         
	//    6    8:invokestatic    #89  <Method ColorStateList ColorStateList.valueOf(int)>
	//    7   11:aconst_null     
	//    8   12:invokespecial   #92  <Method void TextAppearanceSpan(String, int, int, ColorStateList, ColorStateList)>
	//    9   15:areturn         
	}

	private CharSequence makeMessageLine(Message message)
	{
		a a1 = a.a();
	//    0    0:invokestatic    #100 <Method a a.a()>
	//    1    3:astore          7
		SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
	//    2    5:new             #102 <Class SpannableStringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #103 <Method void SpannableStringBuilder()>
	//    5   12:astore          8
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   6   14:getstatic       #108 <Field int android.os.Build$VERSION.SDK_INT>
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
	//   16   33:ldc1            #109 <Int 0xff000000>
	//   17   35:istore_2        
		else
	//*  18   36:goto            41
			i = -1;
	//   19   39:iconst_m1       
	//   20   40:istore_2        
		Object obj1 = ((Object) (message.getSender()));
	//   21   41:aload_1         
	//   22   42:invokevirtual   #69  <Method CharSequence NotificationCompat$MessagingStyle$Message.getSender()>
	//   23   45:astore          6
		int j = i;
	//   24   47:iload_2         
	//   25   48:istore          4
		if(TextUtils.isEmpty(message.getSender()))
	//*  26   50:aload_1         
	//*  27   51:invokevirtual   #69  <Method CharSequence NotificationCompat$MessagingStyle$Message.getSender()>
	//*  28   54:invokestatic    #75  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  29   57:ifeq            121
		{
			Object obj;
			if(mUserDisplayName == null)
	//*  30   60:aload_0         
	//*  31   61:getfield        #32  <Field CharSequence mUserDisplayName>
	//*  32   64:ifnonnull       74
				obj = "";
	//   33   67:ldc1            #111 <String "">
	//   34   69:astore          5
			else
	//*  35   71:goto            80
				obj = ((Object) (mUserDisplayName));
	//   36   74:aload_0         
	//   37   75:getfield        #32  <Field CharSequence mUserDisplayName>
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
	//*  50   99:getfield        #115 <Field NotificationCompat$Builder mBuilder>
	//*  51  102:invokevirtual   #120 <Method int NotificationCompat$Builder.getColor()>
	//*  52  105:ifeq            121
				{
					j = mBuilder.getColor();
	//   53  108:aload_0         
	//   54  109:getfield        #115 <Field NotificationCompat$Builder mBuilder>
	//   55  112:invokevirtual   #120 <Method int NotificationCompat$Builder.getColor()>
	//   56  115:istore          4
					obj1 = obj;
	//   57  117:aload           5
	//   58  119:astore          6
				}
			}
		}
		CharSequence charsequence = a1.a(((CharSequence) (obj1)));
	//   59  121:aload           7
	//   60  123:aload           6
	//   61  125:invokevirtual   #123 <Method CharSequence a.a(CharSequence)>
	//   62  128:astore          5
		spannablestringbuilder.append(charsequence);
	//   63  130:aload           8
	//   64  132:aload           5
	//   65  134:invokevirtual   #127 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   66  137:pop             
		spannablestringbuilder.setSpan(((Object) (makeFontColorSpan(j))), spannablestringbuilder.length() - charsequence.length(), spannablestringbuilder.length(), 33);
	//   67  138:aload           8
	//   68  140:aload_0         
	//   69  141:iload           4
	//   70  143:invokespecial   #129 <Method TextAppearanceSpan makeFontColorSpan(int)>
	//   71  146:aload           8
	//   72  148:invokevirtual   #132 <Method int SpannableStringBuilder.length()>
	//   73  151:aload           5
	//   74  153:invokeinterface #135 <Method int CharSequence.length()>
	//   75  158:isub            
	//   76  159:aload           8
	//   77  161:invokevirtual   #132 <Method int SpannableStringBuilder.length()>
	//   78  164:bipush          33
	//   79  166:invokevirtual   #139 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
		if(message.getText() == null)
	//*  80  169:aload_1         
	//*  81  170:invokevirtual   #142 <Method CharSequence NotificationCompat$MessagingStyle$Message.getText()>
	//*  82  173:ifnonnull       182
			message = "";
	//   83  176:ldc1            #111 <String "">
	//   84  178:astore_1        
		else
	//*  85  179:goto            187
			message = ((Message) (message.getText()));
	//   86  182:aload_1         
	//   87  183:invokevirtual   #142 <Method CharSequence NotificationCompat$MessagingStyle$Message.getText()>
	//   88  186:astore_1        
		spannablestringbuilder.append("  ").append(a1.a(((CharSequence) (message))));
	//   89  187:aload           8
	//   90  189:ldc1            #144 <String "  ">
	//   91  191:invokevirtual   #127 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   92  194:aload           7
	//   93  196:aload_1         
	//   94  197:invokevirtual   #123 <Method CharSequence a.a(CharSequence)>
	//   95  200:invokevirtual   #127 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
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
	//    2    2:invokespecial   #147 <Method void NotificationCompat$Style.addCompatExtras(Bundle)>
		if(mUserDisplayName != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #32  <Field CharSequence mUserDisplayName>
	//*   5    9:ifnull          22
			bundle.putCharSequence("android.selfDisplayName", mUserDisplayName);
	//    6   12:aload_1         
	//    7   13:ldc1            #42  <String "android.selfDisplayName">
	//    8   15:aload_0         
	//    9   16:getfield        #32  <Field CharSequence mUserDisplayName>
	//   10   19:invokevirtual   #151 <Method void Bundle.putCharSequence(String, CharSequence)>
		if(mConversationTitle != null)
	//*  11   22:aload_0         
	//*  12   23:getfield        #153 <Field CharSequence mConversationTitle>
	//*  13   26:ifnull          39
			bundle.putCharSequence("android.conversationTitle", mConversationTitle);
	//   14   29:aload_1         
	//   15   30:ldc1            #155 <String "android.conversationTitle">
	//   16   32:aload_0         
	//   17   33:getfield        #153 <Field CharSequence mConversationTitle>
	//   18   36:invokevirtual   #151 <Method void Bundle.putCharSequence(String, CharSequence)>
		if(!mMessages.isEmpty())
	//*  19   39:aload_0         
	//*  20   40:getfield        #28  <Field List mMessages>
	//*  21   43:invokeinterface #78  <Method boolean List.isEmpty()>
	//*  22   48:ifne            64
			bundle.putParcelableArray("android.messages", ((Parcelable []) (Message.getBundleArrayForMessages(mMessages))));
	//   23   51:aload_1         
	//   24   52:ldc1            #157 <String "android.messages">
	//   25   54:aload_0         
	//   26   55:getfield        #28  <Field List mMessages>
	//   27   58:invokestatic    #161 <Method Bundle[] NotificationCompat$MessagingStyle$Message.getBundleArrayForMessages(List)>
	//   28   61:invokevirtual   #165 <Method void Bundle.putParcelableArray(String, Parcelable[])>
	//   29   64:return          
	}

	public NotificationCompat$MessagingStyle addMessage(Message message)
	{
		mMessages.add(((Object) (message)));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List mMessages>
	//    2    4:aload_1         
	//    3    5:invokeinterface #171 <Method boolean List.add(Object)>
	//    4   10:pop             
		if(mMessages.size() > 25)
	//*   5   11:aload_0         
	//*   6   12:getfield        #28  <Field List mMessages>
	//*   7   15:invokeinterface #61  <Method int List.size()>
	//*   8   20:bipush          25
	//*   9   22:icmple          36
			mMessages.remove(0);
	//   10   25:aload_0         
	//   11   26:getfield        #28  <Field List mMessages>
	//   12   29:iconst_0        
	//   13   30:invokeinterface #174 <Method Object List.remove(int)>
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
	//    7   12:invokespecial   #178 <Method void NotificationCompat$MessagingStyle$Message(CharSequence, long, CharSequence)>
	//    8   15:invokeinterface #171 <Method boolean List.add(Object)>
	//    9   20:pop             
		if(mMessages.size() > 25)
	//*  10   21:aload_0         
	//*  11   22:getfield        #28  <Field List mMessages>
	//*  12   25:invokeinterface #61  <Method int List.size()>
	//*  13   30:bipush          25
	//*  14   32:icmple          46
			mMessages.remove(0);
	//   15   35:aload_0         
	//   16   36:getfield        #28  <Field List mMessages>
	//   17   39:iconst_0        
	//   18   40:invokeinterface #174 <Method Object List.remove(int)>
	//   19   45:pop             
		return this;
	//   20   46:aload_0         
	//   21   47:areturn         
	}

	public void apply(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		Message message;
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #108 <Field int android.os.Build$VERSION.SDK_INT>
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
			Message message1;
			for(Iterator iterator = mMessages.iterator(); iterator.hasNext(); ((List) (arraylist4)).add(((Object) (message1.getDataUri()))))
	//*  23   53:aload_0         
	//*  24   54:getfield        #28  <Field List mMessages>
	//*  25   57:invokeinterface #184 <Method Iterator List.iterator()>
	//*  26   62:astore          9
	//*  27   64:aload           9
	//*  28   66:invokeinterface #189 <Method boolean Iterator.hasNext()>
	//*  29   71:ifeq            157
			{
				message1 = (Message)iterator.next();
	//   30   74:aload           9
	//   31   76:invokeinterface #193 <Method Object Iterator.next()>
	//   32   81:checkcast       #9   <Class NotificationCompat$MessagingStyle$Message>
	//   33   84:astore          10
				((List) (arraylist)).add(((Object) (message1.getText())));
	//   34   86:aload           4
	//   35   88:aload           10
	//   36   90:invokevirtual   #142 <Method CharSequence NotificationCompat$MessagingStyle$Message.getText()>
	//   37   93:invokeinterface #171 <Method boolean List.add(Object)>
	//   38   98:pop             
				((List) (arraylist1)).add(((Object) (Long.valueOf(message1.getTimestamp()))));
	//   39   99:aload           5
	//   40  101:aload           10
	//   41  103:invokevirtual   #197 <Method long NotificationCompat$MessagingStyle$Message.getTimestamp()>
	//   42  106:invokestatic    #202 <Method Long Long.valueOf(long)>
	//   43  109:invokeinterface #171 <Method boolean List.add(Object)>
	//   44  114:pop             
				((List) (arraylist2)).add(((Object) (message1.getSender())));
	//   45  115:aload           6
	//   46  117:aload           10
	//   47  119:invokevirtual   #69  <Method CharSequence NotificationCompat$MessagingStyle$Message.getSender()>
	//   48  122:invokeinterface #171 <Method boolean List.add(Object)>
	//   49  127:pop             
				((List) (arraylist3)).add(((Object) (message1.getDataMimeType())));
	//   50  128:aload           7
	//   51  130:aload           10
	//   52  132:invokevirtual   #206 <Method String NotificationCompat$MessagingStyle$Message.getDataMimeType()>
	//   53  135:invokeinterface #171 <Method boolean List.add(Object)>
	//   54  140:pop             
			}

	//   55  141:aload           8
	//   56  143:aload           10
	//   57  145:invokevirtual   #210 <Method Uri NotificationCompat$MessagingStyle$Message.getDataUri()>
	//   58  148:invokeinterface #171 <Method boolean List.add(Object)>
	//   59  153:pop             
	//*  60  154:goto            64
			NotificationCompatApi24.addMessagingStyle(notificationbuilderwithbuilderaccessor, mUserDisplayName, mConversationTitle, ((List) (arraylist)), ((List) (arraylist1)), ((List) (arraylist2)), ((List) (arraylist3)), ((List) (arraylist4)));
	//   61  157:aload_1         
	//   62  158:aload_0         
	//   63  159:getfield        #32  <Field CharSequence mUserDisplayName>
	//   64  162:aload_0         
	//   65  163:getfield        #153 <Field CharSequence mConversationTitle>
	//   66  166:aload           4
	//   67  168:aload           5
	//   68  170:aload           6
	//   69  172:aload           7
	//   70  174:aload           8
	//   71  176:invokestatic    #216 <Method void NotificationCompatApi24.addMessagingStyle(NotificationBuilderWithBuilderAccessor, CharSequence, CharSequence, List, List, List, List, List)>
			return;
	//   72  179:return          
		}
		message = findLatestIncomingMessage();
	//   73  180:aload_0         
	//   74  181:invokespecial   #218 <Method NotificationCompat$MessagingStyle$Message findLatestIncomingMessage()>
	//   75  184:astore          6
		if(mConversationTitle == null) goto _L2; else goto _L1
	//   76  186:aload_0         
	//   77  187:getfield        #153 <Field CharSequence mConversationTitle>
	//   78  190:ifnull          218
_L1:
		android.app.Notification.Builder builder;
		CharSequence charsequence1;
		builder = notificationbuilderwithbuilderaccessor.getBuilder();
	//   79  193:aload_1         
	//   80  194:invokeinterface #224 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//   81  199:astore          4
		charsequence1 = mConversationTitle;
	//   82  201:aload_0         
	//   83  202:getfield        #153 <Field CharSequence mConversationTitle>
	//   84  205:astore          5
_L4:
		builder.setContentTitle(charsequence1);
	//   85  207:aload           4
	//   86  209:aload           5
	//   87  211:invokevirtual   #230 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//   88  214:pop             
		break; /* Loop/switch isn't completed */
	//   89  215:goto            241
_L2:
		if(message == null)
			break; /* Loop/switch isn't completed */
	//   90  218:aload           6
	//   91  220:ifnull          241
		builder = notificationbuilderwithbuilderaccessor.getBuilder();
	//   92  223:aload_1         
	//   93  224:invokeinterface #224 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//   94  229:astore          4
		charsequence1 = message.getSender();
	//   95  231:aload           6
	//   96  233:invokevirtual   #69  <Method CharSequence NotificationCompat$MessagingStyle$Message.getSender()>
	//   97  236:astore          5
		if(true) goto _L4; else goto _L3
	//   98  238:goto            207
_L3:
		if(message != null)
	//*  99  241:aload           6
	//* 100  243:ifnull          287
		{
			android.app.Notification.Builder builder1 = notificationbuilderwithbuilderaccessor.getBuilder();
	//  101  246:aload_1         
	//  102  247:invokeinterface #224 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//  103  252:astore          5
			CharSequence charsequence;
			if(mConversationTitle != null)
	//* 104  254:aload_0         
	//* 105  255:getfield        #153 <Field CharSequence mConversationTitle>
	//* 106  258:ifnull          272
				charsequence = makeMessageLine(message);
	//  107  261:aload_0         
	//  108  262:aload           6
	//  109  264:invokespecial   #232 <Method CharSequence makeMessageLine(NotificationCompat$MessagingStyle$Message)>
	//  110  267:astore          4
			else
	//* 111  269:goto            279
				charsequence = message.getText();
	//  112  272:aload           6
	//  113  274:invokevirtual   #142 <Method CharSequence NotificationCompat$MessagingStyle$Message.getText()>
	//  114  277:astore          4
			builder1.setContentText(charsequence);
	//  115  279:aload           5
	//  116  281:aload           4
	//  117  283:invokevirtual   #235 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//  118  286:pop             
		}
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//* 119  287:getstatic       #108 <Field int android.os.Build$VERSION.SDK_INT>
	//* 120  290:bipush          16
	//* 121  292:icmplt          430
		{
			SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
	//  122  295:new             #102 <Class SpannableStringBuilder>
	//  123  298:dup             
	//  124  299:invokespecial   #103 <Method void SpannableStringBuilder()>
	//  125  302:astore          5
			boolean flag;
			if(mConversationTitle == null && !hasMessagesWithoutSender())
	//* 126  304:aload_0         
	//* 127  305:getfield        #153 <Field CharSequence mConversationTitle>
	//* 128  308:ifnonnull       326
	//* 129  311:aload_0         
	//* 130  312:invokespecial   #237 <Method boolean hasMessagesWithoutSender()>
	//* 131  315:ifeq            321
	//* 132  318:goto            326
				flag = false;
	//  133  321:iconst_0        
	//  134  322:istore_2        
			else
	//* 135  323:goto            328
				flag = true;
	//  136  326:iconst_1        
	//  137  327:istore_2        
			for(int i = mMessages.size() - 1; i >= 0; i--)
	//* 138  328:aload_0         
	//* 139  329:getfield        #28  <Field List mMessages>
	//* 140  332:invokeinterface #61  <Method int List.size()>
	//* 141  337:iconst_1        
	//* 142  338:isub            
	//* 143  339:istore_3        
	//* 144  340:iload_3         
	//* 145  341:iflt            421
			{
				Object obj = ((Object) ((Message)mMessages.get(i)));
	//  146  344:aload_0         
	//  147  345:getfield        #28  <Field List mMessages>
	//  148  348:iload_3         
	//  149  349:invokeinterface #65  <Method Object List.get(int)>
	//  150  354:checkcast       #9   <Class NotificationCompat$MessagingStyle$Message>
	//  151  357:astore          4
				if(flag)
	//* 152  359:iload_2         
	//* 153  360:ifeq            374
					obj = ((Object) (makeMessageLine(((Message) (obj)))));
	//  154  363:aload_0         
	//  155  364:aload           4
	//  156  366:invokespecial   #232 <Method CharSequence makeMessageLine(NotificationCompat$MessagingStyle$Message)>
	//  157  369:astore          4
				else
	//* 158  371:goto            381
					obj = ((Object) (((Message) (obj)).getText()));
	//  159  374:aload           4
	//  160  376:invokevirtual   #142 <Method CharSequence NotificationCompat$MessagingStyle$Message.getText()>
	//  161  379:astore          4
				if(i != mMessages.size() - 1)
	//* 162  381:iload_3         
	//* 163  382:aload_0         
	//* 164  383:getfield        #28  <Field List mMessages>
	//* 165  386:invokeinterface #61  <Method int List.size()>
	//* 166  391:iconst_1        
	//* 167  392:isub            
	//* 168  393:icmpeq          405
					spannablestringbuilder.insert(0, "\n");
	//  169  396:aload           5
	//  170  398:iconst_0        
	//  171  399:ldc1            #239 <String "\n">
	//  172  401:invokevirtual   #243 <Method SpannableStringBuilder SpannableStringBuilder.insert(int, CharSequence)>
	//  173  404:pop             
				spannablestringbuilder.insert(0, ((CharSequence) (obj)));
	//  174  405:aload           5
	//  175  407:iconst_0        
	//  176  408:aload           4
	//  177  410:invokevirtual   #243 <Method SpannableStringBuilder SpannableStringBuilder.insert(int, CharSequence)>
	//  178  413:pop             
			}

	//  179  414:iload_3         
	//  180  415:iconst_1        
	//  181  416:isub            
	//  182  417:istore_3        
	//* 183  418:goto            340
			NotificationCompatJellybean.addBigTextStyle(notificationbuilderwithbuilderaccessor, ((CharSequence) (null)), false, ((CharSequence) (null)), ((CharSequence) (spannablestringbuilder)));
	//  184  421:aload_1         
	//  185  422:aconst_null     
	//  186  423:iconst_0        
	//  187  424:aconst_null     
	//  188  425:aload           5
	//  189  427:invokestatic    #249 <Method void NotificationCompatJellybean.addBigTextStyle(NotificationBuilderWithBuilderAccessor, CharSequence, boolean, CharSequence, CharSequence)>
		}
		return;
	//  190  430:return          
	}

	public CharSequence getConversationTitle()
	{
		return mConversationTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field CharSequence mConversationTitle>
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
	//    1    1:getfield        #32  <Field CharSequence mUserDisplayName>
	//    2    4:areturn         
	}

	protected void restoreFromCompatExtras(Bundle bundle)
	{
		mMessages.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List mMessages>
	//    2    4:invokeinterface #258 <Method void List.clear()>
		mUserDisplayName = ((CharSequence) (bundle.getString("android.selfDisplayName")));
	//    3    9:aload_0         
	//    4   10:aload_1         
	//    5   11:ldc1            #42  <String "android.selfDisplayName">
	//    6   13:invokevirtual   #262 <Method String Bundle.getString(String)>
	//    7   16:putfield        #32  <Field CharSequence mUserDisplayName>
		mConversationTitle = ((CharSequence) (bundle.getString("android.conversationTitle")));
	//    8   19:aload_0         
	//    9   20:aload_1         
	//   10   21:ldc1            #155 <String "android.conversationTitle">
	//   11   23:invokevirtual   #262 <Method String Bundle.getString(String)>
	//   12   26:putfield        #153 <Field CharSequence mConversationTitle>
		bundle = ((Bundle) (bundle.getParcelableArray("android.messages")));
	//   13   29:aload_1         
	//   14   30:ldc1            #157 <String "android.messages">
	//   15   32:invokevirtual   #266 <Method Parcelable[] Bundle.getParcelableArray(String)>
	//   16   35:astore_1        
		if(bundle != null)
	//*  17   36:aload_1         
	//*  18   37:ifnull          48
			mMessages = Message.getMessagesFromBundleArray(((Parcelable []) (bundle)));
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:invokestatic    #270 <Method List NotificationCompat$MessagingStyle$Message.getMessagesFromBundleArray(Parcelable[])>
	//   22   45:putfield        #28  <Field List mMessages>
	//   23   48:return          
	}

	public NotificationCompat$MessagingStyle setConversationTitle(CharSequence charsequence)
	{
		mConversationTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #153 <Field CharSequence mConversationTitle>
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
	//    9   17:putfield        #32  <Field CharSequence mUserDisplayName>
	//   10   20:return          
	}
}
