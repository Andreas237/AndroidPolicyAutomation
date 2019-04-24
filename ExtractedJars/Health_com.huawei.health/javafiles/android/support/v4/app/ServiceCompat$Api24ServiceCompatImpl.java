// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Service;

// Referenced classes of package android.support.v4.app:
//			ServiceCompat, ServiceCompatApi24

static class ServiceCompat$Api24ServiceCompatImpl
	implements ServiceCompat.ServiceCompatImpl
{

	public void stopForeground(Service service, int i)
	{
		ServiceCompatApi24.stopForeground(service, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #20  <Method void ServiceCompatApi24.stopForeground(Service, int)>
	//    3    5:return          
	}

	ServiceCompat$Api24ServiceCompatImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
