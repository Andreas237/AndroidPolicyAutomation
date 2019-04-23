// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.MotionEvent;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public interface RecyclerView$OnItemTouchListener
{

	public abstract boolean onInterceptTouchEvent(RecyclerView recyclerview, MotionEvent motionevent);

	public abstract void onRequestDisallowInterceptTouchEvent(boolean flag);

	public abstract void onTouchEvent(RecyclerView recyclerview, MotionEvent motionevent);
}
