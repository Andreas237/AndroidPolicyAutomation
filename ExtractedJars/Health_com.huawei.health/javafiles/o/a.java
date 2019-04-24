// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;

public class a
{

	a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Notification d(Notification notification, Context context, CharSequence charsequence, CharSequence charsequence1, PendingIntent pendingintent, PendingIntent pendingintent1)
	{
		notification.setLatestEventInfo(context, charsequence, charsequence1, pendingintent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #17  <Method void Notification.setLatestEventInfo(Context, CharSequence, CharSequence, PendingIntent)>
		notification.fullScreenIntent = pendingintent1;
	//    6    9:aload_0         
	//    7   10:aload           5
	//    8   12:putfield        #21  <Field PendingIntent Notification.fullScreenIntent>
		return notification;
	//    9   15:aload_0         
	//   10   16:areturn         
	}
}
