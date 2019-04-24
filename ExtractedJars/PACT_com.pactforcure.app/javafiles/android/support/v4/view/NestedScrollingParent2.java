// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//			NestedScrollingParent

public interface NestedScrollingParent2
	extends NestedScrollingParent
{

	public abstract void onNestedPreScroll(View view, int i, int j, int ai[], int k);

	public abstract void onNestedScroll(View view, int i, int j, int k, int l, int i1);

	public abstract void onNestedScrollAccepted(View view, View view1, int i, int j);

	public abstract boolean onStartNestedScroll(View view, View view1, int i, int j);

	public abstract void onStopNestedScroll(View view, int i);
}
