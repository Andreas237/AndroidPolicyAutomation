// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.app:
//			NotificationCompatJellybean, NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions

class NotificationCompatKitKat
{
	public static class Builder
		implements NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions
	{

		public void addAction(NotificationCompatBase.Action action)
		{
			mActionExtrasList.add(((Object) (NotificationCompatJellybean.writeActionAndGetExtras(b, action))));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field List mActionExtrasList>
		//    2    4:aload_0         
		//    3    5:getfield        #174 <Field android.app.Notification$Builder b>
		//    4    8:aload_1         
		//    5    9:invokestatic    #238 <Method Bundle NotificationCompatJellybean.writeActionAndGetExtras(android.app.Notification$Builder, NotificationCompatBase$Action)>
		//    6   12:invokeinterface #244 <Method boolean List.add(Object)>
		//    7   17:pop             
		//    8   18:return          
		}

		public Notification build()
		{
			Object obj = ((Object) (NotificationCompatJellybean.buildActionExtrasMap(mActionExtrasList)));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field List mActionExtrasList>
		//    2    4:invokestatic    #250 <Method SparseArray NotificationCompatJellybean.buildActionExtrasMap(List)>
		//    3    7:astore_1        
			if(obj != null)
		//*   4    8:aload_1         
		//*   5    9:ifnull          22
				mExtras.putSparseParcelableArray("android.support.actionExtras", ((SparseArray) (obj)));
		//    6   12:aload_0         
		//    7   13:getfield        #179 <Field Bundle mExtras>
		//    8   16:ldc1            #252 <String "android.support.actionExtras">
		//    9   18:aload_1         
		//   10   19:invokevirtual   #256 <Method void Bundle.putSparseParcelableArray(String, SparseArray)>
			b.setExtras(mExtras);
		//   11   22:aload_0         
		//   12   23:getfield        #174 <Field android.app.Notification$Builder b>
		//   13   26:aload_0         
		//   14   27:getfield        #179 <Field Bundle mExtras>
		//   15   30:invokevirtual   #260 <Method android.app.Notification$Builder android.app.Notification$Builder.setExtras(Bundle)>
		//   16   33:pop             
			obj = ((Object) (b.build()));
		//   17   34:aload_0         
		//   18   35:getfield        #174 <Field android.app.Notification$Builder b>
		//   19   38:invokevirtual   #262 <Method Notification android.app.Notification$Builder.build()>
		//   20   41:astore_1        
			if(mContentView != null)
		//*  21   42:aload_0         
		//*  22   43:getfield        #225 <Field RemoteViews mContentView>
		//*  23   46:ifnull          57
				obj.contentView = mContentView;
		//   24   49:aload_1         
		//   25   50:aload_0         
		//   26   51:getfield        #225 <Field RemoteViews mContentView>
		//   27   54:putfield        #64  <Field RemoteViews Notification.contentView>
			if(mBigContentView != null)
		//*  28   57:aload_0         
		//*  29   58:getfield        #227 <Field RemoteViews mBigContentView>
		//*  30   61:ifnull          72
				obj.bigContentView = mBigContentView;
		//   31   64:aload_1         
		//   32   65:aload_0         
		//   33   66:getfield        #227 <Field RemoteViews mBigContentView>
		//   34   69:putfield        #265 <Field RemoteViews Notification.bigContentView>
			return ((Notification) (obj));
		//   35   72:aload_1         
		//   36   73:areturn         
		}

		public android.app.Notification.Builder getBuilder()
		{
			return b;
		//    0    0:aload_0         
		//    1    1:getfield        #174 <Field android.app.Notification$Builder b>
		//    2    4:areturn         
		}

		private android.app.Notification.Builder b;
		private List mActionExtrasList;
		private RemoteViews mBigContentView;
		private RemoteViews mContentView;
		private Bundle mExtras;

		public Builder(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
				PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
				boolean flag2, int l, CharSequence charsequence3, boolean flag3, ArrayList arraylist, Bundle bundle, String s, 
				boolean flag4, String s1, RemoteViews remoteviews1, RemoteViews remoteviews2)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			mActionExtrasList = ((List) (new ArrayList()));
		//    2    4:aload_0         
		//    3    5:new             #28  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #29  <Method void ArrayList()>
		//    6   12:putfield        #31  <Field List mActionExtrasList>
			context = ((Context) ((new android.app.Notification.Builder(context)).setWhen(notification.when).setShowWhen(flag1).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS)));
		//    7   15:new             #33  <Class android.app.Notification$Builder>
		//    8   18:dup             
		//    9   19:aload_1         
		//   10   20:invokespecial   #36  <Method void android.app.Notification$Builder(Context)>
		//   11   23:aload_2         
		//   12   24:getfield        #42  <Field long Notification.when>
		//   13   27:invokevirtual   #46  <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
		//   14   30:iload           14
		//   15   32:invokevirtual   #50  <Method android.app.Notification$Builder android.app.Notification$Builder.setShowWhen(boolean)>
		//   16   35:aload_2         
		//   17   36:getfield        #54  <Field int Notification.icon>
		//   18   39:aload_2         
		//   19   40:getfield        #57  <Field int Notification.iconLevel>
		//   20   43:invokevirtual   #61  <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int, int)>
		//   21   46:aload_2         
		//   22   47:getfield        #64  <Field RemoteViews Notification.contentView>
		//   23   50:invokevirtual   #68  <Method android.app.Notification$Builder android.app.Notification$Builder.setContent(RemoteViews)>
		//   24   53:aload_2         
		//   25   54:getfield        #72  <Field CharSequence Notification.tickerText>
		//   26   57:aload           6
		//   27   59:invokevirtual   #76  <Method android.app.Notification$Builder android.app.Notification$Builder.setTicker(CharSequence, RemoteViews)>
		//   28   62:aload_2         
		//   29   63:getfield        #80  <Field android.net.Uri Notification.sound>
		//   30   66:aload_2         
		//   31   67:getfield        #83  <Field int Notification.audioStreamType>
		//   32   70:invokevirtual   #87  <Method android.app.Notification$Builder android.app.Notification$Builder.setSound(android.net.Uri, int)>
		//   33   73:aload_2         
		//   34   74:getfield        #91  <Field long[] Notification.vibrate>
		//   35   77:invokevirtual   #95  <Method android.app.Notification$Builder android.app.Notification$Builder.setVibrate(long[])>
		//   36   80:aload_2         
		//   37   81:getfield        #98  <Field int Notification.ledARGB>
		//   38   84:aload_2         
		//   39   85:getfield        #101 <Field int Notification.ledOnMS>
		//   40   88:aload_2         
		//   41   89:getfield        #104 <Field int Notification.ledOffMS>
		//   42   92:invokevirtual   #108 <Method android.app.Notification$Builder android.app.Notification$Builder.setLights(int, int, int)>
		//   43   95:astore_1        
			if((notification.flags & 2) != 0)
		//*  44   96:aload_2         
		//*  45   97:getfield        #111 <Field int Notification.flags>
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
			context = ((Context) (((android.app.Notification.Builder) (context)).setOngoing(flag1)));
		//   54  114:aload_1         
		//   55  115:iload           14
		//   56  117:invokevirtual   #114 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
		//   57  120:astore_1        
			if((notification.flags & 8) != 0)
		//*  58  121:aload_2         
		//*  59  122:getfield        #111 <Field int Notification.flags>
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
			context = ((Context) (((android.app.Notification.Builder) (context)).setOnlyAlertOnce(flag1)));
		//   68  140:aload_1         
		//   69  141:iload           14
		//   70  143:invokevirtual   #117 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
		//   71  146:astore_1        
			if((notification.flags & 0x10) != 0)
		//*  72  147:aload_2         
		//*  73  148:getfield        #111 <Field int Notification.flags>
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
			context = ((Context) (((android.app.Notification.Builder) (context)).setAutoCancel(flag1).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setSubText(charsequence3).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent)));
		//   82  166:aload_1         
		//   83  167:iload           14
		//   84  169:invokevirtual   #120 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
		//   85  172:aload_2         
		//   86  173:getfield        #123 <Field int Notification.defaults>
		//   87  176:invokevirtual   #127 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
		//   88  179:aload_3         
		//   89  180:invokevirtual   #131 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
		//   90  183:aload           4
		//   91  185:invokevirtual   #134 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
		//   92  188:aload           17
		//   93  190:invokevirtual   #137 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
		//   94  193:aload           5
		//   95  195:invokevirtual   #140 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
		//   96  198:aload           8
		//   97  200:invokevirtual   #144 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
		//   98  203:aload_2         
		//   99  204:getfield        #148 <Field PendingIntent Notification.deleteIntent>
		//  100  207:invokevirtual   #151 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
		//  101  210:astore_1        
			if((notification.flags & 0x80) != 0)
		//* 102  211:aload_2         
		//* 103  212:getfield        #111 <Field int Notification.flags>
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
			b = ((android.app.Notification.Builder) (context)).setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag2).setPriority(l).setProgress(j, k, flag);
		//  112  231:aload_0         
		//  113  232:aload_1         
		//  114  233:aload           9
		//  115  235:iload           14
		//  116  237:invokevirtual   #155 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
		//  117  240:aload           10
		//  118  242:invokevirtual   #159 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
		//  119  245:iload           7
		//  120  247:invokevirtual   #162 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
		//  121  250:iload           15
		//  122  252:invokevirtual   #165 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
		//  123  255:iload           16
		//  124  257:invokevirtual   #168 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
		//  125  260:iload           11
		//  126  262:iload           12
		//  127  264:iload           13
		//  128  266:invokevirtual   #172 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
		//  129  269:putfield        #174 <Field android.app.Notification$Builder b>
			mExtras = new Bundle();
		//  130  272:aload_0         
		//  131  273:new             #176 <Class Bundle>
		//  132  276:dup             
		//  133  277:invokespecial   #177 <Method void Bundle()>
		//  134  280:putfield        #179 <Field Bundle mExtras>
			if(bundle != null)
		//* 135  283:aload           20
		//* 136  285:ifnull          297
				mExtras.putAll(bundle);
		//  137  288:aload_0         
		//  138  289:getfield        #179 <Field Bundle mExtras>
		//  139  292:aload           20
		//  140  294:invokevirtual   #183 <Method void Bundle.putAll(Bundle)>
			if(arraylist != null && !arraylist.isEmpty())
		//* 141  297:aload           19
		//* 142  299:ifnull          335
		//* 143  302:aload           19
		//* 144  304:invokevirtual   #187 <Method boolean ArrayList.isEmpty()>
		//* 145  307:ifne            335
				mExtras.putStringArray("android.people", (String[])arraylist.toArray(((Object []) (new String[arraylist.size()]))));
		//  146  310:aload_0         
		//  147  311:getfield        #179 <Field Bundle mExtras>
		//  148  314:ldc1            #189 <String "android.people">
		//  149  316:aload           19
		//  150  318:aload           19
		//  151  320:invokevirtual   #193 <Method int ArrayList.size()>
		//  152  323:anewarray       String[]
		//  153  326:invokevirtual   #199 <Method Object[] ArrayList.toArray(Object[])>
		//  154  329:checkcast       #201 <Class String[]>
		//  155  332:invokevirtual   #205 <Method void Bundle.putStringArray(String, String[])>
			if(flag3)
		//* 156  335:iload           18
		//* 157  337:ifeq            350
				mExtras.putBoolean("android.support.localOnly", true);
		//  158  340:aload_0         
		//  159  341:getfield        #179 <Field Bundle mExtras>
		//  160  344:ldc1            #207 <String "android.support.localOnly">
		//  161  346:iconst_1        
		//  162  347:invokevirtual   #211 <Method void Bundle.putBoolean(String, boolean)>
			if(s != null)
		//* 163  350:aload           21
		//* 164  352:ifnull          394
			{
				mExtras.putString("android.support.groupKey", s);
		//  165  355:aload_0         
		//  166  356:getfield        #179 <Field Bundle mExtras>
		//  167  359:ldc1            #213 <String "android.support.groupKey">
		//  168  361:aload           21
		//  169  363:invokevirtual   #217 <Method void Bundle.putString(String, String)>
				if(flag4)
		//* 170  366:iload           22
		//* 171  368:ifeq            384
					mExtras.putBoolean("android.support.isGroupSummary", true);
		//  172  371:aload_0         
		//  173  372:getfield        #179 <Field Bundle mExtras>
		//  174  375:ldc1            #219 <String "android.support.isGroupSummary">
		//  175  377:iconst_1        
		//  176  378:invokevirtual   #211 <Method void Bundle.putBoolean(String, boolean)>
				else
		//* 177  381:goto            394
					mExtras.putBoolean("android.support.useSideChannel", true);
		//  178  384:aload_0         
		//  179  385:getfield        #179 <Field Bundle mExtras>
		//  180  388:ldc1            #221 <String "android.support.useSideChannel">
		//  181  390:iconst_1        
		//  182  391:invokevirtual   #211 <Method void Bundle.putBoolean(String, boolean)>
			}
			if(s1 != null)
		//* 183  394:aload           23
		//* 184  396:ifnull          410
				mExtras.putString("android.support.sortKey", s1);
		//  185  399:aload_0         
		//  186  400:getfield        #179 <Field Bundle mExtras>
		//  187  403:ldc1            #223 <String "android.support.sortKey">
		//  188  405:aload           23
		//  189  407:invokevirtual   #217 <Method void Bundle.putString(String, String)>
			mContentView = remoteviews1;
		//  190  410:aload_0         
		//  191  411:aload           24
		//  192  413:putfield        #225 <Field RemoteViews mContentView>
			mBigContentView = remoteviews2;
		//  193  416:aload_0         
		//  194  417:aload           25
		//  195  419:putfield        #227 <Field RemoteViews mBigContentView>
		//  196  422:return          
		}
	}


	NotificationCompatKitKat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static NotificationCompatBase.Action getAction(Notification notification, int i, NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
	{
		android.app.Notification.Action action = notification.actions[i];
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field android.app.Notification$Action[] Notification.actions>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:astore          5
		Object obj = null;
	//    5    8:aconst_null     
	//    6    9:astore          4
		SparseArray sparsearray = notification.extras.getSparseParcelableArray("android.support.actionExtras");
	//    7   11:aload_0         
	//    8   12:getfield        #27  <Field Bundle Notification.extras>
	//    9   15:ldc1            #29  <String "android.support.actionExtras">
	//   10   17:invokevirtual   #35  <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//   11   20:astore          6
		notification = ((Notification) (obj));
	//   12   22:aload           4
	//   13   24:astore_0        
		if(sparsearray != null)
	//*  14   25:aload           6
	//*  15   27:ifnull          40
			notification = ((Notification) ((Bundle)sparsearray.get(i)));
	//   16   30:aload           6
	//   17   32:iload_1         
	//   18   33:invokevirtual   #41  <Method Object SparseArray.get(int)>
	//   19   36:checkcast       #31  <Class Bundle>
	//   20   39:astore_0        
		return NotificationCompatJellybean.readAction(factory, factory1, action.icon, action.title, action.actionIntent, ((Bundle) (notification)));
	//   21   40:aload_2         
	//   22   41:aload_3         
	//   23   42:aload           5
	//   24   44:getfield        #47  <Field int android.app.Notification$Action.icon>
	//   25   47:aload           5
	//   26   49:getfield        #51  <Field CharSequence android.app.Notification$Action.title>
	//   27   52:aload           5
	//   28   54:getfield        #55  <Field PendingIntent android.app.Notification$Action.actionIntent>
	//   29   57:aload_0         
	//   30   58:invokestatic    #61  <Method NotificationCompatBase$Action NotificationCompatJellybean.readAction(NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory, int, CharSequence, PendingIntent, Bundle)>
	//   31   61:areturn         
	}

	public static int getActionCount(Notification notification)
	{
		if(notification.actions != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field android.app.Notification$Action[] Notification.actions>
	//*   2    4:ifnull          13
			return notification.actions.length;
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field android.app.Notification$Action[] Notification.actions>
	//    5   11:arraylength     
	//    6   12:ireturn         
		else
			return 0;
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public static Bundle getExtras(Notification notification)
	{
		return notification.extras;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Bundle Notification.extras>
	//    2    4:areturn         
	}

	public static String getGroup(Notification notification)
	{
		return notification.extras.getString("android.support.groupKey");
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Bundle Notification.extras>
	//    2    4:ldc1            #69  <String "android.support.groupKey">
	//    3    6:invokevirtual   #73  <Method String Bundle.getString(String)>
	//    4    9:areturn         
	}

	public static boolean getLocalOnly(Notification notification)
	{
		return notification.extras.getBoolean("android.support.localOnly");
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Bundle Notification.extras>
	//    2    4:ldc1            #77  <String "android.support.localOnly">
	//    3    6:invokevirtual   #81  <Method boolean Bundle.getBoolean(String)>
	//    4    9:ireturn         
	}

	public static String getSortKey(Notification notification)
	{
		return notification.extras.getString("android.support.sortKey");
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Bundle Notification.extras>
	//    2    4:ldc1            #84  <String "android.support.sortKey">
	//    3    6:invokevirtual   #73  <Method String Bundle.getString(String)>
	//    4    9:areturn         
	}

	public static boolean isGroupSummary(Notification notification)
	{
		return notification.extras.getBoolean("android.support.isGroupSummary");
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Bundle Notification.extras>
	//    2    4:ldc1            #87  <String "android.support.isGroupSummary">
	//    3    6:invokevirtual   #81  <Method boolean Bundle.getBoolean(String)>
	//    4    9:ireturn         
	}
}
