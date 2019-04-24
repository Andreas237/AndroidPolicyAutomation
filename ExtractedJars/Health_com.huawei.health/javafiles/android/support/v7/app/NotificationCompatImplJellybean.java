// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.app.NotificationBuilderWithBuilderAccessor;

class NotificationCompatImplJellybean
{

	NotificationCompatImplJellybean()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static void addBigTextStyle(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, CharSequence charsequence)
	{
		(new android.app.Notification.BigTextStyle(notificationbuilderwithbuilderaccessor.getBuilder())).bigText(charsequence);
	//    0    0:new             #16  <Class android.app.Notification$BigTextStyle>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #22  <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//    4   10:invokespecial   #25  <Method void android.app.Notification$BigTextStyle(android.app.Notification$Builder)>
	//    5   13:aload_1         
	//    6   14:invokevirtual   #29  <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.bigText(CharSequence)>
	//    7   17:pop             
	//    8   18:return          
	}
}
