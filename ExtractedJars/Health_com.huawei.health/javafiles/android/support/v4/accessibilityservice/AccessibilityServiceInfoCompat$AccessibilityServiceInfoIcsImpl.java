// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.ResolveInfo;

// Referenced classes of package android.support.v4.accessibilityservice:
//			AccessibilityServiceInfoCompat, AccessibilityServiceInfoCompatIcs

static class AccessibilityServiceInfoCompat$AccessibilityServiceInfoIcsImpl extends 
{

	public boolean getCanRetrieveWindowContent(AccessibilityServiceInfo accessibilityserviceinfo)
	{
		return AccessibilityServiceInfoCompatIcs.getCanRetrieveWindowContent(accessibilityserviceinfo);
	//    0    0:aload_1         
	//    1    1:invokestatic    #18  <Method boolean AccessibilityServiceInfoCompatIcs.getCanRetrieveWindowContent(AccessibilityServiceInfo)>
	//    2    4:ireturn         
	}

	public int getCapabilities(AccessibilityServiceInfo accessibilityserviceinfo)
	{
		return !getCanRetrieveWindowContent(accessibilityserviceinfo) ? 0 : 1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #21  <Method boolean getCanRetrieveWindowContent(AccessibilityServiceInfo)>
	//    3    5:ifeq            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public String getDescription(AccessibilityServiceInfo accessibilityserviceinfo)
	{
		return AccessibilityServiceInfoCompatIcs.getDescription(accessibilityserviceinfo);
	//    0    0:aload_1         
	//    1    1:invokestatic    #25  <Method String AccessibilityServiceInfoCompatIcs.getDescription(AccessibilityServiceInfo)>
	//    2    4:areturn         
	}

	public String getId(AccessibilityServiceInfo accessibilityserviceinfo)
	{
		return AccessibilityServiceInfoCompatIcs.getId(accessibilityserviceinfo);
	//    0    0:aload_1         
	//    1    1:invokestatic    #28  <Method String AccessibilityServiceInfoCompatIcs.getId(AccessibilityServiceInfo)>
	//    2    4:areturn         
	}

	public ResolveInfo getResolveInfo(AccessibilityServiceInfo accessibilityserviceinfo)
	{
		return AccessibilityServiceInfoCompatIcs.getResolveInfo(accessibilityserviceinfo);
	//    0    0:aload_1         
	//    1    1:invokestatic    #32  <Method ResolveInfo AccessibilityServiceInfoCompatIcs.getResolveInfo(AccessibilityServiceInfo)>
	//    2    4:areturn         
	}

	public String getSettingsActivityName(AccessibilityServiceInfo accessibilityserviceinfo)
	{
		return AccessibilityServiceInfoCompatIcs.getSettingsActivityName(accessibilityserviceinfo);
	//    0    0:aload_1         
	//    1    1:invokestatic    #35  <Method String AccessibilityServiceInfoCompatIcs.getSettingsActivityName(AccessibilityServiceInfo)>
	//    2    4:areturn         
	}

	AccessibilityServiceInfoCompat$AccessibilityServiceInfoIcsImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AccessibilityServiceInfoCompat$AccessibilityServiceInfoStubImpl()>
	//    2    4:return          
	}
}
