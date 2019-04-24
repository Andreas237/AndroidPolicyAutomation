// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.Matrix;
import android.view.View;

// Referenced classes of package android.support.transition:
//			ViewOverlayImpl, WindowIdImpl

interface ViewUtilsImpl
{

	public abstract void clearNonTransitionAlpha(View view);

	public abstract ViewOverlayImpl getOverlay(View view);

	public abstract float getTransitionAlpha(View view);

	public abstract WindowIdImpl getWindowId(View view);

	public abstract void saveNonTransitionAlpha(View view);

	public abstract void setAnimationMatrix(View view, Matrix matrix);

	public abstract void setLeftTopRightBottom(View view, int i, int j, int k, int l);

	public abstract void setTransitionAlpha(View view, float f);

	public abstract void transformMatrixToGlobal(View view, Matrix matrix);

	public abstract void transformMatrixToLocal(View view, Matrix matrix);
}
