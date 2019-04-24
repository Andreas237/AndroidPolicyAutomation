// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.*;

// Referenced classes of package android.support.v4.app:
//			RemoteInputCompatApi20, NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions

class NotificationCompatApi24
{
	public static class Builder
		implements NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions
	{

		private void removeSoundAndVibration(Notification notification)
		{
			notification.sound = null;
		//    0    0:aload_1         
		//    1    1:aconst_null     
		//    2    2:putfield        #69  <Field Uri Notification.sound>
			notification.vibrate = null;
		//    3    5:aload_1         
		//    4    6:aconst_null     
		//    5    7:putfield        #80  <Field long[] Notification.vibrate>
			notification.defaults = notification.defaults & -2;
		//    6   10:aload_1         
		//    7   11:aload_1         
		//    8   12:getfield        #112 <Field int Notification.defaults>
		//    9   15:bipush          -2
		//   10   17:iand            
		//   11   18:putfield        #112 <Field int Notification.defaults>
			notification.defaults = notification.defaults & -3;
		//   12   21:aload_1         
		//   13   22:aload_1         
		//   14   23:getfield        #112 <Field int Notification.defaults>
		//   15   26:bipush          -3
		//   16   28:iand            
		//   17   29:putfield        #112 <Field int Notification.defaults>
		//   18   32:return          
		}

		public void addAction(NotificationCompatBase.Action action)
		{
			NotificationCompatApi24.addAction(b, action);
		//    0    0:aload_0         
		//    1    1:getfield        #197 <Field android.app.Notification$Builder b>
		//    2    4:aload_1         
		//    3    5:invokestatic    #239 <Method void NotificationCompatApi24.addAction(android.app.Notification$Builder, NotificationCompatBase$Action)>
		//    4    8:return          
		}

		public Notification build()
		{
			Notification notification = b.build();
		//    0    0:aload_0         
		//    1    1:getfield        #197 <Field android.app.Notification$Builder b>
		//    2    4:invokevirtual   #243 <Method Notification android.app.Notification$Builder.build()>
		//    3    7:astore_1        
			if(mGroupAlertBehavior != 0)
		//*   4    8:aload_0         
		//*   5    9:getfield        #229 <Field int mGroupAlertBehavior>
		//*   6   12:ifeq            77
			{
				if(notification.getGroup() != null && (notification.flags & 0x200) != 0 && mGroupAlertBehavior == 2)
		//*   7   15:aload_1         
		//*   8   16:invokevirtual   #247 <Method String Notification.getGroup()>
		//*   9   19:ifnull          46
		//*  10   22:aload_1         
		//*  11   23:getfield        #100 <Field int Notification.flags>
		//*  12   26:sipush          512
		//*  13   29:iand            
		//*  14   30:ifeq            46
		//*  15   33:aload_0         
		//*  16   34:getfield        #229 <Field int mGroupAlertBehavior>
		//*  17   37:iconst_2        
		//*  18   38:icmpne          46
					removeSoundAndVibration(notification);
		//   19   41:aload_0         
		//   20   42:aload_1         
		//   21   43:invokespecial   #249 <Method void removeSoundAndVibration(Notification)>
				if(notification.getGroup() != null && (notification.flags & 0x200) == 0 && mGroupAlertBehavior == 1)
		//*  22   46:aload_1         
		//*  23   47:invokevirtual   #247 <Method String Notification.getGroup()>
		//*  24   50:ifnull          77
		//*  25   53:aload_1         
		//*  26   54:getfield        #100 <Field int Notification.flags>
		//*  27   57:sipush          512
		//*  28   60:iand            
		//*  29   61:ifne            77
		//*  30   64:aload_0         
		//*  31   65:getfield        #229 <Field int mGroupAlertBehavior>
		//*  32   68:iconst_1        
		//*  33   69:icmpne          77
					removeSoundAndVibration(notification);
		//   34   72:aload_0         
		//   35   73:aload_1         
		//   36   74:invokespecial   #249 <Method void removeSoundAndVibration(Notification)>
			}
			return notification;
		//   37   77:aload_1         
		//   38   78:areturn         
		}

		public android.app.Notification.Builder getBuilder()
		{
			return b;
		//    0    0:aload_0         
		//    1    1:getfield        #197 <Field android.app.Notification$Builder b>
		//    2    4:areturn         
		}

		private android.app.Notification.Builder b;
		private int mGroupAlertBehavior;

		public Builder(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
				PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
				boolean flag2, int l, CharSequence charsequence3, boolean flag3, String s, ArrayList arraylist, Bundle bundle, 
				int i1, int j1, Notification notification1, String s1, boolean flag4, String s2, CharSequence acharsequence[], 
				RemoteViews remoteviews1, RemoteViews remoteviews2, RemoteViews remoteviews3, int k1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			context = ((Context) ((new android.app.Notification.Builder(context)).setWhen(notification.when).setShowWhen(flag1).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS)));
		//    2    4:new             #22  <Class android.app.Notification$Builder>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:invokespecial   #25  <Method void android.app.Notification$Builder(Context)>
		//    6   12:aload_2         
		//    7   13:getfield        #31  <Field long Notification.when>
		//    8   16:invokevirtual   #35  <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
		//    9   19:iload           14
		//   10   21:invokevirtual   #39  <Method android.app.Notification$Builder android.app.Notification$Builder.setShowWhen(boolean)>
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
		//   24   52:getfield        #69  <Field Uri Notification.sound>
		//   25   55:aload_2         
		//   26   56:getfield        #72  <Field int Notification.audioStreamType>
		//   27   59:invokevirtual   #76  <Method android.app.Notification$Builder android.app.Notification$Builder.setSound(Uri, int)>
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
		//*  43   91:ifeq            369
				flag1 = true;
		//   44   94:iconst_1        
		//   45   95:istore          14
			else
		//*  46   97:aload_1         
		//*  47   98:iload           14
		//*  48  100:invokevirtual   #103 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
		//*  49  103:astore_1        
		//*  50  104:aload_2         
		//*  51  105:getfield        #100 <Field int Notification.flags>
		//*  52  108:bipush          8
		//*  53  110:iand            
		//*  54  111:ifeq            375
		//*  55  114:iconst_1        
		//*  56  115:istore          14
		//*  57  117:aload_1         
		//*  58  118:iload           14
		//*  59  120:invokevirtual   #106 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
		//*  60  123:astore_1        
		//*  61  124:aload_2         
		//*  62  125:getfield        #100 <Field int Notification.flags>
		//*  63  128:bipush          16
		//*  64  130:iand            
		//*  65  131:ifeq            381
		//*  66  134:iconst_1        
		//*  67  135:istore          14
		//*  68  137:aload_1         
		//*  69  138:iload           14
		//*  70  140:invokevirtual   #109 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
		//*  71  143:aload_2         
		//*  72  144:getfield        #112 <Field int Notification.defaults>
		//*  73  147:invokevirtual   #116 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
		//*  74  150:aload_3         
		//*  75  151:invokevirtual   #120 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
		//*  76  154:aload           4
		//*  77  156:invokevirtual   #123 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
		//*  78  159:aload           17
		//*  79  161:invokevirtual   #126 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
		//*  80  164:aload           5
		//*  81  166:invokevirtual   #129 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
		//*  82  169:aload           8
		//*  83  171:invokevirtual   #133 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
		//*  84  174:aload_2         
		//*  85  175:getfield        #137 <Field PendingIntent Notification.deleteIntent>
		//*  86  178:invokevirtual   #140 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
		//*  87  181:astore_1        
		//*  88  182:aload_2         
		//*  89  183:getfield        #100 <Field int Notification.flags>
		//*  90  186:sipush          128
		//*  91  189:iand            
		//*  92  190:ifeq            387
		//*  93  193:iconst_1        
		//*  94  194:istore          14
		//*  95  196:aload_0         
		//*  96  197:aload_1         
		//*  97  198:aload           9
		//*  98  200:iload           14
		//*  99  202:invokevirtual   #144 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
		//* 100  205:aload           10
		//* 101  207:invokevirtual   #148 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
		//* 102  210:iload           7
		//* 103  212:invokevirtual   #151 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
		//* 104  215:iload           15
		//* 105  217:invokevirtual   #154 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
		//* 106  220:iload           16
		//* 107  222:invokevirtual   #157 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
		//* 108  225:iload           11
		//* 109  227:iload           12
		//* 110  229:iload           13
		//* 111  231:invokevirtual   #161 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
		//* 112  234:iload           18
		//* 113  236:invokevirtual   #164 <Method android.app.Notification$Builder android.app.Notification$Builder.setLocalOnly(boolean)>
		//* 114  239:aload           21
		//* 115  241:invokevirtual   #168 <Method android.app.Notification$Builder android.app.Notification$Builder.setExtras(Bundle)>
		//* 116  244:aload           25
		//* 117  246:invokevirtual   #172 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroup(String)>
		//* 118  249:iload           26
		//* 119  251:invokevirtual   #175 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroupSummary(boolean)>
		//* 120  254:aload           27
		//* 121  256:invokevirtual   #178 <Method android.app.Notification$Builder android.app.Notification$Builder.setSortKey(String)>
		//* 122  259:aload           19
		//* 123  261:invokevirtual   #181 <Method android.app.Notification$Builder android.app.Notification$Builder.setCategory(String)>
		//* 124  264:iload           22
		//* 125  266:invokevirtual   #184 <Method android.app.Notification$Builder android.app.Notification$Builder.setColor(int)>
		//* 126  269:iload           23
		//* 127  271:invokevirtual   #187 <Method android.app.Notification$Builder android.app.Notification$Builder.setVisibility(int)>
		//* 128  274:aload           24
		//* 129  276:invokevirtual   #191 <Method android.app.Notification$Builder android.app.Notification$Builder.setPublicVersion(Notification)>
		//* 130  279:aload           28
		//* 131  281:invokevirtual   #195 <Method android.app.Notification$Builder android.app.Notification$Builder.setRemoteInputHistory(CharSequence[])>
		//* 132  284:putfield        #197 <Field android.app.Notification$Builder b>
		//* 133  287:aload           29
		//* 134  289:ifnull          302
		//* 135  292:aload_0         
		//* 136  293:getfield        #197 <Field android.app.Notification$Builder b>
		//* 137  296:aload           29
		//* 138  298:invokevirtual   #200 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomContentView(RemoteViews)>
		//* 139  301:pop             
		//* 140  302:aload           30
		//* 141  304:ifnull          317
		//* 142  307:aload_0         
		//* 143  308:getfield        #197 <Field android.app.Notification$Builder b>
		//* 144  311:aload           30
		//* 145  313:invokevirtual   #203 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomBigContentView(RemoteViews)>
		//* 146  316:pop             
		//* 147  317:aload           31
		//* 148  319:ifnull          332
		//* 149  322:aload_0         
		//* 150  323:getfield        #197 <Field android.app.Notification$Builder b>
		//* 151  326:aload           31
		//* 152  328:invokevirtual   #206 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomHeadsUpContentView(RemoteViews)>
		//* 153  331:pop             
		//* 154  332:aload           20
		//* 155  334:invokevirtual   #212 <Method Iterator ArrayList.iterator()>
		//* 156  337:astore_1        
		//* 157  338:aload_1         
		//* 158  339:invokeinterface #218 <Method boolean Iterator.hasNext()>
		//* 159  344:ifeq            393
		//* 160  347:aload_1         
		//* 161  348:invokeinterface #222 <Method Object Iterator.next()>
		//* 162  353:checkcast       #224 <Class String>
		//* 163  356:astore_2        
		//* 164  357:aload_0         
		//* 165  358:getfield        #197 <Field android.app.Notification$Builder b>
		//* 166  361:aload_2         
		//* 167  362:invokevirtual   #227 <Method android.app.Notification$Builder android.app.Notification$Builder.addPerson(String)>
		//* 168  365:pop             
		//* 169  366:goto            338
				flag1 = false;
		//  170  369:iconst_0        
		//  171  370:istore          14
			context = ((Context) (((android.app.Notification.Builder) (context)).setOngoing(flag1)));
			if((notification.flags & 8) != 0)
				flag1 = true;
			else
		//* 172  372:goto            97
				flag1 = false;
		//  173  375:iconst_0        
		//  174  376:istore          14
			context = ((Context) (((android.app.Notification.Builder) (context)).setOnlyAlertOnce(flag1)));
			if((notification.flags & 0x10) != 0)
				flag1 = true;
			else
		//* 175  378:goto            117
				flag1 = false;
		//  176  381:iconst_0        
		//  177  382:istore          14
			context = ((Context) (((android.app.Notification.Builder) (context)).setAutoCancel(flag1).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setSubText(charsequence3).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent)));
			if((notification.flags & 0x80) != 0)
				flag1 = true;
			else
		//* 178  384:goto            137
				flag1 = false;
		//  179  387:iconst_0        
		//  180  388:istore          14
			b = ((android.app.Notification.Builder) (context)).setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag2).setPriority(l).setProgress(j, k, flag).setLocalOnly(flag3).setExtras(bundle).setGroup(s1).setGroupSummary(flag4).setSortKey(s2).setCategory(s).setColor(i1).setVisibility(j1).setPublicVersion(notification1).setRemoteInputHistory(acharsequence);
			if(remoteviews1 != null)
				b.setCustomContentView(remoteviews1);
			if(remoteviews2 != null)
				b.setCustomBigContentView(remoteviews2);
			if(remoteviews3 != null)
				b.setCustomHeadsUpContentView(remoteviews3);
			for(context = ((Context) (arraylist.iterator())); ((Iterator) (context)).hasNext(); b.addPerson(((String) (notification))))
				notification = ((Notification) ((String)((Iterator) (context)).next()));

		//* 181  390:goto            196
			mGroupAlertBehavior = k1;
		//  182  393:aload_0         
		//  183  394:iload           32
		//  184  396:putfield        #229 <Field int mGroupAlertBehavior>
		//  185  399:return          
		}
	}


	NotificationCompatApi24()
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
	//*  38   69:ifnull          125
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
	//*  51   98:aload_1         
	//*  52   99:invokevirtual   #65  <Method boolean NotificationCompatBase$Action.getAllowGeneratedReplies()>
	//*  53  102:invokevirtual   #73  <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.setAllowGeneratedReplies(boolean)>
	//*  54  105:pop             
	//*  55  106:aload           5
	//*  56  108:aload           4
	//*  57  110:invokevirtual   #77  <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.addExtras(Bundle)>
	//*  58  113:pop             
	//*  59  114:aload_0         
	//*  60  115:aload           5
	//*  61  117:invokevirtual   #81  <Method android.app.Notification$Action android.app.Notification$Action$Builder.build()>
	//*  62  120:invokevirtual   #86  <Method android.app.Notification$Builder android.app.Notification$Builder.addAction(android.app.Notification$Action)>
	//*  63  123:pop             
	//*  64  124:return          
			bundle = new Bundle();
	//   65  125:new             #56  <Class Bundle>
	//   66  128:dup             
	//   67  129:invokespecial   #87  <Method void Bundle()>
	//   68  132:astore          4
		bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
		builder1.setAllowGeneratedReplies(action.getAllowGeneratedReplies());
		builder1.addExtras(bundle);
		builder.addAction(builder1.build());
	//*  69  134:goto            85
	}

	public static void addMessagingStyle(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, CharSequence charsequence, CharSequence charsequence1, List list, List list1, List list2, List list3, List list4)
	{
		charsequence = ((CharSequence) ((new android.app.Notification.MessagingStyle(charsequence)).setConversationTitle(charsequence1)));
	//    0    0:new             #91  <Class android.app.Notification$MessagingStyle>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #94  <Method void android.app.Notification$MessagingStyle(CharSequence)>
	//    4    8:aload_2         
	//    5    9:invokevirtual   #98  <Method android.app.Notification$MessagingStyle android.app.Notification$MessagingStyle.setConversationTitle(CharSequence)>
	//    6   12:astore_1        
		for(int i = 0; i < list.size(); i++)
	//*   7   13:iconst_0        
	//*   8   14:istore          8
	//*   9   16:iload           8
	//*  10   18:aload_3         
	//*  11   19:invokeinterface #103 <Method int List.size()>
	//*  12   24:icmpge          129
		{
			charsequence1 = ((CharSequence) (new android.app.Notification.MessagingStyle.Message((CharSequence)list.get(i), ((Long)list1.get(i)).longValue(), (CharSequence)list2.get(i))));
	//   13   27:new             #105 <Class android.app.Notification$MessagingStyle$Message>
	//   14   30:dup             
	//   15   31:aload_3         
	//   16   32:iload           8
	//   17   34:invokeinterface #109 <Method Object List.get(int)>
	//   18   39:checkcast       #111 <Class CharSequence>
	//   19   42:aload           4
	//   20   44:iload           8
	//   21   46:invokeinterface #109 <Method Object List.get(int)>
	//   22   51:checkcast       #113 <Class Long>
	//   23   54:invokevirtual   #117 <Method long Long.longValue()>
	//   24   57:aload           5
	//   25   59:iload           8
	//   26   61:invokeinterface #109 <Method Object List.get(int)>
	//   27   66:checkcast       #111 <Class CharSequence>
	//   28   69:invokespecial   #120 <Method void android.app.Notification$MessagingStyle$Message(CharSequence, long, CharSequence)>
	//   29   72:astore_2        
			if(list3.get(i) != null)
	//*  30   73:aload           6
	//*  31   75:iload           8
	//*  32   77:invokeinterface #109 <Method Object List.get(int)>
	//*  33   82:ifnull          114
				((android.app.Notification.MessagingStyle.Message) (charsequence1)).setData((String)list3.get(i), (Uri)list4.get(i));
	//   34   85:aload_2         
	//   35   86:aload           6
	//   36   88:iload           8
	//   37   90:invokeinterface #109 <Method Object List.get(int)>
	//   38   95:checkcast       #122 <Class String>
	//   39   98:aload           7
	//   40  100:iload           8
	//   41  102:invokeinterface #109 <Method Object List.get(int)>
	//   42  107:checkcast       #124 <Class Uri>
	//   43  110:invokevirtual   #128 <Method android.app.Notification$MessagingStyle$Message android.app.Notification$MessagingStyle$Message.setData(String, Uri)>
	//   44  113:pop             
			((android.app.Notification.MessagingStyle) (charsequence)).addMessage(((android.app.Notification.MessagingStyle.Message) (charsequence1)));
	//   45  114:aload_1         
	//   46  115:aload_2         
	//   47  116:invokevirtual   #132 <Method android.app.Notification$MessagingStyle android.app.Notification$MessagingStyle.addMessage(android.app.Notification$MessagingStyle$Message)>
	//   48  119:pop             
		}

	//   49  120:iload           8
	//   50  122:iconst_1        
	//   51  123:iadd            
	//   52  124:istore          8
	//*  53  126:goto            16
		((android.app.Notification.MessagingStyle) (charsequence)).setBuilder(notificationbuilderwithbuilderaccessor.getBuilder());
	//   54  129:aload_1         
	//   55  130:aload_0         
	//   56  131:invokeinterface #138 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//   57  136:invokevirtual   #142 <Method void android.app.Notification$MessagingStyle.setBuilder(android.app.Notification$Builder)>
	//   58  139:return          
	}

	public static NotificationCompatBase.Action getAction(Notification notification, int i, NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
	{
		return getActionCompatFromAction(notification.actions[i], factory, factory1);
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field android.app.Notification$Action[] Notification.actions>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokestatic    #156 <Method NotificationCompatBase$Action getActionCompatFromAction(android.app.Notification$Action, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
	//    7   11:areturn         
	}

	private static NotificationCompatBase.Action getActionCompatFromAction(android.app.Notification.Action action, NotificationCompatBase.Action.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
	{
		factory1 = ((RemoteInputCompatBase.RemoteInput.Factory) (RemoteInputCompatApi20.toCompat(action.getRemoteInputs(), factory1)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #161 <Method android.app.RemoteInput[] android.app.Notification$Action.getRemoteInputs()>
	//    2    4:aload_2         
	//    3    5:invokestatic    #165 <Method RemoteInputCompatBase$RemoteInput[] RemoteInputCompatApi20.toCompat(android.app.RemoteInput[], RemoteInputCompatBase$RemoteInput$Factory)>
	//    4    8:astore_2        
		boolean flag;
		if(action.getExtras().getBoolean("android.support.allowGeneratedReplies") || action.getAllowGeneratedReplies())
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #166 <Method Bundle android.app.Notification$Action.getExtras()>
	//*   7   13:ldc1            #61  <String "android.support.allowGeneratedReplies">
	//*   8   15:invokevirtual   #170 <Method boolean Bundle.getBoolean(String)>
	//*   9   18:ifne            28
	//*  10   21:aload_0         
	//*  11   22:invokevirtual   #171 <Method boolean android.app.Notification$Action.getAllowGeneratedReplies()>
	//*  12   25:ifeq            56
			flag = true;
	//   13   28:iconst_1        
	//   14   29:istore_3        
		else
	//*  15   30:aload_1         
	//*  16   31:aload_0         
	//*  17   32:getfield        #175 <Field int android.app.Notification$Action.icon>
	//*  18   35:aload_0         
	//*  19   36:getfield        #179 <Field CharSequence android.app.Notification$Action.title>
	//*  20   39:aload_0         
	//*  21   40:getfield        #183 <Field PendingIntent android.app.Notification$Action.actionIntent>
	//*  22   43:aload_0         
	//*  23   44:invokevirtual   #166 <Method Bundle android.app.Notification$Action.getExtras()>
	//*  24   47:aload_2         
	//*  25   48:aconst_null     
	//*  26   49:iload_3         
	//*  27   50:invokeinterface #188 <Method NotificationCompatBase$Action NotificationCompatBase$Action$Factory.build(int, CharSequence, PendingIntent, Bundle, RemoteInputCompatBase$RemoteInput[], RemoteInputCompatBase$RemoteInput[], boolean)>
	//*  28   55:areturn         
			flag = false;
	//   29   56:iconst_0        
	//   30   57:istore_3        
		return factory.build(action.icon, action.title, action.actionIntent, action.getExtras(), ((RemoteInputCompatBase.RemoteInput []) (factory1)), ((RemoteInputCompatBase.RemoteInput []) (null)), flag);
	//*  31   58:goto            30
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
	//*  12   25:ifnull          107
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
	//*  25   52:aload_0         
	//*  26   53:invokevirtual   #65  <Method boolean NotificationCompatBase$Action.getAllowGeneratedReplies()>
	//*  27   56:invokevirtual   #73  <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.setAllowGeneratedReplies(boolean)>
	//*  28   59:pop             
	//*  29   60:aload           4
	//*  30   62:aload_3         
	//*  31   63:invokevirtual   #77  <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.addExtras(Bundle)>
	//*  32   66:pop             
	//*  33   67:aload_0         
	//*  34   68:invokevirtual   #40  <Method RemoteInputCompatBase$RemoteInput[] NotificationCompatBase$Action.getRemoteInputs()>
	//*  35   71:astore_0        
	//*  36   72:aload_0         
	//*  37   73:ifnull          118
	//*  38   76:aload_0         
	//*  39   77:invokestatic    #46  <Method android.app.RemoteInput[] RemoteInputCompatApi20.fromCompat(RemoteInputCompatBase$RemoteInput[])>
	//*  40   80:astore_0        
	//*  41   81:aload_0         
	//*  42   82:arraylength     
	//*  43   83:istore_2        
	//*  44   84:iconst_0        
	//*  45   85:istore_1        
	//*  46   86:iload_1         
	//*  47   87:iload_2         
	//*  48   88:icmpge          118
	//*  49   91:aload           4
	//*  50   93:aload_0         
	//*  51   94:iload_1         
	//*  52   95:aaload          
	//*  53   96:invokevirtual   #50  <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.addRemoteInput(android.app.RemoteInput)>
	//*  54   99:pop             
	//*  55  100:iload_1         
	//*  56  101:iconst_1        
	//*  57  102:iadd            
	//*  58  103:istore_1        
	//*  59  104:goto            86
			bundle = new Bundle();
	//   60  107:new             #56  <Class Bundle>
	//   61  110:dup             
	//   62  111:invokespecial   #87  <Method void Bundle()>
	//   63  114:astore_3        
		bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
		builder.setAllowGeneratedReplies(action.getAllowGeneratedReplies());
		builder.addExtras(bundle);
		action = ((NotificationCompatBase.Action) (action.getRemoteInputs()));
		if(action != null)
		{
			action = ((NotificationCompatBase.Action) (RemoteInputCompatApi20.fromCompat(((RemoteInputCompatBase.RemoteInput []) (action)))));
			int j = action.length;
			for(int i = 0; i < j; i++)
				builder.addRemoteInput(((android.app.RemoteInput) (action[i])));

		}
	//*  64  115:goto            40
		return builder.build();
	//   65  118:aload           4
	//   66  120:invokevirtual   #81  <Method android.app.Notification$Action android.app.Notification$Action$Builder.build()>
	//   67  123:areturn         
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
	//    8   12:invokevirtual   #195 <Method int ArrayList.size()>
	//    9   15:invokeinterface #199 <Method NotificationCompatBase$Action[] NotificationCompatBase$Action$Factory.newArray(int)>
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
	//   23   40:invokevirtual   #200 <Method Object ArrayList.get(int)>
	//   24   43:checkcast       #158 <Class android.app.Notification$Action>
	//   25   46:aload_1         
	//   26   47:aload_2         
	//   27   48:invokestatic    #156 <Method NotificationCompatBase$Action getActionCompatFromAction(android.app.Notification$Action, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
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
	//    6    8:new             #194 <Class ArrayList>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:arraylength     
	//   10   14:invokespecial   #206 <Method void ArrayList(int)>
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
	//   26   37:invokestatic    #208 <Method android.app.Notification$Action getActionFromActionCompat(NotificationCompatBase$Action)>
	//   27   40:invokevirtual   #212 <Method boolean ArrayList.add(Object)>
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
