// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityManager;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityManagerCompat

static interface AccessibilityManagerCompat$AccessibilityManagerVersionImpl
{

	public abstract boolean addAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager,  );

	public abstract boolean addTouchExplorationStateChangeListener(AccessibilityManager accessibilitymanager, ner ner);

	public abstract List getEnabledAccessibilityServiceList(AccessibilityManager accessibilitymanager, int i);

	public abstract List getInstalledAccessibilityServiceList(AccessibilityManager accessibilitymanager);

	public abstract boolean isTouchExplorationEnabled(AccessibilityManager accessibilitymanager);

	public abstract nerWrapper newAccessibilityStateChangeListener( );

	public abstract eListenerWrapper newTouchExplorationStateChangeListener(ner ner);

	public abstract boolean removeAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager,  );

	public abstract boolean removeTouchExplorationStateChangeListener(AccessibilityManager accessibilitymanager, ner ner);
}
