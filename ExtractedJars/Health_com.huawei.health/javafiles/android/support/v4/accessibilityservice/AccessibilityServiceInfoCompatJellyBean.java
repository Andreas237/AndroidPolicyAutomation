// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;

class AccessibilityServiceInfoCompatJellyBean
{

	AccessibilityServiceInfoCompatJellyBean()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static String loadDescription(AccessibilityServiceInfo accessibilityserviceinfo, PackageManager packagemanager)
	{
		return accessibilityserviceinfo.loadDescription(packagemanager);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #19  <Method String AccessibilityServiceInfo.loadDescription(PackageManager)>
	//    3    5:areturn         
	}
}
