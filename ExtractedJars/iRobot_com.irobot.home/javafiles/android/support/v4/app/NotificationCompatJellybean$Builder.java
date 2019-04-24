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
import java.util.*;

// Referenced classes of package android.support.v4.app:
//			NotificationBuilderWithActions, NotificationBuilderWithBuilderAccessor, NotificationCompatJellybean

public static class NotificationCompatJellybean$Builder
	implements NotificationBuilderWithActions, NotificationBuilderWithBuilderAccessor
{

	public void addAction(NotificationCompatBase.Action action)
	{
		mActionExtrasList.add(((Object) (NotificationCompatJellybean.writeActionAndGetExtras(b, action))));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field List mActionExtrasList>
	//    2    4:aload_0         
	//    3    5:getfield        #171 <Field android.app.Notification$Builder b>
	//    4    8:aload_1         
	//    5    9:invokestatic    #209 <Method Bundle NotificationCompatJellybean.writeActionAndGetExtras(android.app.Notification$Builder, NotificationCompatBase$Action)>
	//    6   12:invokeinterface #215 <Method boolean List.add(Object)>
	//    7   17:pop             
	//    8   18:return          
	}

	public Notification build()
	{
		Notification notification = b.build();
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field android.app.Notification$Builder b>
	//    2    4:invokevirtual   #219 <Method Notification android.app.Notification$Builder.build()>
	//    3    7:astore_1        
		Object obj = ((Object) (NotificationCompatJellybean.getExtras(notification)));
	//    4    8:aload_1         
	//    5    9:invokestatic    #223 <Method Bundle NotificationCompatJellybean.getExtras(Notification)>
	//    6   12:astore_2        
		Bundle bundle = new Bundle(mExtras);
	//    7   13:new             #173 <Class Bundle>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #176 <Field Bundle mExtras>
	//   11   21:invokespecial   #225 <Method void Bundle(Bundle)>
	//   12   24:astore_3        
		Iterator iterator = mExtras.keySet().iterator();
	//   13   25:aload_0         
	//   14   26:getfield        #176 <Field Bundle mExtras>
	//   15   29:invokevirtual   #229 <Method Set Bundle.keySet()>
	//   16   32:invokeinterface #235 <Method Iterator Set.iterator()>
	//   17   37:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   18   39:aload           4
	//   19   41:invokeinterface #241 <Method boolean Iterator.hasNext()>
	//   20   46:ifeq            79
			String s = (String)iterator.next();
	//   21   49:aload           4
	//   22   51:invokeinterface #245 <Method Object Iterator.next()>
	//   23   56:checkcast       #247 <Class String>
	//   24   59:astore          5
			if(((Bundle) (obj)).containsKey(s))
	//*  25   61:aload_2         
	//*  26   62:aload           5
	//*  27   64:invokevirtual   #251 <Method boolean Bundle.containsKey(String)>
	//*  28   67:ifeq            39
				bundle.remove(s);
	//   29   70:aload_3         
	//   30   71:aload           5
	//   31   73:invokevirtual   #255 <Method void Bundle.remove(String)>
		} while(true);
	//   32   76:goto            39
		((Bundle) (obj)).putAll(bundle);
	//   33   79:aload_2         
	//   34   80:aload_3         
	//   35   81:invokevirtual   #180 <Method void Bundle.putAll(Bundle)>
		obj = ((Object) (NotificationCompatJellybean.buildActionExtrasMap(mActionExtrasList)));
	//   36   84:aload_0         
	//   37   85:getfield        #31  <Field List mActionExtrasList>
	//   38   88:invokestatic    #259 <Method android.util.SparseArray NotificationCompatJellybean.buildActionExtrasMap(List)>
	//   39   91:astore_2        
		if(obj != null)
	//*  40   92:aload_2         
	//*  41   93:ifnull          107
			NotificationCompatJellybean.getExtras(notification).putSparseParcelableArray("android.support.actionExtras", ((android.util.SparseArray) (obj)));
	//   42   96:aload_1         
	//   43   97:invokestatic    #223 <Method Bundle NotificationCompatJellybean.getExtras(Notification)>
	//   44  100:ldc2            #261 <String "android.support.actionExtras">
	//   45  103:aload_2         
	//   46  104:invokevirtual   #265 <Method void Bundle.putSparseParcelableArray(String, android.util.SparseArray)>
		if(mContentView != null)
	//*  47  107:aload_0         
	//*  48  108:getfield        #200 <Field RemoteViews mContentView>
	//*  49  111:ifnull          122
			notification.contentView = mContentView;
	//   50  114:aload_1         
	//   51  115:aload_0         
	//   52  116:getfield        #200 <Field RemoteViews mContentView>
	//   53  119:putfield        #60  <Field RemoteViews Notification.contentView>
		if(mBigContentView != null)
	//*  54  122:aload_0         
	//*  55  123:getfield        #202 <Field RemoteViews mBigContentView>
	//*  56  126:ifnull          137
			notification.bigContentView = mBigContentView;
	//   57  129:aload_1         
	//   58  130:aload_0         
	//   59  131:getfield        #202 <Field RemoteViews mBigContentView>
	//   60  134:putfield        #268 <Field RemoteViews Notification.bigContentView>
		return notification;
	//   61  137:aload_1         
	//   62  138:areturn         
	}

	public android.app.Notification.Builder getBuilder()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field android.app.Notification$Builder b>
	//    2    4:areturn         
	}

	private android.app.Notification.Builder b;
	private List mActionExtrasList;
	private RemoteViews mBigContentView;
	private RemoteViews mContentView;
	private final Bundle mExtras = new Bundle();

	public NotificationCompatJellybean$Builder(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
			PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
			int l, CharSequence charsequence3, boolean flag2, Bundle bundle, String s, boolean flag3, String s1, 
			RemoteViews remoteviews1, RemoteViews remoteviews2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		mActionExtrasList = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #28  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void ArrayList()>
	//    6   12:putfield        #31  <Field List mActionExtrasList>
		context = ((Context) ((new android.app.Notification.Builder(context)).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS)));
	//    7   15:new             #33  <Class android.app.Notification$Builder>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokespecial   #36  <Method void android.app.Notification$Builder(Context)>
	//   11   23:aload_2         
	//   12   24:getfield        #42  <Field long Notification.when>
	//   13   27:invokevirtual   #46  <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
	//   14   30:aload_2         
	//   15   31:getfield        #50  <Field int Notification.icon>
	//   16   34:aload_2         
	//   17   35:getfield        #53  <Field int Notification.iconLevel>
	//   18   38:invokevirtual   #57  <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int, int)>
	//   19   41:aload_2         
	//   20   42:getfield        #60  <Field RemoteViews Notification.contentView>
	//   21   45:invokevirtual   #64  <Method android.app.Notification$Builder android.app.Notification$Builder.setContent(RemoteViews)>
	//   22   48:aload_2         
	//   23   49:getfield        #68  <Field CharSequence Notification.tickerText>
	//   24   52:aload           6
	//   25   54:invokevirtual   #72  <Method android.app.Notification$Builder android.app.Notification$Builder.setTicker(CharSequence, RemoteViews)>
	//   26   57:aload_2         
	//   27   58:getfield        #76  <Field android.net.Uri Notification.sound>
	//   28   61:aload_2         
	//   29   62:getfield        #79  <Field int Notification.audioStreamType>
	//   30   65:invokevirtual   #83  <Method android.app.Notification$Builder android.app.Notification$Builder.setSound(android.net.Uri, int)>
	//   31   68:aload_2         
	//   32   69:getfield        #87  <Field long[] Notification.vibrate>
	//   33   72:invokevirtual   #91  <Method android.app.Notification$Builder android.app.Notification$Builder.setVibrate(long[])>
	//   34   75:aload_2         
	//   35   76:getfield        #94  <Field int Notification.ledARGB>
	//   36   79:aload_2         
	//   37   80:getfield        #97  <Field int Notification.ledOnMS>
	//   38   83:aload_2         
	//   39   84:getfield        #100 <Field int Notification.ledOffMS>
	//   40   87:invokevirtual   #104 <Method android.app.Notification$Builder android.app.Notification$Builder.setLights(int, int, int)>
	//   41   90:astore_1        
		int i1 = notification.flags;
	//   42   91:aload_2         
	//   43   92:getfield        #107 <Field int Notification.flags>
	//   44   95:istore          24
		boolean flag5 = false;
	//   45   97:iconst_0        
	//   46   98:istore          26
		boolean flag4;
		if((i1 & 2) != 0)
	//*  47  100:iload           24
	//*  48  102:iconst_2        
	//*  49  103:iand            
	//*  50  104:ifeq            113
			flag4 = true;
	//   51  107:iconst_1        
	//   52  108:istore          25
		else
	//*  53  110:goto            116
			flag4 = false;
	//   54  113:iconst_0        
	//   55  114:istore          25
		context = ((Context) (((android.app.Notification.Builder) (context)).setOngoing(flag4)));
	//   56  116:aload_1         
	//   57  117:iload           25
	//   58  119:invokevirtual   #111 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
	//   59  122:astore_1        
		if((notification.flags & 8) != 0)
	//*  60  123:aload_2         
	//*  61  124:getfield        #107 <Field int Notification.flags>
	//*  62  127:bipush          8
	//*  63  129:iand            
	//*  64  130:ifeq            139
			flag4 = true;
	//   65  133:iconst_1        
	//   66  134:istore          25
		else
	//*  67  136:goto            142
			flag4 = false;
	//   68  139:iconst_0        
	//   69  140:istore          25
		context = ((Context) (((android.app.Notification.Builder) (context)).setOnlyAlertOnce(flag4)));
	//   70  142:aload_1         
	//   71  143:iload           25
	//   72  145:invokevirtual   #114 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
	//   73  148:astore_1        
		if((notification.flags & 0x10) != 0)
	//*  74  149:aload_2         
	//*  75  150:getfield        #107 <Field int Notification.flags>
	//*  76  153:bipush          16
	//*  77  155:iand            
	//*  78  156:ifeq            165
			flag4 = true;
	//   79  159:iconst_1        
	//   80  160:istore          25
		else
	//*  81  162:goto            168
			flag4 = false;
	//   82  165:iconst_0        
	//   83  166:istore          25
		context = ((Context) (((android.app.Notification.Builder) (context)).setAutoCancel(flag4).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setSubText(charsequence3).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent)));
	//   84  168:aload_1         
	//   85  169:iload           25
	//   86  171:invokevirtual   #117 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
	//   87  174:aload_2         
	//   88  175:getfield        #120 <Field int Notification.defaults>
	//   89  178:invokevirtual   #124 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
	//   90  181:aload_3         
	//   91  182:invokevirtual   #128 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//   92  185:aload           4
	//   93  187:invokevirtual   #131 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//   94  190:aload           16
	//   95  192:invokevirtual   #134 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
	//   96  195:aload           5
	//   97  197:invokevirtual   #137 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
	//   98  200:aload           8
	//   99  202:invokevirtual   #141 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
	//  100  205:aload_2         
	//  101  206:getfield        #145 <Field PendingIntent Notification.deleteIntent>
	//  102  209:invokevirtual   #148 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
	//  103  212:astore_1        
		if((notification.flags & 0x80) != 0)
	//* 104  213:aload_2         
	//* 105  214:getfield        #107 <Field int Notification.flags>
	//* 106  217:sipush          128
	//* 107  220:iand            
	//* 108  221:ifeq            230
			flag4 = true;
	//  109  224:iconst_1        
	//  110  225:istore          25
		else
	//* 111  227:goto            234
			flag4 = flag5;
	//  112  230:iload           26
	//  113  232:istore          25
		b = ((android.app.Notification.Builder) (context)).setFullScreenIntent(pendingintent1, flag4).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag1).setPriority(l).setProgress(j, k, flag);
	//  114  234:aload_0         
	//  115  235:aload_1         
	//  116  236:aload           9
	//  117  238:iload           25
	//  118  240:invokevirtual   #152 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
	//  119  243:aload           10
	//  120  245:invokevirtual   #156 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
	//  121  248:iload           7
	//  122  250:invokevirtual   #159 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
	//  123  253:iload           14
	//  124  255:invokevirtual   #162 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
	//  125  258:iload           15
	//  126  260:invokevirtual   #165 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
	//  127  263:iload           11
	//  128  265:iload           12
	//  129  267:iload           13
	//  130  269:invokevirtual   #169 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
	//  131  272:putfield        #171 <Field android.app.Notification$Builder b>
	//  132  275:aload_0         
	//  133  276:new             #173 <Class Bundle>
	//  134  279:dup             
	//  135  280:invokespecial   #174 <Method void Bundle()>
	//  136  283:putfield        #176 <Field Bundle mExtras>
		if(bundle != null)
	//* 137  286:aload           18
	//* 138  288:ifnull          300
			mExtras.putAll(bundle);
	//  139  291:aload_0         
	//  140  292:getfield        #176 <Field Bundle mExtras>
	//  141  295:aload           18
	//  142  297:invokevirtual   #180 <Method void Bundle.putAll(Bundle)>
		if(flag2)
	//* 143  300:iload           17
	//* 144  302:ifeq            315
			mExtras.putBoolean("android.support.localOnly", true);
	//  145  305:aload_0         
	//  146  306:getfield        #176 <Field Bundle mExtras>
	//  147  309:ldc1            #182 <String "android.support.localOnly">
	//  148  311:iconst_1        
	//  149  312:invokevirtual   #186 <Method void Bundle.putBoolean(String, boolean)>
		if(s != null)
	//* 150  315:aload           19
	//* 151  317:ifnull          364
		{
			mExtras.putString("android.support.groupKey", s);
	//  152  320:aload_0         
	//  153  321:getfield        #176 <Field Bundle mExtras>
	//  154  324:ldc1            #188 <String "android.support.groupKey">
	//  155  326:aload           19
	//  156  328:invokevirtual   #192 <Method void Bundle.putString(String, String)>
			if(flag3)
	//* 157  331:iload           20
	//* 158  333:ifeq            353
			{
				context = ((Context) (mExtras));
	//  159  336:aload_0         
	//  160  337:getfield        #176 <Field Bundle mExtras>
	//  161  340:astore_1        
				notification = "android.support.isGroupSummary";
	//  162  341:ldc1            #194 <String "android.support.isGroupSummary">
	//  163  343:astore_2        
			} else
	//* 164  344:aload_1         
	//* 165  345:aload_2         
	//* 166  346:iconst_1        
	//* 167  347:invokevirtual   #186 <Method void Bundle.putBoolean(String, boolean)>
	//* 168  350:goto            364
			{
				context = ((Context) (mExtras));
	//  169  353:aload_0         
	//  170  354:getfield        #176 <Field Bundle mExtras>
	//  171  357:astore_1        
				notification = "android.support.useSideChannel";
	//  172  358:ldc1            #196 <String "android.support.useSideChannel">
	//  173  360:astore_2        
			}
			((Bundle) (context)).putBoolean(((String) (notification)), true);
		}
	//* 174  361:goto            344
		if(s1 != null)
	//* 175  364:aload           21
	//* 176  366:ifnull          380
			mExtras.putString("android.support.sortKey", s1);
	//  177  369:aload_0         
	//  178  370:getfield        #176 <Field Bundle mExtras>
	//  179  373:ldc1            #198 <String "android.support.sortKey">
	//  180  375:aload           21
	//  181  377:invokevirtual   #192 <Method void Bundle.putString(String, String)>
		mContentView = remoteviews1;
	//  182  380:aload_0         
	//  183  381:aload           22
	//  184  383:putfield        #200 <Field RemoteViews mContentView>
		mBigContentView = remoteviews2;
	//  185  386:aload_0         
	//  186  387:aload           23
	//  187  389:putfield        #202 <Field RemoteViews mBigContentView>
	//  188  392:return          
	}
}
