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
//			NotificationCompatJellybean, NotificationBuilderWithActions, NotificationBuilderWithBuilderAccessor

class NotificationCompatKitKat
{
	public static class Builder
		implements NotificationBuilderWithActions, NotificationBuilderWithBuilderAccessor
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
			int i1 = notification.flags;
		//   44   96:aload_2         
		//   45   97:getfield        #111 <Field int Notification.flags>
		//   46  100:istore          26
			boolean flag5 = false;
		//   47  102:iconst_0        
		//   48  103:istore          27
			if((i1 & 2) != 0)
		//*  49  105:iload           26
		//*  50  107:iconst_2        
		//*  51  108:iand            
		//*  52  109:ifeq            118
				flag1 = true;
		//   53  112:iconst_1        
		//   54  113:istore          14
			else
		//*  55  115:goto            121
				flag1 = false;
		//   56  118:iconst_0        
		//   57  119:istore          14
			context = ((Context) (((android.app.Notification.Builder) (context)).setOngoing(flag1)));
		//   58  121:aload_1         
		//   59  122:iload           14
		//   60  124:invokevirtual   #114 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
		//   61  127:astore_1        
			if((notification.flags & 8) != 0)
		//*  62  128:aload_2         
		//*  63  129:getfield        #111 <Field int Notification.flags>
		//*  64  132:bipush          8
		//*  65  134:iand            
		//*  66  135:ifeq            144
				flag1 = true;
		//   67  138:iconst_1        
		//   68  139:istore          14
			else
		//*  69  141:goto            147
				flag1 = false;
		//   70  144:iconst_0        
		//   71  145:istore          14
			context = ((Context) (((android.app.Notification.Builder) (context)).setOnlyAlertOnce(flag1)));
		//   72  147:aload_1         
		//   73  148:iload           14
		//   74  150:invokevirtual   #117 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
		//   75  153:astore_1        
			if((notification.flags & 0x10) != 0)
		//*  76  154:aload_2         
		//*  77  155:getfield        #111 <Field int Notification.flags>
		//*  78  158:bipush          16
		//*  79  160:iand            
		//*  80  161:ifeq            170
				flag1 = true;
		//   81  164:iconst_1        
		//   82  165:istore          14
			else
		//*  83  167:goto            173
				flag1 = false;
		//   84  170:iconst_0        
		//   85  171:istore          14
			context = ((Context) (((android.app.Notification.Builder) (context)).setAutoCancel(flag1).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setSubText(charsequence3).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent)));
		//   86  173:aload_1         
		//   87  174:iload           14
		//   88  176:invokevirtual   #120 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
		//   89  179:aload_2         
		//   90  180:getfield        #123 <Field int Notification.defaults>
		//   91  183:invokevirtual   #127 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
		//   92  186:aload_3         
		//   93  187:invokevirtual   #131 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
		//   94  190:aload           4
		//   95  192:invokevirtual   #134 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
		//   96  195:aload           17
		//   97  197:invokevirtual   #137 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
		//   98  200:aload           5
		//   99  202:invokevirtual   #140 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
		//  100  205:aload           8
		//  101  207:invokevirtual   #144 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
		//  102  210:aload_2         
		//  103  211:getfield        #148 <Field PendingIntent Notification.deleteIntent>
		//  104  214:invokevirtual   #151 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
		//  105  217:astore_1        
			if((notification.flags & 0x80) != 0)
		//* 106  218:aload_2         
		//* 107  219:getfield        #111 <Field int Notification.flags>
		//* 108  222:sipush          128
		//* 109  225:iand            
		//* 110  226:ifeq            235
				flag1 = true;
		//  111  229:iconst_1        
		//  112  230:istore          14
			else
		//* 113  232:goto            239
				flag1 = flag5;
		//  114  235:iload           27
		//  115  237:istore          14
			b = ((android.app.Notification.Builder) (context)).setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag2).setPriority(l).setProgress(j, k, flag);
		//  116  239:aload_0         
		//  117  240:aload_1         
		//  118  241:aload           9
		//  119  243:iload           14
		//  120  245:invokevirtual   #155 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
		//  121  248:aload           10
		//  122  250:invokevirtual   #159 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
		//  123  253:iload           7
		//  124  255:invokevirtual   #162 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
		//  125  258:iload           15
		//  126  260:invokevirtual   #165 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
		//  127  263:iload           16
		//  128  265:invokevirtual   #168 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
		//  129  268:iload           11
		//  130  270:iload           12
		//  131  272:iload           13
		//  132  274:invokevirtual   #172 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
		//  133  277:putfield        #174 <Field android.app.Notification$Builder b>
			mExtras = new Bundle();
		//  134  280:aload_0         
		//  135  281:new             #176 <Class Bundle>
		//  136  284:dup             
		//  137  285:invokespecial   #177 <Method void Bundle()>
		//  138  288:putfield        #179 <Field Bundle mExtras>
			if(bundle != null)
		//* 139  291:aload           20
		//* 140  293:ifnull          305
				mExtras.putAll(bundle);
		//  141  296:aload_0         
		//  142  297:getfield        #179 <Field Bundle mExtras>
		//  143  300:aload           20
		//  144  302:invokevirtual   #183 <Method void Bundle.putAll(Bundle)>
			if(arraylist != null && !arraylist.isEmpty())
		//* 145  305:aload           19
		//* 146  307:ifnull          343
		//* 147  310:aload           19
		//* 148  312:invokevirtual   #187 <Method boolean ArrayList.isEmpty()>
		//* 149  315:ifne            343
				mExtras.putStringArray("android.people", (String[])arraylist.toArray(((Object []) (new String[arraylist.size()]))));
		//  150  318:aload_0         
		//  151  319:getfield        #179 <Field Bundle mExtras>
		//  152  322:ldc1            #189 <String "android.people">
		//  153  324:aload           19
		//  154  326:aload           19
		//  155  328:invokevirtual   #193 <Method int ArrayList.size()>
		//  156  331:anewarray       String[]
		//  157  334:invokevirtual   #199 <Method Object[] ArrayList.toArray(Object[])>
		//  158  337:checkcast       #201 <Class String[]>
		//  159  340:invokevirtual   #205 <Method void Bundle.putStringArray(String, String[])>
			if(flag3)
		//* 160  343:iload           18
		//* 161  345:ifeq            358
				mExtras.putBoolean("android.support.localOnly", true);
		//  162  348:aload_0         
		//  163  349:getfield        #179 <Field Bundle mExtras>
		//  164  352:ldc1            #207 <String "android.support.localOnly">
		//  165  354:iconst_1        
		//  166  355:invokevirtual   #211 <Method void Bundle.putBoolean(String, boolean)>
			if(s != null)
		//* 167  358:aload           21
		//* 168  360:ifnull          407
			{
				mExtras.putString("android.support.groupKey", s);
		//  169  363:aload_0         
		//  170  364:getfield        #179 <Field Bundle mExtras>
		//  171  367:ldc1            #213 <String "android.support.groupKey">
		//  172  369:aload           21
		//  173  371:invokevirtual   #217 <Method void Bundle.putString(String, String)>
				if(flag4)
		//* 174  374:iload           22
		//* 175  376:ifeq            396
				{
					context = ((Context) (mExtras));
		//  176  379:aload_0         
		//  177  380:getfield        #179 <Field Bundle mExtras>
		//  178  383:astore_1        
					notification = "android.support.isGroupSummary";
		//  179  384:ldc1            #219 <String "android.support.isGroupSummary">
		//  180  386:astore_2        
				} else
		//* 181  387:aload_1         
		//* 182  388:aload_2         
		//* 183  389:iconst_1        
		//* 184  390:invokevirtual   #211 <Method void Bundle.putBoolean(String, boolean)>
		//* 185  393:goto            407
				{
					context = ((Context) (mExtras));
		//  186  396:aload_0         
		//  187  397:getfield        #179 <Field Bundle mExtras>
		//  188  400:astore_1        
					notification = "android.support.useSideChannel";
		//  189  401:ldc1            #221 <String "android.support.useSideChannel">
		//  190  403:astore_2        
				}
				((Bundle) (context)).putBoolean(((String) (notification)), true);
			}
		//* 191  404:goto            387
			if(s1 != null)
		//* 192  407:aload           23
		//* 193  409:ifnull          423
				mExtras.putString("android.support.sortKey", s1);
		//  194  412:aload_0         
		//  195  413:getfield        #179 <Field Bundle mExtras>
		//  196  416:ldc1            #223 <String "android.support.sortKey">
		//  197  418:aload           23
		//  198  420:invokevirtual   #217 <Method void Bundle.putString(String, String)>
			mContentView = remoteviews1;
		//  199  423:aload_0         
		//  200  424:aload           24
		//  201  426:putfield        #225 <Field RemoteViews mContentView>
			mBigContentView = remoteviews2;
		//  202  429:aload_0         
		//  203  430:aload           25
		//  204  432:putfield        #227 <Field RemoteViews mBigContentView>
		//  205  435:return          
		}
	}


	NotificationCompatKitKat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static NotificationCompatBase.Action getAction(Notification notification, int i, NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
	{
		android.app.Notification.Action action = notification.actions[i];
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field android.app.Notification$Action[] Notification.actions>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:astore          4
		notification = ((Notification) (notification.extras.getSparseParcelableArray("android.support.actionExtras")));
	//    5    8:aload_0         
	//    6    9:getfield        #24  <Field Bundle Notification.extras>
	//    7   12:ldc1            #26  <String "android.support.actionExtras">
	//    8   14:invokevirtual   #32  <Method SparseArray Bundle.getSparseParcelableArray(String)>
	//    9   17:astore_0        
		if(notification != null)
	//*  10   18:aload_0         
	//*  11   19:ifnull          34
			notification = ((Notification) ((Bundle)((SparseArray) (notification)).get(i)));
	//   12   22:aload_0         
	//   13   23:iload_1         
	//   14   24:invokevirtual   #38  <Method Object SparseArray.get(int)>
	//   15   27:checkcast       #28  <Class Bundle>
	//   16   30:astore_0        
		else
	//*  17   31:goto            36
			notification = null;
	//   18   34:aconst_null     
	//   19   35:astore_0        
		return NotificationCompatJellybean.readAction(factory, factory1, action.icon, action.title, action.actionIntent, ((Bundle) (notification)));
	//   20   36:aload_2         
	//   21   37:aload_3         
	//   22   38:aload           4
	//   23   40:getfield        #44  <Field int android.app.Notification$Action.icon>
	//   24   43:aload           4
	//   25   45:getfield        #48  <Field CharSequence android.app.Notification$Action.title>
	//   26   48:aload           4
	//   27   50:getfield        #52  <Field PendingIntent android.app.Notification$Action.actionIntent>
	//   28   53:aload_0         
	//   29   54:invokestatic    #58  <Method NotificationCompatBase$Action NotificationCompatJellybean.readAction(NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory, int, CharSequence, PendingIntent, Bundle)>
	//   30   57:areturn         
	}
}
