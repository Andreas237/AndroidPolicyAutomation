// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			BaseTransientBottomBar, SwipeDismissBehavior, CoordinatorLayout, SnackbarManager

public static class BaseTransientBottomBar$BehaviorDelegate
{

	public boolean canSwipeDismissView(View view)
	{
		return view instanceof t;
	//    0    0:aload_1         
	//    1    1:instanceof      #40  <Class BaseTransientBottomBar$SnackbarBaseLayout>
	//    2    4:ireturn         
	}

	public void onInterceptTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		int i = motionevent.getActionMasked();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #48  <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          4
		if(i == 3) goto _L2; else goto _L1
	//    3    6:iload           4
	//    4    8:iconst_3        
	//    5    9:icmpeq          66
_L1:
		i;
	//    6   12:iload           4
		JVM INSTR tableswitch 0 1: default 36
	//	               0 37
	//	               1 66;
	//    7   14:tableswitch     0 1: default 36
	//	               0 37
	//	               1 66
		   goto _L3 _L4 _L2
_L3:
		return;
	//    8   36:return          
_L4:
		if(coordinatorlayout.isPointInChildBounds(view, (int)motionevent.getX(), (int)motionevent.getY()))
	//*   9   37:aload_1         
	//*  10   38:aload_2         
	//*  11   39:aload_3         
	//*  12   40:invokevirtual   #52  <Method float MotionEvent.getX()>
	//*  13   43:f2i             
	//*  14   44:aload_3         
	//*  15   45:invokevirtual   #55  <Method float MotionEvent.getY()>
	//*  16   48:f2i             
	//*  17   49:invokevirtual   #61  <Method boolean CoordinatorLayout.isPointInChildBounds(View, int, int)>
	//*  18   52:ifeq            76
		{
			SnackbarManager.getInstance().pauseTimeout(managerCallback);
	//   19   55:invokestatic    #67  <Method SnackbarManager SnackbarManager.getInstance()>
	//   20   58:aload_0         
	//   21   59:getfield        #69  <Field SnackbarManager$Callback managerCallback>
	//   22   62:invokevirtual   #73  <Method void SnackbarManager.pauseTimeout(SnackbarManager$Callback)>
			return;
	//   23   65:return          
		}
		break; /* Loop/switch isn't completed */
_L2:
		SnackbarManager.getInstance().restoreTimeoutIfPaused(managerCallback);
	//   24   66:invokestatic    #67  <Method SnackbarManager SnackbarManager.getInstance()>
	//   25   69:aload_0         
	//   26   70:getfield        #69  <Field SnackbarManager$Callback managerCallback>
	//   27   73:invokevirtual   #76  <Method void SnackbarManager.restoreTimeoutIfPaused(SnackbarManager$Callback)>
	//   28   76:return          
	}

	public void setBaseTransientBottomBar(BaseTransientBottomBar basetransientbottombar)
	{
		managerCallback = basetransientbottombar.managerCallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #79  <Field SnackbarManager$Callback BaseTransientBottomBar.managerCallback>
	//    3    5:putfield        #69  <Field SnackbarManager$Callback managerCallback>
	//    4    8:return          
	}

	private SnackbarManager.Callback managerCallback;

	public BaseTransientBottomBar$BehaviorDelegate(SwipeDismissBehavior swipedismissbehavior)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		swipedismissbehavior.setStartAlphaSwipeDistance(0.1F);
	//    2    4:aload_1         
	//    3    5:ldc1            #19  <Float 0.1F>
	//    4    7:invokevirtual   #25  <Method void SwipeDismissBehavior.setStartAlphaSwipeDistance(float)>
		swipedismissbehavior.setEndAlphaSwipeDistance(0.6F);
	//    5   10:aload_1         
	//    6   11:ldc1            #26  <Float 0.6F>
	//    7   13:invokevirtual   #29  <Method void SwipeDismissBehavior.setEndAlphaSwipeDistance(float)>
		swipedismissbehavior.setSwipeDirection(0);
	//    8   16:aload_1         
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #33  <Method void SwipeDismissBehavior.setSwipeDirection(int)>
	//   11   21:return          
	}
}
