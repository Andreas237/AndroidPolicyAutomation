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
//			NotificationBuilderWithActions, NotificationBuilderWithBuilderAccessor, NotificationCompatApi20

class NotificationCompatApi21
{
	public static class Builder
		implements NotificationBuilderWithActions, NotificationBuilderWithBuilderAccessor
	{

		private void removeSoundAndVibration(Notification notification)
		{
			notification.sound = null;
		//    0    0:aload_1         
		//    1    1:aconst_null     
		//    2    2:putfield        #74  <Field android.net.Uri Notification.sound>
			notification.vibrate = null;
		//    3    5:aload_1         
		//    4    6:aconst_null     
		//    5    7:putfield        #85  <Field long[] Notification.vibrate>
			notification.defaults = notification.defaults & -2;
		//    6   10:aload_1         
		//    7   11:aload_1         
		//    8   12:getfield        #117 <Field int Notification.defaults>
		//    9   15:bipush          -2
		//   10   17:iand            
		//   11   18:putfield        #117 <Field int Notification.defaults>
			notification.defaults = notification.defaults & -3;
		//   12   21:aload_1         
		//   13   22:aload_1         
		//   14   23:getfield        #117 <Field int Notification.defaults>
		//   15   26:bipush          -3
		//   16   28:iand            
		//   17   29:putfield        #117 <Field int Notification.defaults>
		//   18   32:return          
		}

		public void addAction(NotificationCompatBase.Action action)
		{
			NotificationCompatApi20.addAction(b, action);
		//    0    0:aload_0         
		//    1    1:getfield        #194 <Field android.app.Notification$Builder b>
		//    2    4:aload_1         
		//    3    5:invokestatic    #244 <Method void NotificationCompatApi20.addAction(android.app.Notification$Builder, NotificationCompatBase$Action)>
		//    4    8:return          
		}

		public Notification build()
		{
			b.setExtras(mExtras);
		//    0    0:aload_0         
		//    1    1:getfield        #194 <Field android.app.Notification$Builder b>
		//    2    4:aload_0         
		//    3    5:getfield        #199 <Field Bundle mExtras>
		//    4    8:invokevirtual   #250 <Method android.app.Notification$Builder android.app.Notification$Builder.setExtras(Bundle)>
		//    5   11:pop             
			Notification notification = b.build();
		//    6   12:aload_0         
		//    7   13:getfield        #194 <Field android.app.Notification$Builder b>
		//    8   16:invokevirtual   #252 <Method Notification android.app.Notification$Builder.build()>
		//    9   19:astore_1        
			if(mContentView != null)
		//*  10   20:aload_0         
		//*  11   21:getfield        #226 <Field RemoteViews mContentView>
		//*  12   24:ifnull          35
				notification.contentView = mContentView;
		//   13   27:aload_1         
		//   14   28:aload_0         
		//   15   29:getfield        #226 <Field RemoteViews mContentView>
		//   16   32:putfield        #58  <Field RemoteViews Notification.contentView>
			if(mBigContentView != null)
		//*  17   35:aload_0         
		//*  18   36:getfield        #228 <Field RemoteViews mBigContentView>
		//*  19   39:ifnull          50
				notification.bigContentView = mBigContentView;
		//   20   42:aload_1         
		//   21   43:aload_0         
		//   22   44:getfield        #228 <Field RemoteViews mBigContentView>
		//   23   47:putfield        #255 <Field RemoteViews Notification.bigContentView>
			if(mHeadsUpContentView != null)
		//*  24   50:aload_0         
		//*  25   51:getfield        #230 <Field RemoteViews mHeadsUpContentView>
		//*  26   54:ifnull          65
				notification.headsUpContentView = mHeadsUpContentView;
		//   27   57:aload_1         
		//   28   58:aload_0         
		//   29   59:getfield        #230 <Field RemoteViews mHeadsUpContentView>
		//   30   62:putfield        #258 <Field RemoteViews Notification.headsUpContentView>
			if(mGroupAlertBehavior != 0)
		//*  31   65:aload_0         
		//*  32   66:getfield        #232 <Field int mGroupAlertBehavior>
		//*  33   69:ifeq            134
			{
				if(notification.getGroup() != null && (notification.flags & 0x200) != 0 && mGroupAlertBehavior == 2)
		//*  34   72:aload_1         
		//*  35   73:invokevirtual   #262 <Method String Notification.getGroup()>
		//*  36   76:ifnull          103
		//*  37   79:aload_1         
		//*  38   80:getfield        #105 <Field int Notification.flags>
		//*  39   83:sipush          512
		//*  40   86:iand            
		//*  41   87:ifeq            103
		//*  42   90:aload_0         
		//*  43   91:getfield        #232 <Field int mGroupAlertBehavior>
		//*  44   94:iconst_2        
		//*  45   95:icmpne          103
					removeSoundAndVibration(notification);
		//   46   98:aload_0         
		//   47   99:aload_1         
		//   48  100:invokespecial   #264 <Method void removeSoundAndVibration(Notification)>
				if(notification.getGroup() != null && (notification.flags & 0x200) == 0 && mGroupAlertBehavior == 1)
		//*  49  103:aload_1         
		//*  50  104:invokevirtual   #262 <Method String Notification.getGroup()>
		//*  51  107:ifnull          134
		//*  52  110:aload_1         
		//*  53  111:getfield        #105 <Field int Notification.flags>
		//*  54  114:sipush          512
		//*  55  117:iand            
		//*  56  118:ifne            134
		//*  57  121:aload_0         
		//*  58  122:getfield        #232 <Field int mGroupAlertBehavior>
		//*  59  125:iconst_1        
		//*  60  126:icmpne          134
					removeSoundAndVibration(notification);
		//   61  129:aload_0         
		//   62  130:aload_1         
		//   63  131:invokespecial   #264 <Method void removeSoundAndVibration(Notification)>
			}
			return notification;
		//   64  134:aload_1         
		//   65  135:areturn         
		}

		public android.app.Notification.Builder getBuilder()
		{
			return b;
		//    0    0:aload_0         
		//    1    1:getfield        #194 <Field android.app.Notification$Builder b>
		//    2    4:areturn         
		}

		private android.app.Notification.Builder b;
		private RemoteViews mBigContentView;
		private RemoteViews mContentView;
		private Bundle mExtras;
		private int mGroupAlertBehavior;
		private RemoteViews mHeadsUpContentView;

		public Builder(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
				PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
				boolean flag2, int l, CharSequence charsequence3, boolean flag3, String s, ArrayList arraylist, Bundle bundle, 
				int i1, int j1, Notification notification1, String s1, boolean flag4, String s2, RemoteViews remoteviews1, 
				RemoteViews remoteviews2, RemoteViews remoteviews3, int k1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			context = ((Context) ((new android.app.Notification.Builder(context)).setWhen(notification.when).setShowWhen(flag1).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS)));
		//    2    4:new             #28  <Class android.app.Notification$Builder>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:invokespecial   #31  <Method void android.app.Notification$Builder(Context)>
		//    6   12:aload_2         
		//    7   13:getfield        #37  <Field long Notification.when>
		//    8   16:invokevirtual   #41  <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
		//    9   19:iload           14
		//   10   21:invokevirtual   #45  <Method android.app.Notification$Builder android.app.Notification$Builder.setShowWhen(boolean)>
		//   11   24:aload_2         
		//   12   25:getfield        #48  <Field int Notification.icon>
		//   13   28:aload_2         
		//   14   29:getfield        #51  <Field int Notification.iconLevel>
		//   15   32:invokevirtual   #55  <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int, int)>
		//   16   35:aload_2         
		//   17   36:getfield        #58  <Field RemoteViews Notification.contentView>
		//   18   39:invokevirtual   #62  <Method android.app.Notification$Builder android.app.Notification$Builder.setContent(RemoteViews)>
		//   19   42:aload_2         
		//   20   43:getfield        #66  <Field CharSequence Notification.tickerText>
		//   21   46:aload           6
		//   22   48:invokevirtual   #70  <Method android.app.Notification$Builder android.app.Notification$Builder.setTicker(CharSequence, RemoteViews)>
		//   23   51:aload_2         
		//   24   52:getfield        #74  <Field android.net.Uri Notification.sound>
		//   25   55:aload_2         
		//   26   56:getfield        #77  <Field int Notification.audioStreamType>
		//   27   59:invokevirtual   #81  <Method android.app.Notification$Builder android.app.Notification$Builder.setSound(android.net.Uri, int)>
		//   28   62:aload_2         
		//   29   63:getfield        #85  <Field long[] Notification.vibrate>
		//   30   66:invokevirtual   #89  <Method android.app.Notification$Builder android.app.Notification$Builder.setVibrate(long[])>
		//   31   69:aload_2         
		//   32   70:getfield        #92  <Field int Notification.ledARGB>
		//   33   73:aload_2         
		//   34   74:getfield        #95  <Field int Notification.ledOnMS>
		//   35   77:aload_2         
		//   36   78:getfield        #98  <Field int Notification.ledOffMS>
		//   37   81:invokevirtual   #102 <Method android.app.Notification$Builder android.app.Notification$Builder.setLights(int, int, int)>
		//   38   84:astore_1        
			if((notification.flags & 2) != 0)
		//*  39   85:aload_2         
		//*  40   86:getfield        #105 <Field int Notification.flags>
		//*  41   89:iconst_2        
		//*  42   90:iand            
		//*  43   91:ifeq            339
				flag1 = true;
		//   44   94:iconst_1        
		//   45   95:istore          14
			else
		//*  46   97:aload_1         
		//*  47   98:iload           14
		//*  48  100:invokevirtual   #108 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
		//*  49  103:astore_1        
		//*  50  104:aload_2         
		//*  51  105:getfield        #105 <Field int Notification.flags>
		//*  52  108:bipush          8
		//*  53  110:iand            
		//*  54  111:ifeq            345
		//*  55  114:iconst_1        
		//*  56  115:istore          14
		//*  57  117:aload_1         
		//*  58  118:iload           14
		//*  59  120:invokevirtual   #111 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
		//*  60  123:astore_1        
		//*  61  124:aload_2         
		//*  62  125:getfield        #105 <Field int Notification.flags>
		//*  63  128:bipush          16
		//*  64  130:iand            
		//*  65  131:ifeq            351
		//*  66  134:iconst_1        
		//*  67  135:istore          14
		//*  68  137:aload_1         
		//*  69  138:iload           14
		//*  70  140:invokevirtual   #114 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
		//*  71  143:aload_2         
		//*  72  144:getfield        #117 <Field int Notification.defaults>
		//*  73  147:invokevirtual   #121 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
		//*  74  150:aload_3         
		//*  75  151:invokevirtual   #125 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
		//*  76  154:aload           4
		//*  77  156:invokevirtual   #128 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
		//*  78  159:aload           17
		//*  79  161:invokevirtual   #131 <Method android.app.Notification$Builder android.app.Notification$Builder.setSubText(CharSequence)>
		//*  80  164:aload           5
		//*  81  166:invokevirtual   #134 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
		//*  82  169:aload           8
		//*  83  171:invokevirtual   #138 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
		//*  84  174:aload_2         
		//*  85  175:getfield        #142 <Field PendingIntent Notification.deleteIntent>
		//*  86  178:invokevirtual   #145 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
		//*  87  181:astore_1        
		//*  88  182:aload_2         
		//*  89  183:getfield        #105 <Field int Notification.flags>
		//*  90  186:sipush          128
		//*  91  189:iand            
		//*  92  190:ifeq            357
		//*  93  193:iconst_1        
		//*  94  194:istore          14
		//*  95  196:aload_0         
		//*  96  197:aload_1         
		//*  97  198:aload           9
		//*  98  200:iload           14
		//*  99  202:invokevirtual   #149 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
		//* 100  205:aload           10
		//* 101  207:invokevirtual   #153 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
		//* 102  210:iload           7
		//* 103  212:invokevirtual   #156 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
		//* 104  215:iload           15
		//* 105  217:invokevirtual   #159 <Method android.app.Notification$Builder android.app.Notification$Builder.setUsesChronometer(boolean)>
		//* 106  220:iload           16
		//* 107  222:invokevirtual   #162 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
		//* 108  225:iload           11
		//* 109  227:iload           12
		//* 110  229:iload           13
		//* 111  231:invokevirtual   #166 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
		//* 112  234:iload           18
		//* 113  236:invokevirtual   #169 <Method android.app.Notification$Builder android.app.Notification$Builder.setLocalOnly(boolean)>
		//* 114  239:aload           25
		//* 115  241:invokevirtual   #173 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroup(String)>
		//* 116  244:iload           26
		//* 117  246:invokevirtual   #176 <Method android.app.Notification$Builder android.app.Notification$Builder.setGroupSummary(boolean)>
		//* 118  249:aload           27
		//* 119  251:invokevirtual   #179 <Method android.app.Notification$Builder android.app.Notification$Builder.setSortKey(String)>
		//* 120  254:aload           19
		//* 121  256:invokevirtual   #182 <Method android.app.Notification$Builder android.app.Notification$Builder.setCategory(String)>
		//* 122  259:iload           22
		//* 123  261:invokevirtual   #185 <Method android.app.Notification$Builder android.app.Notification$Builder.setColor(int)>
		//* 124  264:iload           23
		//* 125  266:invokevirtual   #188 <Method android.app.Notification$Builder android.app.Notification$Builder.setVisibility(int)>
		//* 126  269:aload           24
		//* 127  271:invokevirtual   #192 <Method android.app.Notification$Builder android.app.Notification$Builder.setPublicVersion(Notification)>
		//* 128  274:putfield        #194 <Field android.app.Notification$Builder b>
		//* 129  277:aload_0         
		//* 130  278:new             #196 <Class Bundle>
		//* 131  281:dup             
		//* 132  282:invokespecial   #197 <Method void Bundle()>
		//* 133  285:putfield        #199 <Field Bundle mExtras>
		//* 134  288:aload           21
		//* 135  290:ifnull          302
		//* 136  293:aload_0         
		//* 137  294:getfield        #199 <Field Bundle mExtras>
		//* 138  297:aload           21
		//* 139  299:invokevirtual   #203 <Method void Bundle.putAll(Bundle)>
		//* 140  302:aload           20
		//* 141  304:invokevirtual   #209 <Method Iterator ArrayList.iterator()>
		//* 142  307:astore_1        
		//* 143  308:aload_1         
		//* 144  309:invokeinterface #215 <Method boolean Iterator.hasNext()>
		//* 145  314:ifeq            363
		//* 146  317:aload_1         
		//* 147  318:invokeinterface #219 <Method Object Iterator.next()>
		//* 148  323:checkcast       #221 <Class String>
		//* 149  326:astore_2        
		//* 150  327:aload_0         
		//* 151  328:getfield        #194 <Field android.app.Notification$Builder b>
		//* 152  331:aload_2         
		//* 153  332:invokevirtual   #224 <Method android.app.Notification$Builder android.app.Notification$Builder.addPerson(String)>
		//* 154  335:pop             
		//* 155  336:goto            308
				flag1 = false;
		//  156  339:iconst_0        
		//  157  340:istore          14
			context = ((Context) (((android.app.Notification.Builder) (context)).setOngoing(flag1)));
			if((notification.flags & 8) != 0)
				flag1 = true;
			else
		//* 158  342:goto            97
				flag1 = false;
		//  159  345:iconst_0        
		//  160  346:istore          14
			context = ((Context) (((android.app.Notification.Builder) (context)).setOnlyAlertOnce(flag1)));
			if((notification.flags & 0x10) != 0)
				flag1 = true;
			else
		//* 161  348:goto            117
				flag1 = false;
		//  162  351:iconst_0        
		//  163  352:istore          14
			context = ((Context) (((android.app.Notification.Builder) (context)).setAutoCancel(flag1).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setSubText(charsequence3).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent)));
			if((notification.flags & 0x80) != 0)
				flag1 = true;
			else
		//* 164  354:goto            137
				flag1 = false;
		//  165  357:iconst_0        
		//  166  358:istore          14
			b = ((android.app.Notification.Builder) (context)).setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(flag2).setPriority(l).setProgress(j, k, flag).setLocalOnly(flag3).setGroup(s1).setGroupSummary(flag4).setSortKey(s2).setCategory(s).setColor(i1).setVisibility(j1).setPublicVersion(notification1);
			mExtras = new Bundle();
			if(bundle != null)
				mExtras.putAll(bundle);
			for(context = ((Context) (arraylist.iterator())); ((Iterator) (context)).hasNext(); b.addPerson(((String) (notification))))
				notification = ((Notification) ((String)((Iterator) (context)).next()));

		//* 167  360:goto            196
			mContentView = remoteviews1;
		//  168  363:aload_0         
		//  169  364:aload           28
		//  170  366:putfield        #226 <Field RemoteViews mContentView>
			mBigContentView = remoteviews2;
		//  171  369:aload_0         
		//  172  370:aload           29
		//  173  372:putfield        #228 <Field RemoteViews mBigContentView>
			mHeadsUpContentView = remoteviews3;
		//  174  375:aload_0         
		//  175  376:aload           30
		//  176  378:putfield        #230 <Field RemoteViews mHeadsUpContentView>
			mGroupAlertBehavior = k1;
		//  177  381:aload_0         
		//  178  382:iload           31
		//  179  384:putfield        #232 <Field int mGroupAlertBehavior>
		//  180  387:return          
		}
	}


	NotificationCompatApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
	//    2    4:return          
	}

	private static RemoteInput fromCompatRemoteInput(RemoteInputCompatBase.RemoteInput remoteinput)
	{
		return (new android.app.RemoteInput.Builder(remoteinput.getResultKey())).setLabel(remoteinput.getLabel()).setChoices(remoteinput.getChoices()).setAllowFreeFormInput(remoteinput.getAllowFreeFormInput()).addExtras(remoteinput.getExtras()).build();
	//    0    0:new             #44  <Class android.app.RemoteInput$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #50  <Method String RemoteInputCompatBase$RemoteInput.getResultKey()>
	//    4    8:invokespecial   #53  <Method void android.app.RemoteInput$Builder(String)>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #57  <Method CharSequence RemoteInputCompatBase$RemoteInput.getLabel()>
	//    7   15:invokevirtual   #61  <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.setLabel(CharSequence)>
	//    8   18:aload_0         
	//    9   19:invokevirtual   #65  <Method CharSequence[] RemoteInputCompatBase$RemoteInput.getChoices()>
	//   10   22:invokevirtual   #69  <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.setChoices(CharSequence[])>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #73  <Method boolean RemoteInputCompatBase$RemoteInput.getAllowFreeFormInput()>
	//   13   29:invokevirtual   #77  <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.setAllowFreeFormInput(boolean)>
	//   14   32:aload_0         
	//   15   33:invokevirtual   #81  <Method Bundle RemoteInputCompatBase$RemoteInput.getExtras()>
	//   16   36:invokevirtual   #85  <Method android.app.RemoteInput$Builder android.app.RemoteInput$Builder.addExtras(Bundle)>
	//   17   39:invokevirtual   #89  <Method RemoteInput android.app.RemoteInput$Builder.build()>
	//   18   42:areturn         
	}

	static Bundle getBundleForUnreadConversation(NotificationCompatBase.UnreadConversation unreadconversation)
	{
		Parcelable aparcelable[] = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		int i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_1        
		if(unreadconversation == null)
	//*   4    4:aload_0         
	//*   5    5:ifnonnull       10
			return null;
	//    6    8:aconst_null     
	//    7    9:areturn         
		Bundle bundle = new Bundle();
	//    8   10:new             #93  <Class Bundle>
	//    9   13:dup             
	//   10   14:invokespecial   #94  <Method void Bundle()>
	//   11   17:astore          4
		Object obj = ((Object) (aparcelable));
	//   12   19:aload_3         
	//   13   20:astore_2        
		if(unreadconversation.getParticipants() != null)
	//*  14   21:aload_0         
	//*  15   22:invokevirtual   #100 <Method String[] NotificationCompatBase$UnreadConversation.getParticipants()>
	//*  16   25:ifnull          46
		{
			obj = ((Object) (aparcelable));
	//   17   28:aload_3         
	//   18   29:astore_2        
			if(unreadconversation.getParticipants().length > 1)
	//*  19   30:aload_0         
	//*  20   31:invokevirtual   #100 <Method String[] NotificationCompatBase$UnreadConversation.getParticipants()>
	//*  21   34:arraylength     
	//*  22   35:iconst_1        
	//*  23   36:icmple          46
				obj = ((Object) (unreadconversation.getParticipants()[0]));
	//   24   39:aload_0         
	//   25   40:invokevirtual   #100 <Method String[] NotificationCompatBase$UnreadConversation.getParticipants()>
	//   26   43:iconst_0        
	//   27   44:aaload          
	//   28   45:astore_2        
		}
		for(aparcelable = new Parcelable[unreadconversation.getMessages().length]; i < aparcelable.length; i++)
	//*  29   46:aload_0         
	//*  30   47:invokevirtual   #103 <Method String[] NotificationCompatBase$UnreadConversation.getMessages()>
	//*  31   50:arraylength     
	//*  32   51:anewarray       Parcelable[]
	//*  33   54:astore_3        
	//*  34   55:iload_1         
	//*  35   56:aload_3         
	//*  36   57:arraylength     
	//*  37   58:icmpge          103
		{
			Bundle bundle1 = new Bundle();
	//   38   61:new             #93  <Class Bundle>
	//   39   64:dup             
	//   40   65:invokespecial   #94  <Method void Bundle()>
	//   41   68:astore          5
			bundle1.putString("text", unreadconversation.getMessages()[i]);
	//   42   70:aload           5
	//   43   72:ldc1            #32  <String "text">
	//   44   74:aload_0         
	//   45   75:invokevirtual   #103 <Method String[] NotificationCompatBase$UnreadConversation.getMessages()>
	//   46   78:iload_1         
	//   47   79:aaload          
	//   48   80:invokevirtual   #109 <Method void Bundle.putString(String, String)>
			bundle1.putString("author", ((String) (obj)));
	//   49   83:aload           5
	//   50   85:ldc1            #14  <String "author">
	//   51   87:aload_2         
	//   52   88:invokevirtual   #109 <Method void Bundle.putString(String, String)>
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
	//   63  105:ldc1            #17  <String "messages">
	//   64  107:aload_3         
	//   65  108:invokevirtual   #113 <Method void Bundle.putParcelableArray(String, Parcelable[])>
		obj = ((Object) (unreadconversation.getRemoteInput()));
	//   66  111:aload_0         
	//   67  112:invokevirtual   #117 <Method RemoteInputCompatBase$RemoteInput NotificationCompatBase$UnreadConversation.getRemoteInput()>
	//   68  115:astore_2        
		if(obj != null)
	//*  69  116:aload_2         
	//*  70  117:ifnull          131
			bundle.putParcelable("remote_input", ((Parcelable) (fromCompatRemoteInput(((RemoteInputCompatBase.RemoteInput) (obj))))));
	//   71  120:aload           4
	//   72  122:ldc1            #29  <String "remote_input">
	//   73  124:aload_2         
	//   74  125:invokestatic    #119 <Method RemoteInput fromCompatRemoteInput(RemoteInputCompatBase$RemoteInput)>
	//   75  128:invokevirtual   #123 <Method void Bundle.putParcelable(String, Parcelable)>
		bundle.putParcelable("on_reply", ((Parcelable) (unreadconversation.getReplyPendingIntent())));
	//   76  131:aload           4
	//   77  133:ldc1            #23  <String "on_reply">
	//   78  135:aload_0         
	//   79  136:invokevirtual   #127 <Method PendingIntent NotificationCompatBase$UnreadConversation.getReplyPendingIntent()>
	//   80  139:invokevirtual   #123 <Method void Bundle.putParcelable(String, Parcelable)>
		bundle.putParcelable("on_read", ((Parcelable) (unreadconversation.getReadPendingIntent())));
	//   81  142:aload           4
	//   82  144:ldc1            #20  <String "on_read">
	//   83  146:aload_0         
	//   84  147:invokevirtual   #130 <Method PendingIntent NotificationCompatBase$UnreadConversation.getReadPendingIntent()>
	//   85  150:invokevirtual   #123 <Method void Bundle.putParcelable(String, Parcelable)>
		bundle.putStringArray("participants", unreadconversation.getParticipants());
	//   86  153:aload           4
	//   87  155:ldc1            #26  <String "participants">
	//   88  157:aload_0         
	//   89  158:invokevirtual   #100 <Method String[] NotificationCompatBase$UnreadConversation.getParticipants()>
	//   90  161:invokevirtual   #134 <Method void Bundle.putStringArray(String, String[])>
		bundle.putLong("timestamp", unreadconversation.getLatestTimestamp());
	//   91  164:aload           4
	//   92  166:ldc1            #35  <String "timestamp">
	//   93  168:aload_0         
	//   94  169:invokevirtual   #138 <Method long NotificationCompatBase$UnreadConversation.getLatestTimestamp()>
	//   95  172:invokevirtual   #142 <Method void Bundle.putLong(String, long)>
		return bundle;
	//   96  175:aload           4
	//   97  177:areturn         
	}

	static NotificationCompatBase.UnreadConversation getUnreadConversationFromBundle(Bundle bundle, NotificationCompatBase.UnreadConversation.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		if(bundle != null) goto _L2; else goto _L1
	//    2    3:aload_0         
	//    3    4:ifnonnull       9
_L1:
		return null;
	//    4    7:aconst_null     
	//    5    8:areturn         
_L2:
		int i;
		String as[];
		Object obj;
		obj = ((Object) (bundle.getParcelableArray("messages")));
	//    6    9:aload_0         
	//    7   10:ldc1            #17  <String "messages">
	//    8   12:invokevirtual   #148 <Method Parcelable[] Bundle.getParcelableArray(String)>
	//    9   15:astore          7
		if(obj == null)
			break MISSING_BLOCK_LABEL_190;
	//   10   17:aload           7
	//   11   19:ifnull          190
		as = new String[obj.length];
	//   12   22:aload           7
	//   13   24:arraylength     
	//   14   25:anewarray       String[]
	//   15   28:astore          6
		i = 0;
	//   16   30:iconst_0        
	//   17   31:istore_3        
_L10:
		if(i >= as.length) goto _L4; else goto _L3
	//   18   32:iload_3         
	//   19   33:aload           6
	//   20   35:arraylength     
	//   21   36:icmpge          184
_L3:
		if(obj[i] instanceof Bundle) goto _L6; else goto _L5
	//   22   39:aload           7
	//   23   41:iload_3         
	//   24   42:aaload          
	//   25   43:instanceof      #93  <Class Bundle>
	//   26   46:ifne            145
_L5:
		boolean flag = flag1;
	//   27   49:iload           5
	//   28   51:istore          4
_L9:
		if(!flag) goto _L1; else goto _L7
	//   29   53:iload           4
	//   30   55:ifeq            7
_L7:
		obj = ((Object) ((PendingIntent)bundle.getParcelable("on_read")));
	//   31   58:aload_0         
	//   32   59:ldc1            #20  <String "on_read">
	//   33   61:invokevirtual   #154 <Method Parcelable Bundle.getParcelable(String)>
	//   34   64:checkcast       #156 <Class PendingIntent>
	//   35   67:astore          7
		PendingIntent pendingintent = (PendingIntent)bundle.getParcelable("on_reply");
	//   36   69:aload_0         
	//   37   70:ldc1            #23  <String "on_reply">
	//   38   72:invokevirtual   #154 <Method Parcelable Bundle.getParcelable(String)>
	//   39   75:checkcast       #156 <Class PendingIntent>
	//   40   78:astore          8
		RemoteInput remoteinput = (RemoteInput)bundle.getParcelable("remote_input");
	//   41   80:aload_0         
	//   42   81:ldc1            #29  <String "remote_input">
	//   43   83:invokevirtual   #154 <Method Parcelable Bundle.getParcelable(String)>
	//   44   86:checkcast       #158 <Class RemoteInput>
	//   45   89:astore          10
		String as1[] = bundle.getStringArray("participants");
	//   46   91:aload_0         
	//   47   92:ldc1            #26  <String "participants">
	//   48   94:invokevirtual   #162 <Method String[] Bundle.getStringArray(String)>
	//   49   97:astore          9
		if(as1 != null && as1.length == 1)
	//*  50   99:aload           9
	//*  51  101:ifnull          7
	//*  52  104:aload           9
	//*  53  106:arraylength     
	//*  54  107:iconst_1        
	//*  55  108:icmpne          7
		{
			if(remoteinput != null)
	//*  56  111:aload           10
	//*  57  113:ifnull          179
				factory1 = ((RemoteInputCompatBase.RemoteInput.Factory) (toCompatRemoteInput(remoteinput, factory1)));
	//   58  116:aload           10
	//   59  118:aload_2         
	//   60  119:invokestatic    #166 <Method RemoteInputCompatBase$RemoteInput toCompatRemoteInput(RemoteInput, RemoteInputCompatBase$RemoteInput$Factory)>
	//   61  122:astore_2        
			else
	//*  62  123:aload_1         
	//*  63  124:aload           6
	//*  64  126:aload_2         
	//*  65  127:aload           8
	//*  66  129:aload           7
	//*  67  131:aload           9
	//*  68  133:aload_0         
	//*  69  134:ldc1            #35  <String "timestamp">
	//*  70  136:invokevirtual   #170 <Method long Bundle.getLong(String)>
	//*  71  139:invokeinterface #175 <Method NotificationCompatBase$UnreadConversation NotificationCompatBase$UnreadConversation$Factory.build(String[], RemoteInputCompatBase$RemoteInput, PendingIntent, PendingIntent, String[], long)>
	//*  72  144:areturn         
	//*  73  145:aload           6
	//*  74  147:iload_3         
	//*  75  148:aload           7
	//*  76  150:iload_3         
	//*  77  151:aaload          
	//*  78  152:checkcast       #93  <Class Bundle>
	//*  79  155:ldc1            #32  <String "text">
	//*  80  157:invokevirtual   #179 <Method String Bundle.getString(String)>
	//*  81  160:aastore         
	//*  82  161:iload           5
	//*  83  163:istore          4
	//*  84  165:aload           6
	//*  85  167:iload_3         
	//*  86  168:aaload          
	//*  87  169:ifnull          53
	//*  88  172:iload_3         
	//*  89  173:iconst_1        
	//*  90  174:iadd            
	//*  91  175:istore_3        
	//*  92  176:goto            32
				factory1 = null;
	//   93  179:aconst_null     
	//   94  180:astore_2        
			return factory.build(as, ((RemoteInputCompatBase.RemoteInput) (factory1)), pendingintent, ((PendingIntent) (obj)), as1, bundle.getLong("timestamp"));
		}
		  goto _L1
_L6:
		as[i] = ((Bundle)obj[i]).getString("text");
		flag = flag1;
		if(as[i] == null) goto _L9; else goto _L8
_L8:
		i++;
		  goto _L10
	//*  95  181:goto            123
_L4:
		flag = true;
	//   96  184:iconst_1        
	//   97  185:istore          4
		  goto _L9
	//*  98  187:goto            53
		as = null;
	//   99  190:aconst_null     
	//  100  191:astore          6
		  goto _L7
	//* 101  193:goto            58
	}

	private static RemoteInputCompatBase.RemoteInput toCompatRemoteInput(RemoteInput remoteinput, RemoteInputCompatBase.RemoteInput.Factory factory)
	{
		return factory.build(remoteinput.getResultKey(), remoteinput.getLabel(), remoteinput.getChoices(), remoteinput.getAllowFreeFormInput(), remoteinput.getExtras(), ((java.util.Set) (null)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #180 <Method String RemoteInput.getResultKey()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #181 <Method CharSequence RemoteInput.getLabel()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #182 <Method CharSequence[] RemoteInput.getChoices()>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #183 <Method boolean RemoteInput.getAllowFreeFormInput()>
	//    9   17:aload_0         
	//   10   18:invokevirtual   #184 <Method Bundle RemoteInput.getExtras()>
	//   11   21:aconst_null     
	//   12   22:invokeinterface #189 <Method RemoteInputCompatBase$RemoteInput RemoteInputCompatBase$RemoteInput$Factory.build(String, CharSequence, CharSequence[], boolean, Bundle, java.util.Set)>
	//   13   27:areturn         
	}

	private static final String KEY_AUTHOR = "author";
	private static final String KEY_MESSAGES = "messages";
	private static final String KEY_ON_READ = "on_read";
	private static final String KEY_ON_REPLY = "on_reply";
	private static final String KEY_PARTICIPANTS = "participants";
	private static final String KEY_REMOTE_INPUT = "remote_input";
	private static final String KEY_TEXT = "text";
	private static final String KEY_TIMESTAMP = "timestamp";
}
