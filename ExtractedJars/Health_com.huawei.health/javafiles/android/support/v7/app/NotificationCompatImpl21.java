// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.app.NotificationBuilderWithBuilderAccessor;

class NotificationCompatImpl21
{

	NotificationCompatImpl21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static void addMediaStyle(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, int ai[], Object obj)
	{
		notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (new android.app.Notification.MediaStyle(notificationbuilderwithbuilderaccessor.getBuilder())));
	//    0    0:new             #16  <Class android.app.Notification$MediaStyle>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #22  <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//    4   10:invokespecial   #25  <Method void android.app.Notification$MediaStyle(android.app.Notification$Builder)>
	//    5   13:astore_0        
		if(ai != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          24
			((android.app.Notification.MediaStyle) (notificationbuilderwithbuilderaccessor)).setShowActionsInCompactView(ai);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokevirtual   #29  <Method android.app.Notification$MediaStyle android.app.Notification$MediaStyle.setShowActionsInCompactView(int[])>
	//   11   23:pop             
		if(obj != null)
	//*  12   24:aload_2         
	//*  13   25:ifnull          37
			((android.app.Notification.MediaStyle) (notificationbuilderwithbuilderaccessor)).setMediaSession((android.media.session.MediaSession.Token)obj);
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:checkcast       #31  <Class android.media.session.MediaSession$Token>
	//   17   33:invokevirtual   #35  <Method android.app.Notification$MediaStyle android.app.Notification$MediaStyle.setMediaSession(android.media.session.MediaSession$Token)>
	//   18   36:pop             
	//   19   37:return          
	}
}
