// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.ActivityManager;

public final class ActivityManagerCompat
{

	public static boolean isLowRamDevice(ActivityManager activitymanager)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #13  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			return activitymanager.isLowRamDevice();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #18  <Method boolean ActivityManager.isLowRamDevice()>
	//    5   12:ireturn         
		else
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}
}
