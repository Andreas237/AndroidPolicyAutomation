// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.Notification;
import android.support.v4.app.NotificationBuilderWithBuilderAccessor;

// Referenced classes of package android.support.v7.app:
//			NotificationCompat

static class NotificationCompat$JellybeanExtender extends android.support.v4.app.NotificationCompat.BuilderExtender
{

	public Notification build(android.support.v4.app.NotificationCompat.Builder builder, NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		android.widget.RemoteViews remoteviews = NotificationCompat.access$400(notificationbuilderwithbuilderaccessor, builder);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokestatic    #18  <Method android.widget.RemoteViews NotificationCompat.access$400(NotificationBuilderWithBuilderAccessor, android.support.v4.app.NotificationCompat$Builder)>
	//    3    5:astore_3        
		notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (notificationbuilderwithbuilderaccessor.build()));
	//    4    6:aload_2         
	//    5    7:invokeinterface #23  <Method Notification NotificationBuilderWithBuilderAccessor.build()>
	//    6   12:astore_2        
		if(remoteviews != null)
	//*   7   13:aload_3         
	//*   8   14:ifnull          22
			notificationbuilderwithbuilderaccessor.contentView = remoteviews;
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:putfield        #29  <Field android.widget.RemoteViews Notification.contentView>
		NotificationCompat.access$500(((Notification) (notificationbuilderwithbuilderaccessor)), builder);
	//   12   22:aload_2         
	//   13   23:aload_1         
	//   14   24:invokestatic    #33  <Method void NotificationCompat.access$500(Notification, android.support.v4.app.NotificationCompat$Builder)>
		return ((Notification) (notificationbuilderwithbuilderaccessor));
	//   15   27:aload_2         
	//   16   28:areturn         
	}

	NotificationCompat$JellybeanExtender()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void android.support.v4.app.NotificationCompat$BuilderExtender()>
	//    2    4:return          
	}
}
