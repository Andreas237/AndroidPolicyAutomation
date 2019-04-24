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
		implements NotificationBuilderWithActions, NotificationBuilderWithBuilderAccessor
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
			int i1 = notification.flags;
		//   42   91:aload_2         
		//   43   92:getfield        #107 <Field int Notification.flags>
		//   44   95:istore          24
			boolean flag5 = false;
		//   45   97:iconst_0        
		//   46   98:istore          26
			boolean flag4;
			if((i1 & 2) != 0)
		//*  47  100:iload           24
		//*  48  102:iconst_2        
		//*  49  103:iand            
		//*  50  104:ifeq            113
				flag4 = true;
		//   51  107:iconst_1        
		//   52  108:istore          25
			else
		//*  53  110:goto            116
				flag4 = false;
		//   54  113:iconst_0        
		//   55  114:istore          25
			context = ((Context) (((android.app.Notification.Builder) (context)).setOngoing(flag4)));
		//   56  116:aload_1         
		//   57  117:iload           25
		//   58  119:invokevirtual   #111 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
		//   59  122:astore_1        
			if((notification.flags & 8) != 0)
		//*  60  123:aload_2         
		//*  61  124:getfield        #107 <Field int Notification.flags>
		//*  62  127:bipush          8
		//*  63  129:iand            
		//*  64  130:ifeq            139
				flag4 = true;
		//   65  133:iconst_1        
		//   66  134:istore          25
			else
		//*  67  136:goto            142
				flag4 = false;
		//   68  139:iconst_0        
		//   69  140:istore          25
			context = ((Context) (((android.app.Notification.Builder) (context)).setOnlyAlertOnce(flag4)));
		//   70  142:aload_1         
		//   71  143:iload           25
		//   72  145:invokevirtual   #114 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
		//   73  148:astore_1        
			if((notification.flags & 0x10) != 0)
		//*  74  149:aload_2         
		//*  75  150:getfield        #107 <Field int Notification.flags>
		//*  76  153:bipush          16
		//*  77  155:iand            
		//*  78  156:ifeq            165
				flag4 = true;
		//   79  159:iconst_1        
		//   80  160:istore          25
			else
		//*  81  162:goto            168
				flag4 = false;
		//   82  165:iconst_0        
		//   83  166:istore          25
			context = ((Context) (((android.app.Notification.Builder) (context)).setAutoCancel(flag4).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setSubText(charsequence3).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent)));
		//   84  168:aload_1         
		//   85  169:iload           25
		//   86  171:invokevirtual   #117 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
		//   87  174:aload_2         
		//   88  175:getfield        #120 <Field int Notification.defaults>
		//   89  178:invokevirtual   #124 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
		//   90  181:aload_3         
		//   91  182:invokevirtual   #128 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
		//   92  185:aload           4
		//   93  187:invokevirtual   #131 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
		//   94  190:aload           16
		//   95  192:invokevirtual   #134 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
		//   96  195:aload           5
		//   97  197:invokevirtual   #137 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
		//   98  200:aload           8
		//   99  202:invokevirtual   #141 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
		//  100  205:aload_2         
		//  101  206:getfield        #145 <Field PendingIntent Notification.deleteIntent>
		//  102  209:invokevirtual   #148 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
		//  103  212:astore_1        
			if((notification.flags & 0x80) != 0)
		//* 104  213:aload_2         
		//* 105  214:getfield        #107 <Field int Notification.flags>
		//* 106  217:sipush          128
		//* 107  220:iand            
		//* 108  221:ifeq            230
				flag4 = true;
		//  109  224:iconst_1        
		//  110  225:istore          25
			else
		//* 111  227:goto            234
				flag4 = flag5;
		//  112  230:iload           26
		//  113  232:istore          25
			b = ((android.app.Notification.Builder) (context)).setFullScreenIntent(pendingintent1, flag4).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag1).setPriority(l).setProgress(j, k, flag);
		//  114  234:aload_0         
		//  115  235:aload_1         
		//  116  236:aload           9
		//  117  238:iload           25
		//  118  240:invokevirtual   #152 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
		//  119  243:aload           10
		//  120  245:invokevirtual   #156 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
		//  121  248:iload           7
		//  122  250:invokevirtual   #159 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
		//  123  253:iload           14
		//  124  255:invokevirtual   #162 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
		//  125  258:iload           15
		//  126  260:invokevirtual   #165 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
		//  127  263:iload           11
		//  128  265:iload           12
		//  129  267:iload           13
		//  130  269:invokevirtual   #169 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
		//  131  272:putfield        #171 <Field android.app.Notification$Builder b>
		//  132  275:aload_0         
		//  133  276:new             #173 <Class Bundle>
		//  134  279:dup             
		//  135  280:invokespecial   #174 <Method void Bundle()>
		//  136  283:putfield        #176 <Field Bundle mExtras>
			if(bundle != null)
		//* 137  286:aload           18
		//* 138  288:ifnull          300
				mExtras.putAll(bundle);
		//  139  291:aload_0         
		//  140  292:getfield        #176 <Field Bundle mExtras>
		//  141  295:aload           18
		//  142  297:invokevirtual   #180 <Method void Bundle.putAll(Bundle)>
			if(flag2)
		//* 143  300:iload           17
		//* 144  302:ifeq            315
				mExtras.putBoolean("android.support.localOnly", true);
		//  145  305:aload_0         
		//  146  306:getfield        #176 <Field Bundle mExtras>
		//  147  309:ldc1            #182 <String "android.support.localOnly">
		//  148  311:iconst_1        
		//  149  312:invokevirtual   #186 <Method void Bundle.putBoolean(String, boolean)>
			if(s != null)
		//* 150  315:aload           19
		//* 151  317:ifnull          364
			{
				mExtras.putString("android.support.groupKey", s);
		//  152  320:aload_0         
		//  153  321:getfield        #176 <Field Bundle mExtras>
		//  154  324:ldc1            #188 <String "android.support.groupKey">
		//  155  326:aload           19
		//  156  328:invokevirtual   #192 <Method void Bundle.putString(String, String)>
				if(flag3)
		//* 157  331:iload           20
		//* 158  333:ifeq            353
				{
					context = ((Context) (mExtras));
		//  159  336:aload_0         
		//  160  337:getfield        #176 <Field Bundle mExtras>
		//  161  340:astore_1        
					notification = "android.support.isGroupSummary";
		//  162  341:ldc1            #194 <String "android.support.isGroupSummary">
		//  163  343:astore_2        
				} else
		//* 164  344:aload_1         
		//* 165  345:aload_2         
		//* 166  346:iconst_1        
		//* 167  347:invokevirtual   #186 <Method void Bundle.putBoolean(String, boolean)>
		//* 168  350:goto            364
				{
					context = ((Context) (mExtras));
		//  169  353:aload_0         
		//  170  354:getfield        #176 <Field Bundle mExtras>
		//  171  357:astore_1        
					notification = "android.support.useSideChannel";
		//  172  358:ldc1            #196 <String "android.support.useSideChannel">
		//  173  360:astore_2        
				}
				((Bundle) (context)).putBoolean(((String) (notification)), true);
			}
		//* 174  361:goto            344
			if(s1 != null)
		//* 175  364:aload           21
		//* 176  366:ifnull          380
				mExtras.putString("android.support.sortKey", s1);
		//  177  369:aload_0         
		//  178  370:getfield        #176 <Field Bundle mExtras>
		//  179  373:ldc1            #198 <String "android.support.sortKey">
		//  180  375:aload           21
		//  181  377:invokevirtual   #192 <Method void Bundle.putString(String, String)>
			mContentView = remoteviews1;
		//  182  380:aload_0         
		//  183  381:aload           22
		//  184  383:putfield        #200 <Field RemoteViews mContentView>
			mBigContentView = remoteviews2;
		//  185  386:aload_0         
		//  186  387:aload           23
		//  187  389:putfield        #202 <Field RemoteViews mBigContentView>
		//  188  392:return          
		}
	}


	NotificationCompatJellybean()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void Object()>
	//    2    4:return          
	}

	public static void addBigPictureStyle(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, CharSequence charsequence, boolean flag, CharSequence charsequence1, Bitmap bitmap, Bitmap bitmap1, boolean flag1)
	{
		notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) ((new android.app.Notification.BigPictureStyle(notificationbuilderwithbuilderaccessor.getBuilder())).setBigContentTitle(charsequence).bigPicture(bitmap)));
	//    0    0:new             #64  <Class android.app.Notification$BigPictureStyle>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #70  <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//    4   10:invokespecial   #73  <Method void android.app.Notification$BigPictureStyle(android.app.Notification$Builder)>
	//    5   13:aload_1         
	//    6   14:invokevirtual   #77  <Method android.app.Notification$BigPictureStyle android.app.Notification$BigPictureStyle.setBigContentTitle(CharSequence)>
	//    7   17:aload           4
	//    8   19:invokevirtual   #81  <Method android.app.Notification$BigPictureStyle android.app.Notification$BigPictureStyle.bigPicture(Bitmap)>
	//    9   22:astore_0        
		if(flag1)
	//*  10   23:iload           6
	//*  11   25:ifeq            35
			((android.app.Notification.BigPictureStyle) (notificationbuilderwithbuilderaccessor)).bigLargeIcon(bitmap1);
	//   12   28:aload_0         
	//   13   29:aload           5
	//   14   31:invokevirtual   #84  <Method android.app.Notification$BigPictureStyle android.app.Notification$BigPictureStyle.bigLargeIcon(Bitmap)>
	//   15   34:pop             
		if(flag)
	//*  16   35:iload_2         
	//*  17   36:ifeq            45
			((android.app.Notification.BigPictureStyle) (notificationbuilderwithbuilderaccessor)).setSummaryText(charsequence1);
	//   18   39:aload_0         
	//   19   40:aload_3         
	//   20   41:invokevirtual   #87  <Method android.app.Notification$BigPictureStyle android.app.Notification$BigPictureStyle.setSummaryText(CharSequence)>
	//   21   44:pop             
	//   22   45:return          
	}

	public static void addBigTextStyle(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, CharSequence charsequence, boolean flag, CharSequence charsequence1, CharSequence charsequence2)
	{
		notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) ((new android.app.Notification.BigTextStyle(notificationbuilderwithbuilderaccessor.getBuilder())).setBigContentTitle(charsequence).bigText(charsequence2)));
	//    0    0:new             #91  <Class android.app.Notification$BigTextStyle>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #70  <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//    4   10:invokespecial   #92  <Method void android.app.Notification$BigTextStyle(android.app.Notification$Builder)>
	//    5   13:aload_1         
	//    6   14:invokevirtual   #95  <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.setBigContentTitle(CharSequence)>
	//    7   17:aload           4
	//    8   19:invokevirtual   #98  <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.bigText(CharSequence)>
	//    9   22:astore_0        
		if(flag)
	//*  10   23:iload_2         
	//*  11   24:ifeq            33
			((android.app.Notification.BigTextStyle) (notificationbuilderwithbuilderaccessor)).setSummaryText(charsequence1);
	//   12   27:aload_0         
	//   13   28:aload_3         
	//   14   29:invokevirtual   #100 <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.setSummaryText(CharSequence)>
	//   15   32:pop             
	//   16   33:return          
	}

	public static void addInboxStyle(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, CharSequence charsequence, boolean flag, CharSequence charsequence1, ArrayList arraylist)
	{
		notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) ((new android.app.Notification.InboxStyle(notificationbuilderwithbuilderaccessor.getBuilder())).setBigContentTitle(charsequence)));
	//    0    0:new             #104 <Class android.app.Notification$InboxStyle>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #70  <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//    4   10:invokespecial   #105 <Method void android.app.Notification$InboxStyle(android.app.Notification$Builder)>
	//    5   13:aload_1         
	//    6   14:invokevirtual   #108 <Method android.app.Notification$InboxStyle android.app.Notification$InboxStyle.setBigContentTitle(CharSequence)>
	//    7   17:astore_0        
		if(flag)
	//*   8   18:iload_2         
	//*   9   19:ifeq            28
			((android.app.Notification.InboxStyle) (notificationbuilderwithbuilderaccessor)).setSummaryText(charsequence1);
	//   10   22:aload_0         
	//   11   23:aload_3         
	//   12   24:invokevirtual   #110 <Method android.app.Notification$InboxStyle android.app.Notification$InboxStyle.setSummaryText(CharSequence)>
	//   13   27:pop             
		for(charsequence = ((CharSequence) (arraylist.iterator())); ((Iterator) (charsequence)).hasNext(); ((android.app.Notification.InboxStyle) (notificationbuilderwithbuilderaccessor)).addLine((CharSequence)((Iterator) (charsequence)).next()));
	//   14   28:aload           4
	//   15   30:invokevirtual   #116 <Method Iterator ArrayList.iterator()>
	//   16   33:astore_1        
	//   17   34:aload_1         
	//   18   35:invokeinterface #122 <Method boolean Iterator.hasNext()>
	//   19   40:ifeq            60
	//   20   43:aload_0         
	//   21   44:aload_1         
	//   22   45:invokeinterface #126 <Method Object Iterator.next()>
	//   23   50:checkcast       #128 <Class CharSequence>
	//   24   53:invokevirtual   #131 <Method android.app.Notification$InboxStyle android.app.Notification$InboxStyle.addLine(CharSequence)>
	//   25   56:pop             
	//*  26   57:goto            34
	//   27   60:return          
	}

	public static SparseArray buildActionExtrasMap(List list)
	{
		int j = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #141 <Method int List.size()>
	//    2    6:istore_2        
		SparseArray sparsearray = null;
	//    3    7:aconst_null     
	//    4    8:astore_3        
		for(int i = 0; i < j;)
	//*   5    9:iconst_0        
	//*   6   10:istore_1        
	//*   7   11:iload_1         
	//*   8   12:iload_2         
	//*   9   13:icmpge          70
		{
			Bundle bundle = (Bundle)list.get(i);
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:invokeinterface #145 <Method Object List.get(int)>
	//   13   23:checkcast       #147 <Class Bundle>
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
	//   23   43:new             #149 <Class SparseArray>
	//   24   46:dup             
	//   25   47:invokespecial   #150 <Method void SparseArray()>
	//   26   50:astore          4
				sparsearray1.put(i, ((Object) (bundle)));
	//   27   52:aload           4
	//   28   54:iload_1         
	//   29   55:aload           5
	//   30   57:invokevirtual   #154 <Method void SparseArray.put(int, Object)>
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
	//*   0    0:getstatic       #162 <Field boolean sActionsAccessFailed>
	//*   1    3:ifeq            8
			return false;
	//    2    6:iconst_0        
	//    3    7:ireturn         
		try
		{
			if(sActionsField == null)
	//*   4    8:getstatic       #164 <Field Field sActionsField>
	//*   5   11:ifnonnull       89
			{
				sActionClass = Class.forName("android.app.Notification$Action");
	//    6   14:ldc1            #166 <String "android.app.Notification$Action">
	//    7   16:invokestatic    #172 <Method Class Class.forName(String)>
	//    8   19:putstatic       #174 <Field Class sActionClass>
				sActionIconField = sActionClass.getDeclaredField("icon");
	//    9   22:getstatic       #174 <Field Class sActionClass>
	//   10   25:ldc1            #26  <String "icon">
	//   11   27:invokevirtual   #178 <Method Field Class.getDeclaredField(String)>
	//   12   30:putstatic       #180 <Field Field sActionIconField>
				sActionTitleField = sActionClass.getDeclaredField("title");
	//   13   33:getstatic       #174 <Field Class sActionClass>
	//   14   36:ldc1            #32  <String "title">
	//   15   38:invokevirtual   #178 <Method Field Class.getDeclaredField(String)>
	//   16   41:putstatic       #182 <Field Field sActionTitleField>
				sActionIntentField = sActionClass.getDeclaredField("actionIntent");
	//   17   44:getstatic       #174 <Field Class sActionClass>
	//   18   47:ldc1            #17  <String "actionIntent">
	//   19   49:invokevirtual   #178 <Method Field Class.getDeclaredField(String)>
	//   20   52:putstatic       #184 <Field Field sActionIntentField>
				sActionsField = ((Class) (android/app/Notification)).getDeclaredField("actions");
	//   21   55:ldc1            #186 <Class Notification>
	//   22   57:ldc1            #188 <String "actions">
	//   23   59:invokevirtual   #178 <Method Field Class.getDeclaredField(String)>
	//   24   62:putstatic       #164 <Field Field sActionsField>
				sActionsField.setAccessible(true);
	//   25   65:getstatic       #164 <Field Field sActionsField>
	//   26   68:iconst_1        
	//   27   69:invokevirtual   #194 <Method void Field.setAccessible(boolean)>
			}
		}
	//*  28   72:goto            89
		catch(Object obj)
	//*  29   75:astore_0        
		{
			Log.e("NotificationCompat", "Unable to access notification actions", ((Throwable) (obj)));
	//   30   76:ldc1            #35  <String "NotificationCompat">
	//   31   78:ldc1            #196 <String "Unable to access notification actions">
	//   32   80:aload_0         
	//   33   81:invokestatic    #202 <Method int Log.e(String, String, Throwable)>
	//   34   84:pop             
			sActionsAccessFailed = true;
	//   35   85:iconst_1        
	//   36   86:putstatic       #162 <Field boolean sActionsAccessFailed>
		}
		return true ^ sActionsAccessFailed;
	//   37   89:iconst_1        
	//   38   90:getstatic       #162 <Field boolean sActionsAccessFailed>
	//   39   93:ixor            
	//   40   94:ireturn         
	}

	public static NotificationCompatBase.Action getAction(Notification notification, int i, NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
	{
		Object obj = sActionsLock;
	//    0    0:getstatic       #59  <Field Object sActionsLock>
	//    1    3:astore          4
		obj;
	//    2    5:aload           4
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		Object aobj[] = getActionObjectsLocked(notification);
	//    4    8:aload_0         
	//    5    9:invokestatic    #210 <Method Object[] getActionObjectsLocked(Notification)>
	//    6   12:astore          5
		if(aobj == null) goto _L2; else goto _L1
	//    7   14:aload           5
	//    8   16:ifnull          113
_L1:
		Object obj1 = aobj[i];
	//    9   19:aload           5
	//   10   21:iload_1         
	//   11   22:aaload          
	//   12   23:astore          5
		notification = ((Notification) (getExtras(notification)));
	//   13   25:aload_0         
	//   14   26:invokestatic    #214 <Method Bundle getExtras(Notification)>
	//   15   29:astore_0        
		if(notification == null) goto _L4; else goto _L3
	//   16   30:aload_0         
	//   17   31:ifnull          123
_L3:
		notification = ((Notification) (((Bundle) (notification)).getSparseParcelableArray("android.support.actionExtras")));
	//   18   34:aload_0         
	//   19   35:ldc1            #216 <String "android.support.actionExtras">
	//   20   37:invokevirtual   #220 <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//   21   40:astore_0        
		if(notification == null) goto _L4; else goto _L5
	//   22   41:aload_0         
	//   23   42:ifnull          123
_L5:
		notification = ((Notification) ((Bundle)((SparseArray) (notification)).get(i)));
	//   24   45:aload_0         
	//   25   46:iload_1         
	//   26   47:invokevirtual   #221 <Method Object SparseArray.get(int)>
	//   27   50:checkcast       #147 <Class Bundle>
	//   28   53:astore_0        
	//*  29   54:goto            57
_L6:
		notification = ((Notification) (readAction(factory, factory1, sActionIconField.getInt(obj1), (CharSequence)sActionTitleField.get(obj1), (PendingIntent)sActionIntentField.get(obj1), ((Bundle) (notification)))));
	//   30   57:aload_2         
	//   31   58:aload_3         
	//   32   59:getstatic       #180 <Field Field sActionIconField>
	//   33   62:aload           5
	//   34   64:invokevirtual   #225 <Method int Field.getInt(Object)>
	//   35   67:getstatic       #182 <Field Field sActionTitleField>
	//   36   70:aload           5
	//   37   72:invokevirtual   #228 <Method Object Field.get(Object)>
	//   38   75:checkcast       #128 <Class CharSequence>
	//   39   78:getstatic       #184 <Field Field sActionIntentField>
	//   40   81:aload           5
	//   41   83:invokevirtual   #228 <Method Object Field.get(Object)>
	//   42   86:checkcast       #230 <Class PendingIntent>
	//   43   89:aload_0         
	//   44   90:invokestatic    #234 <Method NotificationCompatBase$Action readAction(NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory, int, CharSequence, PendingIntent, Bundle)>
	//   45   93:astore_0        
		obj;
	//   46   94:aload           4
		JVM INSTR monitorexit ;
	//   47   96:monitorexit     
		return ((NotificationCompatBase.Action) (notification));
	//   48   97:aload_0         
	//   49   98:areturn         
		notification;
	//   50   99:astore_0        
		Log.e("NotificationCompat", "Unable to access notification actions", ((Throwable) (notification)));
	//   51  100:ldc1            #35  <String "NotificationCompat">
	//   52  102:ldc1            #196 <String "Unable to access notification actions">
	//   53  104:aload_0         
	//   54  105:invokestatic    #202 <Method int Log.e(String, String, Throwable)>
	//   55  108:pop             
		sActionsAccessFailed = true;
	//   56  109:iconst_1        
	//   57  110:putstatic       #162 <Field boolean sActionsAccessFailed>
_L2:
		obj;
	//   58  113:aload           4
		JVM INSTR monitorexit ;
	//   59  115:monitorexit     
		return null;
	//   60  116:aconst_null     
	//   61  117:areturn         
_L7:
		obj;
	//   62  118:aload           4
		JVM INSTR monitorexit ;
	//   63  120:monitorexit     
		throw notification;
	//   64  121:aload_0         
	//   65  122:athrow          
_L4:
		notification = null;
	//   66  123:aconst_null     
	//   67  124:astore_0        
		  goto _L6
	//*  68  125:goto            57
		notification;
	//   69  128:astore_0        
		  goto _L7
	//*  70  129:goto            118
	}

	public static int getActionCount(Notification notification)
	{
		Object obj = sActionsLock;
	//    0    0:getstatic       #59  <Field Object sActionsLock>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		notification = ((Notification) (getActionObjectsLocked(notification)));
	//    4    6:aload_0         
	//    5    7:invokestatic    #210 <Method Object[] getActionObjectsLocked(Notification)>
	//    6   10:astore_0        
		if(notification == null) goto _L2; else goto _L1
	//    7   11:aload_0         
	//    8   12:ifnull          30
_L1:
		int i = notification.length;
	//    9   15:aload_0         
	//   10   16:arraylength     
	//   11   17:istore_1        
	//*  12   18:goto            21
_L4:
		obj;
	//   13   21:aload_2         
		JVM INSTR monitorexit ;
	//   14   22:monitorexit     
		return i;
	//   15   23:iload_1         
	//   16   24:ireturn         
		notification;
	//   17   25:astore_0        
		obj;
	//   18   26:aload_2         
		JVM INSTR monitorexit ;
	//   19   27:monitorexit     
		throw notification;
	//   20   28:aload_0         
	//   21   29:athrow          
_L2:
		i = 0;
	//   22   30:iconst_0        
	//   23   31:istore_1        
		if(true) goto _L4; else goto _L3
	//   24   32:goto            21
_L3:
	}

	private static NotificationCompatBase.Action getActionFromBundle(Bundle bundle, NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
	{
		Bundle bundle1 = bundle.getBundle("extras");
	//    0    0:aload_0         
	//    1    1:ldc1            #23  <String "extras">
	//    2    3:invokevirtual   #242 <Method Bundle Bundle.getBundle(String)>
	//    3    6:astore          4
		boolean flag;
		if(bundle1 != null)
	//*   4    8:aload           4
	//*   5   10:ifnull          25
			flag = bundle1.getBoolean("android.support.allowGeneratedReplies", false);
	//    6   13:aload           4
	//    7   15:ldc1            #11  <String "android.support.allowGeneratedReplies">
	//    8   17:iconst_0        
	//    9   18:invokevirtual   #246 <Method boolean Bundle.getBoolean(String, boolean)>
	//   10   21:istore_3        
		else
	//*  11   22:goto            27
			flag = false;
	//   12   25:iconst_0        
	//   13   26:istore_3        
		return factory.build(bundle.getInt("icon"), bundle.getCharSequence("title"), (PendingIntent)bundle.getParcelable("actionIntent"), bundle.getBundle("extras"), RemoteInputCompatJellybean.fromBundleArray(BundleUtil.getBundleArrayFromBundle(bundle, "remoteInputs"), factory1), RemoteInputCompatJellybean.fromBundleArray(BundleUtil.getBundleArrayFromBundle(bundle, "dataOnlyRemoteInputs"), factory1), flag);
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:ldc1            #26  <String "icon">
	//   17   31:invokevirtual   #249 <Method int Bundle.getInt(String)>
	//   18   34:aload_0         
	//   19   35:ldc1            #32  <String "title">
	//   20   37:invokevirtual   #253 <Method CharSequence Bundle.getCharSequence(String)>
	//   21   40:aload_0         
	//   22   41:ldc1            #17  <String "actionIntent">
	//   23   43:invokevirtual   #257 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   24   46:checkcast       #230 <Class PendingIntent>
	//   25   49:aload_0         
	//   26   50:ldc1            #23  <String "extras">
	//   27   52:invokevirtual   #242 <Method Bundle Bundle.getBundle(String)>
	//   28   55:aload_0         
	//   29   56:ldc1            #29  <String "remoteInputs">
	//   30   58:invokestatic    #263 <Method Bundle[] BundleUtil.getBundleArrayFromBundle(Bundle, String)>
	//   31   61:aload_2         
	//   32   62:invokestatic    #269 <Method RemoteInputCompatBase$RemoteInput[] RemoteInputCompatJellybean.fromBundleArray(Bundle[], RemoteInputCompatBase$RemoteInput$Factory)>
	//   33   65:aload_0         
	//   34   66:ldc1            #20  <String "dataOnlyRemoteInputs">
	//   35   68:invokestatic    #263 <Method Bundle[] BundleUtil.getBundleArrayFromBundle(Bundle, String)>
	//   36   71:aload_2         
	//   37   72:invokestatic    #269 <Method RemoteInputCompatBase$RemoteInput[] RemoteInputCompatJellybean.fromBundleArray(Bundle[], RemoteInputCompatBase$RemoteInput$Factory)>
	//   38   75:iload_3         
	//   39   76:invokeinterface #275 <Method NotificationCompatBase$Action NotificationCompatBase$Action$Factory.build(int, CharSequence, PendingIntent, Bundle, RemoteInputCompatBase$RemoteInput[], RemoteInputCompatBase$RemoteInput[], boolean)>
	//   40   81:areturn         
	}

	private static Object[] getActionObjectsLocked(Notification notification)
	{
label0:
		{
			synchronized(sActionsLock)
	//*   0    0:getstatic       #59  <Field Object sActionsLock>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
			{
				if(ensureActionReflectionReadyLocked())
					break label0;
	//    4    6:invokestatic    #277 <Method boolean ensureActionReflectionReadyLocked()>
	//    5    9:ifne            16
			}
	//    6   12:aload_1         
	//    7   13:monitorexit     
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
		}
		notification = ((Notification) ((Object[])sActionsField.get(((Object) (notification)))));
	//   10   16:getstatic       #164 <Field Field sActionsField>
	//   11   19:aload_0         
	//   12   20:invokevirtual   #228 <Method Object Field.get(Object)>
	//   13   23:checkcast       #279 <Class Object[]>
	//   14   26:astore_0        
		obj;
	//   15   27:aload_1         
		JVM INSTR monitorexit ;
	//   16   28:monitorexit     
		return ((Object []) (notification));
	//   17   29:aload_0         
	//   18   30:areturn         
		notification;
	//   19   31:astore_0        
		Log.e("NotificationCompat", "Unable to access notification actions", ((Throwable) (notification)));
	//   20   32:ldc1            #35  <String "NotificationCompat">
	//   21   34:ldc1            #196 <String "Unable to access notification actions">
	//   22   36:aload_0         
	//   23   37:invokestatic    #202 <Method int Log.e(String, String, Throwable)>
	//   24   40:pop             
		sActionsAccessFailed = true;
	//   25   41:iconst_1        
	//   26   42:putstatic       #162 <Field boolean sActionsAccessFailed>
		obj;
	//   27   45:aload_1         
		JVM INSTR monitorexit ;
	//   28   46:monitorexit     
		return null;
	//   29   47:aconst_null     
	//   30   48:areturn         
		notification;
	//   31   49:astore_0        
		obj;
	//   32   50:aload_1         
		JVM INSTR monitorexit ;
	//   33   51:monitorexit     
		throw notification;
	//   34   52:aload_0         
	//   35   53:athrow          
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
	//    6    8:invokevirtual   #282 <Method int ArrayList.size()>
	//    7   11:invokeinterface #286 <Method NotificationCompatBase$Action[] NotificationCompatBase$Action$Factory.newArray(int)>
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
	//   19   32:invokevirtual   #287 <Method Object ArrayList.get(int)>
	//   20   35:checkcast       #147 <Class Bundle>
	//   21   38:aload_1         
	//   22   39:aload_2         
	//   23   40:invokestatic    #289 <Method NotificationCompatBase$Action getActionFromBundle(Bundle, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
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
	//    0    0:new             #147 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #293 <Method void Bundle()>
	//    3    7:astore_2        
		bundle1.putInt("icon", action.getIcon());
	//    4    8:aload_2         
	//    5    9:ldc1            #26  <String "icon">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #298 <Method int NotificationCompatBase$Action.getIcon()>
	//    8   15:invokevirtual   #302 <Method void Bundle.putInt(String, int)>
		bundle1.putCharSequence("title", action.getTitle());
	//    9   18:aload_2         
	//   10   19:ldc1            #32  <String "title">
	//   11   21:aload_0         
	//   12   22:invokevirtual   #306 <Method CharSequence NotificationCompatBase$Action.getTitle()>
	//   13   25:invokevirtual   #310 <Method void Bundle.putCharSequence(String, CharSequence)>
		bundle1.putParcelable("actionIntent", ((android.os.Parcelable) (action.getActionIntent())));
	//   14   28:aload_2         
	//   15   29:ldc1            #17  <String "actionIntent">
	//   16   31:aload_0         
	//   17   32:invokevirtual   #314 <Method PendingIntent NotificationCompatBase$Action.getActionIntent()>
	//   18   35:invokevirtual   #318 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		Bundle bundle;
		if(action.getExtras() != null)
	//*  19   38:aload_0         
	//*  20   39:invokevirtual   #321 <Method Bundle NotificationCompatBase$Action.getExtras()>
	//*  21   42:ifnull          60
			bundle = new Bundle(action.getExtras());
	//   22   45:new             #147 <Class Bundle>
	//   23   48:dup             
	//   24   49:aload_0         
	//   25   50:invokevirtual   #321 <Method Bundle NotificationCompatBase$Action.getExtras()>
	//   26   53:invokespecial   #324 <Method void Bundle(Bundle)>
	//   27   56:astore_1        
		else
	//*  28   57:goto            68
			bundle = new Bundle();
	//   29   60:new             #147 <Class Bundle>
	//   30   63:dup             
	//   31   64:invokespecial   #293 <Method void Bundle()>
	//   32   67:astore_1        
		bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
	//   33   68:aload_1         
	//   34   69:ldc1            #11  <String "android.support.allowGeneratedReplies">
	//   35   71:aload_0         
	//   36   72:invokevirtual   #327 <Method boolean NotificationCompatBase$Action.getAllowGeneratedReplies()>
	//   37   75:invokevirtual   #331 <Method void Bundle.putBoolean(String, boolean)>
		bundle1.putBundle("extras", bundle);
	//   38   78:aload_2         
	//   39   79:ldc1            #23  <String "extras">
	//   40   81:aload_1         
	//   41   82:invokevirtual   #335 <Method void Bundle.putBundle(String, Bundle)>
		bundle1.putParcelableArray("remoteInputs", ((android.os.Parcelable []) (RemoteInputCompatJellybean.toBundleArray(action.getRemoteInputs()))));
	//   42   85:aload_2         
	//   43   86:ldc1            #29  <String "remoteInputs">
	//   44   88:aload_0         
	//   45   89:invokevirtual   #339 <Method RemoteInputCompatBase$RemoteInput[] NotificationCompatBase$Action.getRemoteInputs()>
	//   46   92:invokestatic    #343 <Method Bundle[] RemoteInputCompatJellybean.toBundleArray(RemoteInputCompatBase$RemoteInput[])>
	//   47   95:invokevirtual   #347 <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
		return bundle1;
	//   48   98:aload_2         
	//   49   99:areturn         
	}

	public static Bundle getExtras(Notification notification)
	{
label0:
		{
			synchronized(sExtrasLock)
	//*   0    0:getstatic       #57  <Field Object sExtrasLock>
	//*   1    3:astore_3        
	//*   2    4:aload_3         
	//*   3    5:monitorenter    
			{
				if(!sExtrasFieldAccessFailed)
					break label0;
	//    4    6:getstatic       #349 <Field boolean sExtrasFieldAccessFailed>
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
	//   10   16:getstatic       #351 <Field Field sExtrasField>
	//   11   19:ifnonnull       68
		obj = ((Object) (((Class) (android/app/Notification)).getDeclaredField("extras")));
	//   12   22:ldc1            #186 <Class Notification>
	//   13   24:ldc1            #23  <String "extras">
	//   14   26:invokevirtual   #178 <Method Field Class.getDeclaredField(String)>
	//   15   29:astore_1        
		if(((Class) (android/os/Bundle)).isAssignableFrom(((Field) (obj)).getType()))
			break MISSING_BLOCK_LABEL_59;
	//   16   30:ldc1            #147 <Class Bundle>
	//   17   32:aload_1         
	//   18   33:invokevirtual   #355 <Method Class Field.getType()>
	//   19   36:invokevirtual   #359 <Method boolean Class.isAssignableFrom(Class)>
	//   20   39:ifne            59
		Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
	//   21   42:ldc1            #35  <String "NotificationCompat">
	//   22   44:ldc2            #361 <String "Notification.extras field is not of type Bundle">
	//   23   47:invokestatic    #364 <Method int Log.e(String, String)>
	//   24   50:pop             
		sExtrasFieldAccessFailed = true;
	//   25   51:iconst_1        
	//   26   52:putstatic       #349 <Field boolean sExtrasFieldAccessFailed>
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
	//   33   61:invokevirtual   #194 <Method void Field.setAccessible(boolean)>
		sExtrasField = ((Field) (obj));
	//   34   64:aload_1         
	//   35   65:putstatic       #351 <Field Field sExtrasField>
		Bundle bundle = (Bundle)sExtrasField.get(((Object) (notification)));
	//   36   68:getstatic       #351 <Field Field sExtrasField>
	//   37   71:aload_0         
	//   38   72:invokevirtual   #228 <Method Object Field.get(Object)>
	//   39   75:checkcast       #147 <Class Bundle>
	//   40   78:astore_2        
		obj = ((Object) (bundle));
	//   41   79:aload_2         
	//   42   80:astore_1        
		if(bundle != null)
			break MISSING_BLOCK_LABEL_101;
	//   43   81:aload_2         
	//   44   82:ifnonnull       101
		obj = ((Object) (new Bundle()));
	//   45   85:new             #147 <Class Bundle>
	//   46   88:dup             
	//   47   89:invokespecial   #293 <Method void Bundle()>
	//   48   92:astore_1        
		sExtrasField.set(((Object) (notification)), obj);
	//   49   93:getstatic       #351 <Field Field sExtrasField>
	//   50   96:aload_0         
	//   51   97:aload_1         
	//   52   98:invokevirtual   #368 <Method void Field.set(Object, Object)>
		obj1;
	//   53  101:aload_3         
		JVM INSTR monitorexit ;
	//   54  102:monitorexit     
		return ((Bundle) (obj));
	//   55  103:aload_1         
	//   56  104:areturn         
_L2:
		Log.e("NotificationCompat", "Unable to access notification extras", ((Throwable) (notification)));
	//   57  105:ldc1            #35  <String "NotificationCompat">
	//   58  107:ldc2            #370 <String "Unable to access notification extras">
	//   59  110:aload_0         
	//   60  111:invokestatic    #202 <Method int Log.e(String, String, Throwable)>
	//   61  114:pop             
	//*  62  115:goto            118
		sExtrasFieldAccessFailed = true;
	//   63  118:iconst_1        
	//   64  119:putstatic       #349 <Field boolean sExtrasFieldAccessFailed>
		obj1;
	//   65  122:aload_3         
		JVM INSTR monitorexit ;
	//   66  123:monitorexit     
		return null;
	//   67  124:aconst_null     
	//   68  125:areturn         
		notification;
	//   69  126:astore_0        
		obj1;
	//   70  127:aload_3         
		JVM INSTR monitorexit ;
	//   71  128:monitorexit     
		throw notification;
	//   72  129:aload_0         
	//   73  130:athrow          
		notification;
	//   74  131:astore_0        
		continue; /* Loop/switch isn't completed */
	//   75  132:goto            105
		notification;
	//   76  135:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  77  136:goto            105
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
	//    4    6:new             #112 <Class ArrayList>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:arraylength     
	//    8   12:invokespecial   #375 <Method void ArrayList(int)>
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
	//   22   30:invokestatic    #377 <Method Bundle getBundleForAction(NotificationCompatBase$Action)>
	//   23   33:invokevirtual   #381 <Method boolean ArrayList.add(Object)>
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

	public static NotificationCompatBase.Action readAction(NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1, int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle)
	{
		boolean flag;
		RemoteInputCompatBase.RemoteInput aremoteinput[];
		RemoteInputCompatBase.RemoteInput aremoteinput1[];
		if(bundle != null)
	//*   0    0:aload           5
	//*   1    2:ifnull          46
		{
			aremoteinput = RemoteInputCompatJellybean.fromBundleArray(BundleUtil.getBundleArrayFromBundle(bundle, "android.support.remoteInputs"), factory1);
	//    2    5:aload           5
	//    3    7:ldc2            #384 <String "android.support.remoteInputs">
	//    4   10:invokestatic    #263 <Method Bundle[] BundleUtil.getBundleArrayFromBundle(Bundle, String)>
	//    5   13:aload_1         
	//    6   14:invokestatic    #269 <Method RemoteInputCompatBase$RemoteInput[] RemoteInputCompatJellybean.fromBundleArray(Bundle[], RemoteInputCompatBase$RemoteInput$Factory)>
	//    7   17:astore          7
			factory1 = ((RemoteInputCompatBase.RemoteInput.Factory) (RemoteInputCompatJellybean.fromBundleArray(BundleUtil.getBundleArrayFromBundle(bundle, "android.support.dataRemoteInputs"), factory1)));
	//    8   19:aload           5
	//    9   21:ldc1            #14  <String "android.support.dataRemoteInputs">
	//   10   23:invokestatic    #263 <Method Bundle[] BundleUtil.getBundleArrayFromBundle(Bundle, String)>
	//   11   26:aload_1         
	//   12   27:invokestatic    #269 <Method RemoteInputCompatBase$RemoteInput[] RemoteInputCompatJellybean.fromBundleArray(Bundle[], RemoteInputCompatBase$RemoteInput$Factory)>
	//   13   30:astore_1        
			flag = bundle.getBoolean("android.support.allowGeneratedReplies");
	//   14   31:aload           5
	//   15   33:ldc1            #11  <String "android.support.allowGeneratedReplies">
	//   16   35:invokevirtual   #387 <Method boolean Bundle.getBoolean(String)>
	//   17   38:istore          6
			aremoteinput1 = ((RemoteInputCompatBase.RemoteInput []) (factory1));
	//   18   40:aload_1         
	//   19   41:astore          8
		} else
	//*  20   43:goto            57
		{
			factory1 = null;
	//   21   46:aconst_null     
	//   22   47:astore_1        
			aremoteinput1 = ((RemoteInputCompatBase.RemoteInput []) (factory1));
	//   23   48:aload_1         
	//   24   49:astore          8
			flag = false;
	//   25   51:iconst_0        
	//   26   52:istore          6
			aremoteinput = ((RemoteInputCompatBase.RemoteInput []) (factory1));
	//   27   54:aload_1         
	//   28   55:astore          7
		}
		return factory.build(i, charsequence, pendingintent, bundle, aremoteinput, aremoteinput1, flag);
	//   29   57:aload_0         
	//   30   58:iload_2         
	//   31   59:aload_3         
	//   32   60:aload           4
	//   33   62:aload           5
	//   34   64:aload           7
	//   35   66:aload           8
	//   36   68:iload           6
	//   37   70:invokeinterface #275 <Method NotificationCompatBase$Action NotificationCompatBase$Action$Factory.build(int, CharSequence, PendingIntent, Bundle, RemoteInputCompatBase$RemoteInput[], RemoteInputCompatBase$RemoteInput[], boolean)>
	//   38   75:areturn         
	}

	public static Bundle writeActionAndGetExtras(android.app.Notification.Builder builder, NotificationCompatBase.Action action)
	{
		builder.addAction(action.getIcon(), action.getTitle(), action.getActionIntent());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #298 <Method int NotificationCompatBase$Action.getIcon()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #306 <Method CharSequence NotificationCompatBase$Action.getTitle()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #314 <Method PendingIntent NotificationCompatBase$Action.getActionIntent()>
	//    7   13:invokevirtual   #395 <Method android.app.Notification$Builder android.app.Notification$Builder.addAction(int, CharSequence, PendingIntent)>
	//    8   16:pop             
		builder = ((android.app.Notification.Builder) (new Bundle(action.getExtras())));
	//    9   17:new             #147 <Class Bundle>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokevirtual   #321 <Method Bundle NotificationCompatBase$Action.getExtras()>
	//   13   25:invokespecial   #324 <Method void Bundle(Bundle)>
	//   14   28:astore_0        
		if(action.getRemoteInputs() != null)
	//*  15   29:aload_1         
	//*  16   30:invokevirtual   #339 <Method RemoteInputCompatBase$RemoteInput[] NotificationCompatBase$Action.getRemoteInputs()>
	//*  17   33:ifnull          50
			((Bundle) (builder)).putParcelableArray("android.support.remoteInputs", ((android.os.Parcelable []) (RemoteInputCompatJellybean.toBundleArray(action.getRemoteInputs()))));
	//   18   36:aload_0         
	//   19   37:ldc2            #384 <String "android.support.remoteInputs">
	//   20   40:aload_1         
	//   21   41:invokevirtual   #339 <Method RemoteInputCompatBase$RemoteInput[] NotificationCompatBase$Action.getRemoteInputs()>
	//   22   44:invokestatic    #343 <Method Bundle[] RemoteInputCompatJellybean.toBundleArray(RemoteInputCompatBase$RemoteInput[])>
	//   23   47:invokevirtual   #347 <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
		if(action.getDataOnlyRemoteInputs() != null)
	//*  24   50:aload_1         
	//*  25   51:invokevirtual   #398 <Method RemoteInputCompatBase$RemoteInput[] NotificationCompatBase$Action.getDataOnlyRemoteInputs()>
	//*  26   54:ifnull          70
			((Bundle) (builder)).putParcelableArray("android.support.dataRemoteInputs", ((android.os.Parcelable []) (RemoteInputCompatJellybean.toBundleArray(action.getDataOnlyRemoteInputs()))));
	//   27   57:aload_0         
	//   28   58:ldc1            #14  <String "android.support.dataRemoteInputs">
	//   29   60:aload_1         
	//   30   61:invokevirtual   #398 <Method RemoteInputCompatBase$RemoteInput[] NotificationCompatBase$Action.getDataOnlyRemoteInputs()>
	//   31   64:invokestatic    #343 <Method Bundle[] RemoteInputCompatJellybean.toBundleArray(RemoteInputCompatBase$RemoteInput[])>
	//   32   67:invokevirtual   #347 <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
		((Bundle) (builder)).putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
	//   33   70:aload_0         
	//   34   71:ldc1            #11  <String "android.support.allowGeneratedReplies">
	//   35   73:aload_1         
	//   36   74:invokevirtual   #327 <Method boolean NotificationCompatBase$Action.getAllowGeneratedReplies()>
	//   37   77:invokevirtual   #331 <Method void Bundle.putBoolean(String, boolean)>
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
	//    2    4:invokespecial   #55  <Method void Object()>
	//    3    7:putstatic       #57  <Field Object sExtrasLock>
	//    4   10:new             #4   <Class Object>
	//    5   13:dup             
	//    6   14:invokespecial   #55  <Method void Object()>
	//    7   17:putstatic       #59  <Field Object sActionsLock>
	//*   8   20:return          
	}
}
