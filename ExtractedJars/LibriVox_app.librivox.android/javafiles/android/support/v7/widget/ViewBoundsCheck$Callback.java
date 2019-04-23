// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

interface ViewBoundsCheck$Callback
{

	public abstract View getChildAt(int i);

	public abstract int getChildCount();

	public abstract int getChildEnd(View view);

	public abstract int getChildStart(View view);

	public abstract View getParent();

	public abstract int getParentEnd();

	public abstract int getParentStart();
}
