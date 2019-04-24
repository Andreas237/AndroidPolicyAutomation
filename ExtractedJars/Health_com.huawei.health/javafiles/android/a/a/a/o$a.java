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
import java.util.List;
import o.c;

// Referenced classes of package android.a.a.a:
//			c, o, n

public static class o$a
	implements c, android.a.a.a.c
{

	public android.app.fication.Builder a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field android.app.Notification$Builder a>
	//    2    4:areturn         
	}

	public void a(i$a i$a)
	{
		c.add(((Object) (n.a(a, i$a))));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field List c>
	//    2    4:aload_0         
	//    3    5:getfield        #171 <Field android.app.Notification$Builder a>
	//    4    8:aload_1         
	//    5    9:invokestatic    #230 <Method Bundle n.a(android.app.Notification$Builder, i$a)>
	//    6   12:invokeinterface #236 <Method boolean List.add(Object)>
	//    7   17:pop             
	//    8   18:return          
	}

	public Notification b()
	{
		android.util.SparseArray sparsearray = n.a(c);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field List c>
	//    2    4:invokestatic    #240 <Method android.util.SparseArray n.a(List)>
	//    3    7:astore_1        
		if(sparsearray != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          22
			b.putSparseParcelableArray("android.support.actionExtras", sparsearray);
	//    6   12:aload_0         
	//    7   13:getfield        #176 <Field Bundle b>
	//    8   16:ldc1            #242 <String "android.support.actionExtras">
	//    9   18:aload_1         
	//   10   19:invokevirtual   #246 <Method void Bundle.putSparseParcelableArray(String, android.util.SparseArray)>
		a.setExtras(b);
	//   11   22:aload_0         
	//   12   23:getfield        #171 <Field android.app.Notification$Builder a>
	//   13   26:aload_0         
	//   14   27:getfield        #176 <Field Bundle b>
	//   15   30:invokevirtual   #250 <Method android.app.Notification$Builder android.app.Notification$Builder.setExtras(Bundle)>
	//   16   33:pop             
		return a.build();
	//   17   34:aload_0         
	//   18   35:getfield        #171 <Field android.app.Notification$Builder a>
	//   19   38:invokevirtual   #253 <Method Notification android.app.Notification$Builder.build()>
	//   20   41:areturn         
	}

	private android.app.fication.Builder a;
	private Bundle b;
	private List c;

	public o$a(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
			PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
			boolean flag2, int l, CharSequence charsequence3, boolean flag3, ArrayList arraylist, Bundle bundle, String s, 
			boolean flag4, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		c = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #24  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void ArrayList()>
	//    6   12:putfield        #27  <Field List c>
		context = ((Context) ((new android.app.fication.Builder(context)).setWhen(notification.when).setShowWhen(flag1).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS)));
	//    7   15:new             #29  <Class android.app.Notification$Builder>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokespecial   #32  <Method void android.app.Notification$Builder(Context)>
	//   11   23:aload_2         
	//   12   24:getfield        #38  <Field long Notification.when>
	//   13   27:invokevirtual   #42  <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
	//   14   30:iload           14
	//   15   32:invokevirtual   #46  <Method android.app.Notification$Builder android.app.Notification$Builder.setShowWhen(boolean)>
	//   16   35:aload_2         
	//   17   36:getfield        #50  <Field int Notification.icon>
	//   18   39:aload_2         
	//   19   40:getfield        #53  <Field int Notification.iconLevel>
	//   20   43:invokevirtual   #57  <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int, int)>
	//   21   46:aload_2         
	//   22   47:getfield        #61  <Field RemoteViews Notification.contentView>
	//   23   50:invokevirtual   #65  <Method android.app.Notification$Builder android.app.Notification$Builder.setContent(RemoteViews)>
	//   24   53:aload_2         
	//   25   54:getfield        #69  <Field CharSequence Notification.tickerText>
	//   26   57:aload           6
	//   27   59:invokevirtual   #73  <Method android.app.Notification$Builder android.app.Notification$Builder.setTicker(CharSequence, RemoteViews)>
	//   28   62:aload_2         
	//   29   63:getfield        #77  <Field android.net.Uri Notification.sound>
	//   30   66:aload_2         
	//   31   67:getfield        #80  <Field int Notification.audioStreamType>
	//   32   70:invokevirtual   #84  <Method android.app.Notification$Builder android.app.Notification$Builder.setSound(android.net.Uri, int)>
	//   33   73:aload_2         
	//   34   74:getfield        #88  <Field long[] Notification.vibrate>
	//   35   77:invokevirtual   #92  <Method android.app.Notification$Builder android.app.Notification$Builder.setVibrate(long[])>
	//   36   80:aload_2         
	//   37   81:getfield        #95  <Field int Notification.ledARGB>
	//   38   84:aload_2         
	//   39   85:getfield        #98  <Field int Notification.ledOnMS>
	//   40   88:aload_2         
	//   41   89:getfield        #101 <Field int Notification.ledOffMS>
	//   42   92:invokevirtual   #105 <Method android.app.Notification$Builder android.app.Notification$Builder.setLights(int, int, int)>
	//   43   95:astore_1        
		if((notification.flags & 2) != 0)
	//*  44   96:aload_2         
	//*  45   97:getfield        #108 <Field int Notification.flags>
	//*  46  100:iconst_2        
	//*  47  101:iand            
	//*  48  102:ifeq            111
			flag1 = true;
	//   49  105:iconst_1        
	//   50  106:istore          14
		else
	//*  51  108:goto            114
			flag1 = false;
	//   52  111:iconst_0        
	//   53  112:istore          14
		context = ((Context) (((android.app.fication.Builder) (context)).setOngoing(flag1)));
	//   54  114:aload_1         
	//   55  115:iload           14
	//   56  117:invokevirtual   #111 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
	//   57  120:astore_1        
		if((notification.flags & 8) != 0)
	//*  58  121:aload_2         
	//*  59  122:getfield        #108 <Field int Notification.flags>
	//*  60  125:bipush          8
	//*  61  127:iand            
	//*  62  128:ifeq            137
			flag1 = true;
	//   63  131:iconst_1        
	//   64  132:istore          14
		else
	//*  65  134:goto            140
			flag1 = false;
	//   66  137:iconst_0        
	//   67  138:istore          14
		context = ((Context) (((android.app.fication.Builder) (context)).setOnlyAlertOnce(flag1)));
	//   68  140:aload_1         
	//   69  141:iload           14
	//   70  143:invokevirtual   #114 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
	//   71  146:astore_1        
		if((notification.flags & 0x10) != 0)
	//*  72  147:aload_2         
	//*  73  148:getfield        #108 <Field int Notification.flags>
	//*  74  151:bipush          16
	//*  75  153:iand            
	//*  76  154:ifeq            163
			flag1 = true;
	//   77  157:iconst_1        
	//   78  158:istore          14
		else
	//*  79  160:goto            166
			flag1 = false;
	//   80  163:iconst_0        
	//   81  164:istore          14
		context = ((Context) (((android.app.fication.Builder) (context)).setAutoCancel(flag1).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setSubText(charsequence3).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent)));
	//   82  166:aload_1         
	//   83  167:iload           14
	//   84  169:invokevirtual   #117 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
	//   85  172:aload_2         
	//   86  173:getfield        #120 <Field int Notification.defaults>
	//   87  176:invokevirtual   #124 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
	//   88  179:aload_3         
	//   89  180:invokevirtual   #128 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//   90  183:aload           4
	//   91  185:invokevirtual   #131 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//   92  188:aload           17
	//   93  190:invokevirtual   #134 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
	//   94  193:aload           5
	//   95  195:invokevirtual   #137 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
	//   96  198:aload           8
	//   97  200:invokevirtual   #141 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
	//   98  203:aload_2         
	//   99  204:getfield        #145 <Field PendingIntent Notification.deleteIntent>
	//  100  207:invokevirtual   #148 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
	//  101  210:astore_1        
		if((notification.flags & 0x80) != 0)
	//* 102  211:aload_2         
	//* 103  212:getfield        #108 <Field int Notification.flags>
	//* 104  215:sipush          128
	//* 105  218:iand            
	//* 106  219:ifeq            228
			flag1 = true;
	//  107  222:iconst_1        
	//  108  223:istore          14
		else
	//* 109  225:goto            231
			flag1 = false;
	//  110  228:iconst_0        
	//  111  229:istore          14
		a = ((android.app.fication.Builder) (context)).setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag2).setPriority(l).setProgress(j, k, flag);
	//  112  231:aload_0         
	//  113  232:aload_1         
	//  114  233:aload           9
	//  115  235:iload           14
	//  116  237:invokevirtual   #152 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
	//  117  240:aload           10
	//  118  242:invokevirtual   #156 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
	//  119  245:iload           7
	//  120  247:invokevirtual   #159 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
	//  121  250:iload           15
	//  122  252:invokevirtual   #162 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
	//  123  255:iload           16
	//  124  257:invokevirtual   #165 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
	//  125  260:iload           11
	//  126  262:iload           12
	//  127  264:iload           13
	//  128  266:invokevirtual   #169 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
	//  129  269:putfield        #171 <Field android.app.Notification$Builder a>
		b = new Bundle();
	//  130  272:aload_0         
	//  131  273:new             #173 <Class Bundle>
	//  132  276:dup             
	//  133  277:invokespecial   #174 <Method void Bundle()>
	//  134  280:putfield        #176 <Field Bundle b>
		if(bundle != null)
	//* 135  283:aload           20
	//* 136  285:ifnull          297
			b.putAll(bundle);
	//  137  288:aload_0         
	//  138  289:getfield        #176 <Field Bundle b>
	//  139  292:aload           20
	//  140  294:invokevirtual   #180 <Method void Bundle.putAll(Bundle)>
		if(arraylist != null && !arraylist.isEmpty())
	//* 141  297:aload           19
	//* 142  299:ifnull          335
	//* 143  302:aload           19
	//* 144  304:invokevirtual   #184 <Method boolean ArrayList.isEmpty()>
	//* 145  307:ifne            335
			b.putStringArray("android.people", (String[])arraylist.toArray(((Object []) (new String[arraylist.size()]))));
	//  146  310:aload_0         
	//  147  311:getfield        #176 <Field Bundle b>
	//  148  314:ldc1            #186 <String "android.people">
	//  149  316:aload           19
	//  150  318:aload           19
	//  151  320:invokevirtual   #190 <Method int ArrayList.size()>
	//  152  323:anewarray       String[]
	//  153  326:invokevirtual   #196 <Method Object[] ArrayList.toArray(Object[])>
	//  154  329:checkcast       #198 <Class String[]>
	//  155  332:invokevirtual   #202 <Method void Bundle.putStringArray(String, String[])>
		if(flag3)
	//* 156  335:iload           18
	//* 157  337:ifeq            350
			b.putBoolean("android.support.localOnly", true);
	//  158  340:aload_0         
	//  159  341:getfield        #176 <Field Bundle b>
	//  160  344:ldc1            #204 <String "android.support.localOnly">
	//  161  346:iconst_1        
	//  162  347:invokevirtual   #208 <Method void Bundle.putBoolean(String, boolean)>
		if(s != null)
	//* 163  350:aload           21
	//* 164  352:ifnull          394
		{
			b.putString("android.support.groupKey", s);
	//  165  355:aload_0         
	//  166  356:getfield        #176 <Field Bundle b>
	//  167  359:ldc1            #210 <String "android.support.groupKey">
	//  168  361:aload           21
	//  169  363:invokevirtual   #214 <Method void Bundle.putString(String, String)>
			if(flag4)
	//* 170  366:iload           22
	//* 171  368:ifeq            384
				b.putBoolean("android.support.isGroupSummary", true);
	//  172  371:aload_0         
	//  173  372:getfield        #176 <Field Bundle b>
	//  174  375:ldc1            #216 <String "android.support.isGroupSummary">
	//  175  377:iconst_1        
	//  176  378:invokevirtual   #208 <Method void Bundle.putBoolean(String, boolean)>
			else
	//* 177  381:goto            394
				b.putBoolean("android.support.useSideChannel", true);
	//  178  384:aload_0         
	//  179  385:getfield        #176 <Field Bundle b>
	//  180  388:ldc1            #218 <String "android.support.useSideChannel">
	//  181  390:iconst_1        
	//  182  391:invokevirtual   #208 <Method void Bundle.putBoolean(String, boolean)>
		}
		if(s1 != null)
	//* 183  394:aload           23
	//* 184  396:ifnull          410
			b.putString("android.support.sortKey", s1);
	//  185  399:aload_0         
	//  186  400:getfield        #176 <Field Bundle b>
	//  187  403:ldc1            #220 <String "android.support.sortKey">
	//  188  405:aload           23
	//  189  407:invokevirtual   #214 <Method void Bundle.putString(String, String)>
	//  190  410:return          
	}
}
