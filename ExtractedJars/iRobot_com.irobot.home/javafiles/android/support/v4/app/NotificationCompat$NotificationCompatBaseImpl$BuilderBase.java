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
		int l = notification.flags;
	//   37   80:aload_2         
	//   38   81:getfield        #96  <Field int Notification.flags>
	//   39   84:istore          14
		boolean flag2 = false;
	//   40   86:iconst_0        
	//   41   87:istore          16
		boolean flag1;
		if((l & 2) != 0)
	//*  42   89:iload           14
	//*  43   91:iconst_2        
	//*  44   92:iand            
	//*  45   93:ifeq            102
			flag1 = true;
	//   46   96:iconst_1        
	//   47   97:istore          15
		else
	//*  48   99:goto            105
			flag1 = false;
	//   49  102:iconst_0        
	//   50  103:istore          15
		context = ((Context) (((android.app.Notification.Builder) (context)).setOngoing(flag1)));
	//   51  105:aload_1         
	//   52  106:iload           15
	//   53  108:invokevirtual   #100 <Method android.app.Notification$Builder android.app.Notification$Builder.setOngoing(boolean)>
	//   54  111:astore_1        
		if((notification.flags & 8) != 0)
	//*  55  112:aload_2         
	//*  56  113:getfield        #96  <Field int Notification.flags>
	//*  57  116:bipush          8
	//*  58  118:iand            
	//*  59  119:ifeq            128
			flag1 = true;
	//   60  122:iconst_1        
	//   61  123:istore          15
		else
	//*  62  125:goto            131
			flag1 = false;
	//   63  128:iconst_0        
	//   64  129:istore          15
		context = ((Context) (((android.app.Notification.Builder) (context)).setOnlyAlertOnce(flag1)));
	//   65  131:aload_1         
	//   66  132:iload           15
	//   67  134:invokevirtual   #103 <Method android.app.Notification$Builder android.app.Notification$Builder.setOnlyAlertOnce(boolean)>
	//   68  137:astore_1        
		if((notification.flags & 0x10) != 0)
	//*  69  138:aload_2         
	//*  70  139:getfield        #96  <Field int Notification.flags>
	//*  71  142:bipush          16
	//*  72  144:iand            
	//*  73  145:ifeq            154
			flag1 = true;
	//   74  148:iconst_1        
	//   75  149:istore          15
		else
	//*  76  151:goto            157
			flag1 = false;
	//   77  154:iconst_0        
	//   78  155:istore          15
		context = ((Context) (((android.app.Notification.Builder) (context)).setAutoCancel(flag1).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent)));
	//   79  157:aload_1         
	//   80  158:iload           15
	//   81  160:invokevirtual   #106 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
	//   82  163:aload_2         
	//   83  164:getfield        #109 <Field int Notification.defaults>
	//   84  167:invokevirtual   #113 <Method android.app.Notification$Builder android.app.Notification$Builder.setDefaults(int)>
	//   85  170:aload_3         
	//   86  171:invokevirtual   #117 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//   87  174:aload           4
	//   88  176:invokevirtual   #120 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentText(CharSequence)>
	//   89  179:aload           5
	//   90  181:invokevirtual   #123 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentInfo(CharSequence)>
	//   91  184:aload           8
	//   92  186:invokevirtual   #127 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
	//   93  189:aload_2         
	//   94  190:getfield        #131 <Field PendingIntent Notification.deleteIntent>
	//   95  193:invokevirtual   #134 <Method android.app.Notification$Builder android.app.Notification$Builder.setDeleteIntent(PendingIntent)>
	//   96  196:astore_1        
		if((notification.flags & 0x80) != 0)
	//*  97  197:aload_2         
	//*  98  198:getfield        #96  <Field int Notification.flags>
	//*  99  201:sipush          128
	//* 100  204:iand            
	//* 101  205:ifeq            214
			flag1 = true;
	//  102  208:iconst_1        
	//  103  209:istore          15
		else
	//* 104  211:goto            218
			flag1 = flag2;
	//  105  214:iload           16
	//  106  216:istore          15
		mBuilder = ((android.app.Notification.Builder) (context)).setFullScreenIntent(pendingintent1, flag1).setLargeIcon(bitmap).setNumber(i).setProgress(j, k, flag);
	//  107  218:aload_0         
	//  108  219:aload_1         
	//  109  220:aload           9
	//  110  222:iload           15
	//  111  224:invokevirtual   #138 <Method android.app.Notification$Builder android.app.Notification$Builder.setFullScreenIntent(PendingIntent, boolean)>
	//  112  227:aload           10
	//  113  229:invokevirtual   #142 <Method android.app.Notification$Builder android.app.Notification$Builder.setLargeIcon(Bitmap)>
	//  114  232:iload           7
	//  115  234:invokevirtual   #145 <Method android.app.Notification$Builder android.app.Notification$Builder.setNumber(int)>
	//  116  237:iload           11
	//  117  239:iload           12
	//  118  241:iload           13
	//  119  243:invokevirtual   #149 <Method android.app.Notification$Builder android.app.Notification$Builder.setProgress(int, int, boolean)>
	//  120  246:putfield        #151 <Field android.app.Notification$Builder mBuilder>
	//  121  249:return          
	}
}
