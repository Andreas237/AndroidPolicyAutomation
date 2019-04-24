// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.ComponentName;
import android.os.IBinder;

// Referenced classes of package android.support.v4.app:
//			NotificationManagerCompat

private static class NotificationManagerCompat$ServiceConnectedEvent
{

	final ComponentName componentName;
	final IBinder iBinder;

	NotificationManagerCompat$ServiceConnectedEvent(ComponentName componentname, IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		componentName = componentname;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field ComponentName componentName>
		iBinder = ibinder;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field IBinder iBinder>
	//    8   14:return          
	}
}
