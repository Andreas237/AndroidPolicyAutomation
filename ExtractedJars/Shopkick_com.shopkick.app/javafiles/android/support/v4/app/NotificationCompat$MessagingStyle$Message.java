// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Person;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, Person

public static final class NotificationCompat$MessagingStyle$Message
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
			abundle[i] = ((NotificationCompat$MessagingStyle$Message)list.get(i)).toBundle();
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

	static NotificationCompat$MessagingStyle$Message getMessageFromBundle(Bundle bundle)
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
			obj = ((Object) (new NotificationCompat$MessagingStyle$Message(bundle.getCharSequence("text"), bundle.getLong("time"), ((android.support.v4.app.Person) (obj)))));
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
				((NotificationCompat$MessagingStyle$Message) (obj)).setData(bundle.getString("type"), (Uri)bundle.getParcelable("uri"));
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
				((NotificationCompat$MessagingStyle$Message) (obj)).getExtras().putAll(bundle.getBundle("extras"));
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
		return ((NotificationCompat$MessagingStyle$Message) (obj));
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
			NotificationCompat$MessagingStyle$Message notificationcompat$messagingstyle$message = getMessageFromBundle((Bundle)aparcelable[i]);
	//   17   27:aload_0         
	//   18   28:iload_1         
	//   19   29:aaload          
	//   20   30:checkcast       #54  <Class Bundle>
	//   21   33:invokestatic    #169 <Method NotificationCompat$MessagingStyle$Message getMessageFromBundle(Bundle)>
	//   22   36:astore_3        
			if(notificationcompat$messagingstyle$message != null)
	//*  23   37:aload_3         
	//*  24   38:ifnull          49
				((List) (arraylist)).add(((Object) (notificationcompat$messagingstyle$message)));
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

	public NotificationCompat$MessagingStyle$Message setData(String s, Uri uri)
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

	public NotificationCompat$MessagingStyle$Message(CharSequence charsequence, long l, android.support.v4.app.Person person)
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

	public NotificationCompat$MessagingStyle$Message(CharSequence charsequence, long l, CharSequence charsequence1)
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
