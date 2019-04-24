// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.Notification;
import android.support.v4.app.NotificationBuilderWithBuilderAccessor;

// Referenced classes of package android.support.v7.app:
//			NotificationCompat

static class NotificationCompat$IceCreamSandwichExtender extends android.support.v4.app.NotificationCompat.BuilderExtender
{

	public Notification build(android.support.v4.app.NotificationCompat.Builder builder, NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		android.widget.RemoteViews remoteviews = NotificationCompat.access$300(notificationbuilderwithbuilderaccessor, builder);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokestatic    #18  <Method android.widget.RemoteViews NotificationCompat.access$300(NotificationBuilderWithBuilderAccessor, android.support.v4.app.NotificationCompat$Builder)>
	//    3    5:astore_3        
		notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (notificationbuilderwithbuilderaccessor.build()));
	//    4    6:aload_2         
	//    5    7:invokeinterface #23  <Method Notification NotificationBuilderWithBuilderAccessor.build()>
	//    6   12:astore_2        
		if(remoteviews != null)
	//*   7   13:aload_3         
	//*   8   14:ifnull          24
		{
			notificationbuilderwithbuilderaccessor.contentView = remoteviews;
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:putfield        #29  <Field android.widget.RemoteViews Notification.contentView>
			return ((Notification) (notificationbuilderwithbuilderaccessor));
	//   12   22:aload_2         
	//   13   23:areturn         
		}
		if(builder.getContentView() != null)
	//*  14   24:aload_1         
	//*  15   25:invokevirtual   #35  <Method android.widget.RemoteViews android.support.v4.app.NotificationCompat$Builder.getContentView()>
	//*  16   28:ifnull          39
			notificationbuilderwithbuilderaccessor.contentView = builder.getContentView();
	//   17   31:aload_2         
	//   18   32:aload_1         
	//   19   33:invokevirtual   #35  <Method android.widget.RemoteViews android.support.v4.app.NotificationCompat$Builder.getContentView()>
	//   20   36:putfield        #29  <Field android.widget.RemoteViews Notification.contentView>
		return ((Notification) (notificationbuilderwithbuilderaccessor));
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	NotificationCompat$IceCreamSandwichExtender()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void android.support.v4.app.NotificationCompat$BuilderExtender()>
	//    2    4:return          
	}
}
