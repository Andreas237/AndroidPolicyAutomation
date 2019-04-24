// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.Notification;
import android.support.v4.app.NotificationBuilderWithBuilderAccessor;

// Referenced classes of package android.support.v7.app:
//			NotificationCompat

static class NotificationCompat$Api24Extender extends android.support.v4.app.r
{

	public Notification build(android.support.v4.app.NotificationCompat.Builder builder, NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		NotificationCompat.access$900(notificationbuilderwithbuilderaccessor, builder);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokestatic    #20  <Method void NotificationCompat.access$900(NotificationBuilderWithBuilderAccessor, android.support.v4.app.NotificationCompat$Builder)>
		return notificationbuilderwithbuilderaccessor.build();
	//    3    5:aload_2         
	//    4    6:invokeinterface #25  <Method Notification NotificationBuilderWithBuilderAccessor.build()>
	//    5   11:areturn         
	}

	private NotificationCompat$Api24Extender()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void android.support.v4.app.NotificationCompat$BuilderExtender()>
	//    2    4:return          
	}

	NotificationCompat$Api24Extender(NotificationCompat._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void NotificationCompat$Api24Extender()>
	//    2    4:return          
	}
}
