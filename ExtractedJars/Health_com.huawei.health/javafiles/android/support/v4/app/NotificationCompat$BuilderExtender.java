// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, NotificationBuilderWithBuilderAccessor

public static class NotificationCompat$BuilderExtender
{

	public Notification build(NotificationCompat.Builder builder, NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (notificationbuilderwithbuilderaccessor.build()));
	//    0    0:aload_2         
	//    1    1:invokeinterface #23  <Method Notification NotificationBuilderWithBuilderAccessor.build()>
	//    2    6:astore_2        
		if(builder.mContentView != null)
	//*   3    7:aload_1         
	//*   4    8:getfield        #29  <Field android.widget.RemoteViews NotificationCompat$Builder.mContentView>
	//*   5   11:ifnull          22
			notificationbuilderwithbuilderaccessor.contentView = builder.mContentView;
	//    6   14:aload_2         
	//    7   15:aload_1         
	//    8   16:getfield        #29  <Field android.widget.RemoteViews NotificationCompat$Builder.mContentView>
	//    9   19:putfield        #34  <Field android.widget.RemoteViews Notification.contentView>
		return ((Notification) (notificationbuilderwithbuilderaccessor));
	//   10   22:aload_2         
	//   11   23:areturn         
	}

	protected NotificationCompat$BuilderExtender()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
