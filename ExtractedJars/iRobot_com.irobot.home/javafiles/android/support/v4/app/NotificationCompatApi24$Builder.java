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

public static class NotificationCompatApi24$Builder
	implements NotificationBuilderWithActions, NotificationBuilderWithBuilderAccessor
{

	private void removeSoundAndVibration(Notification notification)
	{
		notification.sound = null;
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:putfield        #69  <Field android.net.Uri Notification.sound>
		notification.vibrate = null;
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:putfield        #80  <Field long[] Notification.vibrate>
		notification.defaults = notification.defaults & -2;
	//    6   10:aload_1         
	//    7   11:aload_1         
	//    8   12:getfield        #112 <Field int Notification.defaults>
	//    9   15:bipush          -2
	//   10   17:iand            
	//   11   18:putfield        #112 <Field int Notification.defaults>
		notification.defaults = notification.defaults & -3;
	//   12   21:aload_1         
	//   13   22:aload_1         
	//   14   23:getfield        #112 <Field int Notification.defaults>
	//   15   26:bipush          -3
	//   16   28:iand            
	//   17   29:putfield        #112 <Field int Notification.defaults>
	//   18   32:return          
	}

	public void addAction(NotificationCompatBase.Action action)
	{
		NotificationCompatApi24.addAction(b, action);
	//    0    0:aload_0         
	//    1    1:getfield        #197 <Field android.app.Notification$Builder b>
	//    2    4:aload_1         
	//    3    5:invokestatic    #239 <Method void NotificationCompatApi24.addAction(android.app.Notification$Builder, NotificationCompatBase$Action)>
	//    4    8:return          
	}

	public Notification build()
	{
		Notification notification = b.build();
	//    0    0:aload_0         
	//    1    1:getfield        #197 <Field android.app.Notification$Builder b>
	//    2    4:invokevirtual   #243 <Method Notification android.app.Notification$Builder.build()>
	//    3    7:astore_1        
		if(mGroupAlertBehavior != 0)
	//*   4    8:aload_0         
	//*   5    9:getfield        #229 <Field int mGroupAlertBehavior>
	//*   6   12:ifeq            77
		{
			if(notification.getGroup() != null && (notification.flags & 0x200) != 0 && mGroupAlertBehavior == 2)
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #247 <Method String Notification.getGroup()>
	//*   9   19:ifnull          46
	//*  10   22:aload_1         
	//*  11   23:getfield        #100 <Field int Notification.flags>
	//*  12   26:sipush          512
	//*  13   29:iand            
	//*  14   30:ifeq            46
	//*  15   33:aload_0         
	//*  16   34:getfield        #229 <Field int mGroupAlertBehavior>
	//*  17   37:iconst_2        
	//*  18   38:icmpne          46
				removeSoundAndVibration(notification);
	//   19   41:aload_0         
	//   20   42:aload_1         
	//   21   43:invokespecial   #249 <Method void removeSoundAndVibration(Notification)>
			if(notification.getGroup() != null && (notification.flags & 0x200) == 0 && mGroupAlertBehavior == 1)
	//*  22   46:aload_1         
	//*  23   47:invokevirtual   #247 <Method String Notification.getGroup()>
	//*  24   50:ifnull          77
	//*  25   53:aload_1         
	//*  26   54:getfield        #100 <Field int Notification.flags>
	//*  27   57:sipush          512
	//*  28   60:iand            
	//*  29   61:ifne            77
	//*  30   64:aload_0         
	//*  31   65:getfield        #229 <Field int mGroupAlertBehavior>
	//*  32   68:iconst_1        
	//*  33   69:icmpne          77
				removeSoundAndVibration(notification);
	//   34   72:aload_0         
	//   35   73:aload_1         
	//   36   74:invokespecial   #249 <Method void removeSoundAndVibration(Notification)>
		}
		return notification;
	//   37   77:aload_1         
	//   38   78:areturn         
	}

	public android.app.Notification.Builder getBuilder()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #197 <Field android.app.Notification$Builder b>
	//    2    4:areturn         
	}

	private android.app.Notification.Builder b;
	private int mGroupAlertBehavior;

	public NotificationCompatApi24$Builder(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
			PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
			boolean flag2, int l, CharSequence charsequence3, boolean flag3, String s, ArrayList arraylist, Bundle bundle, 
			int i1, int j1, Notification notification1, String s1, boolean flag4, String s2, CharSequence acharsequence[], 
			RemoteViews remoteviews1, RemoteViews remoteviews2, RemoteViews remoteviews3, int k1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		context = ((Context) ((new android.app.Notification.Builder(context)).setWhen(notification.when).setShowWhen(flag1).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS)));
	//    2    4:new             #22  <Class android.app.Notification$Builder>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #25  <Method void android.app.Notification$Builder(Context)>
	//    6   12:aload_2         
	//    7   13:getfield        #31  <Field long Notification.when>
	//    8   16:invokevirtual   #35  <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
	//    9   19:iload           14
	//   10   21:invokevirtual   #39  <Method android.app.Notification$Builder android.app.Notification$Builder.setShowWhen(boolean)>
	//   11   24:aload_2         
	//   12   25:getfield        #42  <Field int Notification.icon>
	//   13   28:aload_2         
	//   14   29:getfield        #45  <Field int Notification.iconLevel>
	//   15   32:invokevirtual   #49  <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int, int)>
	//   16   35:aload_2         
	//   17   36:getfield        #53  <Field RemoteViews Notification.contentView>
	//   18   39:invokevirtual   #57  <Method android.app.Notification$Builder android.app.Notification$Builder.setContent(RemoteViews)>
	//   19   42:aload_2         
	//   20   43:getfield        #61  <Field CharSequence Notification.tickerText>
	//   21   46:aload           6
	//   22   48:invokevirtual   #65  <Method android.app.Notification$Builder android.app.Notification$Builder.setTicker(CharSequence, RemoteViews)>
	//   23   51:aload_2         
	//   24   52:getfield        #69  <Field android.net.Uri Notification.sound>
	//   25   55:aload_2         
	//   26   56:getfield        #72  <Field int Notification.audioStreamType>
	//   27   59:invokevirtual   #76  <Method android.app.Notification$Builder android.app.Notification$Builder.setSound(android.net.Uri, int)>
	//   28   62:aload_2         
	//   29   63:getfield        #80  <Field long[] Notification.vibrate>
	//   30   66:invokevirtual   #84  <Method android.app.Notification$Builder android.app.Notification$Builder.setVibrate(long[])>
	//   31   69:aload_2         
	//   32   70:getfield        #87  <Field int Notification.ledARGB>
	//   33   73:aload_2         
	//   34   74:getfield        #90  <Field int Notification.ledOnMS>
	//   35   77:aload_2         
	//   36   78:getfield        #93  <Field int Notification.ledOffMS>
	//   37   81:invokevirtual   #97  <Method android.app.Notification$Builder android.app.Notification$Builder.setLights(int, int, int)>
	//   38   84:astore_1        
		int l1 = notification.flags;
	//   39   85:aload_2         
	//   40   86:getfield        #100 <Field int Notification.flags>
	//   41   89:istore          33
		boolean flag5 = false;
	//   42   91:iconst_0        
	//   43   92:istore          34
		if((l1 & 2) != 0)
	//*  44   94:iload           33
	//*  45   96:iconst_2        
	//*  46   97:iand            
	//*  47   98:ifeq            107
			flag1 = true;
	//   48  101:iconst_1        
	//   49  102:istore          14
		else
	//*  50  104:goto            110
			flag1 = false;
	//   51  107:iconst_0        
	//   52  108:istore          14
		context = ((Context) (((android.app.Notification.Builder) (context)).setOngoing(flag1)));
	//   53  110:aload_1         
	//   54  111:iload           14
	//   55  113:invokevirtual   #103 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
	//   56  116:astore_1        
		if((notification.flags & 8) != 0)
	//*  57  117:aload_2         
	//*  58  118:getfield        #100 <Field int Notification.flags>
	//*  59  121:bipush          8
	//*  60  123:iand            
	//*  61  124:ifeq            133
			flag1 = true;
	//   62  127:iconst_1        
	//   63  128:istore          14
		else
	//*  64  130:goto            136
			flag1 = false;
	//   65  133:iconst_0        
	//   66  134:istore          14
		context = ((Context) (((android.app.Notification.Builder) (context)).setOnlyAlertOnce(flag1)));
	//   67  136:aload_1         
	//   68  137:iload           14
	//   69  139:invokevirtual   #106 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
	//   70  142:astore_1        
		if((notification.flags & 0x10) != 0)
	//*  71  143:aload_2         
	//*  72  144:getfield        #100 <Field int Notification.flags>
	//*  73  147:bipush          16
	//*  74  149:iand            
	//*  75  150:ifeq            159
			flag1 = true;
	//   76  153:iconst_1        
	//   77  154:istore          14
		else
	//*  78  156:goto            162
			flag1 = false;
	//   79  159:iconst_0        
	//   80  160:istore          14
		context = ((Context) (((android.app.Notification.Builder) (context)).setAutoCancel(flag1).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setSubText(charsequence3).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent)));
	//   81  162:aload_1         
	//   82  163:iload           14
	//   83  165:invokevirtual   #109 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
	//   84  168:aload_2         
	//   85  169:getfield        #112 <Field int Notification.defaults>
	//   86  172:invokevirtual   #116 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
	//   87  175:aload_3         
	//   88  176:invokevirtual   #120 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//   89  179:aload           4
	//   90  181:invokevirtual   #123 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//   91  184:aload           17
	//   92  186:invokevirtual   #126 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
	//   93  189:aload           5
	//   94  191:invokevirtual   #129 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
	//   95  194:aload           8
	//   96  196:invokevirtual   #133 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
	//   97  199:aload_2         
	//   98  200:getfield        #137 <Field PendingIntent Notification.deleteIntent>
	//   99  203:invokevirtual   #140 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
	//  100  206:astore_1        
		if((notification.flags & 0x80) != 0)
	//* 101  207:aload_2         
	//* 102  208:getfield        #100 <Field int Notification.flags>
	//* 103  211:sipush          128
	//* 104  214:iand            
	//* 105  215:ifeq            224
			flag1 = true;
	//  106  218:iconst_1        
	//  107  219:istore          14
		else
	//* 108  221:goto            228
			flag1 = flag5;
	//  109  224:iload           34
	//  110  226:istore          14
		b = ((android.app.Notification.Builder) (context)).setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag2).setPriority(l).setProgress(j, k, flag).setLocalOnly(flag3).setExtras(bundle).setGroup(s1).setGroupSummary(flag4).setSortKey(s2).setCategory(s).setColor(i1).setVisibility(j1).setPublicVersion(notification1).setRemoteInputHistory(acharsequence);
	//  111  228:aload_0         
	//  112  229:aload_1         
	//  113  230:aload           9
	//  114  232:iload           14
	//  115  234:invokevirtual   #144 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
	//  116  237:aload           10
	//  117  239:invokevirtual   #148 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
	//  118  242:iload           7
	//  119  244:invokevirtual   #151 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
	//  120  247:iload           15
	//  121  249:invokevirtual   #154 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
	//  122  252:iload           16
	//  123  254:invokevirtual   #157 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
	//  124  257:iload           11
	//  125  259:iload           12
	//  126  261:iload           13
	//  127  263:invokevirtual   #161 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
	//  128  266:iload           18
	//  129  268:invokevirtual   #164 <Method android.app.Notification$Builder android.app.Notification$Builder.setLocalOnly(boolean)>
	//  130  271:aload           21
	//  131  273:invokevirtual   #168 <Method android.app.Notification$Builder android.app.Notification$Builder.setExtras(Bundle)>
	//  132  276:aload           25
	//  133  278:invokevirtual   #172 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroup(String)>
	//  134  281:iload           26
	//  135  283:invokevirtual   #175 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroupSummary(boolean)>
	//  136  286:aload           27
	//  137  288:invokevirtual   #178 <Method android.app.Notification$Builder android.app.Notification$Builder.setSortKey(String)>
	//  138  291:aload           19
	//  139  293:invokevirtual   #181 <Method android.app.Notification$Builder android.app.Notification$Builder.setCategory(String)>
	//  140  296:iload           22
	//  141  298:invokevirtual   #184 <Method android.app.Notification$Builder android.app.Notification$Builder.setColor(int)>
	//  142  301:iload           23
	//  143  303:invokevirtual   #187 <Method android.app.Notification$Builder android.app.Notification$Builder.setVisibility(int)>
	//  144  306:aload           24
	//  145  308:invokevirtual   #191 <Method android.app.Notification$Builder android.app.Notification$Builder.setPublicVersion(Notification)>
	//  146  311:aload           28
	//  147  313:invokevirtual   #195 <Method android.app.Notification$Builder android.app.Notification$Builder.setRemoteInputHistory(CharSequence[])>
	//  148  316:putfield        #197 <Field android.app.Notification$Builder b>
		if(remoteviews1 != null)
	//* 149  319:aload           29
	//* 150  321:ifnull          334
			b.setCustomContentView(remoteviews1);
	//  151  324:aload_0         
	//  152  325:getfield        #197 <Field android.app.Notification$Builder b>
	//  153  328:aload           29
	//  154  330:invokevirtual   #200 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomContentView(RemoteViews)>
	//  155  333:pop             
		if(remoteviews2 != null)
	//* 156  334:aload           30
	//* 157  336:ifnull          349
			b.setCustomBigContentView(remoteviews2);
	//  158  339:aload_0         
	//  159  340:getfield        #197 <Field android.app.Notification$Builder b>
	//  160  343:aload           30
	//  161  345:invokevirtual   #203 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomBigContentView(RemoteViews)>
	//  162  348:pop             
		if(remoteviews3 != null)
	//* 163  349:aload           31
	//* 164  351:ifnull          364
			b.setCustomHeadsUpContentView(remoteviews3);
	//  165  354:aload_0         
	//  166  355:getfield        #197 <Field android.app.Notification$Builder b>
	//  167  358:aload           31
	//  168  360:invokevirtual   #206 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomHeadsUpContentView(RemoteViews)>
	//  169  363:pop             
		for(context = ((Context) (arraylist.iterator())); ((Iterator) (context)).hasNext(); b.addPerson(((String) (notification))))
	//* 170  364:aload           20
	//* 171  366:invokevirtual   #212 <Method Iterator ArrayList.iterator()>
	//* 172  369:astore_1        
	//* 173  370:aload_1         
	//* 174  371:invokeinterface #218 <Method boolean Iterator.hasNext()>
	//* 175  376:ifeq            401
			notification = ((Notification) ((String)((Iterator) (context)).next()));
	//  176  379:aload_1         
	//  177  380:invokeinterface #222 <Method Object Iterator.next()>
	//  178  385:checkcast       #224 <Class String>
	//  179  388:astore_2        

	//  180  389:aload_0         
	//  181  390:getfield        #197 <Field android.app.Notification$Builder b>
	//  182  393:aload_2         
	//  183  394:invokevirtual   #227 <Method android.app.Notification$Builder android.app.Notification$Builder.addPerson(String)>
	//  184  397:pop             
	//* 185  398:goto            370
		mGroupAlertBehavior = k1;
	//  186  401:aload_0         
	//  187  402:iload           32
	//  188  404:putfield        #229 <Field int mGroupAlertBehavior>
	//  189  407:return          
	}
}
