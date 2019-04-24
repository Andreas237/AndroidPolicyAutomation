// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.graphics.Rect;

// Referenced classes of package android.support.v4.view:
//			GravityCompat

static interface GravityCompat$GravityCompatImpl
{

	public abstract void apply(int i, int j, int k, Rect rect, int l, int i1, Rect rect1, 
			int j1);

	public abstract void apply(int i, int j, int k, Rect rect, Rect rect1, int l);

	public abstract void applyDisplay(int i, Rect rect, Rect rect1, int j);

	public abstract int getAbsoluteGravity(int i, int j);
}
