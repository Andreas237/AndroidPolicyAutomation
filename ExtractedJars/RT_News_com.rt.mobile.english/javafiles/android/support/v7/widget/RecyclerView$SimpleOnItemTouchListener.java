// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.MotionEvent;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public static class RecyclerView$SimpleOnItemTouchListener
	implements RecyclerView.OnItemTouchListener
{

	public boolean onInterceptTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onRequestDisallowInterceptTouchEvent(boolean flag)
	{
	//    0    0:return          
	}

	public void onTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
	{
	//    0    0:return          
	}

	public RecyclerView$SimpleOnItemTouchListener()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
