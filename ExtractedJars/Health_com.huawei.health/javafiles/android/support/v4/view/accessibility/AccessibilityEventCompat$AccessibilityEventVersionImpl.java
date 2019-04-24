// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityEventCompat

static interface AccessibilityEventCompat$AccessibilityEventVersionImpl
{

	public abstract void appendRecord(AccessibilityEvent accessibilityevent, Object obj);

	public abstract int getAction(AccessibilityEvent accessibilityevent);

	public abstract int getContentChangeTypes(AccessibilityEvent accessibilityevent);

	public abstract int getMovementGranularity(AccessibilityEvent accessibilityevent);

	public abstract Object getRecord(AccessibilityEvent accessibilityevent, int i);

	public abstract int getRecordCount(AccessibilityEvent accessibilityevent);

	public abstract void setAction(AccessibilityEvent accessibilityevent, int i);

	public abstract void setContentChangeTypes(AccessibilityEvent accessibilityevent, int i);

	public abstract void setMovementGranularity(AccessibilityEvent accessibilityevent, int i);
}
