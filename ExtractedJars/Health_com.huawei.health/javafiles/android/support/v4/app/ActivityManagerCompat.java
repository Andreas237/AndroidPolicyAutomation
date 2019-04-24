// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.ActivityManager;

// Referenced classes of package android.support.v4.app:
//			ActivityManagerCompatKitKat

public final class ActivityManagerCompat
{

	private ActivityManagerCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static boolean isLowRamDevice(ActivityManager activitymanager)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			return ActivityManagerCompatKitKat.isLowRamDevice(activitymanager);
	//    3    8:aload_0         
	//    4    9:invokestatic    #22  <Method boolean ActivityManagerCompatKitKat.isLowRamDevice(ActivityManager)>
	//    5   12:ireturn         
		else
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}
}
