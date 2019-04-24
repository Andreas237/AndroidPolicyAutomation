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

		public void addAction(NotificationCompatBase.Action action)
		{
			NotificationCompatApi20.addAction(b, action);
		//    0    0:aload_0         
		//    1    1:getfield        #179 <Field android.app.Notification$Builder b>
		//    2    4:aload_1         
		//    3    5:invokestatic    #224 <Method void NotificationCompatApi20.addAction(android.app.Notification$Builder, NotificationCompatBase$Action)>
		//    4    8:return          
		}

		public Notification build()
		{
			b.setExtras(mExtras);
		//    0    0:aload_0         
		//    1    1:getfield        #179 <Field android.app.Notification$Builder b>
		//    2    4:aload_0         
		//    3    5:getfield        #184 <Field Bundle mExtras>
		//    4    8:invokevirtual   #230 <Method android.app.Notification$Builder android.app.Notification$Builder.setExtras(Bundle)>
		//    5   11:pop             
			Notification notification = b.build();
		//    6   12:aload_0         
		//    7   13:getfield        #179 <Field android.app.Notification$Builder b>
		//    8   16:invokevirtual   #232 <Method Notification android.app.Notification$Builder.build()>
		//    9   19:astore_1        
			if(mContentView != null)
		//*  10   20:aload_0         
		//*  11   21:getfield        #214 <Field RemoteViews mContentView>
		//*  12   24:ifnull          35
				notification.contentView = mContentView;
		//   13   27:aload_1         
		//   14   28:aload_0         
		//   15   29:getfield        #214 <Field RemoteViews mContentView>
		//   16   32:putfield        #56  <Field RemoteViews Notification.contentView>
			if(mBigContentView != null)
		//*  17   35:aload_0         
		//*  18   36:getfield        #216 <Field RemoteViews mBigContentView>
		//*  19   39:ifnull          50
				notification.bigContentView = mBigContentView;
		//   20   42:aload_1         
		//   21   43:aload_0         
		//   22   44:getfield        #216 <Field RemoteViews mBigContentView>
		//   23   47:putfield        #235 <Field RemoteViews Notification.bigContentView>
			return notification;
		//   24   50:aload_1         
		//   25   51:areturn         
		}

		public android.app.Notification.Builder getBuilder()
		{
			return b;
		//    0    0:aload_0         
		//    1    1:getfield        #179 <Field android.app.Notification$Builder b>
		//    2    4:areturn         
		}

		private android.app.Notification.Builder b;
		private RemoteViews mBigContentView;
		private RemoteViews mContentView;
		private Bundle mExtras;

		public Builder(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
				PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
				boolean flag2, int l, CharSequence charsequence3, boolean flag3, ArrayList arraylist, Bundle bundle, String s, 
				boolean flag4, String s1, RemoteViews remoteviews1, RemoteViews remoteviews2)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			context = ((Context) ((new android.app.Notification.Builder(context)).setWhen(notification.when).setShowWhen(flag1).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS)));
		//    2    4:new             #25  <Class android.app.Notification$Builder>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:invokespecial   #28  <Method void android.app.Notification$Builder(Context)>
		//    6   12:aload_2         
		//    7   13:getfield        #34  <Field long Notification.when>
		//    8   16:invokevirtual   #38  <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
		//    9   19:iload           14
		//   10   21:invokevirtual   #42  <Method android.app.Notification$Builder android.app.Notification$Builder.setShowWhen(boolean)>
		//   11   24:aload_2         
		//   12   25:getfield        #46  <Field int Notification.icon>
		//   13   28:aload_2         
		//   14   29:getfield        #49  <Field int Notification.iconLevel>
		//   15   32:invokevirtual   #53  <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int, int)>
		//   16   35:aload_2         
		//   17   36:getfield        #56  <Field RemoteViews Notification.contentView>
		//   18   39:invokevirtual   #60  <Method android.app.Notification$Builder android.app.Notification$Builder.setContent(RemoteViews)>
		//   19   42:aload_2         
		//   20   43:getfield        #64  <Field CharSequence Notification.tickerText>
		//   21   46:aload           6
		//   22   48:invokevirtual   #68  <Method android.app.Notification$Builder android.app.Notification$Builder.setTicker(CharSequence, RemoteViews)>
		//   23   51:aload_2         
		//   24   52:getfield        #72  <Field android.net.Uri Notification.sound>
		//   25   55:aload_2         
		//   26   56:getfield        #75  <Field int Notification.audioStreamType>
		//   27   59:invokevirtual   #79  <Method android.app.Notification$Builder android.app.Notification$Builder.setSound(android.net.Uri, int)>
		//   28   62:aload_2         
		//   29   63:getfield        #83  <Field long[] Notification.vibrate>
		//   30   66:invokevirtual   #87  <Method android.app.Notification$Builder android.app.Notification$Builder.setVibrate(long[])>
		//   31   69:aload_2         
		//   32   70:getfield        #90  <Field int Notification.ledARGB>
		//   33   73:aload_2         
		//   34   74:getfield        #93  <Field int Notification.ledOnMS>
		//   35   77:aload_2         
		//   36   78:getfield        #96  <Field int Notification.ledOffMS>
		//   37   81:invokevirtual   #100 <Method android.app.Notification$Builder android.app.Notification$Builder.setLights(int, int, int)>
		//   38   84:astore_1        
			if((notification.flags & 2) != 0)
		//*  39   85:aload_2         
		//*  40   86:getfield        #103 <Field int Notification.flags>
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
			context = ((Context) (((android.app.Notification.Builder) (context)).setOngoing(flag1)));
		//   49  103:aload_1         
		//   50  104:iload           14
		//   51  106:invokevirtual   #106 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
		//   52  109:astore_1        
			if((notification.flags & 8) != 0)
		//*  53  110:aload_2         
		//*  54  111:getfield        #103 <Field int Notification.flags>
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
			context = ((Context) (((android.app.Notification.Builder) (context)).setOnlyAlertOnce(flag1)));
		//   63  129:aload_1         
		//   64  130:iload           14
		//   65  132:invokevirtual   #109 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
		//   66  135:astore_1        
			if((notification.flags & 0x10) != 0)
		//*  67  136:aload_2         
		//*  68  137:getfield        #103 <Field int Notification.flags>
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
			context = ((Context) (((android.app.Notification.Builder) (context)).setAutoCancel(flag1).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setSubText(charsequence3).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent)));
		//   77  155:aload_1         
		//   78  156:iload           14
		//   79  158:invokevirtual   #112 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
		//   80  161:aload_2         
		//   81  162:getfield        #115 <Field int Notification.defaults>
		//   82  165:invokevirtual   #119 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
		//   83  168:aload_3         
		//   84  169:invokevirtual   #123 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
		//   85  172:aload           4
		//   86  174:invokevirtual   #126 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
		//   87  177:aload           17
		//   88  179:invokevirtual   #129 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
		//   89  182:aload           5
		//   90  184:invokevirtual   #132 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
		//   91  187:aload           8
		//   92  189:invokevirtual   #136 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
		//   93  192:aload_2         
		//   94  193:getfield        #140 <Field PendingIntent Notification.deleteIntent>
		//   95  196:invokevirtual   #143 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
		//   96  199:astore_1        
			if((notification.flags & 0x80) != 0)
		//*  97  200:aload_2         
		//*  98  201:getfield        #103 <Field int Notification.flags>
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
			b = ((android.app.Notification.Builder) (context)).setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag2).setPriority(l).setProgress(j, k, flag).setLocalOnly(flag3).setGroup(s).setGroupSummary(flag4).setSortKey(s1);
		//  107  220:aload_0         
		//  108  221:aload_1         
		//  109  222:aload           9
		//  110  224:iload           14
		//  111  226:invokevirtual   #147 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
		//  112  229:aload           10
		//  113  231:invokevirtual   #151 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
		//  114  234:iload           7
		//  115  236:invokevirtual   #154 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
		//  116  239:iload           15
		//  117  241:invokevirtual   #157 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
		//  118  244:iload           16
		//  119  246:invokevirtual   #160 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
		//  120  249:iload           11
		//  121  251:iload           12
		//  122  253:iload           13
		//  123  255:invokevirtual   #164 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
		//  124  258:iload           18
		//  125  260:invokevirtual   #167 <Method android.app.Notification$Builder android.app.Notification$Builder.setLocalOnly(boolean)>
		//  126  263:aload           21
		//  127  265:invokevirtual   #171 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroup(String)>
		//  128  268:iload           22
		//  129  270:invokevirtual   #174 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroupSummary(boolean)>
		//  130  273:aload           23
		//  131  275:invokevirtual   #177 <Method android.app.Notification$Builder android.app.Notification$Builder.setSortKey(String)>
		//  132  278:putfield        #179 <Field android.app.Notification$Builder b>
			mExtras = new Bundle();
		//  133  281:aload_0         
		//  134  282:new             #181 <Class Bundle>
		//  135  285:dup             
		//  136  286:invokespecial   #182 <Method void Bundle()>
		//  137  289:putfield        #184 <Field Bundle mExtras>
			if(bundle != null)
		//* 138  292:aload           20
		//* 139  294:ifnull          306
				mExtras.putAll(bundle);
		//  140  297:aload_0         
		//  141  298:getfield        #184 <Field Bundle mExtras>
		//  142  301:aload           20
		//  143  303:invokevirtual   #188 <Method void Bundle.putAll(Bundle)>
			if(arraylist != null && !arraylist.isEmpty())
		//* 144  306:aload           19
		//* 145  308:ifnull          344
		//* 146  311:aload           19
		//* 147  313:invokevirtual   #194 <Method boolean ArrayList.isEmpty()>
		//* 148  316:ifne            344
				mExtras.putStringArray("android.people", (String[])arraylist.toArray(((Object []) (new String[arraylist.size()]))));
		//  149  319:aload_0         
		//  150  320:getfield        #184 <Field Bundle mExtras>
		//  151  323:ldc1            #196 <String "android.people">
		//  152  325:aload           19
		//  153  327:aload           19
		//  154  329:invokevirtual   #200 <Method int ArrayList.size()>
		//  155  332:anewarray       String[]
		//  156  335:invokevirtual   #206 <Method Object[] ArrayList.toArray(Object[])>
		//  157  338:checkcast       #208 <Class String[]>
		//  158  341:invokevirtual   #212 <Method void Bundle.putStringArray(String, String[])>
			mContentView = remoteviews1;
		//  159  344:aload_0         
		//  160  345:aload           24
		//  161  347:putfield        #214 <Field RemoteViews mContentView>
			mBigContentView = remoteviews2;
		//  162  350:aload_0         
		//  163  351:aload           25
		//  164  353:putfield        #216 <Field RemoteViews mBigContentView>
		//  165  356:return          
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
	//*  38   69:ifnull          88
			bundle = new Bundle(action.getExtras());
	//   39   72:new             #56  <Class Bundle>
	//   40   75:dup             
	//   41   76:aload_1         
	//   42   77:invokevirtual   #54  <Method Bundle NotificationCompatBase$Action.getExtras()>
	//   43   80:invokespecial   #59  <Method void Bundle(Bundle)>
	//   44   83:astore          4
		else
	//*  45   85:goto            97
			bundle = new Bundle();
	//   46   88:new             #56  <Class Bundle>
	//   47   91:dup             
	//   48   92:invokespecial   #60  <Method void Bundle()>
	//   49   95:astore          4
		bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
	//   50   97:aload           4
	//   51   99:ldc1            #62  <String "android.support.allowGeneratedReplies">
	//   52  101:aload_1         
	//   53  102:invokevirtual   #66  <Method boolean NotificationCompatBase$Action.getAllowGeneratedReplies()>
	//   54  105:invokevirtual   #70  <Method void Bundle.putBoolean(String, boolean)>
		builder1.addExtras(bundle);
	//   55  108:aload           5
	//   56  110:aload           4
	//   57  112:invokevirtual   #74  <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.addExtras(Bundle)>
	//   58  115:pop             
		builder.addAction(builder1.build());
	//   59  116:aload_0         
	//   60  117:aload           5
	//   61  119:invokevirtual   #78  <Method android.app.Notification$Action android.app.Notification$Action$Builder.build()>
	//   62  122:invokevirtual   #83  <Method android.app.Notification$Builder android.app.Notification$Builder.addAction(android.app.Notification$Action)>
	//   63  125:pop             
	//   64  126:return          
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
	//    7   13:ldc1            #62  <String "android.support.allowGeneratedReplies">
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
	//*  12   25:ifnull          43
			bundle = new Bundle(action.getExtras());
	//   13   28:new             #56  <Class Bundle>
	//   14   31:dup             
	//   15   32:aload_0         
	//   16   33:invokevirtual   #54  <Method Bundle NotificationCompatBase$Action.getExtras()>
	//   17   36:invokespecial   #59  <Method void Bundle(Bundle)>
	//   18   39:astore_3        
		else
	//*  19   40:goto            51
			bundle = new Bundle();
	//   20   43:new             #56  <Class Bundle>
	//   21   46:dup             
	//   22   47:invokespecial   #60  <Method void Bundle()>
	//   23   50:astore_3        
		bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
	//   24   51:aload_3         
	//   25   52:ldc1            #62  <String "android.support.allowGeneratedReplies">
	//   26   54:aload_0         
	//   27   55:invokevirtual   #66  <Method boolean NotificationCompatBase$Action.getAllowGeneratedReplies()>
	//   28   58:invokevirtual   #70  <Method void Bundle.putBoolean(String, boolean)>
		builder.addExtras(bundle);
	//   29   61:aload           4
	//   30   63:aload_3         
	//   31   64:invokevirtual   #74  <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.addExtras(Bundle)>
	//   32   67:pop             
		action = ((NotificationCompatBase.Action) (action.getRemoteInputs()));
	//   33   68:aload_0         
	//   34   69:invokevirtual   #40  <Method RemoteInputCompatBase$RemoteInput[] NotificationCompatBase$Action.getRemoteInputs()>
	//   35   72:astore_0        
		if(action != null)
	//*  36   73:aload_0         
	//*  37   74:ifnull          108
		{
			action = ((NotificationCompatBase.Action) (RemoteInputCompatApi20.fromCompat(((RemoteInputCompatBase.RemoteInput []) (action)))));
	//   38   77:aload_0         
	//   39   78:invokestatic    #46  <Method android.app.RemoteInput[] RemoteInputCompatApi20.fromCompat(RemoteInputCompatBase$RemoteInput[])>
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
	//   53   97:invokevirtual   #50  <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.addRemoteInput(android.app.RemoteInput)>
	//   54  100:pop             

	//   55  101:iload_1         
	//   56  102:iconst_1        
	//   57  103:iadd            
	//   58  104:istore_1        
		}
	//*  59  105:goto            87
		return builder.build();
	//   60  108:aload           4
	//   61  110:invokevirtual   #78  <Method android.app.Notification$Action android.app.Notification$Action$Builder.build()>
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
	//    6    8:invokevirtual   #135 <Method int ArrayList.size()>
	//    7   11:invokeinterface #139 <Method NotificationCompatBase$Action[] NotificationCompatBase$Action$Factory.newArray(int)>
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
	//   19   32:invokevirtual   #143 <Method Object ArrayList.get(int)>
	//   20   35:checkcast       #97  <Class android.app.Notification$Action>
	//   21   38:aload_1         
	//   22   39:aload_2         
	//   23   40:invokestatic    #95  <Method NotificationCompatBase$Action getActionCompatFromAction(android.app.Notification$Action, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
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

	public static String getGroup(Notification notification)
	{
		return notification.getGroup();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #150 <Method String Notification.getGroup()>
	//    2    4:areturn         
	}

	public static boolean getLocalOnly(Notification notification)
	{
		return (notification.flags & 0x100) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field int Notification.flags>
	//    2    4:sipush          256
	//    3    7:iand            
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
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
	//    4    6:new             #132 <Class ArrayList>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:arraylength     
	//    8   12:invokespecial   #160 <Method void ArrayList(int)>
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
	//   22   30:invokestatic    #162 <Method android.app.Notification$Action getActionFromActionCompat(NotificationCompatBase$Action)>
	//   23   33:invokevirtual   #166 <Method boolean ArrayList.add(Object)>
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

	public static String getSortKey(Notification notification)
	{
		return notification.getSortKey();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #170 <Method String Notification.getSortKey()>
	//    2    4:areturn         
	}

	public static boolean isGroupSummary(Notification notification)
	{
		return (notification.flags & 0x200) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field int Notification.flags>
	//    2    4:sipush          512
	//    3    7:iand            
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}
}
