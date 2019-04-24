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

		public void addAction(NotificationCompatBase.Action action)
		{
			NotificationCompatApi24.addAction(b, action);
		//    0    0:aload_0         
		//    1    1:getfield        #196 <Field android.app.Notification$Builder b>
		//    2    4:aload_1         
		//    3    5:invokestatic    #234 <Method void NotificationCompatApi24.addAction(android.app.Notification$Builder, NotificationCompatBase$Action)>
		//    4    8:return          
		}

		public Notification build()
		{
			return b.build();
		//    0    0:aload_0         
		//    1    1:getfield        #196 <Field android.app.Notification$Builder b>
		//    2    4:invokevirtual   #238 <Method Notification android.app.Notification$Builder.build()>
		//    3    7:areturn         
		}

		public android.app.Notification.Builder getBuilder()
		{
			return b;
		//    0    0:aload_0         
		//    1    1:getfield        #196 <Field android.app.Notification$Builder b>
		//    2    4:areturn         
		}

		private android.app.Notification.Builder b;

		public Builder(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
				PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
				boolean flag2, int l, CharSequence charsequence3, boolean flag3, String s, ArrayList arraylist, Bundle bundle, 
				int i1, int j1, Notification notification1, String s1, boolean flag4, String s2, CharSequence acharsequence[], 
				RemoteViews remoteviews1, RemoteViews remoteviews2, RemoteViews remoteviews3)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			context = ((Context) ((new android.app.Notification.Builder(context)).setWhen(notification.when).setShowWhen(flag1).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS)));
		//    2    4:new             #20  <Class android.app.Notification$Builder>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:invokespecial   #23  <Method void android.app.Notification$Builder(Context)>
		//    6   12:aload_2         
		//    7   13:getfield        #29  <Field long Notification.when>
		//    8   16:invokevirtual   #33  <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
		//    9   19:iload           14
		//   10   21:invokevirtual   #37  <Method android.app.Notification$Builder android.app.Notification$Builder.setShowWhen(boolean)>
		//   11   24:aload_2         
		//   12   25:getfield        #41  <Field int Notification.icon>
		//   13   28:aload_2         
		//   14   29:getfield        #44  <Field int Notification.iconLevel>
		//   15   32:invokevirtual   #48  <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int, int)>
		//   16   35:aload_2         
		//   17   36:getfield        #52  <Field RemoteViews Notification.contentView>
		//   18   39:invokevirtual   #56  <Method android.app.Notification$Builder android.app.Notification$Builder.setContent(RemoteViews)>
		//   19   42:aload_2         
		//   20   43:getfield        #60  <Field CharSequence Notification.tickerText>
		//   21   46:aload           6
		//   22   48:invokevirtual   #64  <Method android.app.Notification$Builder android.app.Notification$Builder.setTicker(CharSequence, RemoteViews)>
		//   23   51:aload_2         
		//   24   52:getfield        #68  <Field Uri Notification.sound>
		//   25   55:aload_2         
		//   26   56:getfield        #71  <Field int Notification.audioStreamType>
		//   27   59:invokevirtual   #75  <Method android.app.Notification$Builder android.app.Notification$Builder.setSound(Uri, int)>
		//   28   62:aload_2         
		//   29   63:getfield        #79  <Field long[] Notification.vibrate>
		//   30   66:invokevirtual   #83  <Method android.app.Notification$Builder android.app.Notification$Builder.setVibrate(long[])>
		//   31   69:aload_2         
		//   32   70:getfield        #86  <Field int Notification.ledARGB>
		//   33   73:aload_2         
		//   34   74:getfield        #89  <Field int Notification.ledOnMS>
		//   35   77:aload_2         
		//   36   78:getfield        #92  <Field int Notification.ledOffMS>
		//   37   81:invokevirtual   #96  <Method android.app.Notification$Builder android.app.Notification$Builder.setLights(int, int, int)>
		//   38   84:astore_1        
			if((notification.flags & 2) != 0)
		//*  39   85:aload_2         
		//*  40   86:getfield        #99  <Field int Notification.flags>
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
		//   51  106:invokevirtual   #102 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
		//   52  109:astore_1        
			if((notification.flags & 8) != 0)
		//*  53  110:aload_2         
		//*  54  111:getfield        #99  <Field int Notification.flags>
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
		//   65  132:invokevirtual   #105 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
		//   66  135:astore_1        
			if((notification.flags & 0x10) != 0)
		//*  67  136:aload_2         
		//*  68  137:getfield        #99  <Field int Notification.flags>
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
		//   79  158:invokevirtual   #108 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
		//   80  161:aload_2         
		//   81  162:getfield        #111 <Field int Notification.defaults>
		//   82  165:invokevirtual   #115 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
		//   83  168:aload_3         
		//   84  169:invokevirtual   #119 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
		//   85  172:aload           4
		//   86  174:invokevirtual   #122 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
		//   87  177:aload           17
		//   88  179:invokevirtual   #125 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
		//   89  182:aload           5
		//   90  184:invokevirtual   #128 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
		//   91  187:aload           8
		//   92  189:invokevirtual   #132 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
		//   93  192:aload_2         
		//   94  193:getfield        #136 <Field PendingIntent Notification.deleteIntent>
		//   95  196:invokevirtual   #139 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
		//   96  199:astore_1        
			if((notification.flags & 0x80) != 0)
		//*  97  200:aload_2         
		//*  98  201:getfield        #99  <Field int Notification.flags>
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
			b = ((android.app.Notification.Builder) (context)).setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag2).setPriority(l).setProgress(j, k, flag).setLocalOnly(flag3).setExtras(bundle).setGroup(s1).setGroupSummary(flag4).setSortKey(s2).setCategory(s).setColor(i1).setVisibility(j1).setPublicVersion(notification1).setRemoteInputHistory(acharsequence);
		//  107  220:aload_0         
		//  108  221:aload_1         
		//  109  222:aload           9
		//  110  224:iload           14
		//  111  226:invokevirtual   #143 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
		//  112  229:aload           10
		//  113  231:invokevirtual   #147 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
		//  114  234:iload           7
		//  115  236:invokevirtual   #150 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
		//  116  239:iload           15
		//  117  241:invokevirtual   #153 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
		//  118  244:iload           16
		//  119  246:invokevirtual   #156 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
		//  120  249:iload           11
		//  121  251:iload           12
		//  122  253:iload           13
		//  123  255:invokevirtual   #160 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
		//  124  258:iload           18
		//  125  260:invokevirtual   #163 <Method android.app.Notification$Builder android.app.Notification$Builder.setLocalOnly(boolean)>
		//  126  263:aload           21
		//  127  265:invokevirtual   #167 <Method android.app.Notification$Builder android.app.Notification$Builder.setExtras(Bundle)>
		//  128  268:aload           25
		//  129  270:invokevirtual   #171 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroup(String)>
		//  130  273:iload           26
		//  131  275:invokevirtual   #174 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroupSummary(boolean)>
		//  132  278:aload           27
		//  133  280:invokevirtual   #177 <Method android.app.Notification$Builder android.app.Notification$Builder.setSortKey(String)>
		//  134  283:aload           19
		//  135  285:invokevirtual   #180 <Method android.app.Notification$Builder android.app.Notification$Builder.setCategory(String)>
		//  136  288:iload           22
		//  137  290:invokevirtual   #183 <Method android.app.Notification$Builder android.app.Notification$Builder.setColor(int)>
		//  138  293:iload           23
		//  139  295:invokevirtual   #186 <Method android.app.Notification$Builder android.app.Notification$Builder.setVisibility(int)>
		//  140  298:aload           24
		//  141  300:invokevirtual   #190 <Method android.app.Notification$Builder android.app.Notification$Builder.setPublicVersion(Notification)>
		//  142  303:aload           28
		//  143  305:invokevirtual   #194 <Method android.app.Notification$Builder android.app.Notification$Builder.setRemoteInputHistory(CharSequence[])>
		//  144  308:putfield        #196 <Field android.app.Notification$Builder b>
			if(remoteviews1 != null)
		//* 145  311:aload           29
		//* 146  313:ifnull          326
				b.setCustomContentView(remoteviews1);
		//  147  316:aload_0         
		//  148  317:getfield        #196 <Field android.app.Notification$Builder b>
		//  149  320:aload           29
		//  150  322:invokevirtual   #199 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomContentView(RemoteViews)>
		//  151  325:pop             
			if(remoteviews2 != null)
		//* 152  326:aload           30
		//* 153  328:ifnull          341
				b.setCustomBigContentView(remoteviews2);
		//  154  331:aload_0         
		//  155  332:getfield        #196 <Field android.app.Notification$Builder b>
		//  156  335:aload           30
		//  157  337:invokevirtual   #202 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomBigContentView(RemoteViews)>
		//  158  340:pop             
			if(remoteviews3 != null)
		//* 159  341:aload           31
		//* 160  343:ifnull          356
				b.setCustomHeadsUpContentView(remoteviews3);
		//  161  346:aload_0         
		//  162  347:getfield        #196 <Field android.app.Notification$Builder b>
		//  163  350:aload           31
		//  164  352:invokevirtual   #205 <Method android.app.Notification$Builder android.app.Notification$Builder.setCustomHeadsUpContentView(RemoteViews)>
		//  165  355:pop             
			for(context = ((Context) (arraylist.iterator())); ((Iterator) (context)).hasNext(); b.addPerson(((String) (notification))))
		//* 166  356:aload           20
		//* 167  358:invokevirtual   #211 <Method Iterator ArrayList.iterator()>
		//* 168  361:astore_1        
		//* 169  362:aload_1         
		//* 170  363:invokeinterface #217 <Method boolean Iterator.hasNext()>
		//* 171  368:ifeq            393
				notification = ((Notification) ((String)((Iterator) (context)).next()));
		//  172  371:aload_1         
		//  173  372:invokeinterface #221 <Method Object Iterator.next()>
		//  174  377:checkcast       #223 <Class String>
		//  175  380:astore_2        

		//  176  381:aload_0         
		//  177  382:getfield        #196 <Field android.app.Notification$Builder b>
		//  178  385:aload_2         
		//  179  386:invokevirtual   #226 <Method android.app.Notification$Builder android.app.Notification$Builder.addPerson(String)>
		//  180  389:pop             
		//* 181  390:goto            362
		//  182  393:return          
		}
	}


	NotificationCompatApi24()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
	//    2    4:return          
	}

	public static void addAction(android.app.Notification.Builder builder, NotificationCompatBase.Action action)
	{
		android.app.Notification.Action.Builder builder1 = new android.app.Notification.Action.Builder(action.getIcon(), action.getTitle(), action.getActionIntent());
	//    0    0:new             #62  <Class android.app.Notification$Action$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #68  <Method int NotificationCompatBase$Action.getIcon()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #72  <Method CharSequence NotificationCompatBase$Action.getTitle()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #76  <Method PendingIntent NotificationCompatBase$Action.getActionIntent()>
	//    8   16:invokespecial   #79  <Method void android.app.Notification$Action$Builder(int, CharSequence, PendingIntent)>
	//    9   19:astore          5
		if(action.getRemoteInputs() != null)
	//*  10   21:aload_1         
	//*  11   22:invokevirtual   #83  <Method RemoteInputCompatBase$RemoteInput[] NotificationCompatBase$Action.getRemoteInputs()>
	//*  12   25:ifnull          65
		{
			android.app.RemoteInput aremoteinput[] = RemoteInputCompatApi20.fromCompat(action.getRemoteInputs());
	//   13   28:aload_1         
	//   14   29:invokevirtual   #83  <Method RemoteInputCompatBase$RemoteInput[] NotificationCompatBase$Action.getRemoteInputs()>
	//   15   32:invokestatic    #89  <Method android.app.RemoteInput[] RemoteInputCompatApi20.fromCompat(RemoteInputCompatBase$RemoteInput[])>
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
	//   29   54:invokevirtual   #93  <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.addRemoteInput(android.app.RemoteInput)>
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
	//*  37   66:invokevirtual   #97  <Method Bundle NotificationCompatBase$Action.getExtras()>
	//*  38   69:ifnull          88
			bundle = new Bundle(action.getExtras());
	//   39   72:new             #99  <Class Bundle>
	//   40   75:dup             
	//   41   76:aload_1         
	//   42   77:invokevirtual   #97  <Method Bundle NotificationCompatBase$Action.getExtras()>
	//   43   80:invokespecial   #102 <Method void Bundle(Bundle)>
	//   44   83:astore          4
		else
	//*  45   85:goto            97
			bundle = new Bundle();
	//   46   88:new             #99  <Class Bundle>
	//   47   91:dup             
	//   48   92:invokespecial   #103 <Method void Bundle()>
	//   49   95:astore          4
		bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
	//   50   97:aload           4
	//   51   99:ldc1            #105 <String "android.support.allowGeneratedReplies">
	//   52  101:aload_1         
	//   53  102:invokevirtual   #109 <Method boolean NotificationCompatBase$Action.getAllowGeneratedReplies()>
	//   54  105:invokevirtual   #113 <Method void Bundle.putBoolean(String, boolean)>
		builder1.addExtras(bundle);
	//   55  108:aload           5
	//   56  110:aload           4
	//   57  112:invokevirtual   #117 <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.addExtras(Bundle)>
	//   58  115:pop             
		builder1.setAllowGeneratedReplies(action.getAllowGeneratedReplies());
	//   59  116:aload           5
	//   60  118:aload_1         
	//   61  119:invokevirtual   #109 <Method boolean NotificationCompatBase$Action.getAllowGeneratedReplies()>
	//   62  122:invokevirtual   #121 <Method android.app.Notification$Action$Builder android.app.Notification$Action$Builder.setAllowGeneratedReplies(boolean)>
	//   63  125:pop             
		builder.addAction(builder1.build());
	//   64  126:aload_0         
	//   65  127:aload           5
	//   66  129:invokevirtual   #125 <Method android.app.Notification$Action android.app.Notification$Action$Builder.build()>
	//   67  132:invokevirtual   #130 <Method android.app.Notification$Builder android.app.Notification$Builder.addAction(android.app.Notification$Action)>
	//   68  135:pop             
	//   69  136:return          
	}

	public static void addMessagingStyle(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, CharSequence charsequence, CharSequence charsequence1, List list, List list1, List list2, List list3, List list4)
	{
		charsequence = ((CharSequence) ((new android.app.Notification.MessagingStyle(charsequence)).setConversationTitle(charsequence1)));
	//    0    0:new             #134 <Class android.app.Notification$MessagingStyle>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #137 <Method void android.app.Notification$MessagingStyle(CharSequence)>
	//    4    8:aload_2         
	//    5    9:invokevirtual   #141 <Method android.app.Notification$MessagingStyle android.app.Notification$MessagingStyle.setConversationTitle(CharSequence)>
	//    6   12:astore_1        
		for(int i = 0; i < list.size(); i++)
	//*   7   13:iconst_0        
	//*   8   14:istore          8
	//*   9   16:iload           8
	//*  10   18:aload_3         
	//*  11   19:invokeinterface #146 <Method int List.size()>
	//*  12   24:icmpge          129
		{
			charsequence1 = ((CharSequence) (new android.app.Notification.MessagingStyle.Message((CharSequence)list.get(i), ((Long)list1.get(i)).longValue(), (CharSequence)list2.get(i))));
	//   13   27:new             #148 <Class android.app.Notification$MessagingStyle$Message>
	//   14   30:dup             
	//   15   31:aload_3         
	//   16   32:iload           8
	//   17   34:invokeinterface #152 <Method Object List.get(int)>
	//   18   39:checkcast       #154 <Class CharSequence>
	//   19   42:aload           4
	//   20   44:iload           8
	//   21   46:invokeinterface #152 <Method Object List.get(int)>
	//   22   51:checkcast       #156 <Class Long>
	//   23   54:invokevirtual   #160 <Method long Long.longValue()>
	//   24   57:aload           5
	//   25   59:iload           8
	//   26   61:invokeinterface #152 <Method Object List.get(int)>
	//   27   66:checkcast       #154 <Class CharSequence>
	//   28   69:invokespecial   #163 <Method void android.app.Notification$MessagingStyle$Message(CharSequence, long, CharSequence)>
	//   29   72:astore_2        
			if(list3.get(i) != null)
	//*  30   73:aload           6
	//*  31   75:iload           8
	//*  32   77:invokeinterface #152 <Method Object List.get(int)>
	//*  33   82:ifnull          114
				((android.app.Notification.MessagingStyle.Message) (charsequence1)).setData((String)list3.get(i), (Uri)list4.get(i));
	//   34   85:aload_2         
	//   35   86:aload           6
	//   36   88:iload           8
	//   37   90:invokeinterface #152 <Method Object List.get(int)>
	//   38   95:checkcast       #165 <Class String>
	//   39   98:aload           7
	//   40  100:iload           8
	//   41  102:invokeinterface #152 <Method Object List.get(int)>
	//   42  107:checkcast       #167 <Class Uri>
	//   43  110:invokevirtual   #171 <Method android.app.Notification$MessagingStyle$Message android.app.Notification$MessagingStyle$Message.setData(String, Uri)>
	//   44  113:pop             
			((android.app.Notification.MessagingStyle) (charsequence)).addMessage(((android.app.Notification.MessagingStyle.Message) (charsequence1)));
	//   45  114:aload_1         
	//   46  115:aload_2         
	//   47  116:invokevirtual   #175 <Method android.app.Notification$MessagingStyle android.app.Notification$MessagingStyle.addMessage(android.app.Notification$MessagingStyle$Message)>
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
	//   56  131:invokeinterface #181 <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//   57  136:invokevirtual   #185 <Method void android.app.Notification$MessagingStyle.setBuilder(android.app.Notification$Builder)>
	//   58  139:return          
	}

	public static final String CATEGORY_ALARM = "alarm";
	public static final String CATEGORY_CALL = "call";
	public static final String CATEGORY_EMAIL = "email";
	public static final String CATEGORY_ERROR = "err";
	public static final String CATEGORY_EVENT = "event";
	public static final String CATEGORY_MESSAGE = "msg";
	public static final String CATEGORY_PROGRESS = "progress";
	public static final String CATEGORY_PROMO = "promo";
	public static final String CATEGORY_RECOMMENDATION = "recommendation";
	public static final String CATEGORY_SERVICE = "service";
	public static final String CATEGORY_SOCIAL = "social";
	public static final String CATEGORY_STATUS = "status";
	public static final String CATEGORY_SYSTEM = "sys";
	public static final String CATEGORY_TRANSPORT = "transport";
}
