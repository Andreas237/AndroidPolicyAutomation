// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.ResolveInfo;

class AccessibilityServiceInfoCompatIcs
{

	AccessibilityServiceInfoCompatIcs()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static boolean getCanRetrieveWindowContent(AccessibilityServiceInfo accessibilityserviceinfo)
	{
		return accessibilityserviceinfo.getCanRetrieveWindowContent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #19  <Method boolean AccessibilityServiceInfo.getCanRetrieveWindowContent()>
	//    2    4:ireturn         
	}

	public static String getDescription(AccessibilityServiceInfo accessibilityserviceinfo)
	{
		return accessibilityserviceinfo.getDescription();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method String AccessibilityServiceInfo.getDescription()>
	//    2    4:areturn         
	}

	public static String getId(AccessibilityServiceInfo accessibilityserviceinfo)
	{
		return accessibilityserviceinfo.getId();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method String AccessibilityServiceInfo.getId()>
	//    2    4:areturn         
	}

	public static ResolveInfo getResolveInfo(AccessibilityServiceInfo accessibilityserviceinfo)
	{
		return accessibilityserviceinfo.getResolveInfo();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method ResolveInfo AccessibilityServiceInfo.getResolveInfo()>
	//    2    4:areturn         
	}

	public static String getSettingsActivityName(AccessibilityServiceInfo accessibilityserviceinfo)
	{
		return accessibilityserviceinfo.getSettingsActivityName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #35  <Method String AccessibilityServiceInfo.getSettingsActivityName()>
	//    2    4:areturn         
	}
}
