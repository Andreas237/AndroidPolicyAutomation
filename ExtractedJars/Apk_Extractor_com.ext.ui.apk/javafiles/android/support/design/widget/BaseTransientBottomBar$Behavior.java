// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			SwipeDismissBehavior, BaseTransientBottomBar, CoordinatorLayout, SnackbarManager

final class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior
{

	public boolean canSwipeDismissView(View view)
	{
		return view instanceof aseLayout;
	//    0    0:aload_1         
	//    1    1:instanceof      #22  <Class BaseTransientBottomBar$SnackbarBaseLayout>
	//    2    4:ireturn         
	}

	public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorlayout, aseLayout aselayout, MotionEvent motionevent)
	{
		motionevent.getActionMasked();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #30  <Method int MotionEvent.getActionMasked()>
		JVM INSTR tableswitch 0 3: default 36
	//	               0 44
	//	               1 78
	//	               2 36
	//	               3 78;
	//    2    4:tableswitch     0 3: default 36
	//	               0 44
	//	               1 78
	//	               2 36
	//	               3 78
		   goto _L1 _L2 _L3 _L1 _L3
_L1:
		return super.onInterceptTouchEvent(coordinatorlayout, ((View) (aselayout)), motionevent);
	//    3   36:aload_0         
	//    4   37:aload_1         
	//    5   38:aload_2         
	//    6   39:aload_3         
	//    7   40:invokespecial   #33  <Method boolean SwipeDismissBehavior.onInterceptTouchEvent(CoordinatorLayout, View, MotionEvent)>
	//    8   43:ireturn         
_L2:
		if(coordinatorlayout.isPointInChildBounds(((View) (aselayout)), (int)motionevent.getX(), (int)motionevent.getY()))
	//*   9   44:aload_1         
	//*  10   45:aload_2         
	//*  11   46:aload_3         
	//*  12   47:invokevirtual   #37  <Method float MotionEvent.getX()>
	//*  13   50:f2i             
	//*  14   51:aload_3         
	//*  15   52:invokevirtual   #40  <Method float MotionEvent.getY()>
	//*  16   55:f2i             
	//*  17   56:invokevirtual   #46  <Method boolean CoordinatorLayout.isPointInChildBounds(View, int, int)>
	//*  18   59:ifeq            36
			SnackbarManager.getInstance().pauseTimeout(mManagerCallback);
	//   19   62:invokestatic    #52  <Method SnackbarManager SnackbarManager.getInstance()>
	//   20   65:aload_0         
	//   21   66:getfield        #14  <Field BaseTransientBottomBar this$0>
	//   22   69:getfield        #56  <Field SnackbarManager$Callback BaseTransientBottomBar.mManagerCallback>
	//   23   72:invokevirtual   #60  <Method void SnackbarManager.pauseTimeout(SnackbarManager$Callback)>
		continue; /* Loop/switch isn't completed */
	//   24   75:goto            36
_L3:
		SnackbarManager.getInstance().restoreTimeoutIfPaused(mManagerCallback);
	//   25   78:invokestatic    #52  <Method SnackbarManager SnackbarManager.getInstance()>
	//   26   81:aload_0         
	//   27   82:getfield        #14  <Field BaseTransientBottomBar this$0>
	//   28   85:getfield        #56  <Field SnackbarManager$Callback BaseTransientBottomBar.mManagerCallback>
	//   29   88:invokevirtual   #63  <Method void SnackbarManager.restoreTimeoutIfPaused(SnackbarManager$Callback)>
		if(true) goto _L1; else goto _L4
	//   30   91:goto            36
_L4:
	}

	public volatile boolean onInterceptTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		return onInterceptTouchEvent(coordinatorlayout, (aseLayout)view, motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #22  <Class BaseTransientBottomBar$SnackbarBaseLayout>
	//    4    6:aload_3         
	//    5    7:invokevirtual   #65  <Method boolean onInterceptTouchEvent(CoordinatorLayout, BaseTransientBottomBar$SnackbarBaseLayout, MotionEvent)>
	//    6   10:ireturn         
	}

	final BaseTransientBottomBar this$0;

	BaseTransientBottomBar$Behavior()
	{
		this$0 = BaseTransientBottomBar.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field BaseTransientBottomBar this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void SwipeDismissBehavior()>
	//    5    9:return          
	}
}
