// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.ActivityManager;

class ActivityManagerCompatKitKat
{

	ActivityManagerCompatKitKat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static boolean isLowRamDevice(ActivityManager activitymanager)
	{
		return activitymanager.isLowRamDevice();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #19  <Method boolean ActivityManager.isLowRamDevice()>
	//    2    4:ireturn         
	}
}
