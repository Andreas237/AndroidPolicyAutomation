// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;

// Referenced classes of package android.support.v4.accessibilityservice:
//			AccessibilityServiceInfoCompat

static interface AccessibilityServiceInfoCompat$AccessibilityServiceInfoVersionImpl
{

	public abstract boolean getCanRetrieveWindowContent(AccessibilityServiceInfo accessibilityserviceinfo);

	public abstract int getCapabilities(AccessibilityServiceInfo accessibilityserviceinfo);

	public abstract String getDescription(AccessibilityServiceInfo accessibilityserviceinfo);

	public abstract String getId(AccessibilityServiceInfo accessibilityserviceinfo);

	public abstract ResolveInfo getResolveInfo(AccessibilityServiceInfo accessibilityserviceinfo);

	public abstract String getSettingsActivityName(AccessibilityServiceInfo accessibilityserviceinfo);

	public abstract String loadDescription(AccessibilityServiceInfo accessibilityserviceinfo, PackageManager packagemanager);
}
