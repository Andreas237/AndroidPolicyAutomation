// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.*;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//			NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions, NotificationCompatApi20

class NotificationCompatApi21
{
	public static class Builder
		implements NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions
	{

		public void addAction(NotificationCompatBase.Action action)
		{
			NotificationCompatApi20.addAction(b, action);
		//    0    0:aload_0         
		//    1    1:getfield        #193 <Field android.app.Notification$Builder b>
		//    2    4:aload_1         
		//    3    5:invokestatic    #239 <Method void NotificationCompatApi20.addAction(android.app.Notification$Builder, NotificationCompatBase$Action)>
		//    4    8:return          
		}

		public Notification build()
		{
			b.setExtras(mExtras);
		//    0    0:aload_0         
		//    1    1:getfield        #193 <Field android.app.Notification$Builder b>
		//    2    4:aload_0         
		//    3    5:getfield        #198 <Field Bundle mExtras>
		//    4    8:invokevirtual   #245 <Method android.app.Notification$Builder android.app.Notification$Builder.setExtras(Bundle)>
		//    5   11:pop             
			Notification notification = b.build();
		//    6   12:aload_0         
		//    7   13:getfield        #193 <Field android.app.Notification$Builder b>
		//    8   16:invokevirtual   #247 <Method Notification android.app.Notification$Builder.build()>
		//    9   19:astore_1        
			if(mContentView != null)
		//*  10   20:aload_0         
		//*  11   21:getfield        #225 <Field RemoteViews mContentView>
		//*  12   24:ifnull          35
				notification.contentView = mContentView;
		//   13   27:aload_1         
		//   14   28:aload_0         
		//   15   29:getfield        #225 <Field RemoteViews mContentView>
		//   16   32:putfield        #57  <Field RemoteViews Notification.contentView>
			if(mBigContentView != null)
		//*  17   35:aload_0         
		//*  18   36:getfield        #227 <Field RemoteViews mBigContentView>
		//*  19   39:ifnull          50
				notification.bigContentView = mBigContentView;
		//   20   42:aload_1         
		//   21   43:aload_0         
		//   22   44:getfield        #227 <Field RemoteViews mBigContentView>
		//   23   47:putfield        #250 <Field RemoteViews Notification.bigContentView>
			if(mHeadsUpContentView != null)
		//*  24   50:aload_0         
		//*  25   51:getfield        #229 <Field RemoteViews mHeadsUpContentView>
		//*  26   54:ifnull          65
				notification.headsUpContentView = mHeadsUpContentView;
		//   27   57:aload_1         
		//   28   58:aload_0         
		//   29   59:getfield        #229 <Field RemoteViews mHeadsUpContentView>
		//   30   62:putfield        #253 <Field RemoteViews Notification.headsUpContentView>
			return notification;
		//   31   65:aload_1         
		//   32   66:areturn         
		}

		public android.app.Notification.Builder getBuilder()
		{
			return b;
		//    0    0:aload_0         
		//    1    1:getfield        #193 <Field android.app.Notification$Builder b>
		//    2    4:areturn         
		}

		private android.app.Notification.Builder b;
		private RemoteViews mBigContentView;
		private RemoteViews mContentView;
		private Bundle mExtras;
		private RemoteViews mHeadsUpContentView;

		public Builder(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
				PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
				boolean flag2, int l, CharSequence charsequence3, boolean flag3, String s, ArrayList arraylist, Bundle bundle, 
				int i1, int j1, Notification notification1, String s1, boolean flag4, String s2, RemoteViews remoteviews1, 
				RemoteViews remoteviews2, RemoteViews remoteviews3)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			context = ((Context) ((new android.app.Notification.Builder(context)).setWhen(notification.when).setShowWhen(flag1).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS)));
		//    2    4:new             #26  <Class android.app.Notification$Builder>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:invokespecial   #29  <Method void android.app.Notification$Builder(Context)>
		//    6   12:aload_2         
		//    7   13:getfield        #35  <Field long Notification.when>
		//    8   16:invokevirtual   #39  <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
		//    9   19:iload           14
		//   10   21:invokevirtual   #43  <Method android.app.Notification$Builder android.app.Notification$Builder.setShowWhen(boolean)>
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
		//   51  106:invokevirtual   #107 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
		//   52  109:astore_1        
			if((notification.flags & 8) != 0)
		//*  53  110:aload_2         
		//*  54  111:getfield        #104 <Field int Notification.flags>
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
		//   65  132:invokevirtual   #110 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
		//   66  135:astore_1        
			if((notification.flags & 0x10) != 0)
		//*  67  136:aload_2         
		//*  68  137:getfield        #104 <Field int Notification.flags>
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
		//   79  158:invokevirtual   #113 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
		//   80  161:aload_2         
		//   81  162:getfield        #116 <Field int Notification.defaults>
		//   82  165:invokevirtual   #120 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
		//   83  168:aload_3         
		//   84  169:invokevirtual   #124 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
		//   85  172:aload           4
		//   86  174:invokevirtual   #127 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
		//   87  177:aload           17
		//   88  179:invokevirtual   #130 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
		//   89  182:aload           5
		//   90  184:invokevirtual   #133 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
		//   91  187:aload           8
		//   92  189:invokevirtual   #137 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
		//   93  192:aload_2         
		//   94  193:getfield        #141 <Field PendingIntent Notification.deleteIntent>
		//   95  196:invokevirtual   #144 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
		//   96  199:astore_1        
			if((notification.flags & 0x80) != 0)
		//*  97  200:aload_2         
		//*  98  201:getfield        #104 <Field int Notification.flags>
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
			b = ((android.app.Notification.Builder) (context)).setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag2).setPriority(l).setProgress(j, k, flag).setLocalOnly(flag3).setGroup(s1).setGroupSummary(flag4).setSortKey(s2).setCategory(s).setColor(i1).setVisibility(j1).setPublicVersion(notification1);
		//  107  220:aload_0         
		//  108  221:aload_1         
		//  109  222:aload           9
		//  110  224:iload           14
		//  111  226:invokevirtual   #148 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
		//  112  229:aload           10
		//  113  231:invokevirtual   #152 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
		//  114  234:iload           7
		//  115  236:invokevirtual   #155 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
		//  116  239:iload           15
		//  117  241:invokevirtual   #158 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
		//  118  244:iload           16
		//  119  246:invokevirtual   #161 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
		//  120  249:iload           11
		//  121  251:iload           12
		//  122  253:iload           13
		//  123  255:invokevirtual   #165 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
		//  124  258:iload           18
		//  125  260:invokevirtual   #168 <Method android.app.Notification$Builder android.app.Notification$Builder.setLocalOnly(boolean)>
		//  126  263:aload           25
		//  127  265:invokevirtual   #172 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroup(String)>
		//  128  268:iload           26
		//  129  270:invokevirtual   #175 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroupSummary(boolean)>
		//  130  273:aload           27
		//  131  275:invokevirtual   #178 <Method android.app.Notification$Builder android.app.Notification$Builder.setSortKey(String)>
		//  132  278:aload           19
		//  133  280:invokevirtual   #181 <Method android.app.Notification$Builder android.app.Notification$Builder.setCategory(String)>
		//  134  283:iload           22
		//  135  285:invokevirtual   #184 <Method android.app.Notification$Builder android.app.Notification$Builder.setColor(int)>
		//  136  288:iload           23
		//  137  290:invokevirtual   #187 <Method android.app.Notification$Builder android.app.Notification$Builder.setVisibility(int)>
		//  138  293:aload           24
		//  139  295:invokevirtual   #191 <Method android.app.Notification$Builder android.app.Notification$Builder.setPublicVersion(Notification)>
		//  140  298:putfield        #193 <Field android.app.Notification$Builder b>
			mExtras = new Bundle();
		//  141  301:aload_0         
		//  142  302:new             #195 <Class Bundle>
		//  143  305:dup             
		//  144  306:invokespecial   #196 <Method void Bundle()>
		//  145  309:putfield        #198 <Field Bundle mExtras>
			if(bundle != null)
		//* 146  312:aload           21
		//* 147  314:ifnull          326
				mExtras.putAll(bundle);
		//  148  317:aload_0         
		//  149  318:getfield        #198 <Field Bundle mExtras>
		//  150  321:aload           21
		//  151  323:invokevirtual   #202 <Method void Bundle.putAll(Bundle)>
			for(context = ((Context) (arraylist.iterator())); ((Iterator) (context)).hasNext(); b.addPerson(((String) (notification))))
		//* 152  326:aload           20
		//* 153  328:invokevirtual   #208 <Method Iterator ArrayList.iterator()>
		//* 154  331:astore_1        
		//* 155  332:aload_1         
		//* 156  333:invokeinterface #214 <Method boolean Iterator.hasNext()>
		//* 157  338:ifeq            363
				notification = ((Notification) ((String)((Iterator) (context)).next()));
		//  158  341:aload_1         
		//  159  342:invokeinterface #218 <Method Object Iterator.next()>
		//  160  347:checkcast       #220 <Class String>
		//  161  350:astore_2        

		//  162  351:aload_0         
		//  163  352:getfield        #193 <Field android.app.Notification$Builder b>
		//  164  355:aload_2         
		//  165  356:invokevirtual   #223 <Method android.app.Notification$Builder android.app.Notification$Builder.addPerson(String)>
		//  166  359:pop             
		//* 167  360:goto            332
			mContentView = remoteviews1;
		//  168  363:aload_0         
		//  169  364:aload           28
		//  170  366:putfield        #225 <Field RemoteViews mContentView>
			mBigContentView = remoteviews2;
		//  171  369:aload_0         
		//  172  370:aload           29
		//  173  372:putfield        #227 <Field RemoteViews mBigContentView>
			mHeadsUpContentView = remoteviews3;
		//  174  375:aload_0         
		//  175  376:aload           30
		//  176  378:putfield        #229 <Field RemoteViews mHeadsUpContentView>
		//  177  381:return          
		}
	}


	NotificationCompatApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void Object()>
	//    2    4:return          
	}

	private static RemoteInput fromCompatRemoteInput(RemoteInputCompatBase.RemoteInput remoteinput)
	{
		return (new android.app.RemoteInput.Builder(remoteinput.getResultKey())).setLabel(remoteinput.getLabel()).setChoices(remoteinput.getChoices()).setAllowFreeFormInput(remoteinput.getAllowFreeFormInput()).addExtras(remoteinput.getExtras()).build();
	//    0    0:new             #86  <Class android.app.RemoteInput$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #92  <Method String RemoteInputCompatBase$RemoteInput.getResultKey()>
	//    4    8:invokespecial   #95  <Method void android.app.RemoteInput$Builder(String)>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #99  <Method CharSequence RemoteInputCompatBase$RemoteInput.getLabel()>
	//    7   15:invokevirtual   #103 <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.setLabel(CharSequence)>
	//    8   18:aload_0         
	//    9   19:invokevirtual   #107 <Method CharSequence[] RemoteInputCompatBase$RemoteInput.getChoices()>
	//   10   22:invokevirtual   #111 <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.setChoices(CharSequence[])>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #115 <Method boolean RemoteInputCompatBase$RemoteInput.getAllowFreeFormInput()>
	//   13   29:invokevirtual   #119 <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.setAllowFreeFormInput(boolean)>
	//   14   32:aload_0         
	//   15   33:invokevirtual   #123 <Method Bundle RemoteInputCompatBase$RemoteInput.getExtras()>
	//   16   36:invokevirtual   #127 <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.addExtras(Bundle)>
	//   17   39:invokevirtual   #131 <Method RemoteInput android.app.RemoteInput$Builder.build()>
	//   18   42:areturn         
	}

	static Bundle getBundleForUnreadConversation(NotificationCompatBase.UnreadConversation unreadconversation)
	{
		if(unreadconversation == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		Bundle bundle = new Bundle();
	//    4    6:new             #135 <Class Bundle>
	//    5    9:dup             
	//    6   10:invokespecial   #136 <Method void Bundle()>
	//    7   13:astore          4
		Parcelable aparcelable[] = null;
	//    8   15:aconst_null     
	//    9   16:astore_3        
		Object obj = ((Object) (aparcelable));
	//   10   17:aload_3         
	//   11   18:astore_2        
		if(unreadconversation.getParticipants() != null)
	//*  12   19:aload_0         
	//*  13   20:invokevirtual   #142 <Method String[] NotificationCompatBase$UnreadConversation.getParticipants()>
	//*  14   23:ifnull          44
		{
			obj = ((Object) (aparcelable));
	//   15   26:aload_3         
	//   16   27:astore_2        
			if(unreadconversation.getParticipants().length > 1)
	//*  17   28:aload_0         
	//*  18   29:invokevirtual   #142 <Method String[] NotificationCompatBase$UnreadConversation.getParticipants()>
	//*  19   32:arraylength     
	//*  20   33:iconst_1        
	//*  21   34:icmple          44
				obj = ((Object) (unreadconversation.getParticipants()[0]));
	//   22   37:aload_0         
	//   23   38:invokevirtual   #142 <Method String[] NotificationCompatBase$UnreadConversation.getParticipants()>
	//   24   41:iconst_0        
	//   25   42:aaload          
	//   26   43:astore_2        
		}
		aparcelable = new Parcelable[unreadconversation.getMessages().length];
	//   27   44:aload_0         
	//   28   45:invokevirtual   #145 <Method String[] NotificationCompatBase$UnreadConversation.getMessages()>
	//   29   48:arraylength     
	//   30   49:anewarray       Parcelable[]
	//   31   52:astore_3        
		for(int i = 0; i < aparcelable.length; i++)
	//*  32   53:iconst_0        
	//*  33   54:istore_1        
	//*  34   55:iload_1         
	//*  35   56:aload_3         
	//*  36   57:arraylength     
	//*  37   58:icmpge          103
		{
			Bundle bundle1 = new Bundle();
	//   38   61:new             #135 <Class Bundle>
	//   39   64:dup             
	//   40   65:invokespecial   #136 <Method void Bundle()>
	//   41   68:astore          5
			bundle1.putString("text", unreadconversation.getMessages()[i]);
	//   42   70:aload           5
	//   43   72:ldc1            #74  <String "text">
	//   44   74:aload_0         
	//   45   75:invokevirtual   #145 <Method String[] NotificationCompatBase$UnreadConversation.getMessages()>
	//   46   78:iload_1         
	//   47   79:aaload          
	//   48   80:invokevirtual   #151 <Method void Bundle.putString(String, String)>
			bundle1.putString("author", ((String) (obj)));
	//   49   83:aload           5
	//   50   85:ldc1            #56  <String "author">
	//   51   87:aload_2         
	//   52   88:invokevirtual   #151 <Method void Bundle.putString(String, String)>
			aparcelable[i] = ((Parcelable) (bundle1));
	//   53   91:aload_3         
	//   54   92:iload_1         
	//   55   93:aload           5
	//   56   95:aastore         
		}

	//   57   96:iload_1         
	//   58   97:iconst_1        
	//   59   98:iadd            
	//   60   99:istore_1        
	//*  61  100:goto            55
		bundle.putParcelableArray("messages", aparcelable);
	//   62  103:aload           4
	//   63  105:ldc1            #59  <String "messages">
	//   64  107:aload_3         
	//   65  108:invokevirtual   #155 <Method void Bundle.putParcelableArray(String, Parcelable[])>
		obj = ((Object) (unreadconversation.getRemoteInput()));
	//   66  111:aload_0         
	//   67  112:invokevirtual   #159 <Method RemoteInputCompatBase$RemoteInput NotificationCompatBase$UnreadConversation.getRemoteInput()>
	//   68  115:astore_2        
		if(obj != null)
	//*  69  116:aload_2         
	//*  70  117:ifnull          131
			bundle.putParcelable("remote_input", ((Parcelable) (fromCompatRemoteInput(((RemoteInputCompatBase.RemoteInput) (obj))))));
	//   71  120:aload           4
	//   72  122:ldc1            #71  <String "remote_input">
	//   73  124:aload_2         
	//   74  125:invokestatic    #161 <Method RemoteInput fromCompatRemoteInput(RemoteInputCompatBase$RemoteInput)>
	//   75  128:invokevirtual   #165 <Method void Bundle.putParcelable(String, Parcelable)>
		bundle.putParcelable("on_reply", ((Parcelable) (unreadconversation.getReplyPendingIntent())));
	//   76  131:aload           4
	//   77  133:ldc1            #65  <String "on_reply">
	//   78  135:aload_0         
	//   79  136:invokevirtual   #169 <Method PendingIntent NotificationCompatBase$UnreadConversation.getReplyPendingIntent()>
	//   80  139:invokevirtual   #165 <Method void Bundle.putParcelable(String, Parcelable)>
		bundle.putParcelable("on_read", ((Parcelable) (unreadconversation.getReadPendingIntent())));
	//   81  142:aload           4
	//   82  144:ldc1            #62  <String "on_read">
	//   83  146:aload_0         
	//   84  147:invokevirtual   #172 <Method PendingIntent NotificationCompatBase$UnreadConversation.getReadPendingIntent()>
	//   85  150:invokevirtual   #165 <Method void Bundle.putParcelable(String, Parcelable)>
		bundle.putStringArray("participants", unreadconversation.getParticipants());
	//   86  153:aload           4
	//   87  155:ldc1            #68  <String "participants">
	//   88  157:aload_0         
	//   89  158:invokevirtual   #142 <Method String[] NotificationCompatBase$UnreadConversation.getParticipants()>
	//   90  161:invokevirtual   #176 <Method void Bundle.putStringArray(String, String[])>
		bundle.putLong("timestamp", unreadconversation.getLatestTimestamp());
	//   91  164:aload           4
	//   92  166:ldc1            #77  <String "timestamp">
	//   93  168:aload_0         
	//   94  169:invokevirtual   #180 <Method long NotificationCompatBase$UnreadConversation.getLatestTimestamp()>
	//   95  172:invokevirtual   #184 <Method void Bundle.putLong(String, long)>
		return bundle;
	//   96  175:aload           4
	//   97  177:areturn         
	}

	public static String getCategory(Notification notification)
	{
		return notification.category;
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field String Notification.category>
	//    2    4:areturn         
	}

	static NotificationCompatBase.UnreadConversation getUnreadConversationFromBundle(Bundle bundle, NotificationCompatBase.UnreadConversation.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
	{
		if(bundle == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		Parcelable aparcelable[] = bundle.getParcelableArray("messages");
	//    4    6:aload_0         
	//    5    7:ldc1            #59  <String "messages">
	//    6    9:invokevirtual   #197 <Method Parcelable[] Bundle.getParcelableArray(String)>
	//    7   12:astore          7
		String as[] = null;
	//    8   14:aconst_null     
	//    9   15:astore          6
		if(aparcelable != null)
	//*  10   17:aload           7
	//*  11   19:ifnull          112
		{
			as = new String[aparcelable.length];
	//   12   22:aload           7
	//   13   24:arraylength     
	//   14   25:anewarray       String[]
	//   15   28:astore          6
			boolean flag1 = true;
	//   16   30:iconst_1        
	//   17   31:istore          5
			int i = 0;
	//   18   33:iconst_0        
	//   19   34:istore          4
			boolean flag;
			do
			{
				flag = flag1;
	//   20   36:iload           5
	//   21   38:istore_3        
				if(i >= as.length)
					break;
	//   22   39:iload           4
	//   23   41:aload           6
	//   24   43:arraylength     
	//   25   44:icmpge          103
				if(!(aparcelable[i] instanceof Bundle))
	//*  26   47:aload           7
	//*  27   49:iload           4
	//*  28   51:aaload          
	//*  29   52:instanceof      #135 <Class Bundle>
	//*  30   55:ifne            63
				{
					flag = false;
	//   31   58:iconst_0        
	//   32   59:istore_3        
					break;
	//   33   60:goto            103
				}
				as[i] = ((Bundle)aparcelable[i]).getString("text");
	//   34   63:aload           6
	//   35   65:iload           4
	//   36   67:aload           7
	//   37   69:iload           4
	//   38   71:aaload          
	//   39   72:checkcast       #135 <Class Bundle>
	//   40   75:ldc1            #74  <String "text">
	//   41   77:invokevirtual   #203 <Method String Bundle.getString(String)>
	//   42   80:aastore         
				if(as[i] == null)
	//*  43   81:aload           6
	//*  44   83:iload           4
	//*  45   85:aaload          
	//*  46   86:ifnonnull       94
				{
					flag = false;
	//   47   89:iconst_0        
	//   48   90:istore_3        
					break;
	//   49   91:goto            103
				}
				i++;
	//   50   94:iload           4
	//   51   96:iconst_1        
	//   52   97:iadd            
	//   53   98:istore          4
			} while(true);
	//   54  100:goto            36
			if(!flag)
	//*  55  103:iload_3         
	//*  56  104:ifeq            110
	//*  57  107:goto            112
				return null;
	//   58  110:aconst_null     
	//   59  111:areturn         
		}
		PendingIntent pendingintent = (PendingIntent)bundle.getParcelable("on_read");
	//   60  112:aload_0         
	//   61  113:ldc1            #62  <String "on_read">
	//   62  115:invokevirtual   #207 <Method Parcelable Bundle.getParcelable(String)>
	//   63  118:checkcast       #209 <Class PendingIntent>
	//   64  121:astore          7
		PendingIntent pendingintent1 = (PendingIntent)bundle.getParcelable("on_reply");
	//   65  123:aload_0         
	//   66  124:ldc1            #65  <String "on_reply">
	//   67  126:invokevirtual   #207 <Method Parcelable Bundle.getParcelable(String)>
	//   68  129:checkcast       #209 <Class PendingIntent>
	//   69  132:astore          8
		RemoteInput remoteinput = (RemoteInput)bundle.getParcelable("remote_input");
	//   70  134:aload_0         
	//   71  135:ldc1            #71  <String "remote_input">
	//   72  137:invokevirtual   #207 <Method Parcelable Bundle.getParcelable(String)>
	//   73  140:checkcast       #211 <Class RemoteInput>
	//   74  143:astore          10
		String as1[] = bundle.getStringArray("participants");
	//   75  145:aload_0         
	//   76  146:ldc1            #68  <String "participants">
	//   77  148:invokevirtual   #215 <Method String[] Bundle.getStringArray(String)>
	//   78  151:astore          9
		if(as1 == null || as1.length != 1)
	//*  79  153:aload           9
	//*  80  155:ifnull          165
	//*  81  158:aload           9
	//*  82  160:arraylength     
	//*  83  161:iconst_1        
	//*  84  162:icmpeq          167
			return null;
	//   85  165:aconst_null     
	//   86  166:areturn         
		if(remoteinput != null)
	//*  87  167:aload           10
	//*  88  169:ifnull          182
			factory1 = ((RemoteInputCompatBase.RemoteInput.Factory) (toCompatRemoteInput(remoteinput, factory1)));
	//   89  172:aload           10
	//   90  174:aload_2         
	//   91  175:invokestatic    #219 <Method RemoteInputCompatBase$RemoteInput toCompatRemoteInput(RemoteInput, RemoteInputCompatBase$RemoteInput$Factory)>
	//   92  178:astore_2        
		else
	//*  93  179:goto            184
			factory1 = null;
	//   94  182:aconst_null     
	//   95  183:astore_2        
		return factory.build(as, ((RemoteInputCompatBase.RemoteInput) (factory1)), pendingintent1, pendingintent, as1, bundle.getLong("timestamp"));
	//   96  184:aload_1         
	//   97  185:aload           6
	//   98  187:aload_2         
	//   99  188:aload           8
	//  100  190:aload           7
	//  101  192:aload           9
	//  102  194:aload_0         
	//  103  195:ldc1            #77  <String "timestamp">
	//  104  197:invokevirtual   #223 <Method long Bundle.getLong(String)>
	//  105  200:invokeinterface #228 <Method NotificationCompatBase$UnreadConversation NotificationCompatBase$UnreadConversation$Factory.build(String[], RemoteInputCompatBase$RemoteInput, PendingIntent, PendingIntent, String[], long)>
	//  106  205:areturn         
	}

	private static RemoteInputCompatBase.RemoteInput toCompatRemoteInput(RemoteInput remoteinput, RemoteInputCompatBase.RemoteInput.Factory factory)
	{
		return factory.build(remoteinput.getResultKey(), remoteinput.getLabel(), remoteinput.getChoices(), remoteinput.getAllowFreeFormInput(), remoteinput.getExtras(), ((java.util.Set) (null)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #229 <Method String RemoteInput.getResultKey()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #230 <Method CharSequence RemoteInput.getLabel()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #231 <Method CharSequence[] RemoteInput.getChoices()>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #232 <Method boolean RemoteInput.getAllowFreeFormInput()>
	//    9   17:aload_0         
	//   10   18:invokevirtual   #233 <Method Bundle RemoteInput.getExtras()>
	//   11   21:aconst_null     
	//   12   22:invokeinterface #238 <Method RemoteInputCompatBase$RemoteInput RemoteInputCompatBase$RemoteInput$Factory.build(String, CharSequence, CharSequence[], boolean, Bundle, java.util.Set)>
	//   13   27:areturn         
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
	private static final String KEY_AUTHOR = "author";
	private static final String KEY_MESSAGES = "messages";
	private static final String KEY_ON_READ = "on_read";
	private static final String KEY_ON_REPLY = "on_reply";
	private static final String KEY_PARTICIPANTS = "participants";
	private static final String KEY_REMOTE_INPUT = "remote_input";
	private static final String KEY_TEXT = "text";
	private static final String KEY_TIMESTAMP = "timestamp";
}
