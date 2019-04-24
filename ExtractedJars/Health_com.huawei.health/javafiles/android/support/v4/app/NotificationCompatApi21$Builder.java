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
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//			NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions, NotificationCompatApi21, NotificationCompatApi20

public static class NotificationCompatApi21$Builder
	implements NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions
{

	public void addAction(NotificationCompatBase.Action action)
	{
		NotificationCompatApi20.addAction(b, action);
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field android.app.Notification$Builder b>
	//    2    4:aload_1         
	//    3    5:invokestatic    #239 <Method void NotificationCompatApi20.addAction(android.app.Notification$Builder, NotificationCompatBase$Action)>
	//    4    8:return          
	}

	public Notification build()
	{
		b.setExtras(mExtras);
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field android.app.Notification$Builder b>
	//    2    4:aload_0         
	//    3    5:getfield        #198 <Field Bundle mExtras>
	//    4    8:invokevirtual   #245 <Method android.app.Notification$Builder android.app.Notification$Builder.setExtras(Bundle)>
	//    5   11:pop             
		Notification notification = b.build();
	//    6   12:aload_0         
	//    7   13:getfield        #193 <Field android.app.Notification$Builder b>
	//    8   16:invokevirtual   #247 <Method Notification android.app.Notification$Builder.build()>
	//    9   19:astore_1        
		if(mContentView != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #225 <Field RemoteViews mContentView>
	//*  12   24:ifnull          35
			notification.contentView = mContentView;
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #225 <Field RemoteViews mContentView>
	//   16   32:putfield        #57  <Field RemoteViews Notification.contentView>
		if(mBigContentView != null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #227 <Field RemoteViews mBigContentView>
	//*  19   39:ifnull          50
			notification.bigContentView = mBigContentView;
	//   20   42:aload_1         
	//   21   43:aload_0         
	//   22   44:getfield        #227 <Field RemoteViews mBigContentView>
	//   23   47:putfield        #250 <Field RemoteViews Notification.bigContentView>
		if(mHeadsUpContentView != null)
	//*  24   50:aload_0         
	//*  25   51:getfield        #229 <Field RemoteViews mHeadsUpContentView>
	//*  26   54:ifnull          65
			notification.headsUpContentView = mHeadsUpContentView;
	//   27   57:aload_1         
	//   28   58:aload_0         
	//   29   59:getfield        #229 <Field RemoteViews mHeadsUpContentView>
	//   30   62:putfield        #253 <Field RemoteViews Notification.headsUpContentView>
		return notification;
	//   31   65:aload_1         
	//   32   66:areturn         
	}

	public android.app.Notification.Builder getBuilder()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field android.app.Notification$Builder b>
	//    2    4:areturn         
	}

	private android.app.Notification.Builder b;
	private RemoteViews mBigContentView;
	private RemoteViews mContentView;
	private Bundle mExtras;
	private RemoteViews mHeadsUpContentView;

	public NotificationCompatApi21$Builder(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
			PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
			boolean flag2, int l, CharSequence charsequence3, boolean flag3, String s, ArrayList arraylist, Bundle bundle, 
			int i1, int j1, Notification notification1, String s1, boolean flag4, String s2, RemoteViews remoteviews1, 
			RemoteViews remoteviews2, RemoteViews remoteviews3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		context = ((Context) ((new android.app.Notification.Builder(context)).setWhen(notification.when).setShowWhen(flag1).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS)));
	//    2    4:new             #26  <Class android.app.Notification$Builder>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #29  <Method void android.app.Notification$Builder(Context)>
	//    6   12:aload_2         
	//    7   13:getfield        #35  <Field long Notification.when>
	//    8   16:invokevirtual   #39  <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
	//    9   19:iload           14
	//   10   21:invokevirtual   #43  <Method android.app.Notification$Builder android.app.Notification$Builder.setShowWhen(boolean)>
	//   11   24:aload_2         
	//   12   25:getfield        #47  <Field int Notification.icon>
	//   13   28:aload_2         
	//   14   29:getfield        #50  <Field int Notification.iconLevel>
	//   15   32:invokevirtual   #54  <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int, int)>
	//   16   35:aload_2         
	//   17   36:getfield        #57  <Field RemoteViews Notification.contentView>
	//   18   39:invokevirtual   #61  <Method android.app.Notification$Builder android.app.Notification$Builder.setContent(RemoteViews)>
	//   19   42:aload_2         
	//   20   43:getfield        #65  <Field CharSequence Notification.tickerText>
	//   21   46:aload           6
	//   22   48:invokevirtual   #69  <Method android.app.Notification$Builder android.app.Notification$Builder.setTicker(CharSequence, RemoteViews)>
	//   23   51:aload_2         
	//   24   52:getfield        #73  <Field android.net.Uri Notification.sound>
	//   25   55:aload_2         
	//   26   56:getfield        #76  <Field int Notification.audioStreamType>
	//   27   59:invokevirtual   #80  <Method android.app.Notification$Builder android.app.Notification$Builder.setSound(android.net.Uri, int)>
	//   28   62:aload_2         
	//   29   63:getfield        #84  <Field long[] Notification.vibrate>
	//   30   66:invokevirtual   #88  <Method android.app.Notification$Builder android.app.Notification$Builder.setVibrate(long[])>
	//   31   69:aload_2         
	//   32   70:getfield        #91  <Field int Notification.ledARGB>
	//   33   73:aload_2         
	//   34   74:getfield        #94  <Field int Notification.ledOnMS>
	//   35   77:aload_2         
	//   36   78:getfield        #97  <Field int Notification.ledOffMS>
	//   37   81:invokevirtual   #101 <Method android.app.Notification$Builder android.app.Notification$Builder.setLights(int, int, int)>
	//   38   84:astore_1        
		if((notification.flags & 2) != 0)
	//*  39   85:aload_2         
	//*  40   86:getfield        #104 <Field int Notification.flags>
	//*  41   89:iconst_2        
	//*  42   90:iand            
	//*  43   91:ifeq            100
			flag1 = true;
	//   44   94:iconst_1        
	//   45   95:istore          14
		else
	//*  46   97:goto            103
			flag1 = false;
	//   47  100:iconst_0        
	//   48  101:istore          14
		context = ((Context) (((android.app.Notification.Builder) (context)).setOngoing(flag1)));
	//   49  103:aload_1         
	//   50  104:iload           14
	//   51  106:invokevirtual   #107 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
	//   52  109:astore_1        
		if((notification.flags & 8) != 0)
	//*  53  110:aload_2         
	//*  54  111:getfield        #104 <Field int Notification.flags>
	//*  55  114:bipush          8
	//*  56  116:iand            
	//*  57  117:ifeq            126
			flag1 = true;
	//   58  120:iconst_1        
	//   59  121:istore          14
		else
	//*  60  123:goto            129
			flag1 = false;
	//   61  126:iconst_0        
	//   62  127:istore          14
		context = ((Context) (((android.app.Notification.Builder) (context)).setOnlyAlertOnce(flag1)));
	//   63  129:aload_1         
	//   64  130:iload           14
	//   65  132:invokevirtual   #110 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
	//   66  135:astore_1        
		if((notification.flags & 0x10) != 0)
	//*  67  136:aload_2         
	//*  68  137:getfield        #104 <Field int Notification.flags>
	//*  69  140:bipush          16
	//*  70  142:iand            
	//*  71  143:ifeq            152
			flag1 = true;
	//   72  146:iconst_1        
	//   73  147:istore          14
		else
	//*  74  149:goto            155
			flag1 = false;
	//   75  152:iconst_0        
	//   76  153:istore          14
		context = ((Context) (((android.app.Notification.Builder) (context)).setAutoCancel(flag1).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setSubText(charsequence3).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent)));
	//   77  155:aload_1         
	//   78  156:iload           14
	//   79  158:invokevirtual   #113 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
	//   80  161:aload_2         
	//   81  162:getfield        #116 <Field int Notification.defaults>
	//   82  165:invokevirtual   #120 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
	//   83  168:aload_3         
	//   84  169:invokevirtual   #124 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//   85  172:aload           4
	//   86  174:invokevirtual   #127 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//   87  177:aload           17
	//   88  179:invokevirtual   #130 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
	//   89  182:aload           5
	//   90  184:invokevirtual   #133 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
	//   91  187:aload           8
	//   92  189:invokevirtual   #137 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
	//   93  192:aload_2         
	//   94  193:getfield        #141 <Field PendingIntent Notification.deleteIntent>
	//   95  196:invokevirtual   #144 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
	//   96  199:astore_1        
		if((notification.flags & 0x80) != 0)
	//*  97  200:aload_2         
	//*  98  201:getfield        #104 <Field int Notification.flags>
	//*  99  204:sipush          128
	//* 100  207:iand            
	//* 101  208:ifeq            217
			flag1 = true;
	//  102  211:iconst_1        
	//  103  212:istore          14
		else
	//* 104  214:goto            220
			flag1 = false;
	//  105  217:iconst_0        
	//  106  218:istore          14
		b = ((android.app.Notification.Builder) (context)).setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag2).setPriority(l).setProgress(j, k, flag).setLocalOnly(flag3).setGroup(s1).setGroupSummary(flag4).setSortKey(s2).setCategory(s).setColor(i1).setVisibility(j1).setPublicVersion(notification1);
	//  107  220:aload_0         
	//  108  221:aload_1         
	//  109  222:aload           9
	//  110  224:iload           14
	//  111  226:invokevirtual   #148 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
	//  112  229:aload           10
	//  113  231:invokevirtual   #152 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
	//  114  234:iload           7
	//  115  236:invokevirtual   #155 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
	//  116  239:iload           15
	//  117  241:invokevirtual   #158 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
	//  118  244:iload           16
	//  119  246:invokevirtual   #161 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
	//  120  249:iload           11
	//  121  251:iload           12
	//  122  253:iload           13
	//  123  255:invokevirtual   #165 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
	//  124  258:iload           18
	//  125  260:invokevirtual   #168 <Method android.app.Notification$Builder android.app.Notification$Builder.setLocalOnly(boolean)>
	//  126  263:aload           25
	//  127  265:invokevirtual   #172 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroup(String)>
	//  128  268:iload           26
	//  129  270:invokevirtual   #175 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroupSummary(boolean)>
	//  130  273:aload           27
	//  131  275:invokevirtual   #178 <Method android.app.Notification$Builder android.app.Notification$Builder.setSortKey(String)>
	//  132  278:aload           19
	//  133  280:invokevirtual   #181 <Method android.app.Notification$Builder android.app.Notification$Builder.setCategory(String)>
	//  134  283:iload           22
	//  135  285:invokevirtual   #184 <Method android.app.Notification$Builder android.app.Notification$Builder.setColor(int)>
	//  136  288:iload           23
	//  137  290:invokevirtual   #187 <Method android.app.Notification$Builder android.app.Notification$Builder.setVisibility(int)>
	//  138  293:aload           24
	//  139  295:invokevirtual   #191 <Method android.app.Notification$Builder android.app.Notification$Builder.setPublicVersion(Notification)>
	//  140  298:putfield        #193 <Field android.app.Notification$Builder b>
		mExtras = new Bundle();
	//  141  301:aload_0         
	//  142  302:new             #195 <Class Bundle>
	//  143  305:dup             
	//  144  306:invokespecial   #196 <Method void Bundle()>
	//  145  309:putfield        #198 <Field Bundle mExtras>
		if(bundle != null)
	//* 146  312:aload           21
	//* 147  314:ifnull          326
			mExtras.putAll(bundle);
	//  148  317:aload_0         
	//  149  318:getfield        #198 <Field Bundle mExtras>
	//  150  321:aload           21
	//  151  323:invokevirtual   #202 <Method void Bundle.putAll(Bundle)>
		for(context = ((Context) (arraylist.iterator())); ((Iterator) (context)).hasNext(); b.addPerson(((String) (notification))))
	//* 152  326:aload           20
	//* 153  328:invokevirtual   #208 <Method Iterator ArrayList.iterator()>
	//* 154  331:astore_1        
	//* 155  332:aload_1         
	//* 156  333:invokeinterface #214 <Method boolean Iterator.hasNext()>
	//* 157  338:ifeq            363
			notification = ((Notification) ((String)((Iterator) (context)).next()));
	//  158  341:aload_1         
	//  159  342:invokeinterface #218 <Method Object Iterator.next()>
	//  160  347:checkcast       #220 <Class String>
	//  161  350:astore_2        

	//  162  351:aload_0         
	//  163  352:getfield        #193 <Field android.app.Notification$Builder b>
	//  164  355:aload_2         
	//  165  356:invokevirtual   #223 <Method android.app.Notification$Builder android.app.Notification$Builder.addPerson(String)>
	//  166  359:pop             
	//* 167  360:goto            332
		mContentView = remoteviews1;
	//  168  363:aload_0         
	//  169  364:aload           28
	//  170  366:putfield        #225 <Field RemoteViews mContentView>
		mBigContentView = remoteviews2;
	//  171  369:aload_0         
	//  172  370:aload           29
	//  173  372:putfield        #227 <Field RemoteViews mBigContentView>
		mHeadsUpContentView = remoteviews3;
	//  174  375:aload_0         
	//  175  376:aload           30
	//  176  378:putfield        #229 <Field RemoteViews mHeadsUpContentView>
	//  177  381:return          
	}
}
