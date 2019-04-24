// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeProviderCompatJellyBean

static interface AccessibilityNodeProviderCompatJellyBean$AccessibilityNodeInfoBridge
{

	public abstract Object createAccessibilityNodeInfo(int i);

	public abstract List findAccessibilityNodeInfosByText(String s, int i);

	public abstract boolean performAction(int i, int j, Bundle bundle);
}
