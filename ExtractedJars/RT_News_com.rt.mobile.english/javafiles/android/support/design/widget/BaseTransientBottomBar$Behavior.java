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
		int i = motionevent.getActionMasked();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #30  <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          4
		if(i == 3) goto _L2; else goto _L1
	//    3    6:iload           4
	//    4    8:iconst_3        
	//    5    9:icmpeq          73
_L1:
		i;
	//    6   12:iload           4
		JVM INSTR tableswitch 0 1: default 36
	//	               0 39
	//	               1 73;
	//    7   14:tableswitch     0 1: default 36
	//	               0 39
	//	               1 73
		   goto _L3 _L4 _L2
_L3:
		break; /* Loop/switch isn't completed */
	//    8   36:goto            86
_L4:
		if(coordinatorlayout.isPointInChildBounds(((View) (aselayout)), (int)motionevent.getX(), (int)motionevent.getY()))
	//*   9   39:aload_1         
	//*  10   40:aload_2         
	//*  11   41:aload_3         
	//*  12   42:invokevirtual   #34  <Method float MotionEvent.getX()>
	//*  13   45:f2i             
	//*  14   46:aload_3         
	//*  15   47:invokevirtual   #37  <Method float MotionEvent.getY()>
	//*  16   50:f2i             
	//*  17   51:invokevirtual   #43  <Method boolean CoordinatorLayout.isPointInChildBounds(View, int, int)>
	//*  18   54:ifeq            86
			SnackbarManager.getInstance().pauseTimeout(mManagerCallback);
	//   19   57:invokestatic    #49  <Method SnackbarManager SnackbarManager.getInstance()>
	//   20   60:aload_0         
	//   21   61:getfield        #14  <Field BaseTransientBottomBar this$0>
	//   22   64:getfield        #53  <Field SnackbarManager$Callback BaseTransientBottomBar.mManagerCallback>
	//   23   67:invokevirtual   #57  <Method void SnackbarManager.pauseTimeout(SnackbarManager$Callback)>
		break; /* Loop/switch isn't completed */
	//   24   70:goto            86
_L2:
		SnackbarManager.getInstance().restoreTimeoutIfPaused(mManagerCallback);
	//   25   73:invokestatic    #49  <Method SnackbarManager SnackbarManager.getInstance()>
	//   26   76:aload_0         
	//   27   77:getfield        #14  <Field BaseTransientBottomBar this$0>
	//   28   80:getfield        #53  <Field SnackbarManager$Callback BaseTransientBottomBar.mManagerCallback>
	//   29   83:invokevirtual   #60  <Method void SnackbarManager.restoreTimeoutIfPaused(SnackbarManager$Callback)>
		return super.onInterceptTouchEvent(coordinatorlayout, ((View) (aselayout)), motionevent);
	//   30   86:aload_0         
	//   31   87:aload_1         
	//   32   88:aload_2         
	//   33   89:aload_3         
	//   34   90:invokespecial   #63  <Method boolean SwipeDismissBehavior.onInterceptTouchEvent(CoordinatorLayout, View, MotionEvent)>
	//   35   93:ireturn         
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
