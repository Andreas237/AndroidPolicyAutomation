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
//			RemoteInputCompatApi20, NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions

class NotificationCompatApi20
{
	public static class Builder
		implements NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions
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


	NotificationCompatApi20()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static void addAction(android.app.Notification.Builder builder, NotificationCompatBase.Action action)
	{
		android.app.Notification.Action.Builder builder1 = new android.app.Notification.Action.Builder(action.getIcon(), action.getTitle(), action.getActionIntent());
	//    0    0:new             #19  <Class android.app.Notification$Action$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #25  <Method int NotificationCompatBase$Action.getIcon()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #29  <Method CharSequence NotificationCompatBase$Action.getTitle()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #33  <Method PendingIntent NotificationCompatBase$Action.getActionIntent()>
	//    8   16:invokespecial   #36  <Method void android.app.Notification$Action$Builder(int, CharSequence, PendingIntent)>
	//    9   19:astore          5
		if(action.getRemoteInputs() != null)
	//*  10   21:aload_1         
	//*  11   22:invokevirtual   #40  <Method RemoteInputCompatBase$RemoteInput[] NotificationCompatBase$Action.getRemoteInputs()>
	//*  12   25:ifnull          65
		{
			android.app.RemoteInput aremoteinput[] = RemoteInputCompatApi20.fromCompat(action.getRemoteInputs());
	//   13   28:aload_1         
	//   14   29:invokevirtual   #40  <Method RemoteInputCompatBase$RemoteInput[] NotificationCompatBase$Action.getRemoteInputs()>
	//   15   32:invokestatic    #46  <Method android.app.RemoteInput[] RemoteInputCompatApi20.fromCompat(RemoteInputCompatBase$RemoteInput[])>
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
	//   29   54:invokevirtual   #50  <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.addRemoteInput(android.app.RemoteInput)>
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
	//*  37   66:invokevirtual   #54  <Method Bundle NotificationCompatBase$Action.getExtras()>
	//*  38   69:ifnull          115
			bundle = new Bundle(action.getExtras());
	//   39   72:new             #56  <Class Bundle>
	//   40   75:dup             
	//   41   76:aload_1         
	//   42   77:invokevirtual   #54  <Method Bundle NotificationCompatBase$Action.getExtras()>
	//   43   80:invokespecial   #59  <Method void Bundle(Bundle)>
	//   44   83:astore          4
		else
	//*  45   85:aload           4
	//*  46   87:ldc1            #61  <String "android.support.allowGeneratedReplies">
	//*  47   89:aload_1         
	//*  48   90:invokevirtual   #65  <Method boolean NotificationCompatBase$Action.getAllowGeneratedReplies()>
	//*  49   93:invokevirtual   #69  <Method void Bundle.putBoolean(String, boolean)>
	//*  50   96:aload           5
	//*  51   98:aload           4
	//*  52  100:invokevirtual   #73  <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.addExtras(Bundle)>
	//*  53  103:pop             
	//*  54  104:aload_0         
	//*  55  105:aload           5
	//*  56  107:invokevirtual   #77  <Method android.app.Notification$Action android.app.Notification$Action$Builder.build()>
	//*  57  110:invokevirtual   #82  <Method android.app.Notification$Builder android.app.Notification$Builder.addAction(android.app.Notification$Action)>
	//*  58  113:pop             
	//*  59  114:return          
			bundle = new Bundle();
	//   60  115:new             #56  <Class Bundle>
	//   61  118:dup             
	//   62  119:invokespecial   #83  <Method void Bundle()>
	//   63  122:astore          4
		bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
		builder1.addExtras(bundle);
		builder.addAction(builder1.build());
	//*  64  124:goto            85
	}

	public static NotificationCompatBase.Action getAction(Notification notification, int i, NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
	{
		return getActionCompatFromAction(notification.actions[i], factory, factory1);
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field android.app.Notification$Action[] Notification.actions>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokestatic    #95  <Method NotificationCompatBase$Action getActionCompatFromAction(android.app.Notification$Action, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
	//    7   11:areturn         
	}

	private static NotificationCompatBase.Action getActionCompatFromAction(android.app.Notification.Action action, NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
	{
		factory1 = ((RemoteInputCompatBase.RemoteInput.Factory) (RemoteInputCompatApi20.toCompat(action.getRemoteInputs(), factory1)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method android.app.RemoteInput[] android.app.Notification$Action.getRemoteInputs()>
	//    2    4:aload_2         
	//    3    5:invokestatic    #104 <Method RemoteInputCompatBase$RemoteInput[] RemoteInputCompatApi20.toCompat(android.app.RemoteInput[], RemoteInputCompatBase$RemoteInput$Factory)>
	//    4    8:astore_2        
		boolean flag = action.getExtras().getBoolean("android.support.allowGeneratedReplies");
	//    5    9:aload_0         
	//    6   10:invokevirtual   #105 <Method Bundle android.app.Notification$Action.getExtras()>
	//    7   13:ldc1            #61  <String "android.support.allowGeneratedReplies">
	//    8   15:invokevirtual   #109 <Method boolean Bundle.getBoolean(String)>
	//    9   18:istore_3        
		return factory.build(action.icon, action.title, action.actionIntent, action.getExtras(), ((RemoteInputCompatBase.RemoteInput []) (factory1)), ((RemoteInputCompatBase.RemoteInput []) (null)), flag);
	//   10   19:aload_1         
	//   11   20:aload_0         
	//   12   21:getfield        #113 <Field int android.app.Notification$Action.icon>
	//   13   24:aload_0         
	//   14   25:getfield        #117 <Field CharSequence android.app.Notification$Action.title>
	//   15   28:aload_0         
	//   16   29:getfield        #121 <Field PendingIntent android.app.Notification$Action.actionIntent>
	//   17   32:aload_0         
	//   18   33:invokevirtual   #105 <Method Bundle android.app.Notification$Action.getExtras()>
	//   19   36:aload_2         
	//   20   37:aconst_null     
	//   21   38:iload_3         
	//   22   39:invokeinterface #126 <Method NotificationCompatBase$Action NotificationCompatBase$Action$Factory.build(int, CharSequence, PendingIntent, Bundle, RemoteInputCompatBase$RemoteInput[], RemoteInputCompatBase$RemoteInput[], boolean)>
	//   23   44:areturn         
	}

	private static android.app.Notification.Action getActionFromActionCompat(NotificationCompatBase.Action action)
	{
		android.app.Notification.Action.Builder builder = new android.app.Notification.Action.Builder(action.getIcon(), action.getTitle(), action.getActionIntent());
	//    0    0:new             #19  <Class android.app.Notification$Action$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #25  <Method int NotificationCompatBase$Action.getIcon()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #29  <Method CharSequence NotificationCompatBase$Action.getTitle()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #33  <Method PendingIntent NotificationCompatBase$Action.getActionIntent()>
	//    8   16:invokespecial   #36  <Method void android.app.Notification$Action$Builder(int, CharSequence, PendingIntent)>
	//    9   19:astore          4
		Bundle bundle;
		if(action.getExtras() != null)
	//*  10   21:aload_0         
	//*  11   22:invokevirtual   #54  <Method Bundle NotificationCompatBase$Action.getExtras()>
	//*  12   25:ifnull          97
			bundle = new Bundle(action.getExtras());
	//   13   28:new             #56  <Class Bundle>
	//   14   31:dup             
	//   15   32:aload_0         
	//   16   33:invokevirtual   #54  <Method Bundle NotificationCompatBase$Action.getExtras()>
	//   17   36:invokespecial   #59  <Method void Bundle(Bundle)>
	//   18   39:astore_3        
		else
	//*  19   40:aload_3         
	//*  20   41:ldc1            #61  <String "android.support.allowGeneratedReplies">
	//*  21   43:aload_0         
	//*  22   44:invokevirtual   #65  <Method boolean NotificationCompatBase$Action.getAllowGeneratedReplies()>
	//*  23   47:invokevirtual   #69  <Method void Bundle.putBoolean(String, boolean)>
	//*  24   50:aload           4
	//*  25   52:aload_3         
	//*  26   53:invokevirtual   #73  <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.addExtras(Bundle)>
	//*  27   56:pop             
	//*  28   57:aload_0         
	//*  29   58:invokevirtual   #40  <Method RemoteInputCompatBase$RemoteInput[] NotificationCompatBase$Action.getRemoteInputs()>
	//*  30   61:astore_0        
	//*  31   62:aload_0         
	//*  32   63:ifnull          108
	//*  33   66:aload_0         
	//*  34   67:invokestatic    #46  <Method android.app.RemoteInput[] RemoteInputCompatApi20.fromCompat(RemoteInputCompatBase$RemoteInput[])>
	//*  35   70:astore_0        
	//*  36   71:aload_0         
	//*  37   72:arraylength     
	//*  38   73:istore_2        
	//*  39   74:iconst_0        
	//*  40   75:istore_1        
	//*  41   76:iload_1         
	//*  42   77:iload_2         
	//*  43   78:icmpge          108
	//*  44   81:aload           4
	//*  45   83:aload_0         
	//*  46   84:iload_1         
	//*  47   85:aaload          
	//*  48   86:invokevirtual   #50  <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.addRemoteInput(android.app.RemoteInput)>
	//*  49   89:pop             
	//*  50   90:iload_1         
	//*  51   91:iconst_1        
	//*  52   92:iadd            
	//*  53   93:istore_1        
	//*  54   94:goto            76
			bundle = new Bundle();
	//   55   97:new             #56  <Class Bundle>
	//   56  100:dup             
	//   57  101:invokespecial   #83  <Method void Bundle()>
	//   58  104:astore_3        
		bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
		builder.addExtras(bundle);
		action = ((NotificationCompatBase.Action) (action.getRemoteInputs()));
		if(action != null)
		{
			action = ((NotificationCompatBase.Action) (RemoteInputCompatApi20.fromCompat(((RemoteInputCompatBase.RemoteInput []) (action)))));
			int j = action.length;
			for(int i = 0; i < j; i++)
				builder.addRemoteInput(((android.app.RemoteInput) (action[i])));

		}
	//*  59  105:goto            40
		return builder.build();
	//   60  108:aload           4
	//   61  110:invokevirtual   #77  <Method android.app.Notification$Action android.app.Notification$Action$Builder.build()>
	//   62  113:areturn         
	}

	public static NotificationCompatBase.Action[] getActionsFromParcelableArrayList(ArrayList arraylist, NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
	{
		if(arraylist != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       10
_L1:
		NotificationCompatBase.Action aaction[] = null;
	//    2    4:aconst_null     
	//    3    5:astore          4
_L4:
		return aaction;
	//    4    7:aload           4
	//    5    9:areturn         
_L2:
		NotificationCompatBase.Action aaction1[] = factory.newArray(arraylist.size());
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #135 <Method int ArrayList.size()>
	//    9   15:invokeinterface #139 <Method NotificationCompatBase$Action[] NotificationCompatBase$Action$Factory.newArray(int)>
	//   10   20:astore          5
		int i = 0;
	//   11   22:iconst_0        
	//   12   23:istore_3        
		do
		{
			aaction = aaction1;
	//   13   24:aload           5
	//   14   26:astore          4
			if(i >= aaction1.length)
				continue;
	//   15   28:iload_3         
	//   16   29:aload           5
	//   17   31:arraylength     
	//   18   32:icmpge          7
			aaction1[i] = getActionCompatFromAction((android.app.Notification.Action)arraylist.get(i), factory, factory1);
	//   19   35:aload           5
	//   20   37:iload_3         
	//   21   38:aload_0         
	//   22   39:iload_3         
	//   23   40:invokevirtual   #143 <Method Object ArrayList.get(int)>
	//   24   43:checkcast       #97  <Class android.app.Notification$Action>
	//   25   46:aload_1         
	//   26   47:aload_2         
	//   27   48:invokestatic    #95  <Method NotificationCompatBase$Action getActionCompatFromAction(android.app.Notification$Action, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
	//   28   51:aastore         
			i++;
	//   29   52:iload_3         
	//   30   53:iconst_1        
	//   31   54:iadd            
	//   32   55:istore_3        
		} while(true);
	//   33   56:goto            24
		if(true) goto _L4; else goto _L3
_L3:
	}

	public static ArrayList getParcelableArrayListForActions(NotificationCompatBase.Action aaction[])
	{
		if(aaction != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       8
_L1:
		ArrayList arraylist = null;
	//    2    4:aconst_null     
	//    3    5:astore_3        
_L4:
		return arraylist;
	//    4    6:aload_3         
	//    5    7:areturn         
_L2:
		ArrayList arraylist1 = new ArrayList(aaction.length);
	//    6    8:new             #132 <Class ArrayList>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:arraylength     
	//   10   14:invokespecial   #150 <Method void ArrayList(int)>
	//   11   17:astore          4
		int j = aaction.length;
	//   12   19:aload_0         
	//   13   20:arraylength     
	//   14   21:istore_2        
		int i = 0;
	//   15   22:iconst_0        
	//   16   23:istore_1        
		do
		{
			arraylist = arraylist1;
	//   17   24:aload           4
	//   18   26:astore_3        
			if(i >= j)
				continue;
	//   19   27:iload_1         
	//   20   28:iload_2         
	//   21   29:icmpge          6
			arraylist1.add(((Object) (getActionFromActionCompat(aaction[i]))));
	//   22   32:aload           4
	//   23   34:aload_0         
	//   24   35:iload_1         
	//   25   36:aaload          
	//   26   37:invokestatic    #152 <Method android.app.Notification$Action getActionFromActionCompat(NotificationCompatBase$Action)>
	//   27   40:invokevirtual   #156 <Method boolean ArrayList.add(Object)>
	//   28   43:pop             
			i++;
	//   29   44:iload_1         
	//   30   45:iconst_1        
	//   31   46:iadd            
	//   32   47:istore_1        
		} while(true);
	//   33   48:goto            24
		if(true) goto _L4; else goto _L3
_L3:
	}
}
