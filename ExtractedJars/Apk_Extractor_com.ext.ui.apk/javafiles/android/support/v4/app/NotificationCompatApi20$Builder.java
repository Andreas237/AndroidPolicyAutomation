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

// Referenced classes of package android.support.v4.app:
//			NotificationBuilderWithActions, NotificationBuilderWithBuilderAccessor, NotificationCompatApi20

public static class NotificationCompatApi20$Builder
	implements NotificationBuilderWithActions, NotificationBuilderWithBuilderAccessor
{

	private void removeSoundAndVibration(Notification notification)
	{
		notification.sound = null;
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:putfield        #73  <Field android.net.Uri Notification.sound>
		notification.vibrate = null;
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:putfield        #84  <Field long[] Notification.vibrate>
		notification.defaults = notification.defaults & -2;
	//    6   10:aload_1         
	//    7   11:aload_1         
	//    8   12:getfield        #116 <Field int Notification.defaults>
	//    9   15:bipush          -2
	//   10   17:iand            
	//   11   18:putfield        #116 <Field int Notification.defaults>
		notification.defaults = notification.defaults & -3;
	//   12   21:aload_1         
	//   13   22:aload_1         
	//   14   23:getfield        #116 <Field int Notification.defaults>
	//   15   26:bipush          -3
	//   16   28:iand            
	//   17   29:putfield        #116 <Field int Notification.defaults>
	//   18   32:return          
	}

	public void addAction(NotificationCompatBase.Action action)
	{
		NotificationCompatApi20.addAction(b, action);
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field android.app.Notification$Builder b>
	//    2    4:aload_1         
	//    3    5:invokestatic    #229 <Method void NotificationCompatApi20.addAction(android.app.Notification$Builder, NotificationCompatBase$Action)>
	//    4    8:return          
	}

	public Notification build()
	{
		b.setExtras(mExtras);
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field android.app.Notification$Builder b>
	//    2    4:aload_0         
	//    3    5:getfield        #185 <Field Bundle mExtras>
	//    4    8:invokevirtual   #235 <Method android.app.Notification$Builder android.app.Notification$Builder.setExtras(Bundle)>
	//    5   11:pop             
		Notification notification = b.build();
	//    6   12:aload_0         
	//    7   13:getfield        #180 <Field android.app.Notification$Builder b>
	//    8   16:invokevirtual   #237 <Method Notification android.app.Notification$Builder.build()>
	//    9   19:astore_1        
		if(mContentView != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #215 <Field RemoteViews mContentView>
	//*  12   24:ifnull          35
			notification.contentView = mContentView;
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #215 <Field RemoteViews mContentView>
	//   16   32:putfield        #57  <Field RemoteViews Notification.contentView>
		if(mBigContentView != null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #217 <Field RemoteViews mBigContentView>
	//*  19   39:ifnull          50
			notification.bigContentView = mBigContentView;
	//   20   42:aload_1         
	//   21   43:aload_0         
	//   22   44:getfield        #217 <Field RemoteViews mBigContentView>
	//   23   47:putfield        #240 <Field RemoteViews Notification.bigContentView>
		if(mGroupAlertBehavior != 0)
	//*  24   50:aload_0         
	//*  25   51:getfield        #219 <Field int mGroupAlertBehavior>
	//*  26   54:ifeq            119
		{
			if(notification.getGroup() != null && (notification.flags & 0x200) != 0 && mGroupAlertBehavior == 2)
	//*  27   57:aload_1         
	//*  28   58:invokevirtual   #244 <Method String Notification.getGroup()>
	//*  29   61:ifnull          88
	//*  30   64:aload_1         
	//*  31   65:getfield        #104 <Field int Notification.flags>
	//*  32   68:sipush          512
	//*  33   71:iand            
	//*  34   72:ifeq            88
	//*  35   75:aload_0         
	//*  36   76:getfield        #219 <Field int mGroupAlertBehavior>
	//*  37   79:iconst_2        
	//*  38   80:icmpne          88
				removeSoundAndVibration(notification);
	//   39   83:aload_0         
	//   40   84:aload_1         
	//   41   85:invokespecial   #246 <Method void removeSoundAndVibration(Notification)>
			if(notification.getGroup() != null && (notification.flags & 0x200) == 0 && mGroupAlertBehavior == 1)
	//*  42   88:aload_1         
	//*  43   89:invokevirtual   #244 <Method String Notification.getGroup()>
	//*  44   92:ifnull          119
	//*  45   95:aload_1         
	//*  46   96:getfield        #104 <Field int Notification.flags>
	//*  47   99:sipush          512
	//*  48  102:iand            
	//*  49  103:ifne            119
	//*  50  106:aload_0         
	//*  51  107:getfield        #219 <Field int mGroupAlertBehavior>
	//*  52  110:iconst_1        
	//*  53  111:icmpne          119
				removeSoundAndVibration(notification);
	//   54  114:aload_0         
	//   55  115:aload_1         
	//   56  116:invokespecial   #246 <Method void removeSoundAndVibration(Notification)>
		}
		return notification;
	//   57  119:aload_1         
	//   58  120:areturn         
	}

	public android.app.Notification.Builder getBuilder()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field android.app.Notification$Builder b>
	//    2    4:areturn         
	}

	private android.app.Notification.Builder b;
	private RemoteViews mBigContentView;
	private RemoteViews mContentView;
	private Bundle mExtras;
	private int mGroupAlertBehavior;

	public NotificationCompatApi20$Builder(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
			PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
			boolean flag2, int l, CharSequence charsequence3, boolean flag3, ArrayList arraylist, Bundle bundle, String s, 
			boolean flag4, String s1, RemoteViews remoteviews1, RemoteViews remoteviews2, int i1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		context = ((Context) ((new android.app.Notification.Builder(context)).setWhen(notification.when).setShowWhen(flag1).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS)));
	//    2    4:new             #27  <Class android.app.Notification$Builder>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #30  <Method void android.app.Notification$Builder(Context)>
	//    6   12:aload_2         
	//    7   13:getfield        #36  <Field long Notification.when>
	//    8   16:invokevirtual   #40  <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
	//    9   19:iload           14
	//   10   21:invokevirtual   #44  <Method android.app.Notification$Builder android.app.Notification$Builder.setShowWhen(boolean)>
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
	//*  43   91:ifeq            339
			flag1 = true;
	//   44   94:iconst_1        
	//   45   95:istore          14
		else
	//*  46   97:aload_1         
	//*  47   98:iload           14
	//*  48  100:invokevirtual   #107 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
	//*  49  103:astore_1        
	//*  50  104:aload_2         
	//*  51  105:getfield        #104 <Field int Notification.flags>
	//*  52  108:bipush          8
	//*  53  110:iand            
	//*  54  111:ifeq            345
	//*  55  114:iconst_1        
	//*  56  115:istore          14
	//*  57  117:aload_1         
	//*  58  118:iload           14
	//*  59  120:invokevirtual   #110 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
	//*  60  123:astore_1        
	//*  61  124:aload_2         
	//*  62  125:getfield        #104 <Field int Notification.flags>
	//*  63  128:bipush          16
	//*  64  130:iand            
	//*  65  131:ifeq            351
	//*  66  134:iconst_1        
	//*  67  135:istore          14
	//*  68  137:aload_1         
	//*  69  138:iload           14
	//*  70  140:invokevirtual   #113 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
	//*  71  143:aload_2         
	//*  72  144:getfield        #116 <Field int Notification.defaults>
	//*  73  147:invokevirtual   #120 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
	//*  74  150:aload_3         
	//*  75  151:invokevirtual   #124 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//*  76  154:aload           4
	//*  77  156:invokevirtual   #127 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//*  78  159:aload           17
	//*  79  161:invokevirtual   #130 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
	//*  80  164:aload           5
	//*  81  166:invokevirtual   #133 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
	//*  82  169:aload           8
	//*  83  171:invokevirtual   #137 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
	//*  84  174:aload_2         
	//*  85  175:getfield        #141 <Field PendingIntent Notification.deleteIntent>
	//*  86  178:invokevirtual   #144 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
	//*  87  181:astore_1        
	//*  88  182:aload_2         
	//*  89  183:getfield        #104 <Field int Notification.flags>
	//*  90  186:sipush          128
	//*  91  189:iand            
	//*  92  190:ifeq            357
	//*  93  193:iconst_1        
	//*  94  194:istore          14
	//*  95  196:aload_0         
	//*  96  197:aload_1         
	//*  97  198:aload           9
	//*  98  200:iload           14
	//*  99  202:invokevirtual   #148 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
	//* 100  205:aload           10
	//* 101  207:invokevirtual   #152 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
	//* 102  210:iload           7
	//* 103  212:invokevirtual   #155 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
	//* 104  215:iload           15
	//* 105  217:invokevirtual   #158 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
	//* 106  220:iload           16
	//* 107  222:invokevirtual   #161 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
	//* 108  225:iload           11
	//* 109  227:iload           12
	//* 110  229:iload           13
	//* 111  231:invokevirtual   #165 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
	//* 112  234:iload           18
	//* 113  236:invokevirtual   #168 <Method android.app.Notification$Builder android.app.Notification$Builder.setLocalOnly(boolean)>
	//* 114  239:aload           21
	//* 115  241:invokevirtual   #172 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroup(String)>
	//* 116  244:iload           22
	//* 117  246:invokevirtual   #175 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroupSummary(boolean)>
	//* 118  249:aload           23
	//* 119  251:invokevirtual   #178 <Method android.app.Notification$Builder android.app.Notification$Builder.setSortKey(String)>
	//* 120  254:putfield        #180 <Field android.app.Notification$Builder b>
	//* 121  257:aload_0         
	//* 122  258:new             #182 <Class Bundle>
	//* 123  261:dup             
	//* 124  262:invokespecial   #183 <Method void Bundle()>
	//* 125  265:putfield        #185 <Field Bundle mExtras>
	//* 126  268:aload           20
	//* 127  270:ifnull          282
	//* 128  273:aload_0         
	//* 129  274:getfield        #185 <Field Bundle mExtras>
	//* 130  277:aload           20
	//* 131  279:invokevirtual   #189 <Method void Bundle.putAll(Bundle)>
	//* 132  282:aload           19
	//* 133  284:ifnull          320
	//* 134  287:aload           19
	//* 135  289:invokevirtual   #195 <Method boolean ArrayList.isEmpty()>
	//* 136  292:ifne            320
	//* 137  295:aload_0         
	//* 138  296:getfield        #185 <Field Bundle mExtras>
	//* 139  299:ldc1            #197 <String "android.people">
	//* 140  301:aload           19
	//* 141  303:aload           19
	//* 142  305:invokevirtual   #201 <Method int ArrayList.size()>
	//* 143  308:anewarray       String[]
	//* 144  311:invokevirtual   #207 <Method Object[] ArrayList.toArray(Object[])>
	//* 145  314:checkcast       #209 <Class String[]>
	//* 146  317:invokevirtual   #213 <Method void Bundle.putStringArray(String, String[])>
	//* 147  320:aload_0         
	//* 148  321:aload           24
	//* 149  323:putfield        #215 <Field RemoteViews mContentView>
	//* 150  326:aload_0         
	//* 151  327:aload           25
	//* 152  329:putfield        #217 <Field RemoteViews mBigContentView>
	//* 153  332:aload_0         
	//* 154  333:iload           26
	//* 155  335:putfield        #219 <Field int mGroupAlertBehavior>
	//* 156  338:return          
			flag1 = false;
	//  157  339:iconst_0        
	//  158  340:istore          14
		context = ((Context) (((android.app.Notification.Builder) (context)).setOngoing(flag1)));
		if((notification.flags & 8) != 0)
			flag1 = true;
		else
	//* 159  342:goto            97
			flag1 = false;
	//  160  345:iconst_0        
	//  161  346:istore          14
		context = ((Context) (((android.app.Notification.Builder) (context)).setOnlyAlertOnce(flag1)));
		if((notification.flags & 0x10) != 0)
			flag1 = true;
		else
	//* 162  348:goto            117
			flag1 = false;
	//  163  351:iconst_0        
	//  164  352:istore          14
		context = ((Context) (((android.app.Notification.Builder) (context)).setAutoCancel(flag1).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setSubText(charsequence3).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent)));
		if((notification.flags & 0x80) != 0)
			flag1 = true;
		else
	//* 165  354:goto            137
			flag1 = false;
	//  166  357:iconst_0        
	//  167  358:istore          14
		b = ((android.app.Notification.Builder) (context)).setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag2).setPriority(l).setProgress(j, k, flag).setLocalOnly(flag3).setGroup(s).setGroupSummary(flag4).setSortKey(s1);
		mExtras = new Bundle();
		if(bundle != null)
			mExtras.putAll(bundle);
		if(arraylist != null && !arraylist.isEmpty())
			mExtras.putStringArray("android.people", (String[])arraylist.toArray(((Object []) (new String[arraylist.size()]))));
		mContentView = remoteviews1;
		mBigContentView = remoteviews2;
		mGroupAlertBehavior = i1;
	//* 168  360:goto            196
	}
}
