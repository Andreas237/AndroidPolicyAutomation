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
			int j2 = notification.flags;
		//   40   87:aload_2         
		//   41   88:getfield        #99  <Field int Notification.flags>
		//   42   91:istore          40
			boolean flag7 = false;
		//   43   93:iconst_0        
		//   44   94:istore          41
			if((j2 & 2) != 0)
		//*  45   96:iload           40
		//*  46   98:iconst_2        
		//*  47   99:iand            
		//*  48  100:ifeq            109
				flag1 = true;
		//   49  103:iconst_1        
		//   50  104:istore          14
			else
		//*  51  106:goto            112
				flag1 = false;
		//   52  109:iconst_0        
		//   53  110:istore          14
			context = ((Context) (((android.app.Notification.Builder) (context)).setOngoing(flag1)));
		//   54  112:aload_1         
		//   55  113:iload           14
		//   56  115:invokevirtual   #102 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
		//   57  118:astore_1        
			if((notification.flags & 8) != 0)
		//*  58  119:aload_2         
		//*  59  120:getfield        #99  <Field int Notification.flags>
		//*  60  123:bipush          8
		//*  61  125:iand            
		//*  62  126:ifeq            135
				flag1 = true;
		//   63  129:iconst_1        
		//   64  130:istore          14
			else
		//*  65  132:goto            138
				flag1 = false;
		//   66  135:iconst_0        
		//   67  136:istore          14
			context = ((Context) (((android.app.Notification.Builder) (context)).setOnlyAlertOnce(flag1)));
		//   68  138:aload_1         
		//   69  139:iload           14
		//   70  141:invokevirtual   #105 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
		//   71  144:astore_1        
			if((notification.flags & 0x10) != 0)
		//*  72  145:aload_2         
		//*  73  146:getfield        #99  <Field int Notification.flags>
		//*  74  149:bipush          16
		//*  75  151:iand            
		//*  76  152:ifeq            161
				flag1 = true;
		//   77  155:iconst_1        
		//   78  156:istore          14
			else
		//*  79  158:goto            164
				flag1 = false;
		//   80  161:iconst_0        
		//   81  162:istore          14
			context = ((Context) (((android.app.Notification.Builder) (context)).setAutoCancel(flag1).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setSubText(charsequence3).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent)));
		//   82  164:aload_1         
		//   83  165:iload           14
		//   84  167:invokevirtual   #108 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
		//   85  170:aload_2         
		//   86  171:getfield        #111 <Field int Notification.defaults>
		//   87  174:invokevirtual   #115 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
		//   88  177:aload_3         
		//   89  178:invokevirtual   #119 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
		//   90  181:aload           4
		//   91  183:invokevirtual   #122 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
		//   92  186:aload           17
		//   93  188:invokevirtual   #125 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
		//   94  191:aload           5
		//   95  193:invokevirtual   #128 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
		//   96  196:aload           8
		//   97  198:invokevirtual   #132 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
		//   98  201:aload_2         
		//   99  202:getfield        #136 <Field PendingIntent Notification.deleteIntent>
		//  100  205:invokevirtual   #139 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
		//  101  208:astore_1        
			if((notification.flags & 0x80) != 0)
		//* 102  209:aload_2         
		//* 103  210:getfield        #99  <Field int Notification.flags>
		//* 104  213:sipush          128
		//* 105  216:iand            
		//* 106  217:ifeq            226
				flag1 = true;
		//  107  220:iconst_1        
		//  108  221:istore          14
			else
		//* 109  223:goto            230
				flag1 = flag7;
		//  110  226:iload           41
		//  111  228:istore          14
			mB = ((android.app.Notification.Builder) (context)).setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag2).setPriority(l).setProgress(j, k, flag).setLocalOnly(flag3).setExtras(bundle).setGroup(s1).setGroupSummary(flag4).setSortKey(s2).setCategory(s).setColor(i1).setVisibility(j1).setPublicVersion(notification1).setRemoteInputHistory(acharsequence).setChannelId(s3).setBadgeIconType(k1).setShortcutId(s4).setTimeoutAfter(l1).setGroupAlertBehavior(i2);
		//  112  230:aload_0         
		//  113  231:aload_1         
		//  114  232:aload           9
		//  115  234:iload           14
		//  116  236:invokevirtual   #143 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
		//  117  239:aload           10
		//  118  241:invokevirtual   #147 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
		//  119  244:iload           7
		//  120  246:invokevirtual   #150 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
		//  121  249:iload           15
		//  122  251:invokevirtual   #153 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
		//  123  254:iload           16
		//  124  256:invokevirtual   #156 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
		//  125  259:iload           11
		//  126  261:iload           12
		//  127  263:iload           13
		//  128  265:invokevirtual   #160 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
		//  129  268:iload           18
		//  130  270:invokevirtual   #163 <Method android.app.Notification$Builder android.app.Notification$Builder.setLocalOnly(boolean)>
		//  131  273:aload           21
		//  132  275:invokevirtual   #167 <Method android.app.Notification$Builder android.app.Notification$Builder.setExtras(Bundle)>
		//  133  278:aload           25
		//  134  280:invokevirtual   #171 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroup(String)>
		//  135  283:iload           26
		//  136  285:invokevirtual   #174 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroupSummary(boolean)>
		//  137  288:aload           27
		//  138  290:invokevirtual   #177 <Method android.app.Notification$Builder android.app.Notification$Builder.setSortKey(String)>
		//  139  293:aload           19
		//  140  295:invokevirtual   #180 <Method android.app.Notification$Builder android.app.Notification$Builder.setCategory(String)>
		//  141  298:iload           22
		//  142  300:invokevirtual   #183 <Method android.app.Notification$Builder android.app.Notification$Builder.setColor(int)>
		//  143  303:iload           23
		//  144  305:invokevirtual   #186 <Method android.app.Notification$Builder android.app.Notification$Builder.setVisibility(int)>
		//  145  308:aload           24
		//  146  310:invokevirtual   #190 <Method android.app.Notification$Builder android.app.Notification$Builder.setPublicVersion(Notification)>
		//  147  313:aload           28
		//  148  315:invokevirtual   #194 <Method android.app.Notification$Builder android.app.Notification$Builder.setRemoteInputHistory(CharSequence[])>
		//  149  318:aload           32
		//  150  320:invokevirtual   #197 <Method android.app.Notification$Builder android.app.Notification$Builder.setChannelId(String)>
		//  151  323:iload           33
		//  152  325:invokevirtual   #200 <Method android.app.Notification$Builder android.app.Notification$Builder.setBadgeIconType(int)>
		//  153  328:aload           34
		//  154  330:invokevirtual   #203 <Method android.app.Notification$Builder android.app.Notification$Builder.setShortcutId(String)>
		//  155  333:lload           35
		//  156  335:invokevirtual   #206 <Method android.app.Notification$Builder android.app.Notification$Builder.setTimeoutAfter(long)>
		//  157  338:iload           39
		//  158  340:invokevirtual   #209 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroupAlertBehavior(int)>
		//  159  343:putfield        #211 <Field android.app.Notification$Builder mB>
			if(flag6)
		//* 160  346:iload           38
		//* 161  348:ifeq            361
				mB.setColorized(flag5);
		//  162  351:aload_0         
		//  163  352:getfield        #211 <Field android.app.Notification$Builder mB>
		//  164  355:iload           37
		//  165  357:invokevirtual   #214 <Method android.app.Notification$Builder android.app.Notification$Builder.setColorized(boolean)>
		//  166  360:pop             
			if(remoteviews1 != null)
		//* 167  361:aload           29
		//* 168  363:ifnull          376
				mB.setCustomContentView(remoteviews1);
		//  169  366:aload_0         
		//  170  367:getfield        #211 <Field android.app.Notification$Builder mB>
		//  171  370:aload           29
		//  172  372:invokevirtual   #217 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomContentView(RemoteViews)>
		//  173  375:pop             
			if(remoteviews2 != null)
		//* 174  376:aload           30
		//* 175  378:ifnull          391
				mB.setCustomBigContentView(remoteviews2);
		//  176  381:aload_0         
		//  177  382:getfield        #211 <Field android.app.Notification$Builder mB>
		//  178  385:aload           30
		//  179  387:invokevirtual   #220 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomBigContentView(RemoteViews)>
		//  180  390:pop             
			if(remoteviews3 != null)
		//* 181  391:aload           31
		//* 182  393:ifnull          406
				mB.setCustomHeadsUpContentView(remoteviews3);
		//  183  396:aload_0         
		//  184  397:getfield        #211 <Field android.app.Notification$Builder mB>
		//  185  400:aload           31
		//  186  402:invokevirtual   #223 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomHeadsUpContentView(RemoteViews)>
		//  187  405:pop             
			for(context = ((Context) (arraylist.iterator())); ((Iterator) (context)).hasNext(); mB.addPerson(((String) (notification))))
		//* 188  406:aload           20
		//* 189  408:invokevirtual   #229 <Method Iterator ArrayList.iterator()>
		//* 190  411:astore_1        
		//* 191  412:aload_1         
		//* 192  413:invokeinterface #235 <Method boolean Iterator.hasNext()>
		//* 193  418:ifeq            443
				notification = ((Notification) ((String)((Iterator) (context)).next()));
		//  194  421:aload_1         
		//  195  422:invokeinterface #239 <Method Object Iterator.next()>
		//  196  427:checkcast       #241 <Class String>
		//  197  430:astore_2        

		//  198  431:aload_0         
		//  199  432:getfield        #211 <Field android.app.Notification$Builder mB>
		//  200  435:aload_2         
		//  201  436:invokevirtual   #244 <Method android.app.Notification$Builder android.app.Notification$Builder.addPerson(String)>
		//  202  439:pop             
		//* 203  440:goto            412
		//  204  443:return          
		}
	}


	NotificationCompatApi26()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
