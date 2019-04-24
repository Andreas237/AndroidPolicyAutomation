// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.ComponentName;
import java.util.ArrayDeque;

// Referenced classes of package android.support.v4.app:
//			NotificationManagerCompat, INotificationSideChannel

private static class NotificationManagerCompat$SideChannelManager$ListenerRecord
{

	boolean bound;
	final ComponentName componentName;
	int retryCount;
	INotificationSideChannel service;
	ArrayDeque taskQueue;

	NotificationManagerCompat$SideChannelManager$ListenerRecord(ComponentName componentname)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		bound = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #28  <Field boolean bound>
		taskQueue = new ArrayDeque();
	//    5    9:aload_0         
	//    6   10:new             #30  <Class ArrayDeque>
	//    7   13:dup             
	//    8   14:invokespecial   #31  <Method void ArrayDeque()>
	//    9   17:putfield        #33  <Field ArrayDeque taskQueue>
		retryCount = 0;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #35  <Field int retryCount>
		componentName = componentname;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #37  <Field ComponentName componentName>
	//   16   30:return          
	}
}
