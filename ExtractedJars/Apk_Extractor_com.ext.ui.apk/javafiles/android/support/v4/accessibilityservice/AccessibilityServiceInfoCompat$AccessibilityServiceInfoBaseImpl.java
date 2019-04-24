// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;

// Referenced classes of package android.support.v4.accessibilityservice:
//			AccessibilityServiceInfoCompat

static class AccessibilityServiceInfoCompat$AccessibilityServiceInfoBaseImpl
{

	public int getCapabilities(AccessibilityServiceInfo accessibilityserviceinfo)
	{
		return !AccessibilityServiceInfoCompat.getCanRetrieveWindowContent(accessibilityserviceinfo) ? 0 : 1;
	//    0    0:aload_1         
	//    1    1:invokestatic    #18  <Method boolean AccessibilityServiceInfoCompat.getCanRetrieveWindowContent(AccessibilityServiceInfo)>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public String loadDescription(AccessibilityServiceInfo accessibilityserviceinfo, PackageManager packagemanager)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	AccessibilityServiceInfoCompat$AccessibilityServiceInfoBaseImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
