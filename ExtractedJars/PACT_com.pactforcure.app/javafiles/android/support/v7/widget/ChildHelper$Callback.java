// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ChildHelper

static interface ChildHelper$Callback
{

	public abstract void addView(View view, int i);

	public abstract void attachViewToParent(View view, int i, android.view.s s);

	public abstract void detachViewFromParent(int i);

	public abstract View getChildAt(int i);

	public abstract int getChildCount();

	public abstract er getChildViewHolder(View view);

	public abstract int indexOfChild(View view);

	public abstract void onEnteredHiddenState(View view);

	public abstract void onLeftHiddenState(View view);

	public abstract void removeAllViews();

	public abstract void removeViewAt(int i);
}
