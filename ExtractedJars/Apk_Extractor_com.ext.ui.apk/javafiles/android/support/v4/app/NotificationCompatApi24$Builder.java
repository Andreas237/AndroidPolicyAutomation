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
		if((notification.flags & 2) != 0)
	//*  39   85:aload_2         
	//*  40   86:getfield        #100 <Field int Notification.flags>
	//*  41   89:iconst_2        
	//*  42   90:iand            
	//*  43   91:ifeq            369
			flag1 = true;
	//   44   94:iconst_1        
	//   45   95:istore          14
		else
	//*  46   97:aload_1         
	//*  47   98:iload           14
	//*  48  100:invokevirtual   #103 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
	//*  49  103:astore_1        
	//*  50  104:aload_2         
	//*  51  105:getfield        #100 <Field int Notification.flags>
	//*  52  108:bipush          8
	//*  53  110:iand            
	//*  54  111:ifeq            375
	//*  55  114:iconst_1        
	//*  56  115:istore          14
	//*  57  117:aload_1         
	//*  58  118:iload           14
	//*  59  120:invokevirtual   #106 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
	//*  60  123:astore_1        
	//*  61  124:aload_2         
	//*  62  125:getfield        #100 <Field int Notification.flags>
	//*  63  128:bipush          16
	//*  64  130:iand            
	//*  65  131:ifeq            381
	//*  66  134:iconst_1        
	//*  67  135:istore          14
	//*  68  137:aload_1         
	//*  69  138:iload           14
	//*  70  140:invokevirtual   #109 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
	//*  71  143:aload_2         
	//*  72  144:getfield        #112 <Field int Notification.defaults>
	//*  73  147:invokevirtual   #116 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
	//*  74  150:aload_3         
	//*  75  151:invokevirtual   #120 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//*  76  154:aload           4
	//*  77  156:invokevirtual   #123 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//*  78  159:aload           17
	//*  79  161:invokevirtual   #126 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
	//*  80  164:aload           5
	//*  81  166:invokevirtual   #129 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
	//*  82  169:aload           8
	//*  83  171:invokevirtual   #133 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
	//*  84  174:aload_2         
	//*  85  175:getfield        #137 <Field PendingIntent Notification.deleteIntent>
	//*  86  178:invokevirtual   #140 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
	//*  87  181:astore_1        
	//*  88  182:aload_2         
	//*  89  183:getfield        #100 <Field int Notification.flags>
	//*  90  186:sipush          128
	//*  91  189:iand            
	//*  92  190:ifeq            387
	//*  93  193:iconst_1        
	//*  94  194:istore          14
	//*  95  196:aload_0         
	//*  96  197:aload_1         
	//*  97  198:aload           9
	//*  98  200:iload           14
	//*  99  202:invokevirtual   #144 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
	//* 100  205:aload           10
	//* 101  207:invokevirtual   #148 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
	//* 102  210:iload           7
	//* 103  212:invokevirtual   #151 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
	//* 104  215:iload           15
	//* 105  217:invokevirtual   #154 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
	//* 106  220:iload           16
	//* 107  222:invokevirtual   #157 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
	//* 108  225:iload           11
	//* 109  227:iload           12
	//* 110  229:iload           13
	//* 111  231:invokevirtual   #161 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
	//* 112  234:iload           18
	//* 113  236:invokevirtual   #164 <Method android.app.Notification$Builder android.app.Notification$Builder.setLocalOnly(boolean)>
	//* 114  239:aload           21
	//* 115  241:invokevirtual   #168 <Method android.app.Notification$Builder android.app.Notification$Builder.setExtras(Bundle)>
	//* 116  244:aload           25
	//* 117  246:invokevirtual   #172 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroup(String)>
	//* 118  249:iload           26
	//* 119  251:invokevirtual   #175 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroupSummary(boolean)>
	//* 120  254:aload           27
	//* 121  256:invokevirtual   #178 <Method android.app.Notification$Builder android.app.Notification$Builder.setSortKey(String)>
	//* 122  259:aload           19
	//* 123  261:invokevirtual   #181 <Method android.app.Notification$Builder android.app.Notification$Builder.setCategory(String)>
	//* 124  264:iload           22
	//* 125  266:invokevirtual   #184 <Method android.app.Notification$Builder android.app.Notification$Builder.setColor(int)>
	//* 126  269:iload           23
	//* 127  271:invokevirtual   #187 <Method android.app.Notification$Builder android.app.Notification$Builder.setVisibility(int)>
	//* 128  274:aload           24
	//* 129  276:invokevirtual   #191 <Method android.app.Notification$Builder android.app.Notification$Builder.setPublicVersion(Notification)>
	//* 130  279:aload           28
	//* 131  281:invokevirtual   #195 <Method android.app.Notification$Builder android.app.Notification$Builder.setRemoteInputHistory(CharSequence[])>
	//* 132  284:putfield        #197 <Field android.app.Notification$Builder b>
	//* 133  287:aload           29
	//* 134  289:ifnull          302
	//* 135  292:aload_0         
	//* 136  293:getfield        #197 <Field android.app.Notification$Builder b>
	//* 137  296:aload           29
	//* 138  298:invokevirtual   #200 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomContentView(RemoteViews)>
	//* 139  301:pop             
	//* 140  302:aload           30
	//* 141  304:ifnull          317
	//* 142  307:aload_0         
	//* 143  308:getfield        #197 <Field android.app.Notification$Builder b>
	//* 144  311:aload           30
	//* 145  313:invokevirtual   #203 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomBigContentView(RemoteViews)>
	//* 146  316:pop             
	//* 147  317:aload           31
	//* 148  319:ifnull          332
	//* 149  322:aload_0         
	//* 150  323:getfield        #197 <Field android.app.Notification$Builder b>
	//* 151  326:aload           31
	//* 152  328:invokevirtual   #206 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomHeadsUpContentView(RemoteViews)>
	//* 153  331:pop             
	//* 154  332:aload           20
	//* 155  334:invokevirtual   #212 <Method Iterator ArrayList.iterator()>
	//* 156  337:astore_1        
	//* 157  338:aload_1         
	//* 158  339:invokeinterface #218 <Method boolean Iterator.hasNext()>
	//* 159  344:ifeq            393
	//* 160  347:aload_1         
	//* 161  348:invokeinterface #222 <Method Object Iterator.next()>
	//* 162  353:checkcast       #224 <Class String>
	//* 163  356:astore_2        
	//* 164  357:aload_0         
	//* 165  358:getfield        #197 <Field android.app.Notification$Builder b>
	//* 166  361:aload_2         
	//* 167  362:invokevirtual   #227 <Method android.app.Notification$Builder android.app.Notification$Builder.addPerson(String)>
	//* 168  365:pop             
	//* 169  366:goto            338
			flag1 = false;
	//  170  369:iconst_0        
	//  171  370:istore          14
		context = ((Context) (((android.app.Notification.Builder) (context)).setOngoing(flag1)));
		if((notification.flags & 8) != 0)
			flag1 = true;
		else
	//* 172  372:goto            97
			flag1 = false;
	//  173  375:iconst_0        
	//  174  376:istore          14
		context = ((Context) (((android.app.Notification.Builder) (context)).setOnlyAlertOnce(flag1)));
		if((notification.flags & 0x10) != 0)
			flag1 = true;
		else
	//* 175  378:goto            117
			flag1 = false;
	//  176  381:iconst_0        
	//  177  382:istore          14
		context = ((Context) (((android.app.Notification.Builder) (context)).setAutoCancel(flag1).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setSubText(charsequence3).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent)));
		if((notification.flags & 0x80) != 0)
			flag1 = true;
		else
	//* 178  384:goto            137
			flag1 = false;
	//  179  387:iconst_0        
	//  180  388:istore          14
		b = ((android.app.Notification.Builder) (context)).setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag2).setPriority(l).setProgress(j, k, flag).setLocalOnly(flag3).setExtras(bundle).setGroup(s1).setGroupSummary(flag4).setSortKey(s2).setCategory(s).setColor(i1).setVisibility(j1).setPublicVersion(notification1).setRemoteInputHistory(acharsequence);
		if(remoteviews1 != null)
			b.setCustomContentView(remoteviews1);
		if(remoteviews2 != null)
			b.setCustomBigContentView(remoteviews2);
		if(remoteviews3 != null)
			b.setCustomHeadsUpContentView(remoteviews3);
		for(context = ((Context) (arraylist.iterator())); ((Iterator) (context)).hasNext(); b.addPerson(((String) (notification))))
			notification = ((Notification) ((String)((Iterator) (context)).next()));

	//* 181  390:goto            196
		mGroupAlertBehavior = k1;
	//  182  393:aload_0         
	//  183  394:iload           32
	//  184  396:putfield        #229 <Field int mGroupAlertBehavior>
	//  185  399:return          
	}
}
