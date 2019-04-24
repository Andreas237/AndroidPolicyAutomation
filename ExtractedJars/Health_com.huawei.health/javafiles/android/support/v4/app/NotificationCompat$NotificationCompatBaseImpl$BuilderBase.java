// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;

// Referenced classes of package android.support.v4.app:
//			NotificationBuilderWithBuilderAccessor, NotificationCompat

public static class NotificationCompat$NotificationCompatBaseImpl$BuilderBase
	implements NotificationBuilderWithBuilderAccessor
{

	public Notification build()
	{
		return mBuilder.getNotification();
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field android.app.Notification$Builder mBuilder>
	//    2    4:invokevirtual   #157 <Method Notification android.app.Notification$Builder.getNotification()>
	//    3    7:areturn         
	}

	public android.app.Notification.Builder getBuilder()
	{
		return mBuilder;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field android.app.Notification$Builder mBuilder>
	//    2    4:areturn         
	}

	private android.app.Notification.Builder mBuilder;

	NotificationCompat$NotificationCompatBaseImpl$BuilderBase(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
			PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		context = ((Context) ((new android.app.Notification.Builder(context)).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteviews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS)));
	//    2    4:new             #21  <Class android.app.Notification$Builder>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #24  <Method void android.app.Notification$Builder(Context)>
	//    6   12:aload_2         
	//    7   13:getfield        #30  <Field long Notification.when>
	//    8   16:invokevirtual   #34  <Method android.app.Notification$Builder android.app.Notification$Builder.setWhen(long)>
	//    9   19:aload_2         
	//   10   20:getfield        #38  <Field int Notification.icon>
	//   11   23:aload_2         
	//   12   24:getfield        #41  <Field int Notification.iconLevel>
	//   13   27:invokevirtual   #45  <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int, int)>
	//   14   30:aload_2         
	//   15   31:getfield        #49  <Field RemoteViews Notification.contentView>
	//   16   34:invokevirtual   #53  <Method android.app.Notification$Builder android.app.Notification$Builder.setContent(RemoteViews)>
	//   17   37:aload_2         
	//   18   38:getfield        #57  <Field CharSequence Notification.tickerText>
	//   19   41:aload           6
	//   20   43:invokevirtual   #61  <Method android.app.Notification$Builder android.app.Notification$Builder.setTicker(CharSequence, RemoteViews)>
	//   21   46:aload_2         
	//   22   47:getfield        #65  <Field android.net.Uri Notification.sound>
	//   23   50:aload_2         
	//   24   51:getfield        #68  <Field int Notification.audioStreamType>
	//   25   54:invokevirtual   #72  <Method android.app.Notification$Builder android.app.Notification$Builder.setSound(android.net.Uri, int)>
	//   26   57:aload_2         
	//   27   58:getfield        #76  <Field long[] Notification.vibrate>
	//   28   61:invokevirtual   #80  <Method android.app.Notification$Builder android.app.Notification$Builder.setVibrate(long[])>
	//   29   64:aload_2         
	//   30   65:getfield        #83  <Field int Notification.ledARGB>
	//   31   68:aload_2         
	//   32   69:getfield        #86  <Field int Notification.ledOnMS>
	//   33   72:aload_2         
	//   34   73:getfield        #89  <Field int Notification.ledOffMS>
	//   35   76:invokevirtual   #93  <Method android.app.Notification$Builder android.app.Notification$Builder.setLights(int, int, int)>
	//   36   79:astore_1        
		boolean flag1;
		if((notification.flags & 2) != 0)
	//*  37   80:aload_2         
	//*  38   81:getfield        #96  <Field int Notification.flags>
	//*  39   84:iconst_2        
	//*  40   85:iand            
	//*  41   86:ifeq            95
			flag1 = true;
	//   42   89:iconst_1        
	//   43   90:istore          14
		else
	//*  44   92:goto            98
			flag1 = false;
	//   45   95:iconst_0        
	//   46   96:istore          14
		context = ((Context) (((android.app.Notification.Builder) (context)).setOngoing(flag1)));
	//   47   98:aload_1         
	//   48   99:iload           14
	//   49  101:invokevirtual   #100 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
	//   50  104:astore_1        
		if((notification.flags & 8) != 0)
	//*  51  105:aload_2         
	//*  52  106:getfield        #96  <Field int Notification.flags>
	//*  53  109:bipush          8
	//*  54  111:iand            
	//*  55  112:ifeq            121
			flag1 = true;
	//   56  115:iconst_1        
	//   57  116:istore          14
		else
	//*  58  118:goto            124
			flag1 = false;
	//   59  121:iconst_0        
	//   60  122:istore          14
		context = ((Context) (((android.app.Notification.Builder) (context)).setOnlyAlertOnce(flag1)));
	//   61  124:aload_1         
	//   62  125:iload           14
	//   63  127:invokevirtual   #103 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
	//   64  130:astore_1        
		if((notification.flags & 0x10) != 0)
	//*  65  131:aload_2         
	//*  66  132:getfield        #96  <Field int Notification.flags>
	//*  67  135:bipush          16
	//*  68  137:iand            
	//*  69  138:ifeq            147
			flag1 = true;
	//   70  141:iconst_1        
	//   71  142:istore          14
		else
	//*  72  144:goto            150
			flag1 = false;
	//   73  147:iconst_0        
	//   74  148:istore          14
		context = ((Context) (((android.app.Notification.Builder) (context)).setAutoCancel(flag1).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent)));
	//   75  150:aload_1         
	//   76  151:iload           14
	//   77  153:invokevirtual   #106 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
	//   78  156:aload_2         
	//   79  157:getfield        #109 <Field int Notification.defaults>
	//   80  160:invokevirtual   #113 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
	//   81  163:aload_3         
	//   82  164:invokevirtual   #117 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//   83  167:aload           4
	//   84  169:invokevirtual   #120 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//   85  172:aload           5
	//   86  174:invokevirtual   #123 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
	//   87  177:aload           8
	//   88  179:invokevirtual   #127 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
	//   89  182:aload_2         
	//   90  183:getfield        #131 <Field PendingIntent Notification.deleteIntent>
	//   91  186:invokevirtual   #134 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
	//   92  189:astore_1        
		if((notification.flags & 0x80) != 0)
	//*  93  190:aload_2         
	//*  94  191:getfield        #96  <Field int Notification.flags>
	//*  95  194:sipush          128
	//*  96  197:iand            
	//*  97  198:ifeq            207
			flag1 = true;
	//   98  201:iconst_1        
	//   99  202:istore          14
		else
	//* 100  204:goto            210
			flag1 = false;
	//  101  207:iconst_0        
	//  102  208:istore          14
		mBuilder = ((android.app.Notification.Builder) (context)).setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setProgress(j, k, flag);
	//  103  210:aload_0         
	//  104  211:aload_1         
	//  105  212:aload           9
	//  106  214:iload           14
	//  107  216:invokevirtual   #138 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
	//  108  219:aload           10
	//  109  221:invokevirtual   #142 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
	//  110  224:iload           7
	//  111  226:invokevirtual   #145 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
	//  112  229:iload           11
	//  113  231:iload           12
	//  114  233:iload           13
	//  115  235:invokevirtual   #149 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
	//  116  238:putfield        #151 <Field android.app.Notification$Builder mBuilder>
	//  117  241:return          
	}
}
