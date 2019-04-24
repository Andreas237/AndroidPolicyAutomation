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
//			RemoteInputCompatApi20, NotificationBuilderWithActions, NotificationBuilderWithBuilderAccessor

class NotificationCompatApi20
{
	public static class Builder
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

		public Builder(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
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
			int j1 = notification.flags;
		//   39   85:aload_2         
		//   40   86:getfield        #104 <Field int Notification.flags>
		//   41   89:istore          27
			boolean flag5 = false;
		//   42   91:iconst_0        
		//   43   92:istore          28
			if((j1 & 2) != 0)
		//*  44   94:iload           27
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
		//   55  113:invokevirtual   #107 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
		//   56  116:astore_1        
			if((notification.flags & 8) != 0)
		//*  57  117:aload_2         
		//*  58  118:getfield        #104 <Field int Notification.flags>
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
		//   69  139:invokevirtual   #110 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
		//   70  142:astore_1        
			if((notification.flags & 0x10) != 0)
		//*  71  143:aload_2         
		//*  72  144:getfield        #104 <Field int Notification.flags>
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
		//   83  165:invokevirtual   #113 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
		//   84  168:aload_2         
		//   85  169:getfield        #116 <Field int Notification.defaults>
		//   86  172:invokevirtual   #120 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
		//   87  175:aload_3         
		//   88  176:invokevirtual   #124 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
		//   89  179:aload           4
		//   90  181:invokevirtual   #127 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
		//   91  184:aload           17
		//   92  186:invokevirtual   #130 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
		//   93  189:aload           5
		//   94  191:invokevirtual   #133 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
		//   95  194:aload           8
		//   96  196:invokevirtual   #137 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
		//   97  199:aload_2         
		//   98  200:getfield        #141 <Field PendingIntent Notification.deleteIntent>
		//   99  203:invokevirtual   #144 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
		//  100  206:astore_1        
			if((notification.flags & 0x80) != 0)
		//* 101  207:aload_2         
		//* 102  208:getfield        #104 <Field int Notification.flags>
		//* 103  211:sipush          128
		//* 104  214:iand            
		//* 105  215:ifeq            224
				flag1 = true;
		//  106  218:iconst_1        
		//  107  219:istore          14
			else
		//* 108  221:goto            228
				flag1 = flag5;
		//  109  224:iload           28
		//  110  226:istore          14
			b = ((android.app.Notification.Builder) (context)).setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag2).setPriority(l).setProgress(j, k, flag).setLocalOnly(flag3).setGroup(s).setGroupSummary(flag4).setSortKey(s1);
		//  111  228:aload_0         
		//  112  229:aload_1         
		//  113  230:aload           9
		//  114  232:iload           14
		//  115  234:invokevirtual   #148 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
		//  116  237:aload           10
		//  117  239:invokevirtual   #152 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
		//  118  242:iload           7
		//  119  244:invokevirtual   #155 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
		//  120  247:iload           15
		//  121  249:invokevirtual   #158 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
		//  122  252:iload           16
		//  123  254:invokevirtual   #161 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
		//  124  257:iload           11
		//  125  259:iload           12
		//  126  261:iload           13
		//  127  263:invokevirtual   #165 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
		//  128  266:iload           18
		//  129  268:invokevirtual   #168 <Method android.app.Notification$Builder android.app.Notification$Builder.setLocalOnly(boolean)>
		//  130  271:aload           21
		//  131  273:invokevirtual   #172 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroup(String)>
		//  132  276:iload           22
		//  133  278:invokevirtual   #175 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroupSummary(boolean)>
		//  134  281:aload           23
		//  135  283:invokevirtual   #178 <Method android.app.Notification$Builder android.app.Notification$Builder.setSortKey(String)>
		//  136  286:putfield        #180 <Field android.app.Notification$Builder b>
			mExtras = new Bundle();
		//  137  289:aload_0         
		//  138  290:new             #182 <Class Bundle>
		//  139  293:dup             
		//  140  294:invokespecial   #183 <Method void Bundle()>
		//  141  297:putfield        #185 <Field Bundle mExtras>
			if(bundle != null)
		//* 142  300:aload           20
		//* 143  302:ifnull          314
				mExtras.putAll(bundle);
		//  144  305:aload_0         
		//  145  306:getfield        #185 <Field Bundle mExtras>
		//  146  309:aload           20
		//  147  311:invokevirtual   #189 <Method void Bundle.putAll(Bundle)>
			if(arraylist != null && !arraylist.isEmpty())
		//* 148  314:aload           19
		//* 149  316:ifnull          352
		//* 150  319:aload           19
		//* 151  321:invokevirtual   #195 <Method boolean ArrayList.isEmpty()>
		//* 152  324:ifne            352
				mExtras.putStringArray("android.people", (String[])arraylist.toArray(((Object []) (new String[arraylist.size()]))));
		//  153  327:aload_0         
		//  154  328:getfield        #185 <Field Bundle mExtras>
		//  155  331:ldc1            #197 <String "android.people">
		//  156  333:aload           19
		//  157  335:aload           19
		//  158  337:invokevirtual   #201 <Method int ArrayList.size()>
		//  159  340:anewarray       String[]
		//  160  343:invokevirtual   #207 <Method Object[] ArrayList.toArray(Object[])>
		//  161  346:checkcast       #209 <Class String[]>
		//  162  349:invokevirtual   #213 <Method void Bundle.putStringArray(String, String[])>
			mContentView = remoteviews1;
		//  163  352:aload_0         
		//  164  353:aload           24
		//  165  355:putfield        #215 <Field RemoteViews mContentView>
			mBigContentView = remoteviews2;
		//  166  358:aload_0         
		//  167  359:aload           25
		//  168  361:putfield        #217 <Field RemoteViews mBigContentView>
			mGroupAlertBehavior = i1;
		//  169  364:aload_0         
		//  170  365:iload           26
		//  171  367:putfield        #219 <Field int mGroupAlertBehavior>
		//  172  370:return          
		}
	}


	NotificationCompatApi20()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static void addAction(android.app.Notification.Builder builder, NotificationCompatBase.Action action)
	{
		android.app.Notification.Action.Builder builder1 = new android.app.Notification.Action.Builder(action.getIcon(), action.getTitle(), action.getActionIntent());
	//    0    0:new             #16  <Class android.app.Notification$Action$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #22  <Method int NotificationCompatBase$Action.getIcon()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #26  <Method CharSequence NotificationCompatBase$Action.getTitle()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #30  <Method PendingIntent NotificationCompatBase$Action.getActionIntent()>
	//    8   16:invokespecial   #33  <Method void android.app.Notification$Action$Builder(int, CharSequence, PendingIntent)>
	//    9   19:astore          5
		if(action.getRemoteInputs() != null)
	//*  10   21:aload_1         
	//*  11   22:invokevirtual   #37  <Method RemoteInputCompatBase$RemoteInput[] NotificationCompatBase$Action.getRemoteInputs()>
	//*  12   25:ifnull          65
		{
			android.app.RemoteInput aremoteinput[] = RemoteInputCompatApi20.fromCompat(action.getRemoteInputs());
	//   13   28:aload_1         
	//   14   29:invokevirtual   #37  <Method RemoteInputCompatBase$RemoteInput[] NotificationCompatBase$Action.getRemoteInputs()>
	//   15   32:invokestatic    #43  <Method android.app.RemoteInput[] RemoteInputCompatApi20.fromCompat(RemoteInputCompatBase$RemoteInput[])>
	//   16   35:astore          4
			int j = aremoteinput.length;
	//   17   37:aload           4
	//   18   39:arraylength     
	//   19   40:istore_3        
			for(int i = 0; i < j; i++)
	//*  20   41:iconst_0        
	//*  21   42:istore_2        
	//*  22   43:iload_2         
	//*  23   44:iload_3         
	//*  24   45:icmpge          65
				builder1.addRemoteInput(aremoteinput[i]);
	//   25   48:aload           5
	//   26   50:aload           4
	//   27   52:iload_2         
	//   28   53:aaload          
	//   29   54:invokevirtual   #47  <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.addRemoteInput(android.app.RemoteInput)>
	//   30   57:pop             

	//   31   58:iload_2         
	//   32   59:iconst_1        
	//   33   60:iadd            
	//   34   61:istore_2        
		}
	//*  35   62:goto            43
		Bundle bundle;
		if(action.getExtras() != null)
	//*  36   65:aload_1         
	//*  37   66:invokevirtual   #51  <Method Bundle NotificationCompatBase$Action.getExtras()>
	//*  38   69:ifnull          88
			bundle = new Bundle(action.getExtras());
	//   39   72:new             #53  <Class Bundle>
	//   40   75:dup             
	//   41   76:aload_1         
	//   42   77:invokevirtual   #51  <Method Bundle NotificationCompatBase$Action.getExtras()>
	//   43   80:invokespecial   #56  <Method void Bundle(Bundle)>
	//   44   83:astore          4
		else
	//*  45   85:goto            97
			bundle = new Bundle();
	//   46   88:new             #53  <Class Bundle>
	//   47   91:dup             
	//   48   92:invokespecial   #57  <Method void Bundle()>
	//   49   95:astore          4
		bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
	//   50   97:aload           4
	//   51   99:ldc1            #59  <String "android.support.allowGeneratedReplies">
	//   52  101:aload_1         
	//   53  102:invokevirtual   #63  <Method boolean NotificationCompatBase$Action.getAllowGeneratedReplies()>
	//   54  105:invokevirtual   #67  <Method void Bundle.putBoolean(String, boolean)>
		builder1.addExtras(bundle);
	//   55  108:aload           5
	//   56  110:aload           4
	//   57  112:invokevirtual   #71  <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.addExtras(Bundle)>
	//   58  115:pop             
		builder.addAction(builder1.build());
	//   59  116:aload_0         
	//   60  117:aload           5
	//   61  119:invokevirtual   #75  <Method android.app.Notification$Action android.app.Notification$Action$Builder.build()>
	//   62  122:invokevirtual   #80  <Method android.app.Notification$Builder android.app.Notification$Builder.addAction(android.app.Notification$Action)>
	//   63  125:pop             
	//   64  126:return          
	}

	public static NotificationCompatBase.Action getAction(Notification notification, int i, NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
	{
		return getActionCompatFromAction(notification.actions[i], factory, factory1);
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field android.app.Notification$Action[] Notification.actions>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokestatic    #92  <Method NotificationCompatBase$Action getActionCompatFromAction(android.app.Notification$Action, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
	//    7   11:areturn         
	}

	private static NotificationCompatBase.Action getActionCompatFromAction(android.app.Notification.Action action, NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
	{
		factory1 = ((RemoteInputCompatBase.RemoteInput.Factory) (RemoteInputCompatApi20.toCompat(action.getRemoteInputs(), factory1)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #97  <Method android.app.RemoteInput[] android.app.Notification$Action.getRemoteInputs()>
	//    2    4:aload_2         
	//    3    5:invokestatic    #101 <Method RemoteInputCompatBase$RemoteInput[] RemoteInputCompatApi20.toCompat(android.app.RemoteInput[], RemoteInputCompatBase$RemoteInput$Factory)>
	//    4    8:astore_2        
		boolean flag = action.getExtras().getBoolean("android.support.allowGeneratedReplies");
	//    5    9:aload_0         
	//    6   10:invokevirtual   #102 <Method Bundle android.app.Notification$Action.getExtras()>
	//    7   13:ldc1            #59  <String "android.support.allowGeneratedReplies">
	//    8   15:invokevirtual   #106 <Method boolean Bundle.getBoolean(String)>
	//    9   18:istore_3        
		return factory.build(action.icon, action.title, action.actionIntent, action.getExtras(), ((RemoteInputCompatBase.RemoteInput []) (factory1)), ((RemoteInputCompatBase.RemoteInput []) (null)), flag);
	//   10   19:aload_1         
	//   11   20:aload_0         
	//   12   21:getfield        #110 <Field int android.app.Notification$Action.icon>
	//   13   24:aload_0         
	//   14   25:getfield        #114 <Field CharSequence android.app.Notification$Action.title>
	//   15   28:aload_0         
	//   16   29:getfield        #118 <Field PendingIntent android.app.Notification$Action.actionIntent>
	//   17   32:aload_0         
	//   18   33:invokevirtual   #102 <Method Bundle android.app.Notification$Action.getExtras()>
	//   19   36:aload_2         
	//   20   37:aconst_null     
	//   21   38:iload_3         
	//   22   39:invokeinterface #123 <Method NotificationCompatBase$Action NotificationCompatBase$Action$Factory.build(int, CharSequence, PendingIntent, Bundle, RemoteInputCompatBase$RemoteInput[], RemoteInputCompatBase$RemoteInput[], boolean)>
	//   23   44:areturn         
	}

	private static android.app.Notification.Action getActionFromActionCompat(NotificationCompatBase.Action action)
	{
		android.app.Notification.Action.Builder builder = new android.app.Notification.Action.Builder(action.getIcon(), action.getTitle(), action.getActionIntent());
	//    0    0:new             #16  <Class android.app.Notification$Action$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #22  <Method int NotificationCompatBase$Action.getIcon()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #26  <Method CharSequence NotificationCompatBase$Action.getTitle()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #30  <Method PendingIntent NotificationCompatBase$Action.getActionIntent()>
	//    8   16:invokespecial   #33  <Method void android.app.Notification$Action$Builder(int, CharSequence, PendingIntent)>
	//    9   19:astore          4
		Bundle bundle;
		if(action.getExtras() != null)
	//*  10   21:aload_0         
	//*  11   22:invokevirtual   #51  <Method Bundle NotificationCompatBase$Action.getExtras()>
	//*  12   25:ifnull          43
			bundle = new Bundle(action.getExtras());
	//   13   28:new             #53  <Class Bundle>
	//   14   31:dup             
	//   15   32:aload_0         
	//   16   33:invokevirtual   #51  <Method Bundle NotificationCompatBase$Action.getExtras()>
	//   17   36:invokespecial   #56  <Method void Bundle(Bundle)>
	//   18   39:astore_3        
		else
	//*  19   40:goto            51
			bundle = new Bundle();
	//   20   43:new             #53  <Class Bundle>
	//   21   46:dup             
	//   22   47:invokespecial   #57  <Method void Bundle()>
	//   23   50:astore_3        
		bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
	//   24   51:aload_3         
	//   25   52:ldc1            #59  <String "android.support.allowGeneratedReplies">
	//   26   54:aload_0         
	//   27   55:invokevirtual   #63  <Method boolean NotificationCompatBase$Action.getAllowGeneratedReplies()>
	//   28   58:invokevirtual   #67  <Method void Bundle.putBoolean(String, boolean)>
		builder.addExtras(bundle);
	//   29   61:aload           4
	//   30   63:aload_3         
	//   31   64:invokevirtual   #71  <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.addExtras(Bundle)>
	//   32   67:pop             
		action = ((NotificationCompatBase.Action) (action.getRemoteInputs()));
	//   33   68:aload_0         
	//   34   69:invokevirtual   #37  <Method RemoteInputCompatBase$RemoteInput[] NotificationCompatBase$Action.getRemoteInputs()>
	//   35   72:astore_0        
		if(action != null)
	//*  36   73:aload_0         
	//*  37   74:ifnull          108
		{
			action = ((NotificationCompatBase.Action) (RemoteInputCompatApi20.fromCompat(((RemoteInputCompatBase.RemoteInput []) (action)))));
	//   38   77:aload_0         
	//   39   78:invokestatic    #43  <Method android.app.RemoteInput[] RemoteInputCompatApi20.fromCompat(RemoteInputCompatBase$RemoteInput[])>
	//   40   81:astore_0        
			int j = action.length;
	//   41   82:aload_0         
	//   42   83:arraylength     
	//   43   84:istore_2        
			for(int i = 0; i < j; i++)
	//*  44   85:iconst_0        
	//*  45   86:istore_1        
	//*  46   87:iload_1         
	//*  47   88:iload_2         
	//*  48   89:icmpge          108
				builder.addRemoteInput(((android.app.RemoteInput) (action[i])));
	//   49   92:aload           4
	//   50   94:aload_0         
	//   51   95:iload_1         
	//   52   96:aaload          
	//   53   97:invokevirtual   #47  <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.addRemoteInput(android.app.RemoteInput)>
	//   54  100:pop             

	//   55  101:iload_1         
	//   56  102:iconst_1        
	//   57  103:iadd            
	//   58  104:istore_1        
		}
	//*  59  105:goto            87
		return builder.build();
	//   60  108:aload           4
	//   61  110:invokevirtual   #75  <Method android.app.Notification$Action android.app.Notification$Action$Builder.build()>
	//   62  113:areturn         
	}

	public static NotificationCompatBase.Action[] getActionsFromParcelableArrayList(ArrayList arraylist, NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
	{
		if(arraylist == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		NotificationCompatBase.Action aaction[] = factory.newArray(arraylist.size());
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #132 <Method int ArrayList.size()>
	//    7   11:invokeinterface #136 <Method NotificationCompatBase$Action[] NotificationCompatBase$Action$Factory.newArray(int)>
	//    8   16:astore          4
		for(int i = 0; i < aaction.length; i++)
	//*   9   18:iconst_0        
	//*  10   19:istore_3        
	//*  11   20:iload_3         
	//*  12   21:aload           4
	//*  13   23:arraylength     
	//*  14   24:icmpge          51
			aaction[i] = getActionCompatFromAction((android.app.Notification.Action)arraylist.get(i), factory, factory1);
	//   15   27:aload           4
	//   16   29:iload_3         
	//   17   30:aload_0         
	//   18   31:iload_3         
	//   19   32:invokevirtual   #140 <Method Object ArrayList.get(int)>
	//   20   35:checkcast       #94  <Class android.app.Notification$Action>
	//   21   38:aload_1         
	//   22   39:aload_2         
	//   23   40:invokestatic    #92  <Method NotificationCompatBase$Action getActionCompatFromAction(android.app.Notification$Action, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
	//   24   43:aastore         

	//   25   44:iload_3         
	//   26   45:iconst_1        
	//   27   46:iadd            
	//   28   47:istore_3        
	//*  29   48:goto            20
		return aaction;
	//   30   51:aload           4
	//   31   53:areturn         
	}

	public static ArrayList getParcelableArrayListForActions(NotificationCompatBase.Action aaction[])
	{
		if(aaction == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		ArrayList arraylist = new ArrayList(aaction.length);
	//    4    6:new             #129 <Class ArrayList>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:arraylength     
	//    8   12:invokespecial   #147 <Method void ArrayList(int)>
	//    9   15:astore_3        
		int j = aaction.length;
	//   10   16:aload_0         
	//   11   17:arraylength     
	//   12   18:istore_2        
		for(int i = 0; i < j; i++)
	//*  13   19:iconst_0        
	//*  14   20:istore_1        
	//*  15   21:iload_1         
	//*  16   22:iload_2         
	//*  17   23:icmpge          44
			arraylist.add(((Object) (getActionFromActionCompat(aaction[i]))));
	//   18   26:aload_3         
	//   19   27:aload_0         
	//   20   28:iload_1         
	//   21   29:aaload          
	//   22   30:invokestatic    #149 <Method android.app.Notification$Action getActionFromActionCompat(NotificationCompatBase$Action)>
	//   23   33:invokevirtual   #153 <Method boolean ArrayList.add(Object)>
	//   24   36:pop             

	//   25   37:iload_1         
	//   26   38:iconst_1        
	//   27   39:iadd            
	//   28   40:istore_1        
	//*  29   41:goto            21
		return arraylist;
	//   30   44:aload_3         
	//   31   45:areturn         
	}
}
