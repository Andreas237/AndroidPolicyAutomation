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
	//*  41   86:ifeq            218
			flag1 = true;
	//   42   89:iconst_1        
	//   43   90:istore          14
		else
	//*  44   92:aload_1         
	//*  45   93:iload           14
	//*  46   95:invokevirtual   #100 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
	//*  47   98:astore_1        
	//*  48   99:aload_2         
	//*  49  100:getfield        #96  <Field int Notification.flags>
	//*  50  103:bipush          8
	//*  51  105:iand            
	//*  52  106:ifeq            224
	//*  53  109:iconst_1        
	//*  54  110:istore          14
	//*  55  112:aload_1         
	//*  56  113:iload           14
	//*  57  115:invokevirtual   #103 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
	//*  58  118:astore_1        
	//*  59  119:aload_2         
	//*  60  120:getfield        #96  <Field int Notification.flags>
	//*  61  123:bipush          16
	//*  62  125:iand            
	//*  63  126:ifeq            230
	//*  64  129:iconst_1        
	//*  65  130:istore          14
	//*  66  132:aload_1         
	//*  67  133:iload           14
	//*  68  135:invokevirtual   #106 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
	//*  69  138:aload_2         
	//*  70  139:getfield        #109 <Field int Notification.defaults>
	//*  71  142:invokevirtual   #113 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
	//*  72  145:aload_3         
	//*  73  146:invokevirtual   #117 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//*  74  149:aload           4
	//*  75  151:invokevirtual   #120 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//*  76  154:aload           5
	//*  77  156:invokevirtual   #123 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
	//*  78  159:aload           8
	//*  79  161:invokevirtual   #127 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
	//*  80  164:aload_2         
	//*  81  165:getfield        #131 <Field PendingIntent Notification.deleteIntent>
	//*  82  168:invokevirtual   #134 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
	//*  83  171:astore_1        
	//*  84  172:aload_2         
	//*  85  173:getfield        #96  <Field int Notification.flags>
	//*  86  176:sipush          128
	//*  87  179:iand            
	//*  88  180:ifeq            236
	//*  89  183:iconst_1        
	//*  90  184:istore          14
	//*  91  186:aload_0         
	//*  92  187:aload_1         
	//*  93  188:aload           9
	//*  94  190:iload           14
	//*  95  192:invokevirtual   #138 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
	//*  96  195:aload           10
	//*  97  197:invokevirtual   #142 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
	//*  98  200:iload           7
	//*  99  202:invokevirtual   #145 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
	//* 100  205:iload           11
	//* 101  207:iload           12
	//* 102  209:iload           13
	//* 103  211:invokevirtual   #149 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
	//* 104  214:putfield        #151 <Field android.app.Notification$Builder mBuilder>
	//* 105  217:return          
			flag1 = false;
	//  106  218:iconst_0        
	//  107  219:istore          14
		context = ((Context) (((android.app.Notification.Builder) (context)).setOngoing(flag1)));
		if((notification.flags & 8) != 0)
			flag1 = true;
		else
	//* 108  221:goto            92
			flag1 = false;
	//  109  224:iconst_0        
	//  110  225:istore          14
		context = ((Context) (((android.app.Notification.Builder) (context)).setOnlyAlertOnce(flag1)));
		if((notification.flags & 0x10) != 0)
			flag1 = true;
		else
	//* 111  227:goto            112
			flag1 = false;
	//  112  230:iconst_0        
	//  113  231:istore          14
		context = ((Context) (((android.app.Notification.Builder) (context)).setAutoCancel(flag1).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent)));
		if((notification.flags & 0x80) != 0)
			flag1 = true;
		else
	//* 114  233:goto            132
			flag1 = false;
	//  115  236:iconst_0        
	//  116  237:istore          14
		mBuilder = ((android.app.Notification.Builder) (context)).setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setProgress(j, k, flag);
	//* 117  239:goto            186
	}
}
