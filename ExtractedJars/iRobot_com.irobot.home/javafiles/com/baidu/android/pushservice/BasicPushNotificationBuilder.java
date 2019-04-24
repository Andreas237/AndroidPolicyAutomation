// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice;

import android.app.Notification;
import android.content.Context;
import android.net.Uri;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// Referenced classes of package com.baidu.android.pushservice:
//			PushNotificationBuilder

public class BasicPushNotificationBuilder extends PushNotificationBuilder
{

	public BasicPushNotificationBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void PushNotificationBuilder()>
	//    2    4:return          
	}

	private void readObject(ObjectInputStream objectinputstream)
	{
		mStatusbarIcon = objectinputstream.readInt();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #17  <Method int ObjectInputStream.readInt()>
	//    3    5:putfield        #21  <Field int mStatusbarIcon>
		mNotificationFlags = objectinputstream.readInt();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #17  <Method int ObjectInputStream.readInt()>
	//    7   13:putfield        #24  <Field int mNotificationFlags>
		mNotificationDefaults = objectinputstream.readInt();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #17  <Method int ObjectInputStream.readInt()>
	//   11   21:putfield        #27  <Field int mNotificationDefaults>
		if(objectinputstream.readBoolean())
	//*  12   24:aload_1         
	//*  13   25:invokevirtual   #31  <Method boolean ObjectInputStream.readBoolean()>
	//*  14   28:ifeq            42
			mNotificationsound = (String)objectinputstream.readObject();
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #34  <Method Object ObjectInputStream.readObject()>
	//   18   36:checkcast       #36  <Class String>
	//   19   39:putfield        #40  <Field String mNotificationsound>
		int j = objectinputstream.readInt();
	//   20   42:aload_1         
	//   21   43:invokevirtual   #17  <Method int ObjectInputStream.readInt()>
	//   22   46:istore_3        
		mVibratePattern = new long[j];
	//   23   47:aload_0         
	//   24   48:iload_3         
	//   25   49:newarray        long[]
	//   26   51:putfield        #44  <Field long[] mVibratePattern>
		for(int i = 0; i < j; i++)
	//*  27   54:iconst_0        
	//*  28   55:istore_2        
	//*  29   56:iload_2         
	//*  30   57:iload_3         
	//*  31   58:icmpge          78
			mVibratePattern[i] = objectinputstream.readLong();
	//   32   61:aload_0         
	//   33   62:getfield        #44  <Field long[] mVibratePattern>
	//   34   65:iload_2         
	//   35   66:aload_1         
	//   36   67:invokevirtual   #48  <Method long ObjectInputStream.readLong()>
	//   37   70:lastore         

	//   38   71:iload_2         
	//   39   72:iconst_1        
	//   40   73:iadd            
	//   41   74:istore_2        
	//*  42   75:goto            56
		mNotificationTitle = (String)objectinputstream.readObject();
	//   43   78:aload_0         
	//   44   79:aload_1         
	//   45   80:invokevirtual   #34  <Method Object ObjectInputStream.readObject()>
	//   46   83:checkcast       #36  <Class String>
	//   47   86:putfield        #51  <Field String mNotificationTitle>
		mNotificationText = (String)objectinputstream.readObject();
	//   48   89:aload_0         
	//   49   90:aload_1         
	//   50   91:invokevirtual   #34  <Method Object ObjectInputStream.readObject()>
	//   51   94:checkcast       #36  <Class String>
	//   52   97:putfield        #54  <Field String mNotificationText>
	//   53  100:return          
	}

	private void writeObject(ObjectOutputStream objectoutputstream)
	{
		objectoutputstream.writeInt(mStatusbarIcon);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field int mStatusbarIcon>
	//    3    5:invokevirtual   #62  <Method void ObjectOutputStream.writeInt(int)>
		objectoutputstream.writeInt(mNotificationFlags);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field int mNotificationFlags>
	//    7   13:invokevirtual   #62  <Method void ObjectOutputStream.writeInt(int)>
		objectoutputstream.writeInt(mNotificationDefaults);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #27  <Field int mNotificationDefaults>
	//   11   21:invokevirtual   #62  <Method void ObjectOutputStream.writeInt(int)>
		String s = mNotificationsound;
	//   12   24:aload_0         
	//   13   25:getfield        #40  <Field String mNotificationsound>
	//   14   28:astore_3        
		int i = 0;
	//   15   29:iconst_0        
	//   16   30:istore_2        
		if(s != null)
	//*  17   31:aload_3         
	//*  18   32:ifnull          54
		{
			objectoutputstream.writeBoolean(true);
	//   19   35:aload_1         
	//   20   36:iconst_1        
	//   21   37:invokevirtual   #66  <Method void ObjectOutputStream.writeBoolean(boolean)>
			objectoutputstream.writeObject(((Object) (mNotificationsound.toString())));
	//   22   40:aload_1         
	//   23   41:aload_0         
	//   24   42:getfield        #40  <Field String mNotificationsound>
	//   25   45:invokevirtual   #70  <Method String String.toString()>
	//   26   48:invokevirtual   #73  <Method void ObjectOutputStream.writeObject(Object)>
		} else
	//*  27   51:goto            59
		{
			objectoutputstream.writeBoolean(false);
	//   28   54:aload_1         
	//   29   55:iconst_0        
	//   30   56:invokevirtual   #66  <Method void ObjectOutputStream.writeBoolean(boolean)>
		}
		if(mVibratePattern != null)
	//*  31   59:aload_0         
	//*  32   60:getfield        #44  <Field long[] mVibratePattern>
	//*  33   63:ifnull          101
		{
			objectoutputstream.writeInt(mVibratePattern.length);
	//   34   66:aload_1         
	//   35   67:aload_0         
	//   36   68:getfield        #44  <Field long[] mVibratePattern>
	//   37   71:arraylength     
	//   38   72:invokevirtual   #62  <Method void ObjectOutputStream.writeInt(int)>
			for(; i < mVibratePattern.length; i++)
	//*  39   75:iload_2         
	//*  40   76:aload_0         
	//*  41   77:getfield        #44  <Field long[] mVibratePattern>
	//*  42   80:arraylength     
	//*  43   81:icmpge          106
				objectoutputstream.writeLong(mVibratePattern[i]);
	//   44   84:aload_1         
	//   45   85:aload_0         
	//   46   86:getfield        #44  <Field long[] mVibratePattern>
	//   47   89:iload_2         
	//   48   90:laload          
	//   49   91:invokevirtual   #77  <Method void ObjectOutputStream.writeLong(long)>

	//   50   94:iload_2         
	//   51   95:iconst_1        
	//   52   96:iadd            
	//   53   97:istore_2        
		} else
	//*  54   98:goto            75
		{
			objectoutputstream.writeInt(0);
	//   55  101:aload_1         
	//   56  102:iconst_0        
	//   57  103:invokevirtual   #62  <Method void ObjectOutputStream.writeInt(int)>
		}
		objectoutputstream.writeObject(((Object) (mNotificationTitle)));
	//   58  106:aload_1         
	//   59  107:aload_0         
	//   60  108:getfield        #51  <Field String mNotificationTitle>
	//   61  111:invokevirtual   #73  <Method void ObjectOutputStream.writeObject(Object)>
		objectoutputstream.writeObject(((Object) (mNotificationText)));
	//   62  114:aload_1         
	//   63  115:aload_0         
	//   64  116:getfield        #54  <Field String mNotificationText>
	//   65  119:invokevirtual   #73  <Method void ObjectOutputStream.writeObject(Object)>
	//   66  122:return          
	}

	public Notification construct(Context context)
	{
		context = ((Context) (new android.app.Notification.Builder(context)));
	//    0    0:new             #84  <Class android.app.Notification$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #87  <Method void android.app.Notification$Builder(Context)>
	//    4    8:astore_1        
		if(mNotificationDefaults != 0)
	//*   5    9:aload_0         
	//*   6   10:getfield        #27  <Field int mNotificationDefaults>
	//*   7   13:ifeq            25
			((android.app.Notification.Builder) (context)).setDefaults(mNotificationDefaults);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #27  <Field int mNotificationDefaults>
	//   11   21:invokevirtual   #91  <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
	//   12   24:pop             
		if(mNotificationsound != null)
	//*  13   25:aload_0         
	//*  14   26:getfield        #40  <Field String mNotificationsound>
	//*  15   29:ifnull          44
			((android.app.Notification.Builder) (context)).setSound(Uri.parse(mNotificationsound));
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #40  <Field String mNotificationsound>
	//   19   37:invokestatic    #97  <Method Uri Uri.parse(String)>
	//   20   40:invokevirtual   #101 <Method android.app.Notification$Builder android.app.Notification$Builder.setSound(Uri)>
	//   21   43:pop             
		if(mVibratePattern != null)
	//*  22   44:aload_0         
	//*  23   45:getfield        #44  <Field long[] mVibratePattern>
	//*  24   48:ifnull          60
			((android.app.Notification.Builder) (context)).setVibrate(mVibratePattern);
	//   25   51:aload_1         
	//   26   52:aload_0         
	//   27   53:getfield        #44  <Field long[] mVibratePattern>
	//   28   56:invokevirtual   #105 <Method android.app.Notification$Builder android.app.Notification$Builder.setVibrate(long[])>
	//   29   59:pop             
		if(mStatusbarIcon != 0)
	//*  30   60:aload_0         
	//*  31   61:getfield        #21  <Field int mStatusbarIcon>
	//*  32   64:ifeq            76
			((android.app.Notification.Builder) (context)).setSmallIcon(mStatusbarIcon);
	//   33   67:aload_1         
	//   34   68:aload_0         
	//   35   69:getfield        #21  <Field int mStatusbarIcon>
	//   36   72:invokevirtual   #108 <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int)>
	//   37   75:pop             
		((android.app.Notification.Builder) (context)).setContentTitle(((CharSequence) (mNotificationTitle)));
	//   38   76:aload_1         
	//   39   77:aload_0         
	//   40   78:getfield        #51  <Field String mNotificationTitle>
	//   41   81:invokevirtual   #112 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//   42   84:pop             
		((android.app.Notification.Builder) (context)).setContentText(((CharSequence) (mNotificationText)));
	//   43   85:aload_1         
	//   44   86:aload_0         
	//   45   87:getfield        #54  <Field String mNotificationText>
	//   46   90:invokevirtual   #115 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//   47   93:pop             
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  48   94:getstatic       #120 <Field int android.os.Build$VERSION.SDK_INT>
	//*  49   97:bipush          16
	//*  50   99:icmplt          110
			context = ((Context) (((android.app.Notification.Builder) (context)).build()));
	//   51  102:aload_1         
	//   52  103:invokevirtual   #124 <Method Notification android.app.Notification$Builder.build()>
	//   53  106:astore_1        
		else
	//*  54  107:goto            115
			context = ((Context) (((android.app.Notification.Builder) (context)).getNotification()));
	//   55  110:aload_1         
	//   56  111:invokevirtual   #127 <Method Notification android.app.Notification$Builder.getNotification()>
	//   57  114:astore_1        
		if(mNotificationFlags != 0 && context != null)
	//*  58  115:aload_0         
	//*  59  116:getfield        #24  <Field int mNotificationFlags>
	//*  60  119:ifeq            134
	//*  61  122:aload_1         
	//*  62  123:ifnull          134
			context.flags = mNotificationFlags;
	//   63  126:aload_1         
	//   64  127:aload_0         
	//   65  128:getfield        #24  <Field int mNotificationFlags>
	//   66  131:putfield        #132 <Field int Notification.flags>
		return ((Notification) (context));
	//   67  134:aload_1         
	//   68  135:areturn         
	}
}
