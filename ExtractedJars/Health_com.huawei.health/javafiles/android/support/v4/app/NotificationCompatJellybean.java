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
		//*  28   67:ifeq            76
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
		//*  48  108:getfield        #200 <Field RemoteViews mContentView>
		//*  49  111:ifnull          122
				notification.contentView = mContentView;
		//   50  114:aload_1         
		//   51  115:aload_0         
		//   52  116:getfield        #200 <Field RemoteViews mContentView>
		//   53  119:putfield        #60  <Field RemoteViews Notification.contentView>
			if(mBigContentView != null)
		//*  54  122:aload_0         
		//*  55  123:getfield        #202 <Field RemoteViews mBigContentView>
		//*  56  126:ifnull          137
				notification.bigContentView = mBigContentView;
		//   57  129:aload_1         
		//   58  130:aload_0         
		//   59  131:getfield        #202 <Field RemoteViews mBigContentView>
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
		//*  46   97:ifeq            106
				flag4 = true;
		//   47  100:iconst_1        
		//   48  101:istore          24
			else
		//*  49  103:goto            109
				flag4 = false;
		//   50  106:iconst_0        
		//   51  107:istore          24
			context = ((Context) (((android.app.Notification.Builder) (context)).setOngoing(flag4)));
		//   52  109:aload_1         
		//   53  110:iload           24
		//   54  112:invokevirtual   #111 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
		//   55  115:astore_1        
			if((notification.flags & 8) != 0)
		//*  56  116:aload_2         
		//*  57  117:getfield        #107 <Field int Notification.flags>
		//*  58  120:bipush          8
		//*  59  122:iand            
		//*  60  123:ifeq            132
				flag4 = true;
		//   61  126:iconst_1        
		//   62  127:istore          24
			else
		//*  63  129:goto            135
				flag4 = false;
		//   64  132:iconst_0        
		//   65  133:istore          24
			context = ((Context) (((android.app.Notification.Builder) (context)).setOnlyAlertOnce(flag4)));
		//   66  135:aload_1         
		//   67  136:iload           24
		//   68  138:invokevirtual   #114 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
		//   69  141:astore_1        
			if((notification.flags & 0x10) != 0)
		//*  70  142:aload_2         
		//*  71  143:getfield        #107 <Field int Notification.flags>
		//*  72  146:bipush          16
		//*  73  148:iand            
		//*  74  149:ifeq            158
				flag4 = true;
		//   75  152:iconst_1        
		//   76  153:istore          24
			else
		//*  77  155:goto            161
				flag4 = false;
		//   78  158:iconst_0        
		//   79  159:istore          24
			context = ((Context) (((android.app.Notification.Builder) (context)).setAutoCancel(flag4).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setSubText(charsequence3).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent)));
		//   80  161:aload_1         
		//   81  162:iload           24
		//   82  164:invokevirtual   #117 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
		//   83  167:aload_2         
		//   84  168:getfield        #120 <Field int Notification.defaults>
		//   85  171:invokevirtual   #124 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
		//   86  174:aload_3         
		//   87  175:invokevirtual   #128 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
		//   88  178:aload           4
		//   89  180:invokevirtual   #131 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
		//   90  183:aload           16
		//   91  185:invokevirtual   #134 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
		//   92  188:aload           5
		//   93  190:invokevirtual   #137 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
		//   94  193:aload           8
		//   95  195:invokevirtual   #141 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
		//   96  198:aload_2         
		//   97  199:getfield        #145 <Field PendingIntent Notification.deleteIntent>
		//   98  202:invokevirtual   #148 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
		//   99  205:astore_1        
			if((notification.flags & 0x80) != 0)
		//* 100  206:aload_2         
		//* 101  207:getfield        #107 <Field int Notification.flags>
		//* 102  210:sipush          128
		//* 103  213:iand            
		//* 104  214:ifeq            223
				flag4 = true;
		//  105  217:iconst_1        
		//  106  218:istore          24
			else
		//* 107  220:goto            226
				flag4 = false;
		//  108  223:iconst_0        
		//  109  224:istore          24
			b = ((android.app.Notification.Builder) (context)).setFullScreenIntent(pendingintent1, flag4).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag1).setPriority(l).setProgress(j, k, flag);
		//  110  226:aload_0         
		//  111  227:aload_1         
		//  112  228:aload           9
		//  113  230:iload           24
		//  114  232:invokevirtual   #152 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
		//  115  235:aload           10
		//  116  237:invokevirtual   #156 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
		//  117  240:iload           7
		//  118  242:invokevirtual   #159 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
		//  119  245:iload           14
		//  120  247:invokevirtual   #162 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
		//  121  250:iload           15
		//  122  252:invokevirtual   #165 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
		//  123  255:iload           11
		//  124  257:iload           12
		//  125  259:iload           13
		//  126  261:invokevirtual   #169 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
		//  127  264:putfield        #171 <Field android.app.Notification$Builder b>
		//  128  267:aload_0         
		//  129  268:new             #173 <Class Bundle>
		//  130  271:dup             
		//  131  272:invokespecial   #174 <Method void Bundle()>
		//  132  275:putfield        #176 <Field Bundle mExtras>
			if(bundle != null)
		//* 133  278:aload           18
		//* 134  280:ifnull          292
				mExtras.putAll(bundle);
		//  135  283:aload_0         
		//  136  284:getfield        #176 <Field Bundle mExtras>
		//  137  287:aload           18
		//  138  289:invokevirtual   #180 <Method void Bundle.putAll(Bundle)>
			if(flag2)
		//* 139  292:iload           17
		//* 140  294:ifeq            307
				mExtras.putBoolean("android.support.localOnly", true);
		//  141  297:aload_0         
		//  142  298:getfield        #176 <Field Bundle mExtras>
		//  143  301:ldc1            #182 <String "android.support.localOnly">
		//  144  303:iconst_1        
		//  145  304:invokevirtual   #186 <Method void Bundle.putBoolean(String, boolean)>
			if(s != null)
		//* 146  307:aload           19
		//* 147  309:ifnull          351
			{
				mExtras.putString("android.support.groupKey", s);
		//  148  312:aload_0         
		//  149  313:getfield        #176 <Field Bundle mExtras>
		//  150  316:ldc1            #188 <String "android.support.groupKey">
		//  151  318:aload           19
		//  152  320:invokevirtual   #192 <Method void Bundle.putString(String, String)>
				if(flag3)
		//* 153  323:iload           20
		//* 154  325:ifeq            341
					mExtras.putBoolean("android.support.isGroupSummary", true);
		//  155  328:aload_0         
		//  156  329:getfield        #176 <Field Bundle mExtras>
		//  157  332:ldc1            #194 <String "android.support.isGroupSummary">
		//  158  334:iconst_1        
		//  159  335:invokevirtual   #186 <Method void Bundle.putBoolean(String, boolean)>
				else
		//* 160  338:goto            351
					mExtras.putBoolean("android.support.useSideChannel", true);
		//  161  341:aload_0         
		//  162  342:getfield        #176 <Field Bundle mExtras>
		//  163  345:ldc1            #196 <String "android.support.useSideChannel">
		//  164  347:iconst_1        
		//  165  348:invokevirtual   #186 <Method void Bundle.putBoolean(String, boolean)>
			}
			if(s1 != null)
		//* 166  351:aload           21
		//* 167  353:ifnull          367
				mExtras.putString("android.support.sortKey", s1);
		//  168  356:aload_0         
		//  169  357:getfield        #176 <Field Bundle mExtras>
		//  170  360:ldc1            #198 <String "android.support.sortKey">
		//  171  362:aload           21
		//  172  364:invokevirtual   #192 <Method void Bundle.putString(String, String)>
			mContentView = remoteviews1;
		//  173  367:aload_0         
		//  174  368:aload           22
		//  175  370:putfield        #200 <Field RemoteViews mContentView>
			mBigContentView = remoteviews2;
		//  176  373:aload_0         
		//  177  374:aload           23
		//  178  376:putfield        #202 <Field RemoteViews mBigContentView>
		//  179  379:return          
		}
	}


	NotificationCompatJellybean()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method void Object()>
	//    2    4:return          
	}

	public static void addBigPictureStyle(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, CharSequence charsequence, boolean flag, CharSequence charsequence1, Bitmap bitmap, Bitmap bitmap1, boolean flag1)
	{
		notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) ((new android.app.Notification.BigPictureStyle(notificationbuilderwithbuilderaccessor.getBuilder())).setBigContentTitle(charsequence).bigPicture(bitmap)));
	//    0    0:new             #89  <Class android.app.Notification$BigPictureStyle>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #95  <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//    4   10:invokespecial   #98  <Method void android.app.Notification$BigPictureStyle(android.app.Notification$Builder)>
	//    5   13:aload_1         
	//    6   14:invokevirtual   #102 <Method android.app.Notification$BigPictureStyle android.app.Notification$BigPictureStyle.setBigContentTitle(CharSequence)>
	//    7   17:aload           4
	//    8   19:invokevirtual   #106 <Method android.app.Notification$BigPictureStyle android.app.Notification$BigPictureStyle.bigPicture(Bitmap)>
	//    9   22:astore_0        
		if(flag1)
	//*  10   23:iload           6
	//*  11   25:ifeq            35
			((android.app.Notification.BigPictureStyle) (notificationbuilderwithbuilderaccessor)).bigLargeIcon(bitmap1);
	//   12   28:aload_0         
	//   13   29:aload           5
	//   14   31:invokevirtual   #109 <Method android.app.Notification$BigPictureStyle android.app.Notification$BigPictureStyle.bigLargeIcon(Bitmap)>
	//   15   34:pop             
		if(flag)
	//*  16   35:iload_2         
	//*  17   36:ifeq            45
			((android.app.Notification.BigPictureStyle) (notificationbuilderwithbuilderaccessor)).setSummaryText(charsequence1);
	//   18   39:aload_0         
	//   19   40:aload_3         
	//   20   41:invokevirtual   #112 <Method android.app.Notification$BigPictureStyle android.app.Notification$BigPictureStyle.setSummaryText(CharSequence)>
	//   21   44:pop             
	//   22   45:return          
	}

	public static void addBigTextStyle(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, CharSequence charsequence, boolean flag, CharSequence charsequence1, CharSequence charsequence2)
	{
		notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) ((new android.app.Notification.BigTextStyle(notificationbuilderwithbuilderaccessor.getBuilder())).setBigContentTitle(charsequence).bigText(charsequence2)));
	//    0    0:new             #116 <Class android.app.Notification$BigTextStyle>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #95  <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//    4   10:invokespecial   #117 <Method void android.app.Notification$BigTextStyle(android.app.Notification$Builder)>
	//    5   13:aload_1         
	//    6   14:invokevirtual   #120 <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.setBigContentTitle(CharSequence)>
	//    7   17:aload           4
	//    8   19:invokevirtual   #123 <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.bigText(CharSequence)>
	//    9   22:astore_0        
		if(flag)
	//*  10   23:iload_2         
	//*  11   24:ifeq            33
			((android.app.Notification.BigTextStyle) (notificationbuilderwithbuilderaccessor)).setSummaryText(charsequence1);
	//   12   27:aload_0         
	//   13   28:aload_3         
	//   14   29:invokevirtual   #125 <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.setSummaryText(CharSequence)>
	//   15   32:pop             
	//   16   33:return          
	}

	public static void addInboxStyle(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, CharSequence charsequence, boolean flag, CharSequence charsequence1, ArrayList arraylist)
	{
		notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) ((new android.app.Notification.InboxStyle(notificationbuilderwithbuilderaccessor.getBuilder())).setBigContentTitle(charsequence)));
	//    0    0:new             #129 <Class android.app.Notification$InboxStyle>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #95  <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//    4   10:invokespecial   #130 <Method void android.app.Notification$InboxStyle(android.app.Notification$Builder)>
	//    5   13:aload_1         
	//    6   14:invokevirtual   #133 <Method android.app.Notification$InboxStyle android.app.Notification$InboxStyle.setBigContentTitle(CharSequence)>
	//    7   17:astore_0        
		if(flag)
	//*   8   18:iload_2         
	//*   9   19:ifeq            28
			((android.app.Notification.InboxStyle) (notificationbuilderwithbuilderaccessor)).setSummaryText(charsequence1);
	//   10   22:aload_0         
	//   11   23:aload_3         
	//   12   24:invokevirtual   #135 <Method android.app.Notification$InboxStyle android.app.Notification$InboxStyle.setSummaryText(CharSequence)>
	//   13   27:pop             
		for(charsequence = ((CharSequence) (arraylist.iterator())); ((Iterator) (charsequence)).hasNext(); ((android.app.Notification.InboxStyle) (notificationbuilderwithbuilderaccessor)).addLine((CharSequence)((Iterator) (charsequence)).next()));
	//   14   28:aload           4
	//   15   30:invokevirtual   #141 <Method Iterator ArrayList.iterator()>
	//   16   33:astore_1        
	//   17   34:aload_1         
	//   18   35:invokeinterface #147 <Method boolean Iterator.hasNext()>
	//   19   40:ifeq            60
	//   20   43:aload_0         
	//   21   44:aload_1         
	//   22   45:invokeinterface #151 <Method Object Iterator.next()>
	//   23   50:checkcast       #153 <Class CharSequence>
	//   24   53:invokevirtual   #156 <Method android.app.Notification$InboxStyle android.app.Notification$InboxStyle.addLine(CharSequence)>
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
	//*   5    5:invokeinterface #166 <Method int List.size()>
	//*   6   10:istore_2        
	//*   7   11:iload_1         
	//*   8   12:iload_2         
	//*   9   13:icmpge          70
		{
			Bundle bundle = (Bundle)list.get(i);
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:invokeinterface #170 <Method Object List.get(int)>
	//   13   23:checkcast       #172 <Class Bundle>
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
	//   23   43:new             #174 <Class SparseArray>
	//   24   46:dup             
	//   25   47:invokespecial   #175 <Method void SparseArray()>
	//   26   50:astore          4
				sparsearray1.put(i, ((Object) (bundle)));
	//   27   52:aload           4
	//   28   54:iload_1         
	//   29   55:aload           5
	//   30   57:invokevirtual   #179 <Method void SparseArray.put(int, Object)>
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
		if(sActionsAccessFailed)
	//*   0    0:getstatic       #187 <Field boolean sActionsAccessFailed>
	//*   1    3:ifeq            8
			return false;
	//    2    6:iconst_0        
	//    3    7:ireturn         
		try
		{
			if(sActionsField == null)
	//*   4    8:getstatic       #189 <Field Field sActionsField>
	//*   5   11:ifnonnull       72
			{
				sActionClass = Class.forName("android.app.Notification$Action");
	//    6   14:ldc1            #191 <String "android.app.Notification$Action">
	//    7   16:invokestatic    #197 <Method Class Class.forName(String)>
	//    8   19:putstatic       #199 <Field Class sActionClass>
				sActionIconField = sActionClass.getDeclaredField("icon");
	//    9   22:getstatic       #199 <Field Class sActionClass>
	//   10   25:ldc1            #50  <String "icon">
	//   11   27:invokevirtual   #203 <Method Field Class.getDeclaredField(String)>
	//   12   30:putstatic       #205 <Field Field sActionIconField>
				sActionTitleField = sActionClass.getDeclaredField("title");
	//   13   33:getstatic       #199 <Field Class sActionClass>
	//   14   36:ldc1            #56  <String "title">
	//   15   38:invokevirtual   #203 <Method Field Class.getDeclaredField(String)>
	//   16   41:putstatic       #207 <Field Field sActionTitleField>
				sActionIntentField = sActionClass.getDeclaredField("actionIntent");
	//   17   44:getstatic       #199 <Field Class sActionClass>
	//   18   47:ldc1            #41  <String "actionIntent">
	//   19   49:invokevirtual   #203 <Method Field Class.getDeclaredField(String)>
	//   20   52:putstatic       #209 <Field Field sActionIntentField>
				sActionsField = ((Class) (android/app/Notification)).getDeclaredField("actions");
	//   21   55:ldc1            #211 <Class Notification>
	//   22   57:ldc1            #213 <String "actions">
	//   23   59:invokevirtual   #203 <Method Field Class.getDeclaredField(String)>
	//   24   62:putstatic       #189 <Field Field sActionsField>
				sActionsField.setAccessible(true);
	//   25   65:getstatic       #189 <Field Field sActionsField>
	//   26   68:iconst_1        
	//   27   69:invokevirtual   #219 <Method void Field.setAccessible(boolean)>
			}
		}
	//*  28   72:goto            106
		catch(ClassNotFoundException classnotfoundexception)
	//*  29   75:astore_0        
		{
			Log.e("NotificationCompat", "Unable to access notification actions", ((Throwable) (classnotfoundexception)));
	//   30   76:ldc1            #59  <String "NotificationCompat">
	//   31   78:ldc1            #221 <String "Unable to access notification actions">
	//   32   80:aload_0         
	//   33   81:invokestatic    #227 <Method int Log.e(String, String, Throwable)>
	//   34   84:pop             
			sActionsAccessFailed = true;
	//   35   85:iconst_1        
	//   36   86:putstatic       #187 <Field boolean sActionsAccessFailed>
		}
	//*  37   89:goto            106
		catch(NoSuchFieldException nosuchfieldexception)
	//*  38   92:astore_0        
		{
			Log.e("NotificationCompat", "Unable to access notification actions", ((Throwable) (nosuchfieldexception)));
	//   39   93:ldc1            #59  <String "NotificationCompat">
	//   40   95:ldc1            #221 <String "Unable to access notification actions">
	//   41   97:aload_0         
	//   42   98:invokestatic    #227 <Method int Log.e(String, String, Throwable)>
	//   43  101:pop             
			sActionsAccessFailed = true;
	//   44  102:iconst_1        
	//   45  103:putstatic       #187 <Field boolean sActionsAccessFailed>
		}
		return !sActionsAccessFailed;
	//   46  106:getstatic       #187 <Field boolean sActionsAccessFailed>
	//   47  109:ifne            114
	//   48  112:iconst_1        
	//   49  113:ireturn         
	//   50  114:iconst_0        
	//   51  115:ireturn         
	}

	public static NotificationCompatBase.Action getAction(Notification notification, int i, NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
	{
		Object obj = sActionsLock;
	//    0    0:getstatic       #84  <Field Object sActionsLock>
	//    1    3:astore          5
		obj;
	//    2    5:aload           5
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		Object aobj[] = getActionObjectsLocked(notification);
	//    4    8:aload_0         
	//    5    9:invokestatic    #235 <Method Object[] getActionObjectsLocked(Notification)>
	//    6   12:astore          4
		Object obj1;
		if(aobj == null)
			break MISSING_BLOCK_LABEL_128;
	//    7   14:aload           4
	//    8   16:ifnull          111
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
	//   16   29:invokestatic    #239 <Method Bundle getExtras(Notification)>
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
	//   23   44:ldc1            #14  <String "android.support.actionExtras">
	//   24   46:invokevirtual   #243 <Method SparseArray Bundle.getSparseParcelableArray(String)>
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
	//   32   62:invokevirtual   #244 <Method Object SparseArray.get(int)>
	//   33   65:checkcast       #172 <Class Bundle>
	//   34   68:astore_0        
		notification = ((Notification) (readAction(factory, factory1, sActionIconField.getInt(obj1), (CharSequence)sActionTitleField.get(obj1), (PendingIntent)sActionIntentField.get(obj1), ((Bundle) (notification)))));
	//   35   69:aload_2         
	//   36   70:aload_3         
	//   37   71:getstatic       #205 <Field Field sActionIconField>
	//   38   74:aload           6
	//   39   76:invokevirtual   #248 <Method int Field.getInt(Object)>
	//   40   79:getstatic       #207 <Field Field sActionTitleField>
	//   41   82:aload           6
	//   42   84:invokevirtual   #251 <Method Object Field.get(Object)>
	//   43   87:checkcast       #153 <Class CharSequence>
	//   44   90:getstatic       #209 <Field Field sActionIntentField>
	//   45   93:aload           6
	//   46   95:invokevirtual   #251 <Method Object Field.get(Object)>
	//   47   98:checkcast       #253 <Class PendingIntent>
	//   48  101:aload_0         
	//   49  102:invokestatic    #257 <Method NotificationCompatBase$Action readAction(NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory, int, CharSequence, PendingIntent, Bundle)>
	//   50  105:astore_0        
		obj;
	//   51  106:aload           5
		JVM INSTR monitorexit ;
	//   52  108:monitorexit     
		return ((NotificationCompatBase.Action) (notification));
	//   53  109:aload_0         
	//   54  110:areturn         
	//*  55  111:goto            128
		notification;
	//   56  114:astore_0        
		Log.e("NotificationCompat", "Unable to access notification actions", ((Throwable) (notification)));
	//   57  115:ldc1            #59  <String "NotificationCompat">
	//   58  117:ldc1            #221 <String "Unable to access notification actions">
	//   59  119:aload_0         
	//   60  120:invokestatic    #227 <Method int Log.e(String, String, Throwable)>
	//   61  123:pop             
		sActionsAccessFailed = true;
	//   62  124:iconst_1        
	//   63  125:putstatic       #187 <Field boolean sActionsAccessFailed>
		obj;
	//   64  128:aload           5
		JVM INSTR monitorexit ;
	//   65  130:monitorexit     
		  goto _L1
	//*  66  131:goto            140
		notification;
	//   67  134:astore_0        
	//*  68  135:aload           5
		throw notification;
	//   69  137:monitorexit     
	//   70  138:aload_0         
	//   71  139:athrow          
_L1:
		return null;
	//   72  140:aconst_null     
	//   73  141:areturn         
	}

	public static int getActionCount(Notification notification)
	{
		Object obj = sActionsLock;
	//    0    0:getstatic       #84  <Field Object sActionsLock>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		notification = ((Notification) (getActionObjectsLocked(notification)));
	//    4    6:aload_0         
	//    5    7:invokestatic    #235 <Method Object[] getActionObjectsLocked(Notification)>
	//    6   10:astore_0        
		if(notification == null)
			break MISSING_BLOCK_LABEL_21;
	//    7   11:aload_0         
	//    8   12:ifnull          21
		int i;
		i = notification.length;
	//    9   15:aload_0         
	//   10   16:arraylength     
	//   11   17:istore_1        
		break MISSING_BLOCK_LABEL_23;
	//   12   18:goto            23
		i = 0;
	//   13   21:iconst_0        
	//   14   22:istore_1        
	//*  15   23:aload_2         
		return i;
	//   16   24:monitorexit     
	//   17   25:iload_1         
	//   18   26:ireturn         
		notification;
	//   19   27:astore_0        
	//*  20   28:aload_2         
		throw notification;
	//   21   29:monitorexit     
	//   22   30:aload_0         
	//   23   31:athrow          
	}

	private static NotificationCompatBase.Action getActionFromBundle(Bundle bundle, NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
	{
		Bundle bundle1 = bundle.getBundle("extras");
	//    0    0:aload_0         
	//    1    1:ldc1            #47  <String "extras">
	//    2    3:invokevirtual   #265 <Method Bundle Bundle.getBundle(String)>
	//    3    6:astore          4
		boolean flag = false;
	//    4    8:iconst_0        
	//    5    9:istore_3        
		if(bundle1 != null)
	//*   6   10:aload           4
	//*   7   12:ifnull          24
			flag = bundle1.getBoolean("android.support.allowGeneratedReplies", false);
	//    8   15:aload           4
	//    9   17:ldc1            #17  <String "android.support.allowGeneratedReplies">
	//   10   19:iconst_0        
	//   11   20:invokevirtual   #269 <Method boolean Bundle.getBoolean(String, boolean)>
	//   12   23:istore_3        
		return factory.build(bundle.getInt("icon"), bundle.getCharSequence("title"), (PendingIntent)bundle.getParcelable("actionIntent"), bundle.getBundle("extras"), RemoteInputCompatJellybean.fromBundleArray(BundleUtil.getBundleArrayFromBundle(bundle, "remoteInputs"), factory1), RemoteInputCompatJellybean.fromBundleArray(BundleUtil.getBundleArrayFromBundle(bundle, "dataOnlyRemoteInputs"), factory1), flag);
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:ldc1            #50  <String "icon">
	//   16   28:invokevirtual   #272 <Method int Bundle.getInt(String)>
	//   17   31:aload_0         
	//   18   32:ldc1            #56  <String "title">
	//   19   34:invokevirtual   #276 <Method CharSequence Bundle.getCharSequence(String)>
	//   20   37:aload_0         
	//   21   38:ldc1            #41  <String "actionIntent">
	//   22   40:invokevirtual   #280 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   23   43:checkcast       #253 <Class PendingIntent>
	//   24   46:aload_0         
	//   25   47:ldc1            #47  <String "extras">
	//   26   49:invokevirtual   #265 <Method Bundle Bundle.getBundle(String)>
	//   27   52:aload_0         
	//   28   53:ldc1            #53  <String "remoteInputs">
	//   29   55:invokestatic    #286 <Method Bundle[] BundleUtil.getBundleArrayFromBundle(Bundle, String)>
	//   30   58:aload_2         
	//   31   59:invokestatic    #292 <Method RemoteInputCompatBase$RemoteInput[] RemoteInputCompatJellybean.fromBundleArray(Bundle[], RemoteInputCompatBase$RemoteInput$Factory)>
	//   32   62:aload_0         
	//   33   63:ldc1            #44  <String "dataOnlyRemoteInputs">
	//   34   65:invokestatic    #286 <Method Bundle[] BundleUtil.getBundleArrayFromBundle(Bundle, String)>
	//   35   68:aload_2         
	//   36   69:invokestatic    #292 <Method RemoteInputCompatBase$RemoteInput[] RemoteInputCompatJellybean.fromBundleArray(Bundle[], RemoteInputCompatBase$RemoteInput$Factory)>
	//   37   72:iload_3         
	//   38   73:invokeinterface #298 <Method NotificationCompatBase$Action NotificationCompatBase$Action$Factory.build(int, CharSequence, PendingIntent, Bundle, RemoteInputCompatBase$RemoteInput[], RemoteInputCompatBase$RemoteInput[], boolean)>
	//   39   78:areturn         
	}

	private static Object[] getActionObjectsLocked(Notification notification)
	{
		Object obj = sActionsLock;
	//    0    0:getstatic       #84  <Field Object sActionsLock>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		boolean flag = ensureActionReflectionReadyLocked();
	//    4    6:invokestatic    #300 <Method boolean ensureActionReflectionReadyLocked()>
	//    5    9:istore_1        
		if(flag)
			break MISSING_BLOCK_LABEL_18;
	//    6   10:iload_1         
	//    7   11:ifne            18
		obj;
	//    8   14:aload_2         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return null;
	//   10   16:aconst_null     
	//   11   17:areturn         
		notification = ((Notification) ((Object[])(Object[])sActionsField.get(((Object) (notification)))));
	//   12   18:getstatic       #189 <Field Field sActionsField>
	//   13   21:aload_0         
	//   14   22:invokevirtual   #251 <Method Object Field.get(Object)>
	//   15   25:checkcast       #302 <Class Object[]>
	//   16   28:checkcast       #302 <Class Object[]>
	//   17   31:astore_0        
		obj;
	//   18   32:aload_2         
		JVM INSTR monitorexit ;
	//   19   33:monitorexit     
		return ((Object []) (notification));
	//   20   34:aload_0         
	//   21   35:areturn         
		notification;
	//   22   36:astore_0        
		Log.e("NotificationCompat", "Unable to access notification actions", ((Throwable) (notification)));
	//   23   37:ldc1            #59  <String "NotificationCompat">
	//   24   39:ldc1            #221 <String "Unable to access notification actions">
	//   25   41:aload_0         
	//   26   42:invokestatic    #227 <Method int Log.e(String, String, Throwable)>
	//   27   45:pop             
		sActionsAccessFailed = true;
	//   28   46:iconst_1        
	//   29   47:putstatic       #187 <Field boolean sActionsAccessFailed>
		obj;
	//   30   50:aload_2         
		JVM INSTR monitorexit ;
	//   31   51:monitorexit     
		return null;
	//   32   52:aconst_null     
	//   33   53:areturn         
		notification;
	//   34   54:astore_0        
	//*  35   55:aload_2         
		throw notification;
	//   36   56:monitorexit     
	//   37   57:aload_0         
	//   38   58:athrow          
	}

	public static NotificationCompatBase.Action[] getActionsFromParcelableArrayList(ArrayList arraylist, NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
	{
		if(arraylist == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		NotificationCompatBase.Action aaction[] = factory.newArray(arraylist.size());
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #305 <Method int ArrayList.size()>
	//    7   11:invokeinterface #309 <Method NotificationCompatBase$Action[] NotificationCompatBase$Action$Factory.newArray(int)>
	//    8   16:astore          4
		for(int i = 0; i < aaction.length; i++)
	//*   9   18:iconst_0        
	//*  10   19:istore_3        
	//*  11   20:iload_3         
	//*  12   21:aload           4
	//*  13   23:arraylength     
	//*  14   24:icmpge          51
			aaction[i] = getActionFromBundle((Bundle)arraylist.get(i), factory, factory1);
	//   15   27:aload           4
	//   16   29:iload_3         
	//   17   30:aload_0         
	//   18   31:iload_3         
	//   19   32:invokevirtual   #310 <Method Object ArrayList.get(int)>
	//   20   35:checkcast       #172 <Class Bundle>
	//   21   38:aload_1         
	//   22   39:aload_2         
	//   23   40:invokestatic    #312 <Method NotificationCompatBase$Action getActionFromBundle(Bundle, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
	//   24   43:aastore         

	//   25   44:iload_3         
	//   26   45:iconst_1        
	//   27   46:iadd            
	//   28   47:istore_3        
	//*  29   48:goto            20
		return aaction;
	//   30   51:aload           4
	//   31   53:areturn         
	}

	private static Bundle getBundleForAction(NotificationCompatBase.Action action)
	{
		Bundle bundle1 = new Bundle();
	//    0    0:new             #172 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #316 <Method void Bundle()>
	//    3    7:astore_2        
		bundle1.putInt("icon", action.getIcon());
	//    4    8:aload_2         
	//    5    9:ldc1            #50  <String "icon">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #321 <Method int NotificationCompatBase$Action.getIcon()>
	//    8   15:invokevirtual   #325 <Method void Bundle.putInt(String, int)>
		bundle1.putCharSequence("title", action.getTitle());
	//    9   18:aload_2         
	//   10   19:ldc1            #56  <String "title">
	//   11   21:aload_0         
	//   12   22:invokevirtual   #329 <Method CharSequence NotificationCompatBase$Action.getTitle()>
	//   13   25:invokevirtual   #333 <Method void Bundle.putCharSequence(String, CharSequence)>
		bundle1.putParcelable("actionIntent", ((android.os.Parcelable) (action.getActionIntent())));
	//   14   28:aload_2         
	//   15   29:ldc1            #41  <String "actionIntent">
	//   16   31:aload_0         
	//   17   32:invokevirtual   #337 <Method PendingIntent NotificationCompatBase$Action.getActionIntent()>
	//   18   35:invokevirtual   #341 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		Bundle bundle;
		if(action.getExtras() != null)
	//*  19   38:aload_0         
	//*  20   39:invokevirtual   #344 <Method Bundle NotificationCompatBase$Action.getExtras()>
	//*  21   42:ifnull          60
			bundle = new Bundle(action.getExtras());
	//   22   45:new             #172 <Class Bundle>
	//   23   48:dup             
	//   24   49:aload_0         
	//   25   50:invokevirtual   #344 <Method Bundle NotificationCompatBase$Action.getExtras()>
	//   26   53:invokespecial   #347 <Method void Bundle(Bundle)>
	//   27   56:astore_1        
		else
	//*  28   57:goto            68
			bundle = new Bundle();
	//   29   60:new             #172 <Class Bundle>
	//   30   63:dup             
	//   31   64:invokespecial   #316 <Method void Bundle()>
	//   32   67:astore_1        
		bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
	//   33   68:aload_1         
	//   34   69:ldc1            #17  <String "android.support.allowGeneratedReplies">
	//   35   71:aload_0         
	//   36   72:invokevirtual   #350 <Method boolean NotificationCompatBase$Action.getAllowGeneratedReplies()>
	//   37   75:invokevirtual   #354 <Method void Bundle.putBoolean(String, boolean)>
		bundle1.putBundle("extras", bundle);
	//   38   78:aload_2         
	//   39   79:ldc1            #47  <String "extras">
	//   40   81:aload_1         
	//   41   82:invokevirtual   #358 <Method void Bundle.putBundle(String, Bundle)>
		bundle1.putParcelableArray("remoteInputs", ((android.os.Parcelable []) (RemoteInputCompatJellybean.toBundleArray(action.getRemoteInputs()))));
	//   42   85:aload_2         
	//   43   86:ldc1            #53  <String "remoteInputs">
	//   44   88:aload_0         
	//   45   89:invokevirtual   #362 <Method RemoteInputCompatBase$RemoteInput[] NotificationCompatBase$Action.getRemoteInputs()>
	//   46   92:invokestatic    #366 <Method Bundle[] RemoteInputCompatJellybean.toBundleArray(RemoteInputCompatBase$RemoteInput[])>
	//   47   95:invokevirtual   #370 <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
		return bundle1;
	//   48   98:aload_2         
	//   49   99:areturn         
	}

	public static Bundle getExtras(Notification notification)
	{
		Object obj1 = sExtrasLock;
	//    0    0:getstatic       #82  <Field Object sExtrasLock>
	//    1    3:astore          4
		obj1;
	//    2    5:aload           4
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		boolean flag = sExtrasFieldAccessFailed;
	//    4    8:getstatic       #372 <Field boolean sExtrasFieldAccessFailed>
	//    5   11:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_21;
	//    6   12:iload_1         
	//    7   13:ifeq            21
		obj1;
	//    8   16:aload           4
		JVM INSTR monitorexit ;
	//    9   18:monitorexit     
		return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
		Object obj;
		if(sExtrasField != null)
			break MISSING_BLOCK_LABEL_74;
	//   12   21:getstatic       #374 <Field Field sExtrasField>
	//   13   24:ifnonnull       74
		obj = ((Object) (((Class) (android/app/Notification)).getDeclaredField("extras")));
	//   14   27:ldc1            #211 <Class Notification>
	//   15   29:ldc1            #47  <String "extras">
	//   16   31:invokevirtual   #203 <Method Field Class.getDeclaredField(String)>
	//   17   34:astore_2        
		if(((Class) (android/os/Bundle)).isAssignableFrom(((Field) (obj)).getType()))
			break MISSING_BLOCK_LABEL_65;
	//   18   35:ldc1            #172 <Class Bundle>
	//   19   37:aload_2         
	//   20   38:invokevirtual   #378 <Method Class Field.getType()>
	//   21   41:invokevirtual   #382 <Method boolean Class.isAssignableFrom(Class)>
	//   22   44:ifne            65
		Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
	//   23   47:ldc1            #59  <String "NotificationCompat">
	//   24   49:ldc2            #384 <String "Notification.extras field is not of type Bundle">
	//   25   52:invokestatic    #387 <Method int Log.e(String, String)>
	//   26   55:pop             
		sExtrasFieldAccessFailed = true;
	//   27   56:iconst_1        
	//   28   57:putstatic       #372 <Field boolean sExtrasFieldAccessFailed>
		obj1;
	//   29   60:aload           4
		JVM INSTR monitorexit ;
	//   30   62:monitorexit     
		return null;
	//   31   63:aconst_null     
	//   32   64:areturn         
		((Field) (obj)).setAccessible(true);
	//   33   65:aload_2         
	//   34   66:iconst_1        
	//   35   67:invokevirtual   #219 <Method void Field.setAccessible(boolean)>
		sExtrasField = ((Field) (obj));
	//   36   70:aload_2         
	//   37   71:putstatic       #374 <Field Field sExtrasField>
		Bundle bundle = (Bundle)sExtrasField.get(((Object) (notification)));
	//   38   74:getstatic       #374 <Field Field sExtrasField>
	//   39   77:aload_0         
	//   40   78:invokevirtual   #251 <Method Object Field.get(Object)>
	//   41   81:checkcast       #172 <Class Bundle>
	//   42   84:astore_3        
		obj = ((Object) (bundle));
	//   43   85:aload_3         
	//   44   86:astore_2        
		if(bundle != null)
			break MISSING_BLOCK_LABEL_107;
	//   45   87:aload_3         
	//   46   88:ifnonnull       107
		obj = ((Object) (new Bundle()));
	//   47   91:new             #172 <Class Bundle>
	//   48   94:dup             
	//   49   95:invokespecial   #316 <Method void Bundle()>
	//   50   98:astore_2        
		sExtrasField.set(((Object) (notification)), obj);
	//   51   99:getstatic       #374 <Field Field sExtrasField>
	//   52  102:aload_0         
	//   53  103:aload_2         
	//   54  104:invokevirtual   #391 <Method void Field.set(Object, Object)>
		obj1;
	//   55  107:aload           4
		JVM INSTR monitorexit ;
	//   56  109:monitorexit     
		return ((Bundle) (obj));
	//   57  110:aload_2         
	//   58  111:areturn         
		notification;
	//   59  112:astore_0        
		Log.e("NotificationCompat", "Unable to access notification extras", ((Throwable) (notification)));
	//   60  113:ldc1            #59  <String "NotificationCompat">
	//   61  115:ldc2            #393 <String "Unable to access notification extras">
	//   62  118:aload_0         
	//   63  119:invokestatic    #227 <Method int Log.e(String, String, Throwable)>
	//   64  122:pop             
		break MISSING_BLOCK_LABEL_137;
	//   65  123:goto            137
		notification;
	//   66  126:astore_0        
		Log.e("NotificationCompat", "Unable to access notification extras", ((Throwable) (notification)));
	//   67  127:ldc1            #59  <String "NotificationCompat">
	//   68  129:ldc2            #393 <String "Unable to access notification extras">
	//   69  132:aload_0         
	//   70  133:invokestatic    #227 <Method int Log.e(String, String, Throwable)>
	//   71  136:pop             
		sExtrasFieldAccessFailed = true;
	//   72  137:iconst_1        
	//   73  138:putstatic       #372 <Field boolean sExtrasFieldAccessFailed>
		obj1;
	//   74  141:aload           4
		JVM INSTR monitorexit ;
	//   75  143:monitorexit     
		return null;
	//   76  144:aconst_null     
	//   77  145:areturn         
		notification;
	//   78  146:astore_0        
	//*  79  147:aload           4
		throw notification;
	//   80  149:monitorexit     
	//   81  150:aload_0         
	//   82  151:athrow          
	}

	public static String getGroup(Notification notification)
	{
		return getExtras(notification).getString("android.support.groupKey");
	//    0    0:aload_0         
	//    1    1:invokestatic    #239 <Method Bundle getExtras(Notification)>
	//    2    4:ldc1            #23  <String "android.support.groupKey">
	//    3    6:invokevirtual   #399 <Method String Bundle.getString(String)>
	//    4    9:areturn         
	}

	public static boolean getLocalOnly(Notification notification)
	{
		return getExtras(notification).getBoolean("android.support.localOnly");
	//    0    0:aload_0         
	//    1    1:invokestatic    #239 <Method Bundle getExtras(Notification)>
	//    2    4:ldc1            #29  <String "android.support.localOnly">
	//    3    6:invokevirtual   #404 <Method boolean Bundle.getBoolean(String)>
	//    4    9:ireturn         
	}

	public static ArrayList getParcelableArrayListForActions(NotificationCompatBase.Action aaction[])
	{
		if(aaction == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		ArrayList arraylist = new ArrayList(aaction.length);
	//    4    6:new             #137 <Class ArrayList>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:arraylength     
	//    8   12:invokespecial   #409 <Method void ArrayList(int)>
	//    9   15:astore_3        
		int j = aaction.length;
	//   10   16:aload_0         
	//   11   17:arraylength     
	//   12   18:istore_2        
		for(int i = 0; i < j; i++)
	//*  13   19:iconst_0        
	//*  14   20:istore_1        
	//*  15   21:iload_1         
	//*  16   22:iload_2         
	//*  17   23:icmpge          44
			arraylist.add(((Object) (getBundleForAction(aaction[i]))));
	//   18   26:aload_3         
	//   19   27:aload_0         
	//   20   28:iload_1         
	//   21   29:aaload          
	//   22   30:invokestatic    #411 <Method Bundle getBundleForAction(NotificationCompatBase$Action)>
	//   23   33:invokevirtual   #415 <Method boolean ArrayList.add(Object)>
	//   24   36:pop             

	//   25   37:iload_1         
	//   26   38:iconst_1        
	//   27   39:iadd            
	//   28   40:istore_1        
	//*  29   41:goto            21
		return arraylist;
	//   30   44:aload_3         
	//   31   45:areturn         
	}

	public static String getSortKey(Notification notification)
	{
		return getExtras(notification).getString("android.support.sortKey");
	//    0    0:aload_0         
	//    1    1:invokestatic    #239 <Method Bundle getExtras(Notification)>
	//    2    4:ldc1            #35  <String "android.support.sortKey">
	//    3    6:invokevirtual   #399 <Method String Bundle.getString(String)>
	//    4    9:areturn         
	}

	public static boolean isGroupSummary(Notification notification)
	{
		return getExtras(notification).getBoolean("android.support.isGroupSummary");
	//    0    0:aload_0         
	//    1    1:invokestatic    #239 <Method Bundle getExtras(Notification)>
	//    2    4:ldc1            #26  <String "android.support.isGroupSummary">
	//    3    6:invokevirtual   #404 <Method boolean Bundle.getBoolean(String)>
	//    4    9:ireturn         
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
	//*   7   11:ifnull          49
		{
			aremoteinput = RemoteInputCompatJellybean.fromBundleArray(BundleUtil.getBundleArrayFromBundle(bundle, "android.support.remoteInputs"), factory1);
	//    8   14:aload           5
	//    9   16:ldc1            #32  <String "android.support.remoteInputs">
	//   10   18:invokestatic    #286 <Method Bundle[] BundleUtil.getBundleArrayFromBundle(Bundle, String)>
	//   11   21:aload_1         
	//   12   22:invokestatic    #292 <Method RemoteInputCompatBase$RemoteInput[] RemoteInputCompatJellybean.fromBundleArray(Bundle[], RemoteInputCompatBase$RemoteInput$Factory)>
	//   13   25:astore          7
			aremoteinput1 = RemoteInputCompatJellybean.fromBundleArray(BundleUtil.getBundleArrayFromBundle(bundle, "android.support.dataRemoteInputs"), factory1);
	//   14   27:aload           5
	//   15   29:ldc1            #20  <String "android.support.dataRemoteInputs">
	//   16   31:invokestatic    #286 <Method Bundle[] BundleUtil.getBundleArrayFromBundle(Bundle, String)>
	//   17   34:aload_1         
	//   18   35:invokestatic    #292 <Method RemoteInputCompatBase$RemoteInput[] RemoteInputCompatJellybean.fromBundleArray(Bundle[], RemoteInputCompatBase$RemoteInput$Factory)>
	//   19   38:astore          8
			flag = bundle.getBoolean("android.support.allowGeneratedReplies");
	//   20   40:aload           5
	//   21   42:ldc1            #17  <String "android.support.allowGeneratedReplies">
	//   22   44:invokevirtual   #404 <Method boolean Bundle.getBoolean(String)>
	//   23   47:istore          6
		}
		return factory.build(i, charsequence, pendingintent, bundle, aremoteinput, aremoteinput1, flag);
	//   24   49:aload_0         
	//   25   50:iload_2         
	//   26   51:aload_3         
	//   27   52:aload           4
	//   28   54:aload           5
	//   29   56:aload           7
	//   30   58:aload           8
	//   31   60:iload           6
	//   32   62:invokeinterface #298 <Method NotificationCompatBase$Action NotificationCompatBase$Action$Factory.build(int, CharSequence, PendingIntent, Bundle, RemoteInputCompatBase$RemoteInput[], RemoteInputCompatBase$RemoteInput[], boolean)>
	//   33   67:areturn         
	}

	public static Bundle writeActionAndGetExtras(android.app.Notification.Builder builder, NotificationCompatBase.Action action)
	{
		builder.addAction(action.getIcon(), action.getTitle(), action.getActionIntent());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #321 <Method int NotificationCompatBase$Action.getIcon()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #329 <Method CharSequence NotificationCompatBase$Action.getTitle()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #337 <Method PendingIntent NotificationCompatBase$Action.getActionIntent()>
	//    7   13:invokevirtual   #426 <Method android.app.Notification$Builder android.app.Notification$Builder.addAction(int, CharSequence, PendingIntent)>
	//    8   16:pop             
		builder = ((android.app.Notification.Builder) (new Bundle(action.getExtras())));
	//    9   17:new             #172 <Class Bundle>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokevirtual   #344 <Method Bundle NotificationCompatBase$Action.getExtras()>
	//   13   25:invokespecial   #347 <Method void Bundle(Bundle)>
	//   14   28:astore_0        
		if(action.getRemoteInputs() != null)
	//*  15   29:aload_1         
	//*  16   30:invokevirtual   #362 <Method RemoteInputCompatBase$RemoteInput[] NotificationCompatBase$Action.getRemoteInputs()>
	//*  17   33:ifnull          49
			((Bundle) (builder)).putParcelableArray("android.support.remoteInputs", ((android.os.Parcelable []) (RemoteInputCompatJellybean.toBundleArray(action.getRemoteInputs()))));
	//   18   36:aload_0         
	//   19   37:ldc1            #32  <String "android.support.remoteInputs">
	//   20   39:aload_1         
	//   21   40:invokevirtual   #362 <Method RemoteInputCompatBase$RemoteInput[] NotificationCompatBase$Action.getRemoteInputs()>
	//   22   43:invokestatic    #366 <Method Bundle[] RemoteInputCompatJellybean.toBundleArray(RemoteInputCompatBase$RemoteInput[])>
	//   23   46:invokevirtual   #370 <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
		if(action.getDataOnlyRemoteInputs() != null)
	//*  24   49:aload_1         
	//*  25   50:invokevirtual   #429 <Method RemoteInputCompatBase$RemoteInput[] NotificationCompatBase$Action.getDataOnlyRemoteInputs()>
	//*  26   53:ifnull          69
			((Bundle) (builder)).putParcelableArray("android.support.dataRemoteInputs", ((android.os.Parcelable []) (RemoteInputCompatJellybean.toBundleArray(action.getDataOnlyRemoteInputs()))));
	//   27   56:aload_0         
	//   28   57:ldc1            #20  <String "android.support.dataRemoteInputs">
	//   29   59:aload_1         
	//   30   60:invokevirtual   #429 <Method RemoteInputCompatBase$RemoteInput[] NotificationCompatBase$Action.getDataOnlyRemoteInputs()>
	//   31   63:invokestatic    #366 <Method Bundle[] RemoteInputCompatJellybean.toBundleArray(RemoteInputCompatBase$RemoteInput[])>
	//   32   66:invokevirtual   #370 <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
		((Bundle) (builder)).putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
	//   33   69:aload_0         
	//   34   70:ldc1            #17  <String "android.support.allowGeneratedReplies">
	//   35   72:aload_1         
	//   36   73:invokevirtual   #350 <Method boolean NotificationCompatBase$Action.getAllowGeneratedReplies()>
	//   37   76:invokevirtual   #354 <Method void Bundle.putBoolean(String, boolean)>
		return ((Bundle) (builder));
	//   38   79:aload_0         
	//   39   80:areturn         
	}

	static final String EXTRA_ACTION_EXTRAS = "android.support.actionExtras";
	static final String EXTRA_ALLOW_GENERATED_REPLIES = "android.support.allowGeneratedReplies";
	static final String EXTRA_DATA_ONLY_REMOTE_INPUTS = "android.support.dataRemoteInputs";
	static final String EXTRA_GROUP_KEY = "android.support.groupKey";
	static final String EXTRA_GROUP_SUMMARY = "android.support.isGroupSummary";
	static final String EXTRA_LOCAL_ONLY = "android.support.localOnly";
	static final String EXTRA_REMOTE_INPUTS = "android.support.remoteInputs";
	static final String EXTRA_SORT_KEY = "android.support.sortKey";
	static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
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
	private static boolean sActionsAccessFailed = false;
	private static Field sActionsField;
	private static final Object sActionsLock = new Object();
	private static Field sExtrasField;
	private static boolean sExtrasFieldAccessFailed = false;
	private static final Object sExtrasLock = new Object();

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #80  <Method void Object()>
	//    3    7:putstatic       #82  <Field Object sExtrasLock>
	//    4   10:new             #4   <Class Object>
	//    5   13:dup             
	//    6   14:invokespecial   #80  <Method void Object()>
	//    7   17:putstatic       #84  <Field Object sActionsLock>
	//*   8   20:return          
	}
}
