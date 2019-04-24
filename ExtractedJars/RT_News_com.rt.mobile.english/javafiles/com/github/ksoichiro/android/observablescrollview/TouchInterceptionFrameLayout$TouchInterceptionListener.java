// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.ksoichiro.android.observablescrollview;

import android.view.MotionEvent;

// Referenced classes of package com.github.ksoichiro.android.observablescrollview:
//			TouchInterceptionFrameLayout

public static interface TouchInterceptionFrameLayout$TouchInterceptionListener
{

	public abstract void onDownMotionEvent(MotionEvent motionevent);

	public abstract void onMoveMotionEvent(MotionEvent motionevent, float f, float f1);

	public abstract void onUpOrCancelMotionEvent(MotionEvent motionevent);

	public abstract boolean shouldInterceptTouchEvent(MotionEvent motionevent, boolean flag, float f, float f1);
}
