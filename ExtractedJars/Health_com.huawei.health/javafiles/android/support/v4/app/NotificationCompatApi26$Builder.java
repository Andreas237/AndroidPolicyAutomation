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
//			NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions, NotificationCompatApi26, NotificationCompatApi24

public static class NotificationCompatApi26$Builder
	implements NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions
{

	public void addAction(NotificationCompatBase.Action action)
	{
		NotificationCompatApi24.addAction(mB, action);
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field android.app.Notification$Builder mB>
	//    2    4:aload_1         
	//    3    5:invokestatic    #239 <Method void NotificationCompatApi24.addAction(android.app.Notification$Builder, NotificationCompatBase$Action)>
	//    4    8:return          
	}

	public Notification build()
	{
		return mB.build();
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field android.app.Notification$Builder mB>
	//    2    4:invokevirtual   #243 <Method Notification android.app.Notification$Builder.build()>
	//    3    7:areturn         
	}

	public android.app.Notification.Builder getBuilder()
	{
		return mB;
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field android.app.Notification$Builder mB>
	//    2    4:areturn         
	}

	private android.app.Notification.Builder mB;

	NotificationCompatApi26$Builder(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
			PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
			boolean flag2, int l, CharSequence charsequence3, boolean flag3, String s, ArrayList arraylist, Bundle bundle, 
			int i1, int j1, Notification notification1, String s1, boolean flag4, String s2, CharSequence acharsequence[], 
			RemoteViews remoteviews1, RemoteViews remoteviews2, RemoteViews remoteviews3, String s3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		context = ((Context) ((new android.app.Notification.Builder(context)).setWhen(notification.when).setShowWhen(flag1).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS)));
	//    2    4:new             #20  <Class android.app.Notification$Builder>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #23  <Method void android.app.Notification$Builder(Context)>
	//    6   12:aload_2         
	//    7   13:getfield        #29  <Field long Notification.when>
	//    8   16:invokevirtual   #33  <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
	//    9   19:iload           14
	//   10   21:invokevirtual   #37  <Method android.app.Notification$Builder android.app.Notification$Builder.setShowWhen(boolean)>
	//   11   24:aload_2         
	//   12   25:getfield        #41  <Field int Notification.icon>
	//   13   28:aload_2         
	//   14   29:getfield        #44  <Field int Notification.iconLevel>
	//   15   32:invokevirtual   #48  <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int, int)>
	//   16   35:aload_2         
	//   17   36:getfield        #52  <Field RemoteViews Notification.contentView>
	//   18   39:invokevirtual   #56  <Method android.app.Notification$Builder android.app.Notification$Builder.setContent(RemoteViews)>
	//   19   42:aload_2         
	//   20   43:getfield        #60  <Field CharSequence Notification.tickerText>
	//   21   46:aload           6
	//   22   48:invokevirtual   #64  <Method android.app.Notification$Builder android.app.Notification$Builder.setTicker(CharSequence, RemoteViews)>
	//   23   51:aload_2         
	//   24   52:getfield        #68  <Field android.net.Uri Notification.sound>
	//   25   55:aload_2         
	//   26   56:getfield        #71  <Field int Notification.audioStreamType>
	//   27   59:invokevirtual   #75  <Method android.app.Notification$Builder android.app.Notification$Builder.setSound(android.net.Uri, int)>
	//   28   62:aload_2         
	//   29   63:getfield        #79  <Field long[] Notification.vibrate>
	//   30   66:invokevirtual   #83  <Method android.app.Notification$Builder android.app.Notification$Builder.setVibrate(long[])>
	//   31   69:aload_2         
	//   32   70:getfield        #86  <Field int Notification.ledARGB>
	//   33   73:aload_2         
	//   34   74:getfield        #89  <Field int Notification.ledOnMS>
	//   35   77:aload_2         
	//   36   78:getfield        #92  <Field int Notification.ledOffMS>
	//   37   81:invokevirtual   #96  <Method android.app.Notification$Builder android.app.Notification$Builder.setLights(int, int, int)>
	//   38   84:astore_1        
		if((notification.flags & 2) != 0)
	//*  39   85:aload_2         
	//*  40   86:getfield        #99  <Field int Notification.flags>
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
	//   51  106:invokevirtual   #102 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
	//   52  109:astore_1        
		if((notification.flags & 8) != 0)
	//*  53  110:aload_2         
	//*  54  111:getfield        #99  <Field int Notification.flags>
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
	//   65  132:invokevirtual   #105 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
	//   66  135:astore_1        
		if((notification.flags & 0x10) != 0)
	//*  67  136:aload_2         
	//*  68  137:getfield        #99  <Field int Notification.flags>
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
	//   79  158:invokevirtual   #108 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
	//   80  161:aload_2         
	//   81  162:getfield        #111 <Field int Notification.defaults>
	//   82  165:invokevirtual   #115 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
	//   83  168:aload_3         
	//   84  169:invokevirtual   #119 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//   85  172:aload           4
	//   86  174:invokevirtual   #122 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//   87  177:aload           17
	//   88  179:invokevirtual   #125 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
	//   89  182:aload           5
	//   90  184:invokevirtual   #128 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
	//   91  187:aload           8
	//   92  189:invokevirtual   #132 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
	//   93  192:aload_2         
	//   94  193:getfield        #136 <Field PendingIntent Notification.deleteIntent>
	//   95  196:invokevirtual   #139 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
	//   96  199:astore_1        
		if((notification.flags & 0x80) != 0)
	//*  97  200:aload_2         
	//*  98  201:getfield        #99  <Field int Notification.flags>
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
		mB = ((android.app.Notification.Builder) (context)).setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag2).setPriority(l).setProgress(j, k, flag).setLocalOnly(flag3).setExtras(bundle).setGroup(s1).setGroupSummary(flag4).setSortKey(s2).setCategory(s).setColor(i1).setVisibility(j1).setPublicVersion(notification1).setRemoteInputHistory(acharsequence).setChannel(s3);
	//  107  220:aload_0         
	//  108  221:aload_1         
	//  109  222:aload           9
	//  110  224:iload           14
	//  111  226:invokevirtual   #143 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
	//  112  229:aload           10
	//  113  231:invokevirtual   #147 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
	//  114  234:iload           7
	//  115  236:invokevirtual   #150 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
	//  116  239:iload           15
	//  117  241:invokevirtual   #153 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
	//  118  244:iload           16
	//  119  246:invokevirtual   #156 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
	//  120  249:iload           11
	//  121  251:iload           12
	//  122  253:iload           13
	//  123  255:invokevirtual   #160 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
	//  124  258:iload           18
	//  125  260:invokevirtual   #163 <Method android.app.Notification$Builder android.app.Notification$Builder.setLocalOnly(boolean)>
	//  126  263:aload           21
	//  127  265:invokevirtual   #167 <Method android.app.Notification$Builder android.app.Notification$Builder.setExtras(Bundle)>
	//  128  268:aload           25
	//  129  270:invokevirtual   #171 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroup(String)>
	//  130  273:iload           26
	//  131  275:invokevirtual   #174 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroupSummary(boolean)>
	//  132  278:aload           27
	//  133  280:invokevirtual   #177 <Method android.app.Notification$Builder android.app.Notification$Builder.setSortKey(String)>
	//  134  283:aload           19
	//  135  285:invokevirtual   #180 <Method android.app.Notification$Builder android.app.Notification$Builder.setCategory(String)>
	//  136  288:iload           22
	//  137  290:invokevirtual   #183 <Method android.app.Notification$Builder android.app.Notification$Builder.setColor(int)>
	//  138  293:iload           23
	//  139  295:invokevirtual   #186 <Method android.app.Notification$Builder android.app.Notification$Builder.setVisibility(int)>
	//  140  298:aload           24
	//  141  300:invokevirtual   #190 <Method android.app.Notification$Builder android.app.Notification$Builder.setPublicVersion(Notification)>
	//  142  303:aload           28
	//  143  305:invokevirtual   #194 <Method android.app.Notification$Builder android.app.Notification$Builder.setRemoteInputHistory(CharSequence[])>
	//  144  308:aload           32
	//  145  310:invokevirtual   #197 <Method android.app.Notification$Builder android.app.Notification$Builder.setChannel(String)>
	//  146  313:putfield        #199 <Field android.app.Notification$Builder mB>
		if(remoteviews1 != null)
	//* 147  316:aload           29
	//* 148  318:ifnull          331
			mB.setCustomContentView(remoteviews1);
	//  149  321:aload_0         
	//  150  322:getfield        #199 <Field android.app.Notification$Builder mB>
	//  151  325:aload           29
	//  152  327:invokevirtual   #202 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomContentView(RemoteViews)>
	//  153  330:pop             
		if(remoteviews2 != null)
	//* 154  331:aload           30
	//* 155  333:ifnull          346
			mB.setCustomBigContentView(remoteviews2);
	//  156  336:aload_0         
	//  157  337:getfield        #199 <Field android.app.Notification$Builder mB>
	//  158  340:aload           30
	//  159  342:invokevirtual   #205 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomBigContentView(RemoteViews)>
	//  160  345:pop             
		if(remoteviews3 != null)
	//* 161  346:aload           31
	//* 162  348:ifnull          361
			mB.setCustomHeadsUpContentView(remoteviews3);
	//  163  351:aload_0         
	//  164  352:getfield        #199 <Field android.app.Notification$Builder mB>
	//  165  355:aload           31
	//  166  357:invokevirtual   #208 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomHeadsUpContentView(RemoteViews)>
	//  167  360:pop             
		for(context = ((Context) (arraylist.iterator())); ((Iterator) (context)).hasNext(); mB.addPerson(((String) (notification))))
	//* 168  361:aload           20
	//* 169  363:invokevirtual   #214 <Method Iterator ArrayList.iterator()>
	//* 170  366:astore_1        
	//* 171  367:aload_1         
	//* 172  368:invokeinterface #220 <Method boolean Iterator.hasNext()>
	//* 173  373:ifeq            398
			notification = ((Notification) ((String)((Iterator) (context)).next()));
	//  174  376:aload_1         
	//  175  377:invokeinterface #224 <Method Object Iterator.next()>
	//  176  382:checkcast       #226 <Class String>
	//  177  385:astore_2        

	//  178  386:aload_0         
	//  179  387:getfield        #199 <Field android.app.Notification$Builder mB>
	//  180  390:aload_2         
	//  181  391:invokevirtual   #229 <Method android.app.Notification$Builder android.app.Notification$Builder.addPerson(String)>
	//  182  394:pop             
	//* 183  395:goto            367
	//  184  398:return          
	}
}
