// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.ComponentName;
import java.util.LinkedList;

// Referenced classes of package android.support.v4.app:
//			NotificationManagerCompat, INotificationSideChannel

static class NotificationManagerCompat$SideChannelManager$ListenerRecord
{

	public boolean bound;
	public final ComponentName componentName;
	public int retryCount;
	public INotificationSideChannel service;
	public LinkedList taskQueue;

	public NotificationManagerCompat$SideChannelManager$ListenerRecord(ComponentName componentname)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		bound = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #28  <Field boolean bound>
		taskQueue = new LinkedList();
	//    5    9:aload_0         
	//    6   10:new             #30  <Class LinkedList>
	//    7   13:dup             
	//    8   14:invokespecial   #31  <Method void LinkedList()>
	//    9   17:putfield        #33  <Field LinkedList taskQueue>
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
