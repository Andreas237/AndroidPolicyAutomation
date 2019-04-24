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
		//*  22   43:getfield        #223 <Field RemoteViews mContentView>
		//*  23   46:ifnull          57
				obj.contentView = mContentView;
		//   24   49:aload_1         
		//   25   50:aload_0         
		//   26   51:getfield        #223 <Field RemoteViews mContentView>
		//   27   54:putfield        #64  <Field RemoteViews Notification.contentView>
			if(mBigContentView != null)
		//*  28   57:aload_0         
		//*  29   58:getfield        #225 <Field RemoteViews mBigContentView>
		//*  30   61:ifnull          72
				obj.bigContentView = mBigContentView;
		//   31   64:aload_1         
		//   32   65:aload_0         
		//   33   66:getfield        #225 <Field RemoteViews mBigContentView>
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
		//*  48  102:ifeq            386
				flag1 = true;
		//   49  105:iconst_1        
		//   50  106:istore          14
			else
		//*  51  108:aload_1         
		//*  52  109:iload           14
		//*  53  111:invokevirtual   #114 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
		//*  54  114:astore_1        
		//*  55  115:aload_2         
		//*  56  116:getfield        #111 <Field int Notification.flags>
		//*  57  119:bipush          8
		//*  58  121:iand            
		//*  59  122:ifeq            392
		//*  60  125:iconst_1        
		//*  61  126:istore          14
		//*  62  128:aload_1         
		//*  63  129:iload           14
		//*  64  131:invokevirtual   #117 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
		//*  65  134:astore_1        
		//*  66  135:aload_2         
		//*  67  136:getfield        #111 <Field int Notification.flags>
		//*  68  139:bipush          16
		//*  69  141:iand            
		//*  70  142:ifeq            398
		//*  71  145:iconst_1        
		//*  72  146:istore          14
		//*  73  148:aload_1         
		//*  74  149:iload           14
		//*  75  151:invokevirtual   #120 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
		//*  76  154:aload_2         
		//*  77  155:getfield        #123 <Field int Notification.defaults>
		//*  78  158:invokevirtual   #127 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
		//*  79  161:aload_3         
		//*  80  162:invokevirtual   #131 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
		//*  81  165:aload           4
		//*  82  167:invokevirtual   #134 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
		//*  83  170:aload           17
		//*  84  172:invokevirtual   #137 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
		//*  85  175:aload           5
		//*  86  177:invokevirtual   #140 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
		//*  87  180:aload           8
		//*  88  182:invokevirtual   #144 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
		//*  89  185:aload_2         
		//*  90  186:getfield        #148 <Field PendingIntent Notification.deleteIntent>
		//*  91  189:invokevirtual   #151 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
		//*  92  192:astore_1        
		//*  93  193:aload_2         
		//*  94  194:getfield        #111 <Field int Notification.flags>
		//*  95  197:sipush          128
		//*  96  200:iand            
		//*  97  201:ifeq            404
		//*  98  204:iconst_1        
		//*  99  205:istore          14
		//* 100  207:aload_0         
		//* 101  208:aload_1         
		//* 102  209:aload           9
		//* 103  211:iload           14
		//* 104  213:invokevirtual   #155 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
		//* 105  216:aload           10
		//* 106  218:invokevirtual   #159 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
		//* 107  221:iload           7
		//* 108  223:invokevirtual   #162 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
		//* 109  226:iload           15
		//* 110  228:invokevirtual   #165 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
		//* 111  231:iload           16
		//* 112  233:invokevirtual   #168 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
		//* 113  236:iload           11
		//* 114  238:iload           12
		//* 115  240:iload           13
		//* 116  242:invokevirtual   #172 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
		//* 117  245:putfield        #174 <Field android.app.Notification$Builder b>
		//* 118  248:aload_0         
		//* 119  249:new             #176 <Class Bundle>
		//* 120  252:dup             
		//* 121  253:invokespecial   #177 <Method void Bundle()>
		//* 122  256:putfield        #179 <Field Bundle mExtras>
		//* 123  259:aload           20
		//* 124  261:ifnull          273
		//* 125  264:aload_0         
		//* 126  265:getfield        #179 <Field Bundle mExtras>
		//* 127  268:aload           20
		//* 128  270:invokevirtual   #183 <Method void Bundle.putAll(Bundle)>
		//* 129  273:aload           19
		//* 130  275:ifnull          311
		//* 131  278:aload           19
		//* 132  280:invokevirtual   #187 <Method boolean ArrayList.isEmpty()>
		//* 133  283:ifne            311
		//* 134  286:aload_0         
		//* 135  287:getfield        #179 <Field Bundle mExtras>
		//* 136  290:ldc1            #189 <String "android.people">
		//* 137  292:aload           19
		//* 138  294:aload           19
		//* 139  296:invokevirtual   #193 <Method int ArrayList.size()>
		//* 140  299:anewarray       String[]
		//* 141  302:invokevirtual   #199 <Method Object[] ArrayList.toArray(Object[])>
		//* 142  305:checkcast       #201 <Class String[]>
		//* 143  308:invokevirtual   #205 <Method void Bundle.putStringArray(String, String[])>
		//* 144  311:iload           18
		//* 145  313:ifeq            326
		//* 146  316:aload_0         
		//* 147  317:getfield        #179 <Field Bundle mExtras>
		//* 148  320:ldc1            #207 <String "android.support.localOnly">
		//* 149  322:iconst_1        
		//* 150  323:invokevirtual   #211 <Method void Bundle.putBoolean(String, boolean)>
		//* 151  326:aload           21
		//* 152  328:ifnull          357
		//* 153  331:aload_0         
		//* 154  332:getfield        #179 <Field Bundle mExtras>
		//* 155  335:ldc1            #213 <String "android.support.groupKey">
		//* 156  337:aload           21
		//* 157  339:invokevirtual   #217 <Method void Bundle.putString(String, String)>
		//* 158  342:iload           22
		//* 159  344:ifeq            410
		//* 160  347:aload_0         
		//* 161  348:getfield        #179 <Field Bundle mExtras>
		//* 162  351:ldc1            #219 <String "android.support.isGroupSummary">
		//* 163  353:iconst_1        
		//* 164  354:invokevirtual   #211 <Method void Bundle.putBoolean(String, boolean)>
		//* 165  357:aload           23
		//* 166  359:ifnull          373
		//* 167  362:aload_0         
		//* 168  363:getfield        #179 <Field Bundle mExtras>
		//* 169  366:ldc1            #221 <String "android.support.sortKey">
		//* 170  368:aload           23
		//* 171  370:invokevirtual   #217 <Method void Bundle.putString(String, String)>
		//* 172  373:aload_0         
		//* 173  374:aload           24
		//* 174  376:putfield        #223 <Field RemoteViews mContentView>
		//* 175  379:aload_0         
		//* 176  380:aload           25
		//* 177  382:putfield        #225 <Field RemoteViews mBigContentView>
		//* 178  385:return          
				flag1 = false;
		//  179  386:iconst_0        
		//  180  387:istore          14
			context = ((Context) (((android.app.Notification.Builder) (context)).setOngoing(flag1)));
			if((notification.flags & 8) != 0)
				flag1 = true;
			else
		//* 181  389:goto            108
				flag1 = false;
		//  182  392:iconst_0        
		//  183  393:istore          14
			context = ((Context) (((android.app.Notification.Builder) (context)).setOnlyAlertOnce(flag1)));
			if((notification.flags & 0x10) != 0)
				flag1 = true;
			else
		//* 184  395:goto            128
				flag1 = false;
		//  185  398:iconst_0        
		//  186  399:istore          14
			context = ((Context) (((android.app.Notification.Builder) (context)).setAutoCancel(flag1).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setSubText(charsequence3).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent)));
			if((notification.flags & 0x80) != 0)
				flag1 = true;
			else
		//* 187  401:goto            148
				flag1 = false;
		//  188  404:iconst_0        
		//  189  405:istore          14
			b = ((android.app.Notification.Builder) (context)).setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag2).setPriority(l).setProgress(j, k, flag);
			mExtras = new Bundle();
			if(bundle != null)
				mExtras.putAll(bundle);
			if(arraylist != null && !arraylist.isEmpty())
				mExtras.putStringArray("android.people", (String[])arraylist.toArray(((Object []) (new String[arraylist.size()]))));
			if(flag3)
				mExtras.putBoolean("android.support.localOnly", true);
			if(s != null)
			{
				mExtras.putString("android.support.groupKey", s);
				if(flag4)
					mExtras.putBoolean("android.support.isGroupSummary", true);
				else
		//* 190  407:goto            207
					mExtras.putBoolean("android.support.useSideChannel", true);
		//  191  410:aload_0         
		//  192  411:getfield        #179 <Field Bundle mExtras>
		//  193  414:ldc1            #227 <String "android.support.useSideChannel">
		//  194  416:iconst_1        
		//  195  417:invokevirtual   #211 <Method void Bundle.putBoolean(String, boolean)>
			}
			if(s1 != null)
				mExtras.putString("android.support.sortKey", s1);
			mContentView = remoteviews1;
			mBigContentView = remoteviews2;
		//* 196  420:goto            357
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
}
