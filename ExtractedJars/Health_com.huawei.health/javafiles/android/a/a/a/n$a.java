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
import java.util.*;
import o.c;

// Referenced classes of package android.a.a.a:
//			c, n

public static class n$a
	implements c, android.a.a.a.c
{

	public android.app.fication.Builder a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field android.app.Notification$Builder a>
	//    2    4:areturn         
	}

	public void a(i$a i$a)
	{
		c.add(((Object) (n.a(a, i$a))));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field List c>
	//    2    4:aload_0         
	//    3    5:getfield        #168 <Field android.app.Notification$Builder a>
	//    4    8:aload_1         
	//    5    9:invokestatic    #201 <Method Bundle n.a(android.app.Notification$Builder, i$a)>
	//    6   12:invokeinterface #207 <Method boolean List.add(Object)>
	//    7   17:pop             
	//    8   18:return          
	}

	public Notification b()
	{
		Notification notification = a.build();
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field android.app.Notification$Builder a>
	//    2    4:invokevirtual   #211 <Method Notification android.app.Notification$Builder.build()>
	//    3    7:astore_1        
		Object obj = ((Object) (n.a(notification)));
	//    4    8:aload_1         
	//    5    9:invokestatic    #214 <Method Bundle n.a(Notification)>
	//    6   12:astore_2        
		Bundle bundle = new Bundle(b);
	//    7   13:new             #170 <Class Bundle>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #173 <Field Bundle b>
	//   11   21:invokespecial   #216 <Method void Bundle(Bundle)>
	//   12   24:astore_3        
		Iterator iterator = b.keySet().iterator();
	//   13   25:aload_0         
	//   14   26:getfield        #173 <Field Bundle b>
	//   15   29:invokevirtual   #220 <Method Set Bundle.keySet()>
	//   16   32:invokeinterface #226 <Method Iterator Set.iterator()>
	//   17   37:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   18   39:aload           4
	//   19   41:invokeinterface #232 <Method boolean Iterator.hasNext()>
	//   20   46:ifeq            79
			String s = (String)iterator.next();
	//   21   49:aload           4
	//   22   51:invokeinterface #236 <Method Object Iterator.next()>
	//   23   56:checkcast       #238 <Class String>
	//   24   59:astore          5
			if(((Bundle) (obj)).containsKey(s))
	//*  25   61:aload_2         
	//*  26   62:aload           5
	//*  27   64:invokevirtual   #242 <Method boolean Bundle.containsKey(String)>
	//*  28   67:ifeq            76
				bundle.remove(s);
	//   29   70:aload_3         
	//   30   71:aload           5
	//   31   73:invokevirtual   #246 <Method void Bundle.remove(String)>
		} while(true);
	//   32   76:goto            39
		((Bundle) (obj)).putAll(bundle);
	//   33   79:aload_2         
	//   34   80:aload_3         
	//   35   81:invokevirtual   #177 <Method void Bundle.putAll(Bundle)>
		obj = ((Object) (n.a(c)));
	//   36   84:aload_0         
	//   37   85:getfield        #27  <Field List c>
	//   38   88:invokestatic    #249 <Method android.util.SparseArray n.a(List)>
	//   39   91:astore_2        
		if(obj != null)
	//*  40   92:aload_2         
	//*  41   93:ifnull          106
			n.a(notification).putSparseParcelableArray("android.support.actionExtras", ((android.util.SparseArray) (obj)));
	//   42   96:aload_1         
	//   43   97:invokestatic    #214 <Method Bundle n.a(Notification)>
	//   44  100:ldc1            #251 <String "android.support.actionExtras">
	//   45  102:aload_2         
	//   46  103:invokevirtual   #255 <Method void Bundle.putSparseParcelableArray(String, android.util.SparseArray)>
		return notification;
	//   47  106:aload_1         
	//   48  107:areturn         
	}

	private android.app.fication.Builder a;
	private final Bundle b = new Bundle();
	private List c;

	public n$a(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
			PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
			int l, CharSequence charsequence3, boolean flag2, Bundle bundle, String s, boolean flag3, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		c = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #24  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void ArrayList()>
	//    6   12:putfield        #27  <Field List c>
		context = ((Context) ((new android.app.fication.Builder(context)).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS)));
	//    7   15:new             #29  <Class android.app.Notification$Builder>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokespecial   #32  <Method void android.app.Notification$Builder(Context)>
	//   11   23:aload_2         
	//   12   24:getfield        #38  <Field long Notification.when>
	//   13   27:invokevirtual   #42  <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
	//   14   30:aload_2         
	//   15   31:getfield        #46  <Field int Notification.icon>
	//   16   34:aload_2         
	//   17   35:getfield        #49  <Field int Notification.iconLevel>
	//   18   38:invokevirtual   #53  <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int, int)>
	//   19   41:aload_2         
	//   20   42:getfield        #57  <Field RemoteViews Notification.contentView>
	//   21   45:invokevirtual   #61  <Method android.app.Notification$Builder android.app.Notification$Builder.setContent(RemoteViews)>
	//   22   48:aload_2         
	//   23   49:getfield        #65  <Field CharSequence Notification.tickerText>
	//   24   52:aload           6
	//   25   54:invokevirtual   #69  <Method android.app.Notification$Builder android.app.Notification$Builder.setTicker(CharSequence, RemoteViews)>
	//   26   57:aload_2         
	//   27   58:getfield        #73  <Field android.net.Uri Notification.sound>
	//   28   61:aload_2         
	//   29   62:getfield        #76  <Field int Notification.audioStreamType>
	//   30   65:invokevirtual   #80  <Method android.app.Notification$Builder android.app.Notification$Builder.setSound(android.net.Uri, int)>
	//   31   68:aload_2         
	//   32   69:getfield        #84  <Field long[] Notification.vibrate>
	//   33   72:invokevirtual   #88  <Method android.app.Notification$Builder android.app.Notification$Builder.setVibrate(long[])>
	//   34   75:aload_2         
	//   35   76:getfield        #91  <Field int Notification.ledARGB>
	//   36   79:aload_2         
	//   37   80:getfield        #94  <Field int Notification.ledOnMS>
	//   38   83:aload_2         
	//   39   84:getfield        #97  <Field int Notification.ledOffMS>
	//   40   87:invokevirtual   #101 <Method android.app.Notification$Builder android.app.Notification$Builder.setLights(int, int, int)>
	//   41   90:astore_1        
		boolean flag4;
		if((notification.flags & 2) != 0)
	//*  42   91:aload_2         
	//*  43   92:getfield        #104 <Field int Notification.flags>
	//*  44   95:iconst_2        
	//*  45   96:iand            
	//*  46   97:ifeq            106
			flag4 = true;
	//   47  100:iconst_1        
	//   48  101:istore          22
		else
	//*  49  103:goto            109
			flag4 = false;
	//   50  106:iconst_0        
	//   51  107:istore          22
		context = ((Context) (((android.app.fication.Builder) (context)).setOngoing(flag4)));
	//   52  109:aload_1         
	//   53  110:iload           22
	//   54  112:invokevirtual   #108 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
	//   55  115:astore_1        
		if((notification.flags & 8) != 0)
	//*  56  116:aload_2         
	//*  57  117:getfield        #104 <Field int Notification.flags>
	//*  58  120:bipush          8
	//*  59  122:iand            
	//*  60  123:ifeq            132
			flag4 = true;
	//   61  126:iconst_1        
	//   62  127:istore          22
		else
	//*  63  129:goto            135
			flag4 = false;
	//   64  132:iconst_0        
	//   65  133:istore          22
		context = ((Context) (((android.app.fication.Builder) (context)).setOnlyAlertOnce(flag4)));
	//   66  135:aload_1         
	//   67  136:iload           22
	//   68  138:invokevirtual   #111 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
	//   69  141:astore_1        
		if((notification.flags & 0x10) != 0)
	//*  70  142:aload_2         
	//*  71  143:getfield        #104 <Field int Notification.flags>
	//*  72  146:bipush          16
	//*  73  148:iand            
	//*  74  149:ifeq            158
			flag4 = true;
	//   75  152:iconst_1        
	//   76  153:istore          22
		else
	//*  77  155:goto            161
			flag4 = false;
	//   78  158:iconst_0        
	//   79  159:istore          22
		context = ((Context) (((android.app.fication.Builder) (context)).setAutoCancel(flag4).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setSubText(charsequence3).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent)));
	//   80  161:aload_1         
	//   81  162:iload           22
	//   82  164:invokevirtual   #114 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
	//   83  167:aload_2         
	//   84  168:getfield        #117 <Field int Notification.defaults>
	//   85  171:invokevirtual   #121 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
	//   86  174:aload_3         
	//   87  175:invokevirtual   #125 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//   88  178:aload           4
	//   89  180:invokevirtual   #128 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//   90  183:aload           16
	//   91  185:invokevirtual   #131 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
	//   92  188:aload           5
	//   93  190:invokevirtual   #134 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
	//   94  193:aload           8
	//   95  195:invokevirtual   #138 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
	//   96  198:aload_2         
	//   97  199:getfield        #142 <Field PendingIntent Notification.deleteIntent>
	//   98  202:invokevirtual   #145 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
	//   99  205:astore_1        
		if((notification.flags & 0x80) != 0)
	//* 100  206:aload_2         
	//* 101  207:getfield        #104 <Field int Notification.flags>
	//* 102  210:sipush          128
	//* 103  213:iand            
	//* 104  214:ifeq            223
			flag4 = true;
	//  105  217:iconst_1        
	//  106  218:istore          22
		else
	//* 107  220:goto            226
			flag4 = false;
	//  108  223:iconst_0        
	//  109  224:istore          22
		a = ((android.app.fication.Builder) (context)).setFullScreenIntent(pendingintent1, flag4).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag1).setPriority(l).setProgress(j, k, flag);
	//  110  226:aload_0         
	//  111  227:aload_1         
	//  112  228:aload           9
	//  113  230:iload           22
	//  114  232:invokevirtual   #149 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
	//  115  235:aload           10
	//  116  237:invokevirtual   #153 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
	//  117  240:iload           7
	//  118  242:invokevirtual   #156 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
	//  119  245:iload           14
	//  120  247:invokevirtual   #159 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
	//  121  250:iload           15
	//  122  252:invokevirtual   #162 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
	//  123  255:iload           11
	//  124  257:iload           12
	//  125  259:iload           13
	//  126  261:invokevirtual   #166 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
	//  127  264:putfield        #168 <Field android.app.Notification$Builder a>
	//  128  267:aload_0         
	//  129  268:new             #170 <Class Bundle>
	//  130  271:dup             
	//  131  272:invokespecial   #171 <Method void Bundle()>
	//  132  275:putfield        #173 <Field Bundle b>
		if(bundle != null)
	//* 133  278:aload           18
	//* 134  280:ifnull          292
			b.putAll(bundle);
	//  135  283:aload_0         
	//  136  284:getfield        #173 <Field Bundle b>
	//  137  287:aload           18
	//  138  289:invokevirtual   #177 <Method void Bundle.putAll(Bundle)>
		if(flag2)
	//* 139  292:iload           17
	//* 140  294:ifeq            307
			b.putBoolean("android.support.localOnly", true);
	//  141  297:aload_0         
	//  142  298:getfield        #173 <Field Bundle b>
	//  143  301:ldc1            #179 <String "android.support.localOnly">
	//  144  303:iconst_1        
	//  145  304:invokevirtual   #183 <Method void Bundle.putBoolean(String, boolean)>
		if(s != null)
	//* 146  307:aload           19
	//* 147  309:ifnull          351
		{
			b.putString("android.support.groupKey", s);
	//  148  312:aload_0         
	//  149  313:getfield        #173 <Field Bundle b>
	//  150  316:ldc1            #185 <String "android.support.groupKey">
	//  151  318:aload           19
	//  152  320:invokevirtual   #189 <Method void Bundle.putString(String, String)>
			if(flag3)
	//* 153  323:iload           20
	//* 154  325:ifeq            341
				b.putBoolean("android.support.isGroupSummary", true);
	//  155  328:aload_0         
	//  156  329:getfield        #173 <Field Bundle b>
	//  157  332:ldc1            #191 <String "android.support.isGroupSummary">
	//  158  334:iconst_1        
	//  159  335:invokevirtual   #183 <Method void Bundle.putBoolean(String, boolean)>
			else
	//* 160  338:goto            351
				b.putBoolean("android.support.useSideChannel", true);
	//  161  341:aload_0         
	//  162  342:getfield        #173 <Field Bundle b>
	//  163  345:ldc1            #193 <String "android.support.useSideChannel">
	//  164  347:iconst_1        
	//  165  348:invokevirtual   #183 <Method void Bundle.putBoolean(String, boolean)>
		}
		if(s1 != null)
	//* 166  351:aload           21
	//* 167  353:ifnull          367
			b.putString("android.support.sortKey", s1);
	//  168  356:aload_0         
	//  169  357:getfield        #173 <Field Bundle b>
	//  170  360:ldc1            #195 <String "android.support.sortKey">
	//  171  362:aload           21
	//  172  364:invokevirtual   #189 <Method void Bundle.putString(String, String)>
	//  173  367:return          
	}
}
