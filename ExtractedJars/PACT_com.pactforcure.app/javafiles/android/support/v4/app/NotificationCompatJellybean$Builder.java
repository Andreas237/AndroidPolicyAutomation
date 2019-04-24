// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.*;

// Referenced classes of package android.support.v4.app:
//			NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions, NotificationCompatJellybean

public static class NotificationCompatJellybean$Builder
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
	//   38   88:invokestatic    #259 <Method android.util.SparseArray NotificationCompatJellybean.buildActionExtrasMap(List)>
	//   39   91:astore_2        
		if(obj != null)
	//*  40   92:aload_2         
	//*  41   93:ifnull          107
			NotificationCompatJellybean.getExtras(notification).putSparseParcelableArray("android.support.actionExtras", ((android.util.SparseArray) (obj)));
	//   42   96:aload_1         
	//   43   97:invokestatic    #223 <Method Bundle NotificationCompatJellybean.getExtras(Notification)>
	//   44  100:ldc2            #261 <String "android.support.actionExtras">
	//   45  103:aload_2         
	//   46  104:invokevirtual   #265 <Method void Bundle.putSparseParcelableArray(String, android.util.SparseArray)>
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

	public NotificationCompatJellybean$Builder(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
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
