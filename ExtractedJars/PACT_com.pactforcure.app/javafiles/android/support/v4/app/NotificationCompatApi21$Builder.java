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

	private void removeSoundAndVibration(Notification notification)
	{
		notification.sound = null;
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:putfield        #74  <Field android.net.Uri Notification.sound>
		notification.vibrate = null;
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:putfield        #85  <Field long[] Notification.vibrate>
		notification.defaults = notification.defaults & -2;
	//    6   10:aload_1         
	//    7   11:aload_1         
	//    8   12:getfield        #117 <Field int Notification.defaults>
	//    9   15:bipush          -2
	//   10   17:iand            
	//   11   18:putfield        #117 <Field int Notification.defaults>
		notification.defaults = notification.defaults & -3;
	//   12   21:aload_1         
	//   13   22:aload_1         
	//   14   23:getfield        #117 <Field int Notification.defaults>
	//   15   26:bipush          -3
	//   16   28:iand            
	//   17   29:putfield        #117 <Field int Notification.defaults>
	//   18   32:return          
	}

	public void addAction(NotificationCompatBase.Action action)
	{
		NotificationCompatApi20.addAction(b, action);
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field android.app.Notification$Builder b>
	//    2    4:aload_1         
	//    3    5:invokestatic    #244 <Method void NotificationCompatApi20.addAction(android.app.Notification$Builder, NotificationCompatBase$Action)>
	//    4    8:return          
	}

	public Notification build()
	{
		b.setExtras(mExtras);
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field android.app.Notification$Builder b>
	//    2    4:aload_0         
	//    3    5:getfield        #199 <Field Bundle mExtras>
	//    4    8:invokevirtual   #250 <Method android.app.Notification$Builder android.app.Notification$Builder.setExtras(Bundle)>
	//    5   11:pop             
		Notification notification = b.build();
	//    6   12:aload_0         
	//    7   13:getfield        #194 <Field android.app.Notification$Builder b>
	//    8   16:invokevirtual   #252 <Method Notification android.app.Notification$Builder.build()>
	//    9   19:astore_1        
		if(mContentView != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #226 <Field RemoteViews mContentView>
	//*  12   24:ifnull          35
			notification.contentView = mContentView;
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #226 <Field RemoteViews mContentView>
	//   16   32:putfield        #58  <Field RemoteViews Notification.contentView>
		if(mBigContentView != null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #228 <Field RemoteViews mBigContentView>
	//*  19   39:ifnull          50
			notification.bigContentView = mBigContentView;
	//   20   42:aload_1         
	//   21   43:aload_0         
	//   22   44:getfield        #228 <Field RemoteViews mBigContentView>
	//   23   47:putfield        #255 <Field RemoteViews Notification.bigContentView>
		if(mHeadsUpContentView != null)
	//*  24   50:aload_0         
	//*  25   51:getfield        #230 <Field RemoteViews mHeadsUpContentView>
	//*  26   54:ifnull          65
			notification.headsUpContentView = mHeadsUpContentView;
	//   27   57:aload_1         
	//   28   58:aload_0         
	//   29   59:getfield        #230 <Field RemoteViews mHeadsUpContentView>
	//   30   62:putfield        #258 <Field RemoteViews Notification.headsUpContentView>
		if(mGroupAlertBehavior != 0)
	//*  31   65:aload_0         
	//*  32   66:getfield        #232 <Field int mGroupAlertBehavior>
	//*  33   69:ifeq            134
		{
			if(notification.getGroup() != null && (notification.flags & 0x200) != 0 && mGroupAlertBehavior == 2)
	//*  34   72:aload_1         
	//*  35   73:invokevirtual   #262 <Method String Notification.getGroup()>
	//*  36   76:ifnull          103
	//*  37   79:aload_1         
	//*  38   80:getfield        #105 <Field int Notification.flags>
	//*  39   83:sipush          512
	//*  40   86:iand            
	//*  41   87:ifeq            103
	//*  42   90:aload_0         
	//*  43   91:getfield        #232 <Field int mGroupAlertBehavior>
	//*  44   94:iconst_2        
	//*  45   95:icmpne          103
				removeSoundAndVibration(notification);
	//   46   98:aload_0         
	//   47   99:aload_1         
	//   48  100:invokespecial   #264 <Method void removeSoundAndVibration(Notification)>
			if(notification.getGroup() != null && (notification.flags & 0x200) == 0 && mGroupAlertBehavior == 1)
	//*  49  103:aload_1         
	//*  50  104:invokevirtual   #262 <Method String Notification.getGroup()>
	//*  51  107:ifnull          134
	//*  52  110:aload_1         
	//*  53  111:getfield        #105 <Field int Notification.flags>
	//*  54  114:sipush          512
	//*  55  117:iand            
	//*  56  118:ifne            134
	//*  57  121:aload_0         
	//*  58  122:getfield        #232 <Field int mGroupAlertBehavior>
	//*  59  125:iconst_1        
	//*  60  126:icmpne          134
				removeSoundAndVibration(notification);
	//   61  129:aload_0         
	//   62  130:aload_1         
	//   63  131:invokespecial   #264 <Method void removeSoundAndVibration(Notification)>
		}
		return notification;
	//   64  134:aload_1         
	//   65  135:areturn         
	}

	public android.app.Notification.Builder getBuilder()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field android.app.Notification$Builder b>
	//    2    4:areturn         
	}

	private android.app.Notification.Builder b;
	private RemoteViews mBigContentView;
	private RemoteViews mContentView;
	private Bundle mExtras;
	private int mGroupAlertBehavior;
	private RemoteViews mHeadsUpContentView;

	public NotificationCompatApi21$Builder(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
			PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
			boolean flag2, int l, CharSequence charsequence3, boolean flag3, String s, ArrayList arraylist, Bundle bundle, 
			int i1, int j1, Notification notification1, String s1, boolean flag4, String s2, RemoteViews remoteviews1, 
			RemoteViews remoteviews2, RemoteViews remoteviews3, int k1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		context = ((Context) ((new android.app.Notification.Builder(context)).setWhen(notification.when).setShowWhen(flag1).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS)));
	//    2    4:new             #28  <Class android.app.Notification$Builder>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #31  <Method void android.app.Notification$Builder(Context)>
	//    6   12:aload_2         
	//    7   13:getfield        #37  <Field long Notification.when>
	//    8   16:invokevirtual   #41  <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
	//    9   19:iload           14
	//   10   21:invokevirtual   #45  <Method android.app.Notification$Builder android.app.Notification$Builder.setShowWhen(boolean)>
	//   11   24:aload_2         
	//   12   25:getfield        #48  <Field int Notification.icon>
	//   13   28:aload_2         
	//   14   29:getfield        #51  <Field int Notification.iconLevel>
	//   15   32:invokevirtual   #55  <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int, int)>
	//   16   35:aload_2         
	//   17   36:getfield        #58  <Field RemoteViews Notification.contentView>
	//   18   39:invokevirtual   #62  <Method android.app.Notification$Builder android.app.Notification$Builder.setContent(RemoteViews)>
	//   19   42:aload_2         
	//   20   43:getfield        #66  <Field CharSequence Notification.tickerText>
	//   21   46:aload           6
	//   22   48:invokevirtual   #70  <Method android.app.Notification$Builder android.app.Notification$Builder.setTicker(CharSequence, RemoteViews)>
	//   23   51:aload_2         
	//   24   52:getfield        #74  <Field android.net.Uri Notification.sound>
	//   25   55:aload_2         
	//   26   56:getfield        #77  <Field int Notification.audioStreamType>
	//   27   59:invokevirtual   #81  <Method android.app.Notification$Builder android.app.Notification$Builder.setSound(android.net.Uri, int)>
	//   28   62:aload_2         
	//   29   63:getfield        #85  <Field long[] Notification.vibrate>
	//   30   66:invokevirtual   #89  <Method android.app.Notification$Builder android.app.Notification$Builder.setVibrate(long[])>
	//   31   69:aload_2         
	//   32   70:getfield        #92  <Field int Notification.ledARGB>
	//   33   73:aload_2         
	//   34   74:getfield        #95  <Field int Notification.ledOnMS>
	//   35   77:aload_2         
	//   36   78:getfield        #98  <Field int Notification.ledOffMS>
	//   37   81:invokevirtual   #102 <Method android.app.Notification$Builder android.app.Notification$Builder.setLights(int, int, int)>
	//   38   84:astore_1        
		if((notification.flags & 2) != 0)
	//*  39   85:aload_2         
	//*  40   86:getfield        #105 <Field int Notification.flags>
	//*  41   89:iconst_2        
	//*  42   90:iand            
	//*  43   91:ifeq            339
			flag1 = true;
	//   44   94:iconst_1        
	//   45   95:istore          14
		else
	//*  46   97:aload_1         
	//*  47   98:iload           14
	//*  48  100:invokevirtual   #108 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
	//*  49  103:astore_1        
	//*  50  104:aload_2         
	//*  51  105:getfield        #105 <Field int Notification.flags>
	//*  52  108:bipush          8
	//*  53  110:iand            
	//*  54  111:ifeq            345
	//*  55  114:iconst_1        
	//*  56  115:istore          14
	//*  57  117:aload_1         
	//*  58  118:iload           14
	//*  59  120:invokevirtual   #111 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
	//*  60  123:astore_1        
	//*  61  124:aload_2         
	//*  62  125:getfield        #105 <Field int Notification.flags>
	//*  63  128:bipush          16
	//*  64  130:iand            
	//*  65  131:ifeq            351
	//*  66  134:iconst_1        
	//*  67  135:istore          14
	//*  68  137:aload_1         
	//*  69  138:iload           14
	//*  70  140:invokevirtual   #114 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
	//*  71  143:aload_2         
	//*  72  144:getfield        #117 <Field int Notification.defaults>
	//*  73  147:invokevirtual   #121 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
	//*  74  150:aload_3         
	//*  75  151:invokevirtual   #125 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//*  76  154:aload           4
	//*  77  156:invokevirtual   #128 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//*  78  159:aload           17
	//*  79  161:invokevirtual   #131 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
	//*  80  164:aload           5
	//*  81  166:invokevirtual   #134 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
	//*  82  169:aload           8
	//*  83  171:invokevirtual   #138 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
	//*  84  174:aload_2         
	//*  85  175:getfield        #142 <Field PendingIntent Notification.deleteIntent>
	//*  86  178:invokevirtual   #145 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
	//*  87  181:astore_1        
	//*  88  182:aload_2         
	//*  89  183:getfield        #105 <Field int Notification.flags>
	//*  90  186:sipush          128
	//*  91  189:iand            
	//*  92  190:ifeq            357
	//*  93  193:iconst_1        
	//*  94  194:istore          14
	//*  95  196:aload_0         
	//*  96  197:aload_1         
	//*  97  198:aload           9
	//*  98  200:iload           14
	//*  99  202:invokevirtual   #149 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
	//* 100  205:aload           10
	//* 101  207:invokevirtual   #153 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
	//* 102  210:iload           7
	//* 103  212:invokevirtual   #156 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
	//* 104  215:iload           15
	//* 105  217:invokevirtual   #159 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
	//* 106  220:iload           16
	//* 107  222:invokevirtual   #162 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
	//* 108  225:iload           11
	//* 109  227:iload           12
	//* 110  229:iload           13
	//* 111  231:invokevirtual   #166 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
	//* 112  234:iload           18
	//* 113  236:invokevirtual   #169 <Method android.app.Notification$Builder android.app.Notification$Builder.setLocalOnly(boolean)>
	//* 114  239:aload           25
	//* 115  241:invokevirtual   #173 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroup(String)>
	//* 116  244:iload           26
	//* 117  246:invokevirtual   #176 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroupSummary(boolean)>
	//* 118  249:aload           27
	//* 119  251:invokevirtual   #179 <Method android.app.Notification$Builder android.app.Notification$Builder.setSortKey(String)>
	//* 120  254:aload           19
	//* 121  256:invokevirtual   #182 <Method android.app.Notification$Builder android.app.Notification$Builder.setCategory(String)>
	//* 122  259:iload           22
	//* 123  261:invokevirtual   #185 <Method android.app.Notification$Builder android.app.Notification$Builder.setColor(int)>
	//* 124  264:iload           23
	//* 125  266:invokevirtual   #188 <Method android.app.Notification$Builder android.app.Notification$Builder.setVisibility(int)>
	//* 126  269:aload           24
	//* 127  271:invokevirtual   #192 <Method android.app.Notification$Builder android.app.Notification$Builder.setPublicVersion(Notification)>
	//* 128  274:putfield        #194 <Field android.app.Notification$Builder b>
	//* 129  277:aload_0         
	//* 130  278:new             #196 <Class Bundle>
	//* 131  281:dup             
	//* 132  282:invokespecial   #197 <Method void Bundle()>
	//* 133  285:putfield        #199 <Field Bundle mExtras>
	//* 134  288:aload           21
	//* 135  290:ifnull          302
	//* 136  293:aload_0         
	//* 137  294:getfield        #199 <Field Bundle mExtras>
	//* 138  297:aload           21
	//* 139  299:invokevirtual   #203 <Method void Bundle.putAll(Bundle)>
	//* 140  302:aload           20
	//* 141  304:invokevirtual   #209 <Method Iterator ArrayList.iterator()>
	//* 142  307:astore_1        
	//* 143  308:aload_1         
	//* 144  309:invokeinterface #215 <Method boolean Iterator.hasNext()>
	//* 145  314:ifeq            363
	//* 146  317:aload_1         
	//* 147  318:invokeinterface #219 <Method Object Iterator.next()>
	//* 148  323:checkcast       #221 <Class String>
	//* 149  326:astore_2        
	//* 150  327:aload_0         
	//* 151  328:getfield        #194 <Field android.app.Notification$Builder b>
	//* 152  331:aload_2         
	//* 153  332:invokevirtual   #224 <Method android.app.Notification$Builder android.app.Notification$Builder.addPerson(String)>
	//* 154  335:pop             
	//* 155  336:goto            308
			flag1 = false;
	//  156  339:iconst_0        
	//  157  340:istore          14
		context = ((Context) (((android.app.Notification.Builder) (context)).setOngoing(flag1)));
		if((notification.flags & 8) != 0)
			flag1 = true;
		else
	//* 158  342:goto            97
			flag1 = false;
	//  159  345:iconst_0        
	//  160  346:istore          14
		context = ((Context) (((android.app.Notification.Builder) (context)).setOnlyAlertOnce(flag1)));
		if((notification.flags & 0x10) != 0)
			flag1 = true;
		else
	//* 161  348:goto            117
			flag1 = false;
	//  162  351:iconst_0        
	//  163  352:istore          14
		context = ((Context) (((android.app.Notification.Builder) (context)).setAutoCancel(flag1).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setSubText(charsequence3).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent)));
		if((notification.flags & 0x80) != 0)
			flag1 = true;
		else
	//* 164  354:goto            137
			flag1 = false;
	//  165  357:iconst_0        
	//  166  358:istore          14
		b = ((android.app.Notification.Builder) (context)).setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag2).setPriority(l).setProgress(j, k, flag).setLocalOnly(flag3).setGroup(s1).setGroupSummary(flag4).setSortKey(s2).setCategory(s).setColor(i1).setVisibility(j1).setPublicVersion(notification1);
		mExtras = new Bundle();
		if(bundle != null)
			mExtras.putAll(bundle);
		for(context = ((Context) (arraylist.iterator())); ((Iterator) (context)).hasNext(); b.addPerson(((String) (notification))))
			notification = ((Notification) ((String)((Iterator) (context)).next()));

	//* 167  360:goto            196
		mContentView = remoteviews1;
	//  168  363:aload_0         
	//  169  364:aload           28
	//  170  366:putfield        #226 <Field RemoteViews mContentView>
		mBigContentView = remoteviews2;
	//  171  369:aload_0         
	//  172  370:aload           29
	//  173  372:putfield        #228 <Field RemoteViews mBigContentView>
		mHeadsUpContentView = remoteviews3;
	//  174  375:aload_0         
	//  175  376:aload           30
	//  176  378:putfield        #230 <Field RemoteViews mHeadsUpContentView>
		mGroupAlertBehavior = k1;
	//  177  381:aload_0         
	//  178  382:iload           31
	//  179  384:putfield        #232 <Field int mGroupAlertBehavior>
	//  180  387:return          
	}
}
