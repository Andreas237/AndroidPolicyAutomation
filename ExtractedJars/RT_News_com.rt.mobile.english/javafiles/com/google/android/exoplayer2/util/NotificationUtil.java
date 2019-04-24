// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;

import android.app.*;
import android.content.Context;
import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.exoplayer2.util:
//			Util

public final class NotificationUtil
{
	public static interface Importance
		extends Annotation
	{
	}


	private NotificationUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:return          
	}

	public static void createNotificationChannel(Context context, String s, int i, int j)
	{
		if(Util.SDK_INT >= 26)
	//*   0    0:getstatic       #36  <Field int Util.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          34
			((NotificationManager)context.getSystemService("notification")).createNotificationChannel(new NotificationChannel(s, ((CharSequence) (context.getString(i))), j));
	//    3    8:aload_0         
	//    4    9:ldc1            #38  <String "notification">
	//    5   11:invokevirtual   #44  <Method Object Context.getSystemService(String)>
	//    6   14:checkcast       #46  <Class NotificationManager>
	//    7   17:new             #48  <Class NotificationChannel>
	//    8   20:dup             
	//    9   21:aload_1         
	//   10   22:aload_0         
	//   11   23:iload_2         
	//   12   24:invokevirtual   #52  <Method String Context.getString(int)>
	//   13   27:iload_3         
	//   14   28:invokespecial   #55  <Method void NotificationChannel(String, CharSequence, int)>
	//   15   31:invokevirtual   #58  <Method void NotificationManager.createNotificationChannel(NotificationChannel)>
	//   16   34:return          
	}

	public static void setNotification(Context context, int i, Notification notification)
	{
		context = ((Context) ((NotificationManager)context.getSystemService("notification")));
	//    0    0:aload_0         
	//    1    1:ldc1            #38  <String "notification">
	//    2    3:invokevirtual   #44  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #46  <Class NotificationManager>
	//    4    9:astore_0        
		if(notification != null)
	//*   5   10:aload_2         
	//*   6   11:ifnull          21
		{
			((NotificationManager) (context)).notify(i, notification);
	//    7   14:aload_0         
	//    8   15:iload_1         
	//    9   16:aload_2         
	//   10   17:invokevirtual   #66  <Method void NotificationManager.notify(int, Notification)>
			return;
	//   11   20:return          
		} else
		{
			((NotificationManager) (context)).cancel(i);
	//   12   21:aload_0         
	//   13   22:iload_1         
	//   14   23:invokevirtual   #70  <Method void NotificationManager.cancel(int)>
			return;
	//   15   26:return          
		}
	}

	public static final int IMPORTANCE_DEFAULT = 3;
	public static final int IMPORTANCE_HIGH = 4;
	public static final int IMPORTANCE_LOW = 2;
	public static final int IMPORTANCE_MIN = 1;
	public static final int IMPORTANCE_NONE = 0;
	public static final int IMPORTANCE_UNSPECIFIED = -1000;
}
