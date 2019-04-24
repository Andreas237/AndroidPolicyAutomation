// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;

// Referenced classes of package android.support.v4.accessibilityservice:
//			AccessibilityServiceInfoCompat, AccessibilityServiceInfoCompatJellyBean

static class AccessibilityServiceInfoCompat$AccessibilityServiceInfoJellyBeanImpl extends AccessibilityServiceInfoCompat.AccessibilityServiceInfoIcsImpl
{

	public String loadDescription(AccessibilityServiceInfo accessibilityserviceinfo, PackageManager packagemanager)
	{
		return AccessibilityServiceInfoCompatJellyBean.loadDescription(accessibilityserviceinfo, packagemanager);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #18  <Method String AccessibilityServiceInfoCompatJellyBean.loadDescription(AccessibilityServiceInfo, PackageManager)>
	//    3    5:areturn         
	}

	AccessibilityServiceInfoCompat$AccessibilityServiceInfoJellyBeanImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AccessibilityServiceInfoCompat$AccessibilityServiceInfoIcsImpl()>
	//    2    4:return          
	}
}
