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
//			NotificationBuilderWithActions, NotificationBuilderWithBuilderAccessor, NotificationCompatApi24

class NotificationCompatApi26
{
	public static class Builder
		implements NotificationBuilderWithActions, NotificationBuilderWithBuilderAccessor
	{

		public void addAction(NotificationCompatBase.Action action)
		{
			NotificationCompatApi24.addAction(mB, action);
		//    0    0:aload_0         
		//    1    1:getfield        #211 <Field android.app.Notification$Builder mB>
		//    2    4:aload_1         
		//    3    5:invokestatic    #254 <Method void NotificationCompatApi24.addAction(android.app.Notification$Builder, NotificationCompatBase$Action)>
		//    4    8:return          
		}

		public Notification build()
		{
			return mB.build();
		//    0    0:aload_0         
		//    1    1:getfield        #211 <Field android.app.Notification$Builder mB>
		//    2    4:invokevirtual   #258 <Method Notification android.app.Notification$Builder.build()>
		//    3    7:areturn         
		}

		public android.app.Notification.Builder getBuilder()
		{
			return mB;
		//    0    0:aload_0         
		//    1    1:getfield        #211 <Field android.app.Notification$Builder mB>
		//    2    4:areturn         
		}

		private android.app.Notification.Builder mB;

		Builder(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
				PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
				boolean flag2, int l, CharSequence charsequence3, boolean flag3, String s, ArrayList arraylist, Bundle bundle, 
				int i1, int j1, Notification notification1, String s1, boolean flag4, String s2, CharSequence acharsequence[], 
				RemoteViews remoteviews1, RemoteViews remoteviews2, RemoteViews remoteviews3, String s3, int k1, String s4, long l1, boolean flag5, boolean flag6, int i2)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			context = ((Context) ((new android.app.Notification.Builder(context, s3)).setWhen(notification.when).setShowWhen(flag1).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS)));
		//    2    4:new             #20  <Class android.app.Notification$Builder>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:aload           32
		//    6   11:invokespecial   #23  <Method void android.app.Notification$Builder(Context, String)>
		//    7   14:aload_2         
		//    8   15:getfield        #29  <Field long Notification.when>
		//    9   18:invokevirtual   #33  <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
		//   10   21:iload           14
		//   11   23:invokevirtual   #37  <Method android.app.Notification$Builder android.app.Notification$Builder.setShowWhen(boolean)>
		//   12   26:aload_2         
		//   13   27:getfield        #41  <Field int Notification.icon>
		//   14   30:aload_2         
		//   15   31:getfield        #44  <Field int Notification.iconLevel>
		//   16   34:invokevirtual   #48  <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int, int)>
		//   17   37:aload_2         
		//   18   38:getfield        #52  <Field RemoteViews Notification.contentView>
		//   19   41:invokevirtual   #56  <Method android.app.Notification$Builder android.app.Notification$Builder.setContent(RemoteViews)>
		//   20   44:aload_2         
		//   21   45:getfield        #60  <Field CharSequence Notification.tickerText>
		//   22   48:aload           6
		//   23   50:invokevirtual   #64  <Method android.app.Notification$Builder android.app.Notification$Builder.setTicker(CharSequence, RemoteViews)>
		//   24   53:aload_2         
		//   25   54:getfield        #68  <Field android.net.Uri Notification.sound>
		//   26   57:aload_2         
		//   27   58:getfield        #71  <Field int Notification.audioStreamType>
		//   28   61:invokevirtual   #75  <Method android.app.Notification$Builder android.app.Notification$Builder.setSound(android.net.Uri, int)>
		//   29   64:aload_2         
		//   30   65:getfield        #79  <Field long[] Notification.vibrate>
		//   31   68:invokevirtual   #83  <Method android.app.Notification$Builder android.app.Notification$Builder.setVibrate(long[])>
		//   32   71:aload_2         
		//   33   72:getfield        #86  <Field int Notification.ledARGB>
		//   34   75:aload_2         
		//   35   76:getfield        #89  <Field int Notification.ledOnMS>
		//   36   79:aload_2         
		//   37   80:getfield        #92  <Field int Notification.ledOffMS>
		//   38   83:invokevirtual   #96  <Method android.app.Notification$Builder android.app.Notification$Builder.setLights(int, int, int)>
		//   39   86:astore_1        
			if((notification.flags & 2) != 0)
		//*  40   87:aload_2         
		//*  41   88:getfield        #99  <Field int Notification.flags>
		//*  42   91:iconst_2        
		//*  43   92:iand            
		//*  44   93:ifeq            411
				flag1 = true;
		//   45   96:iconst_1        
		//   46   97:istore          14
			else
		//*  47   99:aload_1         
		//*  48  100:iload           14
		//*  49  102:invokevirtual   #102 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
		//*  50  105:astore_1        
		//*  51  106:aload_2         
		//*  52  107:getfield        #99  <Field int Notification.flags>
		//*  53  110:bipush          8
		//*  54  112:iand            
		//*  55  113:ifeq            417
		//*  56  116:iconst_1        
		//*  57  117:istore          14
		//*  58  119:aload_1         
		//*  59  120:iload           14
		//*  60  122:invokevirtual   #105 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
		//*  61  125:astore_1        
		//*  62  126:aload_2         
		//*  63  127:getfield        #99  <Field int Notification.flags>
		//*  64  130:bipush          16
		//*  65  132:iand            
		//*  66  133:ifeq            423
		//*  67  136:iconst_1        
		//*  68  137:istore          14
		//*  69  139:aload_1         
		//*  70  140:iload           14
		//*  71  142:invokevirtual   #108 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
		//*  72  145:aload_2         
		//*  73  146:getfield        #111 <Field int Notification.defaults>
		//*  74  149:invokevirtual   #115 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
		//*  75  152:aload_3         
		//*  76  153:invokevirtual   #119 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
		//*  77  156:aload           4
		//*  78  158:invokevirtual   #122 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
		//*  79  161:aload           17
		//*  80  163:invokevirtual   #125 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
		//*  81  166:aload           5
		//*  82  168:invokevirtual   #128 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
		//*  83  171:aload           8
		//*  84  173:invokevirtual   #132 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
		//*  85  176:aload_2         
		//*  86  177:getfield        #136 <Field PendingIntent Notification.deleteIntent>
		//*  87  180:invokevirtual   #139 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
		//*  88  183:astore_1        
		//*  89  184:aload_2         
		//*  90  185:getfield        #99  <Field int Notification.flags>
		//*  91  188:sipush          128
		//*  92  191:iand            
		//*  93  192:ifeq            429
		//*  94  195:iconst_1        
		//*  95  196:istore          14
		//*  96  198:aload_0         
		//*  97  199:aload_1         
		//*  98  200:aload           9
		//*  99  202:iload           14
		//* 100  204:invokevirtual   #143 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
		//* 101  207:aload           10
		//* 102  209:invokevirtual   #147 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
		//* 103  212:iload           7
		//* 104  214:invokevirtual   #150 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
		//* 105  217:iload           15
		//* 106  219:invokevirtual   #153 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
		//* 107  222:iload           16
		//* 108  224:invokevirtual   #156 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
		//* 109  227:iload           11
		//* 110  229:iload           12
		//* 111  231:iload           13
		//* 112  233:invokevirtual   #160 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
		//* 113  236:iload           18
		//* 114  238:invokevirtual   #163 <Method android.app.Notification$Builder android.app.Notification$Builder.setLocalOnly(boolean)>
		//* 115  241:aload           21
		//* 116  243:invokevirtual   #167 <Method android.app.Notification$Builder android.app.Notification$Builder.setExtras(Bundle)>
		//* 117  246:aload           25
		//* 118  248:invokevirtual   #171 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroup(String)>
		//* 119  251:iload           26
		//* 120  253:invokevirtual   #174 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroupSummary(boolean)>
		//* 121  256:aload           27
		//* 122  258:invokevirtual   #177 <Method android.app.Notification$Builder android.app.Notification$Builder.setSortKey(String)>
		//* 123  261:aload           19
		//* 124  263:invokevirtual   #180 <Method android.app.Notification$Builder android.app.Notification$Builder.setCategory(String)>
		//* 125  266:iload           22
		//* 126  268:invokevirtual   #183 <Method android.app.Notification$Builder android.app.Notification$Builder.setColor(int)>
		//* 127  271:iload           23
		//* 128  273:invokevirtual   #186 <Method android.app.Notification$Builder android.app.Notification$Builder.setVisibility(int)>
		//* 129  276:aload           24
		//* 130  278:invokevirtual   #190 <Method android.app.Notification$Builder android.app.Notification$Builder.setPublicVersion(Notification)>
		//* 131  281:aload           28
		//* 132  283:invokevirtual   #194 <Method android.app.Notification$Builder android.app.Notification$Builder.setRemoteInputHistory(CharSequence[])>
		//* 133  286:aload           32
		//* 134  288:invokevirtual   #197 <Method android.app.Notification$Builder android.app.Notification$Builder.setChannelId(String)>
		//* 135  291:iload           33
		//* 136  293:invokevirtual   #200 <Method android.app.Notification$Builder android.app.Notification$Builder.setBadgeIconType(int)>
		//* 137  296:aload           34
		//* 138  298:invokevirtual   #203 <Method android.app.Notification$Builder android.app.Notification$Builder.setShortcutId(String)>
		//* 139  301:lload           35
		//* 140  303:invokevirtual   #206 <Method android.app.Notification$Builder android.app.Notification$Builder.setTimeoutAfter(long)>
		//* 141  306:iload           39
		//* 142  308:invokevirtual   #209 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroupAlertBehavior(int)>
		//* 143  311:putfield        #211 <Field android.app.Notification$Builder mB>
		//* 144  314:iload           38
		//* 145  316:ifeq            329
		//* 146  319:aload_0         
		//* 147  320:getfield        #211 <Field android.app.Notification$Builder mB>
		//* 148  323:iload           37
		//* 149  325:invokevirtual   #214 <Method android.app.Notification$Builder android.app.Notification$Builder.setColorized(boolean)>
		//* 150  328:pop             
		//* 151  329:aload           29
		//* 152  331:ifnull          344
		//* 153  334:aload_0         
		//* 154  335:getfield        #211 <Field android.app.Notification$Builder mB>
		//* 155  338:aload           29
		//* 156  340:invokevirtual   #217 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomContentView(RemoteViews)>
		//* 157  343:pop             
		//* 158  344:aload           30
		//* 159  346:ifnull          359
		//* 160  349:aload_0         
		//* 161  350:getfield        #211 <Field android.app.Notification$Builder mB>
		//* 162  353:aload           30
		//* 163  355:invokevirtual   #220 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomBigContentView(RemoteViews)>
		//* 164  358:pop             
		//* 165  359:aload           31
		//* 166  361:ifnull          374
		//* 167  364:aload_0         
		//* 168  365:getfield        #211 <Field android.app.Notification$Builder mB>
		//* 169  368:aload           31
		//* 170  370:invokevirtual   #223 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomHeadsUpContentView(RemoteViews)>
		//* 171  373:pop             
		//* 172  374:aload           20
		//* 173  376:invokevirtual   #229 <Method Iterator ArrayList.iterator()>
		//* 174  379:astore_1        
		//* 175  380:aload_1         
		//* 176  381:invokeinterface #235 <Method boolean Iterator.hasNext()>
		//* 177  386:ifeq            435
		//* 178  389:aload_1         
		//* 179  390:invokeinterface #239 <Method Object Iterator.next()>
		//* 180  395:checkcast       #241 <Class String>
		//* 181  398:astore_2        
		//* 182  399:aload_0         
		//* 183  400:getfield        #211 <Field android.app.Notification$Builder mB>
		//* 184  403:aload_2         
		//* 185  404:invokevirtual   #244 <Method android.app.Notification$Builder android.app.Notification$Builder.addPerson(String)>
		//* 186  407:pop             
		//* 187  408:goto            380
				flag1 = false;
		//  188  411:iconst_0        
		//  189  412:istore          14
			context = ((Context) (((android.app.Notification.Builder) (context)).setOngoing(flag1)));
			if((notification.flags & 8) != 0)
				flag1 = true;
			else
		//* 190  414:goto            99
				flag1 = false;
		//  191  417:iconst_0        
		//  192  418:istore          14
			context = ((Context) (((android.app.Notification.Builder) (context)).setOnlyAlertOnce(flag1)));
			if((notification.flags & 0x10) != 0)
				flag1 = true;
			else
		//* 193  420:goto            119
				flag1 = false;
		//  194  423:iconst_0        
		//  195  424:istore          14
			context = ((Context) (((android.app.Notification.Builder) (context)).setAutoCancel(flag1).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setSubText(charsequence3).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent)));
			if((notification.flags & 0x80) != 0)
				flag1 = true;
			else
		//* 196  426:goto            139
				flag1 = false;
		//  197  429:iconst_0        
		//  198  430:istore          14
			mB = ((android.app.Notification.Builder) (context)).setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag2).setPriority(l).setProgress(j, k, flag).setLocalOnly(flag3).setExtras(bundle).setGroup(s1).setGroupSummary(flag4).setSortKey(s2).setCategory(s).setColor(i1).setVisibility(j1).setPublicVersion(notification1).setRemoteInputHistory(acharsequence).setChannelId(s3).setBadgeIconType(k1).setShortcutId(s4).setTimeoutAfter(l1).setGroupAlertBehavior(i2);
			if(flag6)
				mB.setColorized(flag5);
			if(remoteviews1 != null)
				mB.setCustomContentView(remoteviews1);
			if(remoteviews2 != null)
				mB.setCustomBigContentView(remoteviews2);
			if(remoteviews3 != null)
				mB.setCustomHeadsUpContentView(remoteviews3);
			for(context = ((Context) (arraylist.iterator())); ((Iterator) (context)).hasNext(); mB.addPerson(((String) (notification))))
				notification = ((Notification) ((String)((Iterator) (context)).next()));

		//* 199  432:goto            198
		//  200  435:return          
		}
	}


	NotificationCompatApi26()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
