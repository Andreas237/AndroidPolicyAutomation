// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;

// Referenced classes of package android.support.v4.accessibilityservice:
//			AccessibilityServiceInfoCompat

static class AccessibilityServiceInfoCompat$AccessibilityServiceInfoApi16Impl extends AccessibilityServiceInfoCompat.AccessibilityServiceInfoBaseImpl
{

	public String loadDescription(AccessibilityServiceInfo accessibilityserviceinfo, PackageManager packagemanager)
	{
		return accessibilityserviceinfo.loadDescription(packagemanager);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #22  <Method String AccessibilityServiceInfo.loadDescription(PackageManager)>
	//    3    5:areturn         
	}

	AccessibilityServiceInfoCompat$AccessibilityServiceInfoApi16Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AccessibilityServiceInfoCompat$AccessibilityServiceInfoBaseImpl()>
	//    2    4:return          
	}
}
