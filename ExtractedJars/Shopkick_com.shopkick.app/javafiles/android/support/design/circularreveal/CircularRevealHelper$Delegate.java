// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.circularreveal;

import android.graphics.Canvas;

// Referenced classes of package android.support.design.circularreveal:
//			CircularRevealHelper

static interface CircularRevealHelper$Delegate
{

	public abstract void actualDraw(Canvas canvas);

	public abstract boolean actualIsOpaque();
}
