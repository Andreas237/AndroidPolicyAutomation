// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			SwipeDismissBehavior, BaseTransientBottomBar, CoordinatorLayout

public static class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior
{

	private void setBaseTransientBottomBar(BaseTransientBottomBar basetransientbottombar)
	{
		_flddelegate.setBaseTransientBottomBar(basetransientbottombar);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field BaseTransientBottomBar$BehaviorDelegate _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #29  <Method void BaseTransientBottomBar$BehaviorDelegate.setBaseTransientBottomBar(BaseTransientBottomBar)>
	//    4    8:return          
	}

	public boolean canSwipeDismissView(View view)
	{
		return _flddelegate.canSwipeDismissView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field BaseTransientBottomBar$BehaviorDelegate _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #35  <Method boolean BaseTransientBottomBar$BehaviorDelegate.canSwipeDismissView(View)>
	//    4    8:ireturn         
	}

	public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		_flddelegate.onInterceptTouchEvent(coordinatorlayout, view, motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field BaseTransientBottomBar$BehaviorDelegate _flddelegate>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #40  <Method void BaseTransientBottomBar$BehaviorDelegate.onInterceptTouchEvent(CoordinatorLayout, View, MotionEvent)>
		return super.onInterceptTouchEvent(coordinatorlayout, view, motionevent);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:aload_3         
	//   10   14:invokespecial   #42  <Method boolean SwipeDismissBehavior.onInterceptTouchEvent(CoordinatorLayout, View, MotionEvent)>
	//   11   17:ireturn         
	}

	private final elegate _flddelegate = new elegate(((SwipeDismissBehavior) (this)));


/*
	static void access$000(BaseTransientBottomBar$Behavior basetransientbottombar$behavior, BaseTransientBottomBar basetransientbottombar)
	{
		basetransientbottombar$behavior.setBaseTransientBottomBar(basetransientbottombar);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void setBaseTransientBottomBar(BaseTransientBottomBar)>
		return;
	//    3    5:return          
	}

*/

	public BaseTransientBottomBar$Behavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void SwipeDismissBehavior()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class BaseTransientBottomBar$BehaviorDelegate>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #19  <Method void BaseTransientBottomBar$BehaviorDelegate(SwipeDismissBehavior)>
	//    7   13:putfield        #21  <Field BaseTransientBottomBar$BehaviorDelegate _flddelegate>
	//    8   16:return          
	}
}
