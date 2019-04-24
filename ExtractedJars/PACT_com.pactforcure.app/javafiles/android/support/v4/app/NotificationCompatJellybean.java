// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.lang.reflect.Field;
import java.util.*;

// Referenced classes of package android.support.v4.app:
//			NotificationBuilderWithBuilderAccessor, BundleUtil, RemoteInputCompatJellybean, NotificationBuilderWithActions

class NotificationCompatJellybean
{
	public static class Builder
		implements NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions
	{

		public void addAction(NotificationCompatBase.Action action)
		{
			mActionExtrasList.add(((Object) (NotificationCompatJellybean.writeActionAndGetExtras(b, action))));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field List mActionExtrasList>
		//    2    4:aload_0         
		//    3    5:getfield        #171 <Field android.app.Notification$Builder b>
		//    4    8:aload_1         
		//    5    9:invokestatic    #209 <Method Bundle NotificationCompatJellybean.writeActionAndGetExtras(android.app.Notification$Builder, NotificationCompatBase$Action)>
		//    6   12:invokeinterface #215 <Method boolean List.add(Object)>
		//    7   17:pop             
		//    8   18:return          
		}

		public Notification build()
		{
			Notification notification = b.build();
		//    0    0:aload_0         
		//    1    1:getfield        #171 <Field android.app.Notification$Builder b>
		//    2    4:invokevirtual   #219 <Method Notification android.app.Notification$Builder.build()>
		//    3    7:astore_1        
			Object obj = ((Object) (NotificationCompatJellybean.getExtras(notification)));
		//    4    8:aload_1         
		//    5    9:invokestatic    #223 <Method Bundle NotificationCompatJellybean.getExtras(Notification)>
		//    6   12:astore_2        
			Bundle bundle = new Bundle(mExtras);
		//    7   13:new             #173 <Class Bundle>
		//    8   16:dup             
		//    9   17:aload_0         
		//   10   18:getfield        #176 <Field Bundle mExtras>
		//   11   21:invokespecial   #225 <Method void Bundle(Bundle)>
		//   12   24:astore_3        
			Iterator iterator = mExtras.keySet().iterator();
		//   13   25:aload_0         
		//   14   26:getfield        #176 <Field Bundle mExtras>
		//   15   29:invokevirtual   #229 <Method Set Bundle.keySet()>
		//   16   32:invokeinterface #235 <Method Iterator Set.iterator()>
		//   17   37:astore          4
			do
			{
				if(!iterator.hasNext())
					break;
		//   18   39:aload           4
		//   19   41:invokeinterface #241 <Method boolean Iterator.hasNext()>
		//   20   46:ifeq            79
				String s = (String)iterator.next();
		//   21   49:aload           4
		//   22   51:invokeinterface #245 <Method Object Iterator.next()>
		//   23   56:checkcast       #247 <Class String>
		//   24   59:astore          5
				if(((Bundle) (obj)).containsKey(s))
		//*  25   61:aload_2         
		//*  26   62:aload           5
		//*  27   64:invokevirtual   #251 <Method boolean Bundle.containsKey(String)>
		//*  28   67:ifeq            39
					bundle.remove(s);
		//   29   70:aload_3         
		//   30   71:aload           5
		//   31   73:invokevirtual   #255 <Method void Bundle.remove(String)>
			} while(true);
		//   32   76:goto            39
			((Bundle) (obj)).putAll(bundle);
		//   33   79:aload_2         
		//   34   80:aload_3         
		//   35   81:invokevirtual   #180 <Method void Bundle.putAll(Bundle)>
			obj = ((Object) (NotificationCompatJellybean.buildActionExtrasMap(mActionExtrasList)));
		//   36   84:aload_0         
		//   37   85:getfield        #31  <Field List mActionExtrasList>
		//   38   88:invokestatic    #259 <Method SparseArray NotificationCompatJellybean.buildActionExtrasMap(List)>
		//   39   91:astore_2        
			if(obj != null)
		//*  40   92:aload_2         
		//*  41   93:ifnull          107
				NotificationCompatJellybean.getExtras(notification).putSparseParcelableArray("android.support.actionExtras", ((SparseArray) (obj)));
		//   42   96:aload_1         
		//   43   97:invokestatic    #223 <Method Bundle NotificationCompatJellybean.getExtras(Notification)>
		//   44  100:ldc2            #261 <String "android.support.actionExtras">
		//   45  103:aload_2         
		//   46  104:invokevirtual   #265 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
			if(mContentView != null)
		//*  47  107:aload_0         
		//*  48  108:getfield        #198 <Field RemoteViews mContentView>
		//*  49  111:ifnull          122
				notification.contentView = mContentView;
		//   50  114:aload_1         
		//   51  115:aload_0         
		//   52  116:getfield        #198 <Field RemoteViews mContentView>
		//   53  119:putfield        #60  <Field RemoteViews Notification.contentView>
			if(mBigContentView != null)
		//*  54  122:aload_0         
		//*  55  123:getfield        #200 <Field RemoteViews mBigContentView>
		//*  56  126:ifnull          137
				notification.bigContentView = mBigContentView;
		//   57  129:aload_1         
		//   58  130:aload_0         
		//   59  131:getfield        #200 <Field RemoteViews mBigContentView>
		//   60  134:putfield        #268 <Field RemoteViews Notification.bigContentView>
			return notification;
		//   61  137:aload_1         
		//   62  138:areturn         
		}

		public android.app.Notification.Builder getBuilder()
		{
			return b;
		//    0    0:aload_0         
		//    1    1:getfield        #171 <Field android.app.Notification$Builder b>
		//    2    4:areturn         
		}

		private android.app.Notification.Builder b;
		private List mActionExtrasList;
		private RemoteViews mBigContentView;
		private RemoteViews mContentView;
		private final Bundle mExtras = new Bundle();

		public Builder(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
				PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
				int l, CharSequence charsequence3, boolean flag2, Bundle bundle, String s, boolean flag3, String s1, 
				RemoteViews remoteviews1, RemoteViews remoteviews2)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			mActionExtrasList = ((List) (new ArrayList()));
		//    2    4:aload_0         
		//    3    5:new             #28  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #29  <Method void ArrayList()>
		//    6   12:putfield        #31  <Field List mActionExtrasList>
			context = ((Context) ((new android.app.Notification.Builder(context)).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS)));
		//    7   15:new             #33  <Class android.app.Notification$Builder>
		//    8   18:dup             
		//    9   19:aload_1         
		//   10   20:invokespecial   #36  <Method void android.app.Notification$Builder(Context)>
		//   11   23:aload_2         
		//   12   24:getfield        #42  <Field long Notification.when>
		//   13   27:invokevirtual   #46  <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
		//   14   30:aload_2         
		//   15   31:getfield        #50  <Field int Notification.icon>
		//   16   34:aload_2         
		//   17   35:getfield        #53  <Field int Notification.iconLevel>
		//   18   38:invokevirtual   #57  <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int, int)>
		//   19   41:aload_2         
		//   20   42:getfield        #60  <Field RemoteViews Notification.contentView>
		//   21   45:invokevirtual   #64  <Method android.app.Notification$Builder android.app.Notification$Builder.setContent(RemoteViews)>
		//   22   48:aload_2         
		//   23   49:getfield        #68  <Field CharSequence Notification.tickerText>
		//   24   52:aload           6
		//   25   54:invokevirtual   #72  <Method android.app.Notification$Builder android.app.Notification$Builder.setTicker(CharSequence, RemoteViews)>
		//   26   57:aload_2         
		//   27   58:getfield        #76  <Field android.net.Uri Notification.sound>
		//   28   61:aload_2         
		//   29   62:getfield        #79  <Field int Notification.audioStreamType>
		//   30   65:invokevirtual   #83  <Method android.app.Notification$Builder android.app.Notification$Builder.setSound(android.net.Uri, int)>
		//   31   68:aload_2         
		//   32   69:getfield        #87  <Field long[] Notification.vibrate>
		//   33   72:invokevirtual   #91  <Method android.app.Notification$Builder android.app.Notification$Builder.setVibrate(long[])>
		//   34   75:aload_2         
		//   35   76:getfield        #94  <Field int Notification.ledARGB>
		//   36   79:aload_2         
		//   37   80:getfield        #97  <Field int Notification.ledOnMS>
		//   38   83:aload_2         
		//   39   84:getfield        #100 <Field int Notification.ledOffMS>
		//   40   87:invokevirtual   #104 <Method android.app.Notification$Builder android.app.Notification$Builder.setLights(int, int, int)>
		//   41   90:astore_1        
			boolean flag4;
			if((notification.flags & 2) != 0)
		//*  42   91:aload_2         
		//*  43   92:getfield        #107 <Field int Notification.flags>
		//*  44   95:iconst_2        
		//*  45   96:iand            
		//*  46   97:ifeq            343
				flag4 = true;
		//   47  100:iconst_1        
		//   48  101:istore          24
			else
		//*  49  103:aload_1         
		//*  50  104:iload           24
		//*  51  106:invokevirtual   #111 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
		//*  52  109:astore_1        
		//*  53  110:aload_2         
		//*  54  111:getfield        #107 <Field int Notification.flags>
		//*  55  114:bipush          8
		//*  56  116:iand            
		//*  57  117:ifeq            349
		//*  58  120:iconst_1        
		//*  59  121:istore          24
		//*  60  123:aload_1         
		//*  61  124:iload           24
		//*  62  126:invokevirtual   #114 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
		//*  63  129:astore_1        
		//*  64  130:aload_2         
		//*  65  131:getfield        #107 <Field int Notification.flags>
		//*  66  134:bipush          16
		//*  67  136:iand            
		//*  68  137:ifeq            355
		//*  69  140:iconst_1        
		//*  70  141:istore          24
		//*  71  143:aload_1         
		//*  72  144:iload           24
		//*  73  146:invokevirtual   #117 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
		//*  74  149:aload_2         
		//*  75  150:getfield        #120 <Field int Notification.defaults>
		//*  76  153:invokevirtual   #124 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
		//*  77  156:aload_3         
		//*  78  157:invokevirtual   #128 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
		//*  79  160:aload           4
		//*  80  162:invokevirtual   #131 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
		//*  81  165:aload           16
		//*  82  167:invokevirtual   #134 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
		//*  83  170:aload           5
		//*  84  172:invokevirtual   #137 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
		//*  85  175:aload           8
		//*  86  177:invokevirtual   #141 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
		//*  87  180:aload_2         
		//*  88  181:getfield        #145 <Field PendingIntent Notification.deleteIntent>
		//*  89  184:invokevirtual   #148 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
		//*  90  187:astore_1        
		//*  91  188:aload_2         
		//*  92  189:getfield        #107 <Field int Notification.flags>
		//*  93  192:sipush          128
		//*  94  195:iand            
		//*  95  196:ifeq            361
		//*  96  199:iconst_1        
		//*  97  200:istore          24
		//*  98  202:aload_0         
		//*  99  203:aload_1         
		//* 100  204:aload           9
		//* 101  206:iload           24
		//* 102  208:invokevirtual   #152 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
		//* 103  211:aload           10
		//* 104  213:invokevirtual   #156 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
		//* 105  216:iload           7
		//* 106  218:invokevirtual   #159 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
		//* 107  221:iload           14
		//* 108  223:invokevirtual   #162 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
		//* 109  226:iload           15
		//* 110  228:invokevirtual   #165 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
		//* 111  231:iload           11
		//* 112  233:iload           12
		//* 113  235:iload           13
		//* 114  237:invokevirtual   #169 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
		//* 115  240:putfield        #171 <Field android.app.Notification$Builder b>
		//* 116  243:aload_0         
		//* 117  244:new             #173 <Class Bundle>
		//* 118  247:dup             
		//* 119  248:invokespecial   #174 <Method void Bundle()>
		//* 120  251:putfield        #176 <Field Bundle mExtras>
		//* 121  254:aload           18
		//* 122  256:ifnull          268
		//* 123  259:aload_0         
		//* 124  260:getfield        #176 <Field Bundle mExtras>
		//* 125  263:aload           18
		//* 126  265:invokevirtual   #180 <Method void Bundle.putAll(Bundle)>
		//* 127  268:iload           17
		//* 128  270:ifeq            283
		//* 129  273:aload_0         
		//* 130  274:getfield        #176 <Field Bundle mExtras>
		//* 131  277:ldc1            #182 <String "android.support.localOnly">
		//* 132  279:iconst_1        
		//* 133  280:invokevirtual   #186 <Method void Bundle.putBoolean(String, boolean)>
		//* 134  283:aload           19
		//* 135  285:ifnull          314
		//* 136  288:aload_0         
		//* 137  289:getfield        #176 <Field Bundle mExtras>
		//* 138  292:ldc1            #188 <String "android.support.groupKey">
		//* 139  294:aload           19
		//* 140  296:invokevirtual   #192 <Method void Bundle.putString(String, String)>
		//* 141  299:iload           20
		//* 142  301:ifeq            367
		//* 143  304:aload_0         
		//* 144  305:getfield        #176 <Field Bundle mExtras>
		//* 145  308:ldc1            #194 <String "android.support.isGroupSummary">
		//* 146  310:iconst_1        
		//* 147  311:invokevirtual   #186 <Method void Bundle.putBoolean(String, boolean)>
		//* 148  314:aload           21
		//* 149  316:ifnull          330
		//* 150  319:aload_0         
		//* 151  320:getfield        #176 <Field Bundle mExtras>
		//* 152  323:ldc1            #196 <String "android.support.sortKey">
		//* 153  325:aload           21
		//* 154  327:invokevirtual   #192 <Method void Bundle.putString(String, String)>
		//* 155  330:aload_0         
		//* 156  331:aload           22
		//* 157  333:putfield        #198 <Field RemoteViews mContentView>
		//* 158  336:aload_0         
		//* 159  337:aload           23
		//* 160  339:putfield        #200 <Field RemoteViews mBigContentView>
		//* 161  342:return          
				flag4 = false;
		//  162  343:iconst_0        
		//  163  344:istore          24
			context = ((Context) (((android.app.Notification.Builder) (context)).setOngoing(flag4)));
			if((notification.flags & 8) != 0)
				flag4 = true;
			else
		//* 164  346:goto            103
				flag4 = false;
		//  165  349:iconst_0        
		//  166  350:istore          24
			context = ((Context) (((android.app.Notification.Builder) (context)).setOnlyAlertOnce(flag4)));
			if((notification.flags & 0x10) != 0)
				flag4 = true;
			else
		//* 167  352:goto            123
				flag4 = false;
		//  168  355:iconst_0        
		//  169  356:istore          24
			context = ((Context) (((android.app.Notification.Builder) (context)).setAutoCancel(flag4).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setSubText(charsequence3).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent)));
			if((notification.flags & 0x80) != 0)
				flag4 = true;
			else
		//* 170  358:goto            143
				flag4 = false;
		//  171  361:iconst_0        
		//  172  362:istore          24
			b = ((android.app.Notification.Builder) (context)).setFullScreenIntent(pendingintent1, flag4).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag1).setPriority(l).setProgress(j, k, flag);
			if(bundle != null)
				mExtras.putAll(bundle);
			if(flag2)
				mExtras.putBoolean("android.support.localOnly", true);
			if(s != null)
			{
				mExtras.putString("android.support.groupKey", s);
				if(flag3)
					mExtras.putBoolean("android.support.isGroupSummary", true);
				else
		//* 173  364:goto            202
					mExtras.putBoolean("android.support.useSideChannel", true);
		//  174  367:aload_0         
		//  175  368:getfield        #176 <Field Bundle mExtras>
		//  176  371:ldc1            #202 <String "android.support.useSideChannel">
		//  177  373:iconst_1        
		//  178  374:invokevirtual   #186 <Method void Bundle.putBoolean(String, boolean)>
			}
			if(s1 != null)
				mExtras.putString("android.support.sortKey", s1);
			mContentView = remoteviews1;
			mBigContentView = remoteviews2;
		//* 179  377:goto            314
		}
	}


	NotificationCompatJellybean()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void Object()>
	//    2    4:return          
	}

	public static void addBigPictureStyle(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, CharSequence charsequence, boolean flag, CharSequence charsequence1, Bitmap bitmap, Bitmap bitmap1, boolean flag1)
	{
		notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) ((new android.app.Notification.BigPictureStyle(notificationbuilderwithbuilderaccessor.getBuilder())).setBigContentTitle(charsequence).bigPicture(bitmap)));
	//    0    0:new             #67  <Class android.app.Notification$BigPictureStyle>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #73  <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//    4   10:invokespecial   #76  <Method void android.app.Notification$BigPictureStyle(android.app.Notification$Builder)>
	//    5   13:aload_1         
	//    6   14:invokevirtual   #80  <Method android.app.Notification$BigPictureStyle android.app.Notification$BigPictureStyle.setBigContentTitle(CharSequence)>
	//    7   17:aload           4
	//    8   19:invokevirtual   #84  <Method android.app.Notification$BigPictureStyle android.app.Notification$BigPictureStyle.bigPicture(Bitmap)>
	//    9   22:astore_0        
		if(flag1)
	//*  10   23:iload           6
	//*  11   25:ifeq            35
			((android.app.Notification.BigPictureStyle) (notificationbuilderwithbuilderaccessor)).bigLargeIcon(bitmap1);
	//   12   28:aload_0         
	//   13   29:aload           5
	//   14   31:invokevirtual   #87  <Method android.app.Notification$BigPictureStyle android.app.Notification$BigPictureStyle.bigLargeIcon(Bitmap)>
	//   15   34:pop             
		if(flag)
	//*  16   35:iload_2         
	//*  17   36:ifeq            45
			((android.app.Notification.BigPictureStyle) (notificationbuilderwithbuilderaccessor)).setSummaryText(charsequence1);
	//   18   39:aload_0         
	//   19   40:aload_3         
	//   20   41:invokevirtual   #90  <Method android.app.Notification$BigPictureStyle android.app.Notification$BigPictureStyle.setSummaryText(CharSequence)>
	//   21   44:pop             
	//   22   45:return          
	}

	public static void addBigTextStyle(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, CharSequence charsequence, boolean flag, CharSequence charsequence1, CharSequence charsequence2)
	{
		notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) ((new android.app.Notification.BigTextStyle(notificationbuilderwithbuilderaccessor.getBuilder())).setBigContentTitle(charsequence).bigText(charsequence2)));
	//    0    0:new             #94  <Class android.app.Notification$BigTextStyle>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #73  <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//    4   10:invokespecial   #95  <Method void android.app.Notification$BigTextStyle(android.app.Notification$Builder)>
	//    5   13:aload_1         
	//    6   14:invokevirtual   #98  <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.setBigContentTitle(CharSequence)>
	//    7   17:aload           4
	//    8   19:invokevirtual   #101 <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.bigText(CharSequence)>
	//    9   22:astore_0        
		if(flag)
	//*  10   23:iload_2         
	//*  11   24:ifeq            33
			((android.app.Notification.BigTextStyle) (notificationbuilderwithbuilderaccessor)).setSummaryText(charsequence1);
	//   12   27:aload_0         
	//   13   28:aload_3         
	//   14   29:invokevirtual   #103 <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.setSummaryText(CharSequence)>
	//   15   32:pop             
	//   16   33:return          
	}

	public static void addInboxStyle(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, CharSequence charsequence, boolean flag, CharSequence charsequence1, ArrayList arraylist)
	{
		notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) ((new android.app.Notification.InboxStyle(notificationbuilderwithbuilderaccessor.getBuilder())).setBigContentTitle(charsequence)));
	//    0    0:new             #107 <Class android.app.Notification$InboxStyle>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #73  <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//    4   10:invokespecial   #108 <Method void android.app.Notification$InboxStyle(android.app.Notification$Builder)>
	//    5   13:aload_1         
	//    6   14:invokevirtual   #111 <Method android.app.Notification$InboxStyle android.app.Notification$InboxStyle.setBigContentTitle(CharSequence)>
	//    7   17:astore_0        
		if(flag)
	//*   8   18:iload_2         
	//*   9   19:ifeq            28
			((android.app.Notification.InboxStyle) (notificationbuilderwithbuilderaccessor)).setSummaryText(charsequence1);
	//   10   22:aload_0         
	//   11   23:aload_3         
	//   12   24:invokevirtual   #113 <Method android.app.Notification$InboxStyle android.app.Notification$InboxStyle.setSummaryText(CharSequence)>
	//   13   27:pop             
		for(charsequence = ((CharSequence) (arraylist.iterator())); ((Iterator) (charsequence)).hasNext(); ((android.app.Notification.InboxStyle) (notificationbuilderwithbuilderaccessor)).addLine((CharSequence)((Iterator) (charsequence)).next()));
	//   14   28:aload           4
	//   15   30:invokevirtual   #119 <Method Iterator ArrayList.iterator()>
	//   16   33:astore_1        
	//   17   34:aload_1         
	//   18   35:invokeinterface #125 <Method boolean Iterator.hasNext()>
	//   19   40:ifeq            60
	//   20   43:aload_0         
	//   21   44:aload_1         
	//   22   45:invokeinterface #129 <Method Object Iterator.next()>
	//   23   50:checkcast       #131 <Class CharSequence>
	//   24   53:invokevirtual   #134 <Method android.app.Notification$InboxStyle android.app.Notification$InboxStyle.addLine(CharSequence)>
	//   25   56:pop             
	//*  26   57:goto            34
	//   27   60:return          
	}

	public static SparseArray buildActionExtrasMap(List list)
	{
		SparseArray sparsearray = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		int i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_1        
		for(int j = list.size(); i < j;)
	//*   4    4:aload_0         
	//*   5    5:invokeinterface #144 <Method int List.size()>
	//*   6   10:istore_2        
	//*   7   11:iload_1         
	//*   8   12:iload_2         
	//*   9   13:icmpge          70
		{
			Bundle bundle = (Bundle)list.get(i);
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:invokeinterface #148 <Method Object List.get(int)>
	//   13   23:checkcast       #150 <Class Bundle>
	//   14   26:astore          5
			SparseArray sparsearray1 = sparsearray;
	//   15   28:aload_3         
	//   16   29:astore          4
			if(bundle != null)
	//*  17   31:aload           5
	//*  18   33:ifnull          60
			{
				sparsearray1 = sparsearray;
	//   19   36:aload_3         
	//   20   37:astore          4
				if(sparsearray == null)
	//*  21   39:aload_3         
	//*  22   40:ifnonnull       52
					sparsearray1 = new SparseArray();
	//   23   43:new             #152 <Class SparseArray>
	//   24   46:dup             
	//   25   47:invokespecial   #153 <Method void SparseArray()>
	//   26   50:astore          4
				sparsearray1.put(i, ((Object) (bundle)));
	//   27   52:aload           4
	//   28   54:iload_1         
	//   29   55:aload           5
	//   30   57:invokevirtual   #157 <Method void SparseArray.put(int, Object)>
			}
			i++;
	//   31   60:iload_1         
	//   32   61:iconst_1        
	//   33   62:iadd            
	//   34   63:istore_1        
			sparsearray = sparsearray1;
	//   35   64:aload           4
	//   36   66:astore_3        
		}

	//*  37   67:goto            11
		return sparsearray;
	//   38   70:aload_3         
	//   39   71:areturn         
	}

	private static boolean ensureActionReflectionReadyLocked()
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_0        
		if(sActionsAccessFailed)
	//*   2    2:getstatic       #165 <Field boolean sActionsAccessFailed>
	//*   3    5:ifeq            10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		try
		{
			if(sActionsField == null)
	//*   6   10:getstatic       #167 <Field Field sActionsField>
	//*   7   13:ifnonnull       74
			{
				sActionClass = Class.forName("android.app.Notification$Action");
	//    8   16:ldc1            #169 <String "android.app.Notification$Action">
	//    9   18:invokestatic    #175 <Method Class Class.forName(String)>
	//   10   21:putstatic       #177 <Field Class sActionClass>
				sActionIconField = sActionClass.getDeclaredField("icon");
	//   11   24:getstatic       #177 <Field Class sActionClass>
	//   12   27:ldc1            #29  <String "icon">
	//   13   29:invokevirtual   #181 <Method Field Class.getDeclaredField(String)>
	//   14   32:putstatic       #183 <Field Field sActionIconField>
				sActionTitleField = sActionClass.getDeclaredField("title");
	//   15   35:getstatic       #177 <Field Class sActionClass>
	//   16   38:ldc1            #35  <String "title">
	//   17   40:invokevirtual   #181 <Method Field Class.getDeclaredField(String)>
	//   18   43:putstatic       #185 <Field Field sActionTitleField>
				sActionIntentField = sActionClass.getDeclaredField("actionIntent");
	//   19   46:getstatic       #177 <Field Class sActionClass>
	//   20   49:ldc1            #20  <String "actionIntent">
	//   21   51:invokevirtual   #181 <Method Field Class.getDeclaredField(String)>
	//   22   54:putstatic       #187 <Field Field sActionIntentField>
				sActionsField = ((Class) (android/app/Notification)).getDeclaredField("actions");
	//   23   57:ldc1            #189 <Class Notification>
	//   24   59:ldc1            #191 <String "actions">
	//   25   61:invokevirtual   #181 <Method Field Class.getDeclaredField(String)>
	//   26   64:putstatic       #167 <Field Field sActionsField>
				sActionsField.setAccessible(true);
	//   27   67:getstatic       #167 <Field Field sActionsField>
	//   28   70:iconst_1        
	//   29   71:invokevirtual   #197 <Method void Field.setAccessible(boolean)>
			}
		}
	//*  30   74:getstatic       #165 <Field boolean sActionsAccessFailed>
	//*  31   77:ifne            116
	//*  32   80:iload_0         
	//*  33   81:ireturn         
		catch(ClassNotFoundException classnotfoundexception)
	//*  34   82:astore_1        
		{
			Log.e("NotificationCompat", "Unable to access notification actions", ((Throwable) (classnotfoundexception)));
	//   35   83:ldc1            #38  <String "NotificationCompat">
	//   36   85:ldc1            #199 <String "Unable to access notification actions">
	//   37   87:aload_1         
	//   38   88:invokestatic    #205 <Method int Log.e(String, String, Throwable)>
	//   39   91:pop             
			sActionsAccessFailed = true;
	//   40   92:iconst_1        
	//   41   93:putstatic       #165 <Field boolean sActionsAccessFailed>
		}
	//*  42   96:goto            74
		catch(NoSuchFieldException nosuchfieldexception)
	//*  43   99:astore_1        
		{
			Log.e("NotificationCompat", "Unable to access notification actions", ((Throwable) (nosuchfieldexception)));
	//   44  100:ldc1            #38  <String "NotificationCompat">
	//   45  102:ldc1            #199 <String "Unable to access notification actions">
	//   46  104:aload_1         
	//   47  105:invokestatic    #205 <Method int Log.e(String, String, Throwable)>
	//   48  108:pop             
			sActionsAccessFailed = true;
	//   49  109:iconst_1        
	//   50  110:putstatic       #165 <Field boolean sActionsAccessFailed>
		}
		if(sActionsAccessFailed)
	//*  51  113:goto            74
			flag = false;
	//   52  116:iconst_0        
	//   53  117:istore_0        
		return flag;
	//*  54  118:goto            80
	}

	public static NotificationCompatBase.Action getAction(Notification notification, int i, NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
	{
		Object obj = sActionsLock;
	//    0    0:getstatic       #62  <Field Object sActionsLock>
	//    1    3:astore          5
		obj;
	//    2    5:aload           5
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		Object aobj[] = getActionObjectsLocked(notification);
	//    4    8:aload_0         
	//    5    9:invokestatic    #213 <Method Object[] getActionObjectsLocked(Notification)>
	//    6   12:astore          4
		Object obj1;
		if(aobj == null)
			break MISSING_BLOCK_LABEL_125;
	//    7   14:aload           4
	//    8   16:ifnull          125
		obj1 = aobj[i];
	//    9   19:aload           4
	//   10   21:iload_1         
	//   11   22:aaload          
	//   12   23:astore          6
		aobj = null;
	//   13   25:aconst_null     
	//   14   26:astore          4
		Object obj2 = ((Object) (getExtras(notification)));
	//   15   28:aload_0         
	//   16   29:invokestatic    #217 <Method Bundle getExtras(Notification)>
	//   17   32:astore          7
		notification = ((Notification) (aobj));
	//   18   34:aload           4
	//   19   36:astore_0        
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_69;
	//   20   37:aload           7
	//   21   39:ifnull          69
		obj2 = ((Object) (((Bundle) (obj2)).getSparseParcelableArray("android.support.actionExtras")));
	//   22   42:aload           7
	//   23   44:ldc1            #219 <String "android.support.actionExtras">
	//   24   46:invokevirtual   #223 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//   25   49:astore          7
		notification = ((Notification) (aobj));
	//   26   51:aload           4
	//   27   53:astore_0        
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_69;
	//   28   54:aload           7
	//   29   56:ifnull          69
		notification = ((Notification) ((Bundle)((SparseArray) (obj2)).get(i)));
	//   30   59:aload           7
	//   31   61:iload_1         
	//   32   62:invokevirtual   #224 <Method Object SparseArray.get(int)>
	//   33   65:checkcast       #150 <Class Bundle>
	//   34   68:astore_0        
		notification = ((Notification) (readAction(factory, factory1, sActionIconField.getInt(obj1), (CharSequence)sActionTitleField.get(obj1), (PendingIntent)sActionIntentField.get(obj1), ((Bundle) (notification)))));
	//   35   69:aload_2         
	//   36   70:aload_3         
	//   37   71:getstatic       #183 <Field Field sActionIconField>
	//   38   74:aload           6
	//   39   76:invokevirtual   #228 <Method int Field.getInt(Object)>
	//   40   79:getstatic       #185 <Field Field sActionTitleField>
	//   41   82:aload           6
	//   42   84:invokevirtual   #231 <Method Object Field.get(Object)>
	//   43   87:checkcast       #131 <Class CharSequence>
	//   44   90:getstatic       #187 <Field Field sActionIntentField>
	//   45   93:aload           6
	//   46   95:invokevirtual   #231 <Method Object Field.get(Object)>
	//   47   98:checkcast       #233 <Class PendingIntent>
	//   48  101:aload_0         
	//   49  102:invokestatic    #237 <Method NotificationCompatBase$Action readAction(NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory, int, CharSequence, PendingIntent, Bundle)>
	//   50  105:astore_0        
		obj;
	//   51  106:aload           5
		JVM INSTR monitorexit ;
	//   52  108:monitorexit     
		return ((NotificationCompatBase.Action) (notification));
	//   53  109:aload_0         
	//   54  110:areturn         
		notification;
	//   55  111:astore_0        
		Log.e("NotificationCompat", "Unable to access notification actions", ((Throwable) (notification)));
	//   56  112:ldc1            #38  <String "NotificationCompat">
	//   57  114:ldc1            #199 <String "Unable to access notification actions">
	//   58  116:aload_0         
	//   59  117:invokestatic    #205 <Method int Log.e(String, String, Throwable)>
	//   60  120:pop             
		sActionsAccessFailed = true;
	//   61  121:iconst_1        
	//   62  122:putstatic       #165 <Field boolean sActionsAccessFailed>
		obj;
	//   63  125:aload           5
		JVM INSTR monitorexit ;
	//   64  127:monitorexit     
		return null;
	//   65  128:aconst_null     
	//   66  129:areturn         
		notification;
	//   67  130:astore_0        
		obj;
	//   68  131:aload           5
		JVM INSTR monitorexit ;
	//   69  133:monitorexit     
		throw notification;
	//   70  134:aload_0         
	//   71  135:athrow          
	}

	public static int getActionCount(Notification notification)
	{
		Object obj = sActionsLock;
	//    0    0:getstatic       #62  <Field Object sActionsLock>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		notification = ((Notification) (getActionObjectsLocked(notification)));
	//    4    6:aload_0         
	//    5    7:invokestatic    #213 <Method Object[] getActionObjectsLocked(Notification)>
	//    6   10:astore_0        
		if(notification == null)
			break MISSING_BLOCK_LABEL_27;
	//    7   11:aload_0         
	//    8   12:ifnull          27
		int i = notification.length;
	//    9   15:aload_0         
	//   10   16:arraylength     
	//   11   17:istore_1        
_L1:
		obj;
	//   12   18:aload_2         
		JVM INSTR monitorexit ;
	//   13   19:monitorexit     
		return i;
	//   14   20:iload_1         
	//   15   21:ireturn         
		notification;
	//   16   22:astore_0        
		obj;
	//   17   23:aload_2         
		JVM INSTR monitorexit ;
	//   18   24:monitorexit     
		throw notification;
	//   19   25:aload_0         
	//   20   26:athrow          
		i = 0;
	//   21   27:iconst_0        
	//   22   28:istore_1        
		  goto _L1
	//*  23   29:goto            18
	}

	private static NotificationCompatBase.Action getActionFromBundle(Bundle bundle, NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
	{
		Bundle bundle1 = bundle.getBundle("extras");
	//    0    0:aload_0         
	//    1    1:ldc1            #26  <String "extras">
	//    2    3:invokevirtual   #245 <Method Bundle Bundle.getBundle(String)>
	//    3    6:astore          4
		boolean flag = false;
	//    4    8:iconst_0        
	//    5    9:istore_3        
		if(bundle1 != null)
	//*   6   10:aload           4
	//*   7   12:ifnull          24
			flag = bundle1.getBoolean("android.support.allowGeneratedReplies", false);
	//    8   15:aload           4
	//    9   17:ldc1            #14  <String "android.support.allowGeneratedReplies">
	//   10   19:iconst_0        
	//   11   20:invokevirtual   #249 <Method boolean Bundle.getBoolean(String, boolean)>
	//   12   23:istore_3        
		return factory.build(bundle.getInt("icon"), bundle.getCharSequence("title"), (PendingIntent)bundle.getParcelable("actionIntent"), bundle.getBundle("extras"), RemoteInputCompatJellybean.fromBundleArray(BundleUtil.getBundleArrayFromBundle(bundle, "remoteInputs"), factory1), RemoteInputCompatJellybean.fromBundleArray(BundleUtil.getBundleArrayFromBundle(bundle, "dataOnlyRemoteInputs"), factory1), flag);
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:ldc1            #29  <String "icon">
	//   16   28:invokevirtual   #252 <Method int Bundle.getInt(String)>
	//   17   31:aload_0         
	//   18   32:ldc1            #35  <String "title">
	//   19   34:invokevirtual   #256 <Method CharSequence Bundle.getCharSequence(String)>
	//   20   37:aload_0         
	//   21   38:ldc1            #20  <String "actionIntent">
	//   22   40:invokevirtual   #260 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   23   43:checkcast       #233 <Class PendingIntent>
	//   24   46:aload_0         
	//   25   47:ldc1            #26  <String "extras">
	//   26   49:invokevirtual   #245 <Method Bundle Bundle.getBundle(String)>
	//   27   52:aload_0         
	//   28   53:ldc1            #32  <String "remoteInputs">
	//   29   55:invokestatic    #266 <Method Bundle[] BundleUtil.getBundleArrayFromBundle(Bundle, String)>
	//   30   58:aload_2         
	//   31   59:invokestatic    #272 <Method RemoteInputCompatBase$RemoteInput[] RemoteInputCompatJellybean.fromBundleArray(Bundle[], RemoteInputCompatBase$RemoteInput$Factory)>
	//   32   62:aload_0         
	//   33   63:ldc1            #23  <String "dataOnlyRemoteInputs">
	//   34   65:invokestatic    #266 <Method Bundle[] BundleUtil.getBundleArrayFromBundle(Bundle, String)>
	//   35   68:aload_2         
	//   36   69:invokestatic    #272 <Method RemoteInputCompatBase$RemoteInput[] RemoteInputCompatJellybean.fromBundleArray(Bundle[], RemoteInputCompatBase$RemoteInput$Factory)>
	//   37   72:iload_3         
	//   38   73:invokeinterface #278 <Method NotificationCompatBase$Action NotificationCompatBase$Action$Factory.build(int, CharSequence, PendingIntent, Bundle, RemoteInputCompatBase$RemoteInput[], RemoteInputCompatBase$RemoteInput[], boolean)>
	//   39   78:areturn         
	}

	private static Object[] getActionObjectsLocked(Notification notification)
	{
label0:
		{
			synchronized(sActionsLock)
	//*   0    0:getstatic       #62  <Field Object sActionsLock>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
			{
				if(ensureActionReflectionReadyLocked())
					break label0;
	//    4    6:invokestatic    #280 <Method boolean ensureActionReflectionReadyLocked()>
	//    5    9:ifne            16
			}
	//    6   12:aload_1         
	//    7   13:monitorexit     
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
		}
		notification = ((Notification) ((Object[])(Object[])sActionsField.get(((Object) (notification)))));
	//   10   16:getstatic       #167 <Field Field sActionsField>
	//   11   19:aload_0         
	//   12   20:invokevirtual   #231 <Method Object Field.get(Object)>
	//   13   23:checkcast       #282 <Class Object[]>
	//   14   26:checkcast       #282 <Class Object[]>
	//   15   29:astore_0        
		obj;
	//   16   30:aload_1         
		JVM INSTR monitorexit ;
	//   17   31:monitorexit     
		return ((Object []) (notification));
	//   18   32:aload_0         
	//   19   33:areturn         
		notification;
	//   20   34:astore_0        
		obj;
	//   21   35:aload_1         
		JVM INSTR monitorexit ;
	//   22   36:monitorexit     
		throw notification;
	//   23   37:aload_0         
	//   24   38:athrow          
		notification;
	//   25   39:astore_0        
		Log.e("NotificationCompat", "Unable to access notification actions", ((Throwable) (notification)));
	//   26   40:ldc1            #38  <String "NotificationCompat">
	//   27   42:ldc1            #199 <String "Unable to access notification actions">
	//   28   44:aload_0         
	//   29   45:invokestatic    #205 <Method int Log.e(String, String, Throwable)>
	//   30   48:pop             
		sActionsAccessFailed = true;
	//   31   49:iconst_1        
	//   32   50:putstatic       #165 <Field boolean sActionsAccessFailed>
		obj;
	//   33   53:aload_1         
		JVM INSTR monitorexit ;
	//   34   54:monitorexit     
		return null;
	//   35   55:aconst_null     
	//   36   56:areturn         
	}

	public static NotificationCompatBase.Action[] getActionsFromParcelableArrayList(ArrayList arraylist, NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
	{
		if(arraylist != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       10
_L1:
		NotificationCompatBase.Action aaction[] = null;
	//    2    4:aconst_null     
	//    3    5:astore          4
_L4:
		return aaction;
	//    4    7:aload           4
	//    5    9:areturn         
_L2:
		NotificationCompatBase.Action aaction1[] = factory.newArray(arraylist.size());
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #285 <Method int ArrayList.size()>
	//    9   15:invokeinterface #289 <Method NotificationCompatBase$Action[] NotificationCompatBase$Action$Factory.newArray(int)>
	//   10   20:astore          5
		int i = 0;
	//   11   22:iconst_0        
	//   12   23:istore_3        
		do
		{
			aaction = aaction1;
	//   13   24:aload           5
	//   14   26:astore          4
			if(i >= aaction1.length)
				continue;
	//   15   28:iload_3         
	//   16   29:aload           5
	//   17   31:arraylength     
	//   18   32:icmpge          7
			aaction1[i] = getActionFromBundle((Bundle)arraylist.get(i), factory, factory1);
	//   19   35:aload           5
	//   20   37:iload_3         
	//   21   38:aload_0         
	//   22   39:iload_3         
	//   23   40:invokevirtual   #290 <Method Object ArrayList.get(int)>
	//   24   43:checkcast       #150 <Class Bundle>
	//   25   46:aload_1         
	//   26   47:aload_2         
	//   27   48:invokestatic    #292 <Method NotificationCompatBase$Action getActionFromBundle(Bundle, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
	//   28   51:aastore         
			i++;
	//   29   52:iload_3         
	//   30   53:iconst_1        
	//   31   54:iadd            
	//   32   55:istore_3        
		} while(true);
	//   33   56:goto            24
		if(true) goto _L4; else goto _L3
_L3:
	}

	private static Bundle getBundleForAction(NotificationCompatBase.Action action)
	{
		Bundle bundle1 = new Bundle();
	//    0    0:new             #150 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #296 <Method void Bundle()>
	//    3    7:astore_2        
		bundle1.putInt("icon", action.getIcon());
	//    4    8:aload_2         
	//    5    9:ldc1            #29  <String "icon">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #301 <Method int NotificationCompatBase$Action.getIcon()>
	//    8   15:invokevirtual   #305 <Method void Bundle.putInt(String, int)>
		bundle1.putCharSequence("title", action.getTitle());
	//    9   18:aload_2         
	//   10   19:ldc1            #35  <String "title">
	//   11   21:aload_0         
	//   12   22:invokevirtual   #309 <Method CharSequence NotificationCompatBase$Action.getTitle()>
	//   13   25:invokevirtual   #313 <Method void Bundle.putCharSequence(String, CharSequence)>
		bundle1.putParcelable("actionIntent", ((android.os.Parcelable) (action.getActionIntent())));
	//   14   28:aload_2         
	//   15   29:ldc1            #20  <String "actionIntent">
	//   16   31:aload_0         
	//   17   32:invokevirtual   #317 <Method PendingIntent NotificationCompatBase$Action.getActionIntent()>
	//   18   35:invokevirtual   #321 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		Bundle bundle;
		if(action.getExtras() != null)
	//*  19   38:aload_0         
	//*  20   39:invokevirtual   #324 <Method Bundle NotificationCompatBase$Action.getExtras()>
	//*  21   42:ifnull          89
			bundle = new Bundle(action.getExtras());
	//   22   45:new             #150 <Class Bundle>
	//   23   48:dup             
	//   24   49:aload_0         
	//   25   50:invokevirtual   #324 <Method Bundle NotificationCompatBase$Action.getExtras()>
	//   26   53:invokespecial   #327 <Method void Bundle(Bundle)>
	//   27   56:astore_1        
		else
	//*  28   57:aload_1         
	//*  29   58:ldc1            #14  <String "android.support.allowGeneratedReplies">
	//*  30   60:aload_0         
	//*  31   61:invokevirtual   #330 <Method boolean NotificationCompatBase$Action.getAllowGeneratedReplies()>
	//*  32   64:invokevirtual   #334 <Method void Bundle.putBoolean(String, boolean)>
	//*  33   67:aload_2         
	//*  34   68:ldc1            #26  <String "extras">
	//*  35   70:aload_1         
	//*  36   71:invokevirtual   #338 <Method void Bundle.putBundle(String, Bundle)>
	//*  37   74:aload_2         
	//*  38   75:ldc1            #32  <String "remoteInputs">
	//*  39   77:aload_0         
	//*  40   78:invokevirtual   #342 <Method RemoteInputCompatBase$RemoteInput[] NotificationCompatBase$Action.getRemoteInputs()>
	//*  41   81:invokestatic    #346 <Method Bundle[] RemoteInputCompatJellybean.toBundleArray(RemoteInputCompatBase$RemoteInput[])>
	//*  42   84:invokevirtual   #350 <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
	//*  43   87:aload_2         
	//*  44   88:areturn         
			bundle = new Bundle();
	//   45   89:new             #150 <Class Bundle>
	//   46   92:dup             
	//   47   93:invokespecial   #296 <Method void Bundle()>
	//   48   96:astore_1        
		bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
		bundle1.putBundle("extras", bundle);
		bundle1.putParcelableArray("remoteInputs", ((android.os.Parcelable []) (RemoteInputCompatJellybean.toBundleArray(action.getRemoteInputs()))));
		return bundle1;
	//*  49   97:goto            57
	}

	public static Bundle getExtras(Notification notification)
	{
label0:
		{
			synchronized(sExtrasLock)
	//*   0    0:getstatic       #60  <Field Object sExtrasLock>
	//*   1    3:astore_3        
	//*   2    4:aload_3         
	//*   3    5:monitorenter    
			{
				if(!sExtrasFieldAccessFailed)
					break label0;
	//    4    6:getstatic       #352 <Field boolean sExtrasFieldAccessFailed>
	//    5    9:ifeq            16
			}
	//    6   12:aload_3         
	//    7   13:monitorexit     
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
		}
		Object obj;
		if(sExtrasField != null)
			break MISSING_BLOCK_LABEL_68;
	//   10   16:getstatic       #354 <Field Field sExtrasField>
	//   11   19:ifnonnull       68
		obj = ((Object) (((Class) (android/app/Notification)).getDeclaredField("extras")));
	//   12   22:ldc1            #189 <Class Notification>
	//   13   24:ldc1            #26  <String "extras">
	//   14   26:invokevirtual   #181 <Method Field Class.getDeclaredField(String)>
	//   15   29:astore_1        
		if(((Class) (android/os/Bundle)).isAssignableFrom(((Field) (obj)).getType()))
			break MISSING_BLOCK_LABEL_59;
	//   16   30:ldc1            #150 <Class Bundle>
	//   17   32:aload_1         
	//   18   33:invokevirtual   #358 <Method Class Field.getType()>
	//   19   36:invokevirtual   #362 <Method boolean Class.isAssignableFrom(Class)>
	//   20   39:ifne            59
		Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
	//   21   42:ldc1            #38  <String "NotificationCompat">
	//   22   44:ldc2            #364 <String "Notification.extras field is not of type Bundle">
	//   23   47:invokestatic    #367 <Method int Log.e(String, String)>
	//   24   50:pop             
		sExtrasFieldAccessFailed = true;
	//   25   51:iconst_1        
	//   26   52:putstatic       #352 <Field boolean sExtrasFieldAccessFailed>
		obj1;
	//   27   55:aload_3         
		JVM INSTR monitorexit ;
	//   28   56:monitorexit     
		return null;
	//   29   57:aconst_null     
	//   30   58:areturn         
		((Field) (obj)).setAccessible(true);
	//   31   59:aload_1         
	//   32   60:iconst_1        
	//   33   61:invokevirtual   #197 <Method void Field.setAccessible(boolean)>
		sExtrasField = ((Field) (obj));
	//   34   64:aload_1         
	//   35   65:putstatic       #354 <Field Field sExtrasField>
		Bundle bundle = (Bundle)sExtrasField.get(((Object) (notification)));
	//   36   68:getstatic       #354 <Field Field sExtrasField>
	//   37   71:aload_0         
	//   38   72:invokevirtual   #231 <Method Object Field.get(Object)>
	//   39   75:checkcast       #150 <Class Bundle>
	//   40   78:astore_2        
		obj = ((Object) (bundle));
	//   41   79:aload_2         
	//   42   80:astore_1        
		if(bundle != null)
			break MISSING_BLOCK_LABEL_101;
	//   43   81:aload_2         
	//   44   82:ifnonnull       101
		obj = ((Object) (new Bundle()));
	//   45   85:new             #150 <Class Bundle>
	//   46   88:dup             
	//   47   89:invokespecial   #296 <Method void Bundle()>
	//   48   92:astore_1        
		sExtrasField.set(((Object) (notification)), obj);
	//   49   93:getstatic       #354 <Field Field sExtrasField>
	//   50   96:aload_0         
	//   51   97:aload_1         
	//   52   98:invokevirtual   #371 <Method void Field.set(Object, Object)>
		obj1;
	//   53  101:aload_3         
		JVM INSTR monitorexit ;
	//   54  102:monitorexit     
		return ((Bundle) (obj));
	//   55  103:aload_1         
	//   56  104:areturn         
		notification;
	//   57  105:astore_0        
		obj1;
	//   58  106:aload_3         
		JVM INSTR monitorexit ;
	//   59  107:monitorexit     
		throw notification;
	//   60  108:aload_0         
	//   61  109:athrow          
		notification;
	//   62  110:astore_0        
		Log.e("NotificationCompat", "Unable to access notification extras", ((Throwable) (notification)));
	//   63  111:ldc1            #38  <String "NotificationCompat">
	//   64  113:ldc2            #373 <String "Unable to access notification extras">
	//   65  116:aload_0         
	//   66  117:invokestatic    #205 <Method int Log.e(String, String, Throwable)>
	//   67  120:pop             
_L1:
		sExtrasFieldAccessFailed = true;
	//   68  121:iconst_1        
	//   69  122:putstatic       #352 <Field boolean sExtrasFieldAccessFailed>
		obj1;
	//   70  125:aload_3         
		JVM INSTR monitorexit ;
	//   71  126:monitorexit     
		return null;
	//   72  127:aconst_null     
	//   73  128:areturn         
		notification;
	//   74  129:astore_0        
		Log.e("NotificationCompat", "Unable to access notification extras", ((Throwable) (notification)));
	//   75  130:ldc1            #38  <String "NotificationCompat">
	//   76  132:ldc2            #373 <String "Unable to access notification extras">
	//   77  135:aload_0         
	//   78  136:invokestatic    #205 <Method int Log.e(String, String, Throwable)>
	//   79  139:pop             
		  goto _L1
	//*  80  140:goto            121
	}

	public static ArrayList getParcelableArrayListForActions(NotificationCompatBase.Action aaction[])
	{
		if(aaction != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       8
_L1:
		ArrayList arraylist = null;
	//    2    4:aconst_null     
	//    3    5:astore_3        
_L4:
		return arraylist;
	//    4    6:aload_3         
	//    5    7:areturn         
_L2:
		ArrayList arraylist1 = new ArrayList(aaction.length);
	//    6    8:new             #115 <Class ArrayList>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:arraylength     
	//   10   14:invokespecial   #378 <Method void ArrayList(int)>
	//   11   17:astore          4
		int j = aaction.length;
	//   12   19:aload_0         
	//   13   20:arraylength     
	//   14   21:istore_2        
		int i = 0;
	//   15   22:iconst_0        
	//   16   23:istore_1        
		do
		{
			arraylist = arraylist1;
	//   17   24:aload           4
	//   18   26:astore_3        
			if(i >= j)
				continue;
	//   19   27:iload_1         
	//   20   28:iload_2         
	//   21   29:icmpge          6
			arraylist1.add(((Object) (getBundleForAction(aaction[i]))));
	//   22   32:aload           4
	//   23   34:aload_0         
	//   24   35:iload_1         
	//   25   36:aaload          
	//   26   37:invokestatic    #380 <Method Bundle getBundleForAction(NotificationCompatBase$Action)>
	//   27   40:invokevirtual   #384 <Method boolean ArrayList.add(Object)>
	//   28   43:pop             
			i++;
	//   29   44:iload_1         
	//   30   45:iconst_1        
	//   31   46:iadd            
	//   32   47:istore_1        
		} while(true);
	//   33   48:goto            24
		if(true) goto _L4; else goto _L3
_L3:
	}

	public static NotificationCompatBase.Action readAction(NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1, int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle)
	{
		RemoteInputCompatBase.RemoteInput aremoteinput[] = null;
	//    0    0:aconst_null     
	//    1    1:astore          7
		RemoteInputCompatBase.RemoteInput aremoteinput1[] = null;
	//    2    3:aconst_null     
	//    3    4:astore          8
		boolean flag = false;
	//    4    6:iconst_0        
	//    5    7:istore          6
		if(bundle != null)
	//*   6    9:aload           5
	//*   7   11:ifnull          50
		{
			aremoteinput = RemoteInputCompatJellybean.fromBundleArray(BundleUtil.getBundleArrayFromBundle(bundle, "android.support.remoteInputs"), factory1);
	//    8   14:aload           5
	//    9   16:ldc2            #387 <String "android.support.remoteInputs">
	//   10   19:invokestatic    #266 <Method Bundle[] BundleUtil.getBundleArrayFromBundle(Bundle, String)>
	//   11   22:aload_1         
	//   12   23:invokestatic    #272 <Method RemoteInputCompatBase$RemoteInput[] RemoteInputCompatJellybean.fromBundleArray(Bundle[], RemoteInputCompatBase$RemoteInput$Factory)>
	//   13   26:astore          7
			aremoteinput1 = RemoteInputCompatJellybean.fromBundleArray(BundleUtil.getBundleArrayFromBundle(bundle, "android.support.dataRemoteInputs"), factory1);
	//   14   28:aload           5
	//   15   30:ldc1            #17  <String "android.support.dataRemoteInputs">
	//   16   32:invokestatic    #266 <Method Bundle[] BundleUtil.getBundleArrayFromBundle(Bundle, String)>
	//   17   35:aload_1         
	//   18   36:invokestatic    #272 <Method RemoteInputCompatBase$RemoteInput[] RemoteInputCompatJellybean.fromBundleArray(Bundle[], RemoteInputCompatBase$RemoteInput$Factory)>
	//   19   39:astore          8
			flag = bundle.getBoolean("android.support.allowGeneratedReplies");
	//   20   41:aload           5
	//   21   43:ldc1            #14  <String "android.support.allowGeneratedReplies">
	//   22   45:invokevirtual   #390 <Method boolean Bundle.getBoolean(String)>
	//   23   48:istore          6
		}
		return factory.build(i, charsequence, pendingintent, bundle, aremoteinput, aremoteinput1, flag);
	//   24   50:aload_0         
	//   25   51:iload_2         
	//   26   52:aload_3         
	//   27   53:aload           4
	//   28   55:aload           5
	//   29   57:aload           7
	//   30   59:aload           8
	//   31   61:iload           6
	//   32   63:invokeinterface #278 <Method NotificationCompatBase$Action NotificationCompatBase$Action$Factory.build(int, CharSequence, PendingIntent, Bundle, RemoteInputCompatBase$RemoteInput[], RemoteInputCompatBase$RemoteInput[], boolean)>
	//   33   68:areturn         
	}

	public static Bundle writeActionAndGetExtras(android.app.Notification.Builder builder, NotificationCompatBase.Action action)
	{
		builder.addAction(action.getIcon(), action.getTitle(), action.getActionIntent());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #301 <Method int NotificationCompatBase$Action.getIcon()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #309 <Method CharSequence NotificationCompatBase$Action.getTitle()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #317 <Method PendingIntent NotificationCompatBase$Action.getActionIntent()>
	//    7   13:invokevirtual   #398 <Method android.app.Notification$Builder android.app.Notification$Builder.addAction(int, CharSequence, PendingIntent)>
	//    8   16:pop             
		builder = ((android.app.Notification.Builder) (new Bundle(action.getExtras())));
	//    9   17:new             #150 <Class Bundle>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokevirtual   #324 <Method Bundle NotificationCompatBase$Action.getExtras()>
	//   13   25:invokespecial   #327 <Method void Bundle(Bundle)>
	//   14   28:astore_0        
		if(action.getRemoteInputs() != null)
	//*  15   29:aload_1         
	//*  16   30:invokevirtual   #342 <Method RemoteInputCompatBase$RemoteInput[] NotificationCompatBase$Action.getRemoteInputs()>
	//*  17   33:ifnull          50
			((Bundle) (builder)).putParcelableArray("android.support.remoteInputs", ((android.os.Parcelable []) (RemoteInputCompatJellybean.toBundleArray(action.getRemoteInputs()))));
	//   18   36:aload_0         
	//   19   37:ldc2            #387 <String "android.support.remoteInputs">
	//   20   40:aload_1         
	//   21   41:invokevirtual   #342 <Method RemoteInputCompatBase$RemoteInput[] NotificationCompatBase$Action.getRemoteInputs()>
	//   22   44:invokestatic    #346 <Method Bundle[] RemoteInputCompatJellybean.toBundleArray(RemoteInputCompatBase$RemoteInput[])>
	//   23   47:invokevirtual   #350 <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
		if(action.getDataOnlyRemoteInputs() != null)
	//*  24   50:aload_1         
	//*  25   51:invokevirtual   #401 <Method RemoteInputCompatBase$RemoteInput[] NotificationCompatBase$Action.getDataOnlyRemoteInputs()>
	//*  26   54:ifnull          70
			((Bundle) (builder)).putParcelableArray("android.support.dataRemoteInputs", ((android.os.Parcelable []) (RemoteInputCompatJellybean.toBundleArray(action.getDataOnlyRemoteInputs()))));
	//   27   57:aload_0         
	//   28   58:ldc1            #17  <String "android.support.dataRemoteInputs">
	//   29   60:aload_1         
	//   30   61:invokevirtual   #401 <Method RemoteInputCompatBase$RemoteInput[] NotificationCompatBase$Action.getDataOnlyRemoteInputs()>
	//   31   64:invokestatic    #346 <Method Bundle[] RemoteInputCompatJellybean.toBundleArray(RemoteInputCompatBase$RemoteInput[])>
	//   32   67:invokevirtual   #350 <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
		((Bundle) (builder)).putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
	//   33   70:aload_0         
	//   34   71:ldc1            #14  <String "android.support.allowGeneratedReplies">
	//   35   73:aload_1         
	//   36   74:invokevirtual   #330 <Method boolean NotificationCompatBase$Action.getAllowGeneratedReplies()>
	//   37   77:invokevirtual   #334 <Method void Bundle.putBoolean(String, boolean)>
		return ((Bundle) (builder));
	//   38   80:aload_0         
	//   39   81:areturn         
	}

	static final String EXTRA_ALLOW_GENERATED_REPLIES = "android.support.allowGeneratedReplies";
	static final String EXTRA_DATA_ONLY_REMOTE_INPUTS = "android.support.dataRemoteInputs";
	private static final String KEY_ACTION_INTENT = "actionIntent";
	private static final String KEY_DATA_ONLY_REMOTE_INPUTS = "dataOnlyRemoteInputs";
	private static final String KEY_EXTRAS = "extras";
	private static final String KEY_ICON = "icon";
	private static final String KEY_REMOTE_INPUTS = "remoteInputs";
	private static final String KEY_TITLE = "title";
	public static final String TAG = "NotificationCompat";
	private static Class sActionClass;
	private static Field sActionIconField;
	private static Field sActionIntentField;
	private static Field sActionTitleField;
	private static boolean sActionsAccessFailed;
	private static Field sActionsField;
	private static final Object sActionsLock = new Object();
	private static Field sExtrasField;
	private static boolean sExtrasFieldAccessFailed;
	private static final Object sExtrasLock = new Object();

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void Object()>
	//    3    7:putstatic       #60  <Field Object sExtrasLock>
	//    4   10:new             #4   <Class Object>
	//    5   13:dup             
	//    6   14:invokespecial   #58  <Method void Object()>
	//    7   17:putstatic       #62  <Field Object sActionsLock>
	//*   8   20:return          
	}
}
