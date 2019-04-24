// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice;

import android.app.Notification;
import android.content.Context;
import android.net.Uri;
import android.widget.RemoteViews;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// Referenced classes of package com.baidu.android.pushservice:
//			PushNotificationBuilder

public class CustomPushNotificationBuilder extends PushNotificationBuilder
{

	public CustomPushNotificationBuilder(int i, int j, int k, int l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void PushNotificationBuilder()>
		mLayoutId = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #17  <Field int mLayoutId>
		mLayoutIconId = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #19  <Field int mLayoutIconId>
		mLayoutTitleId = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #21  <Field int mLayoutTitleId>
		mLayoutTextId = l;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #23  <Field int mLayoutTextId>
	//   14   25:return          
	}

	private void readObject(ObjectInputStream objectinputstream)
	{
		mStatusbarIcon = objectinputstream.readInt();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #32  <Method int ObjectInputStream.readInt()>
	//    3    5:putfield        #35  <Field int mStatusbarIcon>
		mNotificationFlags = objectinputstream.readInt();
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #32  <Method int ObjectInputStream.readInt()>
	//    7   13:putfield        #38  <Field int mNotificationFlags>
		mNotificationDefaults = objectinputstream.readInt();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #32  <Method int ObjectInputStream.readInt()>
	//   11   21:putfield        #41  <Field int mNotificationDefaults>
		if(objectinputstream.readBoolean())
	//*  12   24:aload_1         
	//*  13   25:invokevirtual   #45  <Method boolean ObjectInputStream.readBoolean()>
	//*  14   28:ifeq            42
			mNotificationsound = (String)objectinputstream.readObject();
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #48  <Method Object ObjectInputStream.readObject()>
	//   18   36:checkcast       #50  <Class String>
	//   19   39:putfield        #54  <Field String mNotificationsound>
		int j = objectinputstream.readInt();
	//   20   42:aload_1         
	//   21   43:invokevirtual   #32  <Method int ObjectInputStream.readInt()>
	//   22   46:istore_3        
		mVibratePattern = new long[j];
	//   23   47:aload_0         
	//   24   48:iload_3         
	//   25   49:newarray        long[]
	//   26   51:putfield        #58  <Field long[] mVibratePattern>
		for(int i = 0; i < j; i++)
	//*  27   54:iconst_0        
	//*  28   55:istore_2        
	//*  29   56:iload_2         
	//*  30   57:iload_3         
	//*  31   58:icmpge          78
			mVibratePattern[i] = objectinputstream.readLong();
	//   32   61:aload_0         
	//   33   62:getfield        #58  <Field long[] mVibratePattern>
	//   34   65:iload_2         
	//   35   66:aload_1         
	//   36   67:invokevirtual   #62  <Method long ObjectInputStream.readLong()>
	//   37   70:lastore         

	//   38   71:iload_2         
	//   39   72:iconst_1        
	//   40   73:iadd            
	//   41   74:istore_2        
	//*  42   75:goto            56
		mNotificationTitle = (String)objectinputstream.readObject();
	//   43   78:aload_0         
	//   44   79:aload_1         
	//   45   80:invokevirtual   #48  <Method Object ObjectInputStream.readObject()>
	//   46   83:checkcast       #50  <Class String>
	//   47   86:putfield        #65  <Field String mNotificationTitle>
		mNotificationText = (String)objectinputstream.readObject();
	//   48   89:aload_0         
	//   49   90:aload_1         
	//   50   91:invokevirtual   #48  <Method Object ObjectInputStream.readObject()>
	//   51   94:checkcast       #50  <Class String>
	//   52   97:putfield        #68  <Field String mNotificationText>
		mLayoutId = objectinputstream.readInt();
	//   53  100:aload_0         
	//   54  101:aload_1         
	//   55  102:invokevirtual   #32  <Method int ObjectInputStream.readInt()>
	//   56  105:putfield        #17  <Field int mLayoutId>
		mLayoutIconId = objectinputstream.readInt();
	//   57  108:aload_0         
	//   58  109:aload_1         
	//   59  110:invokevirtual   #32  <Method int ObjectInputStream.readInt()>
	//   60  113:putfield        #19  <Field int mLayoutIconId>
		mLayoutTitleId = objectinputstream.readInt();
	//   61  116:aload_0         
	//   62  117:aload_1         
	//   63  118:invokevirtual   #32  <Method int ObjectInputStream.readInt()>
	//   64  121:putfield        #21  <Field int mLayoutTitleId>
		mLayoutTextId = objectinputstream.readInt();
	//   65  124:aload_0         
	//   66  125:aload_1         
	//   67  126:invokevirtual   #32  <Method int ObjectInputStream.readInt()>
	//   68  129:putfield        #23  <Field int mLayoutTextId>
		mLayoutIconDrawable = objectinputstream.readInt();
	//   69  132:aload_0         
	//   70  133:aload_1         
	//   71  134:invokevirtual   #32  <Method int ObjectInputStream.readInt()>
	//   72  137:putfield        #70  <Field int mLayoutIconDrawable>
	//   73  140:return          
	}

	private void writeObject(ObjectOutputStream objectoutputstream)
	{
		objectoutputstream.writeInt(mStatusbarIcon);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field int mStatusbarIcon>
	//    3    5:invokevirtual   #78  <Method void ObjectOutputStream.writeInt(int)>
		objectoutputstream.writeInt(mNotificationFlags);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #38  <Field int mNotificationFlags>
	//    7   13:invokevirtual   #78  <Method void ObjectOutputStream.writeInt(int)>
		objectoutputstream.writeInt(mNotificationDefaults);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #41  <Field int mNotificationDefaults>
	//   11   21:invokevirtual   #78  <Method void ObjectOutputStream.writeInt(int)>
		String s = mNotificationsound;
	//   12   24:aload_0         
	//   13   25:getfield        #54  <Field String mNotificationsound>
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
	//   21   37:invokevirtual   #82  <Method void ObjectOutputStream.writeBoolean(boolean)>
			objectoutputstream.writeObject(((Object) (mNotificationsound.toString())));
	//   22   40:aload_1         
	//   23   41:aload_0         
	//   24   42:getfield        #54  <Field String mNotificationsound>
	//   25   45:invokevirtual   #86  <Method String String.toString()>
	//   26   48:invokevirtual   #89  <Method void ObjectOutputStream.writeObject(Object)>
		} else
	//*  27   51:goto            59
		{
			objectoutputstream.writeBoolean(false);
	//   28   54:aload_1         
	//   29   55:iconst_0        
	//   30   56:invokevirtual   #82  <Method void ObjectOutputStream.writeBoolean(boolean)>
		}
		if(mVibratePattern != null)
	//*  31   59:aload_0         
	//*  32   60:getfield        #58  <Field long[] mVibratePattern>
	//*  33   63:ifnull          101
		{
			objectoutputstream.writeInt(mVibratePattern.length);
	//   34   66:aload_1         
	//   35   67:aload_0         
	//   36   68:getfield        #58  <Field long[] mVibratePattern>
	//   37   71:arraylength     
	//   38   72:invokevirtual   #78  <Method void ObjectOutputStream.writeInt(int)>
			for(; i < mVibratePattern.length; i++)
	//*  39   75:iload_2         
	//*  40   76:aload_0         
	//*  41   77:getfield        #58  <Field long[] mVibratePattern>
	//*  42   80:arraylength     
	//*  43   81:icmpge          106
				objectoutputstream.writeLong(mVibratePattern[i]);
	//   44   84:aload_1         
	//   45   85:aload_0         
	//   46   86:getfield        #58  <Field long[] mVibratePattern>
	//   47   89:iload_2         
	//   48   90:laload          
	//   49   91:invokevirtual   #93  <Method void ObjectOutputStream.writeLong(long)>

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
	//   57  103:invokevirtual   #78  <Method void ObjectOutputStream.writeInt(int)>
		}
		objectoutputstream.writeObject(((Object) (mNotificationTitle)));
	//   58  106:aload_1         
	//   59  107:aload_0         
	//   60  108:getfield        #65  <Field String mNotificationTitle>
	//   61  111:invokevirtual   #89  <Method void ObjectOutputStream.writeObject(Object)>
		objectoutputstream.writeObject(((Object) (mNotificationText)));
	//   62  114:aload_1         
	//   63  115:aload_0         
	//   64  116:getfield        #68  <Field String mNotificationText>
	//   65  119:invokevirtual   #89  <Method void ObjectOutputStream.writeObject(Object)>
		objectoutputstream.writeInt(mLayoutId);
	//   66  122:aload_1         
	//   67  123:aload_0         
	//   68  124:getfield        #17  <Field int mLayoutId>
	//   69  127:invokevirtual   #78  <Method void ObjectOutputStream.writeInt(int)>
		objectoutputstream.writeInt(mLayoutIconId);
	//   70  130:aload_1         
	//   71  131:aload_0         
	//   72  132:getfield        #19  <Field int mLayoutIconId>
	//   73  135:invokevirtual   #78  <Method void ObjectOutputStream.writeInt(int)>
		objectoutputstream.writeInt(mLayoutTitleId);
	//   74  138:aload_1         
	//   75  139:aload_0         
	//   76  140:getfield        #21  <Field int mLayoutTitleId>
	//   77  143:invokevirtual   #78  <Method void ObjectOutputStream.writeInt(int)>
		objectoutputstream.writeInt(mLayoutTextId);
	//   78  146:aload_1         
	//   79  147:aload_0         
	//   80  148:getfield        #23  <Field int mLayoutTextId>
	//   81  151:invokevirtual   #78  <Method void ObjectOutputStream.writeInt(int)>
		objectoutputstream.writeInt(mLayoutIconDrawable);
	//   82  154:aload_1         
	//   83  155:aload_0         
	//   84  156:getfield        #70  <Field int mLayoutIconDrawable>
	//   85  159:invokevirtual   #78  <Method void ObjectOutputStream.writeInt(int)>
	//   86  162:return          
	}

	public Notification construct(Context context)
	{
		android.app.Notification.Builder builder = new android.app.Notification.Builder(context);
	//    0    0:new             #97  <Class android.app.Notification$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #100 <Method void android.app.Notification$Builder(Context)>
	//    4    8:astore_2        
		if(mNotificationDefaults != 0)
	//*   5    9:aload_0         
	//*   6   10:getfield        #41  <Field int mNotificationDefaults>
	//*   7   13:ifeq            25
			builder.setDefaults(mNotificationDefaults);
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:getfield        #41  <Field int mNotificationDefaults>
	//   11   21:invokevirtual   #104 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
	//   12   24:pop             
		if(mNotificationsound != null)
	//*  13   25:aload_0         
	//*  14   26:getfield        #54  <Field String mNotificationsound>
	//*  15   29:ifnull          44
			builder.setSound(Uri.parse(mNotificationsound));
	//   16   32:aload_2         
	//   17   33:aload_0         
	//   18   34:getfield        #54  <Field String mNotificationsound>
	//   19   37:invokestatic    #110 <Method Uri Uri.parse(String)>
	//   20   40:invokevirtual   #114 <Method android.app.Notification$Builder android.app.Notification$Builder.setSound(Uri)>
	//   21   43:pop             
		if(mVibratePattern != null)
	//*  22   44:aload_0         
	//*  23   45:getfield        #58  <Field long[] mVibratePattern>
	//*  24   48:ifnull          60
			builder.setVibrate(mVibratePattern);
	//   25   51:aload_2         
	//   26   52:aload_0         
	//   27   53:getfield        #58  <Field long[] mVibratePattern>
	//   28   56:invokevirtual   #118 <Method android.app.Notification$Builder android.app.Notification$Builder.setVibrate(long[])>
	//   29   59:pop             
		if(mStatusbarIcon != 0)
	//*  30   60:aload_0         
	//*  31   61:getfield        #35  <Field int mStatusbarIcon>
	//*  32   64:ifeq            76
			builder.setSmallIcon(mStatusbarIcon);
	//   33   67:aload_2         
	//   34   68:aload_0         
	//   35   69:getfield        #35  <Field int mStatusbarIcon>
	//   36   72:invokevirtual   #121 <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int)>
	//   37   75:pop             
		if(mLayoutId != 0)
	//*  38   76:aload_0         
	//*  39   77:getfield        #17  <Field int mLayoutId>
	//*  40   80:ifeq            165
		{
			context = ((Context) (new RemoteViews(context.getPackageName(), mLayoutId)));
	//   41   83:new             #123 <Class RemoteViews>
	//   42   86:dup             
	//   43   87:aload_1         
	//   44   88:invokevirtual   #128 <Method String Context.getPackageName()>
	//   45   91:aload_0         
	//   46   92:getfield        #17  <Field int mLayoutId>
	//   47   95:invokespecial   #131 <Method void RemoteViews(String, int)>
	//   48   98:astore_1        
			if(mLayoutIconDrawable != 0)
	//*  49   99:aload_0         
	//*  50  100:getfield        #70  <Field int mLayoutIconDrawable>
	//*  51  103:ifeq            118
				((RemoteViews) (context)).setImageViewResource(mLayoutIconId, mLayoutIconDrawable);
	//   52  106:aload_1         
	//   53  107:aload_0         
	//   54  108:getfield        #19  <Field int mLayoutIconId>
	//   55  111:aload_0         
	//   56  112:getfield        #70  <Field int mLayoutIconDrawable>
	//   57  115:invokevirtual   #135 <Method void RemoteViews.setImageViewResource(int, int)>
			if(mNotificationTitle != null)
	//*  58  118:aload_0         
	//*  59  119:getfield        #65  <Field String mNotificationTitle>
	//*  60  122:ifnull          137
				((RemoteViews) (context)).setTextViewText(mLayoutTitleId, ((CharSequence) (mNotificationTitle)));
	//   61  125:aload_1         
	//   62  126:aload_0         
	//   63  127:getfield        #21  <Field int mLayoutTitleId>
	//   64  130:aload_0         
	//   65  131:getfield        #65  <Field String mNotificationTitle>
	//   66  134:invokevirtual   #139 <Method void RemoteViews.setTextViewText(int, CharSequence)>
			if(mNotificationText != null)
	//*  67  137:aload_0         
	//*  68  138:getfield        #68  <Field String mNotificationText>
	//*  69  141:ifnull          156
				((RemoteViews) (context)).setTextViewText(mLayoutTextId, ((CharSequence) (mNotificationText)));
	//   70  144:aload_1         
	//   71  145:aload_0         
	//   72  146:getfield        #23  <Field int mLayoutTextId>
	//   73  149:aload_0         
	//   74  150:getfield        #68  <Field String mNotificationText>
	//   75  153:invokevirtual   #139 <Method void RemoteViews.setTextViewText(int, CharSequence)>
			builder.setContent(((RemoteViews) (context)));
	//   76  156:aload_2         
	//   77  157:aload_1         
	//   78  158:invokevirtual   #143 <Method android.app.Notification$Builder android.app.Notification$Builder.setContent(RemoteViews)>
	//   79  161:pop             
		} else
	//*  80  162:goto            183
		{
			builder.setContentTitle(((CharSequence) (mNotificationTitle)));
	//   81  165:aload_2         
	//   82  166:aload_0         
	//   83  167:getfield        #65  <Field String mNotificationTitle>
	//   84  170:invokevirtual   #147 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//   85  173:pop             
			builder.setContentText(((CharSequence) (mNotificationText)));
	//   86  174:aload_2         
	//   87  175:aload_0         
	//   88  176:getfield        #68  <Field String mNotificationText>
	//   89  179:invokevirtual   #150 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//   90  182:pop             
		}
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  91  183:getstatic       #155 <Field int android.os.Build$VERSION.SDK_INT>
	//*  92  186:bipush          16
	//*  93  188:icmplt          199
			context = ((Context) (builder.build()));
	//   94  191:aload_2         
	//   95  192:invokevirtual   #159 <Method Notification android.app.Notification$Builder.build()>
	//   96  195:astore_1        
		else
	//*  97  196:goto            204
			context = ((Context) (builder.getNotification()));
	//   98  199:aload_2         
	//   99  200:invokevirtual   #162 <Method Notification android.app.Notification$Builder.getNotification()>
	//  100  203:astore_1        
		if(mNotificationFlags != 0 && context != null)
	//* 101  204:aload_0         
	//* 102  205:getfield        #38  <Field int mNotificationFlags>
	//* 103  208:ifeq            223
	//* 104  211:aload_1         
	//* 105  212:ifnull          223
			context.flags = mNotificationFlags;
	//  106  215:aload_1         
	//  107  216:aload_0         
	//  108  217:getfield        #38  <Field int mNotificationFlags>
	//  109  220:putfield        #167 <Field int Notification.flags>
		return ((Notification) (context));
	//  110  223:aload_1         
	//  111  224:areturn         
	}

	public void setLayoutDrawable(int i)
	{
		mLayoutIconDrawable = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #70  <Field int mLayoutIconDrawable>
	//    3    5:return          
	}

	private int mLayoutIconDrawable;
	private int mLayoutIconId;
	private int mLayoutId;
	private int mLayoutTextId;
	private int mLayoutTitleId;
}
