// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.MotionEvent;

// Referenced classes of package android.support.v4.view:
//			GestureDetectorCompat

static interface GestureDetectorCompat$GestureDetectorCompatImpl
{

	public abstract boolean isLongpressEnabled();

	public abstract boolean onTouchEvent(MotionEvent motionevent);

	public abstract void setIsLongpressEnabled(boolean flag);

	public abstract void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener);
}
