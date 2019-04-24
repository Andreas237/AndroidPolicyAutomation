// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.graphics.Rect;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityWindowInfoCompat

static interface AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl
{

	public abstract Object getAnchor(Object obj);

	public abstract void getBoundsInScreen(Object obj, Rect rect);

	public abstract Object getChild(Object obj, int i);

	public abstract int getChildCount(Object obj);

	public abstract int getId(Object obj);

	public abstract int getLayer(Object obj);

	public abstract Object getParent(Object obj);

	public abstract Object getRoot(Object obj);

	public abstract CharSequence getTitle(Object obj);

	public abstract int getType(Object obj);

	public abstract boolean isAccessibilityFocused(Object obj);

	public abstract boolean isActive(Object obj);

	public abstract boolean isFocused(Object obj);

	public abstract Object obtain();

	public abstract Object obtain(Object obj);

	public abstract void recycle(Object obj);
}
