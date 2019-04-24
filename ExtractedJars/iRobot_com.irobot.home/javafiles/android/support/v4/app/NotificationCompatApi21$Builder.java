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
//			NotificationBuilderWithActions, NotificationBuilderWithBuilderAccessor, NotificationCompatApi21, NotificationCompatApi20

public static class NotificationCompatApi21$Builder
	implements NotificationBuilderWithActions, NotificationBuilderWithBuilderAccessor
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
		int l1 = notification.flags;
	//   39   85:aload_2         
	//   40   86:getfield        #105 <Field int Notification.flags>
	//   41   89:istore          32
		boolean flag5 = false;
	//   42   91:iconst_0        
	//   43   92:istore          33
		if((l1 & 2) != 0)
	//*  44   94:iload           32
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
	//   55  113:invokevirtual   #108 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
	//   56  116:astore_1        
		if((notification.flags & 8) != 0)
	//*  57  117:aload_2         
	//*  58  118:getfield        #105 <Field int Notification.flags>
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
	//   69  139:invokevirtual   #111 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
	//   70  142:astore_1        
		if((notification.flags & 0x10) != 0)
	//*  71  143:aload_2         
	//*  72  144:getfield        #105 <Field int Notification.flags>
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
	//   83  165:invokevirtual   #114 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
	//   84  168:aload_2         
	//   85  169:getfield        #117 <Field int Notification.defaults>
	//   86  172:invokevirtual   #121 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
	//   87  175:aload_3         
	//   88  176:invokevirtual   #125 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//   89  179:aload           4
	//   90  181:invokevirtual   #128 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//   91  184:aload           17
	//   92  186:invokevirtual   #131 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
	//   93  189:aload           5
	//   94  191:invokevirtual   #134 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
	//   95  194:aload           8
	//   96  196:invokevirtual   #138 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
	//   97  199:aload_2         
	//   98  200:getfield        #142 <Field PendingIntent Notification.deleteIntent>
	//   99  203:invokevirtual   #145 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
	//  100  206:astore_1        
		if((notification.flags & 0x80) != 0)
	//* 101  207:aload_2         
	//* 102  208:getfield        #105 <Field int Notification.flags>
	//* 103  211:sipush          128
	//* 104  214:iand            
	//* 105  215:ifeq            224
			flag1 = true;
	//  106  218:iconst_1        
	//  107  219:istore          14
		else
	//* 108  221:goto            228
			flag1 = flag5;
	//  109  224:iload           33
	//  110  226:istore          14
		b = ((android.app.Notification.Builder) (context)).setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag2).setPriority(l).setProgress(j, k, flag).setLocalOnly(flag3).setGroup(s1).setGroupSummary(flag4).setSortKey(s2).setCategory(s).setColor(i1).setVisibility(j1).setPublicVersion(notification1);
	//  111  228:aload_0         
	//  112  229:aload_1         
	//  113  230:aload           9
	//  114  232:iload           14
	//  115  234:invokevirtual   #149 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
	//  116  237:aload           10
	//  117  239:invokevirtual   #153 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
	//  118  242:iload           7
	//  119  244:invokevirtual   #156 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
	//  120  247:iload           15
	//  121  249:invokevirtual   #159 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
	//  122  252:iload           16
	//  123  254:invokevirtual   #162 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
	//  124  257:iload           11
	//  125  259:iload           12
	//  126  261:iload           13
	//  127  263:invokevirtual   #166 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
	//  128  266:iload           18
	//  129  268:invokevirtual   #169 <Method android.app.Notification$Builder android.app.Notification$Builder.setLocalOnly(boolean)>
	//  130  271:aload           25
	//  131  273:invokevirtual   #173 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroup(String)>
	//  132  276:iload           26
	//  133  278:invokevirtual   #176 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroupSummary(boolean)>
	//  134  281:aload           27
	//  135  283:invokevirtual   #179 <Method android.app.Notification$Builder android.app.Notification$Builder.setSortKey(String)>
	//  136  286:aload           19
	//  137  288:invokevirtual   #182 <Method android.app.Notification$Builder android.app.Notification$Builder.setCategory(String)>
	//  138  291:iload           22
	//  139  293:invokevirtual   #185 <Method android.app.Notification$Builder android.app.Notification$Builder.setColor(int)>
	//  140  296:iload           23
	//  141  298:invokevirtual   #188 <Method android.app.Notification$Builder android.app.Notification$Builder.setVisibility(int)>
	//  142  301:aload           24
	//  143  303:invokevirtual   #192 <Method android.app.Notification$Builder android.app.Notification$Builder.setPublicVersion(Notification)>
	//  144  306:putfield        #194 <Field android.app.Notification$Builder b>
		mExtras = new Bundle();
	//  145  309:aload_0         
	//  146  310:new             #196 <Class Bundle>
	//  147  313:dup             
	//  148  314:invokespecial   #197 <Method void Bundle()>
	//  149  317:putfield        #199 <Field Bundle mExtras>
		if(bundle != null)
	//* 150  320:aload           21
	//* 151  322:ifnull          334
			mExtras.putAll(bundle);
	//  152  325:aload_0         
	//  153  326:getfield        #199 <Field Bundle mExtras>
	//  154  329:aload           21
	//  155  331:invokevirtual   #203 <Method void Bundle.putAll(Bundle)>
		for(context = ((Context) (arraylist.iterator())); ((Iterator) (context)).hasNext(); b.addPerson(((String) (notification))))
	//* 156  334:aload           20
	//* 157  336:invokevirtual   #209 <Method Iterator ArrayList.iterator()>
	//* 158  339:astore_1        
	//* 159  340:aload_1         
	//* 160  341:invokeinterface #215 <Method boolean Iterator.hasNext()>
	//* 161  346:ifeq            371
			notification = ((Notification) ((String)((Iterator) (context)).next()));
	//  162  349:aload_1         
	//  163  350:invokeinterface #219 <Method Object Iterator.next()>
	//  164  355:checkcast       #221 <Class String>
	//  165  358:astore_2        

	//  166  359:aload_0         
	//  167  360:getfield        #194 <Field android.app.Notification$Builder b>
	//  168  363:aload_2         
	//  169  364:invokevirtual   #224 <Method android.app.Notification$Builder android.app.Notification$Builder.addPerson(String)>
	//  170  367:pop             
	//* 171  368:goto            340
		mContentView = remoteviews1;
	//  172  371:aload_0         
	//  173  372:aload           28
	//  174  374:putfield        #226 <Field RemoteViews mContentView>
		mBigContentView = remoteviews2;
	//  175  377:aload_0         
	//  176  378:aload           29
	//  177  380:putfield        #228 <Field RemoteViews mBigContentView>
		mHeadsUpContentView = remoteviews3;
	//  178  383:aload_0         
	//  179  384:aload           30
	//  180  386:putfield        #230 <Field RemoteViews mHeadsUpContentView>
		mGroupAlertBehavior = k1;
	//  181  389:aload_0         
	//  182  390:iload           31
	//  183  392:putfield        #232 <Field int mGroupAlertBehavior>
	//  184  395:return          
	}
}
