// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.app.NotificationBuilderWithBuilderAccessor;

class NotificationCompatImpl24
{

	NotificationCompatImpl24()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static void addDecoratedCustomViewStyle(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		notificationbuilderwithbuilderaccessor.getBuilder().setStyle(((android.app.Notification.Style) (new android.app.Notification.DecoratedCustomViewStyle())));
	//    0    0:aload_0         
	//    1    1:invokeinterface #20  <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//    2    6:new             #22  <Class android.app.Notification$DecoratedCustomViewStyle>
	//    3    9:dup             
	//    4   10:invokespecial   #23  <Method void android.app.Notification$DecoratedCustomViewStyle()>
	//    5   13:invokevirtual   #29  <Method android.app.Notification$Builder android.app.Notification$Builder.setStyle(android.app.Notification$Style)>
	//    6   16:pop             
	//    7   17:return          
	}

	public static void addDecoratedMediaCustomViewStyle(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		notificationbuilderwithbuilderaccessor.getBuilder().setStyle(((android.app.Notification.Style) (new android.app.Notification.DecoratedMediaCustomViewStyle())));
	//    0    0:aload_0         
	//    1    1:invokeinterface #20  <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//    2    6:new             #32  <Class android.app.Notification$DecoratedMediaCustomViewStyle>
	//    3    9:dup             
	//    4   10:invokespecial   #33  <Method void android.app.Notification$DecoratedMediaCustomViewStyle()>
	//    5   13:invokevirtual   #29  <Method android.app.Notification$Builder android.app.Notification$Builder.setStyle(android.app.Notification$Style)>
	//    6   16:pop             
	//    7   17:return          
	}
}
