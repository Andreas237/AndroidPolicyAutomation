// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat

public static final class NotificationCompat$MessagingStyle$Message
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
			abundle[i] = ((NotificationCompat$MessagingStyle$Message)list.get(i)).toBundle();
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

	static NotificationCompat$MessagingStyle$Message getMessageFromBundle(Bundle bundle)
	{
		NotificationCompat$MessagingStyle$Message notificationcompat$messagingstyle$message;
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
		NotificationCompat$MessagingStyle$Message notificationcompat$messagingstyle$message1;
		try
		{
			notificationcompat$messagingstyle$message1 = new NotificationCompat$MessagingStyle$Message(bundle.getCharSequence("text"), bundle.getLong("time"), bundle.getCharSequence("sender"));
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
				notificationcompat$messagingstyle$message1.setData(bundle.getString("type"), (Uri)bundle.getParcelable("uri"));
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
		notificationcompat$messagingstyle$message = notificationcompat$messagingstyle$message1;
		if(!bundle.containsKey("extras"))
			break MISSING_BLOCK_LABEL_116;
		notificationcompat$messagingstyle$message1.getExtras().putAll(bundle.getBundle("extras"));
		return notificationcompat$messagingstyle$message1;
		notificationcompat$messagingstyle$message = null;
	//   57  114:aconst_null     
	//   58  115:astore_1        
		return notificationcompat$messagingstyle$message;
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
			NotificationCompat$MessagingStyle$Message notificationcompat$messagingstyle$message = getMessageFromBundle((Bundle)aparcelable[i]);
	//   17   27:aload_0         
	//   18   28:iload_1         
	//   19   29:aaload          
	//   20   30:checkcast       #46  <Class Bundle>
	//   21   33:invokestatic    #126 <Method NotificationCompat$MessagingStyle$Message getMessageFromBundle(Bundle)>
	//   22   36:astore_3        
			if(notificationcompat$messagingstyle$message != null)
	//*  23   37:aload_3         
	//*  24   38:ifnull          49
				((List) (arraylist)).add(((Object) (notificationcompat$messagingstyle$message)));
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

	public NotificationCompat$MessagingStyle$Message setData(String s, Uri uri)
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

	public NotificationCompat$MessagingStyle$Message(CharSequence charsequence, long l, CharSequence charsequence1)
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
