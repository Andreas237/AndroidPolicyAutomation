// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.a.a.a;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import o.c;

// Referenced classes of package android.a.a.a:
//			c, g

public static class g$a
	implements c, android.a.a.a.c
{

	public android.app.fication.Builder a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field android.app.Notification$Builder a>
	//    2    4:areturn         
	}

	public void a(i$a i$a)
	{
		g.b(a, i$a);
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field android.app.Notification$Builder a>
	//    2    4:aload_1         
	//    3    5:invokestatic    #217 <Method void g.b(android.app.Notification$Builder, i$a)>
	//    4    8:return          
	}

	public Notification b()
	{
		a.setExtras(b);
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field android.app.Notification$Builder a>
	//    2    4:aload_0         
	//    3    5:getfield        #181 <Field Bundle b>
	//    4    8:invokevirtual   #222 <Method android.app.Notification$Builder android.app.Notification$Builder.setExtras(Bundle)>
	//    5   11:pop             
		return a.build();
	//    6   12:aload_0         
	//    7   13:getfield        #176 <Field android.app.Notification$Builder a>
	//    8   16:invokevirtual   #225 <Method Notification android.app.Notification$Builder.build()>
	//    9   19:areturn         
	}

	private android.app.fication.Builder a;
	private Bundle b;

	public g$a(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
			PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
			boolean flag2, int l, CharSequence charsequence3, boolean flag3, ArrayList arraylist, Bundle bundle, String s, 
			boolean flag4, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		context = ((Context) ((new android.app.fication.Builder(context)).setWhen(notification.when).setShowWhen(flag1).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS)));
	//    2    4:new             #21  <Class android.app.Notification$Builder>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #24  <Method void android.app.Notification$Builder(Context)>
	//    6   12:aload_2         
	//    7   13:getfield        #30  <Field long Notification.when>
	//    8   16:invokevirtual   #34  <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
	//    9   19:iload           14
	//   10   21:invokevirtual   #38  <Method android.app.Notification$Builder android.app.Notification$Builder.setShowWhen(boolean)>
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
	//*  43   91:ifeq            100
			flag1 = true;
	//   44   94:iconst_1        
	//   45   95:istore          14
		else
	//*  46   97:goto            103
			flag1 = false;
	//   47  100:iconst_0        
	//   48  101:istore          14
		context = ((Context) (((android.app.fication.Builder) (context)).setOngoing(flag1)));
	//   49  103:aload_1         
	//   50  104:iload           14
	//   51  106:invokevirtual   #103 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
	//   52  109:astore_1        
		if((notification.flags & 8) != 0)
	//*  53  110:aload_2         
	//*  54  111:getfield        #100 <Field int Notification.flags>
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
		context = ((Context) (((android.app.fication.Builder) (context)).setOnlyAlertOnce(flag1)));
	//   63  129:aload_1         
	//   64  130:iload           14
	//   65  132:invokevirtual   #106 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
	//   66  135:astore_1        
		if((notification.flags & 0x10) != 0)
	//*  67  136:aload_2         
	//*  68  137:getfield        #100 <Field int Notification.flags>
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
		context = ((Context) (((android.app.fication.Builder) (context)).setAutoCancel(flag1).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setSubText(charsequence3).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent)));
	//   77  155:aload_1         
	//   78  156:iload           14
	//   79  158:invokevirtual   #109 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
	//   80  161:aload_2         
	//   81  162:getfield        #112 <Field int Notification.defaults>
	//   82  165:invokevirtual   #116 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
	//   83  168:aload_3         
	//   84  169:invokevirtual   #120 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//   85  172:aload           4
	//   86  174:invokevirtual   #123 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//   87  177:aload           17
	//   88  179:invokevirtual   #126 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
	//   89  182:aload           5
	//   90  184:invokevirtual   #129 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
	//   91  187:aload           8
	//   92  189:invokevirtual   #133 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
	//   93  192:aload_2         
	//   94  193:getfield        #137 <Field PendingIntent Notification.deleteIntent>
	//   95  196:invokevirtual   #140 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
	//   96  199:astore_1        
		if((notification.flags & 0x80) != 0)
	//*  97  200:aload_2         
	//*  98  201:getfield        #100 <Field int Notification.flags>
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
		a = ((android.app.fication.Builder) (context)).setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag2).setPriority(l).setProgress(j, k, flag).setLocalOnly(flag3).setGroup(s).setGroupSummary(flag4).setSortKey(s1);
	//  107  220:aload_0         
	//  108  221:aload_1         
	//  109  222:aload           9
	//  110  224:iload           14
	//  111  226:invokevirtual   #144 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
	//  112  229:aload           10
	//  113  231:invokevirtual   #148 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
	//  114  234:iload           7
	//  115  236:invokevirtual   #151 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
	//  116  239:iload           15
	//  117  241:invokevirtual   #154 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
	//  118  244:iload           16
	//  119  246:invokevirtual   #157 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
	//  120  249:iload           11
	//  121  251:iload           12
	//  122  253:iload           13
	//  123  255:invokevirtual   #161 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
	//  124  258:iload           18
	//  125  260:invokevirtual   #164 <Method android.app.Notification$Builder android.app.Notification$Builder.setLocalOnly(boolean)>
	//  126  263:aload           21
	//  127  265:invokevirtual   #168 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroup(String)>
	//  128  268:iload           22
	//  129  270:invokevirtual   #171 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroupSummary(boolean)>
	//  130  273:aload           23
	//  131  275:invokevirtual   #174 <Method android.app.Notification$Builder android.app.Notification$Builder.setSortKey(String)>
	//  132  278:putfield        #176 <Field android.app.Notification$Builder a>
		b = new Bundle();
	//  133  281:aload_0         
	//  134  282:new             #178 <Class Bundle>
	//  135  285:dup             
	//  136  286:invokespecial   #179 <Method void Bundle()>
	//  137  289:putfield        #181 <Field Bundle b>
		if(bundle != null)
	//* 138  292:aload           20
	//* 139  294:ifnull          306
			b.putAll(bundle);
	//  140  297:aload_0         
	//  141  298:getfield        #181 <Field Bundle b>
	//  142  301:aload           20
	//  143  303:invokevirtual   #185 <Method void Bundle.putAll(Bundle)>
		if(arraylist != null && !arraylist.isEmpty())
	//* 144  306:aload           19
	//* 145  308:ifnull          344
	//* 146  311:aload           19
	//* 147  313:invokevirtual   #191 <Method boolean ArrayList.isEmpty()>
	//* 148  316:ifne            344
			b.putStringArray("android.people", (String[])arraylist.toArray(((Object []) (new String[arraylist.size()]))));
	//  149  319:aload_0         
	//  150  320:getfield        #181 <Field Bundle b>
	//  151  323:ldc1            #193 <String "android.people">
	//  152  325:aload           19
	//  153  327:aload           19
	//  154  329:invokevirtual   #197 <Method int ArrayList.size()>
	//  155  332:anewarray       String[]
	//  156  335:invokevirtual   #203 <Method Object[] ArrayList.toArray(Object[])>
	//  157  338:checkcast       #205 <Class String[]>
	//  158  341:invokevirtual   #209 <Method void Bundle.putStringArray(String, String[])>
	//  159  344:return          
	}
}
