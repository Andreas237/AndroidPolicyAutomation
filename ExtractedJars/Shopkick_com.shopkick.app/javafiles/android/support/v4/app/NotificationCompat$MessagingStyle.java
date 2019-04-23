// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.app.Person;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.text.BidiFormatter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, Person, NotificationBuilderWithBuilderAccessor

public static class NotificationCompat$MessagingStyle extends NotificationCompat.Style
{
	public static final class Message
	{

		static Bundle[] getBundleArrayForMessages(List list)
		{
			Bundle abundle[] = new Bundle[list.size()];
		//    0    0:aload_0         
		//    1    1:invokeinterface #90  <Method int List.size()>
		//    2    6:anewarray       Bundle[]
		//    3    9:astore_3        
			int j = list.size();
		//    4   10:aload_0         
		//    5   11:invokeinterface #90  <Method int List.size()>
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
		//   16   28:invokeinterface #94  <Method Object List.get(int)>
		//   17   33:checkcast       #2   <Class NotificationCompat$MessagingStyle$Message>
		//   18   36:invokespecial   #98  <Method Bundle toBundle()>
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
			if(!bundle.containsKey("text")) goto _L2; else goto _L1
		//    0    0:aload_0         
		//    1    1:ldc1            #32  <String "text">
		//    2    3:invokevirtual   #109 <Method boolean Bundle.containsKey(String)>
		//    3    6:ifeq            190
_L1:
			if(!bundle.containsKey("time"))
		//*   4    9:aload_0         
		//*   5   10:ldc1            #35  <String "time">
		//*   6   12:invokevirtual   #109 <Method boolean Bundle.containsKey(String)>
		//*   7   15:ifne            20
				return null;
		//    8   18:aconst_null     
		//    9   19:areturn         
			if(!bundle.containsKey("person")) goto _L4; else goto _L3
		//   10   20:aload_0         
		//   11   21:ldc1            #26  <String "person">
		//   12   23:invokevirtual   #109 <Method boolean Bundle.containsKey(String)>
		//   13   26:ifeq            42
_L3:
			Object obj = ((Object) (Person.fromBundle(bundle.getBundle("person"))));
		//   14   29:aload_0         
		//   15   30:ldc1            #26  <String "person">
		//   16   32:invokevirtual   #113 <Method Bundle Bundle.getBundle(String)>
		//   17   35:invokestatic    #119 <Method android.support.v4.app.Person Person.fromBundle(Bundle)>
		//   18   38:astore_1        
			  goto _L5
		//*  19   39:goto            107
_L4:
			if(!bundle.containsKey("sender_person") || android.os.Build.VERSION.SDK_INT < 28) goto _L7; else goto _L6
		//   20   42:aload_0         
		//   21   43:ldc1            #23  <String "sender_person">
		//   22   45:invokevirtual   #109 <Method boolean Bundle.containsKey(String)>
		//   23   48:ifeq            75
		//   24   51:getstatic       #125 <Field int android.os.Build$VERSION.SDK_INT>
		//   25   54:bipush          28
		//   26   56:icmplt          75
_L6:
			obj = ((Object) (Person.fromAndroidPerson((Person)bundle.getParcelable("sender_person"))));
		//   27   59:aload_0         
		//   28   60:ldc1            #23  <String "sender_person">
		//   29   62:invokevirtual   #129 <Method Parcelable Bundle.getParcelable(String)>
		//   30   65:checkcast       #131 <Class Person>
		//   31   68:invokestatic    #135 <Method android.support.v4.app.Person Person.fromAndroidPerson(Person)>
		//   32   71:astore_1        
			  goto _L5
		//*  33   72:goto            107
_L7:
			if(!bundle.containsKey("sender")) goto _L9; else goto _L8
		//   34   75:aload_0         
		//   35   76:ldc1            #29  <String "sender">
		//   36   78:invokevirtual   #109 <Method boolean Bundle.containsKey(String)>
		//   37   81:ifeq            195
_L8:
			obj = ((Object) ((new Person.Builder()).setName(bundle.getCharSequence("sender")).build()));
		//   38   84:new             #69  <Class Person$Builder>
		//   39   87:dup             
		//   40   88:invokespecial   #70  <Method void Person$Builder()>
		//   41   91:aload_0         
		//   42   92:ldc1            #29  <String "sender">
		//   43   94:invokevirtual   #139 <Method CharSequence Bundle.getCharSequence(String)>
		//   44   97:invokevirtual   #74  <Method Person$Builder Person$Builder.setName(CharSequence)>
		//   45  100:invokevirtual   #78  <Method android.support.v4.app.Person Person$Builder.build()>
		//   46  103:astore_1        
		//*  47  104:goto            107
_L5:
			try
			{
				obj = ((Object) (new Message(bundle.getCharSequence("text"), bundle.getLong("time"), ((android.support.v4.app.Person) (obj)))));
		//   48  107:new             #2   <Class NotificationCompat$MessagingStyle$Message>
		//   49  110:dup             
		//   50  111:aload_0         
		//   51  112:ldc1            #32  <String "text">
		//   52  114:invokevirtual   #139 <Method CharSequence Bundle.getCharSequence(String)>
		//   53  117:aload_0         
		//   54  118:ldc1            #35  <String "time">
		//   55  120:invokevirtual   #143 <Method long Bundle.getLong(String)>
		//   56  123:aload_1         
		//   57  124:invokespecial   #80  <Method void NotificationCompat$MessagingStyle$Message(CharSequence, long, android.support.v4.app.Person)>
		//   58  127:astore_1        
				if(bundle.containsKey("type") && bundle.containsKey("uri"))
		//*  59  128:aload_0         
		//*  60  129:ldc1            #14  <String "type">
		//*  61  131:invokevirtual   #109 <Method boolean Bundle.containsKey(String)>
		//*  62  134:ifeq            166
		//*  63  137:aload_0         
		//*  64  138:ldc1            #17  <String "uri">
		//*  65  140:invokevirtual   #109 <Method boolean Bundle.containsKey(String)>
		//*  66  143:ifeq            166
					((Message) (obj)).setData(bundle.getString("type"), (Uri)bundle.getParcelable("uri"));
		//   67  146:aload_1         
		//   68  147:aload_0         
		//   69  148:ldc1            #14  <String "type">
		//   70  150:invokevirtual   #147 <Method String Bundle.getString(String)>
		//   71  153:aload_0         
		//   72  154:ldc1            #17  <String "uri">
		//   73  156:invokevirtual   #129 <Method Parcelable Bundle.getParcelable(String)>
		//   74  159:checkcast       #149 <Class Uri>
		//   75  162:invokevirtual   #153 <Method NotificationCompat$MessagingStyle$Message setData(String, Uri)>
		//   76  165:pop             
				if(bundle.containsKey("extras"))
		//*  77  166:aload_0         
		//*  78  167:ldc1            #20  <String "extras">
		//*  79  169:invokevirtual   #109 <Method boolean Bundle.containsKey(String)>
		//*  80  172:ifeq            188
					((Message) (obj)).getExtras().putAll(bundle.getBundle("extras"));
		//   81  175:aload_1         
		//   82  176:invokevirtual   #156 <Method Bundle getExtras()>
		//   83  179:aload_0         
		//   84  180:ldc1            #20  <String "extras">
		//   85  182:invokevirtual   #113 <Method Bundle Bundle.getBundle(String)>
		//   86  185:invokevirtual   #160 <Method void Bundle.putAll(Bundle)>
			}
		//*  87  188:aload_1         
		//*  88  189:areturn         
		//*  89  190:aconst_null     
		//*  90  191:areturn         
			// Misplaced declaration of an exception variable
			catch(Bundle bundle)
		//*  91  192:astore_0        
			{
				return null;
		//   92  193:aconst_null     
		//   93  194:areturn         
			}
			return ((Message) (obj));
_L2:
			return null;
_L9:
			obj = null;
		//   94  195:aconst_null     
		//   95  196:astore_1        
			if(true) goto _L5; else goto _L10
		//   96  197:goto            107
_L10:
		}

		static List getMessagesFromBundleArray(Parcelable aparcelable[])
		{
			ArrayList arraylist = new ArrayList(aparcelable.length);
		//    0    0:new             #164 <Class ArrayList>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:arraylength     
		//    4    6:invokespecial   #167 <Method void ArrayList(int)>
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
		//   15   21:instanceof      #54  <Class Bundle>
		//   16   24:ifeq            49
				Message message = getMessageFromBundle((Bundle)aparcelable[i]);
		//   17   27:aload_0         
		//   18   28:iload_1         
		//   19   29:aaload          
		//   20   30:checkcast       #54  <Class Bundle>
		//   21   33:invokestatic    #169 <Method NotificationCompat$MessagingStyle$Message getMessageFromBundle(Bundle)>
		//   22   36:astore_3        
				if(message != null)
		//*  23   37:aload_3         
		//*  24   38:ifnull          49
					((List) (arraylist)).add(((Object) (message)));
		//   25   41:aload_2         
		//   26   42:aload_3         
		//   27   43:invokeinterface #173 <Method boolean List.add(Object)>
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
		//    0    0:new             #54  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #55  <Method void Bundle()>
		//    3    7:astore_1        
			Object obj = ((Object) (mText));
		//    4    8:aload_0         
		//    5    9:getfield        #59  <Field CharSequence mText>
		//    6   12:astore_2        
			if(obj != null)
		//*   7   13:aload_2         
		//*   8   14:ifnull          24
				bundle.putCharSequence("text", ((CharSequence) (obj)));
		//    9   17:aload_1         
		//   10   18:ldc1            #32  <String "text">
		//   11   20:aload_2         
		//   12   21:invokevirtual   #178 <Method void Bundle.putCharSequence(String, CharSequence)>
			bundle.putLong("time", mTimestamp);
		//   13   24:aload_1         
		//   14   25:ldc1            #35  <String "time">
		//   15   27:aload_0         
		//   16   28:getfield        #61  <Field long mTimestamp>
		//   17   31:invokevirtual   #182 <Method void Bundle.putLong(String, long)>
			obj = ((Object) (mPerson));
		//   18   34:aload_0         
		//   19   35:getfield        #63  <Field android.support.v4.app.Person mPerson>
		//   20   38:astore_2        
			if(obj != null)
		//*  21   39:aload_2         
		//*  22   40:ifnull          90
			{
				bundle.putCharSequence("sender", ((android.support.v4.app.Person) (obj)).getName());
		//   23   43:aload_1         
		//   24   44:ldc1            #29  <String "sender">
		//   25   46:aload_2         
		//   26   47:invokevirtual   #186 <Method CharSequence Person.getName()>
		//   27   50:invokevirtual   #178 <Method void Bundle.putCharSequence(String, CharSequence)>
				if(android.os.Build.VERSION.SDK_INT >= 28)
		//*  28   53:getstatic       #125 <Field int android.os.Build$VERSION.SDK_INT>
		//*  29   56:bipush          28
		//*  30   58:icmplt          77
					bundle.putParcelable("sender_person", ((Parcelable) (mPerson.toAndroidPerson())));
		//   31   61:aload_1         
		//   32   62:ldc1            #23  <String "sender_person">
		//   33   64:aload_0         
		//   34   65:getfield        #63  <Field android.support.v4.app.Person mPerson>
		//   35   68:invokevirtual   #190 <Method Person Person.toAndroidPerson()>
		//   36   71:invokevirtual   #194 <Method void Bundle.putParcelable(String, Parcelable)>
				else
		//*  37   74:goto            90
					bundle.putBundle("person", mPerson.toBundle());
		//   38   77:aload_1         
		//   39   78:ldc1            #26  <String "person">
		//   40   80:aload_0         
		//   41   81:getfield        #63  <Field android.support.v4.app.Person mPerson>
		//   42   84:invokevirtual   #195 <Method Bundle Person.toBundle()>
		//   43   87:invokevirtual   #199 <Method void Bundle.putBundle(String, Bundle)>
			}
			obj = ((Object) (mDataMimeType));
		//   44   90:aload_0         
		//   45   91:getfield        #201 <Field String mDataMimeType>
		//   46   94:astore_2        
			if(obj != null)
		//*  47   95:aload_2         
		//*  48   96:ifnull          106
				bundle.putString("type", ((String) (obj)));
		//   49   99:aload_1         
		//   50  100:ldc1            #14  <String "type">
		//   51  102:aload_2         
		//   52  103:invokevirtual   #205 <Method void Bundle.putString(String, String)>
			obj = ((Object) (mDataUri));
		//   53  106:aload_0         
		//   54  107:getfield        #207 <Field Uri mDataUri>
		//   55  110:astore_2        
			if(obj != null)
		//*  56  111:aload_2         
		//*  57  112:ifnull          122
				bundle.putParcelable("uri", ((Parcelable) (obj)));
		//   58  115:aload_1         
		//   59  116:ldc1            #17  <String "uri">
		//   60  118:aload_2         
		//   61  119:invokevirtual   #194 <Method void Bundle.putParcelable(String, Parcelable)>
			obj = ((Object) (mExtras));
		//   62  122:aload_0         
		//   63  123:getfield        #57  <Field Bundle mExtras>
		//   64  126:astore_2        
			if(obj != null)
		//*  65  127:aload_2         
		//*  66  128:ifnull          138
				bundle.putBundle("extras", ((Bundle) (obj)));
		//   67  131:aload_1         
		//   68  132:ldc1            #20  <String "extras">
		//   69  134:aload_2         
		//   70  135:invokevirtual   #199 <Method void Bundle.putBundle(String, Bundle)>
			return bundle;
		//   71  138:aload_1         
		//   72  139:areturn         
		}

		public String getDataMimeType()
		{
			return mDataMimeType;
		//    0    0:aload_0         
		//    1    1:getfield        #201 <Field String mDataMimeType>
		//    2    4:areturn         
		}

		public Uri getDataUri()
		{
			return mDataUri;
		//    0    0:aload_0         
		//    1    1:getfield        #207 <Field Uri mDataUri>
		//    2    4:areturn         
		}

		public Bundle getExtras()
		{
			return mExtras;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field Bundle mExtras>
		//    2    4:areturn         
		}

		public android.support.v4.app.Person getPerson()
		{
			return mPerson;
		//    0    0:aload_0         
		//    1    1:getfield        #63  <Field android.support.v4.app.Person mPerson>
		//    2    4:areturn         
		}

		public CharSequence getSender()
		{
			android.support.v4.app.Person person = mPerson;
		//    0    0:aload_0         
		//    1    1:getfield        #63  <Field android.support.v4.app.Person mPerson>
		//    2    4:astore_1        
			if(person == null)
		//*   3    5:aload_1         
		//*   4    6:ifnonnull       11
				return null;
		//    5    9:aconst_null     
		//    6   10:areturn         
			else
				return person.getName();
		//    7   11:aload_1         
		//    8   12:invokevirtual   #186 <Method CharSequence Person.getName()>
		//    9   15:areturn         
		}

		public CharSequence getText()
		{
			return mText;
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field CharSequence mText>
		//    2    4:areturn         
		}

		public long getTimestamp()
		{
			return mTimestamp;
		//    0    0:aload_0         
		//    1    1:getfield        #61  <Field long mTimestamp>
		//    2    4:lreturn         
		}

		public Message setData(String s, Uri uri)
		{
			mDataMimeType = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #201 <Field String mDataMimeType>
			mDataUri = uri;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #207 <Field Uri mDataUri>
			return this;
		//    6   10:aload_0         
		//    7   11:areturn         
		}

		static final String KEY_DATA_MIME_TYPE = "type";
		static final String KEY_DATA_URI = "uri";
		static final String KEY_EXTRAS_BUNDLE = "extras";
		static final String KEY_NOTIFICATION_PERSON = "sender_person";
		static final String KEY_PERSON = "person";
		static final String KEY_SENDER = "sender";
		static final String KEY_TEXT = "text";
		static final String KEY_TIMESTAMP = "time";
		private String mDataMimeType;
		private Uri mDataUri;
		private Bundle mExtras;
		private final android.support.v4.app.Person mPerson;
		private final CharSequence mText;
		private final long mTimestamp;

		public Message(CharSequence charsequence, long l, android.support.v4.app.Person person)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #52  <Method void Object()>
			mExtras = new Bundle();
		//    2    4:aload_0         
		//    3    5:new             #54  <Class Bundle>
		//    4    8:dup             
		//    5    9:invokespecial   #55  <Method void Bundle()>
		//    6   12:putfield        #57  <Field Bundle mExtras>
			mText = charsequence;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #59  <Field CharSequence mText>
			mTimestamp = l;
		//   10   20:aload_0         
		//   11   21:lload_2         
		//   12   22:putfield        #61  <Field long mTimestamp>
			mPerson = person;
		//   13   25:aload_0         
		//   14   26:aload           4
		//   15   28:putfield        #63  <Field android.support.v4.app.Person mPerson>
		//   16   31:return          
		}

		public Message(CharSequence charsequence, long l, CharSequence charsequence1)
		{
			this(charsequence, l, (new Person.Builder()).setName(charsequence1).build());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:lload_2         
		//    3    3:new             #69  <Class Person$Builder>
		//    4    6:dup             
		//    5    7:invokespecial   #70  <Method void Person$Builder()>
		//    6   10:aload           4
		//    7   12:invokevirtual   #74  <Method Person$Builder Person$Builder.setName(CharSequence)>
		//    8   15:invokevirtual   #78  <Method android.support.v4.app.Person Person$Builder.build()>
		//    9   18:invokespecial   #80  <Method void NotificationCompat$MessagingStyle$Message(CharSequence, long, android.support.v4.app.Person)>
		//   10   21:return          
		}
	}


	public static NotificationCompat$MessagingStyle extractMessagingStyleFromNotification(Notification notification)
	{
		notification = ((Notification) (NotificationCompat.getExtras(notification)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #79  <Method Bundle NotificationCompat.getExtras(Notification)>
	//    2    4:astore_0        
		if(notification != null && !((Bundle) (notification)).containsKey("android.selfDisplayName") && !((Bundle) (notification)).containsKey("android.messagingStyleUser"))
	//*   3    5:aload_0         
	//*   4    6:ifnull          29
	//*   5    9:aload_0         
	//*   6   10:ldc1            #81  <String "android.selfDisplayName">
	//*   7   12:invokevirtual   #87  <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifne            29
	//*   9   18:aload_0         
	//*  10   19:ldc1            #89  <String "android.messagingStyleUser">
	//*  11   21:invokevirtual   #87  <Method boolean Bundle.containsKey(String)>
	//*  12   24:ifne            29
			return null;
	//   13   27:aconst_null     
	//   14   28:areturn         
		NotificationCompat$MessagingStyle notificationcompat$messagingstyle;
		try
		{
			notificationcompat$messagingstyle = new NotificationCompat$MessagingStyle();
	//   15   29:new             #2   <Class NotificationCompat$MessagingStyle>
	//   16   32:dup             
	//   17   33:invokespecial   #90  <Method void NotificationCompat$MessagingStyle()>
	//   18   36:astore_1        
			notificationcompat$messagingstyle.restoreFromCompatExtras(((Bundle) (notification)));
	//   19   37:aload_1         
	//   20   38:aload_0         
	//   21   39:invokevirtual   #94  <Method void restoreFromCompatExtras(Bundle)>
		}
	//*  22   42:aload_1         
	//*  23   43:areturn         
		// Misplaced declaration of an exception variable
		catch(Notification notification)
	//*  24   44:astore_0        
		{
			return null;
	//   25   45:aconst_null     
	//   26   46:areturn         
		}
		return notificationcompat$messagingstyle;
	}

	private Message findLatestIncomingMessage()
	{
		for(int i = mMessages.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field List mMessages>
	//*   2    4:invokeinterface #103 <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:isub            
	//*   5   11:istore_1        
	//*   6   12:iload_1         
	//*   7   13:iflt            59
		{
			Message message = (Message)mMessages.get(i);
	//    8   16:aload_0         
	//    9   17:getfield        #32  <Field List mMessages>
	//   10   20:iload_1         
	//   11   21:invokeinterface #107 <Method Object List.get(int)>
	//   12   26:checkcast       #9   <Class NotificationCompat$MessagingStyle$Message>
	//   13   29:astore_2        
			if(message.getPerson() != null && !TextUtils.isEmpty(message.getPerson().getName()))
	//*  14   30:aload_2         
	//*  15   31:invokevirtual   #110 <Method android.support.v4.app.Person NotificationCompat$MessagingStyle$Message.getPerson()>
	//*  16   34:ifnull          52
	//*  17   37:aload_2         
	//*  18   38:invokevirtual   #110 <Method android.support.v4.app.Person NotificationCompat$MessagingStyle$Message.getPerson()>
	//*  19   41:invokevirtual   #41  <Method CharSequence Person.getName()>
	//*  20   44:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  21   47:ifne            52
				return message;
	//   22   50:aload_2         
	//   23   51:areturn         
		}

	//   24   52:iload_1         
	//   25   53:iconst_1        
	//   26   54:isub            
	//   27   55:istore_1        
	//*  28   56:goto            12
		if(!mMessages.isEmpty())
	//*  29   59:aload_0         
	//*  30   60:getfield        #32  <Field List mMessages>
	//*  31   63:invokeinterface #113 <Method boolean List.isEmpty()>
	//*  32   68:ifne            94
		{
			List list = mMessages;
	//   33   71:aload_0         
	//   34   72:getfield        #32  <Field List mMessages>
	//   35   75:astore_2        
			return (Message)list.get(list.size() - 1);
	//   36   76:aload_2         
	//   37   77:aload_2         
	//   38   78:invokeinterface #103 <Method int List.size()>
	//   39   83:iconst_1        
	//   40   84:isub            
	//   41   85:invokeinterface #107 <Method Object List.get(int)>
	//   42   90:checkcast       #9   <Class NotificationCompat$MessagingStyle$Message>
	//   43   93:areturn         
		} else
		{
			return null;
	//   44   94:aconst_null     
	//   45   95:areturn         
		}
	}

	private boolean hasMessagesWithoutSender()
	{
		for(int i = mMessages.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field List mMessages>
	//*   2    4:invokeinterface #103 <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:isub            
	//*   5   11:istore_1        
	//*   6   12:iload_1         
	//*   7   13:iflt            56
		{
			Message message = (Message)mMessages.get(i);
	//    8   16:aload_0         
	//    9   17:getfield        #32  <Field List mMessages>
	//   10   20:iload_1         
	//   11   21:invokeinterface #107 <Method Object List.get(int)>
	//   12   26:checkcast       #9   <Class NotificationCompat$MessagingStyle$Message>
	//   13   29:astore_2        
			if(message.getPerson() != null && message.getPerson().getName() == null)
	//*  14   30:aload_2         
	//*  15   31:invokevirtual   #110 <Method android.support.v4.app.Person NotificationCompat$MessagingStyle$Message.getPerson()>
	//*  16   34:ifnull          49
	//*  17   37:aload_2         
	//*  18   38:invokevirtual   #110 <Method android.support.v4.app.Person NotificationCompat$MessagingStyle$Message.getPerson()>
	//*  19   41:invokevirtual   #41  <Method CharSequence Person.getName()>
	//*  20   44:ifnonnull       49
				return true;
	//   21   47:iconst_1        
	//   22   48:ireturn         
		}

	//   23   49:iload_1         
	//   24   50:iconst_1        
	//   25   51:isub            
	//   26   52:istore_1        
	//*  27   53:goto            12
		return false;
	//   28   56:iconst_0        
	//   29   57:ireturn         
	}

	private TextAppearanceSpan makeFontColorSpan(int i)
	{
		return new TextAppearanceSpan(((String) (null)), 0, 0, ColorStateList.valueOf(i), ((ColorStateList) (null)));
	//    0    0:new             #118 <Class TextAppearanceSpan>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:iload_1         
	//    6    8:invokestatic    #124 <Method ColorStateList ColorStateList.valueOf(int)>
	//    7   11:aconst_null     
	//    8   12:invokespecial   #127 <Method void TextAppearanceSpan(String, int, int, ColorStateList, ColorStateList)>
	//    9   15:areturn         
	}

	private CharSequence makeMessageLine(Message message)
	{
		BidiFormatter bidiformatter = BidiFormatter.getInstance();
	//    0    0:invokestatic    #135 <Method BidiFormatter BidiFormatter.getInstance()>
	//    1    3:astore          7
		SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
	//    2    5:new             #137 <Class SpannableStringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #138 <Method void SpannableStringBuilder()>
	//    5   12:astore          8
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   6   14:getstatic       #143 <Field int android.os.Build$VERSION.SDK_INT>
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
	//   16   33:ldc1            #144 <Int 0xff000000>
	//   17   35:istore_2        
		else
	//*  18   36:goto            41
			i = -1;
	//   19   39:iconst_m1       
	//   20   40:istore_2        
		Object obj;
		if(message.getPerson() == null)
	//*  21   41:aload_1         
	//*  22   42:invokevirtual   #110 <Method android.support.v4.app.Person NotificationCompat$MessagingStyle$Message.getPerson()>
	//*  23   45:ifnonnull       55
			obj = "";
	//   24   48:ldc1            #146 <String "">
	//   25   50:astore          5
		else
	//*  26   52:goto            64
			obj = ((Object) (message.getPerson().getName()));
	//   27   55:aload_1         
	//   28   56:invokevirtual   #110 <Method android.support.v4.app.Person NotificationCompat$MessagingStyle$Message.getPerson()>
	//   29   59:invokevirtual   #41  <Method CharSequence Person.getName()>
	//   30   62:astore          5
		int j = i;
	//   31   64:iload_2         
	//   32   65:istore          4
		Object obj1 = obj;
	//   33   67:aload           5
	//   34   69:astore          6
		if(TextUtils.isEmpty(((CharSequence) (obj))))
	//*  35   71:aload           5
	//*  36   73:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  37   76:ifeq            129
		{
			obj = ((Object) (mUser.getName()));
	//   38   79:aload_0         
	//   39   80:getfield        #49  <Field android.support.v4.app.Person mUser>
	//   40   83:invokevirtual   #41  <Method CharSequence Person.getName()>
	//   41   86:astore          5
			j = i;
	//   42   88:iload_2         
	//   43   89:istore          4
			obj1 = obj;
	//   44   91:aload           5
	//   45   93:astore          6
			if(flag)
	//*  46   95:iload_3         
	//*  47   96:ifeq            129
			{
				j = i;
	//   48   99:iload_2         
	//   49  100:istore          4
				obj1 = obj;
	//   50  102:aload           5
	//   51  104:astore          6
				if(mBuilder.getColor() != 0)
	//*  52  106:aload_0         
	//*  53  107:getfield        #150 <Field NotificationCompat$Builder mBuilder>
	//*  54  110:invokevirtual   #155 <Method int NotificationCompat$Builder.getColor()>
	//*  55  113:ifeq            129
				{
					j = mBuilder.getColor();
	//   56  116:aload_0         
	//   57  117:getfield        #150 <Field NotificationCompat$Builder mBuilder>
	//   58  120:invokevirtual   #155 <Method int NotificationCompat$Builder.getColor()>
	//   59  123:istore          4
					obj1 = obj;
	//   60  125:aload           5
	//   61  127:astore          6
				}
			}
		}
		obj = ((Object) (bidiformatter.unicodeWrap(((CharSequence) (obj1)))));
	//   62  129:aload           7
	//   63  131:aload           6
	//   64  133:invokevirtual   #159 <Method CharSequence BidiFormatter.unicodeWrap(CharSequence)>
	//   65  136:astore          5
		spannablestringbuilder.append(((CharSequence) (obj)));
	//   66  138:aload           8
	//   67  140:aload           5
	//   68  142:invokevirtual   #163 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   69  145:pop             
		spannablestringbuilder.setSpan(((Object) (makeFontColorSpan(j))), spannablestringbuilder.length() - ((CharSequence) (obj)).length(), spannablestringbuilder.length(), 33);
	//   70  146:aload           8
	//   71  148:aload_0         
	//   72  149:iload           4
	//   73  151:invokespecial   #165 <Method TextAppearanceSpan makeFontColorSpan(int)>
	//   74  154:aload           8
	//   75  156:invokevirtual   #168 <Method int SpannableStringBuilder.length()>
	//   76  159:aload           5
	//   77  161:invokeinterface #171 <Method int CharSequence.length()>
	//   78  166:isub            
	//   79  167:aload           8
	//   80  169:invokevirtual   #168 <Method int SpannableStringBuilder.length()>
	//   81  172:bipush          33
	//   82  174:invokevirtual   #175 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
		if(message.getText() == null)
	//*  83  177:aload_1         
	//*  84  178:invokevirtual   #178 <Method CharSequence NotificationCompat$MessagingStyle$Message.getText()>
	//*  85  181:ifnonnull       190
			message = "";
	//   86  184:ldc1            #146 <String "">
	//   87  186:astore_1        
		else
	//*  88  187:goto            195
			message = ((Message) (message.getText()));
	//   89  190:aload_1         
	//   90  191:invokevirtual   #178 <Method CharSequence NotificationCompat$MessagingStyle$Message.getText()>
	//   91  194:astore_1        
		spannablestringbuilder.append("  ").append(bidiformatter.unicodeWrap(((CharSequence) (message))));
	//   92  195:aload           8
	//   93  197:ldc1            #180 <String "  ">
	//   94  199:invokevirtual   #163 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   95  202:aload           7
	//   96  204:aload_1         
	//   97  205:invokevirtual   #159 <Method CharSequence BidiFormatter.unicodeWrap(CharSequence)>
	//   98  208:invokevirtual   #163 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   99  211:pop             
		return ((CharSequence) (spannablestringbuilder));
	//  100  212:aload           8
	//  101  214:areturn         
	}

	public void addCompatExtras(Bundle bundle)
	{
		super.addCompatExtras(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #183 <Method void NotificationCompat$Style.addCompatExtras(Bundle)>
		bundle.putCharSequence("android.selfDisplayName", mUser.getName());
	//    3    5:aload_1         
	//    4    6:ldc1            #81  <String "android.selfDisplayName">
	//    5    8:aload_0         
	//    6    9:getfield        #49  <Field android.support.v4.app.Person mUser>
	//    7   12:invokevirtual   #41  <Method CharSequence Person.getName()>
	//    8   15:invokevirtual   #187 <Method void Bundle.putCharSequence(String, CharSequence)>
		bundle.putBundle("android.messagingStyleUser", mUser.toBundle());
	//    9   18:aload_1         
	//   10   19:ldc1            #89  <String "android.messagingStyleUser">
	//   11   21:aload_0         
	//   12   22:getfield        #49  <Field android.support.v4.app.Person mUser>
	//   13   25:invokevirtual   #191 <Method Bundle Person.toBundle()>
	//   14   28:invokevirtual   #195 <Method void Bundle.putBundle(String, Bundle)>
		bundle.putCharSequence("android.hiddenConversationTitle", mConversationTitle);
	//   15   31:aload_1         
	//   16   32:ldc1            #197 <String "android.hiddenConversationTitle">
	//   17   34:aload_0         
	//   18   35:getfield        #199 <Field CharSequence mConversationTitle>
	//   19   38:invokevirtual   #187 <Method void Bundle.putCharSequence(String, CharSequence)>
		if(mConversationTitle != null && mIsGroupConversation.booleanValue())
	//*  20   41:aload_0         
	//*  21   42:getfield        #199 <Field CharSequence mConversationTitle>
	//*  22   45:ifnull          68
	//*  23   48:aload_0         
	//*  24   49:getfield        #201 <Field Boolean mIsGroupConversation>
	//*  25   52:invokevirtual   #206 <Method boolean Boolean.booleanValue()>
	//*  26   55:ifeq            68
			bundle.putCharSequence("android.conversationTitle", mConversationTitle);
	//   27   58:aload_1         
	//   28   59:ldc1            #208 <String "android.conversationTitle">
	//   29   61:aload_0         
	//   30   62:getfield        #199 <Field CharSequence mConversationTitle>
	//   31   65:invokevirtual   #187 <Method void Bundle.putCharSequence(String, CharSequence)>
		if(!mMessages.isEmpty())
	//*  32   68:aload_0         
	//*  33   69:getfield        #32  <Field List mMessages>
	//*  34   72:invokeinterface #113 <Method boolean List.isEmpty()>
	//*  35   77:ifne            93
			bundle.putParcelableArray("android.messages", ((Parcelable []) (Message.getBundleArrayForMessages(mMessages))));
	//   36   80:aload_1         
	//   37   81:ldc1            #210 <String "android.messages">
	//   38   83:aload_0         
	//   39   84:getfield        #32  <Field List mMessages>
	//   40   87:invokestatic    #214 <Method Bundle[] NotificationCompat$MessagingStyle$Message.getBundleArrayForMessages(List)>
	//   41   90:invokevirtual   #218 <Method void Bundle.putParcelableArray(String, Parcelable[])>
		Boolean boolean1 = mIsGroupConversation;
	//   42   93:aload_0         
	//   43   94:getfield        #201 <Field Boolean mIsGroupConversation>
	//   44   97:astore_2        
		if(boolean1 != null)
	//*  45   98:aload_2         
	//*  46   99:ifnull          112
			bundle.putBoolean("android.isGroupConversation", boolean1.booleanValue());
	//   47  102:aload_1         
	//   48  103:ldc1            #220 <String "android.isGroupConversation">
	//   49  105:aload_2         
	//   50  106:invokevirtual   #206 <Method boolean Boolean.booleanValue()>
	//   51  109:invokevirtual   #224 <Method void Bundle.putBoolean(String, boolean)>
	//   52  112:return          
	}

	public NotificationCompat$MessagingStyle addMessage(Message message)
	{
		mMessages.add(((Object) (message)));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field List mMessages>
	//    2    4:aload_1         
	//    3    5:invokeinterface #230 <Method boolean List.add(Object)>
	//    4   10:pop             
		if(mMessages.size() > 25)
	//*   5   11:aload_0         
	//*   6   12:getfield        #32  <Field List mMessages>
	//*   7   15:invokeinterface #103 <Method int List.size()>
	//*   8   20:bipush          25
	//*   9   22:icmple          36
			mMessages.remove(0);
	//   10   25:aload_0         
	//   11   26:getfield        #32  <Field List mMessages>
	//   12   29:iconst_0        
	//   13   30:invokeinterface #233 <Method Object List.remove(int)>
	//   14   35:pop             
		return this;
	//   15   36:aload_0         
	//   16   37:areturn         
	}

	public NotificationCompat$MessagingStyle addMessage(CharSequence charsequence, long l, android.support.v4.app.Person person)
	{
		addMessage(new Message(charsequence, l, person));
	//    0    0:aload_0         
	//    1    1:new             #9   <Class NotificationCompat$MessagingStyle$Message>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:lload_2         
	//    5    7:aload           4
	//    6    9:invokespecial   #237 <Method void NotificationCompat$MessagingStyle$Message(CharSequence, long, android.support.v4.app.Person)>
	//    7   12:invokevirtual   #239 <Method NotificationCompat$MessagingStyle addMessage(NotificationCompat$MessagingStyle$Message)>
	//    8   15:pop             
		return this;
	//    9   16:aload_0         
	//   10   17:areturn         
	}

	public NotificationCompat$MessagingStyle addMessage(CharSequence charsequence, long l, CharSequence charsequence1)
	{
		mMessages.add(((Object) (new Message(charsequence, l, (new Person.Builder()).setName(charsequence1).build()))));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field List mMessages>
	//    2    4:new             #9   <Class NotificationCompat$MessagingStyle$Message>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:lload_2         
	//    6   10:new             #61  <Class Person$Builder>
	//    7   13:dup             
	//    8   14:invokespecial   #62  <Method void Person$Builder()>
	//    9   17:aload           4
	//   10   19:invokevirtual   #66  <Method Person$Builder Person$Builder.setName(CharSequence)>
	//   11   22:invokevirtual   #70  <Method android.support.v4.app.Person Person$Builder.build()>
	//   12   25:invokespecial   #237 <Method void NotificationCompat$MessagingStyle$Message(CharSequence, long, android.support.v4.app.Person)>
	//   13   28:invokeinterface #230 <Method boolean List.add(Object)>
	//   14   33:pop             
		if(mMessages.size() > 25)
	//*  15   34:aload_0         
	//*  16   35:getfield        #32  <Field List mMessages>
	//*  17   38:invokeinterface #103 <Method int List.size()>
	//*  18   43:bipush          25
	//*  19   45:icmple          59
			mMessages.remove(0);
	//   20   48:aload_0         
	//   21   49:getfield        #32  <Field List mMessages>
	//   22   52:iconst_0        
	//   23   53:invokeinterface #233 <Method Object List.remove(int)>
	//   24   58:pop             
		return this;
	//   25   59:aload_0         
	//   26   60:areturn         
	}

	public void apply(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		setGroupConversation(isGroupConversation());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #249 <Method boolean isGroupConversation()>
	//    3    5:invokevirtual   #253 <Method NotificationCompat$MessagingStyle setGroupConversation(boolean)>
	//    4    8:pop             
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   5    9:getstatic       #143 <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   12:bipush          24
	//*   7   14:icmplt          299
		{
			android.app.Notification.MessagingStyle messagingstyle;
			if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   8   17:getstatic       #143 <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   20:bipush          28
	//*  10   22:icmplt          44
				messagingstyle = new android.app.Notification.MessagingStyle(mUser.toAndroidPerson());
	//   11   25:new             #255 <Class android.app.Notification$MessagingStyle>
	//   12   28:dup             
	//   13   29:aload_0         
	//   14   30:getfield        #49  <Field android.support.v4.app.Person mUser>
	//   15   33:invokevirtual   #259 <Method Person Person.toAndroidPerson()>
	//   16   36:invokespecial   #262 <Method void android.app.Notification$MessagingStyle(Person)>
	//   17   39:astore          6
			else
	//*  18   41:goto            60
				messagingstyle = new android.app.Notification.MessagingStyle(mUser.getName());
	//   19   44:new             #255 <Class android.app.Notification$MessagingStyle>
	//   20   47:dup             
	//   21   48:aload_0         
	//   22   49:getfield        #49  <Field android.support.v4.app.Person mUser>
	//   23   52:invokevirtual   #41  <Method CharSequence Person.getName()>
	//   24   55:invokespecial   #264 <Method void android.app.Notification$MessagingStyle(CharSequence)>
	//   25   58:astore          6
			if(mIsGroupConversation.booleanValue() || android.os.Build.VERSION.SDK_INT >= 28)
	//*  26   60:aload_0         
	//*  27   61:getfield        #201 <Field Boolean mIsGroupConversation>
	//*  28   64:invokevirtual   #206 <Method boolean Boolean.booleanValue()>
	//*  29   67:ifne            78
	//*  30   70:getstatic       #143 <Field int android.os.Build$VERSION.SDK_INT>
	//*  31   73:bipush          28
	//*  32   75:icmplt          88
				messagingstyle.setConversationTitle(mConversationTitle);
	//   33   78:aload           6
	//   34   80:aload_0         
	//   35   81:getfield        #199 <Field CharSequence mConversationTitle>
	//   36   84:invokevirtual   #268 <Method android.app.Notification$MessagingStyle android.app.Notification$MessagingStyle.setConversationTitle(CharSequence)>
	//   37   87:pop             
			if(android.os.Build.VERSION.SDK_INT >= 28)
	//*  38   88:getstatic       #143 <Field int android.os.Build$VERSION.SDK_INT>
	//*  39   91:bipush          28
	//*  40   93:icmplt          109
				messagingstyle.setGroupConversation(mIsGroupConversation.booleanValue());
	//   41   96:aload           6
	//   42   98:aload_0         
	//   43   99:getfield        #201 <Field Boolean mIsGroupConversation>
	//   44  102:invokevirtual   #206 <Method boolean Boolean.booleanValue()>
	//   45  105:invokevirtual   #271 <Method android.app.Notification$MessagingStyle android.app.Notification$MessagingStyle.setGroupConversation(boolean)>
	//   46  108:pop             
			Object obj2;
			for(Iterator iterator = mMessages.iterator(); iterator.hasNext(); messagingstyle.addMessage(((android.app.e) (obj2))))
	//*  47  109:aload_0         
	//*  48  110:getfield        #32  <Field List mMessages>
	//*  49  113:invokeinterface #275 <Method Iterator List.iterator()>
	//*  50  118:astore          8
	//*  51  120:aload           8
	//*  52  122:invokeinterface #280 <Method boolean Iterator.hasNext()>
	//*  53  127:ifeq            287
			{
				Message message = (Message)iterator.next();
	//   54  130:aload           8
	//   55  132:invokeinterface #284 <Method Object Iterator.next()>
	//   56  137:checkcast       #9   <Class NotificationCompat$MessagingStyle$Message>
	//   57  140:astore          9
				if(android.os.Build.VERSION.SDK_INT >= 28)
	//*  58  142:getstatic       #143 <Field int android.os.Build$VERSION.SDK_INT>
	//*  59  145:bipush          28
	//*  60  147:icmplt          207
				{
					obj2 = ((Object) (message.getPerson()));
	//   61  150:aload           9
	//   62  152:invokevirtual   #110 <Method android.support.v4.app.Person NotificationCompat$MessagingStyle$Message.getPerson()>
	//   63  155:astore          7
					CharSequence charsequence = message.getText();
	//   64  157:aload           9
	//   65  159:invokevirtual   #178 <Method CharSequence NotificationCompat$MessagingStyle$Message.getText()>
	//   66  162:astore          10
					long l = message.getTimestamp();
	//   67  164:aload           9
	//   68  166:invokevirtual   #288 <Method long NotificationCompat$MessagingStyle$Message.getTimestamp()>
	//   69  169:lstore          4
					if(obj2 == null)
	//*  70  171:aload           7
	//*  71  173:ifnonnull       182
						obj2 = null;
	//   72  176:aconst_null     
	//   73  177:astore          7
					else
	//*  74  179:goto            189
						obj2 = ((Object) (((android.support.v4.app.Person) (obj2)).toAndroidPerson()));
	//   75  182:aload           7
	//   76  184:invokevirtual   #259 <Method Person Person.toAndroidPerson()>
	//   77  187:astore          7
					obj2 = ((Object) (new android.app.e(charsequence, l, ((Person) (obj2)))));
	//   78  189:new             #290 <Class android.app.Notification$MessagingStyle$Message>
	//   79  192:dup             
	//   80  193:aload           10
	//   81  195:lload           4
	//   82  197:aload           7
	//   83  199:invokespecial   #293 <Method void android.app.Notification$MessagingStyle$Message(CharSequence, long, Person)>
	//   84  202:astore          7
				} else
	//*  85  204:goto            252
				{
					if(message.getPerson() != null)
	//*  86  207:aload           9
	//*  87  209:invokevirtual   #110 <Method android.support.v4.app.Person NotificationCompat$MessagingStyle$Message.getPerson()>
	//*  88  212:ifnull          228
						obj2 = ((Object) (message.getPerson().getName()));
	//   89  215:aload           9
	//   90  217:invokevirtual   #110 <Method android.support.v4.app.Person NotificationCompat$MessagingStyle$Message.getPerson()>
	//   91  220:invokevirtual   #41  <Method CharSequence Person.getName()>
	//   92  223:astore          7
					else
	//*  93  225:goto            231
						obj2 = null;
	//   94  228:aconst_null     
	//   95  229:astore          7
					obj2 = ((Object) (new android.app.e(message.getText(), message.getTimestamp(), ((CharSequence) (obj2)))));
	//   96  231:new             #290 <Class android.app.Notification$MessagingStyle$Message>
	//   97  234:dup             
	//   98  235:aload           9
	//   99  237:invokevirtual   #178 <Method CharSequence NotificationCompat$MessagingStyle$Message.getText()>
	//  100  240:aload           9
	//  101  242:invokevirtual   #288 <Method long NotificationCompat$MessagingStyle$Message.getTimestamp()>
	//  102  245:aload           7
	//  103  247:invokespecial   #296 <Method void android.app.Notification$MessagingStyle$Message(CharSequence, long, CharSequence)>
	//  104  250:astore          7
				}
				if(message.getDataMimeType() != null)
	//* 105  252:aload           9
	//* 106  254:invokevirtual   #300 <Method String NotificationCompat$MessagingStyle$Message.getDataMimeType()>
	//* 107  257:ifnull          276
					((android.app.e) (obj2)).setData(message.getDataMimeType(), message.getDataUri());
	//  108  260:aload           7
	//  109  262:aload           9
	//  110  264:invokevirtual   #300 <Method String NotificationCompat$MessagingStyle$Message.getDataMimeType()>
	//  111  267:aload           9
	//  112  269:invokevirtual   #304 <Method Uri NotificationCompat$MessagingStyle$Message.getDataUri()>
	//  113  272:invokevirtual   #308 <Method android.app.Notification$MessagingStyle$Message android.app.Notification$MessagingStyle$Message.setData(String, Uri)>
	//  114  275:pop             
			}

	//  115  276:aload           6
	//  116  278:aload           7
	//  117  280:invokevirtual   #311 <Method android.app.Notification$MessagingStyle android.app.Notification$MessagingStyle.addMessage(android.app.Notification$MessagingStyle$Message)>
	//  118  283:pop             
	//* 119  284:goto            120
			messagingstyle.setBuilder(notificationbuilderwithbuilderaccessor.getBuilder());
	//  120  287:aload           6
	//  121  289:aload_1         
	//  122  290:invokeinterface #317 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//  123  295:invokevirtual   #321 <Method void android.app.Notification$MessagingStyle.setBuilder(android.app.Notification$Builder)>
			return;
	//  124  298:return          
		}
		Object obj = ((Object) (findLatestIncomingMessage()));
	//  125  299:aload_0         
	//  126  300:invokespecial   #323 <Method NotificationCompat$MessagingStyle$Message findLatestIncomingMessage()>
	//  127  303:astore          6
		if(mConversationTitle != null && mIsGroupConversation.booleanValue())
	//* 128  305:aload_0         
	//* 129  306:getfield        #199 <Field CharSequence mConversationTitle>
	//* 130  309:ifnull          339
	//* 131  312:aload_0         
	//* 132  313:getfield        #201 <Field Boolean mIsGroupConversation>
	//* 133  316:invokevirtual   #206 <Method boolean Boolean.booleanValue()>
	//* 134  319:ifeq            339
			notificationbuilderwithbuilderaccessor.getBuilder().setContentTitle(mConversationTitle);
	//  135  322:aload_1         
	//  136  323:invokeinterface #317 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//  137  328:aload_0         
	//  138  329:getfield        #199 <Field CharSequence mConversationTitle>
	//  139  332:invokevirtual   #329 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//  140  335:pop             
		else
	//* 141  336:goto            382
		if(obj != null)
	//* 142  339:aload           6
	//* 143  341:ifnull          382
		{
			notificationbuilderwithbuilderaccessor.getBuilder().setContentTitle("");
	//  144  344:aload_1         
	//  145  345:invokeinterface #317 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//  146  350:ldc1            #146 <String "">
	//  147  352:invokevirtual   #329 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//  148  355:pop             
			if(((Message) (obj)).getPerson() != null)
	//* 149  356:aload           6
	//* 150  358:invokevirtual   #110 <Method android.support.v4.app.Person NotificationCompat$MessagingStyle$Message.getPerson()>
	//* 151  361:ifnull          382
				notificationbuilderwithbuilderaccessor.getBuilder().setContentTitle(((Message) (obj)).getPerson().getName());
	//  152  364:aload_1         
	//  153  365:invokeinterface #317 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//  154  370:aload           6
	//  155  372:invokevirtual   #110 <Method android.support.v4.app.Person NotificationCompat$MessagingStyle$Message.getPerson()>
	//  156  375:invokevirtual   #41  <Method CharSequence Person.getName()>
	//  157  378:invokevirtual   #329 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//  158  381:pop             
		}
		if(obj != null)
	//* 159  382:aload           6
	//* 160  384:ifnull          428
		{
			android.app.Notification.Builder builder = notificationbuilderwithbuilderaccessor.getBuilder();
	//  161  387:aload_1         
	//  162  388:invokeinterface #317 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//  163  393:astore          7
			if(mConversationTitle != null)
	//* 164  395:aload_0         
	//* 165  396:getfield        #199 <Field CharSequence mConversationTitle>
	//* 166  399:ifnull          413
				obj = ((Object) (makeMessageLine(((Message) (obj)))));
	//  167  402:aload_0         
	//  168  403:aload           6
	//  169  405:invokespecial   #331 <Method CharSequence makeMessageLine(NotificationCompat$MessagingStyle$Message)>
	//  170  408:astore          6
			else
	//* 171  410:goto            420
				obj = ((Object) (((Message) (obj)).getText()));
	//  172  413:aload           6
	//  173  415:invokevirtual   #178 <Method CharSequence NotificationCompat$MessagingStyle$Message.getText()>
	//  174  418:astore          6
			builder.setContentText(((CharSequence) (obj)));
	//  175  420:aload           7
	//  176  422:aload           6
	//  177  424:invokevirtual   #334 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//  178  427:pop             
		}
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//* 179  428:getstatic       #143 <Field int android.os.Build$VERSION.SDK_INT>
	//* 180  431:bipush          16
	//* 181  433:icmplt          586
		{
			SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
	//  182  436:new             #137 <Class SpannableStringBuilder>
	//  183  439:dup             
	//  184  440:invokespecial   #138 <Method void SpannableStringBuilder()>
	//  185  443:astore          7
			boolean flag;
			if(mConversationTitle == null && !hasMessagesWithoutSender())
	//* 186  445:aload_0         
	//* 187  446:getfield        #199 <Field CharSequence mConversationTitle>
	//* 188  449:ifnonnull       467
	//* 189  452:aload_0         
	//* 190  453:invokespecial   #336 <Method boolean hasMessagesWithoutSender()>
	//* 191  456:ifeq            462
	//* 192  459:goto            467
				flag = false;
	//  193  462:iconst_0        
	//  194  463:istore_2        
			else
	//* 195  464:goto            469
				flag = true;
	//  196  467:iconst_1        
	//  197  468:istore_2        
			for(int i = mMessages.size() - 1; i >= 0; i--)
	//* 198  469:aload_0         
	//* 199  470:getfield        #32  <Field List mMessages>
	//* 200  473:invokeinterface #103 <Method int List.size()>
	//* 201  478:iconst_1        
	//* 202  479:isub            
	//* 203  480:istore_3        
	//* 204  481:iload_3         
	//* 205  482:iflt            563
			{
				Object obj1 = ((Object) ((Message)mMessages.get(i)));
	//  206  485:aload_0         
	//  207  486:getfield        #32  <Field List mMessages>
	//  208  489:iload_3         
	//  209  490:invokeinterface #107 <Method Object List.get(int)>
	//  210  495:checkcast       #9   <Class NotificationCompat$MessagingStyle$Message>
	//  211  498:astore          6
				if(flag)
	//* 212  500:iload_2         
	//* 213  501:ifeq            515
					obj1 = ((Object) (makeMessageLine(((Message) (obj1)))));
	//  214  504:aload_0         
	//  215  505:aload           6
	//  216  507:invokespecial   #331 <Method CharSequence makeMessageLine(NotificationCompat$MessagingStyle$Message)>
	//  217  510:astore          6
				else
	//* 218  512:goto            522
					obj1 = ((Object) (((Message) (obj1)).getText()));
	//  219  515:aload           6
	//  220  517:invokevirtual   #178 <Method CharSequence NotificationCompat$MessagingStyle$Message.getText()>
	//  221  520:astore          6
				if(i != mMessages.size() - 1)
	//* 222  522:iload_3         
	//* 223  523:aload_0         
	//* 224  524:getfield        #32  <Field List mMessages>
	//* 225  527:invokeinterface #103 <Method int List.size()>
	//* 226  532:iconst_1        
	//* 227  533:isub            
	//* 228  534:icmpeq          547
					spannablestringbuilder.insert(0, "\n");
	//  229  537:aload           7
	//  230  539:iconst_0        
	//  231  540:ldc2            #338 <String "\n">
	//  232  543:invokevirtual   #342 <Method SpannableStringBuilder SpannableStringBuilder.insert(int, CharSequence)>
	//  233  546:pop             
				spannablestringbuilder.insert(0, ((CharSequence) (obj1)));
	//  234  547:aload           7
	//  235  549:iconst_0        
	//  236  550:aload           6
	//  237  552:invokevirtual   #342 <Method SpannableStringBuilder SpannableStringBuilder.insert(int, CharSequence)>
	//  238  555:pop             
			}

	//  239  556:iload_3         
	//  240  557:iconst_1        
	//  241  558:isub            
	//  242  559:istore_3        
	//* 243  560:goto            481
			(new android.app.Notification.BigTextStyle(notificationbuilderwithbuilderaccessor.getBuilder())).setBigContentTitle(((CharSequence) (null))).bigText(((CharSequence) (spannablestringbuilder)));
	//  244  563:new             #344 <Class android.app.Notification$BigTextStyle>
	//  245  566:dup             
	//  246  567:aload_1         
	//  247  568:invokeinterface #317 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//  248  573:invokespecial   #346 <Method void android.app.Notification$BigTextStyle(android.app.Notification$Builder)>
	//  249  576:aconst_null     
	//  250  577:invokevirtual   #350 <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.setBigContentTitle(CharSequence)>
	//  251  580:aload           7
	//  252  582:invokevirtual   #353 <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.bigText(CharSequence)>
	//  253  585:pop             
		}
	//  254  586:return          
	}

	public CharSequence getConversationTitle()
	{
		return mConversationTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field CharSequence mConversationTitle>
	//    2    4:areturn         
	}

	public List getMessages()
	{
		return mMessages;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field List mMessages>
	//    2    4:areturn         
	}

	public android.support.v4.app.Person getUser()
	{
		return mUser;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field android.support.v4.app.Person mUser>
	//    2    4:areturn         
	}

	public CharSequence getUserDisplayName()
	{
		return mUser.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field android.support.v4.app.Person mUser>
	//    2    4:invokevirtual   #41  <Method CharSequence Person.getName()>
	//    3    7:areturn         
	}

	public boolean isGroupConversation()
	{
		Object obj = ((Object) (mBuilder));
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field NotificationCompat$Builder mBuilder>
	//    2    4:astore_3        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		boolean flag = false;
	//    5    7:iconst_0        
	//    6    8:istore_1        
		if(obj != null && mBuilder.mContext.getApplicationInfo().targetSdkVersion < 28 && mIsGroupConversation == null)
	//*   7    9:aload_3         
	//*   8   10:ifnull          49
	//*   9   13:aload_0         
	//*  10   14:getfield        #150 <Field NotificationCompat$Builder mBuilder>
	//*  11   17:getfield        #364 <Field Context NotificationCompat$Builder.mContext>
	//*  12   20:invokevirtual   #370 <Method ApplicationInfo Context.getApplicationInfo()>
	//*  13   23:getfield        #375 <Field int ApplicationInfo.targetSdkVersion>
	//*  14   26:bipush          28
	//*  15   28:icmpge          49
	//*  16   31:aload_0         
	//*  17   32:getfield        #201 <Field Boolean mIsGroupConversation>
	//*  18   35:ifnonnull       49
		{
			if(mConversationTitle != null)
	//*  19   38:aload_0         
	//*  20   39:getfield        #199 <Field CharSequence mConversationTitle>
	//*  21   42:ifnull          47
				flag = true;
	//   22   45:iconst_1        
	//   23   46:istore_1        
			return flag;
	//   24   47:iload_1         
	//   25   48:ireturn         
		}
		obj = ((Object) (mIsGroupConversation));
	//   26   49:aload_0         
	//   27   50:getfield        #201 <Field Boolean mIsGroupConversation>
	//   28   53:astore_3        
		flag = flag1;
	//   29   54:iload_2         
	//   30   55:istore_1        
		if(obj != null)
	//*  31   56:aload_3         
	//*  32   57:ifnull          65
			flag = ((Boolean) (obj)).booleanValue();
	//   33   60:aload_3         
	//   34   61:invokevirtual   #206 <Method boolean Boolean.booleanValue()>
	//   35   64:istore_1        
		return flag;
	//   36   65:iload_1         
	//   37   66:ireturn         
	}

	protected void restoreFromCompatExtras(Bundle bundle)
	{
		mMessages.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field List mMessages>
	//    2    4:invokeinterface #378 <Method void List.clear()>
		if(bundle.containsKey("android.messagingStyleUser"))
	//*   3    9:aload_1         
	//*   4   10:ldc1            #89  <String "android.messagingStyleUser">
	//*   5   12:invokevirtual   #87  <Method boolean Bundle.containsKey(String)>
	//*   6   15:ifeq            34
			mUser = Person.fromBundle(bundle.getBundle("android.messagingStyleUser"));
	//    7   18:aload_0         
	//    8   19:aload_1         
	//    9   20:ldc1            #89  <String "android.messagingStyleUser">
	//   10   22:invokevirtual   #382 <Method Bundle Bundle.getBundle(String)>
	//   11   25:invokestatic    #386 <Method android.support.v4.app.Person Person.fromBundle(Bundle)>
	//   12   28:putfield        #49  <Field android.support.v4.app.Person mUser>
		else
	//*  13   31:goto            57
			mUser = (new Person.Builder()).setName(((CharSequence) (bundle.getString("android.selfDisplayName")))).build();
	//   14   34:aload_0         
	//   15   35:new             #61  <Class Person$Builder>
	//   16   38:dup             
	//   17   39:invokespecial   #62  <Method void Person$Builder()>
	//   18   42:aload_1         
	//   19   43:ldc1            #81  <String "android.selfDisplayName">
	//   20   45:invokevirtual   #390 <Method String Bundle.getString(String)>
	//   21   48:invokevirtual   #66  <Method Person$Builder Person$Builder.setName(CharSequence)>
	//   22   51:invokevirtual   #70  <Method android.support.v4.app.Person Person$Builder.build()>
	//   23   54:putfield        #49  <Field android.support.v4.app.Person mUser>
		mConversationTitle = bundle.getCharSequence("android.conversationTitle");
	//   24   57:aload_0         
	//   25   58:aload_1         
	//   26   59:ldc1            #208 <String "android.conversationTitle">
	//   27   61:invokevirtual   #394 <Method CharSequence Bundle.getCharSequence(String)>
	//   28   64:putfield        #199 <Field CharSequence mConversationTitle>
		if(mConversationTitle == null)
	//*  29   67:aload_0         
	//*  30   68:getfield        #199 <Field CharSequence mConversationTitle>
	//*  31   71:ifnonnull       84
			mConversationTitle = bundle.getCharSequence("android.hiddenConversationTitle");
	//   32   74:aload_0         
	//   33   75:aload_1         
	//   34   76:ldc1            #197 <String "android.hiddenConversationTitle">
	//   35   78:invokevirtual   #394 <Method CharSequence Bundle.getCharSequence(String)>
	//   36   81:putfield        #199 <Field CharSequence mConversationTitle>
		Parcelable aparcelable[] = bundle.getParcelableArray("android.messages");
	//   37   84:aload_1         
	//   38   85:ldc1            #210 <String "android.messages">
	//   39   87:invokevirtual   #398 <Method Parcelable[] Bundle.getParcelableArray(String)>
	//   40   90:astore_2        
		if(aparcelable != null)
	//*  41   91:aload_2         
	//*  42   92:ifnull          109
			mMessages.addAll(((java.util.Collection) (Message.getMessagesFromBundleArray(aparcelable))));
	//   43   95:aload_0         
	//   44   96:getfield        #32  <Field List mMessages>
	//   45   99:aload_2         
	//   46  100:invokestatic    #402 <Method List NotificationCompat$MessagingStyle$Message.getMessagesFromBundleArray(Parcelable[])>
	//   47  103:invokeinterface #406 <Method boolean List.addAll(java.util.Collection)>
	//   48  108:pop             
		if(bundle.containsKey("android.isGroupConversation"))
	//*  49  109:aload_1         
	//*  50  110:ldc1            #220 <String "android.isGroupConversation">
	//*  51  112:invokevirtual   #87  <Method boolean Bundle.containsKey(String)>
	//*  52  115:ifeq            131
			mIsGroupConversation = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
	//   53  118:aload_0         
	//   54  119:aload_1         
	//   55  120:ldc1            #220 <String "android.isGroupConversation">
	//   56  122:invokevirtual   #409 <Method boolean Bundle.getBoolean(String)>
	//   57  125:invokestatic    #412 <Method Boolean Boolean.valueOf(boolean)>
	//   58  128:putfield        #201 <Field Boolean mIsGroupConversation>
	//   59  131:return          
	}

	public NotificationCompat$MessagingStyle setConversationTitle(CharSequence charsequence)
	{
		mConversationTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #199 <Field CharSequence mConversationTitle>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$MessagingStyle setGroupConversation(boolean flag)
	{
		mIsGroupConversation = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #412 <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #201 <Field Boolean mIsGroupConversation>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public static final int MAXIMUM_RETAINED_MESSAGES = 25;
	private CharSequence mConversationTitle;
	private Boolean mIsGroupConversation;
	private final List mMessages;
	private android.support.v4.app.Person mUser;

	private NotificationCompat$MessagingStyle()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void NotificationCompat$Style()>
		mMessages = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #29  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void ArrayList()>
	//    6   12:putfield        #32  <Field List mMessages>
	//    7   15:return          
	}

	public NotificationCompat$MessagingStyle(android.support.v4.app.Person person)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void NotificationCompat$Style()>
		mMessages = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #29  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void ArrayList()>
	//    6   12:putfield        #32  <Field List mMessages>
		if(!TextUtils.isEmpty(person.getName()))
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #41  <Method CharSequence Person.getName()>
	//*   9   19:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  10   22:ifne            31
		{
			mUser = person;
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:putfield        #49  <Field android.support.v4.app.Person mUser>
			return;
	//   14   30:return          
		} else
		{
			throw new IllegalArgumentException("User's name must not be empty.");
	//   15   31:new             #51  <Class IllegalArgumentException>
	//   16   34:dup             
	//   17   35:ldc1            #53  <String "User's name must not be empty.">
	//   18   37:invokespecial   #56  <Method void IllegalArgumentException(String)>
	//   19   40:athrow          
		}
	}

	public NotificationCompat$MessagingStyle(CharSequence charsequence)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void NotificationCompat$Style()>
		mMessages = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #29  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void ArrayList()>
	//    6   12:putfield        #32  <Field List mMessages>
		mUser = (new Person.Builder()).setName(charsequence).build();
	//    7   15:aload_0         
	//    8   16:new             #61  <Class Person$Builder>
	//    9   19:dup             
	//   10   20:invokespecial   #62  <Method void Person$Builder()>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #66  <Method Person$Builder Person$Builder.setName(CharSequence)>
	//   13   27:invokevirtual   #70  <Method android.support.v4.app.Person Person$Builder.build()>
	//   14   30:putfield        #49  <Field android.support.v4.app.Person mUser>
	//   15   33:return          
	}
}
